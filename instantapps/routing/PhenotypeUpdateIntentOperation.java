package com.google.android.gms.instantapps.routing;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.instantapps.AppContextProvider;
import defpackage.auid;
import defpackage.ausn;
import defpackage.casd;
import defpackage.frzi;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class PhenotypeUpdateIntentOperation extends IntentOperation {
    static {
        ausn.b("PhenotypeUpdateIntent", auid.INSTANT_APPS);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent != null && Objects.equals(intent.getAction(), "com.google.android.gms.phenotype.UPDATE") && Objects.equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"), "com.google.android.gms.instantapps") && frzi.a.lK().J()) {
            int i = DomainFilterUpdateChimeraService.f;
            casd a = casd.a(AppContextProvider.a());
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
