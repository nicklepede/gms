package com.google.android.gms.ads.internal.state;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.security.NetworkSecurityPolicy;
import com.google.android.gms.ads.internal.client.u;
import com.google.android.gms.ads.internal.config.p;
import com.google.android.gms.ads.internal.flag.s;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.auub;
import defpackage.auwr;
import defpackage.eqgc;
import defpackage.eqgl;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class e {
    public final Object a = new Object();
    public final com.google.android.gms.ads.internal.util.g b;
    public final h c;
    public Context d;
    public VersionInfoParcel e;
    public com.google.android.gms.ads.internal.csi.b f;
    public Boolean g;
    public final AtomicInteger h;
    public final AtomicBoolean i;
    private boolean j;
    private final Object k;
    private eqgl l;

    public e() {
        com.google.android.gms.ads.internal.util.g gVar = new com.google.android.gms.ads.internal.util.g();
        this.b = gVar;
        String str = u.a.b;
        this.c = new h(gVar);
        this.j = false;
        this.f = null;
        this.g = null;
        this.h = new AtomicInteger(0);
        new AtomicInteger(0);
        this.k = new Object();
        this.i = new AtomicBoolean();
    }

    public final com.google.android.gms.ads.internal.csi.b a() {
        com.google.android.gms.ads.internal.csi.b bVar;
        synchronized (this.a) {
            bVar = this.f;
        }
        return bVar;
    }

    public final void b(Context context, VersionInfoParcel versionInfoParcel) {
        synchronized (this.a) {
            if (!this.j) {
                this.d = context.getApplicationContext();
                this.e = versionInfoParcel;
                com.google.android.gms.ads.internal.appcontent.c a = com.google.android.gms.ads.internal.c.a();
                h hVar = this.c;
                synchronized (a.a) {
                    if (a.b == null) {
                        a.b = new com.google.android.gms.ads.internal.appcontent.b();
                    }
                    com.google.android.gms.ads.internal.appcontent.b bVar = a.b;
                    synchronized (bVar.b) {
                        bVar.e.add(hVar);
                    }
                }
                final com.google.android.gms.ads.internal.util.g gVar = this.b;
                final Context context2 = this.d;
                synchronized (gVar.a) {
                    if (gVar.f == null) {
                        gVar.d = com.google.android.gms.ads.internal.util.future.e.a.submit(new Runnable() { // from class: com.google.android.gms.ads.internal.util.f
                            public final /* synthetic */ String c = "admob";

                            @Override // java.lang.Runnable
                            public final void run() {
                                SharedPreferences sharedPreferences = context2.getSharedPreferences(this.c, 0);
                                SharedPreferences.Editor edit = sharedPreferences.edit();
                                g gVar2 = g.this;
                                try {
                                    synchronized (gVar2.a) {
                                        gVar2.f = sharedPreferences;
                                        gVar2.g = edit;
                                        NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                                        gVar2.h = gVar2.f.getBoolean("use_https", gVar2.h);
                                        gVar2.t = gVar2.f.getBoolean("content_url_opted_out", gVar2.t);
                                        gVar2.i = gVar2.f.getString("content_url_hashes", gVar2.i);
                                        gVar2.k = gVar2.f.getBoolean("gad_idless", gVar2.k);
                                        gVar2.u = gVar2.f.getBoolean("content_vertical_opted_out", gVar2.u);
                                        gVar2.j = gVar2.f.getString("content_vertical_hashes", gVar2.j);
                                        gVar2.r = gVar2.f.getInt("version_code", gVar2.r);
                                        if (((Boolean) com.google.android.gms.ads.internal.flag.g.e.d()).booleanValue() && com.google.android.gms.ads.internal.client.w.b().i) {
                                            gVar2.n = new com.google.android.gms.ads.internal.state.a("", 0L);
                                        } else {
                                            gVar2.n = new com.google.android.gms.ads.internal.state.a(gVar2.f.getString("app_settings_json", gVar2.n.a), gVar2.f.getLong("app_settings_last_update_ms", gVar2.n.b));
                                        }
                                        gVar2.o = gVar2.f.getLong("app_last_background_time_ms", gVar2.o);
                                        gVar2.q = gVar2.f.getInt("request_in_session_count", gVar2.q);
                                        gVar2.p = gVar2.f.getLong("first_ad_req_time_ms", gVar2.p);
                                        gVar2.s = gVar2.f.getStringSet("never_pool_slots", gVar2.s);
                                        gVar2.v = gVar2.f.getString("display_cutout", gVar2.v);
                                        gVar2.A = gVar2.f.getInt("app_measurement_npa", gVar2.A);
                                        gVar2.B = gVar2.f.getInt("sd_app_measure_npa", gVar2.B);
                                        gVar2.C = gVar2.f.getLong("sd_app_measure_npa_ts", gVar2.C);
                                        gVar2.w = gVar2.f.getString("inspector_info", gVar2.w);
                                        gVar2.x = gVar2.f.getBoolean("linked_device", gVar2.x);
                                        gVar2.y = gVar2.f.getString("linked_ad_unit", gVar2.y);
                                        gVar2.z = gVar2.f.getString("inspector_ui_storage", gVar2.z);
                                        gVar2.l = gVar2.f.getString("IABTCF_TCString", gVar2.l);
                                        gVar2.m = gVar2.f.getInt("gad_has_consent_for_cookies", gVar2.m);
                                        try {
                                            new JSONObject(gVar2.f.getString("native_advanced_settings", "{}"));
                                        } catch (JSONException e) {
                                            int i = c.a;
                                            com.google.android.gms.ads.internal.util.client.h.m("Could not convert native advanced settings to json object", e);
                                        }
                                        gVar2.b();
                                    }
                                } catch (Throwable th) {
                                    com.google.android.gms.ads.internal.c.d().d(th, "AdSharedPreferenceManagerImpl.initializeOnBackgroundThread");
                                }
                            }
                        });
                        gVar.b = true;
                    }
                }
                com.google.android.gms.ads.internal.report.d.b(this.d, this.e);
                com.google.android.gms.ads.internal.c.i();
                com.google.android.gms.ads.internal.csi.b bVar2 = !((Boolean) p.M.g()).booleanValue() ? null : new com.google.android.gms.ads.internal.csi.b();
                this.f = bVar2;
                if (bVar2 != null) {
                    com.google.android.gms.ads.internal.util.future.h.a(new c(this).b(), "AppState.registerCsiReporter");
                }
                Context context3 = this.d;
                if (auub.c() && ((Boolean) p.bi.g()).booleanValue()) {
                    try {
                        ((ConnectivityManager) context3.getSystemService("connectivity")).registerDefaultNetworkCallback(new d(this));
                    } catch (RuntimeException e) {
                        int i = com.google.android.gms.ads.internal.util.c.a;
                        com.google.android.gms.ads.internal.util.client.h.m("Failed to register network callback", e);
                        this.i.set(true);
                    }
                }
                this.j = true;
                if (this.d != null && !((Boolean) p.X.g()).booleanValue()) {
                    synchronized (this.k) {
                        if (this.l == null) {
                            this.l = com.google.android.gms.ads.internal.util.future.e.a.submit(new Callable() { // from class: com.google.android.gms.ads.internal.state.b
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    Context a2 = com.google.android.gms.ads.internal.reward.a.a(e.this.d);
                                    ArrayList arrayList = new ArrayList();
                                    try {
                                        PackageInfo f = auwr.b(a2).f(a2.getApplicationInfo().packageName, 4096);
                                        if (f.requestedPermissions != null && f.requestedPermissionsFlags != null) {
                                            for (int i2 = 0; i2 < f.requestedPermissions.length; i2++) {
                                                if ((f.requestedPermissionsFlags[i2] & 2) != 0) {
                                                    arrayList.add(f.requestedPermissions[i2]);
                                                }
                                            }
                                        }
                                    } catch (PackageManager.NameNotFoundException unused) {
                                    }
                                    return arrayList;
                                }
                            });
                        }
                    }
                }
                eqgc.i(new ArrayList());
            }
        }
        com.google.android.gms.ads.internal.c.e().a(context, versionInfoParcel.a);
    }

    public final void c(Throwable th, String str) {
        com.google.android.gms.ads.internal.report.d.b(this.d, this.e).f(th, str, ((Double) s.f.d()).floatValue());
    }

    public final void d(Throwable th, String str) {
        com.google.android.gms.ads.internal.report.d.b(this.d, this.e).e(th, str);
    }
}
