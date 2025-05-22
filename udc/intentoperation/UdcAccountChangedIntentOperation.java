package com.google.android.gms.udc.intentoperation;

import android.accounts.Account;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.udc.intentoperation.UdcAccountChangedIntentOperation;
import defpackage.auqx;
import defpackage.ausn;
import defpackage.djgp;
import defpackage.djgz;
import defpackage.djms;
import defpackage.dtlr;
import defpackage.dtrf;
import defpackage.ekww;
import defpackage.eluo;
import defpackage.eqcy;
import defpackage.fvll;
import defpackage.wjw;
import defpackage.wkg;
import defpackage.xgt;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class UdcAccountChangedIntentOperation extends IntentOperation {
    private final ekww a;
    private final ekww b;

    public UdcAccountChangedIntentOperation() {
        this.a = new ekww() { // from class: djjo
            @Override // defpackage.ekww
            public final Object lK() {
                return djlr.d(UdcAccountChangedIntentOperation.this);
            }
        };
        this.b = new ekww() { // from class: djjp
            @Override // defpackage.ekww
            public final Object lK() {
                return djlr.g(UdcAccountChangedIntentOperation.this);
            }
        };
    }

    private final void a(Account account) {
        ((dtrf) this.a.lK()).a(account).b(djgp.ACCOUNT_CHANGE);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (fvll.w()) {
            Iterator it = xgt.a(intent).iterator();
            while (it.hasNext()) {
                a((Account) it.next());
            }
            Iterator it2 = xgt.b(intent).iterator();
            while (it2.hasNext()) {
                a((Account) it2.next());
            }
        }
        try {
            ((eqcy) ((dtlr) this.b.lK()).e(djgz.SYNC_ID_CUSTOM_CACHE)).u();
            ausn ausnVar = djms.a;
            HashSet hashSet = new HashSet();
            Iterator<String> it3 = getSharedPreferences("UdcConsistencyTokenPrefs", 0).getAll().keySet().iterator();
            while (it3.hasNext()) {
                String[] split = it3.next().split(":");
                if (split.length == 2 && !TextUtils.isEmpty(split[0])) {
                    hashSet.add(split[0]);
                }
            }
            Iterator it4 = auqx.h(this, "com.google.android.gms").iterator();
            while (it4.hasNext()) {
                try {
                    String b = djms.b(this, wkg.e(this, ((Account) it4.next()).name));
                    if (!TextUtils.isEmpty(b)) {
                        hashSet.remove(b);
                    }
                } catch (IOException | wjw e) {
                    ((eluo) ((eluo) djms.a.j()).s(e)).x("Could not retrieve accountId");
                }
            }
            Iterator it5 = hashSet.iterator();
            while (it5.hasNext()) {
                djms.c(this, (String) it5.next());
            }
        } catch (InterruptedException | ExecutionException e2) {
            throw new RuntimeException(e2);
        }
    }

    UdcAccountChangedIntentOperation(final dtrf dtrfVar, final dtlr dtlrVar) {
        this.a = new ekww() { // from class: djjq
            @Override // defpackage.ekww
            public final Object lK() {
                return dtrf.this;
            }
        };
        this.b = new ekww() { // from class: djjr
            @Override // defpackage.ekww
            public final Object lK() {
                return dtlr.this;
            }
        };
    }
}
