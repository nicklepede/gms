package com.google.android.gms.wallet.common;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.wallet.service.WalletGcmTaskChimeraService;
import defpackage.apzs;
import defpackage.auqz;
import defpackage.aura;
import defpackage.dljy;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ModuleInitializer extends apzs {
    public ModuleInitializer() {
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        WalletGcmTaskChimeraService.d(this);
        if ((i & 8) != 0) {
            aura.H(this, "com.google.android.gms.wallet.ocr.CardRecognitionShimProxyActivity", true);
        }
    }

    @Override // defpackage.apzs
    protected final void d(Intent intent) {
        auqz auqzVar = aura.a;
        dljy.d(dljy.a(false), false);
    }

    public ModuleInitializer(Context context) {
        attachBaseContext(context);
    }
}
