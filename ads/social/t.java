package com.google.android.gms.ads.social;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.eiho;
import defpackage.enox;
import defpackage.enps;
import defpackage.enqc;
import defpackage.ensj;
import defpackage.enss;
import defpackage.ensv;
import defpackage.fjwt;
import defpackage.fjzk;
import defpackage.fjzn;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class t {
    private static t b;
    public final aa a;
    private final Context c;
    private final z d;

    public t(Context context) {
        z zVar = new z(context, GmsDoritosProvider.a(context), aa.a(context), new VersionInfoParcel(251661004, 251661004), new com.google.android.gms.ads.internal.util.aa(context));
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

    public final enss b(final String str) {
        enss g;
        Context context = this.c;
        if (!u.a(context, str)) {
            return ensj.i(null);
        }
        if (fjwt.a.a().k() && u.b(context, str)) {
            return ensj.i(null);
        }
        final a aVar = a.DORITOS_WITH_GAIA;
        if (fjwt.j() && u.b(context, str)) {
            aVar = a.GAIALESS_DORITOS;
        }
        aa aaVar = this.a;
        if (!aaVar.f(aVar)) {
            return ensj.i(aaVar.c(aVar));
        }
        final z zVar = this.d;
        if (!zVar.f.f(aVar)) {
            int i = com.google.android.gms.ads.internal.util.c.a;
            com.google.android.gms.ads.internal.util.client.h.d("Refresh not needed.");
            g = ensj.i(null);
        } else if (fjzn.f() && z.a.getAndSet(true)) {
            int i2 = com.google.android.gms.ads.internal.util.c.a;
            com.google.android.gms.ads.internal.util.client.h.d("Refresh in progress.");
            g = ensj.i(null);
        } else {
            int i3 = com.google.android.gms.ads.internal.util.c.a;
            com.google.android.gms.ads.internal.util.client.h.d("Token refresh triggered.");
            Uri.Builder buildUpon = Uri.parse(fjzk.c()).buildUpon();
            buildUpon.appendQueryParameter("afma_version", zVar.d.a);
            final Uri build = buildUpon.build();
            GmsDoritosProvider gmsDoritosProvider = zVar.c;
            final enss doritosCookieAsynchronouslyWithType = gmsDoritosProvider.getDoritosCookieAsynchronouslyWithType(str, aVar);
            final enss doritosCookiesAsynchronouslyWithType = gmsDoritosProvider.getDoritosCookiesAsynchronouslyWithType(str, aVar);
            enss g2 = enps.g(ensj.f(doritosCookieAsynchronouslyWithType, doritosCookiesAsynchronouslyWithType), new enqc() { // from class: com.google.android.gms.ads.social.v
                @Override // defpackage.enqc
                public final enss a(Object obj) {
                    HashMap hashMap = new HashMap();
                    z zVar2 = z.this;
                    hashMap.put("User-Agent", com.google.android.gms.ads.internal.c.e().a(zVar2.b, zVar2.d.a));
                    hashMap.put("x-afma-drt-cookie", (String) doritosCookieAsynchronouslyWithType.get());
                    hashMap.put("x-afma-drt-v2-cookie", (String) doritosCookiesAsynchronouslyWithType.get());
                    hashMap.put("calling-package", str);
                    hashMap.put("x-afma-token-requester-type", "requester_type_2");
                    return zVar2.e.a(0, build.toString(), hashMap, null);
                }
            }, com.google.android.gms.ads.internal.util.future.e.a);
            enqc enqcVar = new enqc() { // from class: com.google.android.gms.ads.social.w
                @Override // defpackage.enqc
                public final enss a(Object obj) {
                    int i4 = z.g;
                    return ensj.i(new JSONObject((String) obj));
                }
            };
            ensv ensvVar = com.google.android.gms.ads.internal.util.future.e.a;
            g = enox.g(enps.g(enps.g(g2, enqcVar, ensvVar), new enqc() { // from class: com.google.android.gms.ads.social.x
                @Override // defpackage.enqc
                public final enss a(Object obj) {
                    String string = ((JSONObject) obj).getString("newToken");
                    z.this.f.e(string, aVar);
                    z.a.set(false);
                    return ensj.i(string);
                }
            }, ensvVar), Throwable.class, new enqc() { // from class: com.google.android.gms.ads.social.y
                @Override // defpackage.enqc
                public final enss a(Object obj) {
                    int i4 = z.g;
                    int i5 = com.google.android.gms.ads.internal.util.c.a;
                    com.google.android.gms.ads.internal.util.client.h.h("Error occurred while getting trustless token from the server.", (Throwable) obj);
                    z.a.set(false);
                    return ensj.i(null);
                }
            }, ensvVar);
        }
        return enox.g(enps.f(g, new eiho() { // from class: com.google.android.gms.ads.social.r
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                return t.this.a.b((String) obj);
            }
        }, com.google.android.gms.ads.internal.util.future.e.a), Throwable.class, new enqc() { // from class: com.google.android.gms.ads.social.s
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                return ensj.i(null);
            }
        }, com.google.android.gms.ads.internal.util.future.e.a);
    }
}
