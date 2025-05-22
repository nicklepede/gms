package com.google.android.gms.ads.social;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.ekut;
import defpackage.eqcq;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.eqgo;
import defpackage.fmmx;
import defpackage.fmpo;
import defpackage.fmpr;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class t {
    private static t b;
    public final aa a;
    private final Context c;
    private final z d;

    public t(Context context) {
        z zVar = new z(context, GmsDoritosProvider.a(context), aa.a(context), new VersionInfoParcel(251864004, 251864004), new com.google.android.gms.ads.internal.util.aa(context));
        aa a = aa.a(context);
        this.c = context;
        this.d = zVar;
        this.a = a;
    }

    public static synchronized t a(Context context) {
        t tVar;
        synchronized (t.class) {
            if (b == null) {
                b = new t(context);
            }
            tVar = b;
        }
        return tVar;
    }

    public final eqgl b(final String str) {
        eqgl g;
        Context context = this.c;
        if (!u.a(context, str)) {
            return eqgc.i(null);
        }
        if (fmmx.a.lK().k() && u.b(context, str)) {
            return eqgc.i(null);
        }
        final a aVar = a.DORITOS_WITH_GAIA;
        if (fmmx.j() && u.b(context, str)) {
            aVar = a.GAIALESS_DORITOS;
        }
        aa aaVar = this.a;
        if (!aaVar.f(aVar)) {
            return eqgc.i(aaVar.c(aVar));
        }
        final z zVar = this.d;
        if (!zVar.f.f(aVar)) {
            int i = com.google.android.gms.ads.internal.util.c.a;
            com.google.android.gms.ads.internal.util.client.h.d("Refresh not needed.");
            g = eqgc.i(null);
        } else if (fmpr.f() && z.a.getAndSet(true)) {
            int i2 = com.google.android.gms.ads.internal.util.c.a;
            com.google.android.gms.ads.internal.util.client.h.d("Refresh in progress.");
            g = eqgc.i(null);
        } else {
            int i3 = com.google.android.gms.ads.internal.util.c.a;
            com.google.android.gms.ads.internal.util.client.h.d("Token refresh triggered.");
            Uri.Builder buildUpon = Uri.parse(fmpo.c()).buildUpon();
            buildUpon.appendQueryParameter("afma_version", zVar.d.a);
            final Uri build = buildUpon.build();
            GmsDoritosProvider gmsDoritosProvider = zVar.c;
            final eqgl doritosCookieAsynchronouslyWithType = gmsDoritosProvider.getDoritosCookieAsynchronouslyWithType(str, aVar);
            final eqgl doritosCookiesAsynchronouslyWithType = gmsDoritosProvider.getDoritosCookiesAsynchronouslyWithType(str, aVar);
            eqgl f = eqgc.f(doritosCookieAsynchronouslyWithType, doritosCookiesAsynchronouslyWithType);
            eqdv eqdvVar = new eqdv() { // from class: com.google.android.gms.ads.social.v
                @Override // defpackage.eqdv
                public final eqgl a(Object obj) {
                    HashMap hashMap = new HashMap();
                    z zVar2 = z.this;
                    hashMap.put("User-Agent", com.google.android.gms.ads.internal.c.e().a(zVar2.b, zVar2.d.a));
                    hashMap.put("x-afma-drt-cookie", (String) doritosCookieAsynchronouslyWithType.get());
                    hashMap.put("x-afma-drt-v2-cookie", (String) doritosCookiesAsynchronouslyWithType.get());
                    hashMap.put("calling-package", str);
                    hashMap.put("x-afma-token-requester-type", "requester_type_2");
                    return zVar2.e.a(0, build.toString(), hashMap, null);
                }
            };
            eqgo eqgoVar = com.google.android.gms.ads.internal.util.future.e.a;
            g = eqcq.g(eqdl.g(eqdl.g(eqdl.g(f, eqdvVar, eqgoVar), new eqdv() { // from class: com.google.android.gms.ads.social.w
                @Override // defpackage.eqdv
                public final eqgl a(Object obj) {
                    int i4 = z.g;
                    return eqgc.i(new JSONObject((String) obj));
                }
            }, eqgoVar), new eqdv() { // from class: com.google.android.gms.ads.social.x
                @Override // defpackage.eqdv
                public final eqgl a(Object obj) {
                    String string = ((JSONObject) obj).getString("newToken");
                    z.this.f.e(string, aVar);
                    z.a.set(false);
                    return eqgc.i(string);
                }
            }, eqgoVar), Throwable.class, new eqdv() { // from class: com.google.android.gms.ads.social.y
                @Override // defpackage.eqdv
                public final eqgl a(Object obj) {
                    int i4 = z.g;
                    int i5 = com.google.android.gms.ads.internal.util.c.a;
                    com.google.android.gms.ads.internal.util.client.h.h("Error occurred while getting trustless token from the server.", (Throwable) obj);
                    z.a.set(false);
                    return eqgc.i(null);
                }
            }, eqgoVar);
        }
        ekut ekutVar = new ekut() { // from class: com.google.android.gms.ads.social.r
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                return t.this.a.b((String) obj);
            }
        };
        eqgo eqgoVar2 = com.google.android.gms.ads.internal.util.future.e.a;
        return eqcq.g(eqdl.f(g, ekutVar, eqgoVar2), Throwable.class, new eqdv() { // from class: com.google.android.gms.ads.social.s
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                return eqgc.i(null);
            }
        }, eqgoVar2);
    }
}
