package com.google.android.gms.gcm.clientqueue;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.bkbd;
import defpackage.bkbo;
import defpackage.bker;
import defpackage.bkfa;
import defpackage.bkfd;
import defpackage.bkfi;
import defpackage.bkpq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class MessageRetryIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        bkbd a = bkbo.b().a();
        bkfd bkfdVar = a.h;
        if (bkfdVar.a) {
            bkfi bkfiVar = bkfdVar.d;
            for (bker bkerVar : bkfiVar.d(a)) {
                bkfa bkfaVar = bkfdVar.c;
                bkpq bkpqVar = bkpq.CLIENT_QUEUE_APP_DOES_NOT_SUPPORT_RETRIES;
                bkfaVar.n(bkerVar);
                bkfiVar.f(bkerVar, bkpqVar);
            }
            bkfdVar.d();
        }
    }
}
