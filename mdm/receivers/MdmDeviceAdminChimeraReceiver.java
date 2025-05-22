package com.google.android.gms.mdm.receivers;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.DeviceAdminReceiver;
import defpackage.cfiv;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class MdmDeviceAdminChimeraReceiver extends DeviceAdminReceiver {
    @Override // com.google.android.chimera.DeviceAdminReceiver
    public final void onDisabled(Context context, Intent intent) {
        cfiv.i(context, false);
    }

    @Override // com.google.android.chimera.DeviceAdminReceiver
    public final void onEnabled(Context context, Intent intent) {
        cfiv.i(context, true);
    }
}
