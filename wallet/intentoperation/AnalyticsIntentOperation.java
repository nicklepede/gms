package com.google.android.gms.wallet.intentoperation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent;
import com.google.android.gms.wallet.dynamite.logging.e;
import defpackage.apta;
import defpackage.dihl;
import defpackage.dihs;
import defpackage.diif;
import defpackage.divi;
import defpackage.divj;
import defpackage.divk;
import defpackage.edvf;
import defpackage.edvy;
import defpackage.edwa;
import defpackage.edwh;
import defpackage.edwx;
import defpackage.eiig;
import defpackage.emeg;
import defpackage.empf;
import defpackage.emqa;
import defpackage.feab;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedh;
import defpackage.fsye;
import defpackage.fvbo;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class AnalyticsIntentOperation extends IntentOperation {
    private divj a;
    private divk b;
    private dihl c;

    public AnalyticsIntentOperation() {
    }

    public static Intent a(Context context) {
        return IntentOperation.getStartIntent(context, AnalyticsIntentOperation.class, "com.google.android.gms.wallet.analytics.LOG");
    }

    public static emeg b(Context context, WalletAnalyticsEvent walletAnalyticsEvent) {
        fecj v = emeg.a.v();
        ArrayList c = c(context, new divj(), true, new divk(context), walletAnalyticsEvent);
        if (!v.b.L()) {
            v.U();
        }
        emeg emegVar = (emeg) v.b;
        fedh fedhVar = emegVar.b;
        if (!fedhVar.c()) {
            emegVar.b = fecp.E(fedhVar);
        }
        feab.E(c, emegVar.b);
        divi.a(context, walletAnalyticsEvent);
        return (emeg) v.Q();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0233  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static java.util.ArrayList c(android.content.Context r18, defpackage.divj r19, boolean r20, defpackage.divk r21, com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent r22) {
        /*
            Method dump skipped, instructions count: 883
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wallet.intentoperation.AnalyticsIntentOperation.c(android.content.Context, divj, boolean, divk, com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent):java.util.ArrayList");
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.a = new divj();
        this.b = new divk(this);
        this.c = new dihl(getApplicationContext(), dihs.a(getApplicationContext()).c);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        try {
            if (!intent.hasExtra("EXTRA_BENDER3_EVENT")) {
                c(this, this.a, false, this.b, (WalletAnalyticsEvent) intent.getParcelableExtra("wallet.analytics.event"));
                return;
            }
            dihl dihlVar = this.c;
            Context context = dihlVar.a;
            edwh.a(context);
            fvbo.f(intent, "<this>");
            Bundle bundleExtra = intent.getBundleExtra("EXTRA_BENDER3_EVENT");
            eiig.A(bundleExtra, "A non-null %s is required from the Intent.", "EXTRA_BENDER3_EVENT");
            emqa emqaVar = (emqa) edvf.j(bundleExtra, "KEY_EVENT", emqa.a);
            diif diifVar = (diif) edvf.j(bundleExtra, "KEY_CONFIG", diif.a);
            edvy edvyVar = dihlVar.b;
            apta a = edwa.a(diifVar.d);
            edwx.a(context, a, emqaVar, diifVar.c).d();
            long c = fsye.a.a().c();
            empf b = empf.b(emqaVar.g);
            if (b == null) {
                b = empf.EVENT_TYPE_UNKNOWN;
            }
            if (b != empf.EVENT_TYPE_UNHANDLED_ERROR || c == 0) {
                return;
            }
            a.e(c, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            e.a(this, th, getPackageName());
        }
    }

    AnalyticsIntentOperation(Context context, divj divjVar, divk divkVar, dihl dihlVar) {
        this.a = divjVar;
        this.b = divkVar;
        this.c = dihlVar;
        attachBaseContext(context);
    }
}
