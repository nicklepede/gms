package com.google.android.gms.mobiledataplan.event;

import android.content.Intent;
import android.os.Build;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.mobiledataplan.AppContextProvider;
import com.google.android.gms.mobiledataplan.service.ChimeraPeriodicUpdaterService;
import defpackage.asej;
import defpackage.asot;
import defpackage.cecl;
import defpackage.cedo;
import defpackage.ceqf;
import defpackage.ceqi;
import defpackage.elgk;
import defpackage.ffgu;
import defpackage.fqfv;
import defpackage.fqhf;
import defpackage.fqhj;
import defpackage.fqho;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class SimChangeIntentOperation extends IntentOperation {
    private static final asot a = asot.b("MobileDataPlan", asej.MOBILE_DATA_PLAN);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        asot asotVar = a;
        asotVar.f(ceqi.h()).B("SIM state changed, continue %s", Boolean.valueOf(fqhf.H()));
        if (fqhf.H() && "LOADED".equals(intent.getStringExtra("ss"))) {
            cecl.c().K(3, ffgu.DEVICE_STATUS_SIM_STATE_CHANGED);
            if (fqhj.i() && fqhj.g() && Build.VERSION.SDK_INT >= 29) {
                ChimeraPeriodicUpdaterService.l(AppContextProvider.a(), 27, cecl.a());
            }
            if (!fqho.i() || ceqf.B(AppContextProvider.a())) {
                ChimeraPeriodicUpdaterService.e(AppContextProvider.a(), fqhf.o(), fqhf.m(), elgk.SIM_CHANGE_EVENT);
                asotVar.f(ceqi.h()).S("SIM state changed. Periodic service enabled? %b Periodic fetch on? %b", fqhf.J(), fqhf.R());
                if (fqfv.l() && fqfv.a.a().o()) {
                    cedo.a().b();
                }
            }
        }
    }
}
