package com.google.android.gms.mobiledataplan.event;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.mobiledataplan.AppContextProvider;
import com.google.android.gms.mobiledataplan.service.ChimeraPeriodicUpdaterService;
import defpackage.asej;
import defpackage.asot;
import defpackage.cecl;
import defpackage.cedo;
import defpackage.ceqf;
import defpackage.elgk;
import defpackage.ffgu;
import defpackage.fqfv;
import defpackage.fqgb;
import defpackage.fqhf;
import defpackage.fqho;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class LocaleChangeIntentOperation extends IntentOperation {
    static {
        asot.b("MobileDataPlan", asej.MOBILE_DATA_PLAN);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        fqgb.k();
        if (fqgb.k()) {
            cecl.c().K(5, ffgu.DEVICE_STATUS_LOCALE_CHANGED);
            if (!fqho.i() || ceqf.B(AppContextProvider.a())) {
                if (fqfv.l() && fqfv.a.a().i()) {
                    final cedo a = cedo.a();
                    a.f.execute(new Runnable() { // from class: cedl
                        @Override // java.lang.Runnable
                        public final void run() {
                            cedo.a.f(ceqi.h()).B("%s: localeChanged", "BgTaskManager");
                            cedo cedoVar = cedo.this;
                            int a2 = cecl.a();
                            cedoVar.i(feha.TASK_GET_CONSENT_INFO, 5, a2);
                            cedoVar.i(feha.TASK_HTTP_CPID_FETCH, 5, a2);
                            cedoVar.i(feha.TASK_GCORE_REGISTER, 5, a2);
                        }
                    });
                }
                ChimeraPeriodicUpdaterService.e(AppContextProvider.a(), fqhf.o(), fqhf.m(), elgk.LOCALE_CHANGE_EVENT);
                fqhf.J();
                fqhf.R();
            }
        }
    }
}
