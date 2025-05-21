package com.google.android.gms.auth.authzen.cryptauth;

import android.accounts.Account;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.authzen.Permit;
import defpackage.arxo;
import defpackage.vks;
import defpackage.ztt;
import defpackage.ztx;
import defpackage.zuy;
import defpackage.zuz;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AccountChangeProcessingIntentOperation extends IntentOperation {
    private static final arxo a = new arxo("AccountChangeProcessingIntentOperation");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        arxo arxoVar = a;
        arxoVar.h("Received onHandleIntent() call: %s", intent);
        if (intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_ADDED")) {
            for (Parcelable parcelable : intent.getParcelableArrayExtra("accountsAdded")) {
                arxoVar.h("Handling added account: %s", arxo.q(parcelable));
                ztx.a(this).d(100, ((Account) parcelable).name, 7);
            }
        }
        if (intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_MUTATED")) {
            for (Parcelable parcelable2 : intent.getParcelableArrayExtra("accountsMutated")) {
                arxoVar.h("Handling mutated account: %s", arxo.q(parcelable2));
                ztx.a(this).d(100, ((Account) parcelable2).name, 8);
            }
        }
        if (intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED")) {
            arxoVar.h("Handling account removal event.", new Object[0]);
            List<Account> c = vks.c(intent);
            zuz zuzVar = new zuz(this);
            for (Account account : c) {
                try {
                    Iterator it = zuzVar.b(account.name).iterator();
                    while (it.hasNext()) {
                        try {
                            String str = ((Permit) it.next()).b;
                            zuz.b.h("Removing permit with permitId: %s...", arxo.q(str));
                            zuz.d(zuzVar.a.a(), str);
                            sendBroadcast(ztt.a(this, str, 8), "com.google.android.gms.auth.authzen.permission.DEVICE_SYNC_FINISHED");
                        } catch (zuy e) {
                            a.f("Failed to remove permit for account %s.", arxo.q(account.name), e);
                        }
                    }
                } catch (zuy unused) {
                    a.f("Failed to get permits for account: %s", arxo.q(account));
                }
            }
        }
    }
}
