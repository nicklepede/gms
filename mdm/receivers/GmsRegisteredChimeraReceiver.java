package com.google.android.gms.mdm.receivers;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.asoe;
import defpackage.ccut;
import defpackage.fiif;
import defpackage.rnx;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class GmsRegisteredChimeraReceiver extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (asoe.c(this)) {
            return;
        }
        ccut.c();
        Intent a = ccut.a(this, false, fiif.GMS_GCM_REGISTERED);
        if (a != null) {
            int i = rnx.a;
            startService(a);
        }
    }
}
