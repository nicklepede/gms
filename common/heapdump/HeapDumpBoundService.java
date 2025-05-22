package com.google.android.gms.common.heapdump;

import android.content.Context;
import android.os.Debug;
import android.os.SystemClock;
import com.google.android.gms.common.heapdump.HeapDumpBoundService;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.atvd;
import defpackage.auid;
import defpackage.aupv;
import defpackage.ausn;
import defpackage.auud;
import defpackage.cauf;
import defpackage.eluo;
import defpackage.fpot;
import j$.io.FileRetargetClass;
import j$.nio.file.Files;
import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import j$.nio.file.attribute.FileAttribute;
import j$.util.Map;
import j$.util.Optional;
import java.io.File;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public abstract class HeapDumpBoundService extends GmsTaskBoundService {
    public static final ausn a = ausn.b("HeapDumpBoundServiceLogger", auid.CORE);
    public final String b;
    ScheduledFuture c;
    private final ScheduledExecutorService d;

    protected HeapDumpBoundService(String str) {
        this(str, new aupv(1, 10), new atvd());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        if (!e()) {
            ((eluo) ((eluo) a.h()).ai(3182)).T("%s: Flag need to be true to proceed. Task skipped. Enable heapdump collection on %s process: %b ", this.b, auud.d(), Boolean.valueOf(e()));
            return 0;
        }
        if (new Random().nextDouble() >= fpot.a.lK().a()) {
            ((eluo) ((eluo) a.h()).ai(3181)).B("%s: This device is not part of the selected sample. Task skipped.", this.b);
            return 0;
        }
        d();
        return 0;
    }

    final synchronized void d() {
        if (this.c != null) {
            ((eluo) ((eluo) a.h()).ai(3186)).B("%s: Cancel the previous scheduled task.", this.b);
            this.c.cancel(false);
        }
        this.c = this.d.schedule(new Runnable() { // from class: atvc
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v0 */
            /* JADX WARN: Type inference failed for: r11v1 */
            /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r11v28 */
            /* JADX WARN: Type inference failed for: r11v3 */
            /* JADX WARN: Type inference failed for: r11v5 */
            /* JADX WARN: Type inference failed for: r11v8, types: [dyoj, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r11v9 */
            /* JADX WARN: Type inference failed for: r16v8, types: [dypf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r8v18, types: [dypf, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                Throwable th;
                dyoj dyojVar;
                Throwable th2;
                dyon dyonVar;
                Throwable th3;
                dyor dyorVar;
                byte b;
                HashMap hashMap;
                ausn ausnVar;
                fpot fpotVar;
                dyoj dyojVar2;
                fpot fpotVar2;
                Long valueOf;
                ausn ausnVar2 = HeapDumpBoundService.a;
                eltz h = ausnVar2.h();
                HeapDumpBoundService heapDumpBoundService = HeapDumpBoundService.this;
                String str = heapDumpBoundService.b;
                ((eluo) ((eluo) h).ai((char) 3183)).B("%s: Postponed task is running.", str);
                if (!ausb.f(heapDumpBoundService)) {
                    ((eluo) ((eluo) ausnVar2.h()).ai((char) 3185)).B("%s: Device is not charging. Stop the task. ", str);
                    return;
                }
                try {
                    ausn ausnVar3 = atvf.a;
                    HashMap hashMap2 = new HashMap();
                    HashMap hashMap3 = new HashMap();
                    bvqh v = bvqh.v();
                    if (!btjp.b(v)) {
                        ((eluo) atvf.a.j()).x("HeapdumpLogger isn't able to log.");
                        return;
                    }
                    fpot fpotVar3 = fpot.a;
                    if (fpotVar3.lK().d()) {
                        ((eluo) atvf.a.h()).x("Initiating GC before heap dump. May freeze the process.");
                        Runtime.getRuntime().gc();
                    }
                    ausn ausnVar4 = atvf.a;
                    ((eluo) ausnVar4.h()).x("Dumping Java heap, this may take a few seconds and freeze the process.");
                    try {
                        Context context = new dyod(heapDumpBoundService).c;
                        File cacheDir = context.getCacheDir();
                        if (cacheDir == null) {
                            throw new NoSuchFileException("Unable to find an appropriate cache directory for taking a Java heap dump.");
                        }
                        Path resolve = FileRetargetClass.toPath(cacheDir).resolve(dyod.a);
                        if (Files.notExists(resolve, new LinkOption[0])) {
                            Files.createDirectories(resolve, new FileAttribute[0]);
                        }
                        String a2 = dykz.a(context);
                        String str2 = "";
                        ?? r11 = 1;
                        byte b2 = 1;
                        if (a2 != null) {
                            List n = ekwo.e(':').n(a2);
                            if (n.size() > 1) {
                                str2 = "_".concat(String.valueOf((String) elja.p(n)));
                            }
                        }
                        Path resolve2 = resolve.resolve(Path.CC.of(a.a(str2, "java_heap_dump", ".hprof"), new String[0]));
                        if (Files.deleteIfExists(resolve2)) {
                            ((elti) ((elti) dyod.b.j()).ai((char) 12922)).x("Java heap dump was not previously cleaned up. Cleaned it up now.");
                        }
                        Debug.dumpHprofData(resolve2.toString());
                        if (Files.notExists(resolve2, new LinkOption[0])) {
                            throw new IOException("Unable to take Java heap dump.");
                        }
                        dyoj dyojVar3 = new dyoj(resolve2);
                        try {
                            try {
                                HashMap hashMap4 = new HashMap();
                                HashMap hashMap5 = new HashMap();
                                HashMap hashMap6 = new HashMap();
                                HashMap hashMap7 = new HashMap();
                                dyon a3 = dyojVar3.a();
                                try {
                                    dyor dyorVar2 = new dyor(a3);
                                    Optional a4 = dyorVar2.a();
                                    while (a4.isPresent()) {
                                        ?? r16 = a4.get();
                                        if (r16.b()) {
                                            try {
                                                if (r16.a() == b2) {
                                                    dype dypeVar = (dype) r16;
                                                    b = b2;
                                                    hashMap = hashMap6;
                                                    hashMap4.put(Long.valueOf(dypeVar.a), dypeVar.b);
                                                } else {
                                                    b = b2;
                                                    hashMap = hashMap6;
                                                }
                                                if (r16.a() == 2) {
                                                    dypb dypbVar = (dypb) r16;
                                                    fpotVar2 = fpotVar3;
                                                    ausnVar = ausnVar4;
                                                    hashMap5.put(Long.valueOf(dypbVar.a), Long.valueOf(dypbVar.b));
                                                } else {
                                                    ausnVar = ausnVar4;
                                                    fpotVar = fpotVar3;
                                                    dyojVar2 = dyojVar3;
                                                    hashMap6 = hashMap;
                                                    dyojVar = dyojVar2;
                                                    a4 = dyorVar2.a();
                                                    fpotVar3 = fpotVar;
                                                    dyojVar3 = dyojVar;
                                                    b2 = b;
                                                    ausnVar4 = ausnVar;
                                                }
                                            } catch (Throwable th4) {
                                                th2 = th4;
                                                r11 = dyojVar3;
                                                try {
                                                    a3.close();
                                                    throw th2;
                                                } catch (Throwable th5) {
                                                    th2.addSuppressed(th5);
                                                    throw th2;
                                                }
                                            }
                                        } else {
                                            ausnVar = ausnVar4;
                                            b = b2;
                                            hashMap = hashMap6;
                                            fpotVar2 = fpotVar3;
                                            if (r16.a() == 32) {
                                                dyou dyouVar = (dyou) r16;
                                                dyoj dyojVar4 = dyojVar3;
                                                try {
                                                    valueOf = Long.valueOf(dyouVar.a);
                                                    fpotVar = fpotVar2;
                                                    hashMap6 = hashMap;
                                                    hashMap6.put(valueOf, Long.valueOf(dyouVar.b));
                                                    dyojVar = dyojVar4;
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    dyojVar = dyojVar4;
                                                    th2 = th;
                                                    r11 = dyojVar;
                                                    a3.close();
                                                    throw th2;
                                                }
                                                try {
                                                    hashMap7.put(valueOf, Long.valueOf(dyouVar.c));
                                                    dyojVar = dyojVar;
                                                    a4 = dyorVar2.a();
                                                    fpotVar3 = fpotVar;
                                                    dyojVar3 = dyojVar;
                                                    b2 = b;
                                                    ausnVar4 = ausnVar;
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    th2 = th;
                                                    r11 = dyojVar;
                                                    a3.close();
                                                    throw th2;
                                                }
                                            }
                                        }
                                        dyojVar2 = dyojVar3;
                                        fpotVar = fpotVar2;
                                        hashMap6 = hashMap;
                                        dyojVar = dyojVar2;
                                        a4 = dyorVar2.a();
                                        fpotVar3 = fpotVar;
                                        dyojVar3 = dyojVar;
                                        b2 = b;
                                        ausnVar4 = ausnVar;
                                    }
                                    fpot fpotVar4 = fpotVar3;
                                    ausn ausnVar5 = ausnVar4;
                                    r11 = dyojVar3;
                                    a3.close();
                                    ((eluo) ausnVar5.h()).x("Analyze the heap dump.");
                                    dyon a5 = r11.a();
                                    try {
                                        dyor dyorVar3 = new dyor(a5);
                                        Optional a6 = dyorVar3.a();
                                        while (a6.isPresent()) {
                                            ?? r8 = a6.get();
                                            if (!r8.b()) {
                                                if (r8.a() == 33) {
                                                    try {
                                                        Long valueOf2 = Long.valueOf(((dypa) r8).a);
                                                        hashMap3.put(valueOf2, Long.valueOf(((Long) Map.EL.getOrDefault(hashMap3, valueOf2, 0L)).longValue() + 1));
                                                        hashMap2.put(valueOf2, Long.valueOf(((Long) Map.EL.getOrDefault(hashMap2, valueOf2, (Long) Map.EL.getOrDefault(hashMap7, valueOf2, 0L))).longValue() + ((Long) Map.EL.getOrDefault(hashMap6, valueOf2, 0L)).longValue()));
                                                    } catch (Throwable th8) {
                                                        th3 = th8;
                                                        dyonVar = a5;
                                                        try {
                                                            dyonVar.close();
                                                            throw th3;
                                                        } catch (Throwable th9) {
                                                            th3.addSuppressed(th9);
                                                            throw th3;
                                                        }
                                                    }
                                                } else if (r8.a() == 34) {
                                                    dypc dypcVar = (dypc) r8;
                                                    Long valueOf3 = Long.valueOf(dypcVar.a);
                                                    hashMap3.put(valueOf3, Long.valueOf(((Long) Map.EL.getOrDefault(hashMap3, valueOf3, 0L)).longValue() + 1));
                                                    dyonVar = a5;
                                                    dyorVar = dyorVar3;
                                                    try {
                                                        hashMap2.put(valueOf3, Long.valueOf(((Long) Map.EL.getOrDefault(hashMap2, valueOf3, (Long) Map.EL.getOrDefault(hashMap7, valueOf3, 0L))).longValue() + dypcVar.b + ((Long) Map.EL.getOrDefault(hashMap6, valueOf3, 0L)).longValue()));
                                                        a6 = dyorVar.a();
                                                        a5 = dyonVar;
                                                        dyorVar3 = dyorVar;
                                                    } catch (Throwable th10) {
                                                        th = th10;
                                                        th3 = th;
                                                        dyonVar.close();
                                                        throw th3;
                                                    }
                                                }
                                            }
                                            dyonVar = a5;
                                            dyorVar = dyorVar3;
                                            a6 = dyorVar.a();
                                            a5 = dyonVar;
                                            dyorVar3 = dyorVar;
                                        }
                                        a5.close();
                                        fgrc v2 = epmx.a.v();
                                        ArrayList arrayList = new ArrayList(hashMap2.keySet());
                                        Collections.shuffle(arrayList);
                                        int i = 0;
                                        while (true) {
                                            fpot fpotVar5 = fpotVar4;
                                            if (i >= fpotVar4.lK().b()) {
                                                break;
                                            }
                                            Long l = (Long) arrayList.get(i);
                                            String str3 = (String) hashMap4.get(hashMap5.get(l));
                                            atzb.t(str3, "Class name must be non null.");
                                            fgrc v3 = epmw.a.v();
                                            if (!v3.b.L()) {
                                                v3.U();
                                            }
                                            epmw epmwVar = (epmw) v3.b;
                                            str3.getClass();
                                            ArrayList arrayList2 = arrayList;
                                            epmwVar.b |= 1;
                                            epmwVar.c = str3;
                                            int i2 = i;
                                            HashMap hashMap8 = hashMap4;
                                            long longValue = ((Long) Map.EL.getOrDefault(hashMap3, l, 0L)).longValue();
                                            if (!v3.b.L()) {
                                                v3.U();
                                            }
                                            epmw epmwVar2 = (epmw) v3.b;
                                            HashMap hashMap9 = hashMap3;
                                            epmwVar2.b |= 2;
                                            epmwVar2.d = longValue;
                                            long longValue2 = ((Long) Map.EL.getOrDefault(hashMap2, l, 0L)).longValue();
                                            if (!v3.b.L()) {
                                                v3.U();
                                            }
                                            epmw epmwVar3 = (epmw) v3.b;
                                            epmwVar3.b |= 4;
                                            epmwVar3.e = longValue2;
                                            long longValue3 = ((Long) Map.EL.getOrDefault(hashMap7, l, 0L)).longValue();
                                            if (!v3.b.L()) {
                                                v3.U();
                                            }
                                            epmw epmwVar4 = (epmw) v3.b;
                                            epmwVar4.b |= 8;
                                            epmwVar4.f = longValue3;
                                            epmw epmwVar5 = (epmw) v3.Q();
                                            if (!v2.b.L()) {
                                                v2.U();
                                            }
                                            epmx epmxVar = (epmx) v2.b;
                                            epmwVar5.getClass();
                                            fgsa fgsaVar = epmxVar.d;
                                            if (!fgsaVar.c()) {
                                                epmxVar.d = fgri.E(fgsaVar);
                                            }
                                            epmxVar.d.add(epmwVar5);
                                            i = i2 + 1;
                                            fpotVar4 = fpotVar5;
                                            hashMap4 = hashMap8;
                                            arrayList = arrayList2;
                                            hashMap3 = hashMap9;
                                        }
                                        long uptimeMillis = SystemClock.uptimeMillis() - auud.c();
                                        auvj a7 = bznx.a(auud.d());
                                        if (!v2.b.L()) {
                                            v2.U();
                                        }
                                        epmx epmxVar2 = (epmx) v2.b;
                                        epmxVar2.c = a7.a();
                                        epmxVar2.b |= 1;
                                        if (!v2.b.L()) {
                                            v2.U();
                                        }
                                        epmx epmxVar3 = (epmx) v2.b;
                                        epmxVar3.b |= 2;
                                        epmxVar3.e = uptimeMillis;
                                        epmx epmxVar4 = (epmx) v2.Q();
                                        if (epmxVar4 == null) {
                                            ((eluo) ausnVar5.j()).x("Heap dump proto is null. Nothing to log.");
                                        } else {
                                            epnn epnnVar = (epnn) epno.a.v();
                                            if (!epnnVar.b.L()) {
                                                epnnVar.U();
                                            }
                                            epno epnoVar = (epno) epnnVar.b;
                                            fgsa fgsaVar2 = epnoVar.aq;
                                            if (!fgsaVar2.c()) {
                                                epnoVar.aq = fgri.E(fgsaVar2);
                                            }
                                            epnoVar.aq.add(epmxVar4);
                                            v.f((epno) epnnVar.Q());
                                        }
                                        r11.close();
                                    } catch (Throwable th11) {
                                        th = th11;
                                        dyonVar = a5;
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    dyojVar = dyojVar3;
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                r11 = dyojVar3;
                                th = th;
                                try {
                                    r11.close();
                                    throw th;
                                } catch (Throwable th14) {
                                    th.addSuppressed(th14);
                                    throw th;
                                }
                            }
                        } catch (Throwable th15) {
                            th = th15;
                            th = th;
                            r11.close();
                            throw th;
                        }
                    } catch (Exception e) {
                        throw new IOException("Failed to run heap dump task.", e);
                    }
                } catch (IOException e2) {
                    ((eluo) ((eluo) ((eluo) HeapDumpBoundService.a.j()).s(e2)).ai(3184)).B("%s: Failed to dump Java heap", heapDumpBoundService.b);
                }
            }
        }, Math.max(0L, fpot.a.lK().c()), TimeUnit.SECONDS);
    }

    public abstract boolean e();

    public HeapDumpBoundService(String str, ScheduledExecutorService scheduledExecutorService, atvd atvdVar) {
        this.d = scheduledExecutorService;
        this.b = str;
    }
}
