package com.google.android.gms.carsetup;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.hardware.usb.UsbAccessory;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.os.Build;
import android.os.PowerManager;
import com.google.android.chimera.IntentOperation;
import defpackage.albn;
import defpackage.alsn;
import defpackage.also;
import defpackage.alst;
import defpackage.alsu;
import defpackage.alsv;
import defpackage.alvs;
import defpackage.alwx;
import defpackage.asqh;
import defpackage.eiif;
import defpackage.eijj;
import defpackage.eiuu;
import defpackage.ejfg;
import defpackage.ejhh;
import defpackage.flwu;
import defpackage.flwx;
import defpackage.flxe;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CarBluetoothReceiverOperation extends IntentOperation {
    private static final ejhh a = albn.a("CAR.BTOP");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        alst alstVar;
        PackageInfo packageInfo;
        if (asqh.g()) {
            a.h().ah(2605).x("Escape Pod is enabled, so ignoring intent.");
            return;
        }
        if (alst.a != null) {
            alstVar = alst.a;
        } else {
            synchronized (alst.class) {
                if (alst.a == null) {
                    alst.a = new alst(getApplicationContext());
                }
            }
            alstVar = alst.a;
        }
        alstVar.e = flwu.d();
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        intent.getAction();
        if (bluetoothDevice == null) {
            alstVar.b.h().ah(2790).x("Received bluetooth connected event but device details missing");
        } else if (!"android.bluetooth.device.action.UUID".equals(intent.getAction())) {
            int a2 = alsu.a(intent);
            if (a2 == 2) {
                boolean b = flxe.a.a().b() ? flxe.c() && alsu.b(bluetoothDevice.getUuids()) : alsu.b(bluetoothDevice.getUuids());
                boolean c = alsu.c(intent);
                if (b) {
                    alstVar.b("android.bluetooth.device.action.ACL_CONNECTED", bluetoothDevice, true, false);
                } else if (alstVar.e && c && alstVar.c(bluetoothDevice, false)) {
                    alstVar.b("android.bluetooth.device.action.ACL_CONNECTED", bluetoothDevice, false, true);
                }
            } else if (a2 == 0) {
                alstVar.d.set(false);
                boolean c2 = alsu.c(intent);
                if (alstVar.e && c2 && alstVar.c(bluetoothDevice, true)) {
                    if (flwu.a.a().e()) {
                        alstVar.b.h().ah(2785).x("Stop CarStartupService");
                        alstVar.c.stopService(alst.a("android.bluetooth.device.action.ACL_DISCONNECTED"));
                    } else {
                        alstVar.b("android.bluetooth.device.action.ACL_DISCONNECTED", bluetoothDevice, false, true);
                    }
                }
            }
        } else if (Build.VERSION.SDK_INT < 30 && alsu.b(intent.getParcelableArrayExtra("android.bluetooth.device.extra.UUID"))) {
            alstVar.b("android.bluetooth.device.action.ACL_CONNECTED", bluetoothDevice, true, false);
        }
        if (flwx.c()) {
            ejhh ejhhVar = alsv.a;
            BluetoothDevice bluetoothDevice2 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (bluetoothDevice2 == null) {
                alsv.a.j().ah(2800).x("PreSetupLaunchHelper: Bluetooth device is null");
                return;
            }
            UsbAccessory[] accessoryList = ((UsbManager) getSystemService(UsbManager.class)).getAccessoryList();
            if (accessoryList != null && accessoryList.length > 0) {
                alsv.a.j().ah(2799).x("Suppressing WiFi triggered flow due to likely USB Head Unit connection");
                return;
            }
            if (alsu.a(intent) == 2) {
                if (!alsu.c(intent)) {
                    flwx flwxVar = flwx.a;
                    if (flwxVar.a().d()) {
                        eiuu F = eiuu.F(eijj.e(',').d().l(flwxVar.a().c()));
                        String b2 = eiif.b(bluetoothDevice2.getName());
                        ejfg listIterator = F.listIterator();
                        while (listIterator.hasNext()) {
                            if (b2.contains((String) listIterator.next())) {
                            }
                        }
                        return;
                    }
                    return;
                }
                if (alsu.b(bluetoothDevice2.getUuids())) {
                    ejhh ejhhVar2 = also.a;
                    PackageManager packageManager = getPackageManager();
                    if (flwx.c() && flxe.c() && !alvs.a.b(this) && !alvs.a.c(this)) {
                        if (Build.VERSION.SDK_INT < flwx.a.a().a()) {
                            also.a.j().ah(2778).x("SDK version below wifi enabled version");
                            return;
                        }
                        try {
                            packageInfo = packageManager.getPackageInfo("com.google.android.projection.gearhead", 4096);
                        } catch (PackageManager.NameNotFoundException unused) {
                            packageInfo = null;
                        }
                        if (packageInfo == null && flwx.a.a().h()) {
                            also.a.j().ah(2777).x("Gearhead not installed; update flow only enabled");
                            return;
                        }
                        if (packageInfo != null && packageManager.checkPermission("android.permission.ACCESS_COARSE_LOCATION", "com.google.android.projection.gearhead") != 0 && !flwx.a.a().g()) {
                            also.a.j().ah(2776).x("Location permission denied on Android Auto");
                            return;
                        }
                        if (!((LocationManager) getSystemService("location")).isProviderEnabled("gps") && !flwx.a.a().f()) {
                            also.a.j().ah(2775).x("Location Services disabled");
                            return;
                        }
                        if (((PowerManager) getSystemService("power")).isPowerSaveMode() && !flwx.a.a().e()) {
                            also.a.j().ah(2774).x("Device in battery saver mode");
                            return;
                        }
                        int a3 = new alsn(this).a();
                        int i = alwx.a;
                        alwx.a(this, 2, a3, new Intent().setClassName("com.google.android.projection.gearhead", flwx.a.a().b()));
                    }
                }
            }
        }
    }
}
