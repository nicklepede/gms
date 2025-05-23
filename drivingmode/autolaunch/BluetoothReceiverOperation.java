package com.google.android.gms.drivingmode.autolaunch;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.azqp;
import defpackage.fokk;
import defpackage.fokt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class BluetoothReceiverOperation extends IntentOperation {
    private final void a(String str, BluetoothDevice bluetoothDevice) {
        Intent intent = new Intent(str);
        intent.putExtra("android.bluetooth.device.extra.DEVICE", bluetoothDevice);
        intent.setComponent(azqp.b);
        startService(intent);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        BluetoothDevice bluetoothDevice;
        if (fokk.e() && fokt.c() && (bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE")) != null) {
            String action = intent.getAction();
            int intExtra = "android.bluetooth.device.action.ACL_CONNECTED".equals(action) ? 2 : "android.bluetooth.device.action.ACL_DISCONNECTED".equals(action) ? 0 : "android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED".equals(action) ? intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1) : -1;
            if (intExtra == 2) {
                a("android.bluetooth.device.action.ACL_CONNECTED", bluetoothDevice);
            } else if (intExtra == 0) {
                a("android.bluetooth.device.action.ACL_DISCONNECTED", bluetoothDevice);
            }
        }
    }
}
