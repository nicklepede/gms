package com.google.android.gms.auth.authzen.cryptauth;

import android.accounts.Account;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.authzen.Permit;
import defpackage.abtt;
import defpackage.abtx;
import defpackage.abuy;
import defpackage.abuz;
import defpackage.auad;
import defpackage.xgt;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AccountChangeProcessingIntentOperation extends IntentOperation {
    private static final auad a = new auad("AccountChangeProcessingIntentOperation");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        auad auadVar = a;
        auadVar.h("Received onHandleIntent() call: %s", intent);
        if (intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_ADDED")) {
            for (Parcelable parcelable : intent.getParcelableArrayExtra("accountsAdded")) {
                auadVar.h("Handling added account: %s", auad.q(parcelable));
                abtx.a(this).d(100, ((Account) parcelable).name, 7);
            }
        }
        if (intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_MUTATED")) {
            for (Parcelable parcelable2 : intent.getParcelableArrayExtra("accountsMutated")) {
                auadVar.h("Handling mutated account: %s", auad.q(parcelable2));
                abtx.a(this).d(100, ((Account) parcelable2).name, 8);
            }
        }
        if (intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED")) {
            auadVar.h("Handling account removal event.", new Object[0]);
            List<Account> c = xgt.c(intent);
            abuz abuzVar = new abuz(this);
            for (Account account : c) {
                try {
                    Iterator it = abuzVar.b(account.name).iterator();
                    while (it.hasNext()) {
                        try {
                            String str = ((Permit) it.next()).b;
                            abuz.b.h("Removing permit with permitId: %s...", auad.q(str));
                            abuz.d(abuzVar.a.a(), str);
                            sendBroadcast(abtt.a(this, str, 8), "com.google.android.gms.auth.authzen.permission.DEVICE_SYNC_FINISHED");
                        } catch (abuy e) {
                            a.f("Failed to remove permit for account %s.", auad.q(account.name), e);
                        }
                    }
                } catch (abuy unused) {
                    a.f("Failed to get permits for account: %s", auad.q(account));
                }
            }
        }
    }
}
