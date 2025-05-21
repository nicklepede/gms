package com.google.android.gms.ads.social;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import defpackage.asgt;
import defpackage.blcf;
import defpackage.bxjs;
import defpackage.bxoi;
import defpackage.bybl;
import defpackage.bybm;
import defpackage.bybu;
import defpackage.bybx;
import defpackage.bycb;
import defpackage.byci;
import defpackage.bycl;
import defpackage.bycn;
import defpackage.bycp;
import defpackage.byct;
import defpackage.bycw;
import defpackage.bycx;
import defpackage.byjl;
import defpackage.eits;
import defpackage.fjva;
import defpackage.fjwt;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class d {
    private final Context a;
    private final i b;
    private final b c;
    private final aa d;

    public d(Context context, i iVar, b bVar, aa aaVar) {
        this.a = context;
        this.b = iVar;
        this.c = bVar;
        this.d = aaVar;
    }

    static d b(Context context) {
        return new d(context, i.a(context), new b(context), aa.a(context));
    }

    static String c(Map map) {
        List<String> list;
        Iterator it = map.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                list = null;
                break;
            }
            String str = (String) it.next();
            if ("Set-Cookie".equalsIgnoreCase(str)) {
                list = (List) map.get(str);
                break;
            }
        }
        if (list != null) {
            for (String str2 : list) {
                if (str2 != null && str2.startsWith("DSID")) {
                    return str2;
                }
            }
        }
        return null;
    }

    private final byct f(URL url, String str) {
        bybu a = bybx.a(this.a);
        String url2 = url.toString();
        bxoi bxoiVar = bxjs.b;
        bybm bybmVar = bybm.a;
        bybl byblVar = bybl.a;
        bycl e = a.e(byci.e(url2, bxoiVar, bybmVar, byblVar), bycn.a, com.google.android.gms.ads.internal.util.future.e.a, -1, 266);
        bycw a2 = bycb.a(bybmVar, byblVar);
        a2.a("Authorization", "Bearer ".concat(str));
        e.m(new bycx(a2));
        bycp e2 = e.e();
        try {
            return (byct) e2.a().get(fjva.b(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e3) {
            if (e3 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            if (e3 instanceof ExecutionException) {
                Throwable cause = e3.getCause();
                int i = com.google.android.gms.ads.internal.util.c.a;
                com.google.android.gms.ads.internal.util.client.h.h("Failed to retrieve DSID: ", cause);
            } else {
                int i2 = com.google.android.gms.ads.internal.util.c.a;
                com.google.android.gms.ads.internal.util.client.h.h("Failed to retrieve DSID: ", e3);
            }
            e2.b();
            return null;
        }
    }

    private final void g(String str, String str2, a aVar) {
        b bVar = this.c;
        if (aVar == a.GAIALESS_DORITOS) {
            bVar.b.edit().putString(str, str2).apply();
        } else {
            bVar.a.edit().putString(str, str2).apply();
        }
        int i = com.google.android.gms.ads.internal.util.c.a;
        com.google.android.gms.ads.internal.util.client.h.d("Saved DSID.");
    }

    public final int a(String str) {
        int i = com.google.android.gms.ads.internal.util.c.a;
        com.google.android.gms.ads.internal.util.client.h.d("Running DSID refresh task.");
        if (!TextUtils.isEmpty(str) && Character.isDigit(str.charAt(str.length() - 1))) {
            com.google.android.gms.ads.internal.util.client.h.d("Cancelling old DRT task.");
            byjl.a(this.a).d(str, "com.google.android.gms.ads.social.GcmSchedulerWakeupService");
            return 2;
        }
        this.d.d();
        i iVar = this.b;
        Context context = this.a;
        Account[] d = iVar.d();
        c cVar = new c(context);
        boolean z = true;
        for (Account account : d) {
            z = z && d(account.name, cVar);
        }
        if (z) {
            return 0;
        }
        return str.startsWith("ads.social.doritos-oneoff") ? 2 : 1;
    }

    final boolean d(String str, c cVar) {
        try {
            String str2 = "1";
            if (!fjwt.j()) {
                if (!fjwt.a.a().i()) {
                    return e(str, cVar, new URL(fjwt.i()), a.DORITOS_WITH_GAIA);
                }
                if (!com.google.android.gms.ads.identifier.settings.b.c(this.a).m()) {
                    str2 = "0";
                }
                Uri.Builder buildUpon = Uri.parse(fjwt.i()).buildUpon();
                buildUpon.appendQueryParameter(fjwt.g(), str2);
                return e(str, cVar, new URL(buildUpon.build().toString()), a.DORITOS_WITH_GAIA);
            }
            boolean m = com.google.android.gms.ads.identifier.settings.b.c(this.a).m();
            String str3 = m ? "1" : "0";
            if (m) {
                Uri.Builder buildUpon2 = Uri.parse(fjwt.i()).buildUpon();
                buildUpon2.appendQueryParameter(fjwt.g(), str3);
                return e(str, cVar, new URL(buildUpon2.build().toString()), a.GAIALESS_DORITOS);
            }
            Uri.Builder buildUpon3 = Uri.parse(fjwt.i()).buildUpon();
            buildUpon3.appendQueryParameter(fjwt.g(), str3).appendQueryParameter(fjwt.f(), "1");
            boolean e = e(str, cVar, new URL(buildUpon3.build().toString()), a.DORITOS_WITH_GAIA);
            Uri.Builder buildUpon4 = Uri.parse(fjwt.i()).buildUpon();
            buildUpon4.appendQueryParameter(fjwt.g(), str3).appendQueryParameter(fjwt.f(), "0");
            return e(str, cVar, new URL(buildUpon4.build().toString()), a.GAIALESS_DORITOS) & e;
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    final boolean e(String str, c cVar, URL url, a aVar) {
        boolean z;
        Map<String, List<String>> headerFields;
        byct f;
        eits d;
        if (fjva.d()) {
            int i = 0;
            while (true) {
                try {
                    String a = cVar.a(str, fjwt.h());
                    if (a == null || (f = f(url, a)) == null) {
                        break;
                    }
                    int a2 = f.a.a();
                    if (a2 == 401) {
                        try {
                            cVar.b(a);
                            a2 = 401;
                        } catch (Exception e) {
                            String concat = "Failed to clear auth token for DSID: ".concat(e.toString());
                            int i2 = com.google.android.gms.ads.internal.util.c.a;
                            com.google.android.gms.ads.internal.util.client.h.d(concat);
                        }
                    }
                    if (a2 == 401) {
                        int i3 = i + 1;
                        if (i != 0) {
                            break;
                        }
                        i = i3;
                    } else if (a2 == 200 && (d = f.a.d()) != null) {
                        g(str, c(new HashMap(d)), aVar);
                        return true;
                    }
                } catch (Exception e2) {
                    String concat2 = "Failed to get auth token for DSID: ".concat(e2.toString());
                    int i4 = com.google.android.gms.ads.internal.util.c.a;
                    com.google.android.gms.ads.internal.util.client.h.d(concat2);
                }
            }
        } else {
            blcf blcfVar = new blcf(this.a);
            int i5 = 0;
            while (true) {
                try {
                    String a3 = cVar.a(str, fjwt.h());
                    if (a3 == null) {
                        break;
                    }
                    try {
                        try {
                            asgt.c(266, -1);
                            HttpURLConnection b = blcfVar.b(url);
                            if (b == null) {
                                break;
                            }
                            z = false;
                            try {
                                b.setRequestProperty("Authorization", defpackage.a.x(a3, "Bearer "));
                                int responseCode = b.getResponseCode();
                                blcfVar.a(b, responseCode);
                                if (responseCode == 401) {
                                    try {
                                        cVar.b(a3);
                                        responseCode = 401;
                                    } catch (Exception e3) {
                                        String concat3 = "Failed to clear auth token for DSID: ".concat(e3.toString());
                                        int i6 = com.google.android.gms.ads.internal.util.c.a;
                                        com.google.android.gms.ads.internal.util.client.h.d(concat3);
                                        return false;
                                    }
                                }
                                if (responseCode != 401) {
                                    if (responseCode != 200 || (headerFields = b.getHeaderFields()) == null) {
                                        return false;
                                    }
                                    g(str, c(headerFields), aVar);
                                    return true;
                                }
                                int i7 = i5 + 1;
                                if (i5 != 0) {
                                    return false;
                                }
                                i5 = i7;
                            } catch (IOException unused) {
                                String b2 = defpackage.a.b(url, "Failed to connect to ", ". No DSID retrieved.");
                                int i8 = com.google.android.gms.ads.internal.util.c.a;
                                com.google.android.gms.ads.internal.util.client.h.f(b2);
                                return z;
                            }
                        } finally {
                            asgt.a();
                        }
                    } catch (IOException unused2) {
                        z = false;
                    }
                } catch (Exception e4) {
                    String concat4 = "Failed to get auth token for DSID: ".concat(e4.toString());
                    int i9 = com.google.android.gms.ads.internal.util.c.a;
                    com.google.android.gms.ads.internal.util.client.h.d(concat4);
                    return false;
                }
            }
        }
        return false;
    }
}
