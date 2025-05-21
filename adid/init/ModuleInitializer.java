package com.google.android.gms.adid.init;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.adid.service.UpdateAdIdReconciliationService;
import com.google.android.gms.ads.identifier.settings.b;
import com.google.android.gms.ads.internal.config.p;
import defpackage.anya;
import defpackage.asej;
import defpackage.asiu;
import defpackage.asot;
import defpackage.asri;
import defpackage.ejhf;
import defpackage.tbg;
import defpackage.tbh;
import defpackage.tbi;
import defpackage.tbj;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ModuleInitializer extends anya {
    static {
        asot.b("AdIdModuleInit", asej.ADID);
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        int i2 = UpdateAdIdReconciliationService.a;
    }

    @Override // defpackage.anya
    protected final void c(Intent intent, boolean z) {
        asri.b();
        Context applicationContext = getApplicationContext();
        int i = tbh.a;
        b c = b.c(applicationContext);
        p.c(applicationContext);
        if (((DevicePolicyManager) applicationContext.getSystemService("device_policy")).isDeviceOwnerApp("com.google.android.apps.enterprise.dmagent")) {
            tbg tbgVar = new tbg(c);
            String str = tbj.a;
            tbi tbiVar = new tbi(applicationContext, tbgVar);
            Intent intent2 = new Intent("com.google.android.nfcprovision.IOwnedService.BIND");
            intent2.setComponent(new ComponentName("com.google.android.nfcprovision", "com.google.android.nfcprovision.SchoolOwnedService"));
            try {
                if (!asiu.a().d(applicationContext, intent2, tbiVar, 1)) {
                    tbgVar.a(false);
                }
            } catch (SecurityException e) {
                ((ejhf) ((ejhf) tbj.b.j()).ah((char) 442)).x("Fail to bind to school-ownership service; assuming it's not school-owned.");
                Log.w(tbj.a, e);
                tbgVar.a(false);
            }
        }
        tbh.a(applicationContext);
    }

    @Override // defpackage.anya, com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (Objects.equals(intent.getAction(), "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE")) {
            tbh.a(getApplicationContext());
        }
    }
}
