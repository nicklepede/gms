package com.google.android.gms.mobiledataplan.event;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.mobiledataplan.AppContextProvider;
import com.google.android.gms.mobiledataplan.service.ChimeraPeriodicUpdaterService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cgls;
import defpackage.cgmv;
import defpackage.cgzm;
import defpackage.entx;
import defpackage.fhvs;
import defpackage.fszn;
import defpackage.fszt;
import defpackage.ftax;
import defpackage.ftbg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class LocaleChangeIntentOperation extends IntentOperation {
    static {
        ausn.b("MobileDataPlan", auid.MOBILE_DATA_PLAN);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        fszt.k();
        if (fszt.k()) {
            cgls.c().K(5, fhvs.DEVICE_STATUS_LOCALE_CHANGED);
            if (!ftbg.i() || cgzm.B(AppContextProvider.a())) {
                if (fszn.l() && fszn.a.lK().i()) {
                    final cgmv a = cgmv.a();
                    a.f.execute(new Runnable() { // from class: cgms
                        @Override // java.lang.Runnable
                        public final void run() {
                            cgmv.a.f(cgzp.h()).B("%s: localeChanged", "BgTaskManager");
                            cgmv cgmvVar = cgmv.this;
                            int a2 = cgls.a();
                            cgmvVar.i(fgvt.TASK_GET_CONSENT_INFO, 5, a2);
                            cgmvVar.i(fgvt.TASK_HTTP_CPID_FETCH, 5, a2);
                            cgmvVar.i(fgvt.TASK_GCORE_REGISTER, 5, a2);
                        }
                    });
                }
                ChimeraPeriodicUpdaterService.e(AppContextProvider.a(), ftax.o(), ftax.m(), entx.LOCALE_CHANGE_EVENT);
                ftax.J();
                ftax.P();
            }
        }
    }
}
