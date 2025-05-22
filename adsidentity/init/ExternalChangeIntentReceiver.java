package com.google.android.gms.adsidentity.init;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.adsidentity.service.AdservicesStatusService;
import defpackage.auub;
import defpackage.casd;
import defpackage.cata;
import defpackage.catb;
import defpackage.cate;
import defpackage.catg;
import defpackage.catn;
import defpackage.fmqy;
import defpackage.fpum;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
        if (fmqy.a.lK().H()) {
            casd a = casd.a(this);
            catb catbVar = new catb();
            catbVar.e(0L, 0L);
            a.f(catbVar.b());
            Log.i("AdservicesStatusTask", "One-off debugging task scheduled.");
            return;
        }
        if (auub.g() && fmqy.n()) {
            if (fpum.m()) {
                casd a2 = casd.a(this);
                catg catgVar = new catg();
                catgVar.w(AdservicesStatusService.class.getName());
                catgVar.q("AdservicesStatusTask");
                catgVar.v(2);
                catgVar.l(false);
                catgVar.a = catn.j;
                a2.f(catgVar.b());
                return;
            }
            cate cateVar = new cate();
            cateVar.w(AdservicesStatusService.class.getName());
            cateVar.t("AdservicesStatusTask");
            cateVar.j(cata.EVERY_DAY);
            cateVar.v(1);
            cateVar.p = true;
            cateVar.y(2, 2);
            casd.a(this).f(cateVar.b());
        }
    }
}
