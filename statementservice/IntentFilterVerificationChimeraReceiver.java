package com.google.android.gms.statementservice;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.chimera.IntentOperation;
import defpackage.asej;
import defpackage.asot;
import defpackage.ejhf;
import defpackage.fshc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class IntentFilterVerificationChimeraReceiver extends BroadcastReceiver {
    private static final asot b = asot.b("IntentFilterVerRcvr", asej.STATEMENT_SERVICE);

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        fshc.c();
        String action = intent.getAction();
        if (!"android.intent.action.INTENT_FILTER_NEEDS_VERIFICATION".equals(action)) {
            ((ejhf) b.j()).B("Intent action not supported: %s", action);
            return;
        }
        Bundle extras = intent.getExtras();
        Intent startIntent = IntentOperation.getStartIntent(context, IntentFilterIntentOperation.class, action);
        if (extras != null) {
            if (startIntent == null) {
                return;
            } else {
                startIntent.putExtras(extras);
            }
        }
        context.startService(startIntent);
    }
}
