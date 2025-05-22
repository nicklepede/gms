package com.google.android.gms.carsetup.setup;

import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbManager;
import android.hardware.usb.UsbPort;
import android.hardware.usb.UsbPortStatus;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.SystemClock;
import android.system.Os;
import com.google.android.gms.carsetup.setup.UsbConnectionHelper$TrackedParcelFileDescriptor;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.anar;
import defpackage.andw;
import defpackage.anzh;
import defpackage.anzi;
import defpackage.dxfn;
import defpackage.dxfo;
import defpackage.ekvl;
import defpackage.ekww;
import defpackage.ekxk;
import defpackage.eoke;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class UsbConnectionHelper$TrackedParcelFileDescriptor extends ParcelFileDescriptor {
    public static DisconnectWatcher e;
    public static HandlerThread f;
    public static Handler g;
    public static Context h;
    public static long i;
    final long k;
    private final AtomicBoolean m;
    public static final List a = DesugarCollections.synchronizedList(new ArrayList());
    public static final AtomicInteger b = new AtomicInteger(0);
    public static final AtomicInteger c = new AtomicInteger(0);
    public static final Object d = new Object();
    private static final AtomicInteger l = new AtomicInteger(0);
    static final ekww j = new ekww() { // from class: anzd
        @Override // defpackage.ekww
        public final Object lK() {
            boolean z;
            ekvl.z(UsbConnectionHelper$TrackedParcelFileDescriptor.h, "Application context is null");
            UsbManager usbManager = (UsbManager) UsbConnectionHelper$TrackedParcelFileDescriptor.h.getSystemService("usb");
            ekvl.z(usbManager, "UsbManager is null");
            Iterator it = usbManager.getPorts().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                UsbPortStatus status = ((UsbPort) it.next()).getStatus();
                if (status != null && status.isConnected()) {
                    z = true;
                    break;
                }
            }
            return Boolean.valueOf(z);
        }
    };
    public static final Parcelable.Creator CREATOR = new anzh();

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class DisconnectWatcher extends TracingBroadcastReceiver {
        public DisconnectWatcher(Context context) {
            super(context);
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, Intent intent) {
            boolean z = false;
            boolean booleanExtra = intent.getBooleanExtra("connected", false);
            boolean booleanExtra2 = intent.getBooleanExtra("configured", false);
            boolean booleanExtra3 = intent.getBooleanExtra("accessory", false);
            if (!booleanExtra || !booleanExtra2) {
                z = booleanExtra3;
            } else if (booleanExtra3) {
                return;
            }
            if (UsbConnectionHelper$TrackedParcelFileDescriptor.i == 0 || SystemClock.elapsedRealtime() - UsbConnectionHelper$TrackedParcelFileDescriptor.i >= 2000 || !((Boolean) UsbConnectionHelper$TrackedParcelFileDescriptor.j.lK()).booleanValue()) {
                List list = UsbConnectionHelper$TrackedParcelFileDescriptor.a;
                synchronized (list) {
                    if (!list.isEmpty()) {
                        anzi.a.h().ai(2925).U("Closing %s FDs due to USB disconnect (connected=%s, configured=%s, accessory=%s)", new dxfn(list.size()), new dxfo(booleanExtra), new dxfo(booleanExtra2), new dxfo(z));
                    }
                }
                try {
                    UsbConnectionHelper$TrackedParcelFileDescriptor.a();
                } catch (IOException e) {
                    throw new ekxk(e);
                }
            }
        }
    }

    public UsbConnectionHelper$TrackedParcelFileDescriptor(ParcelFileDescriptor parcelFileDescriptor) {
        this(parcelFileDescriptor, (Os.getpid() << 32) | l.getAndIncrement(), false);
    }

    public static void a() {
        List list = a;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                UsbConnectionHelper$TrackedParcelFileDescriptor usbConnectionHelper$TrackedParcelFileDescriptor = (UsbConnectionHelper$TrackedParcelFileDescriptor) it.next();
                if (usbConnectionHelper$TrackedParcelFileDescriptor != null) {
                    usbConnectionHelper$TrackedParcelFileDescriptor.b();
                }
                it.remove();
            }
        }
    }

    private final void b() {
        if (this.m.compareAndSet(false, true)) {
            ekvl.z(h, "Application context is null");
            andw.h(h, eoke.USB_FD_CLOSED);
            super.close();
        }
    }

    @Override // android.os.ParcelFileDescriptor, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (anar.a()) {
            anar.b();
            throw null;
        }
        b();
        List list = a;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                UsbConnectionHelper$TrackedParcelFileDescriptor usbConnectionHelper$TrackedParcelFileDescriptor = (UsbConnectionHelper$TrackedParcelFileDescriptor) it.next();
                if (usbConnectionHelper$TrackedParcelFileDescriptor.k == this.k) {
                    usbConnectionHelper$TrackedParcelFileDescriptor.b();
                    it.remove();
                }
            }
        }
    }

    @Override // android.os.ParcelFileDescriptor
    public final ParcelFileDescriptor dup() {
        ekvl.z(h, "Application context is null");
        UsbConnectionHelper$TrackedParcelFileDescriptor usbConnectionHelper$TrackedParcelFileDescriptor = new UsbConnectionHelper$TrackedParcelFileDescriptor(super.dup());
        a.add(usbConnectionHelper$TrackedParcelFileDescriptor);
        andw.h(h, eoke.USB_FD_DUP);
        return usbConnectionHelper$TrackedParcelFileDescriptor;
    }

    @Override // android.os.ParcelFileDescriptor, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeLong(this.k);
        parcel.writeInt(this.m.get() ? 1 : 0);
    }

    public UsbConnectionHelper$TrackedParcelFileDescriptor(ParcelFileDescriptor parcelFileDescriptor, long j2, boolean z) {
        super(parcelFileDescriptor);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.m = atomicBoolean;
        this.k = j2;
        atomicBoolean.set(z);
    }
}
