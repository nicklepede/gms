package com.google.android.gms.fido.u2f.api.controller;

import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.bdrh;
import defpackage.bdrm;
import defpackage.beow;
import defpackage.betd;
import defpackage.ekvl;
import java.util.concurrent.ConcurrentSkipListMap;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class UsbBroadcastReceiver extends TracingBroadcastReceiver {
    private static final beow b = new beow("UsbBroadcastReceiver");
    final betd a;
    private final UsbManager c;

    public UsbBroadcastReceiver(betd betdVar, UsbManager usbManager) {
        super("fido");
        this.a = betdVar;
        ekvl.y(usbManager);
        this.c = usbManager;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        synchronized (this) {
            String action = intent.getAction();
            UsbDevice usbDevice = (UsbDevice) intent.getParcelableExtra("device");
            if ("com.google.fido.u2f.api.USB_PERMISSION".equals(action)) {
                betd betdVar = this.a;
                betdVar.c.remove(Integer.valueOf(usbDevice.getDeviceId()));
                if (intent.getBooleanExtra("permission", false)) {
                    beow beowVar = b;
                    beowVar.h("Permission granted for device (%d)", Integer.valueOf(usbDevice.getDeviceId()));
                    try {
                        betdVar.b.put(Integer.valueOf(usbDevice.getDeviceId()), bdrh.b(usbDevice, this.c));
                        beowVar.d("Device (%d) is confirmed to be a U2F device", Integer.valueOf(usbDevice.getDeviceId()));
                    } catch (bdrm unused) {
                        b.d("Device (%d) is not a valid U2F device", Integer.valueOf(usbDevice.getDeviceId()));
                    }
                } else {
                    b.f("Permission denied for device (%d)", Integer.valueOf(usbDevice.getDeviceId()));
                }
            } else if ("android.hardware.usb.action.USB_DEVICE_ATTACHED".equals(action)) {
                UsbManager usbManager = this.c;
                if (usbManager.hasPermission(usbDevice)) {
                    b.d("Already have permission for device (%d)", Integer.valueOf(usbDevice.getDeviceId()));
                    try {
                        this.a.b.put(Integer.valueOf(usbDevice.getDeviceId()), bdrh.b(usbDevice, usbManager));
                    } catch (bdrm unused2) {
                        b.d("Device (%d) is not a valid U2F device", Integer.valueOf(usbDevice.getDeviceId()));
                    }
                } else {
                    b.d("Requesting permission for device (%d)", Integer.valueOf(usbDevice.getDeviceId()));
                    this.a.j(usbDevice);
                }
            } else if ("android.hardware.usb.action.USB_DEVICE_DETACHED".equals(action)) {
                b.d("Device (%d) removed", Integer.valueOf(usbDevice.getDeviceId()));
                betd betdVar2 = this.a;
                betdVar2.c.remove(Integer.valueOf(usbDevice.getDeviceId()));
                ConcurrentSkipListMap concurrentSkipListMap = betdVar2.b;
                concurrentSkipListMap.remove(Integer.valueOf(usbDevice.getDeviceId()));
                if (concurrentSkipListMap.isEmpty() && betdVar2.d == 3) {
                    betdVar2.i();
                    betdVar2.d = 4;
                }
            } else {
                b.d("Received unexpected action: %s", action);
            }
        }
        betd betdVar3 = this.a;
        if (betdVar3.c.isEmpty() && betdVar3.b.size() == 1) {
            betdVar3.l();
        } else {
            b.d("Not starting state machine. Still pending device approval.", new Object[0]);
        }
    }
}
