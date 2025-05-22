package com.google.android.gms.wallet.intentoperation;

import android.accounts.Account;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.UserRecoverableAuthException;
import defpackage.dlpc;
import defpackage.wjw;
import defpackage.wkg;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class WarmUpUiIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        int intExtra = intent.getIntExtra("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", 1);
        if (intent.hasExtra("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT")) {
            try {
                wkg.f(getApplicationContext(), new Account(intent.getStringExtra("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT"), "com.google"), dlpc.d(intExtra));
            } catch (UserRecoverableAuthException e) {
                Log.e("WarmUpUi", "WarmUpUiIntentOperation UserRecoverableAuthException", e);
            } catch (IOException e2) {
                Log.e("WarmUpUi", "WarmUpUiIntentOperation IOException", e2);
            } catch (wjw e3) {
                Log.e("WarmUpUi", "WarmUpUiIntentOperation GoogleAuthException", e3);
            }
        }
    }
}
