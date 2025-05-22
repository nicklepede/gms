package com.google.android.gms.fido.u2f.api.controller;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.fido.u2f.api.view.NfcViewOptions;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.bcvr;
import defpackage.beow;
import defpackage.besl;
import defpackage.best;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class NfcBroadcastReceiver extends TracingBroadcastReceiver {
    private static final beow a = new beow("NfcBroadcastReceiver");
    private final best b;

    public NfcBroadcastReceiver(best bestVar) {
        super("fido");
        this.b = bestVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        String action;
        beow beowVar = a;
        beowVar.h("onReceive intent: ".concat(String.valueOf(String.valueOf(intent))), new Object[0]);
        if (intent != null && (action = intent.getAction()) != null && action.hashCode() == 1943044864 && action.equals("android.nfc.action.ADAPTER_STATE_CHANGED")) {
            int intExtra = intent.getIntExtra("android.nfc.extra.ADAPTER_STATE", -1);
            if (intExtra == 1) {
                beowVar.h("Received STATE_OFF for ACTION_ADAPTER_STATE_CHANGED", new Object[0]);
                this.b.g();
            } else if (intExtra == 3) {
                beowVar.h("Received STATE_ON for ACTION_ADAPTER_STATE_CHANGED", new Object[0]);
                best bestVar = this.b;
                bestVar.o = true;
                bestVar.k.b(bestVar.f, bcvr.TYPE_NFC_ADAPTER_PROGRAMMATICALLY_ENABLED);
                bestVar.g.b(besl.POSSIBLE_USER_ACTION, new NfcViewOptions());
                bestVar.c();
            }
        }
    }
}
