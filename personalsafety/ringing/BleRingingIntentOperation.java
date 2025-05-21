package com.google.android.gms.personalsafety.ringing;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCallback;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import defpackage.arlb;
import defpackage.cvpo;
import defpackage.cvpp;
import defpackage.cvsg;
import defpackage.cvsm;
import defpackage.cvsn;
import defpackage.ejhf;
import defpackage.fmzp;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class BleRingingIntentOperation extends IntentOperation {
    private BluetoothAdapter a;
    private cvsg b;
    private final Map c = new HashMap();

    public static void a(Context context, BluetoothAdapter bluetoothAdapter, String str, BluetoothGattCallback bluetoothGattCallback) {
        if (str == null) {
            ((ejhf) cvpo.a.i()).B("%s MAC address is null.", "[S]");
            return;
        }
        if (!BluetoothAdapter.checkBluetoothAddress(str)) {
            ((ejhf) cvpo.a.i()).P("%s Unsupported MAC Address: '%s'", "[S]", cvpp.c(str));
            return;
        }
        if (bluetoothAdapter == null) {
            ((ejhf) cvpo.a.i()).B("%s bluetoothAdapter is not initialized.", "[S]");
            return;
        }
        try {
            BluetoothDevice remoteDevice = bluetoothAdapter.getRemoteDevice(str);
            if (remoteDevice == null) {
                ((ejhf) cvpo.a.i()).x("bluetoothDevice is null");
            } else {
                remoteDevice.connectGatt(context, false, bluetoothGattCallback, 2);
                ((ejhf) cvpo.a.h()).P("%s C to MAC '%s'", "[S]", cvpp.c(str));
            }
        } catch (IllegalArgumentException unused) {
            ((ejhf) cvpo.a.j()).B("%s Device not found with provided address. Unable to connect.", "[S]");
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            ((ejhf) cvpo.a.i()).B("%s Intent is null", "[S]");
            return;
        }
        String action = intent.getAction();
        if (action == null || !action.equals("com.google.android.personalsafety.internal.ringing.RING_TAG")) {
            ((ejhf) cvpo.a.j()).P("%s Unknown action received: %s", "[S]", action);
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            ((ejhf) cvpo.a.j()).B("%s Ringing intent extras are null", "[S]");
            return;
        }
        cvsm a = cvsn.a(extras);
        if (a == null) {
            ((ejhf) cvpo.a.i()).B("%s TagRingingInfo is null.", "[S]");
            return;
        }
        if (fmzp.ah() && fmzp.L()) {
            BluetoothAdapter a2 = arlb.a(getApplicationContext());
            this.a = a2;
            if (a2 == null) {
                ((ejhf) cvpo.a.j()).B("%s Unable to obtain a BluetoothAdapter.", "[S]");
                return;
            }
            Context applicationContext = getApplicationContext();
            Map map = this.c;
            this.b = new cvsg(applicationContext, map);
            String str = a.a;
            map.put(str, a);
            a(this, this.a, str, this.b);
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
    }
}
