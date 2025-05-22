package com.google.android.gms.notifications.registration.service.operations;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.notifications.registration.service.NotificationsRegistrationTaskBoundService;
import defpackage.ausn;
import defpackage.cumy;
import defpackage.cuni;
import defpackage.ffja;
import defpackage.fgrt;
import defpackage.fthr;
import defpackage.fthx;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class RegistrationIdChangedIntentOperation extends cuni {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (new fgrt(fthx.b().c, fthr.a).contains(ffja.REGISTRATION_ID_CHANGED)) {
            ausn ausnVar = NotificationsRegistrationTaskBoundService.a;
            Context applicationContext = getApplicationContext();
            fxxm.e(applicationContext, "getApplicationContext(...)");
            fxxm.f(applicationContext, "context");
            cumy.a(applicationContext, "RE_REGISTER_REGISTRATION_ID_CHANGE");
        }
    }
}
