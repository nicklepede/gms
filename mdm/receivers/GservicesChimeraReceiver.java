package com.google.android.gms.mdm.receivers;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.aury;
import defpackage.thb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class GservicesChimeraReceiver extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (aury.c(this) || !"com.google.gservices.intent.action.GSERVICES_CHANGED".equals(intent.getAction()) || GoogleAccountsAddedChimeraReceiver.a()) {
            return;
        }
        int i = thb.a;
        GoogleAccountsAddedChimeraReceiver.b();
    }
}
