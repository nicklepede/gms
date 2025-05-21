package com.google.android.gms.gcm.registration;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import defpackage.bhvo;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GcmExportedIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        bhvo.i(this);
        String action = intent.getAction();
        if (!Objects.equals(action, "com.google.iid.TOKEN_REQUEST")) {
            Log.w("GCM", "ExportedIntentOperation dropping intent with unknown action: ".concat(String.valueOf(action)));
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
            PushMessagingRegistrarChimeraProxy.b(this, intent);
        }
    }
}
