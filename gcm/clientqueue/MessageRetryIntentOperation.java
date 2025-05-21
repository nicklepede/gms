package com.google.android.gms.gcm.clientqueue;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.bhwo;
import defpackage.bhwz;
import defpackage.biac;
import defpackage.bial;
import defpackage.biao;
import defpackage.biat;
import defpackage.bilb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class MessageRetryIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        bhwo a = bhwz.b().a();
        biao biaoVar = a.h;
        if (biaoVar.a) {
            biat biatVar = biaoVar.d;
            for (biac biacVar : biatVar.d(a)) {
                bial bialVar = biaoVar.c;
                bilb bilbVar = bilb.CLIENT_QUEUE_APP_DOES_NOT_SUPPORT_RETRIES;
                bialVar.n(biacVar);
                biatVar.f(biacVar, bilbVar);
            }
            biaoVar.d();
        }
    }
}
