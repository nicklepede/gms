package com.google.android.gms.udc.intentoperation;

import android.accounts.Account;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.udc.intentoperation.BootOrGmsUpdatedPersistentIntentOperation;
import defpackage.dgvj;
import defpackage.dgvt;
import defpackage.dgxk;
import defpackage.drbj;
import defpackage.drgx;
import defpackage.eijr;
import defpackage.enpf;
import defpackage.fspw;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class BootOrGmsUpdatedPersistentIntentOperation extends IntentOperation {
    private final eijr a;
    private final eijr b;

    public BootOrGmsUpdatedPersistentIntentOperation() {
        this.a = new eijr() { // from class: dgxz
            @Override // defpackage.eijr
            public final Object a() {
                return dhal.d(BootOrGmsUpdatedPersistentIntentOperation.this);
            }
        };
        this.b = new eijr() { // from class: dgya
            @Override // defpackage.eijr
            public final Object a() {
                return dhal.g(BootOrGmsUpdatedPersistentIntentOperation.this);
            }
        };
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null || !"com.google.android.gms.udc.intentoperation.BOOT_OR_GMS_UPDATED".equals(intent.getAction())) {
            return;
        }
        if (fspw.w()) {
            ((drgx) this.a.a()).b().b(dgvj.DEVICE_BOOT);
        }
        try {
            eijr eijrVar = this.b;
            ((enpf) ((drbj) eijrVar.a()).f()).u();
            ((enpf) ((drbj) eijrVar.a()).e(dgvt.SYNC_ID_CUSTOM_CACHE)).u();
            dgxk a = dgxk.a(this);
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
                        String c = dgxk.c(str, iArr[i]);
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

    BootOrGmsUpdatedPersistentIntentOperation(final drgx drgxVar, final drbj drbjVar) {
        this.a = new eijr() { // from class: dgxx
            @Override // defpackage.eijr
            public final Object a() {
                return drgx.this;
            }
        };
        this.b = new eijr() { // from class: dgxy
            @Override // defpackage.eijr
            public final Object a() {
                return drbj.this;
            }
        };
    }
}
