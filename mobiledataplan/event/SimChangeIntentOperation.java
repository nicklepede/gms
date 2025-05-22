package com.google.android.gms.mobiledataplan.event;

import android.content.Intent;
import android.os.Build;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.mobiledataplan.AppContextProvider;
import com.google.android.gms.mobiledataplan.service.ChimeraPeriodicUpdaterService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cgls;
import defpackage.cgmv;
import defpackage.cgzm;
import defpackage.cgzp;
import defpackage.entx;
import defpackage.fhvs;
import defpackage.fszn;
import defpackage.ftax;
import defpackage.ftbb;
import defpackage.ftbg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class SimChangeIntentOperation extends IntentOperation {
    private static final ausn a = ausn.b("MobileDataPlan", auid.MOBILE_DATA_PLAN);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        ausn ausnVar = a;
        ausnVar.f(cgzp.h()).B("SIM state changed, continue %s", Boolean.valueOf(ftax.H()));
        if (ftax.H() && "LOADED".equals(intent.getStringExtra("ss"))) {
            cgls.c().K(3, fhvs.DEVICE_STATUS_SIM_STATE_CHANGED);
            if (ftbb.i() && ftbb.g() && Build.VERSION.SDK_INT >= 29) {
                ChimeraPeriodicUpdaterService.l(AppContextProvider.a(), 27, cgls.a());
            }
            if (!ftbg.i() || cgzm.B(AppContextProvider.a())) {
                ChimeraPeriodicUpdaterService.e(AppContextProvider.a(), ftax.o(), ftax.m(), entx.SIM_CHANGE_EVENT);
                ausnVar.f(cgzp.h()).S("SIM state changed. Periodic service enabled? %b Periodic fetch on? %b", ftax.J(), ftax.P());
                if (fszn.l() && fszn.a.lK().o()) {
                    cgmv.a().b();
                }
            }
        }
    }
}
