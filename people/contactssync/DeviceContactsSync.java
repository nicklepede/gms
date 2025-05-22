package com.google.android.gms.people.contactssync;

import android.app.Activity;
import android.content.Context;
import defpackage.cwej;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class DeviceContactsSync {
    private DeviceContactsSync() {
    }

    public static DeviceContactsSyncClient getClient(Activity activity) {
        return new cwej(activity);
    }

    public static DeviceContactsSyncClient getClient(Context context) {
        return new cwej(context);
    }
}
