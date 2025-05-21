package com.google.android.gms.wallet.intentoperation;

import android.accounts.Account;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.UserRecoverableAuthException;
import defpackage.djdj;
import defpackage.unx;
import defpackage.uoh;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class WarmUpUiIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        int intExtra = intent.getIntExtra("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", 1);
        if (intent.hasExtra("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT")) {
            try {
                uoh.f(getApplicationContext(), new Account(intent.getStringExtra("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT"), "com.google"), djdj.d(intExtra));
            } catch (UserRecoverableAuthException e) {
                Log.e("WarmUpUi", "WarmUpUiIntentOperation UserRecoverableAuthException", e);
            } catch (IOException e2) {
                Log.e("WarmUpUi", "WarmUpUiIntentOperation IOException", e2);
            } catch (unx e3) {
                Log.e("WarmUpUi", "WarmUpUiIntentOperation GoogleAuthException", e3);
            }
        }
    }
}
