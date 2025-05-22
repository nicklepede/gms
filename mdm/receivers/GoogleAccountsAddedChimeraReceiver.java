package com.google.android.gms.mdm.receivers;

import android.content.Intent;
import defpackage.cfcw;
import defpackage.cfde;
import defpackage.cfdn;
import defpackage.thb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
            int i = thb.a;
            cfdn.c();
            cfcw.i.d(1);
            cfde.c(this, currentTimeMillis);
        }
    }
}
