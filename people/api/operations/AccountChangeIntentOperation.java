package com.google.android.gms.people.api.operations;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.people.service.wipeout.PeopleAndroidUriWipeoutTask;
import defpackage.cvua;
import defpackage.cxnz;
import defpackage.cxoc;
import defpackage.cxod;
import defpackage.fuaw;
import defpackage.xgt;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class AccountChangeIntentOperation extends IntentOperation {
    private final cxoc a;
    private final Runnable b;

    public AccountChangeIntentOperation() {
        this(cxod.a, new Runnable() { // from class: cvug
            @Override // java.lang.Runnable
            public final void run() {
                PeopleAndroidUriWipeoutTask.d();
            }
        });
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        intent.getAction();
        this.a.a();
        if (intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_ADDED")) {
            List a = xgt.a(intent);
            if (fuaw.c()) {
                cvua.d(a);
            }
        }
        if (intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED")) {
            List c = xgt.c(intent);
            Iterator it = c.iterator();
            while (it.hasNext()) {
                cxnz.a(this).d(((Account) it.next()).name, null);
            }
            if (fuaw.c()) {
                cvua.b(c);
            }
            this.b.run();
        }
    }

    public AccountChangeIntentOperation(cxoc cxocVar, Runnable runnable) {
        this.a = cxocVar;
        this.b = runnable;
    }
}
