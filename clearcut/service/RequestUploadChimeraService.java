package com.google.android.gms.clearcut.service;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.libs.scheduler.PendingCallback;
import defpackage.asfu;
import defpackage.asjk;
import defpackage.ekww;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class RequestUploadChimeraService extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Boolean valueOf;
        long currentTimeMillis = System.currentTimeMillis();
        valueOf = Boolean.valueOf(asjk.d(new ekww() { // from class: asjj
            @Override // defpackage.ekww
            public final Object lK() {
                return Boolean.valueOf(fozw.a.lK().G());
            }
        }, "debug", false));
        boolean booleanValue = valueOf.booleanValue();
        if (Log.isLoggable("CCTRequestUploadService", 4)) {
            Log.i("CCTRequestUploadService", "Request upload: now=" + currentTimeMillis + " debug=" + booleanValue);
        }
        if (!booleanValue) {
            if (Log.isLoggable("CCTRequestUploadService", 4)) {
                Log.i("CCTRequestUploadService", "Request denied: debug is false");
                return;
            }
            return;
        }
        Intent intent2 = new Intent();
        PendingCallback pendingCallback = new PendingCallback(new asfu());
        intent2.setClassName("com.google.android.gms", "com.google.android.gms.clearcut.uploader.QosUploaderService");
        intent2.setAction("com.google.android.gms.gcm.ACTION_TASK_READY");
        intent2.putExtra("tag", "qos_debug_force_upload");
        intent2.putExtra("callback", pendingCallback);
        startService(intent2);
    }
}
