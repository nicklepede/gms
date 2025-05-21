package com.google.android.gms.people.api.operations;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.people.service.wipeout.PeopleAndroidUriWipeoutTask;
import defpackage.ctku;
import defpackage.cveq;
import defpackage.cvet;
import defpackage.cveu;
import defpackage.frhb;
import defpackage.vks;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class AccountChangeIntentOperation extends IntentOperation {
    private final cvet a;
    private final Runnable b;

    public AccountChangeIntentOperation() {
        this(cveu.a, new Runnable() { // from class: ctla
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
            List a = vks.a(intent);
            if (frhb.c()) {
                ctku.d(a);
            }
        }
        if (intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED")) {
            List c = vks.c(intent);
            Iterator it = c.iterator();
            while (it.hasNext()) {
                cveq.a(this).d(((Account) it.next()).name, null);
            }
            if (frhb.c()) {
                ctku.b(c);
            }
            this.b.run();
        }
    }

    public AccountChangeIntentOperation(cvet cvetVar, Runnable runnable) {
        this.a = cvetVar;
        this.b = runnable;
    }
}
