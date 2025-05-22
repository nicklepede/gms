package com.google.android.gms.chromesync.initialization;

import android.content.Intent;
import com.google.android.gms.chromesync.tasks.SendDeviceInfoTaskBoundService;
import com.google.android.gms.chromesync.tasks.UpdateAffiliationsTaskBoundService;
import defpackage.arhn;
import defpackage.artn;
import defpackage.artq;
import defpackage.cate;
import defpackage.catg;
import defpackage.catn;
import defpackage.catp;
import defpackage.catx;
import defpackage.foxn;
import defpackage.foxx;
import defpackage.fpuj;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class ModuleInitializer extends arhn {
    public artq a;
    public artn b;

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        artn artnVar;
        artq artqVar = this.a;
        if (artqVar == null) {
            fxxm.j("updateAffiliationsTaskScheduler");
            artqVar = null;
        }
        if (fpuj.a.lK().q()) {
            catg catgVar = new catg();
            catgVar.w(UpdateAffiliationsTaskBoundService.class.getName());
            catgVar.q("PasswordManagerPeriodicUpdateAffiliationsTaskTag");
            catgVar.a = catn.k;
            catgVar.l(true);
            catgVar.v(2);
            artqVar.a.f(catgVar.b());
        } else {
            foxx foxxVar = foxx.a;
            long d = foxxVar.lK().d();
            long c = foxxVar.lK().c();
            int h = (int) foxxVar.lK().h();
            int f = (int) foxxVar.lK().f();
            int g = (int) foxxVar.lK().g();
            int e = (int) foxxVar.lK().e();
            cate cateVar = new cate();
            cateVar.w(UpdateAffiliationsTaskBoundService.class.getName());
            cateVar.q("PasswordManagerPeriodicUpdateAffiliationsTaskTag");
            cateVar.p = true;
            cateVar.e(d, c, catx.a);
            cateVar.y(h, f);
            cateVar.x(g, e);
            cateVar.f(0, 1);
            cateVar.t = catp.a(0, (int) foxxVar.lK().a(), (int) foxxVar.lK().b());
            cateVar.v(2);
            artqVar.a.f(cateVar.b());
        }
        artn artnVar2 = this.b;
        if (artnVar2 == null) {
            fxxm.j("sendDeviceInfoTaskScheduler");
            artnVar = null;
        } else {
            artnVar = artnVar2;
        }
        catn e2 = catn.e((int) foxn.b());
        catg catgVar2 = new catg();
        catgVar2.w(SendDeviceInfoTaskBoundService.class.getName());
        catgVar2.q("SendDeviceInfoTaskTag");
        catgVar2.a = e2;
        catgVar2.l(true);
        catgVar2.v(2);
        foxn foxnVar = foxn.a;
        catgVar2.t = catp.a(0, (int) foxnVar.lK().c(), (int) foxnVar.lK().b());
        artnVar.a.f(catgVar2.b());
    }
}
