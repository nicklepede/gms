package com.google.android.gms.auth.account.be;

import android.accounts.Account;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import defpackage.fmul;
import defpackage.xca;
import defpackage.xdo;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class UpdateHideDmNotificationsIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("hide_notifications", false);
        Account account = (Account) intent.getParcelableExtra("account_name");
        if (account == null) {
            Log.w("Auth", String.format(Locale.US, "[UpdateHideDmNotificationsIntentOperation] account was not provided.", new Object[0]));
        } else if (booleanExtra) {
            Log.i("Auth", String.format(Locale.US, "[UpdateHideDmNotificationsIntentOperation] setting timestamp", new Object[0]));
            ((xca) xca.a.b()).b(account, xdo.i, Long.valueOf(System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(fmul.b())));
        } else {
            Log.i("Auth", String.format(Locale.US, "[UpdateHideDmNotificationsIntentOperation] clearing timestamp", new Object[0]));
            ((xca) xca.a.b()).b(account, xdo.i, null);
        }
    }
}
