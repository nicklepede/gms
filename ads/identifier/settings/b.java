package com.google.android.gms.ads.identifier.settings;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import defpackage.atzb;
import defpackage.bzje;
import defpackage.dbap;
import defpackage.fmla;
import defpackage.fmmu;
import defpackage.fmqe;
import defpackage.fmqj;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class b {
    protected static final String a = new UUID(0, 0).toString();
    private static b c = null;
    private static final AtomicLong d = new AtomicLong(-1);
    public final Object b = new Object();
    private final Context e;
    private final u f;

    static {
        Executors.newCachedThreadPool();
    }

    private b(Context context) {
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        this.e = context;
        this.f = u.a(context);
    }

    public static synchronized b c(Context context) {
        b bVar;
        synchronized (b.class) {
            if (c == null) {
                c = new b(context);
            }
            bVar = c;
        }
        return bVar;
    }

    public static String d() {
        return String.valueOf(UUID.randomUUID().toString().substring(0, r0.length() - 12)).concat("10ca1ad1abe1");
    }

    private final boolean q(String str, String str2) {
        return bzje.c(this.e, str2, -1, Binder.getCallingUid(), str, null) == 0;
    }

    public final SharedPreferences a() {
        return this.e.getSharedPreferences("per_app_lat", 4);
    }

    final SharedPreferences b() {
        return this.e.getSharedPreferences("adid_settings", 4);
    }

    public final String e() {
        String i;
        synchronized (this.b) {
            boolean n = n();
            String d2 = n ? d() : "";
            j();
            String str = "";
            if (fmqe.j() && fmqe.a.lK().O()) {
                try {
                    str = dbap.b(this.f.e()).toString();
                    if (TextUtils.isEmpty(str)) {
                        throw new IOException("Generated Id is null");
                    }
                } catch (IOException | GeneralSecurityException e) {
                    d.c(this.e, "generateNewIdError", e);
                    str = "";
                }
            }
            boolean isEmpty = TextUtils.isEmpty(str);
            boolean z = !isEmpty;
            if (isEmpty) {
                str = UUID.randomUUID().toString();
            }
            if (fmqe.a.lK().z()) {
                Context context = this.e;
                q.a(context).b();
                q.a(context).c();
            }
            b().edit().putInt("adid_reset_count", b().getInt("adid_reset_count", 0) + 1).apply();
            i = i(n, z, str, d2);
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00f6, code lost:
    
        return com.google.android.gms.ads.identifier.settings.b.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (r1 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f2, code lost:
    
        if (r13.lK().t() != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (defpackage.fmqe.a.lK().I() == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String f(int r13) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.settings.b.f(int):java.lang.String");
    }

    public final String g() {
        return b().getString("fake_adid_key", "");
    }

    public final String h() {
        return b().getString("adid_key", "");
    }

    public final String i(boolean z, boolean z2, String str, String str2) {
        if (z) {
            atzb.b(!str2.isEmpty());
        } else {
            atzb.b(str2.isEmpty());
        }
        b().edit().putBoolean("enable_debug_logging", z).putBoolean("using_cert", z2).putString("adid_key", str).putString("fake_adid_key", str2).apply();
        k();
        return z ? str2 : str;
    }

    public final void j() {
        synchronized (this.b) {
            b().edit().remove("adid_key").remove("fake_adid_key").apply();
            this.f.c();
        }
    }

    public final void k() {
        if (!fmla.c()) {
            Log.v("AdvertisingIdSettings", "The feature flag is not enabled. Not updating Adservices Ad ID.");
        }
        Intent intent = new Intent();
        Context context = this.e;
        intent.setComponent(new ComponentName(context, "com.google.android.gms.ads.identifier.service.AdvertisingIdNotificationService"));
        long currentTimeMillis = System.currentTimeMillis();
        long andSet = d.getAndSet(currentTimeMillis);
        intent.putExtra("time_since_last_update", andSet != -1 ? currentTimeMillis - andSet : -1L);
        context.startService(intent);
    }

    public final void l(boolean z) {
        synchronized (this.b) {
            if (Build.VERSION.SDK_INT >= fmqe.c() && fmqe.g() && z) {
                j();
            }
            b().edit().putBoolean("enable_limit_ad_tracking", z).apply();
            k();
        }
    }

    public final boolean m() {
        boolean z;
        synchronized (this.b) {
            if (!b().contains("enable_limit_ad_tracking")) {
                l(false);
            }
            z = b().getBoolean("enable_limit_ad_tracking", false);
        }
        return z;
    }

    public final boolean n() {
        if (fmmu.c()) {
            try {
                if (Settings.Global.getInt(this.e.getContentResolver(), "development_settings_enabled", 0) != 0) {
                    return b().getBoolean("enable_debug_logging", false);
                }
            } catch (Exception e) {
                Log.w("AdvertisingIdSettings", "Fail to determine debug setting.", e);
            }
        }
        return false;
    }

    public final boolean o(int i) {
        boolean z;
        Object obj = this.b;
        synchronized (obj) {
            if (m()) {
                return true;
            }
            if (!fmqj.c()) {
                return false;
            }
            synchronized (obj) {
                z = a().getBoolean(String.valueOf(i), false);
            }
            return z;
        }
    }

    public final boolean p() {
        return b().getBoolean("using_cert", false);
    }
}
