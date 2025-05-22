package com.google.android.gms.location.fused.manager;

import android.location.Location;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.libs.identity.ClientIdentity;
import defpackage.ausn;
import defpackage.bzab;
import defpackage.cbvn;
import defpackage.cbvq;
import defpackage.cbvs;
import defpackage.cbym;
import defpackage.ccan;
import defpackage.ccat;
import defpackage.ccbp;
import defpackage.ccwb;
import defpackage.ekvl;
import defpackage.elun;
import defpackage.eluo;
import defpackage.etry;
import defpackage.etrz;
import defpackage.fsja;
import j$.util.Objects;
import java.util.NoSuchElementException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class FusedLocationManager$CurrentLocationRegistration extends FusedLocationManager$Registration implements IBinder.DeathRecipient {
    public final cbym f;
    public final /* synthetic */ ccat g;
    private volatile long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FusedLocationManager$CurrentLocationRegistration(ccat ccatVar, cbvq cbvqVar, ClientIdentity clientIdentity, ccbp ccbpVar, cbym cbymVar) {
        super(ccatVar, cbvqVar, clientIdentity, ccbpVar);
        this.g = ccatVar;
        this.h = -1L;
        this.f = cbymVar;
    }

    @Override // com.google.android.gms.location.fused.manager.FusedLocationManager$Registration, defpackage.bzac
    protected final void b() {
        super.b();
        Location E = this.g.E(t(), w().m, w().g, u());
        if (E != null) {
            iq(p(E, true));
        }
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

    @Override // com.google.android.gms.location.fused.manager.FusedLocationManager$Registration, defpackage.bzac
    protected final void c() {
        super.c();
        if (g()) {
            q();
        }
    }

    @Override // defpackage.bzac
    public final void d(Exception exc) {
        if (!(exc instanceof RemoteException)) {
            super.d(exc);
        } else {
            ((eluo) ((eluo) ((eluo) cbvn.a.j()).s(exc)).ai(5559)).B("registration %s transport failure", this.l);
            l();
        }
    }

    @Override // com.google.android.gms.location.fused.manager.FusedLocationManager$Registration, defpackage.bzan, defpackage.bzac
    protected final void f() {
        try {
            ((IBinder) i()).unlinkToDeath(this, 0);
        } catch (NoSuchElementException e) {
            ((eluo) ((eluo) ((eluo) cbvn.a.j()).s(e)).ai((char) 5561)).x("failed to unregister binder death listener");
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

    @Override // com.google.android.gms.location.fused.manager.FusedLocationManager$Registration
    public final bzab o(cbvs cbvsVar, boolean z) {
        return p(cbvsVar.c(), false);
    }

    final bzab p(Location location, boolean z) {
        Location location2;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.o;
        Location location3 = null;
        if (elapsedRealtime >= 0) {
            if (elapsedRealtime >= 30000) {
                long elapsedRealtime2 = this.h < 0 ? this.h : SystemClock.elapsedRealtime() - this.h;
                eluo eluoVar = (eluo) ((eluo) ((eluo) cbvn.a.i()).t(elun.FULL)).ai(5558);
                ClientIdentity clientIdentity = this.l;
                Long valueOf = Long.valueOf(elapsedRealtime);
                etry etryVar = etry.NO_USER_DATA;
                eluoVar.T("current location registration %s is late to expire by %sms, timeout age %s", clientIdentity, new etrz(etryVar, valueOf), new etrz(etryVar, Long.valueOf(elapsedRealtime2)));
            }
            location2 = null;
        } else {
            location2 = location;
        }
        if (location2 != null && (location2 = ccat.O(location2, t(), w().g, u())) == null) {
            ausn ausnVar = cbvn.a;
            return null;
        }
        ccat ccatVar = this.g;
        int t = t();
        boolean z2 = w().m;
        ClientIdentity clientIdentity2 = this.l;
        Location F = ccatVar.F(location2, t, z2, clientIdentity2);
        if (F != null && w().l && w().a == 100 && t() == 2 && SystemClock.elapsedRealtime() < u() + fsja.c() && F.getAccuracy() > fsja.b()) {
            ausn ausnVar2 = cbvn.a;
            return null;
        }
        if (F != null) {
            if (ccatVar.o.n(x(), clientIdentity2.c, clientIdentity2.e, clientIdentity2.f, clientIdentity2.g) != 0) {
                ((eluo) ((eluo) cbvn.a.h()).ai((char) 5555)).B("delivery noteOp denied for %s", clientIdentity2);
                return new ccan(this, location3, z);
            }
        }
        location3 = F;
        return new ccan(this, location3, z);
    }

    public final void q() {
        synchronized (this.g.a) {
            iq((bzab) Objects.requireNonNull(p(null, false)));
        }
    }

    @Override // com.google.android.gms.location.fused.manager.FusedLocationManager$Registration
    protected final void s() {
        this.h = SystemClock.elapsedRealtime();
        ausn ausnVar = cbvn.a;
        ccwb.c(this.o);
        q();
    }

    @Override // com.google.android.gms.location.fused.manager.FusedLocationManager$Registration
    public final void r(boolean z) {
    }
}
