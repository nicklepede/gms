package com.google.android.gms.constellation.checker;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.chimera.IntentOperation;
import defpackage.arxo;
import defpackage.aseu;
import defpackage.aslv;
import defpackage.aslw;
import defpackage.asvp;
import defpackage.asxb;
import defpackage.asxc;
import defpackage.asxd;
import defpackage.asxi;
import defpackage.aszi;
import defpackage.aszw;
import defpackage.atkx;
import defpackage.atlw;
import defpackage.atmb;
import defpackage.atmg;
import defpackage.bqqa;
import defpackage.bqqe;
import defpackage.eijr;
import defpackage.enwb;
import defpackage.enwq;
import defpackage.fmml;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.Locale;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class PeriodicConsentChecker extends IntentOperation {
    private static final arxo a = atmg.a("periodic_consent_checker");
    private Context b;
    private atlw c;

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        long currentTimeMillis;
        this.b = getApplicationContext().getApplicationContext();
        if (!fmml.a.a().s()) {
            a.h("periodic consent checker is disabled.", new Object[0]);
            return;
        }
        UUID randomUUID = UUID.randomUUID();
        this.c = atlw.a(this.b);
        asxb asxbVar = new asxb(this.c);
        long a2 = aszi.b().a(this.b).a();
        if (a2 > 0) {
            currentTimeMillis = a2 + (fmml.b() * 1000);
        } else {
            if (fmml.c() > 0) {
                currentTimeMillis = ((aszw) aszi.b().a(this.b)).c.getLong("jittered_timestamp_for_initial_consent_check_millis", -1L);
                if (currentTimeMillis <= 0) {
                    long c = fmml.c();
                    if (c > 0) {
                        currentTimeMillis = ThreadLocalRandom.current().nextLong(c) + System.currentTimeMillis();
                        SharedPreferences.Editor edit = ((aszw) aszi.b().a(this.b)).c.edit();
                        edit.putLong("jittered_timestamp_for_initial_consent_check_millis", currentTimeMillis);
                        edit.apply();
                    }
                }
            }
            currentTimeMillis = System.currentTimeMillis();
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        if (currentTimeMillis <= currentTimeMillis2) {
            if (!asxd.b(aszi.b().a(this.b))) {
                atkx.a(this.b);
                if (!atkx.b(this.b)) {
                    asxbVar.a(randomUUID, 5, new atmb(enwb.CHECKER_TRIGGERED_NO_NETWORK, false), currentTimeMillis2);
                }
                aslw aslwVar = new aslw(10);
                asxbVar.b(randomUUID, 5, currentTimeMillis2);
                eijr eijrVar = bqqe.a;
                bqqa.a(aseu.CONSTELLATION_BACKGROUND_PERIODIC_CONSENT_CHECKER);
                asvp.h();
                Context context = this.b;
                asxc asxcVar = new asxc(asxbVar, a, randomUUID, enwq.a(5), new aslv(aslwVar), false, currentTimeMillis2);
                randomUUID = randomUUID;
                asvp.g(context, randomUUID, 1, asxcVar);
            } else if (fmml.i()) {
                asxbVar.a(randomUUID, 5, new atmb(enwb.CHECKER_INACTIVE, false), currentTimeMillis2);
            }
            aszi.b().a(this.b).q(System.currentTimeMillis());
        } else if (fmml.i()) {
            asxbVar.a(randomUUID, 5, new atmb(String.format(Locale.US, "nextConsentCheckTimeMillis: %d, currentTimeMillis: %d", Long.valueOf(currentTimeMillis), Long.valueOf(currentTimeMillis2)), enwb.CHECKER_TOO_SOON, false), currentTimeMillis2);
        }
        if (fmml.g()) {
            asxi.c(this.b).h(randomUUID.toString(), "PERIODIC_CLIENT_STATE_TRIGGER");
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
    }
}
