package com.google.android.gms.magictether.host;

import com.google.android.gms.chimera.modules.auth.magictether.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.asot;
import defpackage.byln;
import defpackage.cbpv;
import defpackage.cbqk;
import defpackage.cbql;
import defpackage.cbru;
import defpackage.cbta;
import defpackage.ejhf;
import defpackage.fpzd;
import defpackage.fpzk;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class AutoDisconnectGmsChimeraTaskService extends GmsTaskChimeraService {
    private static final asot a = cbta.a("AutoDisconnectGmsChimeraTaskService");

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        if (!fpzd.j() || !fpzd.e()) {
            return 2;
        }
        ((ejhf) a.h()).x("Disconnecting hotspot since all devices have been idle.");
        cbqk.c();
        if (!cbpv.c(fpzk.j())) {
            cbql.a(AppContextProvider.a()).c(true);
            return 0;
        }
        cbru a2 = cbru.a(AppContextProvider.a());
        if (a2 == null) {
            return 0;
        }
        a2.c(true);
        return 0;
    }
}
