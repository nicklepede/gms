package com.google.android.gms.udc.intentoperation;

import android.accounts.Account;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.udc.intentoperation.BootOrGmsUpdatedPersistentIntentOperation;
import defpackage.djgp;
import defpackage.djgz;
import defpackage.djiq;
import defpackage.dtlr;
import defpackage.dtrf;
import defpackage.ekww;
import defpackage.eqcy;
import defpackage.fvll;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class BootOrGmsUpdatedPersistentIntentOperation extends IntentOperation {
    private final ekww a;
    private final ekww b;

    public BootOrGmsUpdatedPersistentIntentOperation() {
        this.a = new ekww() { // from class: djjf
            @Override // defpackage.ekww
            public final Object lK() {
                return djlr.d(BootOrGmsUpdatedPersistentIntentOperation.this);
            }
        };
        this.b = new ekww() { // from class: djjg
            @Override // defpackage.ekww
            public final Object lK() {
                return djlr.g(BootOrGmsUpdatedPersistentIntentOperation.this);
            }
        };
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null || !"com.google.android.gms.udc.intentoperation.BOOT_OR_GMS_UPDATED".equals(intent.getAction())) {
            return;
        }
        if (fvll.w()) {
            ((dtrf) this.a.lK()).b().b(djgp.DEVICE_BOOT);
        }
        try {
            ekww ekwwVar = this.b;
            ((eqcy) ((dtlr) ekwwVar.lK()).f()).u();
            ((eqcy) ((dtlr) ekwwVar.lK()).e(djgz.SYNC_ID_CUSTOM_CACHE)).u();
            djiq a = djiq.a(this);
            SharedPreferences sharedPreferences = a.b;
            synchronized (sharedPreferences) {
                if (a.g()) {
                    return;
                }
                Set<String> e = a.e();
                for (Account account : a.c.p("com.google")) {
                    e.add(account.name);
                }
                SharedPreferences.Editor edit = sharedPreferences.edit();
                for (String str : e) {
                    int[] iArr = {10, 9};
                    for (int i = 0; i < 2; i++) {
                        String c = djiq.c(str, iArr[i]);
                        edit.putBoolean(c, sharedPreferences.getBoolean(c, false));
                    }
                }
                edit.putBoolean("is-migrated", true);
                edit.apply();
            }
        } catch (InterruptedException | ExecutionException e2) {
            throw new RuntimeException(e2);
        }
    }

    BootOrGmsUpdatedPersistentIntentOperation(final dtrf dtrfVar, final dtlr dtlrVar) {
        this.a = new ekww() { // from class: djjd
            @Override // defpackage.ekww
            public final Object lK() {
                return dtrf.this;
            }
        };
        this.b = new ekww() { // from class: djje
            @Override // defpackage.ekww
            public final Object lK() {
                return dtlr.this;
            }
        };
    }
}
