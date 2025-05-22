package com.google.android.gms.chimera.container;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import defpackage.rit;
import defpackage.rjq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class DexOptIntentOperation extends IntentOperation {
    public static void a(Context context, boolean z) {
        if (rit.c()) {
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
        if (rit.c()) {
            String action = intent.getAction();
            if (!"com.google.android.gms.chimera.container.OPTIMIZE_MODULES_ACTION".equals(action)) {
                throw new IllegalStateException("Unknown action: ".concat(String.valueOf(action)));
            }
            rjq.e().z(false, intent.getBooleanExtra("FORCE_DEXOPT", false));
        }
    }
}
