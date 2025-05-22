package com.google.android.gms.ads.social;

import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.cauf;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class GcmSchedulerWakeupChimeraService extends GmsTaskChimeraService {
    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        int i = com.google.android.gms.ads.internal.util.c.a;
        com.google.android.gms.ads.internal.util.client.h.d("DSID dispatcher woke up.");
        String str = caufVar.a;
        if (str.startsWith("ads.social.doritos")) {
            return d.b(this).a(str);
        }
        return 2;
    }
}
