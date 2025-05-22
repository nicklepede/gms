package com.google.android.gms.gcm;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import defpackage.bkdb;
import defpackage.bkdd;
import defpackage.bkdf;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
        bkdf bkddVar = queryLocalInterface instanceof bkdf ? (bkdf) queryLocalInterface : new bkdd(binder);
        if (bkddVar != null) {
            try {
                bkddVar.a(new bkdb(this));
            } catch (RemoteException e) {
                Log.e("GCM", "Failed to return GcmServiceDiagnostics.", e);
            }
        }
    }
}
