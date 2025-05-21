package com.google.android.gms.personalsafety.scanners;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.personalsafety.AppContextProvider;
import defpackage.cvpo;
import defpackage.cvsy;
import defpackage.ejhf;
import defpackage.evpi;
import defpackage.fmzp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ManualScanIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        cvsy b;
        if (intent == null) {
            ((ejhf) cvpo.a.i()).x("Intent is null");
            return;
        }
        String action = intent.getAction();
        if (action == null || !action.equals("com.google.android.personalsafety.scanners.MANUAL_SCAN") || (b = cvsy.b(AppContextProvider.a())) == null) {
            return;
        }
        b.f(evpi.MANUAL, fmzp.e());
    }
}
