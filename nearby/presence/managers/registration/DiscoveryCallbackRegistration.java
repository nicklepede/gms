package com.google.android.gms.nearby.presence.managers.registration;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.nearby.presence.DiscoveryRequest;
import defpackage.bwrd;
import defpackage.ckmb;
import defpackage.ckoh;
import defpackage.clex;
import defpackage.clfw;
import defpackage.dnlf;
import defpackage.eiig;
import defpackage.ejhf;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class DiscoveryCallbackRegistration extends DiscoveryRegistration implements IBinder.DeathRecipient {
    public DiscoveryCallbackRegistration(Context context, DiscoveryRequest discoveryRequest, ckoh ckohVar, clfw clfwVar, bwrd bwrdVar, Object obj, clex clexVar, Long l, Executor executor, dnlf dnlfVar) {
        super(context, discoveryRequest, ckohVar, clfwVar, bwrdVar, obj, clexVar, l, executor, dnlfVar);
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        synchronized (this.f) {
            l();
        }
    }

    @Override // defpackage.bwrm
    public final void d(Exception exc) {
        if (!(exc instanceof RemoteException)) {
            super.d(exc);
            return;
        }
        synchronized (this.f) {
            l();
        }
    }

    @Override // com.google.android.gms.nearby.presence.managers.registration.DiscoveryRegistration, defpackage.bwrx, defpackage.bwrm
    protected final void f() {
        eiig.p(i() instanceof IBinder);
        try {
            ((IBinder) i()).unlinkToDeath(this, 0);
        } catch (NoSuchElementException e) {
            ((ejhf) ((ejhf) ((ejhf) ckmb.a.j()).s(e)).ah((char) 7989)).x("failed to unregister binder death listener");
        }
        super.f();
    }

    @Override // com.google.android.gms.nearby.presence.managers.registration.DiscoveryRegistration, defpackage.bwrx
    protected final void j() {
        super.j();
        eiig.p(i() instanceof IBinder);
        try {
            ((IBinder) i()).linkToDeath(this, 0);
        } catch (RemoteException unused) {
            l();
        }
    }
}
