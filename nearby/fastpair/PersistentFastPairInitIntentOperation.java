package com.google.android.gms.nearby.fastpair;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.ckyj;
import defpackage.clbo;
import defpackage.ftey;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class PersistentFastPairInitIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (ftey.as() && clbo.c(this)) {
            ckyj.c(this, "com.google.android.gms.nearby.fastpair.service.ACTION_START_WEARABLE_SERVICE", null);
        }
    }
}
