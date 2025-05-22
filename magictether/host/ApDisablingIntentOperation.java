package com.google.android.gms.magictether.host;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.cead;
import defpackage.fssz;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class ApDisablingIntentOperation extends IntentOperation {
    public ApDisablingIntentOperation() {
    }

    public static PendingIntent a(Context context) {
        return IntentOperation.getPendingIntent(context, ApDisablingIntentOperation.class, new Intent("com.google.android.gms.magictether.DISABLE_SOFT_AP"), 0, 134217728);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (fssz.e() && "com.google.android.gms.magictether.DISABLE_SOFT_AP".equals(intent.getAction())) {
            new cead(this).c();
        }
    }

    ApDisablingIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
