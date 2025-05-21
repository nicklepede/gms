package com.google.android.gms.auth.account.be;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.bqna;
import defpackage.vdu;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AccountStatusChecker$InitializeIntentOperation extends IntentOperation {
    public static final /* synthetic */ int a = 0;
    private static final String[] b = {"com.google", "com.google.work", "cn.google"};
    private vdu c;
    private bqna d;

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        bqna b2 = bqna.b(this);
        this.c = new vdu(this, b2);
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
