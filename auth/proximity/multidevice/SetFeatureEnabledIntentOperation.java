package com.google.android.gms.auth.proximity.multidevice;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.aend;
import defpackage.aenr;
import defpackage.elkk;
import defpackage.euzc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SetFeatureEnabledIntentOperation extends IntentOperation {
    public SetFeatureEnabledIntentOperation() {
    }

    public static Intent a(Context context, String str, euzc euzcVar, boolean z) {
        Intent startIntent = IntentOperation.getStartIntent(context, SetFeatureEnabledIntentOperation.class, "com.google.android.gms.auth.proximity.multidevice.SET_FEATURE_ENABLED");
        startIntent.putExtra("EXTRA_ACCOUNT_NAME", str);
        startIntent.putExtra("EXTRA_FEATURE_NAME", euzcVar.name());
        startIntent.putExtra("EXTRA_ENABLED", z);
        return startIntent;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String stringExtra = intent.getStringExtra("EXTRA_ACCOUNT_NAME");
        String stringExtra2 = intent.getStringExtra("EXTRA_FEATURE_NAME");
        boolean booleanExtra = intent.getBooleanExtra("EXTRA_ENABLED", false);
        if (stringExtra == null || aend.b(this, stringExtra) == null) {
            return;
        }
        int i = aenr.a;
        aenr.d(elkk.d(stringExtra2), booleanExtra, stringExtra, this, true);
    }

    public SetFeatureEnabledIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
