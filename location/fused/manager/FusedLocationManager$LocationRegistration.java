package com.google.android.gms.location.fused.manager;

import android.location.Location;
import android.os.SystemClock;
import com.google.android.gms.libs.identity.ClientIdentity;
import defpackage.ausn;
import defpackage.byyc;
import defpackage.byyh;
import defpackage.bzab;
import defpackage.cbvn;
import defpackage.cbvq;
import defpackage.cbvs;
import defpackage.cbyo;
import defpackage.ccao;
import defpackage.ccap;
import defpackage.ccar;
import defpackage.ccat;
import defpackage.ccaw;
import defpackage.ccbm;
import defpackage.ccbp;
import defpackage.ccyd;
import defpackage.dhbu;
import defpackage.ekut;
import defpackage.elgj;
import defpackage.elgo;
import defpackage.eluo;
import defpackage.fsiu;
import defpackage.fsnp;
import defpackage.fxwo;
import defpackage.fxxm;
import defpackage.iri;
import j$.util.Objects;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public abstract class FusedLocationManager$LocationRegistration extends FusedLocationManager$Registration {
    public final cbyo g;
    public final dhbu h;
    boolean i;
    public boolean j;
    public final /* synthetic */ ccat k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FusedLocationManager$LocationRegistration(ccat ccatVar, cbvq cbvqVar, ClientIdentity clientIdentity, ccbp ccbpVar, cbyo cbyoVar) {
        super(ccatVar, cbvqVar, clientIdentity, ccbpVar);
        this.k = ccatVar;
        this.g = cbyoVar;
        if (ccbpVar instanceof ccbm) {
            dhbu dhbuVar = new dhbu(ccatVar.d, 1, "FusedLocation", "ClientDelivery", clientIdentity.e);
            this.h = dhbuVar;
            dhbuVar.j(true);
            dhbuVar.k(cbvqVar.n.b());
        } else {
            this.h = null;
        }
        this.i = true;
        this.j = true;
    }

    private final void p() {
        boolean z = false;
        if (this.b && this.i) {
            z = true;
        }
        if (z == this.j) {
            return;
        }
        iq(new ccao(this, z));
    }

    @Override // com.google.android.gms.location.fused.manager.FusedLocationManager$Registration, defpackage.bzac
    protected final void b() {
        Location v;
        super.b();
        p();
        Location E = this.k.E(t(), w().m, w().g, u());
        if (E != null && (v = v()) != null && E.getElapsedRealtimeNanos() <= v.getElapsedRealtimeNanos()) {
            E = null;
        }
        if (E != null) {
            iq(o(cbvs.e(E), true));
        }
    }

    @Override // com.google.android.gms.location.fused.manager.FusedLocationManager$Registration, defpackage.bzac
    protected final void c() {
        super.c();
        p();
    }

    @Override // com.google.android.gms.location.fused.manager.FusedLocationManager$Registration, defpackage.bzan, defpackage.bzac
    protected void f() {
        cbyo cbyoVar = this.g;
        if (cbyoVar != null) {
            cbyoVar.c(SystemClock.elapsedRealtime());
        }
        super.f();
    }

    @Override // com.google.android.gms.location.fused.manager.FusedLocationManager$Registration
    public final bzab o(cbvs cbvsVar, boolean z) {
        List list;
        List list2;
        cbvs f;
        cbvs cbvsVar2;
        cbvs cbvsVar3 = cbvsVar;
        if (SystemClock.elapsedRealtime() >= this.o) {
            s();
            return null;
        }
        if (!this.b) {
            ((eluo) ((eluo) cbvn.a.j()).ai(5578)).B("location delivery to %s blocked - inactive", this.l);
            return null;
        }
        ccat ccatVar = this.k;
        int t = t();
        final boolean z2 = w().m;
        final ClientIdentity clientIdentity = this.l;
        if (cbvsVar3 == null || t == 0) {
            f = null;
        } else {
            if (t == 1) {
                final ccaw ccawVar = ccatVar.l;
                if (fsnp.d()) {
                    int i = iri.a;
                }
                synchronized (ccawVar) {
                    if (cbvsVar3 != ccawVar.a && cbvsVar3 != ccawVar.b) {
                        fxwo fxwoVar = new fxwo() { // from class: ccav
                            @Override // defpackage.fxwo
                            public final Object a(Object obj) {
                                return ccaw.this.a((Location) obj);
                            }
                        };
                        elgo elgoVar = cbvsVar3.a;
                        int size = elgoVar.size();
                        elgj elgjVar = null;
                        for (int i2 = 0; i2 < size; i2++) {
                            Object obj = elgoVar.get(i2);
                            fxxm.e(obj, "get(...)");
                            Location location = (Location) obj;
                            Object a = fxwoVar.a(location);
                            if (elgjVar != null) {
                                elgjVar.i(a);
                            } else if (a != location) {
                                elgjVar = elgo.e(size);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    elgjVar.i(elgoVar.get(i3));
                                }
                                elgjVar.i(a);
                            }
                        }
                        if (elgjVar == null) {
                            cbvsVar2 = cbvsVar3;
                        } else {
                            elgo g = elgjVar.g();
                            fxxm.e(g, "build(...)");
                            cbvsVar2 = new cbvs(g);
                        }
                        synchronized (ccawVar) {
                            ccawVar.a = cbvsVar3;
                            ccawVar.b = cbvsVar2;
                        }
                        cbvsVar3 = cbvsVar2;
                    }
                    cbvsVar3 = (cbvs) Objects.requireNonNull(ccawVar.b);
                }
            }
            final ccyd ccydVar = ccatVar.m;
            Object a2 = new byyc(clientIdentity).a(ccydVar.h);
            if (ccyd.e((byyh) a2, z2)) {
                list = ccyd.d(cbvsVar3, new ekut() { // from class: ccya
                    @Override // defpackage.ekut
                    public final Object apply(Object obj2) {
                        return ccyd.this.a((Location) obj2, z2, clientIdentity);
                    }
                });
            } else {
                synchronized (ccydVar) {
                    if (cbvsVar3 == ccydVar.d) {
                        int ordinal = ((byyh) a2).ordinal();
                        if (ordinal == 0) {
                            list2 = ccydVar.g;
                            if (list2 != null) {
                                list = list2;
                            }
                        } else if (ordinal == 1) {
                            list2 = ccydVar.f;
                            if (list2 != null) {
                                list = list2;
                            }
                        } else {
                            if (ordinal != 2) {
                                throw new IllegalStateException();
                            }
                            list2 = ccydVar.e;
                            if (list2 != null) {
                                list = list2;
                            }
                        }
                    }
                    List d = ccyd.d(cbvsVar3, new ekut() { // from class: ccyb
                        @Override // defpackage.ekut
                        public final Object apply(Object obj2) {
                            return ccyd.this.a((Location) obj2, z2, clientIdentity);
                        }
                    });
                    synchronized (ccydVar) {
                        ccydVar.d = cbvsVar3;
                        int ordinal2 = ((byyh) a2).ordinal();
                        if (ordinal2 == 0) {
                            ccydVar.g = d;
                            ccydVar.f = null;
                            ccydVar.e = null;
                        } else if (ordinal2 == 1) {
                            ccydVar.g = null;
                            ccydVar.f = d;
                            ccydVar.e = null;
                        } else {
                            if (ordinal2 != 2) {
                                throw new IllegalStateException();
                            }
                            ccydVar.g = null;
                            ccydVar.f = null;
                            ccydVar.e = d;
                        }
                    }
                    list = d;
                }
            }
            f = cbvs.f(list);
        }
        if (f == null) {
            ausn ausnVar = cbvn.a;
            return null;
        }
        if (fsiu.y() && f.a() > 1) {
            cbvq cbvqVar = this.m;
            if (!cbvqVar.b() && !cbvqVar.c()) {
                f = cbvs.e(f.c());
            }
        }
        ccap ccapVar = new ccap(this);
        elgo elgoVar2 = f.a;
        int size2 = elgoVar2.size();
        elgj elgjVar2 = null;
        for (int i4 = 0; i4 < size2; i4++) {
            Object obj2 = elgoVar2.get(i4);
            fxxm.e(obj2, "get(...)");
            if (((Boolean) ccapVar.a(obj2)).booleanValue()) {
                if (elgjVar2 != null) {
                    elgjVar2.i(elgoVar2.get(i4));
                }
            } else if (elgjVar2 == null) {
                elgjVar2 = elgo.e(size2 - 1);
                for (int i5 = 0; i5 < i4; i5++) {
                    elgjVar2.i(elgoVar2.get(i5));
                }
            }
        }
        if (elgjVar2 != null) {
            elgo g2 = elgjVar2.g();
            fxxm.e(g2, "build(...)");
            f = g2.isEmpty() ? null : new cbvs(g2);
        }
        if (f == null) {
            return null;
        }
        if (fsiu.x() && !fsiu.y() && f.a() > 1) {
            cbvq cbvqVar2 = this.m;
            if (!cbvqVar2.b() && !cbvqVar2.c()) {
                f = cbvs.e(f.c());
            }
        }
        ccat ccatVar2 = this.k;
        String x = x();
        ClientIdentity clientIdentity2 = this.l;
        if (ccatVar2.o.n(x, clientIdentity2.c, clientIdentity2.e, clientIdentity2.f, clientIdentity2.g) == 0) {
            return new ccar(this, f, z);
        }
        ((eluo) ((eluo) cbvn.a.h()).ai((char) 5576)).B("delivery noteOp denied for %s", clientIdentity2);
        return null;
    }

    @Override // com.google.android.gms.location.fused.manager.FusedLocationManager$Registration
    public final void r(boolean z) {
        this.i = z;
        p();
    }
}
