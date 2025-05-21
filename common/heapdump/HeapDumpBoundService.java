package com.google.android.gms.common.heapdump;

import android.content.Context;
import android.os.Debug;
import android.os.SystemClock;
import com.google.android.gms.common.heapdump.HeapDumpBoundService;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.arso;
import defpackage.asej;
import defpackage.asmb;
import defpackage.asot;
import defpackage.asqj;
import defpackage.byln;
import defpackage.ejhf;
import defpackage.fmwu;
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

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public abstract class HeapDumpBoundService extends GmsTaskBoundService {
    public static final asot a = asot.b("HeapDumpBoundServiceLogger", asej.CORE);
    public final String b;
    ScheduledFuture c;
    private final ScheduledExecutorService d;

    protected HeapDumpBoundService(String str) {
        this(str, new asmb(1, 10), new arso());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        if (!e()) {
            ((ejhf) ((ejhf) a.h()).ah(3178)).T("%s: Flag need to be true to proceed. Task skipped. Enable heapdump collection on %s process: %b ", this.b, asqj.d(), Boolean.valueOf(e()));
            return 0;
        }
        if (new Random().nextDouble() >= fmwu.a.a().a()) {
            ((ejhf) ((ejhf) a.h()).ah(3177)).B("%s: This device is not part of the selected sample. Task skipped.", this.b);
            return 0;
        }
        d();
        return 0;
    }

    final synchronized void d() {
        if (this.c != null) {
            ((ejhf) ((ejhf) a.h()).ah(3182)).B("%s: Cancel the previous scheduled task.", this.b);
            this.c.cancel(false);
        }
        this.c = this.d.schedule(new Runnable() { // from class: arsn
            /* JADX WARN: Type inference failed for: r13v18, types: [dwde, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r15v18, types: [dwde, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                dwci dwciVar;
                Throwable th;
                dwcm dwcmVar;
                Throwable th2;
                dwcm dwcmVar2;
                Throwable th3;
                dwci dwciVar2;
                byte b;
                HashMap hashMap;
                dwcq dwcqVar;
                asot asotVar = HeapDumpBoundService.a;
                ejgq h = asotVar.h();
                HeapDumpBoundService heapDumpBoundService = HeapDumpBoundService.this;
                String str = heapDumpBoundService.b;
                ((ejhf) ((ejhf) h).ah((char) 3179)).B("%s: Postponed task is running.", str);
                if (!asoh.f(heapDumpBoundService)) {
                    ((ejhf) ((ejhf) asotVar.h()).ah((char) 3181)).B("%s: Device is not charging. Stop the task. ", str);
                    return;
                }
                try {
                    asot asotVar2 = arsq.a;
                    HashMap hashMap2 = new HashMap();
                    HashMap hashMap3 = new HashMap();
                    btij v = btij.v();
                    if (!brby.b(v)) {
                        ((ejhf) arsq.a.j()).x("HeapdumpLogger isn't able to log.");
                        return;
                    }
                    if (fmwu.a.a().d()) {
                        ((ejhf) arsq.a.h()).x("Initiating GC before heap dump. May freeze the process.");
                        Runtime.getRuntime().gc();
                    }
                    asot asotVar3 = arsq.a;
                    ((ejhf) asotVar3.h()).x("Dumping Java heap, this may take a few seconds and freeze the process.");
                    try {
                        Context context = new dwcc(heapDumpBoundService).c;
                        File cacheDir = context.getCacheDir();
                        if (cacheDir == null) {
                            throw new NoSuchFileException("Unable to find an appropriate cache directory for taking a Java heap dump.");
                        }
                        Path resolve = FileRetargetClass.toPath(cacheDir).resolve(dwcc.a);
                        if (Files.notExists(resolve, new LinkOption[0])) {
                            Files.createDirectories(resolve, new FileAttribute[0]);
                        }
                        String a2 = dvyy.a(context);
                        String str2 = "";
                        byte b2 = 1;
                        if (a2 != null) {
                            List n = eijj.e(':').n(a2);
                            if (n.size() > 1) {
                                str2 = "_".concat(String.valueOf((String) eivv.p(n)));
                            }
                        }
                        Path resolve2 = resolve.resolve(Path.CC.of(a.a(str2, "java_heap_dump", ".hprof"), new String[0]));
                        if (Files.deleteIfExists(resolve2)) {
                            ((ejfz) ((ejfz) dwcc.b.j()).ah((char) 12937)).x("Java heap dump was not previously cleaned up. Cleaned it up now.");
                        }
                        Debug.dumpHprofData(resolve2.toString());
                        if (Files.notExists(resolve2, new LinkOption[0])) {
                            throw new IOException("Unable to take Java heap dump.");
                        }
                        dwci dwciVar3 = new dwci(resolve2);
                        try {
                            try {
                                HashMap hashMap4 = new HashMap();
                                HashMap hashMap5 = new HashMap();
                                HashMap hashMap6 = new HashMap();
                                HashMap hashMap7 = new HashMap();
                                dwcm a3 = dwciVar3.a();
                                try {
                                    dwcq dwcqVar2 = new dwcq(a3);
                                    Optional a4 = dwcqVar2.a();
                                    while (a4.isPresent()) {
                                        try {
                                            ?? r15 = a4.get();
                                            if (r15.b()) {
                                                try {
                                                    if (r15.a() == b2) {
                                                        dwdd dwddVar = (dwdd) r15;
                                                        b = b2;
                                                        hashMap = hashMap6;
                                                        hashMap4.put(Long.valueOf(dwddVar.a), dwddVar.b);
                                                    } else {
                                                        b = b2;
                                                        hashMap = hashMap6;
                                                    }
                                                    if (r15.a() == 2) {
                                                        dwda dwdaVar = (dwda) r15;
                                                        hashMap5.put(Long.valueOf(dwdaVar.a), Long.valueOf(dwdaVar.b));
                                                    }
                                                } catch (Throwable th4) {
                                                    th2 = th4;
                                                    dwciVar = dwciVar3;
                                                    dwcmVar = a3;
                                                    try {
                                                        dwcmVar.close();
                                                        throw th2;
                                                    } catch (Throwable th5) {
                                                        th2.addSuppressed(th5);
                                                        throw th2;
                                                    }
                                                }
                                            } else {
                                                b = b2;
                                                hashMap = hashMap6;
                                                if (r15.a() == 32) {
                                                    dwct dwctVar = (dwct) r15;
                                                    Long valueOf = Long.valueOf(dwctVar.a);
                                                    hashMap6 = hashMap;
                                                    hashMap6.put(valueOf, Long.valueOf(dwctVar.b));
                                                    dwcmVar = a3;
                                                    dwcqVar = dwcqVar2;
                                                    try {
                                                        hashMap7.put(valueOf, Long.valueOf(dwctVar.c));
                                                        a4 = dwcqVar.a();
                                                        a3 = dwcmVar;
                                                        dwcqVar2 = dwcqVar;
                                                        b2 = b;
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        th2 = th;
                                                        dwciVar = dwciVar3;
                                                        dwcmVar.close();
                                                        throw th2;
                                                    }
                                                }
                                            }
                                            dwcmVar = a3;
                                            dwcqVar = dwcqVar2;
                                            hashMap6 = hashMap;
                                            a4 = dwcqVar.a();
                                            a3 = dwcmVar;
                                            dwcqVar2 = dwcqVar;
                                            b2 = b;
                                        } catch (Throwable th7) {
                                            th = th7;
                                            dwcmVar = a3;
                                        }
                                    }
                                    a3.close();
                                    ((ejhf) asotVar3.h()).x("Analyze the heap dump.");
                                    dwcm a5 = dwciVar3.a();
                                    try {
                                        dwcq dwcqVar3 = new dwcq(a5);
                                        Optional a6 = dwcqVar3.a();
                                        while (a6.isPresent()) {
                                            try {
                                                ?? r13 = a6.get();
                                                if (!r13.b()) {
                                                    if (r13.a() == 33) {
                                                        try {
                                                            Long valueOf2 = Long.valueOf(((dwcz) r13).a);
                                                            hashMap3.put(valueOf2, Long.valueOf(((Long) Map.EL.getOrDefault(hashMap3, valueOf2, 0L)).longValue() + 1));
                                                            hashMap2.put(valueOf2, Long.valueOf(((Long) Map.EL.getOrDefault(hashMap2, valueOf2, (Long) Map.EL.getOrDefault(hashMap7, valueOf2, 0L))).longValue() + ((Long) Map.EL.getOrDefault(hashMap6, valueOf2, 0L)).longValue()));
                                                        } catch (Throwable th8) {
                                                            th3 = th8;
                                                            dwciVar = dwciVar3;
                                                            dwcmVar2 = a5;
                                                            try {
                                                                dwcmVar2.close();
                                                                throw th3;
                                                            } catch (Throwable th9) {
                                                                th3.addSuppressed(th9);
                                                                throw th3;
                                                            }
                                                        }
                                                    } else if (r13.a() == 34) {
                                                        dwdb dwdbVar = (dwdb) r13;
                                                        Long valueOf3 = Long.valueOf(dwdbVar.a);
                                                        hashMap3.put(valueOf3, Long.valueOf(((Long) Map.EL.getOrDefault(hashMap3, valueOf3, 0L)).longValue() + 1));
                                                        dwciVar2 = dwciVar3;
                                                        dwcmVar2 = a5;
                                                        try {
                                                            hashMap2.put(valueOf3, Long.valueOf(((Long) Map.EL.getOrDefault(hashMap2, valueOf3, (Long) Map.EL.getOrDefault(hashMap7, valueOf3, 0L))).longValue() + dwdbVar.b + ((Long) Map.EL.getOrDefault(hashMap6, valueOf3, 0L)).longValue()));
                                                            a6 = dwcqVar3.a();
                                                            dwciVar3 = dwciVar2;
                                                            a5 = dwcmVar2;
                                                        } catch (Throwable th10) {
                                                            th = th10;
                                                            th3 = th;
                                                            dwciVar = dwciVar2;
                                                            dwcmVar2.close();
                                                            throw th3;
                                                        }
                                                    }
                                                }
                                                dwciVar2 = dwciVar3;
                                                dwcmVar2 = a5;
                                                a6 = dwcqVar3.a();
                                                dwciVar3 = dwciVar2;
                                                a5 = dwcmVar2;
                                            } catch (Throwable th11) {
                                                th = th11;
                                                dwciVar2 = dwciVar3;
                                                dwcmVar2 = a5;
                                            }
                                        }
                                        dwci dwciVar4 = dwciVar3;
                                        try {
                                            a5.close();
                                            fecj v2 = emzg.a.v();
                                            ArrayList arrayList = new ArrayList(hashMap2.keySet());
                                            Collections.shuffle(arrayList);
                                            int i = 0;
                                            while (i < fmwu.a.a().b()) {
                                                Long l = (Long) arrayList.get(i);
                                                String str3 = (String) hashMap4.get(hashMap5.get(l));
                                                arwm.t(str3, "Class name must be non null.");
                                                fecj v3 = emzf.a.v();
                                                if (!v3.b.L()) {
                                                    try {
                                                        v3.U();
                                                    } catch (Throwable th12) {
                                                        th = th12;
                                                        dwciVar = dwciVar4;
                                                        try {
                                                            dwciVar.close();
                                                            throw th;
                                                        } catch (Throwable th13) {
                                                            th.addSuppressed(th13);
                                                            throw th;
                                                        }
                                                    }
                                                }
                                                emzf emzfVar = (emzf) v3.b;
                                                str3.getClass();
                                                dwci dwciVar5 = dwciVar4;
                                                emzfVar.b |= 1;
                                                emzfVar.c = str3;
                                                asot asotVar4 = asotVar3;
                                                HashMap hashMap8 = hashMap4;
                                                long longValue = ((Long) Map.EL.getOrDefault(hashMap3, l, 0L)).longValue();
                                                if (!v3.b.L()) {
                                                    v3.U();
                                                }
                                                emzf emzfVar2 = (emzf) v3.b;
                                                HashMap hashMap9 = hashMap3;
                                                emzfVar2.b |= 2;
                                                emzfVar2.d = longValue;
                                                long longValue2 = ((Long) Map.EL.getOrDefault(hashMap2, l, 0L)).longValue();
                                                if (!v3.b.L()) {
                                                    v3.U();
                                                }
                                                emzf emzfVar3 = (emzf) v3.b;
                                                emzfVar3.b |= 4;
                                                emzfVar3.e = longValue2;
                                                long longValue3 = ((Long) Map.EL.getOrDefault(hashMap7, l, 0L)).longValue();
                                                if (!v3.b.L()) {
                                                    v3.U();
                                                }
                                                emzf emzfVar4 = (emzf) v3.b;
                                                emzfVar4.b |= 8;
                                                emzfVar4.f = longValue3;
                                                emzf emzfVar5 = (emzf) v3.Q();
                                                if (!v2.b.L()) {
                                                    v2.U();
                                                }
                                                emzg emzgVar = (emzg) v2.b;
                                                emzfVar5.getClass();
                                                fedh fedhVar = emzgVar.d;
                                                if (!fedhVar.c()) {
                                                    emzgVar.d = fecp.E(fedhVar);
                                                }
                                                emzgVar.d.add(emzfVar5);
                                                i++;
                                                asotVar3 = asotVar4;
                                                dwciVar4 = dwciVar5;
                                                hashMap4 = hashMap8;
                                                hashMap3 = hashMap9;
                                            }
                                            dwci dwciVar6 = dwciVar4;
                                            asot asotVar5 = asotVar3;
                                            long uptimeMillis = SystemClock.uptimeMillis() - asqj.c();
                                            asrp a7 = bxfh.a(asqj.d());
                                            if (!v2.b.L()) {
                                                v2.U();
                                            }
                                            emzg emzgVar2 = (emzg) v2.b;
                                            emzgVar2.c = a7.a();
                                            emzgVar2.b |= 1;
                                            if (!v2.b.L()) {
                                                v2.U();
                                            }
                                            emzg emzgVar3 = (emzg) v2.b;
                                            emzgVar3.b |= 2;
                                            emzgVar3.e = uptimeMillis;
                                            emzg emzgVar4 = (emzg) v2.Q();
                                            if (emzgVar4 == null) {
                                                ((ejhf) asotVar5.j()).x("Heap dump proto is null. Nothing to log.");
                                            } else {
                                                emzw emzwVar = (emzw) emzx.a.v();
                                                if (!emzwVar.b.L()) {
                                                    emzwVar.U();
                                                }
                                                emzx emzxVar = (emzx) emzwVar.b;
                                                fedh fedhVar2 = emzxVar.aq;
                                                if (!fedhVar2.c()) {
                                                    emzxVar.aq = fecp.E(fedhVar2);
                                                }
                                                emzxVar.aq.add(emzgVar4);
                                                v.f((emzx) emzwVar.Q());
                                            }
                                            dwciVar6.close();
                                        } catch (Throwable th14) {
                                            th = th14;
                                            dwciVar = dwciVar4;
                                            th = th;
                                            dwciVar.close();
                                            throw th;
                                        }
                                    } catch (Throwable th15) {
                                        dwciVar = dwciVar3;
                                        dwcmVar2 = a5;
                                        th3 = th15;
                                    }
                                } catch (Throwable th16) {
                                    dwciVar = dwciVar3;
                                    dwcmVar = a3;
                                    th2 = th16;
                                }
                            } catch (Throwable th17) {
                                th = th17;
                                dwciVar = dwciVar3;
                            }
                        } catch (Throwable th18) {
                            th = th18;
                            th = th;
                            dwciVar.close();
                            throw th;
                        }
                    } catch (Exception e) {
                        throw new IOException("Failed to run heap dump task.", e);
                    }
                } catch (IOException e2) {
                    ((ejhf) ((ejhf) ((ejhf) HeapDumpBoundService.a.j()).s(e2)).ah(3180)).B("%s: Failed to dump Java heap", heapDumpBoundService.b);
                }
            }
        }, Math.max(0L, fmwu.a.a().c()), TimeUnit.SECONDS);
    }

    public abstract boolean e();

    public HeapDumpBoundService(String str, ScheduledExecutorService scheduledExecutorService, arso arsoVar) {
        this.d = scheduledExecutorService;
        this.b = str;
    }
}
