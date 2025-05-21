package com.google.android.gms.constellation.checker;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.arxo;
import defpackage.aseu;
import defpackage.aslv;
import defpackage.aslw;
import defpackage.asvp;
import defpackage.asxb;
import defpackage.asxc;
import defpackage.aszl;
import defpackage.atkx;
import defpackage.atlw;
import defpackage.atmb;
import defpackage.atmg;
import defpackage.bqqa;
import defpackage.bqqe;
import defpackage.eijr;
import defpackage.enwb;
import defpackage.fmli;
import defpackage.fmml;
import defpackage.fvbo;
import defpackage.vks;
import j$.util.Objects;
import java.util.List;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class GaiaIdChecker extends IntentOperation {
    private static final arxo a = atmg.a("gaia_id_checker");
    private long b = 0;
    private aszl c;

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!fmml.a.a().p()) {
            a.h("GAIA id checker has been disabled.", new Object[0]);
            return;
        }
        boolean equals = Objects.equals(intent.getAction(), "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE");
        boolean hasCategory = intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_ADDED");
        boolean hasCategory2 = intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED");
        if (!equals || (!hasCategory && !hasCategory2)) {
            a.m("Get an unexpected intent:".concat(String.valueOf(String.valueOf(intent))), new Object[0]);
            return;
        }
        UUID randomUUID = UUID.randomUUID();
        Context applicationContext = getApplicationContext();
        this.c = new aszl(applicationContext);
        atlw a2 = atlw.a(applicationContext);
        this.b = System.currentTimeMillis();
        asxb asxbVar = new asxb(a2);
        if (intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_ADDED")) {
            String uuid = randomUUID.toString();
            if (fmli.c()) {
                List a3 = vks.a(intent);
                aszl aszlVar = this.c;
                Context applicationContext2 = getApplicationContext();
                fvbo.f(a3, "accounts");
                aszlVar.a(applicationContext2, uuid);
            }
        }
        if (intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED")) {
            String uuid2 = randomUUID.toString();
            if (fmli.c()) {
                List d = vks.d(intent);
                aszl aszlVar2 = this.c;
                Context applicationContext3 = getApplicationContext();
                fvbo.f(d, "accounts");
                aszlVar2.a(applicationContext3, uuid2);
            }
        }
        atkx.a(applicationContext);
        if (!atkx.b(applicationContext)) {
            asxbVar.a(randomUUID, 8, new atmb(enwb.CHECKER_TRIGGERED_NO_NETWORK, false), this.b);
        }
        asxbVar.b(randomUUID, 8, this.b);
        aslw aslwVar = new aslw(10);
        eijr eijrVar = bqqe.a;
        bqqa.a(aseu.CONSTELLATION_BACKGROUND_GAIAID_CHECKER);
        asvp.h();
        asvp.g(applicationContext, randomUUID, 4, new asxc(asxbVar, a, randomUUID, 6, new aslv(aslwVar), false, this.b));
    }
}
