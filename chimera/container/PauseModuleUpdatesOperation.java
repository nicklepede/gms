package com.google.android.gms.chimera.container;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import defpackage.anza;
import defpackage.eike;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class PauseModuleUpdatesOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.gms.chimera.container.ACTION_PAUSE_MODULE_UPDATES".equals(action) || "com.google.android.gms.chimera.container.ACTION_RESUME_MODULE_UPDATES".equals(action)) {
            String stringExtra = intent.getStringExtra("moduleId");
            eike.e(stringExtra);
            String stringExtra2 = intent.getStringExtra("pauseId");
            eike.e(stringExtra2);
            if (!"com.google.android.gms.chimera.container.ACTION_PAUSE_MODULE_UPDATES".equals(action)) {
                if (anza.a(this).e(stringExtra, stringExtra2)) {
                    Log.i("PauseModuleUpdatesOp", "Resumed. Id=".concat(stringExtra2));
                }
            } else {
                if (anza.a(this).d(stringExtra, stringExtra2, intent.getIntExtra("duration", 0))) {
                    Log.i("PauseModuleUpdatesOp", "Paused. Id=".concat(stringExtra2));
                }
            }
        }
    }
}
