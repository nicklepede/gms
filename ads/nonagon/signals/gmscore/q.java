package com.google.android.gms.ads.nonagon.signals.gmscore;

import android.content.Context;
import defpackage.aupz;
import defpackage.eqgl;
import defpackage.eqgo;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class q implements com.google.android.gms.ads.nonagon.signals.e {
    final com.google.android.gms.ads.internal.cache.e a;
    final eqgo b;
    final Context c;

    public q(com.google.android.gms.ads.internal.cache.e eVar, eqgo eqgoVar, Context context) {
        this.a = eVar;
        this.b = eqgoVar;
        this.c = context;
    }

    @Override // com.google.android.gms.ads.nonagon.signals.e
    public final int a() {
        return com.google.android.gms.ads.nonagon.signals.d.a(46);
    }

    @Override // com.google.android.gms.ads.nonagon.signals.e
    public final eqgl b() {
        return this.b.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signals.gmscore.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                q qVar = q.this;
                final Context context = qVar.c;
                eqgl submit = ((aupz) ((com.google.android.gms.ads.cache.l) qVar.a).b).submit(new Callable() { // from class: com.google.android.gms.ads.cache.k
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        com.google.android.gms.ads.cache.policy.b d;
                        JSONObject jSONObject = l.a;
                        f c = j.c(context);
                        if (c != null) {
                            try {
                                d = c.d();
                            } catch (g e) {
                                int i = com.google.android.gms.ads.internal.util.c.a;
                                com.google.android.gms.ads.internal.util.client.h.h("Unable to obtain cache state.", e);
                                return l.a;
                            }
                        } else {
                            d = null;
                        }
                        JSONObject jSONObject2 = l.a;
                        if (d != null) {
                            try {
                                return com.google.android.gms.ads.cache.policy.b.a.b(d);
                            } catch (JSONException e2) {
                                int i2 = com.google.android.gms.ads.internal.util.c.a;
                                com.google.android.gms.ads.internal.util.client.h.h("Unable to serialize cache state.", e2);
                            }
                        }
                        return jSONObject2;
                    }
                });
                Object jSONObject = new JSONObject();
                try {
                    jSONObject = submit.get(((Integer) com.google.android.gms.ads.internal.config.p.ah.g()).intValue(), TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    submit.cancel(true);
                    int i = com.google.android.gms.ads.internal.util.c.a;
                    com.google.android.gms.ads.internal.util.client.h.m("InterruptedException caught while resolving future.", e);
                    Thread.currentThread().interrupt();
                    com.google.android.gms.ads.internal.c.d().c(e, "Futures.resolveFuture");
                } catch (Exception e2) {
                    submit.cancel(true);
                    int i2 = com.google.android.gms.ads.internal.util.c.a;
                    com.google.android.gms.ads.internal.util.client.h.h("Error waiting for future.", e2);
                    com.google.android.gms.ads.internal.c.d().c(e2, "Futures.resolveFuture");
                }
                return new r((JSONObject) jSONObject);
            }
        });
    }
}
