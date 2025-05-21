package com.google.android.gms.magictether.host;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.cbrl;
import defpackage.fpzd;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class ApDisablingIntentOperation extends IntentOperation {
    public ApDisablingIntentOperation() {
    }

    public static PendingIntent a(Context context) {
        return IntentOperation.getPendingIntent(context, ApDisablingIntentOperation.class, new Intent("com.google.android.gms.magictether.DISABLE_SOFT_AP"), 0, 134217728);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (fpzd.e() && "com.google.android.gms.magictether.DISABLE_SOFT_AP".equals(intent.getAction())) {
            new cbrl(this).c();
        }
    }

    ApDisablingIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
