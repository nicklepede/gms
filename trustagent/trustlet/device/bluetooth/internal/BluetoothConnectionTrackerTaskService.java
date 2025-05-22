package com.google.android.gms.trustagent.trustlet.device.bluetooth.internal;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.chimera.modules.trustagent.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cauf;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class BluetoothConnectionTrackerTaskService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;

    static {
        ausn.b("TrustAgent", auid.TRUSTAGENT);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        Bundle bundle = caufVar.b;
        AppContextProvider.a().sendBroadcast(new Intent(bundle.getString("CONNECTION_TRACKER_ACTION")).setPackage(AppContextProvider.a().getPackageName()).putExtra("key-timer-extra-device-address", bundle.getString("key-timer-extra-device-address")));
        return 0;
    }
}
