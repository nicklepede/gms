package com.google.android.gms.instantapps.routing;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.instantapps.AppContextProvider;
import defpackage.asej;
import defpackage.asot;
import defpackage.byjl;
import defpackage.fpfx;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class PhenotypeUpdateIntentOperation extends IntentOperation {
    static {
        asot.b("PhenotypeUpdateIntent", asej.INSTANT_APPS);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent != null && Objects.equals(intent.getAction(), "com.google.android.gms.phenotype.UPDATE") && Objects.equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"), "com.google.android.gms.instantapps") && fpfx.a.a().J()) {
            int i = DomainFilterUpdateChimeraService.f;
            byjl a = byjl.a(AppContextProvider.a());
            a.d("instantapps.DomainFilterUpdateService", "com.google.android.gms.instantapps.routing.DomainFilterUpdateService");
            a.d("instantapps.DomainFilterUpdateService.frequentChargingUnmetered", "com.google.android.gms.instantapps.routing.DomainFilterUpdateService");
            a.d("instantapps.DomainFilterUpdateService.fullSync", "com.google.android.gms.instantapps.routing.DomainFilterUpdateService");
            DomainFilterUpdateChimeraService.e();
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
    }
}
