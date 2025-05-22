package com.google.android.gms.wallet.intentoperation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent;
import com.google.android.gms.wallet.dynamite.logging.e;
import defpackage.arvr;
import defpackage.dksw;
import defpackage.dktd;
import defpackage.dktp;
import defpackage.dlgt;
import defpackage.dlgu;
import defpackage.dlgv;
import defpackage.egig;
import defpackage.egiz;
import defpackage.egjb;
import defpackage.egji;
import defpackage.egjy;
import defpackage.ekvl;
import defpackage.eoru;
import defpackage.epct;
import defpackage.epdo;
import defpackage.fgou;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsa;
import defpackage.fvty;
import defpackage.fxxm;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class AnalyticsIntentOperation extends IntentOperation {
    private dlgu a;
    private dlgv b;
    private dksw c;

    public AnalyticsIntentOperation() {
    }

    public static Intent a(Context context) {
        return IntentOperation.getStartIntent(context, AnalyticsIntentOperation.class, "com.google.android.gms.wallet.analytics.LOG");
    }

    public static eoru b(Context context, WalletAnalyticsEvent walletAnalyticsEvent) {
        fgrc v = eoru.a.v();
        ArrayList c = c(context, new dlgu(), true, new dlgv(context), walletAnalyticsEvent);
        if (!v.b.L()) {
            v.U();
        }
        eoru eoruVar = (eoru) v.b;
        fgsa fgsaVar = eoruVar.b;
        if (!fgsaVar.c()) {
            eoruVar.b = fgri.E(fgsaVar);
        }
        fgou.E(c, eoruVar.b);
        dlgt.a(context, walletAnalyticsEvent);
        return (eoru) v.Q();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0233  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static java.util.ArrayList c(android.content.Context r18, defpackage.dlgu r19, boolean r20, defpackage.dlgv r21, com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent r22) {
        /*
            Method dump skipped, instructions count: 883
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wallet.intentoperation.AnalyticsIntentOperation.c(android.content.Context, dlgu, boolean, dlgv, com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent):java.util.ArrayList");
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.a = new dlgu();
        this.b = new dlgv(this);
        this.c = new dksw(getApplicationContext(), dktd.a(getApplicationContext()).c);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        try {
            if (!intent.hasExtra("EXTRA_BENDER3_EVENT")) {
                c(this, this.a, false, this.b, (WalletAnalyticsEvent) intent.getParcelableExtra("wallet.analytics.event"));
                return;
            }
            dksw dkswVar = this.c;
            Context context = dkswVar.a;
            egji.a(context);
            fxxm.f(intent, "<this>");
            Bundle bundleExtra = intent.getBundleExtra("EXTRA_BENDER3_EVENT");
            ekvl.B(bundleExtra, "A non-null %s is required from the Intent.", "EXTRA_BENDER3_EVENT");
            epdo epdoVar = (epdo) egig.j(bundleExtra, "KEY_EVENT", epdo.a);
            dktp dktpVar = (dktp) egig.j(bundleExtra, "KEY_CONFIG", dktp.a);
            egiz egizVar = dkswVar.b;
            arvr a = egjb.a(dktpVar.d);
            egjy.a(context, a, epdoVar, dktpVar.c).d();
            long c = fvty.a.lK().c();
            epct b = epct.b(epdoVar.g);
            if (b == null) {
                b = epct.EVENT_TYPE_UNKNOWN;
            }
            if (b != epct.EVENT_TYPE_UNHANDLED_ERROR || c == 0) {
                return;
            }
            a.e(c, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            e.a(this, th, getPackageName());
        }
    }

    AnalyticsIntentOperation(Context context, dlgu dlguVar, dlgv dlgvVar, dksw dkswVar) {
        this.a = dlguVar;
        this.b = dlgvVar;
        this.c = dkswVar;
        attachBaseContext(context);
    }
}
