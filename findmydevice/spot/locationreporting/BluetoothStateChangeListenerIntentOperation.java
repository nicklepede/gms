package com.google.android.gms.findmydevice.spot.locationreporting;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.asej;
import defpackage.asot;
import defpackage.bebo;
import defpackage.belh;
import defpackage.beyh;
import defpackage.bfdp;
import defpackage.bfdr;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class BluetoothStateChangeListenerIntentOperation extends IntentOperation {
    private final beyh a;

    static {
        asot.b("BtStateChangeIntOp", asej.FIND_MY_DEVICE_SPOT);
    }

    public BluetoothStateChangeListenerIntentOperation() {
        this(bebo.a());
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (bfdr.b() && bfdp.b(intent, "android.bluetooth.adapter.action.STATE_CHANGED")) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
            if (intExtra == 12 || intExtra == 13) {
                this.a.a();
            }
        }
    }

    public BluetoothStateChangeListenerIntentOperation(belh belhVar) {
        this.a = belhVar.x();
    }
}
