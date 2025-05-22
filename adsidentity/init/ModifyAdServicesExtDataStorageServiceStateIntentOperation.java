package com.google.android.gms.adsidentity.init;

import android.content.Intent;
import android.os.Build;
import com.google.android.gms.chimera.modules.adsidentity.AppContextProvider;
import defpackage.apzs;
import defpackage.auid;
import defpackage.aura;
import defpackage.ausn;
import defpackage.eluo;
import defpackage.fmqy;
import defpackage.uzp;
import java.util.logging.Level;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ModifyAdServicesExtDataStorageServiceStateIntentOperation extends apzs {
    private static final ausn a = ausn.b("adservices", auid.ADSIDENTITY);

    private static final void e() {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            aura.M("com.google.android.gms.adsidentity.service.AdServicesExtDataStorageService", fmqy.a.lK().k() ? 1 : 0);
        } catch (IllegalArgumentException e) {
            ((eluo) a.f(Level.SEVERE).s(e)).x("Exception caught when modifying AdExtDtaService state!");
            AppContextProvider.a();
            uzp.b(uzp.a(currentTimeMillis, System.currentTimeMillis(), 3, 8));
        }
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        e();
    }

    @Override // defpackage.apzs, com.google.android.chimera.IntentOperation
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
