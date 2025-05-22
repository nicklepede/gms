package com.google.android.gms.languageprofile.service;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bsjn;
import defpackage.bsku;
import defpackage.bslt;
import defpackage.cbgj;
import defpackage.ekvi;
import defpackage.ekww;
import defpackage.elgo;
import defpackage.elpg;
import defpackage.eluo;
import defpackage.eqcy;
import defpackage.fsdk;
import defpackage.fsdp;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class AccountsChangedIntentOperation extends IntentOperation {
    private static final ausn a = ausn.b("AccountsChangedIntentOp", auid.LANGUAGE_PROFILE);
    private final ekww b;

    public AccountsChangedIntentOperation() {
        this.b = new ekww() { // from class: bskp
            @Override // defpackage.ekww
            public final Object lK() {
                return bskd.c();
            }
        };
    }

    public static ekvi a(Context context) {
        return ekvi.i(IntentOperation.getStartIntent(context, AccountsChangedIntentOperation.class, "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE"));
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        elgo b = bslt.a().b();
        fsdk fsdkVar = fsdk.a;
        if (fsdkVar.lK().z()) {
            int i = ((elpg) b).c;
            for (int i2 = 0; i2 < i; i2++) {
                String str = (String) b.get(i2);
                try {
                    bsku.a().b(str).get(fsdkVar.lK().i(), TimeUnit.MILLISECONDS);
                    bslt.a().h(str);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    ((eluo) ((eluo) a.i()).s(e)).x("Interruption occurred during scheduling a one time sync");
                } catch (Exception e2) {
                    ((eluo) ((eluo) a.i()).s(e2)).x("Exception while subscribing");
                }
            }
        }
        for (String str2 : bslt.a().g()) {
            try {
                ((eluo) a.h()).x("Unsubscribe deleted account.");
                bslt.a().k(str2);
            } catch (RuntimeException e3) {
                ((eluo) ((eluo) a.i()).s(e3)).B("Exception while unsubscribing: %s", e3);
            }
        }
        if (fsdp.e()) {
            try {
                ((eqcy) ((cbgj) this.b.lK()).e(bsjn.SYNC_ID_WIPEOUT)).u();
            } catch (InterruptedException e4) {
                Thread.currentThread().interrupt();
                ((eluo) ((eluo) a.i()).s(e4)).x("Interruption occurred during scheduling a one time sync");
            } catch (ExecutionException e5) {
                ((eluo) ((eluo) a.i()).s(e5)).x("Error while scheduling a one time sync");
            }
        }
    }

    AccountsChangedIntentOperation(ekww ekwwVar) {
        this.b = ekwwVar;
    }
}
