package com.google.android.gms.usagereporting.geller;

import com.google.android.gms.chimera.modules.westworld.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.asej;
import defpackage.asot;
import defpackage.byln;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class GellerCleanupService extends GmsTaskBoundService {
    static {
        asot.b("GellerCleanup", asej.WESTWORLD);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        AppContextProvider.a();
        return 2;
    }
}
