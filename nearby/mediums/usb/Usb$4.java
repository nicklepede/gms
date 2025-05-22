package com.google.android.gms.nearby.mediums.usb;

import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.clya;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class Usb$4 extends TracingBroadcastReceiver {
    public final /* synthetic */ clya a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Usb$4(clya clyaVar) {
        super("nearby", "AccessoryAttachedReceiver");
        this.a = clyaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0068, code lost:
    
        if (r1.equals("android.hardware.usb.action.USB_ACCESSORY_ATTACHED") != false) goto L32;
     */
    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void jP(android.content.Context r7, android.content.Intent r8) {
        /*
            r6 = this;
            java.lang.String r7 = "accessory"
            android.os.Parcelable r7 = r8.getParcelableExtra(r7)
            android.hardware.usb.UsbAccessory r7 = (android.hardware.usb.UsbAccessory) r7
            r0 = 0
            if (r7 != 0) goto L1a
            clya r7 = r6.a
            chij r7 = r7.a
            android.hardware.usb.UsbAccessory[] r7 = r7.f()
            int r1 = r7.length
            if (r1 == 0) goto L19
            r7 = r7[r0]
            goto L1a
        L19:
            r7 = 0
        L1a:
            if (r7 != 0) goto L2a
            chet r7 = defpackage.clno.a
            chet r7 = r7.c()
            java.lang.Object[] r8 = new java.lang.Object[r0]
            java.lang.String r0 = "Received a USB attachment event without a USB accessory"
            r7.p(r0, r8)
            return
        L2a:
            java.lang.String r1 = r8.getAction()
            if (r1 != 0) goto L3e
            chet r7 = defpackage.clno.a
            chet r7 = r7.c()
            java.lang.Object[] r8 = new java.lang.Object[r0]
            java.lang.String r0 = "Received a USB attachment event without an action"
            r7.p(r0, r8)
            return
        L3e:
            java.lang.String r1 = r8.getAction()
            int r2 = r1.hashCode()
            r3 = 276138536(0x10758a28, float:4.8424162E-29)
            r4 = 2
            r5 = 1
            if (r2 == r3) goto L6b
            r3 = 1099555123(0x4189e133, float:17.23496)
            if (r2 == r3) goto L62
            r0 = 1605365505(0x5fafef01, float:2.5354705E19)
            if (r2 == r0) goto L58
            goto L75
        L58:
            java.lang.String r0 = "android.hardware.usb.action.USB_ACCESSORY_DETACHED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L75
            r0 = r4
            goto L76
        L62:
            java.lang.String r2 = "android.hardware.usb.action.USB_ACCESSORY_ATTACHED"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L75
            goto L76
        L6b:
            java.lang.String r0 = "android.hardware.usb.action.USB_ACCESSORY_HANDSHAKE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L75
            r0 = r5
            goto L76
        L75:
            r0 = -1
        L76:
            if (r0 == 0) goto L97
            if (r0 == r5) goto L97
            if (r0 == r4) goto L8c
            chet r7 = defpackage.clno.a
            chet r7 = r7.e()
            java.lang.String r8 = r8.getAction()
            java.lang.String r0 = "Received unexpected broadcast %s"
            r7.h(r0, r8)
            return
        L8c:
            clya r8 = r6.a
            clxz r0 = new clxz
            r0.<init>()
            r8.e(r0)
            return
        L97:
            clya r8 = r6.a
            clxy r0 = new clxy
            r0.<init>()
            r8.e(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.mediums.usb.Usb$4.jP(android.content.Context, android.content.Intent):void");
    }
}
