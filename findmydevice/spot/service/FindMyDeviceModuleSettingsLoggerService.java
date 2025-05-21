package com.google.android.gms.findmydevice.spot.service;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.asej;
import defpackage.asot;
import defpackage.bebo;
import defpackage.bebp;
import defpackage.bfdn;
import defpackage.bfdo;
import defpackage.byln;
import defpackage.dwvc;
import defpackage.dwwv;
import defpackage.egnc;
import defpackage.ejhf;
import defpackage.enqb;
import defpackage.ensj;
import defpackage.enss;
import defpackage.ensw;
import defpackage.fobb;
import j$.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class FindMyDeviceModuleSettingsLoggerService extends GmsTaskBoundService {
    private static final asot a = asot.b("FMDSettingLoggerService", asej.FIND_MY_DEVICE_SPOT);
    private final bfdo b;

    public FindMyDeviceModuleSettingsLoggerService() {
        this(bebo.a());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        if (!fobb.e()) {
            return 2;
        }
        ((ejhf) ((ejhf) a.h()).ah((char) 4473)).x("Starting periodic FMD settings log.");
        final bfdo bfdoVar = this.b;
        if (fobb.e()) {
            final dwwv dwwvVar = bfdoVar.d;
            Objects.requireNonNull(dwwvVar);
            enqb enqbVar = new enqb() { // from class: bfdk
                @Override // defpackage.enqb
                public final enss a() {
                    return dwwv.this.f();
                }
            };
            ensw enswVar = bfdoVar.f;
            final enss i = egnc.i(enqbVar, enswVar);
            final dwvc dwvcVar = bfdoVar.e;
            Objects.requireNonNull(dwvcVar);
            final enss i2 = egnc.i(new enqb() { // from class: bfdl
                @Override // defpackage.enqb
                public final enss a() {
                    return dwvc.this.l();
                }
            }, enswVar);
            ensj.t(egnc.d(i, i2).a(new Callable() { // from class: bfdm
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int i3;
                    dwyw dwywVar = (dwyw) ensj.r(i);
                    fecj v = ffec.a.v();
                    boolean z = dwywVar.e;
                    if (!v.b.L()) {
                        v.U();
                    }
                    ffec ffecVar = (ffec) v.b;
                    ffecVar.b |= 1;
                    ffecVar.e = z;
                    int i4 = dwywVar.c;
                    if (i4 == 22) {
                        dwyl dwylVar = (dwyl) dwywVar.d;
                        if (dwylVar.e) {
                            if (dwylVar.c != 2 || (i3 = dwyg.b(((Integer) dwylVar.d).intValue())) == 0) {
                                i3 = 1;
                            }
                            if (!v.b.L()) {
                                v.U();
                            }
                            ffec ffecVar2 = (ffec) v.b;
                            ffecVar2.d = Integer.valueOf(i3 - 1);
                            ffecVar2.c = 2;
                        }
                    } else {
                        int a2 = dwyd.a((i4 == 31 ? (dwye) dwywVar.d : dwye.a).c);
                        if (a2 == 0) {
                            a2 = 1;
                        }
                        if (!v.b.L()) {
                            v.U();
                        }
                        ffec ffecVar3 = (ffec) v.b;
                        ffecVar3.d = Integer.valueOf(a2 - 1);
                        ffecVar3.c = 3;
                    }
                    euhg b = euhg.b(dwywVar.g);
                    if (b == null) {
                        b = euhg.FMDN_DISABLED_DEFAULT;
                    }
                    if (!v.b.L()) {
                        v.U();
                    }
                    ffec ffecVar4 = (ffec) v.b;
                    ffecVar4.g = b.a();
                    ffecVar4.b |= 4;
                    if ((dwywVar.b & 16) != 0) {
                        fefi fefiVar = dwywVar.i;
                        if (fefiVar == null) {
                            fefiVar = fefi.a;
                        }
                        fefi a3 = bfdo.a(fefiVar);
                        if (!v.b.L()) {
                            v.U();
                        }
                        ffec ffecVar5 = (ffec) v.b;
                        a3.getClass();
                        ffecVar5.h = a3;
                        ffecVar5.b |= 8;
                    }
                    if ((dwywVar.b & 8) != 0) {
                        fefi fefiVar2 = dwywVar.h;
                        if (fefiVar2 == null) {
                            fefiVar2 = fefi.a;
                        }
                        fefi a4 = bfdo.a(fefiVar2);
                        if (!v.b.L()) {
                            v.U();
                        }
                        ffec ffecVar6 = (ffec) v.b;
                        a4.getClass();
                        ffecVar6.i = a4;
                        ffecVar6.b |= 16;
                    }
                    boolean z2 = (dwywVar.b & 32) != 0;
                    if (!v.b.L()) {
                        v.U();
                    }
                    ffec ffecVar7 = (ffec) v.b;
                    ffecVar7.b |= 32;
                    ffecVar7.j = z2;
                    if ((dwywVar.b & 64) != 0) {
                        fefi fefiVar3 = dwywVar.k;
                        if (fefiVar3 == null) {
                            fefiVar3 = fefi.a;
                        }
                        fefi a5 = bfdo.a(fefiVar3);
                        if (!v.b.L()) {
                            v.U();
                        }
                        ffec ffecVar8 = (ffec) v.b;
                        a5.getClass();
                        ffecVar8.k = a5;
                        ffecVar8.b |= 64;
                    }
                    dwxy b2 = dwxy.b(dwywVar.r);
                    if (b2 == null) {
                        b2 = dwxy.DEFAULT_FMD_DISABLED;
                    }
                    if (!v.b.L()) {
                        v.U();
                    }
                    ffec ffecVar9 = (ffec) v.b;
                    ffecVar9.l = b2.aa;
                    ffecVar9.b |= 128;
                    dwxh dwxhVar = dwywVar.t;
                    if (dwxhVar == null) {
                        dwxhVar = dwxh.a;
                    }
                    if ((dwxhVar.b & 1) != 0) {
                        fecj v2 = ffeb.a.v();
                        dwxh dwxhVar2 = dwywVar.t;
                        if (dwxhVar2 == null) {
                            dwxhVar2 = dwxh.a;
                        }
                        fefi fefiVar4 = dwxhVar2.c;
                        if (fefiVar4 == null) {
                            fefiVar4 = fefi.a;
                        }
                        fefi a6 = bfdo.a(fefiVar4);
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        fecp fecpVar = v2.b;
                        ffeb ffebVar = (ffeb) fecpVar;
                        a6.getClass();
                        ffebVar.c = a6;
                        ffebVar.b |= 1;
                        dwxh dwxhVar3 = dwywVar.t;
                        if (dwxhVar3 == null) {
                            dwxhVar3 = dwxh.a;
                        }
                        boolean z3 = dwxhVar3.d;
                        if (!fecpVar.L()) {
                            v2.U();
                        }
                        ffeb ffebVar2 = (ffeb) v2.b;
                        ffebVar2.b |= 2;
                        ffebVar2.d = z3;
                        if (!v.b.L()) {
                            v.U();
                        }
                        ffec ffecVar10 = (ffec) v.b;
                        ffeb ffebVar3 = (ffeb) v2.Q();
                        ffebVar3.getClass();
                        ffecVar10.m = ffebVar3;
                        ffecVar10.b |= 256;
                    }
                    if ((dwywVar.b & 2048) != 0) {
                        fefi fefiVar5 = dwywVar.s;
                        if (fefiVar5 == null) {
                            fefiVar5 = fefi.a;
                        }
                        fefi a7 = bfdo.a(fefiVar5);
                        if (!v.b.L()) {
                            v.U();
                        }
                        ffec ffecVar11 = (ffec) v.b;
                        a7.getClass();
                        ffecVar11.n = a7;
                        ffecVar11.b |= 512;
                    }
                    boolean a8 = bfiy.a(bfdo.this.b);
                    if (!v.b.L()) {
                        v.U();
                    }
                    ffec ffecVar12 = (ffec) v.b;
                    ffecVar12.b = 2 | ffecVar12.b;
                    ffecVar12.f = a8;
                    int size = dwywVar.l.size();
                    if (!v.b.L()) {
                        v.U();
                    }
                    enss enssVar = i2;
                    ffec ffecVar13 = (ffec) v.b;
                    ffecVar13.b |= 1024;
                    ffecVar13.o = size;
                    int intValue = ((Integer) ensj.r(enssVar)).intValue();
                    if (!v.b.L()) {
                        v.U();
                    }
                    ffec ffecVar14 = (ffec) v.b;
                    ffecVar14.b |= 2048;
                    ffecVar14.p = intValue;
                    if ((dwywVar.b & 8192) != 0) {
                        dwyv dwyvVar = dwywVar.u;
                        if (dwyvVar == null) {
                            dwyvVar = dwyv.a;
                        }
                        int a9 = dwyt.a(dwyvVar.d);
                        int i5 = a9 != 0 ? a9 : 1;
                        if (!v.b.L()) {
                            v.U();
                        }
                        ffec ffecVar15 = (ffec) v.b;
                        ffecVar15.q = i5 - 1;
                        ffecVar15.b |= 4096;
                        int size2 = dwyvVar.e.size();
                        if (!v.b.L()) {
                            v.U();
                        }
                        fecp fecpVar2 = v.b;
                        ffec ffecVar16 = (ffec) fecpVar2;
                        ffecVar16.b |= 8192;
                        ffecVar16.r = size2;
                        if ((dwyvVar.b & 4) != 0) {
                            int i6 = dwyvVar.f;
                            if (!fecpVar2.L()) {
                                v.U();
                            }
                            ffec ffecVar17 = (ffec) v.b;
                            ffecVar17.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                            ffecVar17.s = i6;
                        }
                        int size3 = dwyvVar.g.size();
                        if (!v.b.L()) {
                            v.U();
                        }
                        fecp fecpVar3 = v.b;
                        ffec ffecVar18 = (ffec) fecpVar3;
                        ffecVar18.b |= 32768;
                        ffecVar18.t = size3;
                        if ((dwyvVar.b & 8) != 0) {
                            String str = dwyvVar.i;
                            if (!fecpVar3.L()) {
                                v.U();
                            }
                            ffec ffecVar19 = (ffec) v.b;
                            str.getClass();
                            ffecVar19.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                            ffecVar19.u = str;
                        }
                        if ((dwyvVar.b & 16) != 0) {
                            boolean z4 = dwyvVar.j;
                            if (!v.b.L()) {
                                v.U();
                            }
                            ffec ffecVar20 = (ffec) v.b;
                            ffecVar20.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                            ffecVar20.v = z4;
                        }
                    }
                    return (ffec) v.Q();
                }
            }, enswVar), new bfdn(bfdoVar), enswVar);
        }
        return 0;
    }

    public FindMyDeviceModuleSettingsLoggerService(bebp bebpVar) {
        this.b = bebpVar.y();
    }
}
