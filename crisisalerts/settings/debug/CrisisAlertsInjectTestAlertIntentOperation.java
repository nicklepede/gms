package com.google.android.gms.crisisalerts.settings.debug;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import com.google.android.gms.crisisalerts.settings.debug.CrisisAlertsInjectTestAlertIntentOperation;
import defpackage.aszs;
import defpackage.aupv;
import defpackage.ausn;
import defpackage.auur;
import defpackage.azhg;
import defpackage.azig;
import defpackage.azkt;
import defpackage.cbrh;
import defpackage.ccjt;
import defpackage.dhmr;
import defpackage.eluo;
import defpackage.elzb;
import defpackage.elzp;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsa;
import defpackage.fgub;
import defpackage.fgvn;
import defpackage.fgvq;
import defpackage.fhok;
import defpackage.fhon;
import defpackage.fhoq;
import defpackage.fhot;
import defpackage.fhoy;
import defpackage.fhoz;
import defpackage.fhpb;
import defpackage.fhpd;
import j$.time.Duration;
import j$.time.Instant;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class CrisisAlertsInjectTestAlertIntentOperation extends azkt {
    private static final ausn b = azhg.a("InjTst");
    public azig a;

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

    public static final fhoz b(fhok fhokVar, String str, fgrc fgrcVar, boolean z, boolean z2) {
        fgrc v = fhoz.a.v();
        fgub l = fgvq.l();
        if (!v.b.L()) {
            v.U();
        }
        fhoz fhozVar = (fhoz) v.b;
        l.getClass();
        fhozVar.c = l;
        fhozVar.b |= 1;
        fgrc v2 = fhoy.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        ((fhoy) v2.b).e = fhokVar.a();
        fgrc v3 = fhoq.a.v();
        String str2 = "test-" + System.currentTimeMillis();
        if (!v3.b.L()) {
            v3.U();
        }
        ((fhoq) v3.b).c = str2;
        fgub h = fgvq.h(System.currentTimeMillis());
        if (!v3.b.L()) {
            v3.U();
        }
        fhoq fhoqVar = (fhoq) v3.b;
        h.getClass();
        fhoqVar.d = h;
        fhoqVar.b |= 1;
        if (!v2.b.L()) {
            v2.U();
        }
        fhoy fhoyVar = (fhoy) v2.b;
        fhoq fhoqVar2 = (fhoq) v3.Q();
        fhoqVar2.getClass();
        fhoyVar.c = fhoqVar2;
        fhoyVar.b |= 1;
        if (!v2.b.L()) {
            v2.U();
        }
        ((fhoy) v2.b).d = 3;
        fgub b2 = fgvn.b(Instant.now().plus(Duration.ofMinutes(5L)));
        if (!v2.b.L()) {
            v2.U();
        }
        fhoy fhoyVar2 = (fhoy) v2.b;
        b2.getClass();
        fhoyVar2.f = b2;
        fhoyVar2.b |= 2;
        fgrc v4 = fhot.a.v();
        fgrc v5 = fhpd.a.v();
        if (!v5.b.L()) {
            v5.U();
        }
        fhpd fhpdVar = (fhpd) v5.b;
        str.getClass();
        fgsa fgsaVar = fhpdVar.b;
        if (!fgsaVar.c()) {
            fhpdVar.b = fgri.E(fgsaVar);
        }
        fhpdVar.b.add(str);
        if (!v4.b.L()) {
            v4.U();
        }
        fhot fhotVar = (fhot) v4.b;
        fhpd fhpdVar2 = (fhpd) v5.Q();
        fhpdVar2.getClass();
        fhotVar.c = fhpdVar2;
        fhotVar.b |= 1;
        if (!v2.b.L()) {
            v2.U();
        }
        fhoy fhoyVar3 = (fhoy) v2.b;
        fhot fhotVar2 = (fhot) v4.Q();
        fhotVar2.getClass();
        fhoyVar3.g = fhotVar2;
        fhoyVar3.b |= 4;
        fgrc v6 = fhpb.a.v();
        if (!v6.b.L()) {
            v6.U();
        }
        fgri fgriVar = v6.b;
        ((fhpb) fgriVar).b = z;
        if (!fgriVar.L()) {
            v6.U();
        }
        ((fhpb) v6.b).c = z2;
        fhpb fhpbVar = (fhpb) v6.Q();
        if (!v2.b.L()) {
            v2.U();
        }
        fgri fgriVar2 = v2.b;
        fhoy fhoyVar4 = (fhoy) fgriVar2;
        fhpbVar.getClass();
        fhoyVar4.l = fhpbVar;
        fhoyVar4.b |= 16;
        if (!fgriVar2.L()) {
            v2.U();
        }
        fgri fgriVar3 = v2.b;
        ((fhoy) fgriVar3).i = "kgmid=/g/11y36p09hj&wbsk=1";
        if (!fgriVar3.L()) {
            v2.U();
        }
        fhoy fhoyVar5 = (fhoy) v2.b;
        fhon fhonVar = (fhon) fgrcVar.Q();
        fhonVar.getClass();
        fgsa fgsaVar2 = fhoyVar5.j;
        if (!fgsaVar2.c()) {
            fhoyVar5.j = fgri.E(fgsaVar2);
        }
        fhoyVar5.j.add(fhonVar);
        if (!v2.b.L()) {
            v2.U();
        }
        ((fhoy) v2.b).k = "en-US";
        if (!v.b.L()) {
            v.U();
        }
        fhoz fhozVar2 = (fhoz) v.b;
        fhoy fhoyVar6 = (fhoy) v2.Q();
        fhoyVar6.getClass();
        fgsa fgsaVar3 = fhozVar2.d;
        if (!fgsaVar3.c()) {
            fhozVar2.d = fgri.E(fgsaVar3);
        }
        fhozVar2.d.add(fhoyVar6);
        return (fhoz) v.Q();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Location location;
        if (intent == null || !auur.c(intent.getAction()).equals("com.google.android.gms.crisisalerts.settings.debug.CRISIS_ALERTS_INJECT_TEST_ALERT")) {
            return;
        }
        final String stringExtra = intent.getStringExtra("type");
        final boolean booleanExtra = intent.getBooleanExtra("sound", false);
        final boolean booleanExtra2 = intent.getBooleanExtra("vibrate", false);
        boolean booleanExtra3 = intent.getBooleanExtra("delay", false);
        if (stringExtra != null) {
            try {
                aszs aszsVar = cbrh.a;
                location = (Location) dhmr.n(new ccjt(this).c());
            } catch (InterruptedException | ExecutionException e) {
                ((eluo) ((eluo) b.j()).s(e)).x("Error getting location");
                location = null;
            }
            if (location == null) {
                return;
            }
            final String E = elzb.v(elzp.i(location.getLatitude(), location.getLongitude())).y(8).E();
            new aupv(1, 9).schedule(new Runnable() { // from class: azkr
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
                        azig azigVar = crisisAlertsInjectTestAlertIntentOperation.a;
                        fhok fhokVar = fhok.ALERT_FAMILY_SOS;
                        fgrc v = fhon.a.v();
                        if (!v.b.L()) {
                            v.U();
                        }
                        ((fhon) v.b).c = "en-US";
                        fgrc v2 = fhop.a.v();
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        ((fhop) v2.b).b = "Test Sos Alert";
                        if (!v.b.L()) {
                            v.U();
                        }
                        fhon fhonVar = (fhon) v.b;
                        fhop fhopVar = (fhop) v2.Q();
                        fhopVar.getClass();
                        fhonVar.e = fhopVar;
                        fhonVar.b |= 2;
                        azigVar.b(CrisisAlertsInjectTestAlertIntentOperation.b(fhokVar, str2, v, z, z2));
                        return;
                    }
                    azig azigVar2 = crisisAlertsInjectTestAlertIntentOperation.a;
                    fhok fhokVar2 = fhok.ALERT_FAMILY_PUBLIC_ALERT;
                    fgrc v3 = fhon.a.v();
                    if (!v3.b.L()) {
                        v3.U();
                    }
                    ((fhon) v3.b).c = "en-US";
                    fgrc v4 = fhoo.a.v();
                    if (!v4.b.L()) {
                        v4.U();
                    }
                    fgri fgriVar = v4.b;
                    ((fhoo) fgriVar).c = "Golden Gate Park";
                    if (!fgriVar.L()) {
                        v4.U();
                    }
                    fgri fgriVar2 = v4.b;
                    ((fhoo) fgriVar2).b = "Loose Gaze of Racoons";
                    if (!fgriVar2.L()) {
                        v4.U();
                    }
                    ((fhoo) v4.b).d = "San Francisco Board of Supervisors";
                    if (!v3.b.L()) {
                        v3.U();
                    }
                    fhon fhonVar2 = (fhon) v3.b;
                    fhoo fhooVar = (fhoo) v4.Q();
                    fhooVar.getClass();
                    fhonVar2.d = fhooVar;
                    fhonVar2.b = 1 | fhonVar2.b;
                    azigVar2.b(CrisisAlertsInjectTestAlertIntentOperation.b(fhokVar2, str2, v3, z, z2));
                }
            }, true != booleanExtra3 ? 0L : 15L, TimeUnit.SECONDS);
        }
    }
}
