package com.google.android.gms.nearby.messages;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.asot;
import defpackage.bxdd;
import defpackage.bxdg;
import defpackage.bxek;
import defpackage.cexg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class GcmRegistrationChimeraReceiver extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.gcm.REGISTERED".equals(intent.getAction())) {
            asot asotVar = cexg.a;
            bxdd c = bxek.a(this, "nearby", "copresence_gcm_pref", 0).c();
            c.e("require_sync_to_server", true);
            bxdg.g(c);
        }
    }
}
