package com.google.android.gms.nearby.fastpair;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.auub;
import defpackage.ckyj;
import defpackage.clbo;
import defpackage.ftey;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class BluetoothEventsIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (ftey.as()) {
            if ("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                if (clbo.c(this)) {
                    ckyj.c(this, "com.google.android.gms.nearby.fastpair.service.ACTION_A2DP_CONNECTION_CHANGED", intent.getExtras());
                    return;
                }
                return;
            }
            if ("android.bluetooth.a2dp.profile.action.ACTIVE_DEVICE_CHANGED".equals(intent.getAction()) && auub.e()) {
                if (clbo.c(this)) {
                    ckyj.c(this, "com.google.android.gms.nearby.fastpair.service.ACTION_A2DP_ACTIVE_CHANGED", intent.getExtras());
                    return;
                }
                return;
            }
            if ("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                if (clbo.c(this)) {
                    ckyj.c(this, "com.google.android.gms.nearby.fastpair.service.ACTION_HEADSET_CONNECTION_CHANGED", intent.getExtras());
                    return;
                }
                return;
            }
            if ("android.bluetooth.headset.profile.action.ACTIVE_DEVICE_CHANGED".equals(intent.getAction()) && auub.e()) {
                ckyj.c(this, "com.google.android.gms.nearby.fastpair.service.ACTION_HEADSET_ACTIVE_CHANGED", intent.getExtras());
                if (ftey.aL()) {
                    ckyj.b(this, "com.google.android.gms.nearby.fastpair.service.ACTION_HEADSET_ACTIVE_CHANGED", intent.getExtras());
                    return;
                }
                return;
            }
            ftey.bf();
            ftey.bf();
            if ("android.bluetooth.device.action.BOND_STATE_CHANGED".equals(intent.getAction())) {
                ckyj.c(this, "com.google.android.gms.nearby.fastpair.service.ACTION_BLUETOOTH_BOND_STATE_CHANGED", intent.getExtras());
            } else if ("android.bluetooth.device.action.UUID".equals(intent.getAction())) {
                ckyj.c(this, "com.google.android.gms.nearby.fastpair.service.ACTION_BLUETOOTH_DEVICE_UUID_FETCHED", intent.getExtras());
            }
        }
    }
}
