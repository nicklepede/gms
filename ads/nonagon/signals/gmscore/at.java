package com.google.android.gms.ads.nonagon.signals.gmscore;

import defpackage.ekut;
import defpackage.eqcq;
import defpackage.eqdl;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.eqgo;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class at implements com.google.android.gms.ads.nonagon.signals.e {
    public final com.google.android.gms.ads.internal.state.e a;
    private final boolean b;
    private final boolean c;
    private final ScheduledExecutorService d;
    private final eqgo e;
    private final String f;
    private final int g;
    private final int h;
    private final com.google.android.gms.ads.social.t i;

    public at(com.google.android.gms.ads.internal.state.e eVar, boolean z, boolean z2, com.google.android.gms.ads.social.t tVar, eqgo eqgoVar, String str, ScheduledExecutorService scheduledExecutorService, int i, int i2) {
        this.a = eVar;
        this.b = z;
        this.c = z2;
        this.i = tVar;
        this.e = eqgoVar;
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
    public final eqgl b() {
        if (((Boolean) com.google.android.gms.ads.internal.config.p.aU.g()).booleanValue() && this.c) {
            return eqgc.i(new au(null));
        }
        if (this.h == 2) {
            return eqgc.i(new au(null));
        }
        if (!(((Boolean) com.google.android.gms.ads.internal.config.p.aV.g()).booleanValue() ? Arrays.asList(((String) com.google.android.gms.ads.internal.config.p.aW.g()).split(",")).contains(String.valueOf(this.g)) : this.b)) {
            return eqgc.i(new au(null));
        }
        eqgl b = this.i.b(this.f);
        ekut ekutVar = new ekut() { // from class: com.google.android.gms.ads.nonagon.signals.gmscore.ar
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                return new au((String) obj);
            }
        };
        eqgo eqgoVar = this.e;
        return eqcq.f(eqgc.q(eqdl.f(b, ekutVar, eqgoVar), ((Long) com.google.android.gms.ads.internal.flag.w.b.d()).longValue(), TimeUnit.MILLISECONDS, this.d), Exception.class, new ekut() { // from class: com.google.android.gms.ads.nonagon.signals.gmscore.as
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                at.this.a.d((Exception) obj, "TrustlessTokenSignal");
                return new au(null);
            }
        }, eqgoVar);
    }
}
