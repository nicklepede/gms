package com.google.android.gms.semanticlocationhistory.reinference;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cauf;
import defpackage.furk;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class PassiveWifiReinferenceService extends GmsTaskBoundService {
    public static final String a;

    static {
        ausn.c("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY, "Reinference");
        a = PassiveWifiReinferenceService.class.getName();
        TimeUnit.HOURS.toMillis(12L);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        return !furk.d() ? 2 : 0;
    }
}
