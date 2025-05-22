package com.google.android.gms.gcm.gmsproc;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import defpackage.bkcw;
import defpackage.bkjx;
import defpackage.casd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class GcmInstanceIdIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Log.i("GCM", "Refreshing GMS registration due to token refresh");
        casd a = casd.a(this);
        bkcw.b(this).edit().remove("regId").commit();
        bkjx.d(this, true, a);
    }
}
