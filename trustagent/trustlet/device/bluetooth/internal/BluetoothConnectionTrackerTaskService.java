package com.google.android.gms.trustagent.trustlet.device.bluetooth.internal;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.chimera.modules.trustagent.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.asej;
import defpackage.asot;
import defpackage.byln;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class BluetoothConnectionTrackerTaskService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;

    static {
        asot.b("TrustAgent", asej.TRUSTAGENT);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        Bundle bundle = bylnVar.b;
        AppContextProvider.a().sendBroadcast(new Intent(bundle.getString("CONNECTION_TRACKER_ACTION")).setPackage(AppContextProvider.a().getPackageName()).putExtra("key-timer-extra-device-address", bundle.getString("key-timer-extra-device-address")));
        return 0;
    }
}
