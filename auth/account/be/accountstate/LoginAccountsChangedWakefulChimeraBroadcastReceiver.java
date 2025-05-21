package com.google.android.gms.auth.account.be.accountstate;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.WakefulBroadcastReceiver;
import defpackage.deqy;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class LoginAccountsChangedWakefulChimeraBroadcastReceiver extends deqy {
    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.accounts.LOGIN_ACCOUNTS_CHANGED".equals(intent.getAction())) {
            WakefulBroadcastReceiver.startWakefulService(context, new Intent().setClassName(context, "com.google.android.gms.auth.account.be.accountstate.LoginAccountsChangedIntentService").setAction("android.accounts.LOGIN_ACCOUNTS_CHANGED"));
        }
    }
}
