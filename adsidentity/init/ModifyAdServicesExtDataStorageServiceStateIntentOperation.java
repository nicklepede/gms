package com.google.android.gms.adsidentity.init;

import android.content.Intent;
import android.os.Build;
import com.google.android.gms.chimera.modules.adsidentity.AppContextProvider;
import defpackage.anya;
import defpackage.asej;
import defpackage.asng;
import defpackage.asot;
import defpackage.ejhf;
import defpackage.fkas;
import defpackage.tdp;
import java.util.logging.Level;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ModifyAdServicesExtDataStorageServiceStateIntentOperation extends anya {
    private static final asot a = asot.b("adservices", asej.ADSIDENTITY);

    private static final void e() {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            asng.M("com.google.android.gms.adsidentity.service.AdServicesExtDataStorageService", fkas.a.a().k() ? 1 : 0);
        } catch (IllegalArgumentException e) {
            ((ejhf) a.f(Level.SEVERE).s(e)).x("Exception caught when modifying AdExtDtaService state!");
            AppContextProvider.a();
            tdp.b(tdp.a(currentTimeMillis, System.currentTimeMillis(), 3, 8));
        }
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        e();
    }

    @Override // defpackage.anya, com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if (action == null || !action.equals("com.google.android.gms.phenotype.com.google.android.gms.adsidentity.COMMITTED")) {
            super.onHandleIntent(intent);
        } else {
            e();
        }
    }
}
