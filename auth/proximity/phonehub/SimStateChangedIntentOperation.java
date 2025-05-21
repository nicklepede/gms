package com.google.android.gms.auth.proximity.phonehub;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.acwb;
import defpackage.arxo;
import defpackage.flcw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class SimStateChangedIntentOperation extends IntentOperation {
    private static final arxo a = new arxo("ProximityAuth", "SimStateChangedIntentOperation");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (flcw.C()) {
            arxo arxoVar = a;
            arxoVar.h("Handling intent ".concat(String.valueOf(String.valueOf(intent))), new Object[0]);
            if (intent.getAction().equals("android.intent.action.SIM_STATE_CHANGED")) {
                acwb.b().f();
            } else {
                arxoVar.m("Unexpected intent.", new Object[0]);
            }
        }
    }
}
