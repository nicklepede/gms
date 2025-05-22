package com.google.android.gms.credential.manager.operations;

import android.content.Intent;
import com.google.android.gms.credential.manager.service.operations.checkup.OnDeviceCheckupTaskBoundService;
import com.google.android.gms.credential.manager.tasks.PasswordChangesSubscriptionTaskBoundService;
import com.google.android.gms.credential.manager.tasks.PasswordSharingSubscriptionTaskBoundService;
import defpackage.aura;
import defpackage.auub;
import defpackage.awin;
import defpackage.axrk;
import defpackage.axrr;
import defpackage.ayzw;
import defpackage.ayzz;
import defpackage.casd;
import defpackage.cata;
import defpackage.cate;
import defpackage.catg;
import defpackage.catn;
import defpackage.catp;
import defpackage.catx;
import defpackage.fpuj;
import defpackage.fpyj;
import defpackage.fpyr;
import defpackage.fpzd;
import defpackage.fxuw;
import defpackage.fxxm;
import defpackage.fycs;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class ModuleInitializer extends axrr {
    public ayzz a;
    public ayzw b;
    public awin c;

    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
        fxxm.f(intent, "intent");
        aura.K("com.google.android.gms.credential.manager.PasswordManagerActivity", true);
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        fxxm.f(intent, "intent");
        if (auub.c()) {
            int i2 = OnDeviceCheckupTaskBoundService.a;
            fpzd fpzdVar = fpzd.a;
            long d = fpzdVar.lK().d();
            long c = fpzdVar.lK().c();
            int h = (int) fpzdVar.lK().h();
            int f = (int) fpzdVar.lK().f();
            int g = (int) fpzdVar.lK().g();
            int e = (int) fpzdVar.lK().e();
            cate cateVar = new cate();
            cateVar.w(OnDeviceCheckupTaskBoundService.class.getName());
            cateVar.q("PeriodicOnDeviceCheckup");
            cateVar.p = true;
            cateVar.e(d, c, catx.a);
            cateVar.y(h, f);
            cateVar.x(g, e);
            cateVar.f(0, 1);
            cateVar.t = catp.a(0, (int) fpzdVar.lK().a(), (int) fpzdVar.lK().b());
            cateVar.v(2);
            casd.a(this).f(cateVar.b());
        } else {
            int i3 = OnDeviceCheckupTaskBoundService.a;
            casd.a(this).d("PeriodicOnDeviceCheckup", OnDeviceCheckupTaskBoundService.class.getName());
        }
        if (fpyj.f()) {
            ayzw f2 = f();
            catg catgVar = new catg();
            catgVar.w(PasswordChangesSubscriptionTaskBoundService.class.getName());
            catgVar.q("PasswordChangesSubscriptionTaskTag");
            catgVar.a = catn.j;
            catgVar.l(false);
            catgVar.v(2);
            f2.a.f(catgVar.b());
        } else {
            f().a.d("PasswordChangesSubscriptionTaskTag", PasswordChangesSubscriptionTaskBoundService.class.getName());
        }
        ayzz ayzzVar = this.a;
        if (ayzzVar == null) {
            fxxm.j("passwordSharingSubscriptionTaskScheduler");
            ayzzVar = null;
        }
        if (fpuj.a.lK().r()) {
            catg catgVar2 = new catg();
            catgVar2.w(PasswordSharingSubscriptionTaskBoundService.class.getName());
            catgVar2.q("PasswordSharingSubscriptionTaskTag");
            catgVar2.a = catn.j;
            catgVar2.l(false);
            catgVar2.v(2);
            ayzzVar.a.f(catgVar2.b());
        } else {
            cate cateVar2 = new cate();
            cateVar2.w(PasswordSharingSubscriptionTaskBoundService.class.getName());
            cateVar2.q("PasswordSharingSubscriptionTaskTag");
            cateVar2.j(cata.EVERY_DAY);
            cateVar2.v(2);
            cateVar2.p = true;
            cateVar2.y(2, 2);
            cateVar2.f(0, 1);
            cateVar2.x(0, 1);
            ayzzVar.a.f(cateVar2.b());
        }
        if (fpyr.c()) {
            fycs.a(fxuw.a, new axrk(this, null));
        }
    }

    public final ayzw f() {
        ayzw ayzwVar = this.b;
        if (ayzwVar != null) {
            return ayzwVar;
        }
        fxxm.j("passwordChangesSubscriptionTaskScheduler");
        return null;
    }
}
