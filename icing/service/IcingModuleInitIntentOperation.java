package com.google.android.gms.icing.service;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.chimera.modules.icing.AppContextProvider;
import com.google.android.gms.icing.proxy.IcingInternalCorporaUpdateChimeraService;
import defpackage.anya;
import defpackage.blfw;
import defpackage.blrh;
import defpackage.blrv;
import defpackage.byjl;
import defpackage.byko;
import defpackage.bykv;
import defpackage.fpad;
import defpackage.fpbg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class IcingModuleInitIntentOperation extends anya {
    @Override // defpackage.anya
    protected final void a(Intent intent, boolean z) {
        blfw.r("IcingModuleInitIntentOperation.onModuleUpdated got intent: %s (containerUpdated=%b)", intent, Boolean.valueOf(z));
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        blfw.r("IcingModuleInitIntentOperation.onInitRuntimeState: got intent: %s with flag %d", intent, Integer.valueOf(i));
        int i2 = i & 12;
        Context baseContext = getBaseContext();
        if (i2 > 0) {
            blfw.o("IcingModuleInitIntentOperation.onInitRuntimeState: module or container updated.");
            blrh.c(baseContext);
        } else {
            if ((i & 2) <= 0) {
                blfw.o("IcingModuleInitIntentOperation.onInitRuntimeState: Nothing happened returning.");
                return;
            }
            blfw.o("IcingModuleInitIntentOperation.onInitRuntimeState: boot completed.");
        }
        blrh.b(baseContext);
        SystemEventIntentOperation.a(baseContext, intent);
        IcingInternalCorporaUpdateChimeraService.d();
        if (fpad.j()) {
            byjl a = byjl.a(AppContextProvider.a());
            byko bykoVar = new byko();
            bykoVar.j = "com.google.android.gms.icing.proxy.IcingInternalCorporaUpdateService";
            bykoVar.t("InternalCorporaMaintenance");
            bykoVar.a = bykv.j;
            bykoVar.l(false);
            bykoVar.v(1);
            bykoVar.e();
            if (!fpbg.l()) {
                bykoVar.j();
            }
            a.f(bykoVar.b());
            blrv.c("Internal Corpora Maintenance is scheduled");
        }
    }
}
