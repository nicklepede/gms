package com.google.android.gms.semanticlocationhistory.reinference;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.asej;
import defpackage.asot;
import defpackage.byln;
import defpackage.frwq;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class PassiveWifiReinferenceService extends GmsTaskBoundService {
    public static final String a;

    static {
        asot.c("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY, "Reinference");
        a = PassiveWifiReinferenceService.class.getName();
        TimeUnit.HOURS.toMillis(12L);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        return !frwq.d() ? 2 : 0;
    }
}
