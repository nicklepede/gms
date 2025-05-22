package com.google.android.gms.ads.nonagon.signals.gmscore;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import defpackage.dozx;
import defpackage.dpaa;
import defpackage.dpab;
import defpackage.ekut;
import defpackage.eqcq;
import defpackage.eqdl;
import defpackage.eqgb;
import defpackage.eqgl;
import j$.util.Objects;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class c implements com.google.android.gms.ads.nonagon.signals.e {
    public final Context a;
    public final boolean b;
    public final boolean c;
    private final ScheduledExecutorService d;
    private final Executor e;
    private final int f;

    public c(Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, boolean z, boolean z2) {
        this.a = context;
        this.d = scheduledExecutorService;
        this.e = executor;
        this.f = i;
        this.b = z;
        this.c = z2;
    }

    @Override // com.google.android.gms.ads.nonagon.signals.e
    public final int a() {
        return com.google.android.gms.ads.nonagon.signals.d.a(41);
    }

    @Override // com.google.android.gms.ads.nonagon.signals.e
    public final eqgl b() {
        eqgb h = eqgb.h(com.google.android.gms.ads.adinfo.g.a(this.a, this.f));
        ekut ekutVar = new ekut() { // from class: com.google.android.gms.ads.nonagon.signals.gmscore.a
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                dpab dpabVar;
                com.google.android.gms.ads.identifier.c cVar = (com.google.android.gms.ads.identifier.c) obj;
                dozx dozxVar = new dozx();
                c cVar2 = c.this;
                if (cVar2.b ? ((Boolean) com.google.android.gms.ads.internal.config.p.ac.g()).booleanValue() : ((Boolean) com.google.android.gms.ads.internal.config.p.ab.g()).booleanValue()) {
                    try {
                        Context context = cVar2.a;
                        dpab dpabVar2 = dpab.g;
                        synchronized (dpab.class) {
                            if (dpab.g == null) {
                                dpab.g = new dpab(context);
                            }
                            dpabVar = dpab.g;
                        }
                        String str = (String) Objects.requireNonNull(((com.google.android.gms.ads.identifier.c) Objects.requireNonNull(cVar)).a);
                        String packageName = context.getPackageName();
                        long longValue = ((Long) com.google.android.gms.ads.internal.config.p.ad.g()).longValue();
                        boolean z = cVar2.c;
                        synchronized (dpab.class) {
                            boolean z2 = true;
                            if (str != null) {
                                try {
                                    try {
                                        UUID.fromString(str);
                                    } finally {
                                    }
                                } catch (IllegalArgumentException unused) {
                                }
                                if (str.equals(dpaa.a)) {
                                    dozxVar = new dozx();
                                } else {
                                    String e = dpabVar.e(true);
                                    String c = dpabVar.f.c("paid_3p_hash_key");
                                    if (e != null && c != null && !e.equals(dpabVar.d(str, packageName, c))) {
                                        dozxVar = dpabVar.b(str, packageName);
                                    }
                                }
                            }
                            if (str == null) {
                                z2 = false;
                            }
                            long currentTimeMillis = System.currentTimeMillis();
                            if (currentTimeMillis < 0) {
                                throw new IllegalStateException(dpabVar.e.concat(": Invalid negative current timestamp. Updating PAID failed"));
                            }
                            long a = dpabVar.a(z2);
                            if (a != -1) {
                                if (currentTimeMillis < a) {
                                    dpabVar.f.b(z2 ? dpabVar.d : dpabVar.c, Long.valueOf(currentTimeMillis));
                                } else if (currentTimeMillis >= a + longValue) {
                                    dozxVar = dpabVar.b(str, packageName);
                                }
                            }
                            String e2 = dpabVar.e(z2);
                            dozxVar = (e2 != null || z) ? new dozx(e2, dpabVar.a(z2)) : dpabVar.b(str, packageName);
                        }
                    } catch (IOException | IllegalArgumentException e3) {
                        com.google.android.gms.ads.internal.c.d().d(e3, "AdIdInfoSignalSource.getPaidV1");
                        dozxVar = new dozx();
                    }
                }
                return new d(cVar, null, dozxVar);
            }
        };
        Executor executor = this.e;
        return eqcq.f(((eqgb) eqdl.f(h, ekutVar, executor)).i(((Long) com.google.android.gms.ads.internal.config.p.J.g()).longValue(), TimeUnit.MILLISECONDS, this.d), Throwable.class, new ekut() { // from class: com.google.android.gms.ads.nonagon.signals.gmscore.b
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                com.google.android.gms.ads.internal.client.u.b();
                ContentResolver contentResolver = c.this.a.getContentResolver();
                return new d(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new dozx());
            }
        }, executor);
    }
}
