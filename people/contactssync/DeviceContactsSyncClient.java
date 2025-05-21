package com.google.android.gms.people.contactssync;

import android.content.Context;
import defpackage.aqxt;
import defpackage.dfaq;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public interface DeviceContactsSyncClient extends aqxt {

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public interface SyncSettingUpdatedListener {
        void onDeviceContactsSyncSettingUpdated();
    }

    dfaq getDeviceContactsSyncSetting();

    dfaq launchDeviceContactsSyncSettingActivity(Context context);

    dfaq registerSyncSettingUpdatedListener(SyncSettingUpdatedListener syncSettingUpdatedListener);

    dfaq unregisterSyncSettingUpdatedListener(SyncSettingUpdatedListener syncSettingUpdatedListener);
}
