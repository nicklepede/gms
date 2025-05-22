package com.google.android.gms.locationsharingreporter.service;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.locationsharingreporter.AppContextProvider;
import com.google.android.gms.locationsharingreporter.service.reporting.periodic.PersistentDispatchingIntentOperation;
import defpackage.apzs;
import defpackage.auid;
import defpackage.auqx;
import defpackage.aura;
import defpackage.ausn;
import defpackage.bnfy;
import defpackage.cdec;
import defpackage.cdes;
import defpackage.cdfe;
import defpackage.cdft;
import defpackage.cdnt;
import defpackage.dhmr;
import defpackage.ektg;
import defpackage.ekut;
import defpackage.ekvi;
import defpackage.elhz;
import defpackage.elpp;
import defpackage.eluo;
import defpackage.eqgl;
import defpackage.fsqm;
import defpackage.fsrb;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class LocationSharingReporterModuleInitIntentOperation extends apzs {
    private static final ausn a = ausn.b("LSRModuleInit", auid.LOCATION_SHARING_REPORTER);
    private static final String[] b = {"com.google.android.gms.locationsharingreporter.service.reporting.periodic.PeriodicReporterMonitoringService"};

    private final void f() {
        try {
            final cdfe b2 = cdec.b();
            eqgl e = b2.e(this, new ekut() { // from class: cdfb
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    ausn ausnVar = cdfe.a;
                    return cdbx.a;
                }
            });
            e.hD(new Runnable() { // from class: cdfc
                @Override // java.lang.Runnable
                public final void run() {
                    cdfe.this.h(this, null, ektg.a);
                }
            }, cdfe.b);
            e.get(fsqm.i(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e2) {
            ((eluo) ((eluo) ((eluo) a.j()).s(e2)).ai((char) 5717)).x("failed to clear location reporting status storage");
        }
    }

    private static final void g(bnfy bnfyVar) {
        try {
            dhmr.n(bnfyVar.a(elpp.a));
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            ((eluo) ((eluo) ((eluo) a.j()).s(e)).ai((char) 5718)).x("Failed to clean up geofences.");
        }
    }

    private static final void h(boolean z) {
        ((eluo) ((eluo) a.h()).ai((char) 5725)).B("Attempting to change container components state to enabled: %s", Boolean.valueOf(z));
        String[] strArr = b;
        int length = strArr.length;
        String str = strArr[0];
        try {
            aura.H(AppContextProvider.a(), str, z);
        } catch (IllegalArgumentException e) {
            ((eluo) ((eluo) ((eluo) a.i()).s(e)).ai((char) 5724)).B("Component %s disabled", str);
        }
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        ekvi j;
        if ((i & 2) != 0) {
            Map f = cdec.b().f(this);
            cdft.a().f(this);
            f();
            for (Account account : auqx.x(this)) {
                if (f.containsKey(account.name)) {
                    cdes.a(this, account);
                }
            }
        } else {
            cdfe b2 = cdec.b();
            e(b2, b2.a(this));
        }
        if (!fsrb.D()) {
            h(false);
            return;
        }
        h(true);
        int i2 = PersistentDispatchingIntentOperation.a;
        Intent startIntent = IntentOperation.getStartIntent(AppContextProvider.a(), PersistentDispatchingIntentOperation.class, "com.google.android.gms.locationsharingreporter.service.reporting.periodic.ACTION_LSR_MODULE_INIT");
        if (startIntent == null) {
            j = ektg.a;
        } else {
            startIntent.putExtra("com.google.android.gms.locationsharingreporter.service.reporting.periodic.EXTRA_MODULE_INIT_FLAGS", i);
            j = ekvi.j(startIntent);
        }
        if (j.h()) {
            AppContextProvider.a().startService((Intent) j.c());
        } else {
            ((eluo) ((eluo) a.i()).ai((char) 5720)).x("Failed to forward module init intent");
        }
    }

    final void e(cdfe cdfeVar, bnfy bnfyVar) {
        if (!cdnt.f(this)) {
            g(bnfyVar);
            return;
        }
        elhz c = cdfeVar.c(this);
        try {
            dhmr.n(bnfyVar.a(c));
            ((eluo) ((eluo) a.h()).ai(5721)).B("New Geofences: %s", c);
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            ((eluo) ((eluo) ((eluo) a.j()).s(e)).ai((char) 5722)).x("failed to register geofences.");
        }
    }
}
