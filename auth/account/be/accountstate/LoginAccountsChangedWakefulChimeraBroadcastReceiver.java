package com.google.android.gms.auth.account.be.accountstate;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.WakefulBroadcastReceiver;
import defpackage.dhcb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class LoginAccountsChangedWakefulChimeraBroadcastReceiver extends dhcb {
    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.accounts.LOGIN_ACCOUNTS_CHANGED".equals(intent.getAction())) {
            WakefulBroadcastReceiver.startWakefulService(context, new Intent().setClassName(context, "com.google.android.gms.auth.account.be.accountstate.LoginAccountsChangedIntentService").setAction("android.accounts.LOGIN_ACCOUNTS_CHANGED"));
        }
    }
}
