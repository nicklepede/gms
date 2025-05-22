package com.google.android.gms.auth.proximity;

import android.content.Intent;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.IntentOperation;
import defpackage.aedx;
import defpackage.aehr;
import defpackage.auad;
import defpackage.fntg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ChannelServices$BluetoothAdapterStateChangeIntentOperation extends IntentOperation {
    private final aehr a;

    public ChannelServices$BluetoothAdapterStateChangeIntentOperation() {
        this.a = aehr.c();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        auad auadVar = aedx.a;
        auadVar.d("Received Bluetooth event: %s.", intent);
        if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", JGCastService.FLAG_USE_TDLS);
            if (intExtra == 12) {
                auadVar.d("Bluetooth turned ON, updating services...", new Object[0]);
                aedx.b(this, this.a);
            } else if (intExtra == 10 || (fntg.e() && intExtra == 13)) {
                auadVar.d("Bluetooth turning/turned off, stopping services...", new Object[0]);
                auadVar.d("Stopping all services...", new Object[0]);
                stopService(BlePeripheralChimeraService.d(this));
            }
        }
    }

    ChannelServices$BluetoothAdapterStateChangeIntentOperation(aehr aehrVar) {
        this.a = aehrVar;
    }
}
