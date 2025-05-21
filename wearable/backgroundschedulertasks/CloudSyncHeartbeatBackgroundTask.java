package com.google.android.gms.wearable.backgroundschedulertasks;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.chimera.modules.wearable.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.byln;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class CloudSyncHeartbeatBackgroundTask extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;

    public static void d(String str, Object... objArr) {
        if (Log.isLoggable("CloudHeartbeatBkgdTsk", 3)) {
            Log.d("CloudHeartbeatBkgdTsk", String.format(str, objArr));
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        int i;
        Bundle bundle = bylnVar.b;
        long j = 0;
        if (bundle != null) {
            i = bundle.getInt("initial_heartbeat_num", 0);
            j = bundle.getLong("heartbeat_scheduled_time", 0L);
        } else {
            i = 0;
        }
        d("%s is now running, heartBeatNum: %s", "CloudSyncHeartbeatTask", Integer.valueOf(i));
        AppContextProvider.a().sendBroadcast(new Intent("com.google.android.gms.wearable.node.CLOUD_SYNC_SCHEDULER_HEARTBEAT_NOTIFICATION").setPackage(AppContextProvider.a().getPackageName()).putExtra("initial_heartbeat_num", i).putExtra("heartbeat_scheduled_time", j));
        return 0;
    }
}
