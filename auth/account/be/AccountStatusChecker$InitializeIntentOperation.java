package com.google.android.gms.auth.account.be;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.bsup;
import defpackage.wzv;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AccountStatusChecker$InitializeIntentOperation extends IntentOperation {
    public static final /* synthetic */ int a = 0;
    private static final String[] b = {"com.google", "com.google.work", "cn.google"};
    private wzv c;
    private bsup d;

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        bsup b2 = bsup.b(this);
        this.c = new wzv(this, b2);
        this.d = b2;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String[] strArr = b;
        for (int i = 0; i < 3; i++) {
            for (Account account : this.d.p(strArr[i])) {
                this.c.a(account);
            }
        }
    }
}
