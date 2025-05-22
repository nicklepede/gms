package com.google.android.gms.adid.init;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.adid.service.UpdateAdIdReconciliationService;
import com.google.android.gms.ads.identifier.settings.b;
import com.google.android.gms.ads.internal.config.p;
import defpackage.apzs;
import defpackage.auid;
import defpackage.aumo;
import defpackage.ausn;
import defpackage.auvc;
import defpackage.eluo;
import defpackage.uxg;
import defpackage.uxh;
import defpackage.uxi;
import defpackage.uxj;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ModuleInitializer extends apzs {
    static {
        ausn.b("AdIdModuleInit", auid.ADID);
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        int i2 = UpdateAdIdReconciliationService.a;
    }

    @Override // defpackage.apzs
    protected final void c(Intent intent, boolean z) {
        auvc.b();
        Context applicationContext = getApplicationContext();
        int i = uxh.a;
        b c = b.c(applicationContext);
        p.c(applicationContext);
        if (((DevicePolicyManager) applicationContext.getSystemService("device_policy")).isDeviceOwnerApp("com.google.android.apps.enterprise.dmagent")) {
            uxg uxgVar = new uxg(c);
            String str = uxj.a;
            uxi uxiVar = new uxi(applicationContext, uxgVar);
            Intent intent2 = new Intent("com.google.android.nfcprovision.IOwnedService.BIND");
            intent2.setComponent(new ComponentName("com.google.android.nfcprovision", "com.google.android.nfcprovision.SchoolOwnedService"));
            try {
                if (!aumo.a().d(applicationContext, intent2, uxiVar, 1)) {
                    uxgVar.a(false);
                }
            } catch (SecurityException e) {
                ((eluo) ((eluo) uxj.b.j()).ai((char) 442)).x("Fail to bind to school-ownership service; assuming it's not school-owned.");
                Log.w(uxj.a, e);
                uxgVar.a(false);
            }
        }
        uxh.a(applicationContext);
    }

    @Override // defpackage.apzs, com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (Objects.equals(intent.getAction(), "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE")) {
            uxh.a(getApplicationContext());
        }
    }
}
