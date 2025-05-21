package com.google.android.gms.chimera.container;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import defpackage.ppp;
import defpackage.pqm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class DexOptIntentOperation extends IntentOperation {
    public static void a(Context context, boolean z) {
        if (ppp.c()) {
            Intent startIntent = IntentOperation.getStartIntent(context, DexOptIntentOperation.class, "com.google.android.gms.chimera.container.OPTIMIZE_MODULES_ACTION");
            if (startIntent == null) {
                Log.w("DexOptIntOp", "Failed to start async module optimization");
            } else {
                startIntent.putExtra("FORCE_DEXOPT", z);
                context.startService(startIntent);
            }
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (ppp.c()) {
            String action = intent.getAction();
            if (!"com.google.android.gms.chimera.container.OPTIMIZE_MODULES_ACTION".equals(action)) {
                throw new IllegalStateException("Unknown action: ".concat(String.valueOf(action)));
            }
            pqm.e().z(false, intent.getBooleanExtra("FORCE_DEXOPT", false));
        }
    }
}
