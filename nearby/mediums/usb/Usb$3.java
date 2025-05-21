package com.google.android.gms.nearby.mediums.usb;

import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.cjpv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class Usb$3 extends TracingBroadcastReceiver {
    public final /* synthetic */ cjpv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Usb$3(cjpv cjpvVar) {
        super("nearby", "DeviceAttachedReceiver");
        this.a = cjpvVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
    
        if (r1.equals("android.hardware.usb.action.USB_DEVICE_ATTACHED") != false) goto L22;
     */
    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void jz(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            java.lang.String r6 = "device"
            android.os.Parcelable r6 = r7.getParcelableExtra(r6)
            android.hardware.usb.UsbDevice r6 = (android.hardware.usb.UsbDevice) r6
            r0 = 0
            if (r6 != 0) goto L19
            cexi r6 = defpackage.cjfj.a
            cexi r6 = r6.c()
            java.lang.Object[] r7 = new java.lang.Object[r0]
            java.lang.String r0 = "Received a USB attachment event without a USB device"
            r6.p(r0, r7)
            return
        L19:
            java.lang.String r1 = r7.getAction()
            if (r1 != 0) goto L2d
            cexi r6 = defpackage.cjfj.a
            cexi r6 = r6.c()
            java.lang.Object[] r7 = new java.lang.Object[r0]
            java.lang.String r0 = "Received a USB attachment event without an action"
            r6.p(r0, r7)
            return
        L2d:
            java.lang.String r1 = r7.getAction()
            int r2 = r1.hashCode()
            r3 = -2114103349(0xffffffff81fd57cb, float:-9.30635E-38)
            r4 = 1
            if (r2 == r3) goto L4b
            r0 = -1608292967(0xffffffffa0236599, float:-1.3840253E-19)
            if (r2 == r0) goto L41
            goto L54
        L41:
            java.lang.String r0 = "android.hardware.usb.action.USB_DEVICE_DETACHED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L54
            r0 = r4
            goto L55
        L4b:
            java.lang.String r2 = "android.hardware.usb.action.USB_DEVICE_ATTACHED"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L54
            goto L55
        L54:
            r0 = -1
        L55:
            if (r0 == 0) goto L74
            if (r0 == r4) goto L69
            cexi r6 = defpackage.cjfj.a
            cexi r6 = r6.e()
            java.lang.String r7 = r7.getAction()
            java.lang.String r0 = "Received unexpected broadcast %s"
            r6.h(r0, r7)
            return
        L69:
            cjpv r7 = r5.a
            cjps r0 = new cjps
            r0.<init>()
            r7.e(r0)
            return
        L74:
            cjpv r7 = r5.a
            cjpr r0 = new cjpr
            r0.<init>()
            r7.e(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.mediums.usb.Usb$3.jz(android.content.Context, android.content.Intent):void");
    }
}
