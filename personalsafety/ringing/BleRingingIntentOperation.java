package com.google.android.gms.personalsafety.ringing;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCallback;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import defpackage.atnq;
import defpackage.cxze;
import defpackage.cxzf;
import defpackage.cybw;
import defpackage.cycc;
import defpackage.cycd;
import defpackage.eluo;
import defpackage.fpro;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class BleRingingIntentOperation extends IntentOperation {
    private BluetoothAdapter a;
    private cybw b;
    private final Map c = new HashMap();

    public static void a(Context context, BluetoothAdapter bluetoothAdapter, String str, BluetoothGattCallback bluetoothGattCallback) {
        if (str == null) {
            ((eluo) cxze.a.i()).B("%s MAC address is null.", "[S]");
            return;
        }
        if (!BluetoothAdapter.checkBluetoothAddress(str)) {
            ((eluo) cxze.a.i()).P("%s Unsupported MAC Address: '%s'", "[S]", cxzf.c(str));
            return;
        }
        if (bluetoothAdapter == null) {
            ((eluo) cxze.a.i()).B("%s bluetoothAdapter is not initialized.", "[S]");
            return;
        }
        try {
            BluetoothDevice remoteDevice = bluetoothAdapter.getRemoteDevice(str);
            if (remoteDevice == null) {
                ((eluo) cxze.a.i()).x("bluetoothDevice is null");
            } else {
                remoteDevice.connectGatt(context, false, bluetoothGattCallback, 2);
                ((eluo) cxze.a.h()).P("%s C to MAC '%s'", "[S]", cxzf.c(str));
            }
        } catch (IllegalArgumentException unused) {
            ((eluo) cxze.a.j()).B("%s Device not found with provided address. Unable to connect.", "[S]");
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            ((eluo) cxze.a.i()).B("%s Intent is null", "[S]");
            return;
        }
        String action = intent.getAction();
        if (action == null || !action.equals("com.google.android.personalsafety.internal.ringing.RING_TAG")) {
            ((eluo) cxze.a.j()).P("%s Unknown action received: %s", "[S]", action);
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            ((eluo) cxze.a.j()).B("%s Ringing intent extras are null", "[S]");
            return;
        }
        cycc a = cycd.a(extras);
        if (a == null) {
            ((eluo) cxze.a.i()).B("%s TagRingingInfo is null.", "[S]");
            return;
        }
        if (fpro.ak() && fpro.N()) {
            BluetoothAdapter a2 = atnq.a(getApplicationContext());
            this.a = a2;
            if (a2 == null) {
                ((eluo) cxze.a.j()).B("%s Unable to obtain a BluetoothAdapter.", "[S]");
                return;
            }
            Context applicationContext = getApplicationContext();
            Map map = this.c;
            this.b = new cybw(applicationContext, map);
            String str = a.a;
            map.put(str, a);
            a(this, this.a, str, this.b);
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
    }
}
