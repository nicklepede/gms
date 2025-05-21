package com.google.android.gms.trustagent.trustlet;

import android.content.Intent;
import com.google.android.gms.chimera.modules.trustagent.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.asej;
import defpackage.asot;
import defpackage.byln;
import defpackage.dgpo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class InactivityTaskService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;

    static {
        asot.b("TrustAgent", asej.TRUSTAGENT);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        AppContextProvider.a().sendBroadcast(new Intent().setPackage(AppContextProvider.a().getPackageName()).setAction(dgpo.b));
        return 0;
    }
}
