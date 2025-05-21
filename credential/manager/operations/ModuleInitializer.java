package com.google.android.gms.credential.manager.operations;

import android.content.Intent;
import com.google.android.gms.credential.manager.service.operations.checkup.OnDeviceCheckupTaskBoundService;
import com.google.android.gms.credential.manager.tasks.PasswordChangesSubscriptionTaskBoundService;
import com.google.android.gms.credential.manager.tasks.PasswordSharingSubscriptionTaskBoundService;
import defpackage.asng;
import defpackage.asqh;
import defpackage.auel;
import defpackage.avnk;
import defpackage.avnr;
import defpackage.awvw;
import defpackage.awvz;
import defpackage.byjl;
import defpackage.byki;
import defpackage.bykm;
import defpackage.byko;
import defpackage.bykv;
import defpackage.bykx;
import defpackage.bylf;
import defpackage.fnck;
import defpackage.fngj;
import defpackage.fngr;
import defpackage.fnhd;
import defpackage.fuyy;
import defpackage.fvbo;
import defpackage.fvgu;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class ModuleInitializer extends avnr {
    public awvz a;
    public awvw b;
    public auel c;

    @Override // defpackage.anya
    protected final void a(Intent intent, boolean z) {
        fvbo.f(intent, "intent");
        asng.K("com.google.android.gms.credential.manager.PasswordManagerActivity", true);
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        fvbo.f(intent, "intent");
        if (asqh.c()) {
            int i2 = OnDeviceCheckupTaskBoundService.a;
            fnhd fnhdVar = fnhd.a;
            long d = fnhdVar.a().d();
            fnhd fnhdVar2 = fnhd.a;
            long c = fnhdVar2.a().c();
            int h = (int) fnhdVar2.a().h();
            int f = (int) fnhdVar2.a().f();
            int g = (int) fnhdVar2.a().g();
            int e = (int) fnhdVar2.a().e();
            bykm bykmVar = new bykm();
            bykmVar.w(OnDeviceCheckupTaskBoundService.class.getName());
            bykmVar.q("PeriodicOnDeviceCheckup");
            bykmVar.p = true;
            bykmVar.e(d, c, bylf.a);
            bykmVar.y(h, f);
            bykmVar.x(g, e);
            bykmVar.f(0, 1);
            bykmVar.t = bykx.a(0, (int) fnhdVar.a().a(), (int) fnhdVar2.a().b());
            bykmVar.v(2);
            byjl.a(this).f(bykmVar.b());
        } else {
            int i3 = OnDeviceCheckupTaskBoundService.a;
            byjl.a(this).d("PeriodicOnDeviceCheckup", OnDeviceCheckupTaskBoundService.class.getName());
        }
        if (fngj.f()) {
            awvw f2 = f();
            byko bykoVar = new byko();
            bykoVar.w(PasswordChangesSubscriptionTaskBoundService.class.getName());
            bykoVar.q("PasswordChangesSubscriptionTaskTag");
            bykoVar.a = bykv.j;
            bykoVar.l(false);
            bykoVar.v(2);
            f2.a.f(bykoVar.b());
        } else {
            f().a.d("PasswordChangesSubscriptionTaskTag", PasswordChangesSubscriptionTaskBoundService.class.getName());
        }
        awvz awvzVar = this.a;
        if (awvzVar == null) {
            fvbo.j("passwordSharingSubscriptionTaskScheduler");
            awvzVar = null;
        }
        if (fnck.a.a().r()) {
            byko bykoVar2 = new byko();
            bykoVar2.w(PasswordSharingSubscriptionTaskBoundService.class.getName());
            bykoVar2.q("PasswordSharingSubscriptionTaskTag");
            bykoVar2.a = bykv.j;
            bykoVar2.l(false);
            bykoVar2.v(2);
            awvzVar.a.f(bykoVar2.b());
        } else {
            bykm bykmVar2 = new bykm();
            bykmVar2.w(PasswordSharingSubscriptionTaskBoundService.class.getName());
            bykmVar2.q("PasswordSharingSubscriptionTaskTag");
            bykmVar2.j(byki.EVERY_DAY);
            bykmVar2.v(2);
            bykmVar2.p = true;
            bykmVar2.y(2, 2);
            bykmVar2.f(0, 1);
            bykmVar2.x(0, 1);
            awvzVar.a.f(bykmVar2.b());
        }
        if (fngr.c()) {
            fvgu.a(fuyy.a, new avnk(this, null));
        }
    }

    public final awvw f() {
        awvw awvwVar = this.b;
        if (awvwVar != null) {
            return awvwVar;
        }
        fvbo.j("passwordChangesSubscriptionTaskScheduler");
        return null;
    }
}
