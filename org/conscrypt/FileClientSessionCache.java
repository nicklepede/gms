package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.io.IoUtils;
import defpackage.a;
import j$.io.DesugarFile;
import j$.io.FileRetargetInterface;
import j$.nio.file.Path;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSession;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class FileClientSessionCache {
    public static final int MAX_SIZE = 12;
    private static final Logger logger = Logger.getLogger(FileClientSessionCache.class.getName());
    static final Map caches = new HashMap();

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    class CacheFile extends File implements FileRetargetInterface {
        long lastModified;
        final String name;

        public CacheFile(File file, String str) {
            super(file, str);
            this.lastModified = -1L;
            this.name = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.Comparable
        public int compareTo(File file) {
            long lastModified = lastModified() - file.lastModified();
            return lastModified == 0 ? super.compareTo(file) : lastModified < 0 ? -1 : 1;
        }

        @Override // java.io.File
        public long lastModified() {
            long j = this.lastModified;
            if (j != -1) {
                return j;
            }
            long lastModified = super.lastModified();
            this.lastModified = lastModified;
            return lastModified;
        }

        @Override // java.io.File, j$.io.FileRetargetInterface
        public /* synthetic */ Path toPath() {
            return DesugarFile.toPath(this);
        }

        @Override // java.io.File
        public /* synthetic */ java.nio.file.Path toPath() {
            return Path.Wrapper.convert(toPath());
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    class Impl implements SSLClientSessionCache {
        Map accessOrder = newAccessOrder();
        final File directory;
        String[] initialFiles;
        int size;

        public Impl(File file) {
            if (file.exists()) {
                if (!file.isDirectory()) {
                    throw new IOException(String.valueOf(String.valueOf(file)).concat(" exists but is not a directory."));
                }
                String[] list = file.list();
                this.initialFiles = list;
                if (list == null) {
                    throw new IOException(String.valueOf(String.valueOf(file)).concat(" exists but cannot list contents."));
                }
                Arrays.sort(list);
                this.size = this.initialFiles.length;
            } else {
                if (!file.mkdirs()) {
                    throw new IOException(a.H(file, "Creation of ", " directory failed."));
                }
                this.size = 0;
            }
            this.directory = file;
        }

        private void delete(File file) {
            if (!file.delete()) {
                IOException iOException = new IOException(a.H(file, "FileClientSessionCache: Failed to delete ", "."));
                FileClientSessionCache.logger.logp(Level.WARNING, "com.google.android.gms.org.conscrypt.FileClientSessionCache$Impl", "delete", iOException.getMessage(), (Throwable) iOException);
            }
            this.size--;
        }

        private static String fileName(String str, int i) {
            if (str != null) {
                return a.F(i, str, ".");
            }
            throw new NullPointerException("host == null");
        }

        private void indexFiles() {
            String[] strArr = this.initialFiles;
            if (strArr != null) {
                this.initialFiles = null;
                TreeSet<CacheFile> treeSet = new TreeSet();
                for (String str : strArr) {
                    if (!this.accessOrder.containsKey(str)) {
                        treeSet.add(new CacheFile(this.directory, str));
                    }
                }
                if (treeSet.isEmpty()) {
                    return;
                }
                Map newAccessOrder = newAccessOrder();
                for (CacheFile cacheFile : treeSet) {
                    newAccessOrder.put(cacheFile.name, cacheFile);
                }
                newAccessOrder.putAll(this.accessOrder);
                this.accessOrder = newAccessOrder;
            }
        }

        static void logReadError(String str, File file, Throwable th) {
            FileClientSessionCache.logger.logp(Level.WARNING, "com.google.android.gms.org.conscrypt.FileClientSessionCache$Impl", "logReadError", "FileClientSessionCache: Error reading session data for " + str + " from " + String.valueOf(file) + ".", th);
        }

        static void logWriteError(String str, File file, Throwable th) {
            FileClientSessionCache.logger.logp(Level.WARNING, "com.google.android.gms.org.conscrypt.FileClientSessionCache$Impl", "logWriteError", "FileClientSessionCache: Error writing session data for " + str + " to " + String.valueOf(file) + ".", th);
        }

        private void makeRoom() {
            if (this.size <= 12) {
                return;
            }
            indexFiles();
            int i = this.size - 12;
            Iterator it = this.accessOrder.values().iterator();
            do {
                delete((File) it.next());
                it.remove();
                i--;
            } while (i > 0);
        }

        private static Map newAccessOrder() {
            return new LinkedHashMap(12, 0.75f, true);
        }

        @Override // com.google.android.gms.org.conscrypt.SSLClientSessionCache
        public synchronized byte[] getSessionData(String str, int i) {
            String fileName = fileName(str, i);
            File file = (File) this.accessOrder.get(fileName);
            if (file == null) {
                String[] strArr = this.initialFiles;
                if (strArr != null && Arrays.binarySearch(strArr, fileName) >= 0) {
                    File file2 = new File(this.directory, fileName);
                    this.accessOrder.put(fileName, file2);
                    file = file2;
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[(int) file.length()];
                    new DataInputStream(fileInputStream).readFully(bArr);
                    return bArr;
                } catch (IOException e) {
                    logReadError(str, file, e);
                    return null;
                } finally {
                    IoUtils.closeQuietly(fileInputStream);
                }
            } catch (FileNotFoundException e2) {
                logReadError(str, file, e2);
                return null;
            }
        }

        @Override // com.google.android.gms.org.conscrypt.SSLClientSessionCache
        public synchronized void putSessionData(SSLSession sSLSession, byte[] bArr) {
            String peerHost = sSLSession.getPeerHost();
            if (bArr == null) {
                throw new NullPointerException("sessionData == null");
            }
            String fileName = fileName(peerHost, sSLSession.getPeerPort());
            File file = new File(this.directory, fileName);
            boolean exists = file.exists();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                if (!exists) {
                    this.size++;
                    makeRoom();
                }
                try {
                    try {
                        fileOutputStream.write(bArr);
                        try {
                            try {
                                fileOutputStream.close();
                                this.accessOrder.put(fileName, file);
                            } finally {
                            }
                        } catch (IOException e) {
                            logWriteError(peerHost, file, e);
                        }
                    } catch (Throwable th) {
                        try {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e2) {
                                logWriteError(peerHost, file, e2);
                            }
                            throw th;
                        } finally {
                        }
                    }
                } catch (IOException e3) {
                    logWriteError(peerHost, file, e3);
                    try {
                        fileOutputStream.close();
                    } catch (IOException e4) {
                        logWriteError(peerHost, file, e4);
                    } finally {
                    }
                }
            } catch (FileNotFoundException e5) {
                logWriteError(peerHost, file, e5);
            }
        }
    }

    private FileClientSessionCache() {
    }

    static synchronized void reset() {
        synchronized (FileClientSessionCache.class) {
            caches.clear();
        }
    }

    public static synchronized SSLClientSessionCache usingDirectory(File file) {
        synchronized (FileClientSessionCache.class) {
            Map map = caches;
            Impl impl = (Impl) map.get(file);
            if (impl != null) {
                return impl;
            }
            Impl impl2 = new Impl(file);
            map.put(file, impl2);
            return impl2;
        }
    }
}
