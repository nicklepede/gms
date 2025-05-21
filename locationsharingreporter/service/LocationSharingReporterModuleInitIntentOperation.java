package com.google.android.gms.locationsharingreporter.service;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.locationsharingreporter.AppContextProvider;
import com.google.android.gms.locationsharingreporter.service.reporting.periodic.PersistentDispatchingIntentOperation;
import defpackage.anya;
import defpackage.asej;
import defpackage.asnd;
import defpackage.asng;
import defpackage.asot;
import defpackage.bkzh;
import defpackage.cavm;
import defpackage.cawc;
import defpackage.cawo;
import defpackage.caxd;
import defpackage.cbfb;
import defpackage.dfbl;
import defpackage.eigb;
import defpackage.eiho;
import defpackage.eiid;
import defpackage.eiuu;
import defpackage.ejck;
import defpackage.ejhf;
import defpackage.enss;
import defpackage.fpws;
import defpackage.fpxh;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class LocationSharingReporterModuleInitIntentOperation extends anya {
    private static final asot a = asot.b("LSRModuleInit", asej.LOCATION_SHARING_REPORTER);
    private static final String[] b = {"com.google.android.gms.locationsharingreporter.service.reporting.periodic.PeriodicReporterMonitoringService"};

    private final void f() {
        try {
            final cawo b2 = cavm.b();
            enss e = b2.e(this, new eiho() { // from class: cawl
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    asot asotVar = cawo.a;
                    return cath.a;
                }
            });
            e.hn(new Runnable() { // from class: cawm
                @Override // java.lang.Runnable
                public final void run() {
                    cawo.this.g(this, null, eigb.a);
                }
            }, cawo.b);
            e.get(fpws.i(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e2) {
            ((ejhf) ((ejhf) ((ejhf) a.j()).s(e2)).ah((char) 5703)).x("failed to clear location reporting status storage");
        }
    }

    private static final void g(bkzh bkzhVar) {
        try {
            dfbl.n(bkzhVar.a(ejck.a));
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            ((ejhf) ((ejhf) ((ejhf) a.j()).s(e)).ah((char) 5704)).x("Failed to clean up geofences.");
        }
    }

    private static final void h(boolean z) {
        ((ejhf) ((ejhf) a.h()).ah((char) 5711)).B("Attempting to change container components state to enabled: %s", Boolean.valueOf(z));
        String[] strArr = b;
        int length = strArr.length;
        String str = strArr[0];
        try {
            asng.H(AppContextProvider.a(), str, z);
        } catch (IllegalArgumentException e) {
            ((ejhf) ((ejhf) ((ejhf) a.i()).s(e)).ah((char) 5710)).B("Component %s disabled", str);
        }
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        eiid j;
        if ((i & 2) != 0) {
            Map f = cavm.b().f(this);
            caxd.a().f(this);
            f();
            for (Account account : asnd.x(this)) {
                if (f.containsKey(account.name)) {
                    cawc.a(this, account);
                }
            }
        } else {
            cawo b2 = cavm.b();
            e(b2, b2.a(this));
        }
        if (!fpxh.E()) {
            h(false);
            return;
        }
        h(true);
        int i2 = PersistentDispatchingIntentOperation.a;
        Intent startIntent = IntentOperation.getStartIntent(AppContextProvider.a(), PersistentDispatchingIntentOperation.class, "com.google.android.gms.locationsharingreporter.service.reporting.periodic.ACTION_LSR_MODULE_INIT");
        if (startIntent == null) {
            j = eigb.a;
        } else {
            startIntent.putExtra("com.google.android.gms.locationsharingreporter.service.reporting.periodic.EXTRA_MODULE_INIT_FLAGS", i);
            j = eiid.j(startIntent);
        }
        if (j.h()) {
            AppContextProvider.a().startService((Intent) j.c());
        } else {
            ((ejhf) ((ejhf) a.i()).ah((char) 5706)).x("Failed to forward module init intent");
        }
    }

    final void e(cawo cawoVar, bkzh bkzhVar) {
        if (!cbfb.f(this)) {
            g(bkzhVar);
            return;
        }
        eiuu c = cawoVar.c(this);
        try {
            dfbl.n(bkzhVar.a(c));
            ((ejhf) ((ejhf) a.h()).ah(5707)).B("New Geofences: %s", c);
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            ((ejhf) ((ejhf) ((ejhf) a.j()).s(e)).ah((char) 5708)).x("failed to register geofences.");
        }
    }
}
