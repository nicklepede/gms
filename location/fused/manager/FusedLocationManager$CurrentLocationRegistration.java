package com.google.android.gms.location.fused.manager;

import android.location.Location;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.libs.identity.ClientIdentity;
import defpackage.asot;
import defpackage.bwrl;
import defpackage.bzmw;
import defpackage.bzmz;
import defpackage.bznb;
import defpackage.bzpv;
import defpackage.bzrw;
import defpackage.bzsc;
import defpackage.bzsy;
import defpackage.canl;
import defpackage.eiig;
import defpackage.ejhe;
import defpackage.ejhf;
import defpackage.erdc;
import defpackage.erdd;
import defpackage.fppi;
import j$.util.Objects;
import java.util.NoSuchElementException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class FusedLocationManager$CurrentLocationRegistration extends FusedLocationManager$Registration implements IBinder.DeathRecipient {
    public final bzpv f;
    public final /* synthetic */ bzsc g;
    private volatile long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FusedLocationManager$CurrentLocationRegistration(bzsc bzscVar, bzmz bzmzVar, ClientIdentity clientIdentity, bzsy bzsyVar, bzpv bzpvVar) {
        super(bzscVar, bzmzVar, clientIdentity, bzsyVar);
        this.g = bzscVar;
        this.h = -1L;
        this.f = bzpvVar;
    }

    @Override // com.google.android.gms.location.fused.manager.FusedLocationManager$Registration, defpackage.bwrm
    protected final void b() {
        super.b();
        Location E = this.g.E(t(), w().m, w().g, u());
        if (E != null) {
            ib(p(E, true));
        }
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

    @Override // com.google.android.gms.location.fused.manager.FusedLocationManager$Registration, defpackage.bwrm
    protected final void c() {
        super.c();
        if (g()) {
            q();
        }
    }

    @Override // defpackage.bwrm
    public final void d(Exception exc) {
        if (!(exc instanceof RemoteException)) {
            super.d(exc);
        } else {
            ((ejhf) ((ejhf) ((ejhf) bzmw.a.j()).s(exc)).ah(5545)).B("registration %s transport failure", this.l);
            l();
        }
    }

    @Override // com.google.android.gms.location.fused.manager.FusedLocationManager$Registration, defpackage.bwrx, defpackage.bwrm
    protected final void f() {
        try {
            ((IBinder) i()).unlinkToDeath(this, 0);
        } catch (NoSuchElementException e) {
            ((ejhf) ((ejhf) ((ejhf) bzmw.a.j()).s(e)).ah((char) 5547)).x("failed to unregister binder death listener");
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

    @Override // com.google.android.gms.location.fused.manager.FusedLocationManager$Registration
    public final bwrl o(bznb bznbVar, boolean z) {
        return p(bznbVar.c(), false);
    }

    final bwrl p(Location location, boolean z) {
        Location location2;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.o;
        Location location3 = null;
        if (elapsedRealtime >= 0) {
            if (elapsedRealtime >= 30000) {
                long elapsedRealtime2 = this.h < 0 ? this.h : SystemClock.elapsedRealtime() - this.h;
                ejhf ejhfVar = (ejhf) ((ejhf) ((ejhf) bzmw.a.i()).t(ejhe.FULL)).ah(5544);
                ClientIdentity clientIdentity = this.l;
                Long valueOf = Long.valueOf(elapsedRealtime);
                erdc erdcVar = erdc.NO_USER_DATA;
                ejhfVar.T("current location registration %s is late to expire by %sms, timeout age %s", clientIdentity, new erdd(erdcVar, valueOf), new erdd(erdcVar, Long.valueOf(elapsedRealtime2)));
            }
            location2 = null;
        } else {
            location2 = location;
        }
        if (location2 != null && (location2 = bzsc.O(location2, t(), w().g, u())) == null) {
            asot asotVar = bzmw.a;
            return null;
        }
        bzsc bzscVar = this.g;
        int t = t();
        boolean z2 = w().m;
        ClientIdentity clientIdentity2 = this.l;
        Location F = bzscVar.F(location2, t, z2, clientIdentity2);
        if (F != null && w().l && w().a == 100 && t() == 2 && SystemClock.elapsedRealtime() < u() + fppi.c() && F.getAccuracy() > fppi.b()) {
            asot asotVar2 = bzmw.a;
            return null;
        }
        if (F != null) {
            if (bzscVar.o.n(x(), clientIdentity2.c, clientIdentity2.e, clientIdentity2.f, clientIdentity2.g) != 0) {
                ((ejhf) ((ejhf) bzmw.a.h()).ah((char) 5541)).B("delivery noteOp denied for %s", clientIdentity2);
                return new bzrw(this, location3, z);
            }
        }
        location3 = F;
        return new bzrw(this, location3, z);
    }

    public final void q() {
        synchronized (this.g.a) {
            ib((bwrl) Objects.requireNonNull(p(null, false)));
        }
    }

    @Override // com.google.android.gms.location.fused.manager.FusedLocationManager$Registration
    protected final void s() {
        this.h = SystemClock.elapsedRealtime();
        asot asotVar = bzmw.a;
        canl.c(this.o);
        q();
    }

    @Override // com.google.android.gms.location.fused.manager.FusedLocationManager$Registration
    public final void r(boolean z) {
    }
}
