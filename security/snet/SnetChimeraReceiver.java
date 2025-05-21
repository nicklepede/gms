package com.google.android.gms.security.snet;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.security.safebrowsing.SafeBrowsingUpdateChimeraIntentService;
import com.google.android.gms.security.verifier.InternalApkUploadChimeraService;
import defpackage.cczv;
import defpackage.cyrt;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SnetChimeraReceiver extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            SnetGcmSchedulerChimeraIntentService.a(this);
            SnetGcmSchedulerChimeraIntentService.b(this);
            SafeBrowsingUpdateChimeraIntentService.a(this);
            int i = InternalApkUploadChimeraService.a;
            Intent b = cyrt.b(this, InternalApkUploadChimeraService.class);
            b.setAction("com.google.android.gms.security.verifyapps.BOOT_COMPLETE");
            startService(b);
            cczv.j(this);
        }
    }
}
