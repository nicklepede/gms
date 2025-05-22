package com.google.android.gms.auth.account.data;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.chimera.BroadcastReceiver;
import defpackage.wqe;
import defpackage.xgt;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class WorkAccountStore$ChimeraReceiver extends BroadcastReceiver {
    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(intent.getAction()) && intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED")) {
            wqe wqeVar = (wqe) wqe.a.b();
            List<Account> c = xgt.c(intent);
            SharedPreferences.Editor edit = wqeVar.b.edit();
            for (Account account : c) {
                if ("com.google.work".equals(account.type)) {
                    edit.remove(account.name);
                }
            }
            edit.apply();
        }
    }
}
