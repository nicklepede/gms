package com.google.android.gms.people.contactssync;

import android.app.Activity;
import android.content.Context;
import defpackage.ctvd;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class DeviceContactsSync {
    private DeviceContactsSync() {
    }

    public static DeviceContactsSyncClient getClient(Activity activity) {
        return new ctvd(activity);
    }

    public static DeviceContactsSyncClient getClient(Context context) {
        return new ctvd(context);
    }
}
