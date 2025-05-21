package com.google.android.gms.languageprofile.service;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.asej;
import defpackage.asot;
import defpackage.bqbx;
import defpackage.bqde;
import defpackage.bqed;
import defpackage.byxs;
import defpackage.eiid;
import defpackage.eijr;
import defpackage.eitj;
import defpackage.ejcb;
import defpackage.ejhf;
import defpackage.enpf;
import defpackage.fpjt;
import defpackage.fpjy;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class AccountsChangedIntentOperation extends IntentOperation {
    private static final asot a = asot.b("AccountsChangedIntentOp", asej.LANGUAGE_PROFILE);
    private final eijr b;

    public AccountsChangedIntentOperation() {
        this.b = new eijr() { // from class: bqcz
            @Override // defpackage.eijr
            public final Object a() {
                return bqcn.c();
            }
        };
    }

    public static eiid a(Context context) {
        return eiid.i(IntentOperation.getStartIntent(context, AccountsChangedIntentOperation.class, "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE"));
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        eitj b = bqed.a().b();
        if (fpjt.a.a().A()) {
            int i = ((ejcb) b).c;
            for (int i2 = 0; i2 < i; i2++) {
                String str = (String) b.get(i2);
                try {
                    bqde.a().b(str).get(fpjt.a.a().i(), TimeUnit.MILLISECONDS);
                    bqed.a().h(str);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    ((ejhf) ((ejhf) a.i()).s(e)).x("Interruption occurred during scheduling a one time sync");
                } catch (Exception e2) {
                    ((ejhf) ((ejhf) a.i()).s(e2)).x("Exception while subscribing");
                }
            }
        }
        for (String str2 : bqed.a().g()) {
            try {
                ((ejhf) a.h()).x("Unsubscribe deleted account.");
                bqed.a().k(str2);
            } catch (RuntimeException e3) {
                ((ejhf) ((ejhf) a.i()).s(e3)).B("Exception while unsubscribing: %s", e3);
            }
        }
        if (fpjy.e()) {
            try {
                ((enpf) ((byxs) this.b.a()).e(bqbx.SYNC_ID_WIPEOUT)).u();
            } catch (InterruptedException e4) {
                Thread.currentThread().interrupt();
                ((ejhf) ((ejhf) a.i()).s(e4)).x("Interruption occurred during scheduling a one time sync");
            } catch (ExecutionException e5) {
                ((ejhf) ((ejhf) a.i()).s(e5)).x("Error while scheduling a one time sync");
            }
        }
    }

    AccountsChangedIntentOperation(eijr eijrVar) {
        this.b = eijrVar;
    }
}
