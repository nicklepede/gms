package com.google.android.gms.nearby.presence.managers.registration;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.nearby.presence.DiscoveryRequest;
import defpackage.byzt;
import defpackage.cmug;
import defpackage.cmwm;
import defpackage.cnnc;
import defpackage.cnoe;
import defpackage.dpvo;
import defpackage.eluo;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class DiscoveryPendingIntentRegistration extends DiscoveryRegistration {
    public DiscoveryPendingIntentRegistration(Context context, DiscoveryRequest discoveryRequest, cmwm cmwmVar, cnoe cnoeVar, byzt byztVar, Object obj, cnnc cnncVar, Long l, Executor executor, dpvo dpvoVar) {
        super(context, discoveryRequest, cmwmVar, cnoeVar, byztVar, obj, cnncVar, l, executor, dpvoVar);
    }

    @Override // defpackage.bzac
    public final void d(Exception exc) {
        if (!(exc instanceof PendingIntent.CanceledException)) {
            super.d(exc);
            return;
        }
        ((eluo) ((eluo) ((eluo) cmug.a.j()).s(exc)).ai((char) 7939)).B("registration %s transport failure", o());
        synchronized (this.f) {
            l();
        }
    }
}
