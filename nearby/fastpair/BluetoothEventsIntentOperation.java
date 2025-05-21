package com.google.android.gms.nearby.fastpair;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.asqh;
import defpackage.ciqe;
import defpackage.citj;
import defpackage.fqld;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class BluetoothEventsIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (fqld.ar()) {
            if ("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                if (citj.c(this)) {
                    ciqe.c(this, "com.google.android.gms.nearby.fastpair.service.ACTION_A2DP_CONNECTION_CHANGED", intent.getExtras());
                    return;
                }
                return;
            }
            if ("android.bluetooth.a2dp.profile.action.ACTIVE_DEVICE_CHANGED".equals(intent.getAction()) && asqh.e()) {
                if (citj.c(this)) {
                    ciqe.c(this, "com.google.android.gms.nearby.fastpair.service.ACTION_A2DP_ACTIVE_CHANGED", intent.getExtras());
                    return;
                }
                return;
            }
            if ("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                if (citj.c(this)) {
                    ciqe.c(this, "com.google.android.gms.nearby.fastpair.service.ACTION_HEADSET_CONNECTION_CHANGED", intent.getExtras());
                    return;
                }
                return;
            }
            if ("android.bluetooth.headset.profile.action.ACTIVE_DEVICE_CHANGED".equals(intent.getAction()) && asqh.e()) {
                ciqe.c(this, "com.google.android.gms.nearby.fastpair.service.ACTION_HEADSET_ACTIVE_CHANGED", intent.getExtras());
                if (fqld.aK()) {
                    ciqe.b(this, "com.google.android.gms.nearby.fastpair.service.ACTION_HEADSET_ACTIVE_CHANGED", intent.getExtras());
                    return;
                }
                return;
            }
            fqld.bf();
            fqld.bf();
            if ("android.bluetooth.device.action.BOND_STATE_CHANGED".equals(intent.getAction())) {
                ciqe.c(this, "com.google.android.gms.nearby.fastpair.service.ACTION_BLUETOOTH_BOND_STATE_CHANGED", intent.getExtras());
            } else if ("android.bluetooth.device.action.UUID".equals(intent.getAction())) {
                ciqe.c(this, "com.google.android.gms.nearby.fastpair.service.ACTION_BLUETOOTH_DEVICE_UUID_FETCHED", intent.getExtras());
            }
        }
    }
}
