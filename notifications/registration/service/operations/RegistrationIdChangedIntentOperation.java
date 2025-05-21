package com.google.android.gms.notifications.registration.service.operations;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.notifications.registration.service.NotificationsRegistrationTaskBoundService;
import defpackage.asot;
import defpackage.csdt;
import defpackage.csed;
import defpackage.fcuj;
import defpackage.feda;
import defpackage.fqnv;
import defpackage.fqob;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class RegistrationIdChangedIntentOperation extends csed {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (new feda(fqob.b().c, fqnv.a).contains(fcuj.REGISTRATION_ID_CHANGED)) {
            asot asotVar = NotificationsRegistrationTaskBoundService.a;
            Context applicationContext = getApplicationContext();
            fvbo.e(applicationContext, "getApplicationContext(...)");
            fvbo.f(applicationContext, "context");
            csdt.a(applicationContext, "RE_REGISTER_REGISTRATION_ID_CHANGE");
        }
    }
}
