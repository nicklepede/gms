package com.google.android.gms.leveldb;

import android.util.Log;
import defpackage.apzb;
import defpackage.atzb;
import defpackage.bsuj;
import defpackage.bsum;
import defpackage.bsuo;
import defpackage.btco;
import defpackage.btdc;
import defpackage.btdh;
import defpackage.btdm;
import defpackage.fpmr;
import java.io.File;
import java.util.NoSuchElementException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class LevelDb extends bsuj {
    static boolean a = false;
    final String b;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class Iterator extends bsuj {
        public static final int ASCENDING = 0;
        public static final int DESCENDING = 1;
        private final Snapshot b;
        private boolean d;

        public Iterator(long j, Snapshot snapshot) {
            super(j);
            this.d = false;
            this.b = snapshot;
            if (snapshot != null) {
                snapshot.ref();
            }
            LevelDb.this.ref();
        }

        private final void a() {
            if (!this.d) {
                throw new NoSuchElementException();
            }
        }

        private native int nativeBufferedValue(long j, int i, byte[] bArr, byte[] bArr2);

        private native void nativeDestroy(long j);

        private native byte[] nativeKey(long j);

        private native boolean nativeNext(long j);

        private native boolean nativePrev(long j);

        private native boolean nativeSeek(long j, byte[] bArr);

        private native boolean nativeSeekToFirst(long j);

        private native boolean nativeSeekToLast(long j);

        private native byte[] nativeValue(long j);

        public boolean bufferedValue(int i, byte[] bArr, byte[] bArr2) {
            int nativeBufferedValue = nativeBufferedValue(this.c, i, bArr, bArr2);
            this.d = nativeBufferedValue != 0;
            return nativeBufferedValue == 2;
        }

        @Override // defpackage.bsuj, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            super.close();
        }

        @Override // defpackage.bsuj
        protected void closeNativeObject() {
            nativeDestroy(this.c);
            Snapshot snapshot = this.b;
            if (snapshot != null) {
                snapshot.unref();
            }
            LevelDb.this.unref();
        }

        public boolean isValid() {
            assertOpen();
            return this.d;
        }

        public byte[] key() {
            assertOpen();
            a();
            return nativeKey(this.c);
        }

        public void next() {
            assertOpen();
            a();
            this.d = nativeNext(this.c);
        }

        public void prev() {
            assertOpen();
            a();
            this.d = nativePrev(this.c);
        }

        public void seek(byte[] bArr) {
            assertOpen();
            bArr.getClass();
            this.d = nativeSeek(this.c, bArr);
        }

        public void seekToFirst() {
            assertOpen();
            this.d = nativeSeekToFirst(this.c);
        }

        public void seekToLast() {
            assertOpen();
            this.d = nativeSeekToLast(this.c);
        }

        public String toString() {
            return "LevelDB.Iterator[" + LevelDb.this.b + "]";
        }

        public byte[] value() {
            assertOpen();
            a();
            return nativeValue(this.c);
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class Options {
        public boolean mCreateIfMissing = true;
        public boolean mErrorIfExists = false;
        public boolean mDeleteIfCorrupted = true;
        public int mWriteBufferSize = 32768;
        public int mMaxOpenFiles = 80;
        public int mBlockCacheCapacityBytes = 0;
        public int mBlockSize = 4096;
        public int mBlockRestartInterval = 16;
        public boolean mUseSnappy = true;
        public int mBloomFilterBits = 10;
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class Snapshot extends bsuj {
        public Snapshot(long j) {
            super(j);
            LevelDb.this.ref();
        }

        @Override // defpackage.bsuj, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            super.close();
        }

        @Override // defpackage.bsuj
        protected void closeNativeObject() {
            LevelDb levelDb = LevelDb.this;
            LevelDb.nativeReleaseSnapshot(levelDb.c, this.c);
            levelDb.unref();
        }

        public String toString() {
            return "LevelDB.Snapshot[" + LevelDb.this.b + "]";
        }
    }

    static {
        try {
            a = !bsuo.a();
        } catch (UnsatisfiedLinkError unused) {
            a = true;
        }
    }

    protected LevelDb(long j, String str) {
        super(j);
        this.b = str;
    }

    public static void destroy(File file) {
        if (a) {
            return;
        }
        nativeDestroy(file.getPath());
    }

    private static native void nativeClose(long j);

    private static native void nativeCompact(long j);

    private static native void nativeDelete(long j, byte[] bArr);

    private static native int nativeDeleteRange(long j, byte[] bArr, byte[] bArr2);

    private static native void nativeDestroy(String str);

    private static native byte[] nativeGet(long j, long j2, byte[] bArr);

    private static native long nativeGetSnapshot(long j);

    private static native long nativeIterator(long j, long j2);

    private static native long nativeOpen(String str, boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, boolean z3, int i6, boolean z4);

    private static native void nativePut(long j, byte[] bArr, byte[] bArr2);

    static native void nativeReleaseSnapshot(long j, long j2);

    private static native void nativeWrite(long j, long j2);

    public static LevelDb open(File file) {
        return open(file, new Options());
    }

    @Override // defpackage.bsuj, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
    }

    @Override // defpackage.bsuj
    protected void closeNativeObject() {
        nativeClose(this.c);
    }

    public void compact() {
        nativeCompact(this.c);
    }

    public void delete(byte[] bArr) {
        assertOpen();
        nativeDelete(this.c, bArr);
    }

    public int deleteRange(byte[] bArr, byte[] bArr2) {
        assertOpen();
        return nativeDeleteRange(this.c, bArr, bArr2);
    }

    public byte[] get(Snapshot snapshot, byte[] bArr) {
        assertOpen();
        return nativeGet(this.c, snapshot != null ? snapshot.c : 0L, bArr);
    }

    public Snapshot getSnapshot() {
        assertOpen();
        return new Snapshot(nativeGetSnapshot(this.c));
    }

    public Iterator iterator() {
        assertOpen();
        return iterator(null);
    }

    public void put(byte[] bArr, byte[] bArr2) {
        assertOpen();
        nativePut(this.c, bArr, bArr2);
    }

    public String toString() {
        return "LevelDB[" + this.b + "]";
    }

    public void write(WriteBatch writeBatch) {
        assertOpen();
        nativeWrite(this.c, writeBatch.c);
    }

    public static LevelDb open(File file, Options options) {
        if (a) {
            if (Log.isLoggable("LevelDb", 6)) {
                Log.e("LevelDb", "LevelDb failed to load (1), returning NoOpLevelDb");
            }
            return new bsum();
        }
        btdm a2 = btdm.a();
        if (fpmr.a.lK().j()) {
            btdh btdhVar = (btdh) a2.a.peekLast();
            atzb.t(btdhVar, "levelDbOptionStack is empty, which should be impossible as it starts with length 1 and all pop calls should have a corresponding push call beforehand");
            try {
                btco.a.i(file.getPath(), btdhVar, 7);
            } catch (btdc e) {
                if (e.a != null && apzb.c() >= 2) {
                    throw new LevelDbDataForwardingDisallowedException("Could not open LevelDb with baseDir at path\"" + file.getPath() + "\" because compliance checks disallow data forwarding", e);
                }
            }
        }
        try {
            return new LevelDb(nativeOpen(file.getPath(), options.mCreateIfMissing, options.mErrorIfExists, options.mWriteBufferSize, options.mMaxOpenFiles, options.mBlockCacheCapacityBytes, options.mBlockSize, options.mBlockRestartInterval, options.mUseSnappy, options.mBloomFilterBits, false), file.getPath());
        } catch (LevelDbException e2) {
            if (!options.mDeleteIfCorrupted || !(e2 instanceof LevelDbCorruptionException)) {
                throw e2;
            }
            bsuo.b("Failed to open ".concat(String.valueOf(String.valueOf(file))), e2);
            try {
                destroy(file);
            } catch (LevelDbException e3) {
                bsuo.b("Failed to destroy ".concat(String.valueOf(String.valueOf(file))), e3);
            }
            return new LevelDb(nativeOpen(file.getPath(), options.mCreateIfMissing, options.mErrorIfExists, options.mWriteBufferSize, options.mMaxOpenFiles, options.mBlockCacheCapacityBytes, options.mBlockSize, options.mBlockRestartInterval, options.mUseSnappy, options.mBloomFilterBits, false), file.getPath());
        } catch (UnsatisfiedLinkError e4) {
            if (Log.isLoggable("LevelDb", 6)) {
                Log.e("LevelDb", "LevelDb failed to load (2), returning NoOpLevelDb", e4);
            }
            return new bsum();
        }
    }

    public byte[] get(byte[] bArr) {
        return get(null, bArr);
    }

    public Iterator iterator(Snapshot snapshot) {
        assertOpen();
        return new Iterator(nativeIterator(this.c, snapshot != null ? snapshot.c : 0L), snapshot);
    }
}
