package com.google.android.gms.auth.proximity;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.aemy;
import defpackage.auad;
import defpackage.auqx;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ForceSyncFirstAccountIntentOperation extends IntentOperation {
    public static final /* synthetic */ int a = 0;
    private static final auad b = new auad("ProximityAuth", "ForceSyncFirstAccount");

    public ForceSyncFirstAccountIntentOperation() {
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null || !"com.google.android.gms.auth.proximity.FORCE_DEVICE_SYNC".equals(intent.getAction())) {
            return;
        }
        List h = auqx.h(this, getPackageName());
        if (h.isEmpty()) {
            b.m("No valid accounts could be fetched.", new Object[0]);
        } else {
            int i = aemy.a;
            aemy.a(this, (Account) h.get(0));
        }
    }

    ForceSyncFirstAccountIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
