package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.Service;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.chimera.modules.core.AppContextProvider;
import com.google.android.gms.common.stats.GmsCoreStatsChimeraService;
import com.google.android.gms.libs.gmscorelogger.GmsCoreLoggerFilesCleanupTask;
import defpackage.asej;
import defpackage.asjd;
import defpackage.askb;
import defpackage.asmb;
import defpackage.asoa;
import defpackage.asob;
import defpackage.asot;
import defpackage.aspo;
import defpackage.bhgl;
import defpackage.bhib;
import defpackage.brby;
import defpackage.btmp;
import defpackage.bwou;
import defpackage.byhj;
import defpackage.byjl;
import defpackage.byki;
import defpackage.bykm;
import defpackage.byko;
import defpackage.bykv;
import defpackage.egna;
import defpackage.ejhf;
import defpackage.fmsy;
import defpackage.fmvs;
import defpackage.fnck;
import defpackage.fncn;
import defpackage.fndk;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class GmsCoreStatsChimeraService extends Service {
    public static final asot a = asot.b("GmsCoreStatsService", asej.CORE);
    public static final Comparator b = new asjd();

    public GmsCoreStatsChimeraService() {
        asot asotVar = askb.a;
    }

    public static int a(String str, int i) {
        if (str == null) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            ((ejhf) a.j()).x("wrong parameter of max output entry count");
            return i;
        }
    }

    @Override // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, final String[] strArr) {
        asmb asmbVar = new asmb(3, 9);
        try {
            asob asobVar = new asob(printWriter);
            try {
                final aspo aspoVar = new aspo(asobVar, "  ");
                aspoVar.println("GMS Core Stats:");
                final AtomicReference atomicReference = new AtomicReference();
                try {
                    egna.h(egna.d(new Runnable() { // from class: asja
                        @Override // java.lang.Runnable
                        public final void run() {
                            Context createDeviceProtectedStorageContext;
                            File dataDir;
                            bry bryVar = new bry();
                            GmsCoreStatsChimeraService gmsCoreStatsChimeraService = GmsCoreStatsChimeraService.this;
                            String[] strArr2 = strArr;
                            if (strArr2 != null) {
                                int i = 0;
                                while (true) {
                                    char c = 65535;
                                    if (i >= strArr2.length - 1 || bryVar.d >= 3) {
                                        break;
                                    }
                                    String str = strArr2[i];
                                    int hashCode = str.hashCode();
                                    if (hashCode != -889723853) {
                                        if (hashCode != -515493772) {
                                            if (hashCode == 1419832388 && str.equals("--dsMinSize")) {
                                                c = 1;
                                            }
                                        } else if (str.equals("--dsMaxCnt")) {
                                            c = 0;
                                        }
                                    } else if (str.equals("--dsMinContentCnt")) {
                                        c = 2;
                                    }
                                    if (c == 0) {
                                        i++;
                                        bryVar.put(0, strArr2[i]);
                                    } else if (c == 1) {
                                        i++;
                                        bryVar.put(1, strArr2[i]);
                                    } else if (c == 2) {
                                        i++;
                                        bryVar.put(2, strArr2[i]);
                                    }
                                    i++;
                                }
                            }
                            int a2 = GmsCoreStatsChimeraService.a((String) bryVar.get(0), ennt.a(fmsy.a.a().a()));
                            String str2 = (String) bryVar.get(1);
                            fmsy fmsyVar = fmsy.a;
                            int a3 = GmsCoreStatsChimeraService.a(str2, ennt.a(fmsyVar.a().c()));
                            int a4 = GmsCoreStatsChimeraService.a((String) bryVar.get(2), ennt.a(fmsyVar.a().b()));
                            HashSet hashSet = new HashSet();
                            try {
                                ApplicationInfo applicationInfo = gmsCoreStatsChimeraService.getPackageManager().getApplicationInfo(gmsCoreStatsChimeraService.getPackageName(), 0);
                                hashSet.add(fmut.i() ? new File(bqux.a.a(applicationInfo.dataDir)) : new File(applicationInfo.dataDir));
                            } catch (PackageManager.NameNotFoundException unused) {
                                ((ejhf) askb.a.j()).x("Failed to use package manager getting data directory from context instead.");
                                File filesDir = gmsCoreStatsChimeraService.getFilesDir();
                                if (filesDir != null && filesDir.getParentFile() != null) {
                                    hashSet.add(filesDir.getParentFile());
                                }
                            }
                            if (Build.VERSION.SDK_INT >= 24) {
                                createDeviceProtectedStorageContext = gmsCoreStatsChimeraService.createDeviceProtectedStorageContext();
                                dataDir = createDeviceProtectedStorageContext.getDataDir();
                                hashSet.add(dataDir);
                            }
                            for (File file : gmsCoreStatsChimeraService.getExternalFilesDirs(null)) {
                                if (file != null && file.exists() && file.getParentFile() != null) {
                                    hashSet.add(file.getParentFile());
                                }
                            }
                            Collections.addAll(hashSet, gmsCoreStatsChimeraService.getExternalMediaDirs());
                            eitj i2 = eitj.i(hashSet);
                            asjz asjzVar = new asjz(a2, a3, a4);
                            Iterator it = i2.iterator();
                            while (it.hasNext()) {
                                asjs a5 = asjzVar.a((File) it.next(), 0);
                                asjzVar.k.add(a5);
                                asjzVar.d += a5.b;
                                asjzVar.e += a5.c + 1;
                                asjzVar.f += a5.d;
                            }
                            atomicReference.set(((eiir) eiid.j(new aska(asjzVar))).a);
                        }
                    }, asmbVar), egna.d(new Runnable() { // from class: asjb
                        @Override // java.lang.Runnable
                        public final void run() {
                            ModuleManager.ConfigInfo configInfo;
                            File[] listFiles;
                            GmsCoreStatsChimeraService gmsCoreStatsChimeraService = GmsCoreStatsChimeraService.this;
                            List<ApplicationInfo> installedApplications = gmsCoreStatsChimeraService.getPackageManager().getInstalledApplications(128);
                            aspo aspoVar2 = aspoVar;
                            aspoVar2.b();
                            aspoVar2.println("Client jar version:");
                            aspoVar2.b();
                            Collections.sort(installedApplications, GmsCoreStatsChimeraService.b);
                            aspoVar2.b();
                            int i = -2;
                            for (ApplicationInfo applicationInfo : installedApplications) {
                                int i2 = applicationInfo.metaData != null ? applicationInfo.metaData.getInt("com.google.android.gms.version", -1) : -2;
                                if (i2 != -2 && i2 != -1) {
                                    if (i != i2) {
                                        aspoVar2.a();
                                        aspoVar2.println(i2 != -2 ? i2 != -1 ? a.W(i2, ":") : "UNKNOWN_SDK_VERSION:" : "EMPTY_METADATA:");
                                        aspoVar2.b();
                                        i = i2;
                                    }
                                    aspoVar2.println(applicationInfo.packageName);
                                }
                            }
                            aspoVar2.a();
                            aspoVar2.a();
                            ModuleManager moduleManager = ModuleManager.get(gmsCoreStatsChimeraService);
                            aspoVar2.println("Module Sets:");
                            aspoVar2.b();
                            Collection<ModuleManager.ModuleInfo> collection = null;
                            try {
                                configInfo = moduleManager.getCurrentConfig();
                            } catch (InvalidConfigException e) {
                                ((ejhf) ((ejhf) GmsCoreStatsChimeraService.a.i()).s(e)).x("Unable to get Chimera module config");
                                configInfo = null;
                            }
                            if (configInfo != null) {
                                for (ModuleManager.ModuleSetInfo moduleSetInfo : configInfo.moduleSets) {
                                    aspoVar2.println("Module Set ID: " + moduleSetInfo.moduleSetId + ", Module Set Variant: " + moduleSetInfo.moduleSetVariant);
                                }
                            }
                            try {
                                collection = moduleManager.getAllModules();
                            } catch (InvalidConfigException e2) {
                                ((ejhf) ((ejhf) GmsCoreStatsChimeraService.a.i()).s(e2)).x("Unable to get Chimera module info collection");
                            }
                            if (collection != null) {
                                aspoVar2.println();
                                aspoVar2.a();
                                aspoVar2.println("Chimera Module APKs:");
                                aspoVar2.b();
                                bul bulVar = new bul();
                                for (ModuleManager.ModuleInfo moduleInfo : collection) {
                                    if (!TextUtils.isEmpty(moduleInfo.moduleId)) {
                                        ModuleManager.ModuleApkInfo moduleApkInfo = moduleInfo.moduleApk;
                                        ArrayList arrayList = (ArrayList) bulVar.get(moduleApkInfo);
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            bulVar.put(moduleApkInfo, arrayList);
                                        }
                                        arrayList.add(moduleInfo);
                                    }
                                }
                                for (int i3 = 0; i3 < bulVar.d; i3++) {
                                    ModuleManager.ModuleApkInfo moduleApkInfo2 = (ModuleManager.ModuleApkInfo) bulVar.f(i3);
                                    ArrayList arrayList2 = (ArrayList) bulVar.i(i3);
                                    String str = moduleApkInfo2.apkPackageName + " [" + moduleApkInfo2.apkVersionCode + "]";
                                    if (gmsCoreStatsChimeraService.getPackageName().equals(moduleApkInfo2.apkPackageName) && !TextUtils.isEmpty(moduleApkInfo2.apkVersionName)) {
                                        str = str + " [" + moduleApkInfo2.apkVersionName + "]";
                                    }
                                    aspoVar2.println(str);
                                    aspoVar2.b();
                                    int size = arrayList2.size();
                                    for (int i4 = 0; i4 < size; i4++) {
                                        ModuleManager.ModuleInfo moduleInfo2 = (ModuleManager.ModuleInfo) arrayList2.get(i4);
                                        aspoVar2.print(moduleInfo2.moduleId + " [v" + moduleInfo2.moduleVersion + "]");
                                        aspoVar2.println();
                                    }
                                    aspoVar2.a();
                                    aspoVar2.println();
                                }
                                aspoVar2.a();
                                aspoVar2.println();
                            }
                            if (fmsy.a.a().g()) {
                                File file = fmut.i() ? new File(bqux.a.b(AppContextProvider.a().getFilesDir(), "traces")) : new File(AppContextProvider.a().getFilesDir(), "traces");
                                if (file.exists() && (listFiles = file.listFiles()) != null) {
                                    aspoVar2.println("Expensive traces:");
                                    aspoVar2.println();
                                    for (File file2 : listFiles) {
                                        aspoVar2.println("=== ".concat(String.valueOf(file2.getName())));
                                        byte[] bArr = new byte[(int) file2.length()];
                                        try {
                                            FileInputStream fileInputStream = new FileInputStream(file2);
                                            try {
                                                fileInputStream.read(bArr);
                                                fileInputStream.close();
                                                aspoVar2.write(new String(bArr));
                                                aspoVar2.println();
                                            } catch (Throwable th) {
                                                try {
                                                    fileInputStream.close();
                                                } catch (Throwable th2) {
                                                    th.addSuppressed(th2);
                                                }
                                                throw th;
                                            }
                                        } catch (IOException e3) {
                                            Log.e("GmsCoreStatsService", "Error while reading expensive traces", e3);
                                            e3.printStackTrace(aspoVar2);
                                        }
                                    }
                                }
                            }
                            if (fmsy.a.a().f()) {
                                eijr eijrVar = arlv.a;
                                arlv arlvVar = arlu.a;
                                aspoVar2.println("BugreportLogger:");
                                aspoVar2.println("Logs up to last " + String.valueOf(arlv.b.a()) + " events:");
                                aspoVar2.b();
                                aspoVar2.println("Time\tEvent\tCount");
                                synchronized (arlv.class) {
                                    Iterator it = arlvVar.d.iterator();
                                    while (it.hasNext()) {
                                        arlt arltVar = (arlt) it.next();
                                        aspoVar2.println(DateFormat.getDateTimeInstance().format(Long.valueOf(arltVar.a)) + "\t" + arltVar.b + "\t" + arltVar.c);
                                    }
                                }
                                aspoVar2.a();
                                aspoVar2.println("All:");
                                aspoVar2.b();
                                aspoVar2.println("Event\tCount");
                                synchronized (arlv.class) {
                                    Iterator it2 = arlvVar.f.entrySet().iterator();
                                    while (it2.hasNext()) {
                                        aspoVar2.println(a.ar(it2, "\t"));
                                    }
                                }
                                aspoVar2.a();
                                aspoVar2.println("Last 1 hour:");
                                long millis = TimeUnit.HOURS.toMillis(1L);
                                aspoVar2.b();
                                HashMap hashMap = new HashMap();
                                asnv asnvVar = arlvVar.g;
                                long currentTimeMillis = System.currentTimeMillis();
                                synchronized (arlv.class) {
                                    Iterator it3 = arlvVar.d.iterator();
                                    while (it3.hasNext()) {
                                        arlt arltVar2 = (arlt) it3.next();
                                        if (arltVar2.a >= currentTimeMillis - millis) {
                                            String str2 = arltVar2.b;
                                            if (hashMap.containsKey(str2)) {
                                                hashMap.put(str2, Integer.valueOf(((Integer) hashMap.get(str2)).intValue() + arltVar2.c));
                                            } else {
                                                hashMap.put(str2, Integer.valueOf(arltVar2.c));
                                            }
                                        }
                                    }
                                }
                                aspoVar2.println("Event\tCount");
                                Iterator it4 = hashMap.entrySet().iterator();
                                while (it4.hasNext()) {
                                    aspoVar2.println(a.ar(it4, "\t"));
                                }
                                aspoVar2.a();
                            }
                        }
                    }, asmbVar)).a(new Callable() { // from class: asjc
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            asot asotVar = GmsCoreStatsChimeraService.a;
                            aspo aspoVar2 = aspo.this;
                            aspoVar2.println("Disk Stats:");
                            AtomicReference atomicReference2 = atomicReference;
                            if (atomicReference2.get() == null) {
                                Log.w("GmsCoreStatsService", "DiskStats not retrieved correctly");
                                return null;
                            }
                            aska askaVar = (aska) atomicReference2.get();
                            aspoVar2.println("Overall statistics:");
                            int i = askaVar.b;
                            if (i > 0) {
                                aspoVar2.printf(Locale.ENGLISH, "  Only top %d entries will be shown.\n", Integer.valueOf(i));
                            }
                            aspoVar2.printf(Locale.ENGLISH, "  Total file count: %d\n", Integer.valueOf(askaVar.e));
                            aspoVar2.printf(Locale.ENGLISH, "  Total directory count: %d\n", Integer.valueOf(askaVar.f));
                            aspoVar2.printf(Locale.ENGLISH, "  Total file size: %d bytes\n", Long.valueOf(askaVar.g));
                            aspoVar2.printf(Locale.ENGLISH, "  Max depth: %d\n", Integer.valueOf(askaVar.h));
                            eitj eitjVar = askaVar.l;
                            aspoVar2.printf(Locale.ENGLISH, "Scanned %d root directories:\n", Integer.valueOf(eitjVar.size()));
                            aska.a(eitjVar, aspoVar2);
                            eitj eitjVar2 = askaVar.i;
                            aspoVar2.printf(Locale.ENGLISH, "Top %d largest files:\n", Integer.valueOf(((ejcb) eitjVar2).c));
                            int i2 = askaVar.c;
                            aspoVar2.printf(Locale.ENGLISH, "* Note: file with size less than %d bytes are ignored.\n", Integer.valueOf(i2));
                            aspoVar2.println("#\tName\tSize");
                            ejfh it = eitjVar2.iterator();
                            int i3 = 0;
                            while (it.hasNext()) {
                                askc askcVar = (askc) it.next();
                                i3++;
                                aspoVar2.printf("%d\t%s\t%d\n", Integer.valueOf(i3), askcVar.a, Long.valueOf(askcVar.b));
                            }
                            eitj eitjVar3 = askaVar.j;
                            aspoVar2.printf(Locale.ENGLISH, "Top %d largest directories: \n", Integer.valueOf(((ejcb) eitjVar3).c));
                            aspoVar2.printf(Locale.ENGLISH, "* Note: directories with size less than %d bytes are ignored.\n", Integer.valueOf(i2));
                            aska.a(eitjVar3, aspoVar2);
                            eitj eitjVar4 = askaVar.k;
                            aspoVar2.printf(Locale.ENGLISH, "Top %d directories with most file inside: \n", Integer.valueOf(((ejcb) eitjVar4).c));
                            aspoVar2.printf(Locale.ENGLISH, "* Note: directories with content count less than %d bytes are ignored.\n", Integer.valueOf(askaVar.d));
                            aska.a(eitjVar4, aspoVar2);
                            return null;
                        }
                    }, asmbVar).j(fmsy.a.a().d(), TimeUnit.MILLISECONDS, asmbVar).get();
                } catch (asoa e) {
                    Log.e("GmsCoreStatsService", "", e);
                } catch (InterruptedException e2) {
                    Log.e("GmsCoreStatsService", "", e2);
                    Thread.currentThread().interrupt();
                } catch (ExecutionException e3) {
                    if (e3.getCause() instanceof TimeoutException) {
                        Log.w("GmsCoreStatsService", "GmsCoreStatsService dump timed out", e3);
                        aspoVar.println("Timeout exceeded, the dump may be cut");
                    } else {
                        Log.e("GmsCoreStatsService", "ExecutionException not caused by TimeoutException caught", e3);
                    }
                }
                asobVar.close();
            } finally {
            }
        } catch (IOException e4) {
            Log.e("GmsCoreStatsService", "", e4);
        }
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        int i = AvailabilityFilesCleanupTask.a;
        if (fncn.j()) {
            byko bykoVar = new byko();
            bykoVar.w(AvailabilityFilesCleanupTask.class.getName());
            bykoVar.q("CLEANUP");
            bykoVar.p = false;
            bykoVar.v(1);
            bykoVar.a = bykv.j;
            bykoVar.l(false);
            byjl.a(this).f(bykoVar.b());
        } else {
            long seconds = TimeUnit.HOURS.toSeconds(fndk.a.a().c());
            bykm bykmVar = new bykm();
            bykmVar.j(byki.a(seconds));
            bykmVar.w(AvailabilityFilesCleanupTask.class.getName());
            bykmVar.t("CLEANUP");
            bykmVar.p = false;
            bykmVar.v(1);
            byjl.a(this).f(bykmVar.b());
        }
        if (fndk.c() || brby.b(btmp.v()) || fndk.f()) {
            asot asotVar = bhgl.a;
            final asmb asmbVar = new asmb(1, 10, new bhib(this, bhgl.class, 16, "ServiceAvailabilityUploader"));
            asmbVar.execute(new Runnable() { // from class: bhgk
                @Override // java.lang.Runnable
                public final void run() {
                    bhgl.a(ensw.this);
                }
            });
        }
        ScheduledExecutorService h = byhj.b.h(1, bwou.a());
        Runnable runnable = new Runnable() { // from class: bqxn
            @Override // java.lang.Runnable
            public final void run() {
                File b2 = bwoa.b();
                brhk a2 = brhk.a();
                brgr b3 = brgr.b();
                long millis = TimeUnit.HOURS.toMillis(fmvs.a.a().i());
                List<bwnz> d = bwoa.d(b2);
                long currentTimeMillis = System.currentTimeMillis();
                for (bwnz bwnzVar : d) {
                    brgt brgtVar = bwnzVar.b;
                    brmq c = b3.c(brgtVar);
                    long j = bwnzVar.d;
                    if (Math.abs(currentTimeMillis - j) <= millis && c != null) {
                        if (c.c.a == bwnzVar.c) {
                            if ("1".equals(bwnzVar.e)) {
                                a2.c(brgtVar, j);
                            }
                        }
                    }
                    if (c != null) {
                        c.e(bwnzVar.a);
                    } else {
                        bwnzVar.a.delete();
                    }
                }
            }
        };
        fmvs fmvsVar = fmvs.a;
        long f = fmvsVar.a().f();
        if (f == 0) {
            h.execute(runnable);
        } else {
            h.schedule(runnable, f, TimeUnit.SECONDS);
        }
        if (fmvs.X()) {
            int i2 = GmsCoreLoggerFilesCleanupTask.a;
            if (fnck.a.a().u()) {
                byko bykoVar2 = new byko();
                bykoVar2.w(GmsCoreLoggerFilesCleanupTask.class.getName());
                bykoVar2.a = bykv.e((int) fmvsVar.a().k());
                bykoVar2.t("CLEANUP");
                bykoVar2.p = false;
                bykoVar2.l(false);
                bykoVar2.v(1);
                byjl.a(this).f(bykoVar2.b());
                return;
            }
            long seconds2 = TimeUnit.HOURS.toSeconds(fmvsVar.a().l());
            bykm bykmVar2 = new bykm();
            bykmVar2.j(byki.a(seconds2));
            bykmVar2.w(GmsCoreLoggerFilesCleanupTask.class.getName());
            bykmVar2.t("CLEANUP");
            bykmVar2.p = false;
            bykmVar2.v(1);
            byjl.a(this).f(bykmVar2.b());
        }
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }
}
