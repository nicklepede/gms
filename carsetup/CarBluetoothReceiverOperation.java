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
import defpackage.ancy;
import defpackage.anty;
import defpackage.antz;
import defpackage.anue;
import defpackage.anuf;
import defpackage.anug;
import defpackage.anxc;
import defpackage.anxd;
import defpackage.anyi;
import defpackage.auub;
import defpackage.ekvk;
import defpackage.ekwo;
import defpackage.elhz;
import defpackage.elsn;
import defpackage.eluq;
import defpackage.food;
import defpackage.foog;
import defpackage.foon;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CarBluetoothReceiverOperation extends IntentOperation {
    private static final eluq a = ancy.a("CAR.BTOP");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        anue anueVar;
        PackageInfo packageInfo;
        if (auub.g()) {
            a.h().ai(2609).x("Escape Pod is enabled, so ignoring intent.");
            return;
        }
        if (anue.a != null) {
            anueVar = anue.a;
        } else {
            synchronized (anue.class) {
                if (anue.a == null) {
                    anue.a = new anue(getApplicationContext());
                }
            }
            anueVar = anue.a;
        }
        anueVar.e = food.d();
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        intent.getAction();
        if (bluetoothDevice == null) {
            anueVar.b.h().ai(2794).x("Received bluetooth connected event but device details missing");
        } else if (!"android.bluetooth.device.action.UUID".equals(intent.getAction())) {
            int a2 = anuf.a(intent);
            if (a2 == 2) {
                boolean b = foon.a.lK().b() ? foon.c() && anuf.b(bluetoothDevice.getUuids()) : anuf.b(bluetoothDevice.getUuids());
                boolean c = anuf.c(intent);
                if (b) {
                    anueVar.c(bluetoothDevice, true, false);
                } else if (anueVar.e && c && anueVar.b(bluetoothDevice, false)) {
                    anueVar.c(bluetoothDevice, false, true);
                }
            } else if (a2 == 0) {
                anueVar.d.set(false);
                boolean c2 = anuf.c(intent);
                if (anueVar.e && c2 && anueVar.b(bluetoothDevice, true)) {
                    anueVar.b.h().ai(2789).x("Stop CarStartupService");
                    anueVar.c.stopService(anue.a("android.bluetooth.device.action.ACL_DISCONNECTED"));
                }
            }
        } else if (Build.VERSION.SDK_INT < 30 && anuf.b(intent.getParcelableArrayExtra("android.bluetooth.device.extra.UUID"))) {
            anueVar.c(bluetoothDevice, true, false);
        }
        if (foog.c()) {
            eluq eluqVar = anug.a;
            BluetoothDevice bluetoothDevice2 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (bluetoothDevice2 == null) {
                anug.a.j().ai(2804).x("PreSetupLaunchHelper: Bluetooth device is null");
                return;
            }
            UsbAccessory[] accessoryList = ((UsbManager) getSystemService(UsbManager.class)).getAccessoryList();
            if (accessoryList != null && accessoryList.length > 0) {
                anug.a.j().ai(2803).x("Suppressing WiFi triggered flow due to likely USB Head Unit connection");
                return;
            }
            if (anuf.a(intent) == 2) {
                if (!anuf.c(intent)) {
                    foog foogVar = foog.a;
                    if (foogVar.lK().d()) {
                        elhz F = elhz.F(ekwo.e(',').d().l(foogVar.lK().c()));
                        String b2 = ekvk.b(bluetoothDevice2.getName());
                        elsn listIterator = F.listIterator();
                        while (listIterator.hasNext()) {
                            if (b2.contains((String) listIterator.next())) {
                            }
                        }
                        return;
                    }
                    return;
                }
                if (anuf.b(bluetoothDevice2.getUuids())) {
                    eluq eluqVar2 = antz.a;
                    PackageManager packageManager = getPackageManager();
                    if (foog.c() && foon.c()) {
                        anxc anxcVar = anxd.a;
                        if (anxcVar.b(this) || anxcVar.c(this)) {
                            return;
                        }
                        if (Build.VERSION.SDK_INT < foog.a.lK().a()) {
                            antz.a.j().ai(2782).x("SDK version below wifi enabled version");
                            return;
                        }
                        try {
                            packageInfo = packageManager.getPackageInfo("com.google.android.projection.gearhead", 4096);
                        } catch (PackageManager.NameNotFoundException unused) {
                            packageInfo = null;
                        }
                        if (packageInfo == null && foog.a.lK().h()) {
                            antz.a.j().ai(2781).x("Gearhead not installed; update flow only enabled");
                            return;
                        }
                        if (packageInfo != null && packageManager.checkPermission("android.permission.ACCESS_COARSE_LOCATION", "com.google.android.projection.gearhead") != 0 && !foog.a.lK().g()) {
                            antz.a.j().ai(2780).x("Location permission denied on Android Auto");
                            return;
                        }
                        if (!((LocationManager) getSystemService("location")).isProviderEnabled("gps") && !foog.a.lK().f()) {
                            antz.a.j().ai(2779).x("Location Services disabled");
                            return;
                        }
                        if (((PowerManager) getSystemService("power")).isPowerSaveMode() && !foog.a.lK().e()) {
                            antz.a.j().ai(2778).x("Device in battery saver mode");
                            return;
                        }
                        int a3 = new anty(this).a();
                        int i = anyi.a;
                        anyi.a(this, 2, a3, new Intent().setClassName("com.google.android.projection.gearhead", foog.a.lK().b()));
                    }
                }
            }
        }
    }
}
