package com.google.android.gms.trustagent.trustlet;

import android.content.Intent;
import com.google.android.gms.chimera.modules.trustagent.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cauf;
import defpackage.djat;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class InactivityTaskService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;

    static {
        ausn.b("TrustAgent", auid.TRUSTAGENT);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        AppContextProvider.a().sendBroadcast(new Intent().setPackage(AppContextProvider.a().getPackageName()).setAction(djat.b));
        return 0;
    }
}
