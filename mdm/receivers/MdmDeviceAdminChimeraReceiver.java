package com.google.android.gms.mdm.receivers;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.DeviceAdminReceiver;
import defpackage.cczv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MdmDeviceAdminChimeraReceiver extends DeviceAdminReceiver {
    @Override // com.google.android.chimera.DeviceAdminReceiver
    public final void onDisabled(Context context, Intent intent) {
        cczv.i(context, false);
    }

    @Override // com.google.android.chimera.DeviceAdminReceiver
    public final void onEnabled(Context context, Intent intent) {
        cczv.i(context, true);
    }
}
