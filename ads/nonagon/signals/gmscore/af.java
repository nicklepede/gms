package com.google.android.gms.ads.nonagon.signals.gmscore;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.play.GmsCachingPlayStoreParentalControlProvider;
import defpackage.ekut;
import defpackage.eqdl;
import defpackage.eqgc;
import defpackage.eqgl;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class af implements com.google.android.gms.ads.nonagon.signals.e {
    final ScheduledExecutorService a;
    final Context b;
    final GmsCachingPlayStoreParentalControlProvider c;

    public af(GmsCachingPlayStoreParentalControlProvider gmsCachingPlayStoreParentalControlProvider, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.c = gmsCachingPlayStoreParentalControlProvider;
        this.a = scheduledExecutorService;
        this.b = context;
    }

    @Override // com.google.android.gms.ads.nonagon.signals.e
    public final int a() {
        return com.google.android.gms.ads.nonagon.signals.d.a(50);
    }

    @Override // com.google.android.gms.ads.nonagon.signals.e
    public final eqgl b() {
        return eqdl.f(eqgc.q(this.c.c(this.b), ((Long) com.google.android.gms.ads.internal.config.p.ag.g()).longValue(), TimeUnit.MILLISECONDS, this.a), new ekut() { // from class: com.google.android.gms.ads.nonagon.signals.gmscore.ae
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                return new ag((Bundle) obj);
            }
        }, com.google.android.gms.ads.internal.util.future.e.a);
    }
}
