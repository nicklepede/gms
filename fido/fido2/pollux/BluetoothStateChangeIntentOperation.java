package com.google.android.gms.fido.fido2.pollux;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.bcnj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class BluetoothStateChangeIntentOperation extends IntentOperation {
    private static final bcnj a = new bcnj("BluetoothStateChangeIntentOperation");
    private final Context b;

    public BluetoothStateChangeIntentOperation() {
        this.b = this;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
        if (intExtra != 10) {
            if (intExtra != 12) {
                return;
            } else {
                intExtra = 12;
            }
        }
        a.d("Bluetooth state to '%s', starting service.", intExtra == 12 ? "on" : "off");
        Context context = this.b;
        context.startService(CableAuthenticatorChimeraService.a(context));
    }

    BluetoothStateChangeIntentOperation(Context context) {
        this.b = context;
    }
}
