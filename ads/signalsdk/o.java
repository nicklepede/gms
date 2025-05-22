package com.google.android.gms.ads.signalsdk;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.aa;
import com.google.android.gms.ads.internal.util.ab;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.social.GmsDoritosProvider;
import defpackage.bzps;
import defpackage.ekut;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqgb;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.fmon;
import defpackage.fmpo;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class o extends c implements bzps {
    public static final Charset a;
    private static final Set d;
    public final String b;
    public final aa c;
    private final Context e;
    private final VersionInfoParcel f;
    private final Executor g;
    private final ScheduledExecutorService h;
    private final GmsDoritosProvider i;

    static {
        HashSet hashSet = new HashSet();
        d = hashSet;
        a = Charset.forName("UTF-8");
        hashSet.add("afma_version");
    }

    public o(Context context, VersionInfoParcel versionInfoParcel, String str, Executor executor, ScheduledExecutorService scheduledExecutorService, aa aaVar, GmsDoritosProvider gmsDoritosProvider) {
        this.e = context;
        this.f = versionInfoParcel;
        this.b = str;
        this.g = executor;
        this.h = scheduledExecutorService;
        this.c = aaVar;
        this.i = gmsDoritosProvider;
    }

    private final Uri d(String str) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("afma_version", this.f.a);
        return buildUpon.build();
    }

    private final eqgl e(final int i, final Uri uri, final String str, final Bundle bundle, long j, final String str2) {
        GmsDoritosProvider gmsDoritosProvider = this.i;
        final eqgl doritosCookieAsynchronously = gmsDoritosProvider.getDoritosCookieAsynchronously(str2);
        final eqgl doritosCookiesAsynchronously = gmsDoritosProvider.getDoritosCookiesAsynchronously(str2);
        eqgl g = eqdl.g(eqgc.f(doritosCookieAsynchronously, doritosCookiesAsynchronously), new eqdv() { // from class: com.google.android.gms.ads.signalsdk.j
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                HashMap hashMap = new HashMap();
                Bundle bundle2 = bundle;
                if (bundle2 != null) {
                    for (String str3 : bundle2.keySet()) {
                        hashMap.put(str3, bundle2.getString(str3));
                    }
                }
                String str4 = str;
                Uri uri2 = uri;
                String str5 = str2;
                eqgl eqglVar = doritosCookiesAsynchronously;
                eqgl eqglVar2 = doritosCookieAsynchronously;
                o oVar = o.this;
                hashMap.put("User-Agent", oVar.b);
                hashMap.put("x-afma-drt-cookie", (String) eqglVar2.get());
                hashMap.put("x-afma-drt-v2-cookie", (String) eqglVar.get());
                hashMap.put("calling-package", str5);
                String uri3 = uri2.toString();
                byte[] bArr = null;
                if (str4 != null && !str4.isEmpty()) {
                    bArr = str4.getBytes(o.a);
                }
                return oVar.c.a(i, uri3, hashMap, bArr);
            }
        }, this.g);
        return j <= 0 ? g : eqgc.q(g, j, TimeUnit.MILLISECONDS, this.h);
    }

    @Override // com.google.android.gms.ads.signalsdk.d
    public final void a(NetworkRequestOptions networkRequestOptions, a aVar) {
        fmon fmonVar = fmon.a;
        fmonVar.lK().e();
        if (fmonVar.lK().d()) {
            aVar.a(2);
            return;
        }
        if (fmonVar.lK().c()) {
            Context context = this.e;
            String nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid());
            g iVar = Build.VERSION.SDK_INT >= 30 ? new i(context, nameForUid) : new h(context, nameForUid);
            if (!iVar.a()) {
                aVar.a(7);
                return;
            } else if (!iVar.b()) {
                aVar.a(9);
                return;
            }
        }
        String str = networkRequestOptions.a;
        Uri d2 = d(str);
        if (d2.getScheme().equals("https")) {
            if (fmonVar.lK().b().contains(":" + d2.getHost() + ":")) {
                eqgc.t(e(networkRequestOptions.b, d(str), networkRequestOptions.c, null, fmonVar.lK().a(), this.e.getPackageManager().getNameForUid(Binder.getCallingUid())), new n(aVar), this.g);
                return;
            }
        }
        aVar.a(6);
    }

    @Override // com.google.android.gms.ads.signalsdk.d
    public final void c(Bundle bundle, b bVar) {
        fmpo fmpoVar = fmpo.a;
        fmpoVar.lK().f();
        if (fmpoVar.lK().e()) {
            bVar.a(2);
            return;
        }
        String nameForUid = this.e.getPackageManager().getNameForUid(Binder.getCallingUid());
        if (fmpoVar.lK().d() && !fmpoVar.lK().b().contains(defpackage.a.a(nameForUid, ":", ":"))) {
            bVar.a(3);
            String valueOf = String.valueOf(nameForUid);
            int i = com.google.android.gms.ads.internal.util.c.a;
            com.google.android.gms.ads.internal.util.client.h.d("Package is not allowed to access signal sdk: ".concat(valueOf));
            return;
        }
        Uri d2 = d(fmpo.c());
        Bundle bundle2 = bundle.getBundle("extra_params");
        Uri.Builder buildUpon = d2.buildUpon();
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                if (!d.contains(str)) {
                    buildUpon.appendQueryParameter(str, bundle2.getString(str));
                }
            }
        }
        eqgb h = eqgb.h(e(0, buildUpon.build(), null, bundle.getBundle("extra_headers"), fmpoVar.lK().a(), nameForUid));
        eqdv eqdvVar = new eqdv() { // from class: com.google.android.gms.ads.signalsdk.k
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                Charset charset = o.a;
                return eqgc.i(new JSONObject((String) obj));
            }
        };
        Executor executor = this.g;
        eqgc.t(eqdl.f(eqdl.g(h, eqdvVar, executor), new ekut() { // from class: com.google.android.gms.ads.signalsdk.l
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                return ab.a((JSONObject) obj);
            }
        }, executor), new m(bVar), executor);
    }
}
