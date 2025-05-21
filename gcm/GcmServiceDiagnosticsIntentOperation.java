package com.google.android.gms.gcm;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import defpackage.bhym;
import defpackage.bhyo;
import defpackage.bhyq;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class GcmServiceDiagnosticsIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        IBinder binder;
        Bundle extras = intent.getExtras();
        if (extras == null || (binder = extras.getBinder("callback")) == null) {
            return;
        }
        IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.gcm.IGcmServiceDiagnosticsCallback");
        bhyq bhyoVar = queryLocalInterface instanceof bhyq ? (bhyq) queryLocalInterface : new bhyo(binder);
        if (bhyoVar != null) {
            try {
                bhyoVar.a(new bhym(this));
            } catch (RemoteException e) {
                Log.e("GCM", "Failed to return GcmServiceDiagnostics.", e);
            }
        }
    }
}
