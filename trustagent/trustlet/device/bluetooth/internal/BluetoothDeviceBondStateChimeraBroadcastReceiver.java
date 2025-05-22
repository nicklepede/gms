package com.google.android.gms.trustagent.trustlet.device.bluetooth.internal;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.chimera.IntentOperation;
import defpackage.diyh;
import defpackage.djec;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class BluetoothDeviceBondStateChimeraBroadcastReceiver extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        int intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", -1);
        if (bluetoothDevice == null || intExtra != 10) {
            return;
        }
        SharedPreferences.Editor edit = diyh.a(this).edit();
        edit.remove(djec.c(bluetoothDevice));
        edit.remove(djec.e(bluetoothDevice));
        edit.commit();
    }
}
