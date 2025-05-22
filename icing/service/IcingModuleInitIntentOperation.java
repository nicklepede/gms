package com.google.android.gms.icing.service;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.chimera.modules.icing.AppContextProvider;
import com.google.android.gms.icing.proxy.IcingInternalCorporaUpdateChimeraService;
import defpackage.apzs;
import defpackage.bnmo;
import defpackage.bnxz;
import defpackage.bnyn;
import defpackage.casd;
import defpackage.catg;
import defpackage.catn;
import defpackage.frtk;
import defpackage.frun;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class IcingModuleInitIntentOperation extends apzs {
    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
        bnmo.r("IcingModuleInitIntentOperation.onModuleUpdated got intent: %s (containerUpdated=%b)", intent, Boolean.valueOf(z));
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        bnmo.r("IcingModuleInitIntentOperation.onInitRuntimeState: got intent: %s with flag %d", intent, Integer.valueOf(i));
        int i2 = i & 12;
        Context baseContext = getBaseContext();
        if (i2 > 0) {
            bnmo.o("IcingModuleInitIntentOperation.onInitRuntimeState: module or container updated.");
            bnxz.c(baseContext);
        } else {
            if ((i & 2) <= 0) {
                bnmo.o("IcingModuleInitIntentOperation.onInitRuntimeState: Nothing happened returning.");
                return;
            }
            bnmo.o("IcingModuleInitIntentOperation.onInitRuntimeState: boot completed.");
        }
        bnxz.b(baseContext);
        SystemEventIntentOperation.a(baseContext, intent);
        IcingInternalCorporaUpdateChimeraService.d();
        if (frtk.j()) {
            casd a = casd.a(AppContextProvider.a());
            catg catgVar = new catg();
            catgVar.j = "com.google.android.gms.icing.proxy.IcingInternalCorporaUpdateService";
            catgVar.t("InternalCorporaMaintenance");
            catgVar.a = catn.j;
            catgVar.l(false);
            catgVar.v(1);
            catgVar.e();
            if (!frun.l()) {
                catgVar.j();
            }
            a.f(catgVar.b());
            bnyn.c("Internal Corpora Maintenance is scheduled");
        }
    }
}
