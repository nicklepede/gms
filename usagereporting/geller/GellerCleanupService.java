package com.google.android.gms.usagereporting.geller;

import com.google.android.gms.chimera.modules.westworld.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cauf;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class GellerCleanupService extends GmsTaskBoundService {
    static {
        ausn.b("GellerCleanup", auid.WESTWORLD);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        AppContextProvider.a();
        return 2;
    }
}
