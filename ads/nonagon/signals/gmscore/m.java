package com.google.android.gms.ads.nonagon.signals.gmscore;

import com.google.android.gms.appset.AppSetIdRequestParams;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import defpackage.aqxe;
import defpackage.arco;
import defpackage.arcy;
import defpackage.dfaq;
import defpackage.dfbl;
import defpackage.doci;
import defpackage.eiho;
import defpackage.enox;
import defpackage.enps;
import defpackage.enqc;
import defpackage.ensj;
import defpackage.enss;
import defpackage.ensv;
import defpackage.ugm;
import defpackage.ugp;
import defpackage.uih;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class m implements com.google.android.gms.ads.nonagon.signals.e {
    public final com.google.android.gms.ads.internal.state.e a;
    private final String b;
    private final ScheduledExecutorService c;
    private final ensv d;
    private final com.google.android.gms.ads.appset.a e;

    public m(String str, com.google.android.gms.ads.appset.a aVar, com.google.android.gms.ads.internal.state.e eVar, ScheduledExecutorService scheduledExecutorService, ensv ensvVar) {
        this.b = str;
        this.e = aVar;
        this.a = eVar;
        this.c = scheduledExecutorService;
        this.d = ensvVar;
    }

    @Override // com.google.android.gms.ads.nonagon.signals.e
    public final int a() {
        return com.google.android.gms.ads.nonagon.signals.d.a(44);
    }

    @Override // com.google.android.gms.ads.nonagon.signals.e
    public final enss b() {
        dfaq c;
        if (!((Boolean) com.google.android.gms.ads.internal.config.p.Y.g()).booleanValue() || !((Boolean) com.google.android.gms.ads.internal.config.p.Z.g()).booleanValue()) {
            return ensj.i(new n(null, -1));
        }
        com.google.android.gms.ads.appset.a aVar = this.e;
        final String str = this.b;
        uih uihVar = aVar.a;
        if (uihVar.b.m(uihVar.a) == 0) {
            arcy arcyVar = new arcy();
            arcyVar.c = new Feature[]{ugp.a};
            arcyVar.a = new arco() { // from class: uif
                @Override // defpackage.arco
                public final void d(Object obj, Object obj2) {
                    int i = uih.c;
                    ((uie) ((uhy) obj).H()).a(new AppSetIdRequestParams(null, str), new uia((dfau) obj2));
                }
            };
            arcyVar.b = false;
            arcyVar.d = 27601;
            c = uihVar.iO(arcyVar.a());
        } else {
            c = dfbl.c(new aqxe(new Status(17)));
        }
        enss b = doci.b(c);
        enqc enqcVar = new enqc() { // from class: com.google.android.gms.ads.nonagon.signals.gmscore.k
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                ugm ugmVar = (ugm) obj;
                return ugmVar == null ? ensj.i(new n(null, -1)) : ensj.i(new n(ugmVar.a, ugmVar.b));
            }
        };
        ensv ensvVar = this.d;
        enss g = enps.g(b, enqcVar, ensvVar);
        if (((Boolean) com.google.android.gms.ads.internal.flag.c.a.d()).booleanValue()) {
            g = ensj.q(g, ((Long) com.google.android.gms.ads.internal.flag.c.b.d()).longValue(), TimeUnit.MILLISECONDS, this.c);
        }
        return enox.f(g, Exception.class, new eiho() { // from class: com.google.android.gms.ads.nonagon.signals.gmscore.l
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                m.this.a.d((Exception) obj, "AppSetIdInfoGmscoreSignal");
                return new n(null, -1);
            }
        }, ensvVar);
    }
}
