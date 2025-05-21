package com.google.android.gms.car.usb;

import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbPortStatus;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.alme;
import defpackage.almm;
import defpackage.almp;
import j$.util.Objects;
import java.util.Date;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class UsbMonitorRunnable$UsbStatusReceiver extends TracingBroadcastReceiver {
    public boolean a;
    public final /* synthetic */ almm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsbMonitorRunnable$UsbStatusReceiver(almm almmVar) {
        super("car");
        this.b = almmVar;
        this.a = false;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        if (Objects.equals(intent.getAction(), "android.hardware.usb.action.USB_PORT_CHANGED")) {
            almm almmVar = this.b;
            Map map = almmVar.b;
            if (map.size() != 1 || !intent.hasExtra("portStatus")) {
                for (Map.Entry entry : almmVar.d.a().entrySet()) {
                    almmVar.b((String) entry.getKey(), (almp) entry.getValue(), new Date());
                }
                return;
            }
            UsbPortStatus parcelableExtra = intent.getParcelableExtra("portStatus");
            if (parcelableExtra == null) {
                almm.a.j().ah(2570).x("UsbPortStatus is null");
            } else {
                almmVar.b((String) map.keySet().iterator().next(), alme.d(parcelableExtra), new Date());
            }
        }
    }
}
