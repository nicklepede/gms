package com.google.android.gms.nearby.presence.managers.registration;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.nearby.presence.DiscoveryRequest;
import defpackage.bwrd;
import defpackage.ckmb;
import defpackage.ckoh;
import defpackage.clex;
import defpackage.clfy;
import defpackage.dnlf;
import defpackage.ejhf;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class DiscoveryPendingIntentRegistration extends DiscoveryRegistration {
    public DiscoveryPendingIntentRegistration(Context context, DiscoveryRequest discoveryRequest, ckoh ckohVar, clfy clfyVar, bwrd bwrdVar, Object obj, clex clexVar, Long l, Executor executor, dnlf dnlfVar) {
        super(context, discoveryRequest, ckohVar, clfyVar, bwrdVar, obj, clexVar, l, executor, dnlfVar);
    }

    @Override // defpackage.bwrm
    public final void d(Exception exc) {
        if (!(exc instanceof PendingIntent.CanceledException)) {
            super.d(exc);
            return;
        }
        ((ejhf) ((ejhf) ((ejhf) ckmb.a.j()).s(exc)).ah((char) 7990)).B("registration %s transport failure", o());
        synchronized (this.f) {
            l();
        }
    }
}
