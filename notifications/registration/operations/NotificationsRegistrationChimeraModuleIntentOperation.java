package com.google.android.gms.notifications.registration.operations;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.notifications.registration.service.NotificationsRegistrationTaskBoundService;
import defpackage.apzs;
import defpackage.auqz;
import defpackage.aura;
import defpackage.ausn;
import defpackage.casd;
import defpackage.cata;
import defpackage.cate;
import defpackage.cumy;
import defpackage.ffja;
import defpackage.fgrt;
import defpackage.fthr;
import defpackage.fthx;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class NotificationsRegistrationChimeraModuleIntentOperation extends apzs {
    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        fxxm.f(intent, "intent");
        boolean z = (i & 8) > 0;
        boolean z2 = (i & 4) > 0;
        boolean z3 = z2 || z || (i & 2) > 0;
        boolean z4 = z2 || z;
        if (z3 && new fgrt(fthx.b().c, fthr.a).contains(ffja.PERIODIC_REGISTRATION)) {
            ausn ausnVar = NotificationsRegistrationTaskBoundService.a;
            Context applicationContext = getApplicationContext();
            fxxm.e(applicationContext, "getApplicationContext(...)");
            fxxm.f(applicationContext, "context");
            cate cateVar = new cate();
            cateVar.j(cata.EVERY_7_DAYS);
            cateVar.w(NotificationsRegistrationTaskBoundService.class.getName());
            cateVar.t("REGISTER_CHIME_GMS_ACCOUNTS");
            cateVar.p = true;
            cateVar.v(2);
            cateVar.y(0, 1);
            cateVar.f(0, 1);
            cateVar.x(0, 1);
            cateVar.t = NotificationsRegistrationTaskBoundService.b;
            casd.a(applicationContext).f(cateVar.b());
            auqz auqzVar = aura.a;
        }
        if (z4 && new fgrt(fthx.b().c, fthr.a).contains(ffja.APP_UPDATED)) {
            ausn ausnVar2 = NotificationsRegistrationTaskBoundService.a;
            Context applicationContext2 = getApplicationContext();
            fxxm.e(applicationContext2, "getApplicationContext(...)");
            fxxm.f(applicationContext2, "context");
            cumy.a(applicationContext2, "RE_REGISTER_APP_UPDATE");
        }
    }
}
