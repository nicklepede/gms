package com.google.android.gms.auth.proximity;

import android.content.Intent;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.IntentOperation;
import defpackage.acdx;
import defpackage.achr;
import defpackage.arxo;
import defpackage.flbx;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ChannelServices$BluetoothAdapterStateChangeIntentOperation extends IntentOperation {
    private final achr a;

    public ChannelServices$BluetoothAdapterStateChangeIntentOperation() {
        this.a = achr.c();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        acdx.a.d("Received Bluetooth event: %s.", intent);
        if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", JGCastService.FLAG_USE_TDLS);
            if (intExtra == 12) {
                acdx.a.d("Bluetooth turned ON, updating services...", new Object[0]);
                acdx.b(this, this.a);
            } else if (intExtra == 10 || (flbx.e() && intExtra == 13)) {
                arxo arxoVar = acdx.a;
                arxoVar.d("Bluetooth turning/turned off, stopping services...", new Object[0]);
                arxoVar.d("Stopping all services...", new Object[0]);
                stopService(BlePeripheralChimeraService.d(this));
            }
        }
    }

    ChannelServices$BluetoothAdapterStateChangeIntentOperation(achr achrVar) {
        this.a = achrVar;
    }
}
