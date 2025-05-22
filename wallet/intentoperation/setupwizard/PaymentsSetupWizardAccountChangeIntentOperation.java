package com.google.android.gms.wallet.intentoperation.setupwizard;

import android.content.Context;
import com.google.android.chimera.IntentOperation;
import defpackage.aura;
import defpackage.dkvs;
import defpackage.dllj;
import defpackage.dlow;
import defpackage.efzw;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class PaymentsSetupWizardAccountChangeIntentOperation extends IntentOperation {
    static final String[] a = {"com.google.android.gms.wallet.setupwizard.PaymentsSetupWizardActivity", "com.google.android.gms.wallet.im.SetupWizardImRootActivity"};
    dllj b;
    dlow c;
    private efzw d;

    private final void a(boolean z) {
        String[] strArr = a;
        for (int i = 0; i < 2; i++) {
            aura.H(this, strArr[i], z);
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        Context applicationContext = getApplicationContext();
        this.d = dkvs.a(applicationContext);
        this.c = new dlow(applicationContext);
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x024f, code lost:
    
        if (r7 != 2) goto L77;
     */
    @Override // com.google.android.chimera.IntentOperation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onHandleIntent(android.content.Intent r15) {
        /*
            Method dump skipped, instructions count: 705
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wallet.intentoperation.setupwizard.PaymentsSetupWizardAccountChangeIntentOperation.onHandleIntent(android.content.Intent):void");
    }
}
