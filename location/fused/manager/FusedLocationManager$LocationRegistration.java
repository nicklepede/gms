package com.google.android.gms.location.fused.manager;

import android.location.Location;
import android.os.SystemClock;
import com.google.android.gms.libs.identity.ClientIdentity;
import defpackage.asot;
import defpackage.bwpp;
import defpackage.bwpu;
import defpackage.bwrl;
import defpackage.bzmw;
import defpackage.bzmz;
import defpackage.bznb;
import defpackage.bzpx;
import defpackage.bzrx;
import defpackage.bzry;
import defpackage.bzsa;
import defpackage.bzsc;
import defpackage.bzsf;
import defpackage.bzsv;
import defpackage.bzsy;
import defpackage.capn;
import defpackage.deqr;
import defpackage.eiho;
import defpackage.eite;
import defpackage.eitj;
import defpackage.ejhf;
import defpackage.fppc;
import defpackage.fptx;
import defpackage.fvaq;
import defpackage.fvbo;
import defpackage.ips;
import j$.util.Objects;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public abstract class FusedLocationManager$LocationRegistration extends FusedLocationManager$Registration {
    public final bzpx g;
    public final deqr h;
    boolean i;
    public boolean j;
    public final /* synthetic */ bzsc k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FusedLocationManager$LocationRegistration(bzsc bzscVar, bzmz bzmzVar, ClientIdentity clientIdentity, bzsy bzsyVar, bzpx bzpxVar) {
        super(bzscVar, bzmzVar, clientIdentity, bzsyVar);
        this.k = bzscVar;
        this.g = bzpxVar;
        if (bzsyVar instanceof bzsv) {
            deqr deqrVar = new deqr(bzscVar.d, 1, "FusedLocation", "ClientDelivery", clientIdentity.e);
            this.h = deqrVar;
            deqrVar.j(true);
            deqrVar.k(bzmzVar.n.b());
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
        ib(new bzrx(this, z));
    }

    @Override // com.google.android.gms.location.fused.manager.FusedLocationManager$Registration, defpackage.bwrm
    protected final void b() {
        Location v;
        super.b();
        p();
        Location E = this.k.E(t(), w().m, w().g, u());
        if (E != null && (v = v()) != null && E.getElapsedRealtimeNanos() <= v.getElapsedRealtimeNanos()) {
            E = null;
        }
        if (E != null) {
            ib(o(bznb.e(E), true));
        }
    }

    @Override // com.google.android.gms.location.fused.manager.FusedLocationManager$Registration, defpackage.bwrm
    protected final void c() {
        super.c();
        p();
    }

    @Override // com.google.android.gms.location.fused.manager.FusedLocationManager$Registration, defpackage.bwrx, defpackage.bwrm
    protected void f() {
        bzpx bzpxVar = this.g;
        if (bzpxVar != null) {
            bzpxVar.c(SystemClock.elapsedRealtime());
        }
        super.f();
    }

    @Override // com.google.android.gms.location.fused.manager.FusedLocationManager$Registration
    public final bwrl o(bznb bznbVar, boolean z) {
        List list;
        List list2;
        bznb f;
        bznb bznbVar2;
        bznb bznbVar3 = bznbVar;
        if (SystemClock.elapsedRealtime() >= this.o) {
            s();
            return null;
        }
        if (!this.b) {
            ((ejhf) ((ejhf) bzmw.a.j()).ah(5564)).B("location delivery to %s blocked - inactive", this.l);
            return null;
        }
        bzsc bzscVar = this.k;
        int t = t();
        final boolean z2 = w().m;
        final ClientIdentity clientIdentity = this.l;
        if (bznbVar3 == null || t == 0) {
            f = null;
        } else {
            if (t == 1) {
                final bzsf bzsfVar = bzscVar.l;
                if (fptx.d()) {
                    int i = ips.a;
                }
                synchronized (bzsfVar) {
                    if (bznbVar3 != bzsfVar.a && bznbVar3 != bzsfVar.b) {
                        fvaq fvaqVar = new fvaq() { // from class: bzse
                            @Override // defpackage.fvaq
                            public final Object a(Object obj) {
                                return bzsf.this.a((Location) obj);
                            }
                        };
                        eitj eitjVar = bznbVar3.a;
                        int size = eitjVar.size();
                        eite eiteVar = null;
                        for (int i2 = 0; i2 < size; i2++) {
                            Object obj = eitjVar.get(i2);
                            fvbo.e(obj, "get(...)");
                            Location location = (Location) obj;
                            Object a = fvaqVar.a(location);
                            if (eiteVar != null) {
                                eiteVar.i(a);
                            } else if (a != location) {
                                eiteVar = eitj.e(size);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    eiteVar.i(eitjVar.get(i3));
                                }
                                eiteVar.i(a);
                            }
                        }
                        if (eiteVar == null) {
                            bznbVar2 = bznbVar3;
                        } else {
                            eitj g = eiteVar.g();
                            fvbo.e(g, "build(...)");
                            bznbVar2 = new bznb(g);
                        }
                        synchronized (bzsfVar) {
                            bzsfVar.a = bznbVar3;
                            bzsfVar.b = bznbVar2;
                        }
                        bznbVar3 = bznbVar2;
                    }
                    bznbVar3 = (bznb) Objects.requireNonNull(bzsfVar.b);
                }
            }
            final capn capnVar = bzscVar.m;
            Object a2 = new bwpp(clientIdentity).a(capnVar.h);
            if (capn.e((bwpu) a2, z2)) {
                list = capn.d(bznbVar3, new eiho() { // from class: capk
                    @Override // defpackage.eiho
                    public final Object apply(Object obj2) {
                        return capn.this.a((Location) obj2, z2, clientIdentity);
                    }
                });
            } else {
                synchronized (capnVar) {
                    if (bznbVar3 == capnVar.d) {
                        int ordinal = ((bwpu) a2).ordinal();
                        if (ordinal == 0) {
                            list2 = capnVar.g;
                            if (list2 != null) {
                                list = list2;
                            }
                        } else if (ordinal == 1) {
                            list2 = capnVar.f;
                            if (list2 != null) {
                                list = list2;
                            }
                        } else {
                            if (ordinal != 2) {
                                throw new IllegalStateException();
                            }
                            list2 = capnVar.e;
                            if (list2 != null) {
                                list = list2;
                            }
                        }
                    }
                    List d = capn.d(bznbVar3, new eiho() { // from class: capl
                        @Override // defpackage.eiho
                        public final Object apply(Object obj2) {
                            return capn.this.a((Location) obj2, z2, clientIdentity);
                        }
                    });
                    synchronized (capnVar) {
                        capnVar.d = bznbVar3;
                        int ordinal2 = ((bwpu) a2).ordinal();
                        if (ordinal2 == 0) {
                            capnVar.g = d;
                            capnVar.f = null;
                            capnVar.e = null;
                        } else if (ordinal2 == 1) {
                            capnVar.g = null;
                            capnVar.f = d;
                            capnVar.e = null;
                        } else {
                            if (ordinal2 != 2) {
                                throw new IllegalStateException();
                            }
                            capnVar.g = null;
                            capnVar.f = null;
                            capnVar.e = d;
                        }
                    }
                    list = d;
                }
            }
            f = bznb.f(list);
        }
        if (f == null) {
            asot asotVar = bzmw.a;
            return null;
        }
        if (fppc.y() && f.a() > 1) {
            bzmz bzmzVar = this.m;
            if (!bzmzVar.b() && !bzmzVar.c()) {
                f = bznb.e(f.c());
            }
        }
        bzry bzryVar = new bzry(this);
        eitj eitjVar2 = f.a;
        int size2 = eitjVar2.size();
        eite eiteVar2 = null;
        for (int i4 = 0; i4 < size2; i4++) {
            Object obj2 = eitjVar2.get(i4);
            fvbo.e(obj2, "get(...)");
            if (((Boolean) bzryVar.a(obj2)).booleanValue()) {
                if (eiteVar2 != null) {
                    eiteVar2.i(eitjVar2.get(i4));
                }
            } else if (eiteVar2 == null) {
                eiteVar2 = eitj.e(size2 - 1);
                for (int i5 = 0; i5 < i4; i5++) {
                    eiteVar2.i(eitjVar2.get(i5));
                }
            }
        }
        if (eiteVar2 != null) {
            eitj g2 = eiteVar2.g();
            fvbo.e(g2, "build(...)");
            f = g2.isEmpty() ? null : new bznb(g2);
        }
        if (f == null) {
            return null;
        }
        if (fppc.x() && !fppc.y() && f.a() > 1) {
            bzmz bzmzVar2 = this.m;
            if (!bzmzVar2.b() && !bzmzVar2.c()) {
                f = bznb.e(f.c());
            }
        }
        bzsc bzscVar2 = this.k;
        String x = x();
        ClientIdentity clientIdentity2 = this.l;
        if (bzscVar2.o.n(x, clientIdentity2.c, clientIdentity2.e, clientIdentity2.f, clientIdentity2.g) == 0) {
            return new bzsa(this, f, z);
        }
        ((ejhf) ((ejhf) bzmw.a.h()).ah((char) 5562)).B("delivery noteOp denied for %s", clientIdentity2);
        return null;
    }

    @Override // com.google.android.gms.location.fused.manager.FusedLocationManager$Registration
    public final void r(boolean z) {
        this.i = z;
        p();
    }
}
