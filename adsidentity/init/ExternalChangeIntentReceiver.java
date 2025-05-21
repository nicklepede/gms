package com.google.android.gms.adsidentity.init;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.adsidentity.service.AdservicesStatusService;
import defpackage.asqh;
import defpackage.byjl;
import defpackage.byki;
import defpackage.bykj;
import defpackage.bykm;
import defpackage.byko;
import defpackage.bykv;
import defpackage.fkas;
import defpackage.fncn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ExternalChangeIntentReceiver extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action;
        if (intent == null || (action = intent.getAction()) == null || !action.equals("com.google.android.gms.phenotype.com.google.android.gms.adsidentity.COMMITTED")) {
            return;
        }
        Log.i("AdservicesStatusTask", "scheduling task by handle intent");
        int i = AdservicesStatusService.a;
        if (fkas.a.a().H()) {
            byjl a = byjl.a(this);
            bykj bykjVar = new bykj();
            bykjVar.e(0L, 0L);
            a.f(bykjVar.b());
            Log.i("AdservicesStatusTask", "One-off debugging task scheduled.");
            return;
        }
        if (asqh.g() && fkas.n()) {
            if (fncn.m()) {
                byjl a2 = byjl.a(this);
                byko bykoVar = new byko();
                bykoVar.w(AdservicesStatusService.class.getName());
                bykoVar.q("AdservicesStatusTask");
                bykoVar.v(2);
                bykoVar.l(false);
                bykoVar.a = bykv.j;
                a2.f(bykoVar.b());
                return;
            }
            bykm bykmVar = new bykm();
            bykmVar.w(AdservicesStatusService.class.getName());
            bykmVar.t("AdservicesStatusTask");
            bykmVar.j(byki.EVERY_DAY);
            bykmVar.v(1);
            bykmVar.p = true;
            bykmVar.y(2, 2);
            byjl.a(this).f(bykmVar.b());
        }
    }
}
