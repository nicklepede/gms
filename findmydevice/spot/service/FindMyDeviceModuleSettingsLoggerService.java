package com.google.android.gms.findmydevice.spot.service;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bgda;
import defpackage.bgdb;
import defpackage.bhfd;
import defpackage.bhfe;
import defpackage.cauf;
import defpackage.dzhc;
import defpackage.dziv;
import defpackage.ejaf;
import defpackage.eluo;
import defpackage.eqdu;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.eqgp;
import defpackage.fqsv;
import j$.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class FindMyDeviceModuleSettingsLoggerService extends GmsTaskBoundService {
    private static final ausn a = ausn.b("FMDSettingLoggerService", auid.FIND_MY_DEVICE_SPOT);
    private final bhfe b;

    public FindMyDeviceModuleSettingsLoggerService() {
        this(bgda.a());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        if (!fqsv.e()) {
            return 2;
        }
        ((eluo) ((eluo) a.h()).ai((char) 4480)).x("Starting periodic FMD settings log.");
        final bhfe bhfeVar = this.b;
        if (fqsv.e()) {
            final dziv dzivVar = bhfeVar.d;
            Objects.requireNonNull(dzivVar);
            eqdu eqduVar = new eqdu() { // from class: bhfa
                @Override // defpackage.eqdu
                public final eqgl a() {
                    return dziv.this.f();
                }
            };
            eqgp eqgpVar = bhfeVar.f;
            final eqgl i = ejaf.i(eqduVar, eqgpVar);
            final dzhc dzhcVar = bhfeVar.e;
            Objects.requireNonNull(dzhcVar);
            final eqgl i2 = ejaf.i(new eqdu() { // from class: bhfb
                @Override // defpackage.eqdu
                public final eqgl a() {
                    return dzhc.this.l();
                }
            }, eqgpVar);
            eqgc.t(ejaf.d(i, i2).a(new Callable() { // from class: bhfc
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int i3;
                    dzkw dzkwVar = (dzkw) eqgc.r(i);
                    fgrc v = fhta.a.v();
                    boolean z = dzkwVar.e;
                    if (!v.b.L()) {
                        v.U();
                    }
                    fhta fhtaVar = (fhta) v.b;
                    fhtaVar.b |= 1;
                    fhtaVar.e = z;
                    int i4 = dzkwVar.c;
                    if (i4 == 22) {
                        dzkl dzklVar = (dzkl) dzkwVar.d;
                        if (dzklVar.e) {
                            if (dzklVar.c != 2 || (i3 = dzkg.a(((Integer) dzklVar.d).intValue())) == 0) {
                                i3 = 1;
                            }
                            if (!v.b.L()) {
                                v.U();
                            }
                            fhta fhtaVar2 = (fhta) v.b;
                            fhtaVar2.d = Integer.valueOf(i3 - 1);
                            fhtaVar2.c = 2;
                        }
                    } else {
                        int a2 = dzkd.a((i4 == 31 ? (dzke) dzkwVar.d : dzke.a).c);
                        if (a2 == 0) {
                            a2 = 1;
                        }
                        if (!v.b.L()) {
                            v.U();
                        }
                        fhta fhtaVar3 = (fhta) v.b;
                        fhtaVar3.d = Integer.valueOf(a2 - 1);
                        fhtaVar3.c = 3;
                    }
                    ewwz b = ewwz.b(dzkwVar.g);
                    if (b == null) {
                        b = ewwz.FMDN_DISABLED_DEFAULT;
                    }
                    if (!v.b.L()) {
                        v.U();
                    }
                    fhta fhtaVar4 = (fhta) v.b;
                    fhtaVar4.g = b.a();
                    fhtaVar4.b |= 4;
                    if ((dzkwVar.b & 16) != 0) {
                        fgub fgubVar = dzkwVar.i;
                        if (fgubVar == null) {
                            fgubVar = fgub.a;
                        }
                        fgub a3 = bhfe.a(fgubVar);
                        if (!v.b.L()) {
                            v.U();
                        }
                        fhta fhtaVar5 = (fhta) v.b;
                        a3.getClass();
                        fhtaVar5.h = a3;
                        fhtaVar5.b |= 8;
                    }
                    if ((dzkwVar.b & 8) != 0) {
                        fgub fgubVar2 = dzkwVar.h;
                        if (fgubVar2 == null) {
                            fgubVar2 = fgub.a;
                        }
                        fgub a4 = bhfe.a(fgubVar2);
                        if (!v.b.L()) {
                            v.U();
                        }
                        fhta fhtaVar6 = (fhta) v.b;
                        a4.getClass();
                        fhtaVar6.i = a4;
                        fhtaVar6.b |= 16;
                    }
                    boolean z2 = (dzkwVar.b & 32) != 0;
                    if (!v.b.L()) {
                        v.U();
                    }
                    fhta fhtaVar7 = (fhta) v.b;
                    fhtaVar7.b |= 32;
                    fhtaVar7.j = z2;
                    if ((dzkwVar.b & 64) != 0) {
                        fgub fgubVar3 = dzkwVar.k;
                        if (fgubVar3 == null) {
                            fgubVar3 = fgub.a;
                        }
                        fgub a5 = bhfe.a(fgubVar3);
                        if (!v.b.L()) {
                            v.U();
                        }
                        fhta fhtaVar8 = (fhta) v.b;
                        a5.getClass();
                        fhtaVar8.k = a5;
                        fhtaVar8.b |= 64;
                    }
                    dzjy b2 = dzjy.b(dzkwVar.r);
                    if (b2 == null) {
                        b2 = dzjy.DEFAULT_FMD_DISABLED;
                    }
                    if (!v.b.L()) {
                        v.U();
                    }
                    fhta fhtaVar9 = (fhta) v.b;
                    fhtaVar9.l = b2.aa;
                    fhtaVar9.b |= 128;
                    dzjh dzjhVar = dzkwVar.t;
                    if (dzjhVar == null) {
                        dzjhVar = dzjh.a;
                    }
                    if ((dzjhVar.b & 1) != 0) {
                        fgrc v2 = fhsz.a.v();
                        dzjh dzjhVar2 = dzkwVar.t;
                        if (dzjhVar2 == null) {
                            dzjhVar2 = dzjh.a;
                        }
                        fgub fgubVar4 = dzjhVar2.c;
                        if (fgubVar4 == null) {
                            fgubVar4 = fgub.a;
                        }
                        fgub a6 = bhfe.a(fgubVar4);
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        fgri fgriVar = v2.b;
                        fhsz fhszVar = (fhsz) fgriVar;
                        a6.getClass();
                        fhszVar.c = a6;
                        fhszVar.b |= 1;
                        dzjh dzjhVar3 = dzkwVar.t;
                        if (dzjhVar3 == null) {
                            dzjhVar3 = dzjh.a;
                        }
                        boolean z3 = dzjhVar3.d;
                        if (!fgriVar.L()) {
                            v2.U();
                        }
                        fhsz fhszVar2 = (fhsz) v2.b;
                        fhszVar2.b |= 2;
                        fhszVar2.d = z3;
                        if (!v.b.L()) {
                            v.U();
                        }
                        fhta fhtaVar10 = (fhta) v.b;
                        fhsz fhszVar3 = (fhsz) v2.Q();
                        fhszVar3.getClass();
                        fhtaVar10.m = fhszVar3;
                        fhtaVar10.b |= 256;
                    }
                    if ((dzkwVar.b & 2048) != 0) {
                        fgub fgubVar5 = dzkwVar.s;
                        if (fgubVar5 == null) {
                            fgubVar5 = fgub.a;
                        }
                        fgub a7 = bhfe.a(fgubVar5);
                        if (!v.b.L()) {
                            v.U();
                        }
                        fhta fhtaVar11 = (fhta) v.b;
                        a7.getClass();
                        fhtaVar11.n = a7;
                        fhtaVar11.b |= 512;
                    }
                    boolean a8 = bhko.a(bhfe.this.b);
                    if (!v.b.L()) {
                        v.U();
                    }
                    fhta fhtaVar12 = (fhta) v.b;
                    fhtaVar12.b = 2 | fhtaVar12.b;
                    fhtaVar12.f = a8;
                    int size = dzkwVar.l.size();
                    if (!v.b.L()) {
                        v.U();
                    }
                    eqgl eqglVar = i2;
                    fhta fhtaVar13 = (fhta) v.b;
                    fhtaVar13.b |= 1024;
                    fhtaVar13.o = size;
                    int intValue = ((Integer) eqgc.r(eqglVar)).intValue();
                    if (!v.b.L()) {
                        v.U();
                    }
                    fhta fhtaVar14 = (fhta) v.b;
                    fhtaVar14.b |= 2048;
                    fhtaVar14.p = intValue;
                    if ((dzkwVar.b & 8192) != 0) {
                        dzkv dzkvVar = dzkwVar.u;
                        if (dzkvVar == null) {
                            dzkvVar = dzkv.a;
                        }
                        int a9 = dzkt.a(dzkvVar.d);
                        int i5 = a9 != 0 ? a9 : 1;
                        if (!v.b.L()) {
                            v.U();
                        }
                        fhta fhtaVar15 = (fhta) v.b;
                        fhtaVar15.q = i5 - 1;
                        fhtaVar15.b |= 4096;
                        int size2 = dzkvVar.e.size();
                        if (!v.b.L()) {
                            v.U();
                        }
                        fgri fgriVar2 = v.b;
                        fhta fhtaVar16 = (fhta) fgriVar2;
                        fhtaVar16.b |= 8192;
                        fhtaVar16.r = size2;
                        if ((dzkvVar.b & 4) != 0) {
                            int i6 = dzkvVar.f;
                            if (!fgriVar2.L()) {
                                v.U();
                            }
                            fhta fhtaVar17 = (fhta) v.b;
                            fhtaVar17.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                            fhtaVar17.s = i6;
                        }
                        int size3 = dzkvVar.g.size();
                        if (!v.b.L()) {
                            v.U();
                        }
                        fgri fgriVar3 = v.b;
                        fhta fhtaVar18 = (fhta) fgriVar3;
                        fhtaVar18.b |= 32768;
                        fhtaVar18.t = size3;
                        if ((dzkvVar.b & 8) != 0) {
                            String str = dzkvVar.i;
                            if (!fgriVar3.L()) {
                                v.U();
                            }
                            fhta fhtaVar19 = (fhta) v.b;
                            str.getClass();
                            fhtaVar19.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                            fhtaVar19.u = str;
                        }
                        if ((dzkvVar.b & 16) != 0) {
                            boolean z4 = dzkvVar.j;
                            if (!v.b.L()) {
                                v.U();
                            }
                            fhta fhtaVar20 = (fhta) v.b;
                            fhtaVar20.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                            fhtaVar20.v = z4;
                        }
                    }
                    return (fhta) v.Q();
                }
            }, eqgpVar), new bhfd(bhfeVar), eqgpVar);
        }
        return 0;
    }

    public FindMyDeviceModuleSettingsLoggerService(bgdb bgdbVar) {
        this.b = bgdbVar.y();
    }
}
