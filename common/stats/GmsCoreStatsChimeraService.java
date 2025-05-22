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
import defpackage.auid;
import defpackage.aumx;
import defpackage.aunv;
import defpackage.aupv;
import defpackage.auru;
import defpackage.aurv;
import defpackage.ausn;
import defpackage.auti;
import defpackage.bjlb;
import defpackage.bjmq;
import defpackage.btjp;
import defpackage.bvuo;
import defpackage.byxh;
import defpackage.caqb;
import defpackage.casd;
import defpackage.cata;
import defpackage.cate;
import defpackage.catg;
import defpackage.catn;
import defpackage.ejad;
import defpackage.eluo;
import defpackage.fpkw;
import defpackage.fpnq;
import defpackage.fpuj;
import defpackage.fpum;
import defpackage.fpvj;
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

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class GmsCoreStatsChimeraService extends Service {
    public static final ausn a = ausn.b("GmsCoreStatsService", auid.CORE);
    public static final Comparator b = new aumx();

    public GmsCoreStatsChimeraService() {
        ausn ausnVar = aunv.a;
    }

    public static int a(String str, int i) {
        if (str == null) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            ((eluo) a.j()).x("wrong parameter of max output entry count");
            return i;
        }
    }

    @Override // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, final String[] strArr) {
        aupv aupvVar = new aupv(3, 9);
        try {
            aurv aurvVar = new aurv(printWriter);
            try {
                final auti autiVar = new auti(aurvVar, "  ");
                autiVar.println("GMS Core Stats:");
                final AtomicReference atomicReference = new AtomicReference();
                try {
                    ejad.h(ejad.d(new Runnable() { // from class: aumu
                        @Override // java.lang.Runnable
                        public final void run() {
                            Context createDeviceProtectedStorageContext;
                            File dataDir;
                            bsj bsjVar = new bsj();
                            GmsCoreStatsChimeraService gmsCoreStatsChimeraService = GmsCoreStatsChimeraService.this;
                            String[] strArr2 = strArr;
                            if (strArr2 != null) {
                                int i = 0;
                                while (true) {
                                    char c = 65535;
                                    if (i >= strArr2.length - 1 || bsjVar.d >= 3) {
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
                                        bsjVar.put(0, strArr2[i]);
                                    } else if (c == 1) {
                                        i++;
                                        bsjVar.put(1, strArr2[i]);
                                    } else if (c == 2) {
                                        i++;
                                        bsjVar.put(2, strArr2[i]);
                                    }
                                    i++;
                                }
                            }
                            String str2 = (String) bsjVar.get(0);
                            fpkw fpkwVar = fpkw.a;
                            int a2 = GmsCoreStatsChimeraService.a(str2, eqbm.a(fpkwVar.lK().a()));
                            int a3 = GmsCoreStatsChimeraService.a((String) bsjVar.get(1), eqbm.a(fpkwVar.lK().c()));
                            int a4 = GmsCoreStatsChimeraService.a((String) bsjVar.get(2), eqbm.a(fpkwVar.lK().b()));
                            HashSet hashSet = new HashSet();
                            try {
                                ApplicationInfo applicationInfo = gmsCoreStatsChimeraService.getPackageManager().getApplicationInfo(gmsCoreStatsChimeraService.getPackageName(), 0);
                                hashSet.add(fpmr.i() ? new File(btco.a.a(applicationInfo.dataDir)) : new File(applicationInfo.dataDir));
                            } catch (PackageManager.NameNotFoundException unused) {
                                ((eluo) aunv.a.j()).x("Failed to use package manager getting data directory from context instead.");
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
                            elgo i2 = elgo.i(hashSet);
                            aunt auntVar = new aunt(a2, a3, a4);
                            Iterator it = i2.iterator();
                            while (it.hasNext()) {
                                aunm a5 = auntVar.a((File) it.next(), 0);
                                auntVar.k.add(a5);
                                auntVar.d += a5.b;
                                auntVar.e += a5.c + 1;
                                auntVar.f += a5.d;
                            }
                            atomicReference.set(((ekvw) ekvi.j(new aunu(auntVar))).a);
                        }
                    }, aupvVar), ejad.d(new Runnable() { // from class: aumv
                        @Override // java.lang.Runnable
                        public final void run() {
                            ModuleManager.ConfigInfo configInfo;
                            File[] listFiles;
                            GmsCoreStatsChimeraService gmsCoreStatsChimeraService = GmsCoreStatsChimeraService.this;
                            List<ApplicationInfo> installedApplications = gmsCoreStatsChimeraService.getPackageManager().getInstalledApplications(128);
                            auti autiVar2 = autiVar;
                            autiVar2.b();
                            autiVar2.println("Client jar version:");
                            autiVar2.b();
                            Collections.sort(installedApplications, GmsCoreStatsChimeraService.b);
                            autiVar2.b();
                            int i = -2;
                            for (ApplicationInfo applicationInfo : installedApplications) {
                                int i2 = applicationInfo.metaData != null ? applicationInfo.metaData.getInt("com.google.android.gms.version", -1) : -2;
                                if (i2 != -2 && i2 != -1) {
                                    if (i != i2) {
                                        autiVar2.a();
                                        autiVar2.println(i2 != -2 ? i2 != -1 ? a.B(i2, ":") : "UNKNOWN_SDK_VERSION:" : "EMPTY_METADATA:");
                                        autiVar2.b();
                                        i = i2;
                                    }
                                    autiVar2.println(applicationInfo.packageName);
                                }
                            }
                            autiVar2.a();
                            autiVar2.a();
                            ModuleManager moduleManager = ModuleManager.get(gmsCoreStatsChimeraService);
                            autiVar2.println("Module Sets:");
                            autiVar2.b();
                            Collection<ModuleManager.ModuleInfo> collection = null;
                            try {
                                configInfo = moduleManager.getCurrentConfig();
                            } catch (InvalidConfigException e) {
                                ((eluo) ((eluo) GmsCoreStatsChimeraService.a.i()).s(e)).x("Unable to get Chimera module config");
                                configInfo = null;
                            }
                            if (configInfo != null) {
                                for (ModuleManager.ModuleSetInfo moduleSetInfo : configInfo.moduleSets) {
                                    autiVar2.println("Module Set ID: " + moduleSetInfo.moduleSetId + ", Module Set Variant: " + moduleSetInfo.moduleSetVariant);
                                }
                            }
                            try {
                                collection = moduleManager.getAllModules();
                            } catch (InvalidConfigException e2) {
                                ((eluo) ((eluo) GmsCoreStatsChimeraService.a.i()).s(e2)).x("Unable to get Chimera module info collection");
                            }
                            if (collection != null) {
                                autiVar2.println();
                                autiVar2.a();
                                autiVar2.println("Chimera Module APKs:");
                                autiVar2.b();
                                buy buyVar = new buy();
                                for (ModuleManager.ModuleInfo moduleInfo : collection) {
                                    if (!TextUtils.isEmpty(moduleInfo.moduleId)) {
                                        ModuleManager.ModuleApkInfo moduleApkInfo = moduleInfo.moduleApk;
                                        ArrayList arrayList = (ArrayList) buyVar.get(moduleApkInfo);
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            buyVar.put(moduleApkInfo, arrayList);
                                        }
                                        arrayList.add(moduleInfo);
                                    }
                                }
                                for (int i3 = 0; i3 < buyVar.d; i3++) {
                                    ModuleManager.ModuleApkInfo moduleApkInfo2 = (ModuleManager.ModuleApkInfo) buyVar.f(i3);
                                    ArrayList arrayList2 = (ArrayList) buyVar.i(i3);
                                    String str = moduleApkInfo2.apkPackageName + " [" + moduleApkInfo2.apkVersionCode + "]";
                                    if (gmsCoreStatsChimeraService.getPackageName().equals(moduleApkInfo2.apkPackageName) && !TextUtils.isEmpty(moduleApkInfo2.apkVersionName)) {
                                        str = str + " [" + moduleApkInfo2.apkVersionName + "]";
                                    }
                                    autiVar2.println(str);
                                    autiVar2.b();
                                    int size = arrayList2.size();
                                    for (int i4 = 0; i4 < size; i4++) {
                                        ModuleManager.ModuleInfo moduleInfo2 = (ModuleManager.ModuleInfo) arrayList2.get(i4);
                                        autiVar2.print(moduleInfo2.moduleId + " [v" + moduleInfo2.moduleVersion + "]");
                                        autiVar2.println();
                                    }
                                    autiVar2.a();
                                    autiVar2.println();
                                }
                                autiVar2.a();
                                autiVar2.println();
                            }
                            if (fpkw.a.lK().f()) {
                                File file = fpmr.i() ? new File(btco.a.b(AppContextProvider.a().getFilesDir(), "traces")) : new File(AppContextProvider.a().getFilesDir(), "traces");
                                if (file.exists() && (listFiles = file.listFiles()) != null) {
                                    autiVar2.println("Expensive traces:");
                                    autiVar2.println();
                                    for (File file2 : listFiles) {
                                        autiVar2.println("=== ".concat(String.valueOf(file2.getName())));
                                        byte[] bArr = new byte[(int) file2.length()];
                                        try {
                                            FileInputStream fileInputStream = new FileInputStream(file2);
                                            try {
                                                fileInputStream.read(bArr);
                                                fileInputStream.close();
                                                autiVar2.write(new String(bArr));
                                                autiVar2.println();
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
                                            e3.printStackTrace(autiVar2);
                                        }
                                    }
                                }
                            }
                            if (fpkw.a.lK().e()) {
                                ekww ekwwVar = atok.a;
                                atok atokVar = atoj.a;
                                autiVar2.println("BugreportLogger:");
                                autiVar2.println("Logs up to last " + String.valueOf(atok.b.lK()) + " events:");
                                autiVar2.b();
                                autiVar2.println("Time\tEvent\tCount");
                                synchronized (atok.class) {
                                    Iterator it = atokVar.d.iterator();
                                    while (it.hasNext()) {
                                        atoi atoiVar = (atoi) it.next();
                                        autiVar2.println(DateFormat.getDateTimeInstance().format(Long.valueOf(atoiVar.a)) + "\t" + atoiVar.b + "\t" + atoiVar.c);
                                    }
                                }
                                autiVar2.a();
                                autiVar2.println("All:");
                                autiVar2.b();
                                autiVar2.println("Event\tCount");
                                synchronized (atok.class) {
                                    Iterator it2 = atokVar.f.entrySet().iterator();
                                    while (it2.hasNext()) {
                                        autiVar2.println(a.ar(it2, "\t"));
                                    }
                                }
                                autiVar2.a();
                                autiVar2.println("Last 1 hour:");
                                long millis = TimeUnit.HOURS.toMillis(1L);
                                autiVar2.b();
                                HashMap hashMap = new HashMap();
                                aurp aurpVar = atokVar.g;
                                long currentTimeMillis = System.currentTimeMillis();
                                synchronized (atok.class) {
                                    Iterator it3 = atokVar.d.iterator();
                                    while (it3.hasNext()) {
                                        atoi atoiVar2 = (atoi) it3.next();
                                        if (atoiVar2.a >= currentTimeMillis - millis) {
                                            String str2 = atoiVar2.b;
                                            if (hashMap.containsKey(str2)) {
                                                hashMap.put(str2, Integer.valueOf(((Integer) hashMap.get(str2)).intValue() + atoiVar2.c));
                                            } else {
                                                hashMap.put(str2, Integer.valueOf(atoiVar2.c));
                                            }
                                        }
                                    }
                                }
                                autiVar2.println("Event\tCount");
                                Iterator it4 = hashMap.entrySet().iterator();
                                while (it4.hasNext()) {
                                    autiVar2.println(a.ar(it4, "\t"));
                                }
                                autiVar2.a();
                            }
                        }
                    }, aupvVar)).a(new Callable() { // from class: aumw
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            ausn ausnVar = GmsCoreStatsChimeraService.a;
                            auti autiVar2 = auti.this;
                            autiVar2.println("Disk Stats:");
                            AtomicReference atomicReference2 = atomicReference;
                            if (atomicReference2.get() == null) {
                                Log.w("GmsCoreStatsService", "DiskStats not retrieved correctly");
                                return null;
                            }
                            aunu aunuVar = (aunu) atomicReference2.get();
                            autiVar2.println("Overall statistics:");
                            int i = aunuVar.b;
                            if (i > 0) {
                                autiVar2.printf(Locale.ENGLISH, "  Only top %d entries will be shown.\n", Integer.valueOf(i));
                            }
                            autiVar2.printf(Locale.ENGLISH, "  Total file count: %d\n", Integer.valueOf(aunuVar.e));
                            autiVar2.printf(Locale.ENGLISH, "  Total directory count: %d\n", Integer.valueOf(aunuVar.f));
                            autiVar2.printf(Locale.ENGLISH, "  Total file size: %d bytes\n", Long.valueOf(aunuVar.g));
                            autiVar2.printf(Locale.ENGLISH, "  Max depth: %d\n", Integer.valueOf(aunuVar.h));
                            elgo elgoVar = aunuVar.l;
                            autiVar2.printf(Locale.ENGLISH, "Scanned %d root directories:\n", Integer.valueOf(elgoVar.size()));
                            aunu.a(elgoVar, autiVar2);
                            elgo elgoVar2 = aunuVar.i;
                            autiVar2.printf(Locale.ENGLISH, "Top %d largest files:\n", Integer.valueOf(((elpg) elgoVar2).c));
                            int i2 = aunuVar.c;
                            autiVar2.printf(Locale.ENGLISH, "* Note: file with size less than %d bytes are ignored.\n", Integer.valueOf(i2));
                            autiVar2.println("#\tName\tSize");
                            elso it = elgoVar2.iterator();
                            int i3 = 0;
                            while (it.hasNext()) {
                                aunw aunwVar = (aunw) it.next();
                                i3++;
                                autiVar2.printf("%d\t%s\t%d\n", Integer.valueOf(i3), aunwVar.a, Long.valueOf(aunwVar.b));
                            }
                            elgo elgoVar3 = aunuVar.j;
                            autiVar2.printf(Locale.ENGLISH, "Top %d largest directories: \n", Integer.valueOf(((elpg) elgoVar3).c));
                            autiVar2.printf(Locale.ENGLISH, "* Note: directories with size less than %d bytes are ignored.\n", Integer.valueOf(i2));
                            aunu.a(elgoVar3, autiVar2);
                            elgo elgoVar4 = aunuVar.k;
                            autiVar2.printf(Locale.ENGLISH, "Top %d directories with most file inside: \n", Integer.valueOf(((elpg) elgoVar4).c));
                            autiVar2.printf(Locale.ENGLISH, "* Note: directories with content count less than %d bytes are ignored.\n", Integer.valueOf(aunuVar.d));
                            aunu.a(elgoVar4, autiVar2);
                            return null;
                        }
                    }, aupvVar).j(fpkw.a.lK().d(), TimeUnit.MILLISECONDS, aupvVar).get();
                } catch (auru e) {
                    Log.e("GmsCoreStatsService", "", e);
                } catch (InterruptedException e2) {
                    Log.e("GmsCoreStatsService", "", e2);
                    Thread.currentThread().interrupt();
                } catch (ExecutionException e3) {
                    if (e3.getCause() instanceof TimeoutException) {
                        Log.w("GmsCoreStatsService", "GmsCoreStatsService dump timed out", e3);
                        autiVar.println("Timeout exceeded, the dump may be cut");
                    } else {
                        Log.e("GmsCoreStatsService", "ExecutionException not caused by TimeoutException caught", e3);
                    }
                }
                aurvVar.close();
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
        if (fpum.j()) {
            catg catgVar = new catg();
            catgVar.w(AvailabilityFilesCleanupTask.class.getName());
            catgVar.q("CLEANUP");
            catgVar.p = false;
            catgVar.v(1);
            catgVar.a = catn.j;
            catgVar.l(false);
            casd.a(this).f(catgVar.b());
        } else {
            long seconds = TimeUnit.HOURS.toSeconds(fpvj.a.lK().c());
            cate cateVar = new cate();
            cateVar.j(cata.a(seconds));
            cateVar.w(AvailabilityFilesCleanupTask.class.getName());
            cateVar.t("CLEANUP");
            cateVar.p = false;
            cateVar.v(1);
            casd.a(this).f(cateVar.b());
        }
        if (fpvj.c() || btjp.b(bvuo.v()) || fpvj.f()) {
            ausn ausnVar = bjlb.a;
            final aupv aupvVar = new aupv(1, 10, new bjmq(this, bjlb.class, 16, "ServiceAvailabilityUploader"));
            aupvVar.execute(new Runnable() { // from class: bjla
                @Override // java.lang.Runnable
                public final void run() {
                    bjlb.a(eqgp.this);
                }
            });
        }
        ScheduledExecutorService h = caqb.b.h(1, byxh.a());
        Runnable runnable = new Runnable() { // from class: btfe
            @Override // java.lang.Runnable
            public final void run() {
                File b2 = bywn.b();
                btpb a2 = btpb.a();
                btoi b3 = btoi.b();
                long millis = TimeUnit.HOURS.toMillis(fpnq.a.lK().i());
                List<bywm> d = bywn.d(b2);
                long currentTimeMillis = System.currentTimeMillis();
                for (bywm bywmVar : d) {
                    btok btokVar = bywmVar.b;
                    btui c = b3.c(btokVar);
                    long j = bywmVar.d;
                    if (Math.abs(currentTimeMillis - j) <= millis && c != null) {
                        if (c.c.a == bywmVar.c) {
                            if ("1".equals(bywmVar.e)) {
                                a2.c(btokVar, j);
                            }
                        }
                    }
                    if (c != null) {
                        c.e(bywmVar.a);
                    } else {
                        bywmVar.a.delete();
                    }
                }
            }
        };
        fpnq fpnqVar = fpnq.a;
        long f = fpnqVar.lK().f();
        if (f == 0) {
            h.execute(runnable);
        } else {
            h.schedule(runnable, f, TimeUnit.SECONDS);
        }
        int i2 = GmsCoreLoggerFilesCleanupTask.a;
        if (fpuj.a.lK().u()) {
            catg catgVar2 = new catg();
            catgVar2.w(GmsCoreLoggerFilesCleanupTask.class.getName());
            catgVar2.a = catn.e((int) fpnqVar.lK().k());
            catgVar2.t("CLEANUP");
            catgVar2.p = false;
            catgVar2.l(false);
            catgVar2.v(1);
            casd.a(this).f(catgVar2.b());
            return;
        }
        long seconds2 = TimeUnit.HOURS.toSeconds(fpnqVar.lK().l());
        cate cateVar2 = new cate();
        cateVar2.j(cata.a(seconds2));
        cateVar2.w(GmsCoreLoggerFilesCleanupTask.class.getName());
        cateVar2.t("CLEANUP");
        cateVar2.p = false;
        cateVar2.v(1);
        casd.a(this).f(cateVar2.b());
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }
}
