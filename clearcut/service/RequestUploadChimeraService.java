package com.google.android.gms.clearcut.service;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.libs.scheduler.PendingCallback;
import defpackage.aqdd;
import defpackage.aqgt;
import defpackage.eijr;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class RequestUploadChimeraService extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Boolean valueOf;
        long currentTimeMillis = System.currentTimeMillis();
        valueOf = Boolean.valueOf(aqgt.d(new eijr() { // from class: aqgs
            @Override // defpackage.eijr
            public final Object a() {
                return Boolean.valueOf(fmik.a.a().G());
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
        PendingCallback pendingCallback = new PendingCallback(new aqdd());
        intent2.setClassName("com.google.android.gms", "com.google.android.gms.clearcut.uploader.QosUploaderService");
        intent2.setAction("com.google.android.gms.gcm.ACTION_TASK_READY");
        intent2.putExtra("tag", "qos_debug_force_upload");
        intent2.putExtra("callback", pendingCallback);
        startService(intent2);
    }
}
