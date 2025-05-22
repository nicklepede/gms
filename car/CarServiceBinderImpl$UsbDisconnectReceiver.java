package com.google.android.gms.car;

import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbAccessory;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.car.CarServiceBinderImpl$UsbDisconnectReceiver;
import com.google.android.gms.car.compat.TracingBroadcastReceiver;
import com.google.android.gms.car.diagnostics.CriticalError;
import defpackage.amsp;
import defpackage.amvo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CarServiceBinderImpl$UsbDisconnectReceiver extends TracingBroadcastReceiver {
    public final /* synthetic */ amsp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarServiceBinderImpl$UsbDisconnectReceiver(amsp amspVar) {
        super("car");
        this.a = amspVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        String action = intent.getAction();
        if (((UsbAccessory) intent.getParcelableExtra("accessory")) == null || !action.equals("android.hardware.usb.action.USB_ACCESSORY_DETACHED")) {
            return;
        }
        amsp amspVar = this.a;
        Runnable runnable = new Runnable() { // from class: amso
            @Override // java.lang.Runnable
            public final void run() {
                CarServiceBinderImpl$UsbDisconnectReceiver.this.a.r(CriticalError.a(eoky.PROTOCOL_BYEBYE_REQUESTED_BY_USER, eokz.BYEBYE_BY_USER));
            }
        };
        Handler handler = amspVar.f;
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
            return;
        }
        amvo amvoVar = new amvo(runnable);
        handler.post(amvoVar);
        amvoVar.a();
    }
}
