package com.google.android.gms.wallet.intentoperation.setupwizard;

import android.content.Context;
import com.google.android.chimera.IntentOperation;
import defpackage.asng;
import defpackage.dikh;
import defpackage.dizq;
import defpackage.djdd;
import defpackage.edna;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PaymentsSetupWizardAccountChangeIntentOperation extends IntentOperation {
    static final String[] a = {"com.google.android.gms.wallet.setupwizard.PaymentsSetupWizardActivity", "com.google.android.gms.wallet.im.SetupWizardImRootActivity"};
    dizq b;
    djdd c;
    private edna d;

    private final void a(boolean z) {
        String[] strArr = a;
        for (int i = 0; i < 2; i++) {
            asng.H(this, strArr[i], z);
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        Context applicationContext = getApplicationContext();
        this.d = dikh.a(applicationContext);
        this.c = new djdd(applicationContext);
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0253, code lost:
    
        if (r7 != 2) goto L77;
     */
    @Override // com.google.android.chimera.IntentOperation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onHandleIntent(android.content.Intent r15) {
        /*
            Method dump skipped, instructions count: 709
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wallet.intentoperation.setupwizard.PaymentsSetupWizardAccountChangeIntentOperation.onHandleIntent(android.content.Intent):void");
    }
}
