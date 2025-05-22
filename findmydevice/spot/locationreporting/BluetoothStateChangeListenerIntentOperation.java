package com.google.android.gms.findmydevice.spot.locationreporting;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bgda;
import defpackage.bgmt;
import defpackage.bgzu;
import defpackage.bhff;
import defpackage.bhfh;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class BluetoothStateChangeListenerIntentOperation extends IntentOperation {
    private final bgzu a;

    static {
        ausn.b("BtStateChangeIntOp", auid.FIND_MY_DEVICE_SPOT);
    }

    public BluetoothStateChangeListenerIntentOperation() {
        this(bgda.a());
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (bhfh.b() && bhff.b(intent, "android.bluetooth.adapter.action.STATE_CHANGED")) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
            if (intExtra == 12 || intExtra == 13) {
                this.a.a();
            }
        }
    }

    public BluetoothStateChangeListenerIntentOperation(bgmt bgmtVar) {
        this.a = bgmtVar.x();
    }
}
