package com.google.android.gms.instantapps;

import android.content.Intent;
import com.google.android.gms.instantapps.routing.DomainFilterUpdateChimeraService;
import defpackage.anya;
import defpackage.fiks;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class ModuleInitializer extends anya {
    private static final String[] a = new String[0];

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        DomainFilterUpdateChimeraService.e();
    }

    @Override // defpackage.anya
    protected final void d(Intent intent) {
        int i = DomainFilterUpdateChimeraService.f;
        Intent intent2 = new Intent("com.google.android.gms.instantapps.ACTION_UPDATE_DOMAIN_FILTER");
        intent2.setClassName(getPackageName(), "com.google.android.gms.instantapps.routing.DomainFilterUpdateService");
        intent2.putExtra("domain_filter_request_type", fiks.ONE_OFF_SYNC_AT_BOOT_COMPLETE.a());
        startService(intent2);
    }
}
