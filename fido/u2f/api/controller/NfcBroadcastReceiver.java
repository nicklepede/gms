package com.google.android.gms.fido.u2f.api.controller;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.fido.u2f.api.view.NfcViewOptions;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.barv;
import defpackage.bcnj;
import defpackage.bcqy;
import defpackage.bcrg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class NfcBroadcastReceiver extends TracingBroadcastReceiver {
    private static final bcnj a = new bcnj("NfcBroadcastReceiver");
    private final bcrg b;

    public NfcBroadcastReceiver(bcrg bcrgVar) {
        super("fido");
        this.b = bcrgVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        String action;
        bcnj bcnjVar = a;
        bcnjVar.h("onReceive intent: ".concat(String.valueOf(String.valueOf(intent))), new Object[0]);
        if (intent != null && (action = intent.getAction()) != null && action.hashCode() == 1943044864 && action.equals("android.nfc.action.ADAPTER_STATE_CHANGED")) {
            int intExtra = intent.getIntExtra("android.nfc.extra.ADAPTER_STATE", -1);
            if (intExtra == 1) {
                bcnjVar.h("Received STATE_OFF for ACTION_ADAPTER_STATE_CHANGED", new Object[0]);
                this.b.g();
            } else if (intExtra == 3) {
                bcnjVar.h("Received STATE_ON for ACTION_ADAPTER_STATE_CHANGED", new Object[0]);
                bcrg bcrgVar = this.b;
                bcrgVar.o = true;
                bcrgVar.k.b(bcrgVar.f, barv.TYPE_NFC_ADAPTER_PROGRAMMATICALLY_ENABLED);
                bcrgVar.g.b(bcqy.POSSIBLE_USER_ACTION, new NfcViewOptions());
                bcrgVar.c();
            }
        }
    }
}
