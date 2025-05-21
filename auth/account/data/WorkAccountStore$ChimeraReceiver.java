package com.google.android.gms.auth.account.data;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.chimera.BroadcastReceiver;
import defpackage.uuf;
import defpackage.vks;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class WorkAccountStore$ChimeraReceiver extends BroadcastReceiver {
    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(intent.getAction()) && intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED")) {
            uuf uufVar = (uuf) uuf.a.b();
            List<Account> c = vks.c(intent);
            SharedPreferences.Editor edit = uufVar.b.edit();
            for (Account account : c) {
                if ("com.google.work".equals(account.type)) {
                    edit.remove(account.name);
                }
            }
            edit.apply();
        }
    }
}
