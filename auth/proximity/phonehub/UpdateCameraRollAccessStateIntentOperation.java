package com.google.android.gms.auth.proximity.phonehub;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.aeto;
import defpackage.aevm;
import defpackage.aewb;
import defpackage.auad;
import defpackage.fnuf;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class UpdateCameraRollAccessStateIntentOperation extends IntentOperation {
    private static final auad a = new auad("ProximityAuth", "UpdateCameraRollAccessStateIntentOperation");

    public static Intent a(Context context, String str, boolean z) {
        Intent startIntent = IntentOperation.getStartIntent(context, UpdateCameraRollAccessStateIntentOperation.class, "com.google.android.gms.auth.proximity.phonehub.ACTION_UPDATE_CAMERA_ROLL_ACCESS_STATE");
        if (startIntent != null) {
            startIntent.putExtra("accountName", str).putExtra("isFeatureEnabled", z);
        }
        return startIntent;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.auth.proximity.phonehub.ACTION_UPDATE_CAMERA_ROLL_ACCESS_STATE".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("accountName");
            if (stringExtra == null) {
                a.m("No accountName was provided in the Intent to UpdateCameraRollAccessStateIntentOperation", new Object[0]);
                return;
            }
            boolean booleanExtra = intent.getBooleanExtra("isFeatureEnabled", false);
            try {
                (fnuf.P() ? aevm.a(stringExtra).i(booleanExtra) : aeto.a(stringExtra).c(booleanExtra)).get();
                aewb.b().f();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                a.m("Thread interrupted while updating CameraRollAccessState", new Object[0]);
            } catch (ExecutionException e) {
                a.n("Failed to update CameraRollAccessState", e, new Object[0]);
            }
        }
    }
}
