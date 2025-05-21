package com.google.android.gms.auth.account.visibility;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import defpackage.vac;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class WhitelistApplicationForGoogleAccountsIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String string;
        if (intent == null) {
            Log.w("Auth", String.format(Locale.US, "[WhitelistApplicationForGoogleAccountsIntentOperation] onHandleIntent(intent=null)", new Object[0]));
            return;
        }
        String action = intent.getAction();
        if (!"com.google.android.gms.auth.account.visibility.WHITELIST_APPLICATION".equals(action)) {
            Log.w("Auth", String.format(Locale.US, "[WhitelistApplicationForGoogleAccountsIntentOperation] onHandleIntent called with incorrect action(%s)", action));
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras == null || (string = extras.getString("calling_package")) == null) {
            Log.w("Auth", String.format(Locale.US, "[WhitelistApplicationForGoogleAccountsIntentOperation] onHandleIntent called without package name in extras(%s)", extras));
        } else {
            ((vac) vac.a.b()).b(string);
        }
    }
}
