package com.google.android.gms.mdm.receivers;

import android.content.Intent;
import defpackage.ccuc;
import defpackage.ccuk;
import defpackage.ccut;
import defpackage.rnx;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class GoogleAccountsAddedChimeraReceiver extends AccountsChangedChimeraReceiver {
    private static boolean a;

    public static synchronized boolean a() {
        boolean z;
        synchronized (GoogleAccountsAddedChimeraReceiver.class) {
            z = a;
        }
        return z;
    }

    public static synchronized void b() {
        synchronized (GoogleAccountsAddedChimeraReceiver.class) {
            a = true;
        }
    }

    @Override // com.google.android.gms.mdm.receivers.AccountsChangedChimeraReceiver, com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (a() && "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(intent.getAction()) && intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_ADDED")) {
            long currentTimeMillis = System.currentTimeMillis() + 60000;
            int i = rnx.a;
            ccut.c();
            ccuc.i.d(1);
            ccuk.c(this, currentTimeMillis);
        }
    }
}
