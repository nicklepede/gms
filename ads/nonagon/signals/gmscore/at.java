package com.google.android.gms.ads.nonagon.signals.gmscore;

import defpackage.eiho;
import defpackage.enox;
import defpackage.enps;
import defpackage.ensj;
import defpackage.enss;
import defpackage.ensv;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class at implements com.google.android.gms.ads.nonagon.signals.e {
    public final com.google.android.gms.ads.internal.state.e a;
    private final boolean b;
    private final boolean c;
    private final ScheduledExecutorService d;
    private final ensv e;
    private final String f;
    private final int g;
    private final int h;
    private final com.google.android.gms.ads.social.t i;

    public at(com.google.android.gms.ads.internal.state.e eVar, boolean z, boolean z2, com.google.android.gms.ads.social.t tVar, ensv ensvVar, String str, ScheduledExecutorService scheduledExecutorService, int i, int i2) {
        this.a = eVar;
        this.b = z;
        this.c = z2;
        this.i = tVar;
        this.e = ensvVar;
        this.f = str;
        this.d = scheduledExecutorService;
        this.g = i;
        this.h = i2;
    }

    @Override // com.google.android.gms.ads.nonagon.signals.e
    public final int a() {
        return com.google.android.gms.ads.nonagon.signals.d.a(51);
    }

    @Override // com.google.android.gms.ads.nonagon.signals.e
    public final enss b() {
        if (((Boolean) com.google.android.gms.ads.internal.config.p.aT.g()).booleanValue() && this.c) {
            return ensj.i(new au(null));
        }
        if (this.h == 2) {
            return ensj.i(new au(null));
        }
        if (!(((Boolean) com.google.android.gms.ads.internal.config.p.aU.g()).booleanValue() ? Arrays.asList(((String) com.google.android.gms.ads.internal.config.p.aV.g()).split(",")).contains(String.valueOf(this.g)) : this.b)) {
            return ensj.i(new au(null));
        }
        enss b = this.i.b(this.f);
        eiho eihoVar = new eiho() { // from class: com.google.android.gms.ads.nonagon.signals.gmscore.ar
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                return new au((String) obj);
            }
        };
        ensv ensvVar = this.e;
        return enox.f(ensj.q(enps.f(b, eihoVar, ensvVar), ((Long) com.google.android.gms.ads.internal.flag.w.b.d()).longValue(), TimeUnit.MILLISECONDS, this.d), Exception.class, new eiho() { // from class: com.google.android.gms.ads.nonagon.signals.gmscore.as
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                at.this.a.d((Exception) obj, "TrustlessTokenSignal");
                return new au(null);
            }
        }, ensvVar);
    }
}
