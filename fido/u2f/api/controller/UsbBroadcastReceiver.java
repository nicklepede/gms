package com.google.android.gms.fido.u2f.api.controller;

import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.bbnq;
import defpackage.bbnv;
import defpackage.bcnj;
import defpackage.bcrq;
import defpackage.eiig;
import java.util.concurrent.ConcurrentSkipListMap;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class UsbBroadcastReceiver extends TracingBroadcastReceiver {
    private static final bcnj b = new bcnj("UsbBroadcastReceiver");
    final bcrq a;
    private final UsbManager c;

    public UsbBroadcastReceiver(bcrq bcrqVar, UsbManager usbManager) {
        super("fido");
        this.a = bcrqVar;
        eiig.x(usbManager);
        this.c = usbManager;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        synchronized (this) {
            String action = intent.getAction();
            UsbDevice usbDevice = (UsbDevice) intent.getParcelableExtra("device");
            if ("com.google.fido.u2f.api.USB_PERMISSION".equals(action)) {
                bcrq bcrqVar = this.a;
                bcrqVar.c.remove(Integer.valueOf(usbDevice.getDeviceId()));
                if (intent.getBooleanExtra("permission", false)) {
                    bcnj bcnjVar = b;
                    bcnjVar.h("Permission granted for device (%d)", Integer.valueOf(usbDevice.getDeviceId()));
                    try {
                        bcrqVar.b.put(Integer.valueOf(usbDevice.getDeviceId()), bbnq.b(usbDevice, this.c));
                        bcnjVar.d("Device (%d) is confirmed to be a U2F device", Integer.valueOf(usbDevice.getDeviceId()));
                    } catch (bbnv unused) {
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
                        this.a.b.put(Integer.valueOf(usbDevice.getDeviceId()), bbnq.b(usbDevice, usbManager));
                    } catch (bbnv unused2) {
                        b.d("Device (%d) is not a valid U2F device", Integer.valueOf(usbDevice.getDeviceId()));
                    }
                } else {
                    b.d("Requesting permission for device (%d)", Integer.valueOf(usbDevice.getDeviceId()));
                    this.a.j(usbDevice);
                }
            } else if ("android.hardware.usb.action.USB_DEVICE_DETACHED".equals(action)) {
                b.d("Device (%d) removed", Integer.valueOf(usbDevice.getDeviceId()));
                bcrq bcrqVar2 = this.a;
                bcrqVar2.c.remove(Integer.valueOf(usbDevice.getDeviceId()));
                ConcurrentSkipListMap concurrentSkipListMap = bcrqVar2.b;
                concurrentSkipListMap.remove(Integer.valueOf(usbDevice.getDeviceId()));
                if (concurrentSkipListMap.isEmpty() && bcrqVar2.d == 3) {
                    bcrqVar2.i();
                    bcrqVar2.d = 4;
                }
            } else {
                b.d("Received unexpected action: %s", action);
            }
        }
        bcrq bcrqVar3 = this.a;
        if (bcrqVar3.c.isEmpty() && bcrqVar3.b.size() == 1) {
            bcrqVar3.l();
        } else {
            b.d("Not starting state machine. Still pending device approval.", new Object[0]);
        }
    }
}
