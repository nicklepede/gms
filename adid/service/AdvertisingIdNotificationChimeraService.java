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
import defpackage.aqup;
import defpackage.asej;
import defpackage.asiu;
import defpackage.asng;
import defpackage.asot;
import defpackage.bxao;
import defpackage.ejhf;
import defpackage.fjzz;
import defpackage.tbb;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Semaphore;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AdvertisingIdNotificationChimeraService extends TracingIntentService {
    public static final asot a = asot.b("AdvertisingIdNS", asej.AD_MEASUREMENT);
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
        if (fjzz.a.a().T()) {
            long longExtra = intent.getLongExtra("time_since_last_update", -1L);
            Bundle bundle = new Bundle();
            bundle.putString("lat", true != this.b.m() ? "0" : "1");
            bundle.putString("tslu", Long.toString(longExtra));
            c.e().l(this, null, "gmob-apps", bundle);
        }
        List<ResolveInfo> queryIntentServices = getPackageManager().queryIntentServices(new Intent("com.google.android.gms.ads.identifier.BIND_LISTENER"), 0);
        HashSet<String> hashSet = new HashSet();
        Iterator<ResolveInfo> it = queryIntentServices.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().serviceInfo.packageName);
        }
        for (String str : hashSet) {
            tbb tbbVar = new tbb(str, this.b, this, this.c);
            if (fjzz.a.a().R()) {
                if (!aqup.d(tbbVar.c).h(tbbVar.a)) {
                    ((ejhf) a.j()).B("Permission denied. Package %s", str);
                }
            }
            Context context = tbbVar.c;
            String str2 = tbbVar.a;
            if (bxao.c(context, "com.google.android.gms.permission.AD_ID_NOTIFICATION", -1, asng.c(context, str2), str2, null) == 0) {
                List<ResolveInfo> queryIntentServices2 = context.getPackageManager().queryIntentServices(tbbVar.b, 0);
                if (queryIntentServices2.size() > 1) {
                    ((ejhf) a.j()).B("Unable to pick AdvertisingIdListenerService for %s, too many services defined.", str2);
                }
                if (queryIntentServices2.size() == 1) {
                    try {
                        tbbVar.d.acquire();
                        try {
                        } catch (SecurityException e) {
                            e.getMessage();
                        }
                        if (!asiu.a().d(tbbVar.c, tbbVar.b, tbbVar, 1)) {
                            tbbVar.d.release();
                        }
                    } catch (InterruptedException unused) {
                    }
                } else {
                    ((ejhf) a.j()).B("Does not have proper listener service. Package %s", str);
                }
            } else {
                ((ejhf) a.j()).B("Permission denied. Package %s", str);
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
