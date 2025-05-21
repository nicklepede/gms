package com.google.android.gms.car;

import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbAccessory;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.car.CarServiceBinderImpl$UsbDisconnectReceiver;
import com.google.android.gms.car.compat.TracingBroadcastReceiver;
import com.google.android.gms.car.diagnostics.CriticalError;
import defpackage.akre;
import defpackage.akud;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CarServiceBinderImpl$UsbDisconnectReceiver extends TracingBroadcastReceiver {
    public final /* synthetic */ akre a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarServiceBinderImpl$UsbDisconnectReceiver(akre akreVar) {
        super("car");
        this.a = akreVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        String action = intent.getAction();
        if (((UsbAccessory) intent.getParcelableExtra("accessory")) == null || !action.equals("android.hardware.usb.action.USB_ACCESSORY_DETACHED")) {
            return;
        }
        akre akreVar = this.a;
        Runnable runnable = new Runnable() { // from class: akrd
            @Override // java.lang.Runnable
            public final void run() {
                CarServiceBinderImpl$UsbDisconnectReceiver.this.a.r(CriticalError.a(elxk.PROTOCOL_BYEBYE_REQUESTED_BY_USER, elxl.BYEBYE_BY_USER));
            }
        };
        Handler handler = akreVar.f;
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
            return;
        }
        akud akudVar = new akud(runnable);
        handler.post(akudVar);
        akudVar.a();
    }
}
