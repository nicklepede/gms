package com.google.android.gms.adid.service;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.google.android.gms.ads.identifier.settings.b;
import com.google.android.gms.ads.internal.c;
import com.google.android.gms.ads.internal.config.p;
import com.google.android.gms.chimera.modules.adid.AppContextProvider;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import defpackage.asxe;
import defpackage.auid;
import defpackage.aumo;
import defpackage.aura;
import defpackage.ausn;
import defpackage.bzje;
import defpackage.eluo;
import defpackage.fmqe;
import defpackage.uxb;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Semaphore;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AdvertisingIdNotificationChimeraService extends TracingIntentService {
    public static final ausn a = ausn.b("AdvertisingIdNS", auid.AD_MEASUREMENT);
    private final b b;
    private final Semaphore c;

    public AdvertisingIdNotificationChimeraService() {
        super("AdvertisingIdNS");
        p.c(AppContextProvider.a());
        this.b = b.c(AppContextProvider.a());
        this.c = new Semaphore(1);
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.TracingIntentService
    public final void a(Intent intent) {
        fmqe fmqeVar = fmqe.a;
        if (fmqeVar.lK().T()) {
            long longExtra = intent.getLongExtra("time_since_last_update", -1L);
            Bundle bundle = new Bundle();
            bundle.putString("lat", true != this.b.m() ? "0" : "1");
            bundle.putString("tslu", Long.toString(longExtra));
            c.e().m(this, null, "gmob-apps", bundle);
        }
        List<ResolveInfo> queryIntentServices = getPackageManager().queryIntentServices(new Intent("com.google.android.gms.ads.identifier.BIND_LISTENER"), 0);
        HashSet<String> hashSet = new HashSet();
        Iterator<ResolveInfo> it = queryIntentServices.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().serviceInfo.packageName);
        }
        for (String str : hashSet) {
            uxb uxbVar = new uxb(str, this.b, this, this.c);
            if (fmqeVar.lK().R()) {
                if (!asxe.d(uxbVar.c).h(uxbVar.a)) {
                    ((eluo) a.j()).B("Permission denied. Package %s", str);
                }
            }
            Context context = uxbVar.c;
            String str2 = uxbVar.a;
            if (bzje.c(context, "com.google.android.gms.permission.AD_ID_NOTIFICATION", -1, aura.c(context, str2), str2, null) == 0) {
                List<ResolveInfo> queryIntentServices2 = context.getPackageManager().queryIntentServices(uxbVar.b, 0);
                if (queryIntentServices2.size() > 1) {
                    ((eluo) a.j()).B("Unable to pick AdvertisingIdListenerService for %s, too many services defined.", str2);
                }
                if (queryIntentServices2.size() == 1) {
                    try {
                        uxbVar.d.acquire();
                        try {
                        } catch (SecurityException e) {
                            e.getMessage();
                        }
                        if (!aumo.a().d(uxbVar.c, uxbVar.b, uxbVar, 1)) {
                            uxbVar.d.release();
                        }
                    } catch (InterruptedException unused) {
                    }
                } else {
                    ((eluo) a.j()).B("Does not have proper listener service. Package %s", str);
                }
            } else {
                ((eluo) a.j()).B("Permission denied. Package %s", str);
            }
        }
        try {
            this.c.acquire(1);
        } catch (InterruptedException unused2) {
        } catch (Throwable th) {
            this.c.release(1);
            throw th;
        }
        this.c.release(1);
    }
}
