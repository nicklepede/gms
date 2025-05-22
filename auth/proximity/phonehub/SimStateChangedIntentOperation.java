package com.google.android.gms.auth.proximity.phonehub;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.aewb;
import defpackage.auad;
import defpackage.fnuf;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SimStateChangedIntentOperation extends IntentOperation {
    private static final auad a = new auad("ProximityAuth", "SimStateChangedIntentOperation");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (fnuf.C()) {
            auad auadVar = a;
            auadVar.h("Handling intent ".concat(String.valueOf(String.valueOf(intent))), new Object[0]);
            if (intent.getAction().equals("android.intent.action.SIM_STATE_CHANGED")) {
                aewb.b().f();
            } else {
                auadVar.m("Unexpected intent.", new Object[0]);
            }
        }
    }
}
