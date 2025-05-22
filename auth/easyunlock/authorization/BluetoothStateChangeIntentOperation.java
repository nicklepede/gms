package com.google.android.gms.auth.easyunlock.authorization;

import android.content.Intent;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.IntentOperation;
import defpackage.acws;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class BluetoothStateChangeIntentOperation extends IntentOperation {
    static {
        acws.a("BluetoothStateChangeIntentOperation");
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (Objects.equals(intent.getAction(), "android.bluetooth.adapter.action.STATE_CHANGED")) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", JGCastService.FLAG_USE_TDLS);
            if (intExtra == 12 || intExtra == 10) {
                startService(EasyUnlockChimeraService.a(this));
            }
        }
    }
}
