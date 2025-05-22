package com.google.android.gms.security.snet;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.security.safebrowsing.SafeBrowsingUpdateChimeraIntentService;
import com.google.android.gms.security.verifier.InternalApkUploadChimeraService;
import defpackage.cfiv;
import defpackage.dbbr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SnetChimeraReceiver extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            SnetGcmSchedulerChimeraIntentService.a(this);
            SnetGcmSchedulerChimeraIntentService.b(this);
            SafeBrowsingUpdateChimeraIntentService.a(this);
            int i = InternalApkUploadChimeraService.a;
            Intent b = dbbr.b(this, InternalApkUploadChimeraService.class);
            b.setAction("com.google.android.gms.security.verifyapps.BOOT_COMPLETE");
            startService(b);
            cfiv.j(this);
        }
    }
}
