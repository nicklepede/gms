package com.google.android.gms.nearby.presence.managers.registration;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.nearby.presence.DiscoveryRequest;
import defpackage.byzt;
import defpackage.cmug;
import defpackage.cmwm;
import defpackage.cnnc;
import defpackage.cnoc;
import defpackage.dpvo;
import defpackage.ekvl;
import defpackage.eluo;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class DiscoveryCallbackRegistration extends DiscoveryRegistration implements IBinder.DeathRecipient {
    public DiscoveryCallbackRegistration(Context context, DiscoveryRequest discoveryRequest, cmwm cmwmVar, cnoc cnocVar, byzt byztVar, Object obj, cnnc cnncVar, Long l, Executor executor, dpvo dpvoVar) {
        super(context, discoveryRequest, cmwmVar, cnocVar, byztVar, obj, cnncVar, l, executor, dpvoVar);
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        synchronized (this.f) {
            l();
        }
    }

    @Override // defpackage.bzac
    public final void d(Exception exc) {
        if (!(exc instanceof RemoteException)) {
            super.d(exc);
            return;
        }
        synchronized (this.f) {
            l();
        }
    }

    @Override // com.google.android.gms.nearby.presence.managers.registration.DiscoveryRegistration, defpackage.bzan, defpackage.bzac
    protected final void f() {
        ekvl.q(i() instanceof IBinder);
        try {
            ((IBinder) i()).unlinkToDeath(this, 0);
        } catch (NoSuchElementException e) {
            ((eluo) ((eluo) ((eluo) cmug.a.j()).s(e)).ai((char) 7938)).x("failed to unregister binder death listener");
        }
        super.f();
    }

    @Override // com.google.android.gms.nearby.presence.managers.registration.DiscoveryRegistration, defpackage.bzan
    protected final void j() {
        super.j();
        ekvl.q(i() instanceof IBinder);
        try {
            ((IBinder) i()).linkToDeath(this, 0);
        } catch (RemoteException unused) {
            l();
        }
    }
}
