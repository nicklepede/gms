package com.google.android.gms.wallet.common;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.wallet.service.WalletGcmTaskChimeraService;
import defpackage.anya;
import defpackage.asnf;
import defpackage.asng;
import defpackage.diyf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ModuleInitializer extends anya {
    public ModuleInitializer() {
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        WalletGcmTaskChimeraService.d(this);
        if ((i & 8) != 0) {
            asng.H(this, "com.google.android.gms.wallet.ocr.CardRecognitionShimProxyActivity", true);
        }
    }

    @Override // defpackage.anya
    protected final void d(Intent intent) {
        asnf asnfVar = asng.a;
        diyf.d(diyf.a(false), false);
    }

    public ModuleInitializer(Context context) {
        attachBaseContext(context);
    }
}
