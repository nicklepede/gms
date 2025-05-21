package com.google.android.gms.notifications.registration.service.operations;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.notifications.registration.service.NotificationsRegistrationTaskBoundService;
import defpackage.asot;
import defpackage.csdt;
import defpackage.cseb;
import defpackage.fcuj;
import defpackage.feda;
import defpackage.fqnv;
import defpackage.fqob;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class BlockStateChangeIntentOperation extends cseb {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action;
        if (intent == null || (action = intent.getAction()) == null) {
            return;
        }
        int hashCode = action.hashCode();
        if (hashCode == 452039370) {
            if (action.equals("android.app.action.APP_BLOCK_STATE_CHANGED") && new feda(fqob.b().c, fqnv.a).contains(fcuj.APP_BLOCK_STATE_CHANGED)) {
                asot asotVar = NotificationsRegistrationTaskBoundService.a;
                Context applicationContext = getApplicationContext();
                fvbo.e(applicationContext, "getApplicationContext(...)");
                fvbo.f(applicationContext, "context");
                csdt.a(applicationContext, "RE_REGISTER_APP_BLOCK_STATE");
                return;
            }
            return;
        }
        if (hashCode != 806551504) {
            if (hashCode != 1171977904 || !action.equals("android.app.action.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED")) {
                return;
            }
        } else if (!action.equals("android.app.action.NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED")) {
            return;
        }
        if (new feda(fqob.b().c, fqnv.a).contains(fcuj.CHANNEL_BLOCK_STATE_CHANGED)) {
            asot asotVar2 = NotificationsRegistrationTaskBoundService.a;
            Context applicationContext2 = getApplicationContext();
            fvbo.e(applicationContext2, "getApplicationContext(...)");
            fvbo.f(applicationContext2, "context");
            csdt.a(applicationContext2, "RE_REGISTER_CHANNEL_BLOCK_STATE");
        }
    }
}
