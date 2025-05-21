package com.google.android.gms.wallet.intentoperation;

import android.content.Context;
import com.google.android.chimera.IntentOperation;
import defpackage.asqg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class FlagsChangedIntentOperation extends IntentOperation {
    private static final String a = asqg.f("com.google.android.gms.wallet");

    public FlagsChangedIntentOperation() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        if (r1 != false) goto L19;
     */
    @Override // com.google.android.chimera.IntentOperation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onHandleIntent(android.content.Intent r5) {
        /*
            r4 = this;
            java.lang.String r0 = "com.google.android.gms.wallet"
            r1 = 0
            if (r5 == 0) goto L30
            java.lang.String r2 = "com.google.android.gms.phenotype.COMMITTED"
            java.lang.String r3 = r5.getAction()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1d
            java.lang.String r2 = com.google.android.gms.wallet.intentoperation.FlagsChangedIntentOperation.a
            java.lang.String r3 = r5.getAction()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L30
        L1d:
            java.lang.String r2 = "com.google.android.gms.phenotype.PACKAGE_NAME"
            boolean r3 = r5.hasExtra(r2)
            if (r3 == 0) goto L30
            java.lang.String r2 = r5.getStringExtra(r2)
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L30
            r1 = 1
        L30:
            java.lang.String r2 = "com.google.gservices.intent.action.GSERVICES_CHANGED"
            java.lang.String r5 = r5.getAction()
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L40
            if (r1 == 0) goto L3f
            goto L42
        L3f:
            return
        L40:
            if (r1 == 0) goto L5c
        L42:
            android.content.Context r5 = r4.getApplicationContext()
            android.content.ContentResolver r5 = r5.getContentResolver()
            aqxd r1 = defpackage.cvzk.a
            android.net.Uri r0 = defpackage.dvmh.a(r0)
            disb r1 = new disb
            r1.<init>()
            dvlw r5 = defpackage.dvlw.a(r5, r0, r1)
            r5.e()
        L5c:
            com.google.android.gms.wallet.service.WalletGcmTaskChimeraService.d(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wallet.intentoperation.FlagsChangedIntentOperation.onHandleIntent(android.content.Intent):void");
    }

    public FlagsChangedIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
