package com.google.android.gms.nearby.messages;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.ausn;
import defpackage.bzlt;
import defpackage.bzlw;
import defpackage.bzna;
import defpackage.cher;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class GcmRegistrationChimeraReceiver extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.gcm.REGISTERED".equals(intent.getAction())) {
            ausn ausnVar = cher.a;
            bzlt c = bzna.a(this, "nearby", "copresence_gcm_pref", 0).c();
            c.e("require_sync_to_server", true);
            bzlw.g(c);
        }
    }
}
