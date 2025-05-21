package com.google.android.gms.auth.easyunlock.authorization;

import android.content.Intent;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.IntentOperation;
import defpackage.aaws;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class BluetoothStateChangeIntentOperation extends IntentOperation {
    static {
        aaws.a("BluetoothStateChangeIntentOperation");
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
