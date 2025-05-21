package com.google.android.gms.auth.account.be;

import android.accounts.Account;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import defpackage.fkdz;
import defpackage.vfz;
import defpackage.vhn;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
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
            ((vfz) vfz.a.b()).b(account, vhn.i, Long.valueOf(System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(fkdz.b())));
        } else {
            Log.i("Auth", String.format(Locale.US, "[UpdateHideDmNotificationsIntentOperation] clearing timestamp", new Object[0]));
            ((vfz) vfz.a.b()).b(account, vhn.i, null);
        }
    }
}
