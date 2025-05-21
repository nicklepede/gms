package com.google.android.gms.crisisalerts.settings.debug;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import com.google.android.gms.crisisalerts.settings.debug.CrisisAlertsInjectTestAlertIntentOperation;
import defpackage.aqxd;
import defpackage.asmb;
import defpackage.asot;
import defpackage.asqx;
import defpackage.axdg;
import defpackage.axeg;
import defpackage.axgt;
import defpackage.bziq;
import defpackage.cabc;
import defpackage.dfbl;
import defpackage.ejhf;
import defpackage.ejls;
import defpackage.ejmh;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedh;
import defpackage.fefi;
import defpackage.fegu;
import defpackage.fegx;
import defpackage.fezm;
import defpackage.fezp;
import defpackage.fezs;
import defpackage.fezv;
import defpackage.ffaa;
import defpackage.ffab;
import defpackage.ffad;
import defpackage.ffaf;
import j$.time.Duration;
import j$.time.Instant;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class CrisisAlertsInjectTestAlertIntentOperation extends axgt {
    private static final asot b = axdg.a("InjTst");
    public axeg a;

    public static void a(Context context, String str, boolean z, boolean z2, boolean z3) {
        Intent startIntent = getStartIntent(context, CrisisAlertsInjectTestAlertIntentOperation.class, "com.google.android.gms.crisisalerts.settings.debug.CRISIS_ALERTS_INJECT_TEST_ALERT");
        if (startIntent != null) {
            startIntent.putExtra("type", str);
            startIntent.putExtra("sound", z);
            startIntent.putExtra("vibrate", z2);
            startIntent.putExtra("delay", z3);
            context.startService(startIntent);
        }
    }

    public static final ffab b(fezm fezmVar, String str, fecj fecjVar, boolean z, boolean z2) {
        fecj v = ffab.a.v();
        fefi l = fegx.l();
        if (!v.b.L()) {
            v.U();
        }
        ffab ffabVar = (ffab) v.b;
        l.getClass();
        ffabVar.c = l;
        ffabVar.b |= 1;
        fecj v2 = ffaa.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        ((ffaa) v2.b).e = fezmVar.a();
        fecj v3 = fezs.a.v();
        String str2 = "test-" + System.currentTimeMillis();
        if (!v3.b.L()) {
            v3.U();
        }
        ((fezs) v3.b).c = str2;
        fefi h = fegx.h(System.currentTimeMillis());
        if (!v3.b.L()) {
            v3.U();
        }
        fezs fezsVar = (fezs) v3.b;
        h.getClass();
        fezsVar.d = h;
        fezsVar.b |= 1;
        if (!v2.b.L()) {
            v2.U();
        }
        ffaa ffaaVar = (ffaa) v2.b;
        fezs fezsVar2 = (fezs) v3.Q();
        fezsVar2.getClass();
        ffaaVar.c = fezsVar2;
        ffaaVar.b |= 1;
        if (!v2.b.L()) {
            v2.U();
        }
        ((ffaa) v2.b).d = 3;
        fefi b2 = fegu.b(Instant.now().plus(Duration.ofMinutes(5L)));
        if (!v2.b.L()) {
            v2.U();
        }
        ffaa ffaaVar2 = (ffaa) v2.b;
        b2.getClass();
        ffaaVar2.f = b2;
        ffaaVar2.b |= 2;
        fecj v4 = fezv.a.v();
        fecj v5 = ffaf.a.v();
        if (!v5.b.L()) {
            v5.U();
        }
        ffaf ffafVar = (ffaf) v5.b;
        str.getClass();
        fedh fedhVar = ffafVar.b;
        if (!fedhVar.c()) {
            ffafVar.b = fecp.E(fedhVar);
        }
        ffafVar.b.add(str);
        if (!v4.b.L()) {
            v4.U();
        }
        fezv fezvVar = (fezv) v4.b;
        ffaf ffafVar2 = (ffaf) v5.Q();
        ffafVar2.getClass();
        fezvVar.c = ffafVar2;
        fezvVar.b |= 1;
        if (!v2.b.L()) {
            v2.U();
        }
        ffaa ffaaVar3 = (ffaa) v2.b;
        fezv fezvVar2 = (fezv) v4.Q();
        fezvVar2.getClass();
        ffaaVar3.g = fezvVar2;
        ffaaVar3.b |= 4;
        fecj v6 = ffad.a.v();
        if (!v6.b.L()) {
            v6.U();
        }
        fecp fecpVar = v6.b;
        ((ffad) fecpVar).b = z;
        if (!fecpVar.L()) {
            v6.U();
        }
        ((ffad) v6.b).c = z2;
        ffad ffadVar = (ffad) v6.Q();
        if (!v2.b.L()) {
            v2.U();
        }
        fecp fecpVar2 = v2.b;
        ffaa ffaaVar4 = (ffaa) fecpVar2;
        ffadVar.getClass();
        ffaaVar4.l = ffadVar;
        ffaaVar4.b |= 16;
        if (!fecpVar2.L()) {
            v2.U();
        }
        fecp fecpVar3 = v2.b;
        ((ffaa) fecpVar3).i = "kgmid=/g/11y36p09hj&wbsk=1";
        if (!fecpVar3.L()) {
            v2.U();
        }
        ffaa ffaaVar5 = (ffaa) v2.b;
        fezp fezpVar = (fezp) fecjVar.Q();
        fezpVar.getClass();
        fedh fedhVar2 = ffaaVar5.j;
        if (!fedhVar2.c()) {
            ffaaVar5.j = fecp.E(fedhVar2);
        }
        ffaaVar5.j.add(fezpVar);
        if (!v2.b.L()) {
            v2.U();
        }
        ((ffaa) v2.b).k = "en-US";
        if (!v.b.L()) {
            v.U();
        }
        ffab ffabVar2 = (ffab) v.b;
        ffaa ffaaVar6 = (ffaa) v2.Q();
        ffaaVar6.getClass();
        fedh fedhVar3 = ffabVar2.d;
        if (!fedhVar3.c()) {
            ffabVar2.d = fecp.E(fedhVar3);
        }
        ffabVar2.d.add(ffaaVar6);
        return (ffab) v.Q();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Location location;
        if (intent == null || !asqx.c(intent.getAction()).equals("com.google.android.gms.crisisalerts.settings.debug.CRISIS_ALERTS_INJECT_TEST_ALERT")) {
            return;
        }
        final String stringExtra = intent.getStringExtra("type");
        final boolean booleanExtra = intent.getBooleanExtra("sound", false);
        final boolean booleanExtra2 = intent.getBooleanExtra("vibrate", false);
        boolean booleanExtra3 = intent.getBooleanExtra("delay", false);
        if (stringExtra != null) {
            try {
                aqxd aqxdVar = bziq.a;
                location = (Location) dfbl.n(new cabc(this).c());
            } catch (InterruptedException | ExecutionException e) {
                ((ejhf) ((ejhf) b.j()).s(e)).x("Error getting location");
                location = null;
            }
            if (location == null) {
                return;
            }
            final String E = ejls.v(ejmh.i(location.getLatitude(), location.getLongitude())).y(8).E();
            new asmb(1, 9).schedule(new Runnable() { // from class: axgr
                @Override // java.lang.Runnable
                public final void run() {
                    char c;
                    String str = stringExtra;
                    int hashCode = str.hashCode();
                    if (hashCode != 2545) {
                        if (hashCode == 82295 && str.equals("SOS")) {
                            c = 1;
                        }
                        c = 65535;
                    } else {
                        if (str.equals("PA")) {
                            c = 0;
                        }
                        c = 65535;
                    }
                    CrisisAlertsInjectTestAlertIntentOperation crisisAlertsInjectTestAlertIntentOperation = CrisisAlertsInjectTestAlertIntentOperation.this;
                    String str2 = E;
                    boolean z = booleanExtra2;
                    boolean z2 = booleanExtra;
                    if (c != 0) {
                        if (c != 1) {
                            return;
                        }
                        axeg axegVar = crisisAlertsInjectTestAlertIntentOperation.a;
                        fezm fezmVar = fezm.ALERT_FAMILY_SOS;
                        fecj v = fezp.a.v();
                        if (!v.b.L()) {
                            v.U();
                        }
                        ((fezp) v.b).c = "en-US";
                        fecj v2 = fezr.a.v();
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        ((fezr) v2.b).b = "Test Sos Alert";
                        if (!v.b.L()) {
                            v.U();
                        }
                        fezp fezpVar = (fezp) v.b;
                        fezr fezrVar = (fezr) v2.Q();
                        fezrVar.getClass();
                        fezpVar.e = fezrVar;
                        fezpVar.b |= 2;
                        axegVar.b(CrisisAlertsInjectTestAlertIntentOperation.b(fezmVar, str2, v, z, z2));
                        return;
                    }
                    axeg axegVar2 = crisisAlertsInjectTestAlertIntentOperation.a;
                    fezm fezmVar2 = fezm.ALERT_FAMILY_PUBLIC_ALERT;
                    fecj v3 = fezp.a.v();
                    if (!v3.b.L()) {
                        v3.U();
                    }
                    ((fezp) v3.b).c = "en-US";
                    fecj v4 = fezq.a.v();
                    if (!v4.b.L()) {
                        v4.U();
                    }
                    fecp fecpVar = v4.b;
                    ((fezq) fecpVar).c = "Golden Gate Park";
                    if (!fecpVar.L()) {
                        v4.U();
                    }
                    fecp fecpVar2 = v4.b;
                    ((fezq) fecpVar2).b = "Loose Gaze of Racoons";
                    if (!fecpVar2.L()) {
                        v4.U();
                    }
                    ((fezq) v4.b).d = "San Francisco Board of Supervisors";
                    if (!v3.b.L()) {
                        v3.U();
                    }
                    fezp fezpVar2 = (fezp) v3.b;
                    fezq fezqVar = (fezq) v4.Q();
                    fezqVar.getClass();
                    fezpVar2.d = fezqVar;
                    fezpVar2.b = 1 | fezpVar2.b;
                    axegVar2.b(CrisisAlertsInjectTestAlertIntentOperation.b(fezmVar2, str2, v3, z, z2));
                }
            }, true != booleanExtra3 ? 0L : 15L, TimeUnit.SECONDS);
        }
    }
}
