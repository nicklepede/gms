package com.google.android.gms.notifications.registration.service.operations;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.notifications.registration.service.NotificationsRegistrationTaskBoundService;
import defpackage.ausn;
import defpackage.cumy;
import defpackage.cung;
import defpackage.ffja;
import defpackage.fgrt;
import defpackage.fthr;
import defpackage.fthx;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class BlockStateChangeIntentOperation extends cung {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action;
        if (intent == null || (action = intent.getAction()) == null) {
            return;
        }
        int hashCode = action.hashCode();
        if (hashCode == 452039370) {
            if (action.equals("android.app.action.APP_BLOCK_STATE_CHANGED") && new fgrt(fthx.b().c, fthr.a).contains(ffja.APP_BLOCK_STATE_CHANGED)) {
                ausn ausnVar = NotificationsRegistrationTaskBoundService.a;
                Context applicationContext = getApplicationContext();
                fxxm.e(applicationContext, "getApplicationContext(...)");
                fxxm.f(applicationContext, "context");
                cumy.a(applicationContext, "RE_REGISTER_APP_BLOCK_STATE");
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
        if (new fgrt(fthx.b().c, fthr.a).contains(ffja.CHANNEL_BLOCK_STATE_CHANGED)) {
            ausn ausnVar2 = NotificationsRegistrationTaskBoundService.a;
            Context applicationContext2 = getApplicationContext();
            fxxm.e(applicationContext2, "getApplicationContext(...)");
            fxxm.f(applicationContext2, "context");
            cumy.a(applicationContext2, "RE_REGISTER_CHANNEL_BLOCK_STATE");
        }
    }
}
