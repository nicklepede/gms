package com.google.android.gms.constellation.checker;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.auad;
import defpackage.auio;
import defpackage.aupp;
import defpackage.aupq;
import defpackage.auzl;
import defpackage.avbe;
import defpackage.avbf;
import defpackage.avdo;
import defpackage.avpa;
import defpackage.avpz;
import defpackage.avqe;
import defpackage.avqj;
import defpackage.bsxr;
import defpackage.bsxv;
import defpackage.ekww;
import defpackage.eqju;
import defpackage.fpcz;
import defpackage.fpeg;
import defpackage.fxxm;
import defpackage.xgt;
import j$.util.Objects;
import java.util.List;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class GaiaIdChecker extends IntentOperation {
    private static final auad a = avqj.a("gaia_id_checker");
    private long b = 0;
    private avdo c;

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!fpeg.a.lK().p()) {
            a.h("GAIA id checker has been disabled.", new Object[0]);
            return;
        }
        boolean equals = Objects.equals(intent.getAction(), "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE");
        boolean hasCategory = intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_ADDED");
        boolean hasCategory2 = intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED");
        boolean c = fpcz.c();
        if (!equals || (!hasCategory && (!c || !hasCategory2))) {
            a.m("Get an unexpected intent:".concat(String.valueOf(String.valueOf(intent))), new Object[0]);
            return;
        }
        UUID randomUUID = UUID.randomUUID();
        Context applicationContext = getApplicationContext();
        this.c = new avdo(applicationContext);
        avpz a2 = avpz.a(applicationContext);
        this.b = System.currentTimeMillis();
        avbe avbeVar = new avbe(a2);
        if (intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_ADDED")) {
            String uuid = randomUUID.toString();
            if (fpcz.c()) {
                List a3 = xgt.a(intent);
                avdo avdoVar = this.c;
                Context applicationContext2 = getApplicationContext();
                fxxm.f(a3, "accounts");
                avdoVar.a(applicationContext2, uuid);
            }
        }
        if (intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED")) {
            String uuid2 = randomUUID.toString();
            if (fpcz.c()) {
                List d = xgt.d(intent);
                avdo avdoVar2 = this.c;
                Context applicationContext3 = getApplicationContext();
                fxxm.f(d, "accounts");
                avdoVar2.a(applicationContext3, uuid2);
            }
        }
        avpa.a(applicationContext);
        if (!avpa.b(applicationContext)) {
            avbeVar.a(randomUUID, 8, new avqe(eqju.CHECKER_TRIGGERED_NO_NETWORK, false), this.b);
        }
        avbeVar.b(randomUUID, 8, this.b);
        aupq aupqVar = new aupq(10);
        ekww ekwwVar = bsxv.a;
        bsxr.a(auio.CONSTELLATION_BACKGROUND_GAIAID_CHECKER);
        auzl.h();
        auzl.g(applicationContext, randomUUID, 4, new avbf(avbeVar, a, randomUUID, 6, new aupp(aupqVar), false, this.b));
    }
}
