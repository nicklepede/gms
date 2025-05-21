package com.google.android.gms.location.fused.manager;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.libs.identity.ClientIdentity;
import defpackage.asot;
import defpackage.bzmw;
import defpackage.bzmz;
import defpackage.bzpx;
import defpackage.bzsc;
import defpackage.bzsp;
import defpackage.eiig;
import defpackage.ejhf;
import java.util.NoSuchElementException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class FusedLocationManager$LocationBinderRegistration extends FusedLocationManager$LocationRegistration implements IBinder.DeathRecipient {
    public FusedLocationManager$LocationBinderRegistration(bzsc bzscVar, bzmz bzmzVar, ClientIdentity clientIdentity, bzsp bzspVar, bzpx bzpxVar) {
        super(bzscVar, bzmzVar, clientIdentity, bzspVar, bzpxVar);
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        try {
            asot asotVar = bzmw.a;
            l();
        } catch (RuntimeException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.bwrm
    public final void d(Exception exc) {
        if (!(exc instanceof RemoteException)) {
            super.d(exc);
        } else {
            ((ejhf) ((ejhf) ((ejhf) bzmw.a.j()).s(exc)).ah(5549)).B("registration %s transport failure", this.l);
            l();
        }
    }

    @Override // com.google.android.gms.location.fused.manager.FusedLocationManager$LocationRegistration, com.google.android.gms.location.fused.manager.FusedLocationManager$Registration, defpackage.bwrx, defpackage.bwrm
    protected final void f() {
        try {
            ((IBinder) i()).unlinkToDeath(this, 0);
        } catch (NoSuchElementException e) {
            ((ejhf) ((ejhf) ((ejhf) bzmw.a.j()).s(e)).ah((char) 5550)).x("failed to unregister binder death listener");
        }
        super.f();
    }

    @Override // com.google.android.gms.location.fused.manager.FusedLocationManager$Registration, defpackage.bwrx
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
