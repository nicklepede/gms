package com.google.android.gms.mdm.receivers;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.aury;
import defpackage.cfdn;
import defpackage.fkyc;
import defpackage.thb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class GmsRegisteredChimeraReceiver extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (aury.c(this)) {
            return;
        }
        cfdn.c();
        Intent a = cfdn.a(this, false, fkyc.GMS_GCM_REGISTERED);
        if (a != null) {
            int i = thb.a;
            startService(a);
        }
    }
}
