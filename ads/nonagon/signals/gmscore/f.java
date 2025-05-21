package com.google.android.gms.ads.nonagon.signals.gmscore;

import com.google.android.gms.ads.internal.request.NonagonRequestParcel;
import defpackage.eiif;
import defpackage.ensv;
import defpackage.fiwz;
import defpackage.fixb;
import defpackage.fixd;
import defpackage.fixe;
import defpackage.fixh;
import defpackage.fixi;
import defpackage.fixl;
import defpackage.fixm;
import defpackage.fixo;
import defpackage.fixp;
import defpackage.tcw;
import defpackage.tdg;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class f {
    public final tdg A;
    public final ai a;
    public fixm b;
    fixm c;
    fixm d;
    fixm e;
    public fixm f;
    public fixm g;
    fixm h;
    public fixm i;
    public fixm j;
    public fixm k;
    fixm l;
    fixm m;
    fixm n;
    public fixm o;
    public fixm p;
    fixm q;
    fixm r;
    fixm s;
    fixm t;
    fixm u;
    fixm v;
    fixm w;
    fixm x;
    fixm y;
    fixm z;

    public f() {
        throw null;
    }

    public final i a() {
        com.google.android.gms.ads.adinfo.g f = this.A.f();
        ensv b = com.google.android.gms.ads.nonagon.util.concurrent.b.b();
        ai aiVar = this.a;
        NonagonRequestParcel nonagonRequestParcel = aiVar.a;
        return new i(f, b, eiif.b(nonagonRequestParcel.a.getString("ms")), nonagonRequestParcel.f, aiVar.b);
    }

    public final ac b() {
        com.google.android.gms.ads.config.e eVar = new com.google.android.gms.ads.config.e(tcw.c(this.A.a));
        NonagonRequestParcel nonagonRequestParcel = this.a.a;
        ensv b = com.google.android.gms.ads.nonagon.util.concurrent.b.b();
        List list = nonagonRequestParcel.e;
        fixl.e(list);
        return new ac(eVar, b, list);
    }

    public final com.google.android.gms.ads.nonagon.util.logging.cui.k c() {
        return (com.google.android.gms.ads.nonagon.util.logging.cui.k) this.b.a();
    }

    public final com.google.android.gms.ads.nonagon.util.concurrent.n d() {
        return (com.google.android.gms.ads.nonagon.util.concurrent.n) this.z.a();
    }

    public f(tdg tdgVar, ai aiVar) {
        this.A = tdgVar;
        this.a = aiVar;
        this.b = fixd.c(new com.google.android.gms.ads.nonagon.util.logging.cui.l(tdgVar.g));
        this.c = new ak(aiVar);
        this.d = new al(aiVar);
        this.e = new an(aiVar);
        fixm fixmVar = tdgVar.t;
        fixm fixmVar2 = tdgVar.b;
        fixm fixmVar3 = tdgVar.j;
        fixm fixmVar4 = this.c;
        fixm fixmVar5 = this.d;
        fixm fixmVar6 = this.e;
        this.f = new e(fixmVar, fixmVar2, fixmVar3, fixmVar4, fixmVar5, fixmVar6);
        this.g = new s(fixmVar2);
        this.h = new aj(aiVar);
        fixm fixmVar7 = tdgVar.l;
        fixm fixmVar8 = this.h;
        this.i = new aa(fixmVar7, fixmVar8);
        this.j = new ah(fixmVar3, fixmVar2);
        this.k = new az();
        this.l = new am(aiVar);
        this.m = new ap(aiVar);
        this.n = new aq(aiVar);
        this.o = new av(this.l, fixmVar6, tdgVar.x, fixmVar8, fixmVar3, this.m, this.n);
        this.p = new o(fixmVar8, tdgVar.y, fixmVar3);
        this.q = new ao(aiVar);
        this.r = fixd.c(com.google.android.gms.ads.nonagon.clearcut.c.a);
        this.s = fixd.c(com.google.android.gms.ads.nonagon.clearcut.a.a);
        this.t = fixd.c(com.google.android.gms.ads.nonagon.clearcut.e.a);
        this.u = fixd.c(com.google.android.gms.ads.nonagon.clearcut.g.a);
        fixm fixmVar9 = fixi.b;
        fiwz fiwzVar = new fiwz(4);
        fiwzVar.a(com.google.android.gms.ads.nonagon.util.event.a.GMS_SIGNALS, this.r);
        fiwzVar.a(com.google.android.gms.ads.nonagon.util.event.a.BUILD_URL, this.s);
        fiwzVar.a(com.google.android.gms.ads.nonagon.util.event.a.HTTP, this.t);
        fiwzVar.a(com.google.android.gms.ads.nonagon.util.event.a.PRE_PROCESS, this.u);
        this.v = fixh.a(fiwzVar);
        this.w = fixd.c(new com.google.android.gms.ads.nonagon.clearcut.i(this.q, tdgVar.b, this.v));
        fixe fixeVar = fixp.a;
        List c = fixb.c(0);
        List c2 = fixb.c(1);
        fixo.a(this.w, c2);
        fixp fixpVar = new fixp(c, c2);
        this.x = fixpVar;
        this.y = new com.google.android.gms.ads.nonagon.util.event.g(fixpVar);
        this.z = fixd.c(new com.google.android.gms.ads.nonagon.util.event.f(tdgVar.j, this.y));
    }
}
