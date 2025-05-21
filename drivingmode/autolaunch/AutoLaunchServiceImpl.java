package com.google.android.gms.drivingmode.autolaunch;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.chimera.Service;
import defpackage.arlb;
import defpackage.axnd;
import defpackage.axne;
import defpackage.axnf;
import defpackage.axoa;
import defpackage.axqt;
import defpackage.fltb;
import defpackage.fpsg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class AutoLaunchServiceImpl extends Service {
    public axnf a;

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        axnf axnfVar = new axnf(this);
        this.a = axnfVar;
        axnfVar.g = new axqt(this);
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null && fltb.e()) {
            axnf axnfVar = this.a;
            String action = intent.getAction();
            if ("com.google.android.gms.carsetup.drivingmode.ACTIVITY_TRANSITION_START".equals(action) || "com.google.android.gms.carsetup.drivingmode.ACTIVITY_TRANSITION_END".equals(action) || "com.google.android.gms.carsetup.drivingmode.LAUNCH_NOTIFICATION_ACCEPT".equals(action) || "com.google.android.gms.carsetup.drivingmode.LAUNCH_NOTIFICATION_TIMEOUT".equals(action) || "com.google.android.gms.carsetup.drivingmode.LAUNCH_NOTIFICATION_CANCEL".equals(action)) {
                Log.i("CAR.DRIVINGMODE", "DrivingModeAutoLaunch received intent: ".concat(intent.toString()));
                axnfVar.e = true;
                axoa axoaVar = axnfVar.d;
                axoaVar.i(new axnd(axnfVar, action));
                axoaVar.e();
            } else {
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                if (bluetoothDevice == null) {
                    bluetoothDevice = null;
                } else if (fpsg.a.a().p()) {
                    bluetoothDevice = arlb.a(axnfVar.a).getRemoteDevice(bluetoothDevice.getAddress());
                }
                if (bluetoothDevice == null) {
                    Log.i("CAR.DRIVINGMODE", "No device: ".concat(intent.toString()));
                } else {
                    boolean booleanExtra = intent.getBooleanExtra("car_startup.HAS_WIFI", true);
                    if (bluetoothDevice.getBondState() != 10 && ("android.bluetooth.device.action.ACL_CONNECTED".equals(action) || "android.bluetooth.device.action.ACL_DISCONNECTED".equals(action))) {
                        axnfVar.e = true;
                        axoa axoaVar2 = axnfVar.d;
                        axoaVar2.i(new axne(axnfVar, action, bluetoothDevice, booleanExtra));
                        axoaVar2.e();
                    }
                }
            }
            return 1;
        }
        return 2;
    }
}
