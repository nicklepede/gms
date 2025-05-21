package com.google.android.gms.nearby.fastpair;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.ciqe;
import defpackage.citj;
import defpackage.fqld;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class PersistentFastPairInitIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (fqld.ar() && citj.c(this)) {
            ciqe.c(this, "com.google.android.gms.nearby.fastpair.service.ACTION_START_WEARABLE_SERVICE", null);
        }
    }
}
