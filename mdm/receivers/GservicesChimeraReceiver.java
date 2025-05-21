package com.google.android.gms.mdm.receivers;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.asoe;
import defpackage.rnx;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class GservicesChimeraReceiver extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (asoe.c(this) || !"com.google.gservices.intent.action.GSERVICES_CHANGED".equals(intent.getAction()) || GoogleAccountsAddedChimeraReceiver.a()) {
            return;
        }
        int i = rnx.a;
        GoogleAccountsAddedChimeraReceiver.b();
    }
}
