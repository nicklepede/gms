package com.google.android.gms.ads.nonagon.signals.gmscore;

import com.google.android.gms.ads.internal.request.NonagonRequestParcel;
import defpackage.ekvk;
import defpackage.eqgo;
import defpackage.flmw;
import defpackage.flmy;
import defpackage.flna;
import defpackage.flnb;
import defpackage.flne;
import defpackage.flnf;
import defpackage.flni;
import defpackage.flnj;
import defpackage.flnl;
import defpackage.flnm;
import defpackage.uyw;
import defpackage.uzg;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class f {
    public final uzg A;
    public final ai a;
    public flnj b;
    flnj c;
    flnj d;
    flnj e;
    public flnj f;
    public flnj g;
    flnj h;
    public flnj i;
    public flnj j;
    public flnj k;
    flnj l;
    flnj m;
    flnj n;
    public flnj o;
    public flnj p;
    flnj q;
    flnj r;
    flnj s;
    flnj t;
    flnj u;
    flnj v;
    flnj w;
    flnj x;
    flnj y;
    flnj z;

    public f() {
        throw null;
    }

    public final i a() {
        com.google.android.gms.ads.adinfo.g f = this.A.f();
        eqgo b = com.google.android.gms.ads.nonagon.util.concurrent.b.b();
        ai aiVar = this.a;
        NonagonRequestParcel nonagonRequestParcel = aiVar.a;
        return new i(f, b, ekvk.b(nonagonRequestParcel.a.getString("ms")), nonagonRequestParcel.f, aiVar.b);
    }

    public final ac b() {
        com.google.android.gms.ads.config.e eVar = new com.google.android.gms.ads.config.e(uyw.c(this.A.a));
        NonagonRequestParcel nonagonRequestParcel = this.a.a;
        eqgo b = com.google.android.gms.ads.nonagon.util.concurrent.b.b();
        List list = nonagonRequestParcel.e;
        flni.e(list);
        return new ac(eVar, b, list);
    }

    public final com.google.android.gms.ads.nonagon.util.logging.cui.k c() {
        return (com.google.android.gms.ads.nonagon.util.logging.cui.k) this.b.a();
    }

    public final com.google.android.gms.ads.nonagon.util.concurrent.n d() {
        return (com.google.android.gms.ads.nonagon.util.concurrent.n) this.z.a();
    }

    public f(uzg uzgVar, ai aiVar) {
        this.A = uzgVar;
        this.a = aiVar;
        this.b = flna.c(new com.google.android.gms.ads.nonagon.util.logging.cui.l(uzgVar.g));
        this.c = new ak(aiVar);
        this.d = new al(aiVar);
        this.e = new an(aiVar);
        flnj flnjVar = uzgVar.t;
        flnj flnjVar2 = uzgVar.b;
        flnj flnjVar3 = uzgVar.j;
        flnj flnjVar4 = this.c;
        flnj flnjVar5 = this.d;
        flnj flnjVar6 = this.e;
        this.f = new e(flnjVar, flnjVar2, flnjVar3, flnjVar4, flnjVar5, flnjVar6);
        this.g = new s(flnjVar2);
        this.h = new aj(aiVar);
        flnj flnjVar7 = uzgVar.l;
        flnj flnjVar8 = this.h;
        this.i = new aa(flnjVar7, flnjVar8);
        this.j = new ah(flnjVar3, flnjVar2);
        this.k = new az();
        this.l = new am(aiVar);
        this.m = new ap(aiVar);
        this.n = new aq(aiVar);
        this.o = new av(this.l, flnjVar6, uzgVar.x, flnjVar8, flnjVar3, this.m, this.n);
        this.p = new o(flnjVar8, uzgVar.y, flnjVar3);
        this.q = new ao(aiVar);
        this.r = flna.c(com.google.android.gms.ads.nonagon.clearcut.c.a);
        this.s = flna.c(com.google.android.gms.ads.nonagon.clearcut.a.a);
        this.t = flna.c(com.google.android.gms.ads.nonagon.clearcut.e.a);
        this.u = flna.c(com.google.android.gms.ads.nonagon.clearcut.g.a);
        flnj flnjVar9 = flnf.b;
        flmw flmwVar = new flmw(4);
        flmwVar.a(com.google.android.gms.ads.nonagon.util.event.a.GMS_SIGNALS, this.r);
        flmwVar.a(com.google.android.gms.ads.nonagon.util.event.a.BUILD_URL, this.s);
        flmwVar.a(com.google.android.gms.ads.nonagon.util.event.a.HTTP, this.t);
        flmwVar.a(com.google.android.gms.ads.nonagon.util.event.a.PRE_PROCESS, this.u);
        this.v = flne.a(flmwVar);
        this.w = flna.c(new com.google.android.gms.ads.nonagon.clearcut.i(this.q, uzgVar.b, this.v));
        flnb flnbVar = flnm.a;
        List c = flmy.c(0);
        List c2 = flmy.c(1);
        flnl.a(this.w, c2);
        flnm flnmVar = new flnm(c, c2);
        this.x = flnmVar;
        this.y = new com.google.android.gms.ads.nonagon.util.event.g(flnmVar);
        this.z = flna.c(new com.google.android.gms.ads.nonagon.util.event.f(uzgVar.j, this.y));
    }
}
