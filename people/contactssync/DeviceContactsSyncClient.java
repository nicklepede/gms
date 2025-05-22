package com.google.android.gms.people.contactssync;

import android.content.Context;
import defpackage.atai;
import defpackage.dhlw;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public interface DeviceContactsSyncClient extends atai {

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public interface SyncSettingUpdatedListener {
        void onDeviceContactsSyncSettingUpdated();
    }

    dhlw getDeviceContactsSyncSetting();

    dhlw launchDeviceContactsSyncSettingActivity(Context context);

    dhlw registerSyncSettingUpdatedListener(SyncSettingUpdatedListener syncSettingUpdatedListener);

    dhlw unregisterSyncSettingUpdatedListener(SyncSettingUpdatedListener syncSettingUpdatedListener);
}
