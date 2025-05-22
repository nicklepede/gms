package com.google.android.gms.magictether.host;

import com.google.android.gms.chimera.modules.auth.magictether.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.ausn;
import defpackage.cauf;
import defpackage.cdyn;
import defpackage.cdzc;
import defpackage.cdzd;
import defpackage.ceam;
import defpackage.cebs;
import defpackage.eluo;
import defpackage.fssz;
import defpackage.fstg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class AutoDisconnectGmsChimeraTaskService extends GmsTaskChimeraService {
    private static final ausn a = cebs.a("AutoDisconnectGmsChimeraTaskService");

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        if (!fssz.j() || !fssz.e()) {
            return 2;
        }
        ((eluo) a.h()).x("Disconnecting hotspot since all devices have been idle.");
        cdzc.c();
        if (!cdyn.c(fstg.j())) {
            cdzd.a(AppContextProvider.a()).c(true);
            return 0;
        }
        ceam a2 = ceam.a(AppContextProvider.a());
        if (a2 == null) {
            return 0;
        }
        a2.c(true);
        return 0;
    }
}
