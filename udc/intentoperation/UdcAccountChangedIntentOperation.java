package com.google.android.gms.udc.intentoperation;

import android.accounts.Account;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.udc.intentoperation.UdcAccountChangedIntentOperation;
import defpackage.asnd;
import defpackage.asot;
import defpackage.dgvj;
import defpackage.dgvt;
import defpackage.dhbm;
import defpackage.drbj;
import defpackage.drgx;
import defpackage.eijr;
import defpackage.ejhf;
import defpackage.enpf;
import defpackage.fspw;
import defpackage.unx;
import defpackage.uoh;
import defpackage.vks;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class UdcAccountChangedIntentOperation extends IntentOperation {
    private final eijr a;
    private final eijr b;

    public UdcAccountChangedIntentOperation() {
        this.a = new eijr() { // from class: dgyi
            @Override // defpackage.eijr
            public final Object a() {
                return dhal.d(UdcAccountChangedIntentOperation.this);
            }
        };
        this.b = new eijr() { // from class: dgyj
            @Override // defpackage.eijr
            public final Object a() {
                return dhal.g(UdcAccountChangedIntentOperation.this);
            }
        };
    }

    private final void a(Account account) {
        ((drgx) this.a.a()).a(account).b(dgvj.ACCOUNT_CHANGE);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (fspw.w()) {
            Iterator it = vks.a(intent).iterator();
            while (it.hasNext()) {
                a((Account) it.next());
            }
            Iterator it2 = vks.b(intent).iterator();
            while (it2.hasNext()) {
                a((Account) it2.next());
            }
        }
        try {
            ((enpf) ((drbj) this.b.a()).e(dgvt.SYNC_ID_CUSTOM_CACHE)).u();
            asot asotVar = dhbm.a;
            HashSet hashSet = new HashSet();
            Iterator<String> it3 = getSharedPreferences("UdcConsistencyTokenPrefs", 0).getAll().keySet().iterator();
            while (it3.hasNext()) {
                String[] split = it3.next().split(":");
                if (split.length == 2 && !TextUtils.isEmpty(split[0])) {
                    hashSet.add(split[0]);
                }
            }
            Iterator it4 = asnd.h(this, "com.google.android.gms").iterator();
            while (it4.hasNext()) {
                try {
                    String b = dhbm.b(this, uoh.e(this, ((Account) it4.next()).name));
                    if (!TextUtils.isEmpty(b)) {
                        hashSet.remove(b);
                    }
                } catch (IOException | unx e) {
                    ((ejhf) ((ejhf) dhbm.a.j()).s(e)).x("Could not retrieve accountId");
                }
            }
            Iterator it5 = hashSet.iterator();
            while (it5.hasNext()) {
                dhbm.c(this, (String) it5.next());
            }
        } catch (InterruptedException | ExecutionException e2) {
            throw new RuntimeException(e2);
        }
    }

    UdcAccountChangedIntentOperation(final drgx drgxVar, final drbj drbjVar) {
        this.a = new eijr() { // from class: dgyk
            @Override // defpackage.eijr
            public final Object a() {
                return drgx.this;
            }
        };
        this.b = new eijr() { // from class: dgyl
            @Override // defpackage.eijr
            public final Object a() {
                return drbj.this;
            }
        };
    }
}
