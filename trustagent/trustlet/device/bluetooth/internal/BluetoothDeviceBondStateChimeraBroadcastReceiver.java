package com.google.android.gms.trustagent.trustlet.device.bluetooth.internal;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.chimera.IntentOperation;
import defpackage.dgnc;
import defpackage.dgsx;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class BluetoothDeviceBondStateChimeraBroadcastReceiver extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        int intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", -1);
        if (bluetoothDevice == null || intExtra != 10) {
            return;
        }
        SharedPreferences.Editor edit = dgnc.a(this).edit();
        edit.remove(dgsx.c(bluetoothDevice));
        edit.remove(dgsx.e(bluetoothDevice));
        edit.commit();
    }
}
