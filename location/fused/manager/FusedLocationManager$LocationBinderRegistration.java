package com.google.android.gms.location.fused.manager;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.libs.identity.ClientIdentity;
import defpackage.ausn;
import defpackage.cbvn;
import defpackage.cbvq;
import defpackage.cbyo;
import defpackage.ccat;
import defpackage.ccbg;
import defpackage.ekvl;
import defpackage.eluo;
import java.util.NoSuchElementException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class FusedLocationManager$LocationBinderRegistration extends FusedLocationManager$LocationRegistration implements IBinder.DeathRecipient {
    public FusedLocationManager$LocationBinderRegistration(ccat ccatVar, cbvq cbvqVar, ClientIdentity clientIdentity, ccbg ccbgVar, cbyo cbyoVar) {
        super(ccatVar, cbvqVar, clientIdentity, ccbgVar, cbyoVar);
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        try {
            ausn ausnVar = cbvn.a;
            l();
        } catch (RuntimeException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.bzac
    public final void d(Exception exc) {
        if (!(exc instanceof RemoteException)) {
            super.d(exc);
        } else {
            ((eluo) ((eluo) ((eluo) cbvn.a.j()).s(exc)).ai(5563)).B("registration %s transport failure", this.l);
            l();
        }
    }

    @Override // com.google.android.gms.location.fused.manager.FusedLocationManager$LocationRegistration, com.google.android.gms.location.fused.manager.FusedLocationManager$Registration, defpackage.bzan, defpackage.bzac
    protected final void f() {
        try {
            ((IBinder) i()).unlinkToDeath(this, 0);
        } catch (NoSuchElementException e) {
            ((eluo) ((eluo) ((eluo) cbvn.a.j()).s(e)).ai((char) 5564)).x("failed to unregister binder death listener");
        }
        super.f();
    }

    @Override // com.google.android.gms.location.fused.manager.FusedLocationManager$Registration, defpackage.bzan
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
