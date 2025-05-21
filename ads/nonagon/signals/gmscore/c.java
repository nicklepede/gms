package com.google.android.gms.ads.nonagon.signals.gmscore;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import defpackage.dmoj;
import defpackage.dmom;
import defpackage.dmon;
import defpackage.eiho;
import defpackage.enox;
import defpackage.enps;
import defpackage.ensi;
import defpackage.enss;
import j$.util.Objects;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
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
    public final enss b() {
        ensi h = ensi.h(com.google.android.gms.ads.adinfo.g.a(this.a, this.f));
        eiho eihoVar = new eiho() { // from class: com.google.android.gms.ads.nonagon.signals.gmscore.a
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                dmon dmonVar;
                com.google.android.gms.ads.identifier.c cVar = (com.google.android.gms.ads.identifier.c) obj;
                dmoj dmojVar = new dmoj();
                c cVar2 = c.this;
                if (cVar2.b ? ((Boolean) com.google.android.gms.ads.internal.config.p.ac.g()).booleanValue() : ((Boolean) com.google.android.gms.ads.internal.config.p.ab.g()).booleanValue()) {
                    try {
                        Context context = cVar2.a;
                        dmon dmonVar2 = dmon.g;
                        synchronized (dmon.class) {
                            if (dmon.g == null) {
                                dmon.g = new dmon(context);
                            }
                            dmonVar = dmon.g;
                        }
                        String str = (String) Objects.requireNonNull(((com.google.android.gms.ads.identifier.c) Objects.requireNonNull(cVar)).a);
                        String packageName = context.getPackageName();
                        long longValue = ((Long) com.google.android.gms.ads.internal.config.p.ad.g()).longValue();
                        boolean z = cVar2.c;
                        synchronized (dmon.class) {
                            boolean z2 = true;
                            if (str != null) {
                                try {
                                    try {
                                        UUID.fromString(str);
                                    } finally {
                                    }
                                } catch (IllegalArgumentException unused) {
                                }
                                if (str.equals(dmom.a)) {
                                    dmojVar = new dmoj();
                                } else {
                                    String e = dmonVar.e(true);
                                    String c = dmonVar.f.c("paid_3p_hash_key");
                                    if (e != null && c != null && !e.equals(dmonVar.d(str, packageName, c))) {
                                        dmojVar = dmonVar.b(str, packageName);
                                    }
                                }
                            }
                            if (str == null) {
                                z2 = false;
                            }
                            long currentTimeMillis = System.currentTimeMillis();
                            if (currentTimeMillis < 0) {
                                throw new IllegalStateException(dmonVar.e.concat(": Invalid negative current timestamp. Updating PAID failed"));
                            }
                            long a = dmonVar.a(z2);
                            if (a != -1) {
                                if (currentTimeMillis < a) {
                                    dmonVar.f.b(z2 ? dmonVar.d : dmonVar.c, Long.valueOf(currentTimeMillis));
                                } else if (currentTimeMillis >= a + longValue) {
                                    dmojVar = dmonVar.b(str, packageName);
                                }
                            }
                            String e2 = dmonVar.e(z2);
                            dmojVar = (e2 != null || z) ? new dmoj(e2, dmonVar.a(z2)) : dmonVar.b(str, packageName);
                        }
                    } catch (IOException | IllegalArgumentException e3) {
                        com.google.android.gms.ads.internal.c.d().d(e3, "AdIdInfoSignalSource.getPaidV1");
                        dmojVar = new dmoj();
                    }
                }
                return new d(cVar, null, dmojVar);
            }
        };
        Executor executor = this.e;
        return enox.f(((ensi) enps.f(h, eihoVar, executor)).i(((Long) com.google.android.gms.ads.internal.config.p.J.g()).longValue(), TimeUnit.MILLISECONDS, this.d), Throwable.class, new eiho() { // from class: com.google.android.gms.ads.nonagon.signals.gmscore.b
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                com.google.android.gms.ads.internal.client.u.b();
                ContentResolver contentResolver = c.this.a.getContentResolver();
                return new d(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new dmoj());
            }
        }, executor);
    }
}
