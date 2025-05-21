package com.google.android.gms.chromesync.initialization;

import android.content.Intent;
import com.google.android.gms.chromesync.tasks.SendDeviceInfoTaskBoundService;
import com.google.android.gms.chromesync.tasks.UpdateAffiliationsTaskBoundService;
import defpackage.apew;
import defpackage.apqw;
import defpackage.apqz;
import defpackage.bykm;
import defpackage.byko;
import defpackage.bykv;
import defpackage.bykx;
import defpackage.bylf;
import defpackage.fmgb;
import defpackage.fmgl;
import defpackage.fnck;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class ModuleInitializer extends apew {
    public apqz a;
    public apqw b;

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        apqw apqwVar;
        apqz apqzVar = this.a;
        if (apqzVar == null) {
            fvbo.j("updateAffiliationsTaskScheduler");
            apqzVar = null;
        }
        if (fnck.a.a().q()) {
            byko bykoVar = new byko();
            bykoVar.w(UpdateAffiliationsTaskBoundService.class.getName());
            bykoVar.q("PasswordManagerPeriodicUpdateAffiliationsTaskTag");
            bykoVar.a = bykv.k;
            bykoVar.l(true);
            bykoVar.v(2);
            apqzVar.a.f(bykoVar.b());
        } else {
            fmgl fmglVar = fmgl.a;
            long d = fmglVar.a().d();
            fmgl fmglVar2 = fmgl.a;
            long c = fmglVar2.a().c();
            int h = (int) fmglVar2.a().h();
            int f = (int) fmglVar2.a().f();
            int g = (int) fmglVar2.a().g();
            int e = (int) fmglVar2.a().e();
            bykm bykmVar = new bykm();
            bykmVar.w(UpdateAffiliationsTaskBoundService.class.getName());
            bykmVar.q("PasswordManagerPeriodicUpdateAffiliationsTaskTag");
            bykmVar.p = true;
            bykmVar.e(d, c, bylf.a);
            bykmVar.y(h, f);
            bykmVar.x(g, e);
            bykmVar.f(0, 1);
            bykmVar.t = bykx.a(0, (int) fmglVar.a().a(), (int) fmglVar2.a().b());
            bykmVar.v(2);
            apqzVar.a.f(bykmVar.b());
        }
        apqw apqwVar2 = this.b;
        if (apqwVar2 == null) {
            fvbo.j("sendDeviceInfoTaskScheduler");
            apqwVar = null;
        } else {
            apqwVar = apqwVar2;
        }
        bykv e2 = bykv.e((int) fmgb.b());
        byko bykoVar2 = new byko();
        bykoVar2.w(SendDeviceInfoTaskBoundService.class.getName());
        bykoVar2.q("SendDeviceInfoTaskTag");
        bykoVar2.a = e2;
        bykoVar2.l(true);
        bykoVar2.v(2);
        fmgb fmgbVar = fmgb.a;
        bykoVar2.t = bykx.a(0, (int) fmgbVar.a().c(), (int) fmgbVar.a().b());
        apqwVar.a.f(bykoVar2.b());
    }
}
