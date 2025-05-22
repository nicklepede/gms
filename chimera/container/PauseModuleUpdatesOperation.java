package com.google.android.gms.chimera.container;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import defpackage.aqas;
import defpackage.ekxj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class PauseModuleUpdatesOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.gms.chimera.container.ACTION_PAUSE_MODULE_UPDATES".equals(action) || "com.google.android.gms.chimera.container.ACTION_RESUME_MODULE_UPDATES".equals(action)) {
            String stringExtra = intent.getStringExtra("moduleId");
            ekxj.e(stringExtra);
            String stringExtra2 = intent.getStringExtra("pauseId");
            ekxj.e(stringExtra2);
            if (!"com.google.android.gms.chimera.container.ACTION_PAUSE_MODULE_UPDATES".equals(action)) {
                if (aqas.a(this).e(stringExtra, stringExtra2)) {
                    Log.i("PauseModuleUpdatesOp", "Resumed. Id=".concat(stringExtra2));
                }
            } else {
                if (aqas.a(this).d(stringExtra, stringExtra2, intent.getIntExtra("duration", 0))) {
                    Log.i("PauseModuleUpdatesOp", "Paused. Id=".concat(stringExtra2));
                }
            }
        }
    }
}
