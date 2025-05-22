package com.google.android.gms.statementservice;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.chimera.IntentOperation;
import defpackage.auid;
import defpackage.ausn;
import defpackage.eluo;
import defpackage.fvca;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class IntentFilterVerificationChimeraReceiver extends BroadcastReceiver {
    private static final ausn b = ausn.b("IntentFilterVerRcvr", auid.STATEMENT_SERVICE);

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        fvca.c();
        String action = intent.getAction();
        if (!"android.intent.action.INTENT_FILTER_NEEDS_VERIFICATION".equals(action)) {
            ((eluo) b.j()).B("Intent action not supported: %s", action);
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
