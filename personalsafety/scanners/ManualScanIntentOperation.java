package com.google.android.gms.personalsafety.scanners;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.personalsafety.AppContextProvider;
import defpackage.cxze;
import defpackage.cycr;
import defpackage.eluo;
import defpackage.eyfe;
import defpackage.fpro;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ManualScanIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        cycr b;
        if (intent == null) {
            ((eluo) cxze.a.i()).x("Intent is null");
            return;
        }
        String action = intent.getAction();
        if (action == null || !action.equals("com.google.android.personalsafety.scanners.MANUAL_SCAN") || (b = cycr.b(AppContextProvider.a())) == null) {
            return;
        }
        b.e(eyfe.MANUAL, fpro.e());
    }
}
