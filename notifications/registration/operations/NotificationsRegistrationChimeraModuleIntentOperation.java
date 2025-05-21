package com.google.android.gms.notifications.registration.operations;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.notifications.registration.service.NotificationsRegistrationTaskBoundService;
import defpackage.anya;
import defpackage.asnf;
import defpackage.asng;
import defpackage.asot;
import defpackage.byjl;
import defpackage.byki;
import defpackage.bykm;
import defpackage.csdt;
import defpackage.fcuj;
import defpackage.feda;
import defpackage.fqnv;
import defpackage.fqob;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class NotificationsRegistrationChimeraModuleIntentOperation extends anya {
    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        fvbo.f(intent, "intent");
        boolean z = (i & 8) > 0;
        boolean z2 = (i & 4) > 0;
        boolean z3 = z2 || z || (i & 2) > 0;
        boolean z4 = z2 || z;
        if (z3 && new feda(fqob.b().c, fqnv.a).contains(fcuj.PERIODIC_REGISTRATION)) {
            asot asotVar = NotificationsRegistrationTaskBoundService.a;
            Context applicationContext = getApplicationContext();
            fvbo.e(applicationContext, "getApplicationContext(...)");
            fvbo.f(applicationContext, "context");
            bykm bykmVar = new bykm();
            bykmVar.j(byki.EVERY_7_DAYS);
            bykmVar.w(NotificationsRegistrationTaskBoundService.class.getName());
            bykmVar.t("REGISTER_CHIME_GMS_ACCOUNTS");
            bykmVar.p = true;
            bykmVar.v(2);
            bykmVar.y(0, 1);
            bykmVar.f(0, 1);
            bykmVar.x(0, 1);
            bykmVar.t = NotificationsRegistrationTaskBoundService.b;
            byjl.a(applicationContext).f(bykmVar.b());
            asnf asnfVar = asng.a;
        }
        if (z4 && new feda(fqob.b().c, fqnv.a).contains(fcuj.APP_UPDATED)) {
            asot asotVar2 = NotificationsRegistrationTaskBoundService.a;
            Context applicationContext2 = getApplicationContext();
            fvbo.e(applicationContext2, "getApplicationContext(...)");
            fvbo.f(applicationContext2, "context");
            csdt.a(applicationContext2, "RE_REGISTER_APP_UPDATE");
        }
    }
}
