package com.google.android.gms.gcm.gmsproc;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import defpackage.bhyh;
import defpackage.bifi;
import defpackage.byjl;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GcmInstanceIdIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Log.i("GCM", "Refreshing GMS registration due to token refresh");
        byjl a = byjl.a(this);
        bhyh.b(this).edit().remove("regId").commit();
        bifi.d(this, true, a);
    }
}
