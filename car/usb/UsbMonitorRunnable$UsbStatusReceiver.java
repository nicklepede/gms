package com.google.android.gms.car.usb;

import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbPortStatus;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.annp;
import defpackage.annx;
import defpackage.anoa;
import j$.util.Objects;
import java.util.Date;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class UsbMonitorRunnable$UsbStatusReceiver extends TracingBroadcastReceiver {
    public boolean a;
    public final /* synthetic */ annx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsbMonitorRunnable$UsbStatusReceiver(annx annxVar) {
        super("car");
        this.b = annxVar;
        this.a = false;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        if (Objects.equals(intent.getAction(), "android.hardware.usb.action.USB_PORT_CHANGED")) {
            annx annxVar = this.b;
            Map map = annxVar.b;
            if (map.size() != 1 || !intent.hasExtra("portStatus")) {
                for (Map.Entry entry : annxVar.d.a().entrySet()) {
                    annxVar.b((String) entry.getKey(), (anoa) entry.getValue(), new Date());
                }
                return;
            }
            UsbPortStatus parcelableExtra = intent.getParcelableExtra("portStatus");
            if (parcelableExtra == null) {
                annx.a.j().ai(2574).x("UsbPortStatus is null");
            } else {
                annxVar.b((String) map.keySet().iterator().next(), annp.d(parcelableExtra), new Date());
            }
        }
    }
}
