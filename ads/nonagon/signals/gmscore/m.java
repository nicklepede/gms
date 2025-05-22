package com.google.android.gms.ads.nonagon.signals.gmscore;

import com.google.android.gms.appset.AppSetIdRequestParams;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import defpackage.aszt;
import defpackage.atfd;
import defpackage.atfn;
import defpackage.dhlw;
import defpackage.dhmr;
import defpackage.dqmr;
import defpackage.ekut;
import defpackage.eqcq;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.eqgo;
import defpackage.wcl;
import defpackage.wco;
import defpackage.weg;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class m implements com.google.android.gms.ads.nonagon.signals.e {
    public final com.google.android.gms.ads.internal.state.e a;
    private final String b;
    private final ScheduledExecutorService c;
    private final eqgo d;
    private final com.google.android.gms.ads.appset.a e;

    public m(String str, com.google.android.gms.ads.appset.a aVar, com.google.android.gms.ads.internal.state.e eVar, ScheduledExecutorService scheduledExecutorService, eqgo eqgoVar) {
        this.b = str;
        this.e = aVar;
        this.a = eVar;
        this.c = scheduledExecutorService;
        this.d = eqgoVar;
    }

    @Override // com.google.android.gms.ads.nonagon.signals.e
    public final int a() {
        return com.google.android.gms.ads.nonagon.signals.d.a(44);
    }

    @Override // com.google.android.gms.ads.nonagon.signals.e
    public final eqgl b() {
        dhlw c;
        if (!((Boolean) com.google.android.gms.ads.internal.config.p.Y.g()).booleanValue() || !((Boolean) com.google.android.gms.ads.internal.config.p.Z.g()).booleanValue()) {
            return eqgc.i(new n(null, -1));
        }
        com.google.android.gms.ads.appset.a aVar = this.e;
        final String str = this.b;
        weg wegVar = aVar.a;
        if (wegVar.b.m(wegVar.a) == 0) {
            atfn atfnVar = new atfn();
            atfnVar.c = new Feature[]{wco.a};
            atfnVar.a = new atfd() { // from class: wee
                @Override // defpackage.atfd
                public final void d(Object obj, Object obj2) {
                    int i = weg.c;
                    ((wed) ((wdx) obj).H()).a(new AppSetIdRequestParams(null, str), new wdz((dhma) obj2));
                }
            };
            atfnVar.b = false;
            atfnVar.d = 27601;
            c = wegVar.jd(atfnVar.a());
        } else {
            c = dhmr.c(new aszt(new Status(17)));
        }
        eqgl b = dqmr.b(c);
        eqdv eqdvVar = new eqdv() { // from class: com.google.android.gms.ads.nonagon.signals.gmscore.k
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                wcl wclVar = (wcl) obj;
                return wclVar == null ? eqgc.i(new n(null, -1)) : eqgc.i(new n(wclVar.a, wclVar.b));
            }
        };
        eqgo eqgoVar = this.d;
        eqgl g = eqdl.g(b, eqdvVar, eqgoVar);
        if (((Boolean) com.google.android.gms.ads.internal.flag.c.a.d()).booleanValue()) {
            g = eqgc.q(g, ((Long) com.google.android.gms.ads.internal.flag.c.b.d()).longValue(), TimeUnit.MILLISECONDS, this.c);
        }
        return eqcq.f(g, Exception.class, new ekut() { // from class: com.google.android.gms.ads.nonagon.signals.gmscore.l
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                m.this.a.d((Exception) obj, "AppSetIdInfoGmscoreSignal");
                return new n(null, -1);
            }
        }, eqgoVar);
    }
}
