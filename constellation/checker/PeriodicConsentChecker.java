package com.google.android.gms.constellation.checker;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.chimera.IntentOperation;
import defpackage.auad;
import defpackage.auio;
import defpackage.aupp;
import defpackage.aupq;
import defpackage.auzl;
import defpackage.avbe;
import defpackage.avbf;
import defpackage.avbg;
import defpackage.avbl;
import defpackage.avdl;
import defpackage.avdz;
import defpackage.avpa;
import defpackage.avpz;
import defpackage.avqe;
import defpackage.avqj;
import defpackage.bsxr;
import defpackage.bsxv;
import defpackage.ekww;
import defpackage.eqju;
import defpackage.eqkj;
import defpackage.fpeg;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.Locale;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class PeriodicConsentChecker extends IntentOperation {
    private static final auad a = avqj.a("periodic_consent_checker");
    private Context b;
    private avpz c;

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        long currentTimeMillis;
        this.b = getApplicationContext().getApplicationContext();
        if (!fpeg.a.lK().s()) {
            a.h("periodic consent checker is disabled.", new Object[0]);
            return;
        }
        UUID randomUUID = UUID.randomUUID();
        this.c = avpz.a(this.b);
        avbe avbeVar = new avbe(this.c);
        long a2 = avdl.b().a(this.b).a();
        if (a2 > 0) {
            currentTimeMillis = a2 + (fpeg.b() * 1000);
        } else {
            if (fpeg.c() > 0) {
                currentTimeMillis = ((avdz) avdl.b().a(this.b)).c.getLong("jittered_timestamp_for_initial_consent_check_millis", -1L);
                if (currentTimeMillis <= 0) {
                    long c = fpeg.c();
                    if (c > 0) {
                        currentTimeMillis = ThreadLocalRandom.current().nextLong(c) + System.currentTimeMillis();
                        SharedPreferences.Editor edit = ((avdz) avdl.b().a(this.b)).c.edit();
                        edit.putLong("jittered_timestamp_for_initial_consent_check_millis", currentTimeMillis);
                        edit.apply();
                    }
                }
            }
            currentTimeMillis = System.currentTimeMillis();
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        if (currentTimeMillis <= currentTimeMillis2) {
            if (!avbg.b(avdl.b().a(this.b))) {
                avpa.a(this.b);
                if (!avpa.b(this.b)) {
                    avbeVar.a(randomUUID, 5, new avqe(eqju.CHECKER_TRIGGERED_NO_NETWORK, false), currentTimeMillis2);
                }
                aupq aupqVar = new aupq(10);
                avbeVar.b(randomUUID, 5, currentTimeMillis2);
                ekww ekwwVar = bsxv.a;
                bsxr.a(auio.CONSTELLATION_BACKGROUND_PERIODIC_CONSENT_CHECKER);
                auzl.h();
                Context context = this.b;
                avbf avbfVar = new avbf(avbeVar, a, randomUUID, eqkj.a(5), new aupp(aupqVar), false, currentTimeMillis2);
                randomUUID = randomUUID;
                auzl.g(context, randomUUID, 1, avbfVar);
            } else if (fpeg.i()) {
                avbeVar.a(randomUUID, 5, new avqe(eqju.CHECKER_INACTIVE, false), currentTimeMillis2);
            }
            avdl.b().a(this.b).q(System.currentTimeMillis());
        } else if (fpeg.i()) {
            avbeVar.a(randomUUID, 5, new avqe(String.format(Locale.US, "nextConsentCheckTimeMillis: %d, currentTimeMillis: %d", Long.valueOf(currentTimeMillis), Long.valueOf(currentTimeMillis2)), eqju.CHECKER_TOO_SOON, false), currentTimeMillis2);
        }
        if (fpeg.g()) {
            avbl.c(this.b).h(randomUUID.toString(), "PERIODIC_CLIENT_STATE_TRIGGER");
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
    }
}
