package com.google.android.gms.drivingmode.autolaunch;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.chimera.Service;
import defpackage.atnq;
import defpackage.azrd;
import defpackage.azre;
import defpackage.azrf;
import defpackage.azsa;
import defpackage.azut;
import defpackage.fokk;
import defpackage.fsly;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class AutoLaunchServiceImpl extends Service {
    public azrf a;

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        azrf azrfVar = new azrf(this);
        this.a = azrfVar;
        azrfVar.g = new azut(this);
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null && fokk.e()) {
            azrf azrfVar = this.a;
            String action = intent.getAction();
            if ("com.google.android.gms.carsetup.drivingmode.ACTIVITY_TRANSITION_START".equals(action) || "com.google.android.gms.carsetup.drivingmode.ACTIVITY_TRANSITION_END".equals(action) || "com.google.android.gms.carsetup.drivingmode.LAUNCH_NOTIFICATION_ACCEPT".equals(action) || "com.google.android.gms.carsetup.drivingmode.LAUNCH_NOTIFICATION_TIMEOUT".equals(action) || "com.google.android.gms.carsetup.drivingmode.LAUNCH_NOTIFICATION_CANCEL".equals(action)) {
                Log.i("CAR.DRIVINGMODE", "DrivingModeAutoLaunch received intent: ".concat(intent.toString()));
                azrfVar.e = true;
                azsa azsaVar = azrfVar.d;
                azsaVar.i(new azrd(azrfVar, action));
                azsaVar.e();
            } else {
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                if (bluetoothDevice == null) {
                    bluetoothDevice = null;
                } else if (fsly.a.lK().p()) {
                    bluetoothDevice = atnq.a(azrfVar.a).getRemoteDevice(bluetoothDevice.getAddress());
                }
                if (bluetoothDevice == null) {
                    Log.i("CAR.DRIVINGMODE", "No device: ".concat(intent.toString()));
                } else {
                    boolean booleanExtra = intent.getBooleanExtra("car_startup.HAS_WIFI", true);
                    if (bluetoothDevice.getBondState() != 10 && ("android.bluetooth.device.action.ACL_CONNECTED".equals(action) || "android.bluetooth.device.action.ACL_DISCONNECTED".equals(action))) {
                        azrfVar.e = true;
                        azsa azsaVar2 = azrfVar.d;
                        azsaVar2.i(new azre(azrfVar, action, bluetoothDevice, booleanExtra));
                        azsaVar2.e();
                    }
                }
            }
            return 1;
        }
        return 2;
    }
}
