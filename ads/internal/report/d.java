package com.google.android.gms.ads.internal.report;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.u;
import com.google.android.gms.ads.internal.config.p;
import com.google.android.gms.ads.internal.flag.g;
import com.google.android.gms.ads.internal.flag.s;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.ads.internal.util.client.m;
import defpackage.aswe;
import defpackage.asxd;
import defpackage.auwr;
import defpackage.ekvk;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class d implements f {
    public static f a;
    static f b;
    static Boolean c;
    private static final Object d = new Object();
    private final Object e;
    private final Context f;
    private final WeakHashMap g;
    private final ExecutorService h;
    private final VersionInfoParcel i;
    private final PackageInfo j;
    private final String k;
    private final String l;
    private final AtomicBoolean m;
    private boolean n;
    private Set o;

    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected d(android.content.Context r3, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4) {
        /*
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.e = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r2.g = r0
            capz r0 = defpackage.caqb.b
            caqh r1 = defpackage.caqh.HIGH_SPEED
            java.util.concurrent.ExecutorService r0 = r0.d(r1)
            r2.h = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r2.m = r0
            android.content.Context r0 = r3.getApplicationContext()
            if (r0 == 0) goto L2c
            android.content.Context r3 = r3.getApplicationContext()
        L2c:
            r2.f = r3
            r2.i = r4
            com.google.android.gms.ads.internal.config.g r4 = com.google.android.gms.ads.internal.config.p.be
            java.lang.Object r4 = r4.g()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0 = 0
            if (r4 == 0) goto L5a
            android.os.Handler r4 = com.google.android.gms.ads.internal.util.client.f.a
            if (r3 == 0) goto L5a
            android.content.pm.ApplicationInfo r4 = r3.getApplicationInfo()
            if (r4 != 0) goto L4a
            goto L5a
        L4a:
            auwq r4 = defpackage.auwr.b(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a
            java.lang.String r3 = r3.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a
            r1 = 0
            android.content.pm.PackageInfo r3 = r4.f(r3, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a
            goto L5b
        L5a:
            r3 = r0
        L5b:
            r2.j = r3
            com.google.android.gms.ads.internal.config.g r3 = com.google.android.gms.ads.internal.config.p.bc
            java.lang.Object r4 = r3.g()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.lang.String r1 = "unknown"
            if (r4 == 0) goto L78
            android.os.Handler r4 = com.google.android.gms.ads.internal.util.client.f.a
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r4 = r4.getCountry()
            goto L79
        L78:
            r4 = r1
        L79:
            r2.k = r4
            java.lang.Object r3 = r3.g()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto La4
            android.content.Context r3 = r2.f
            android.os.Handler r4 = com.google.android.gms.ads.internal.util.client.f.a
            if (r3 != 0) goto L8e
            goto La5
        L8e:
            auwq r3 = defpackage.auwr.b(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La5
            java.lang.String r4 = "com.android.vending"
            r1 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r3 = r3.f(r4, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La5
            if (r3 != 0) goto L9d
            goto La5
        L9d:
            int r3 = r3.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La5
            java.lang.String r0 = java.lang.Integer.toString(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La5
            goto La5
        La4:
            r0 = r1
        La5:
            r2.l = r0
            com.google.android.gms.ads.internal.config.g r3 = com.google.android.gms.ads.internal.config.p.aY
            java.lang.Object r3 = r3.g()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 <= 0) goto Lbc
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r2.o = r3
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.report.d.<init>(android.content.Context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel):void");
    }

    public static f a(Context context) {
        synchronized (d) {
            if (a == null) {
                if (j(context)) {
                    a = new d(context, new VersionInfoParcel(251864004, 251864004));
                } else {
                    a = new e();
                }
            }
        }
        return a;
    }

    public static f b(Context context, VersionInfoParcel versionInfoParcel) {
        synchronized (d) {
            if (b == null) {
                boolean z = false;
                if (((Boolean) g.b.d()).booleanValue() && (!((Boolean) p.aX.g()).booleanValue() || ((Boolean) g.a.d()).booleanValue())) {
                    z = true;
                }
                if (j(context)) {
                    d dVar = new d(context, versionInfoParcel);
                    dVar.i();
                    dVar.h();
                    b = dVar;
                } else if (!z || context == null) {
                    b = new e();
                } else {
                    d dVar2 = new d(context, versionInfoParcel, null);
                    dVar2.i();
                    dVar2.h();
                    b = dVar2;
                }
            }
        }
        return b;
    }

    public static String c(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String d(Throwable th) {
        return ekvk.b(com.google.android.gms.ads.internal.util.client.f.c(c(th), "SHA-256"));
    }

    private final void h() {
        Thread.setDefaultUncaughtExceptionHandler(new b(this, Thread.getDefaultUncaughtExceptionHandler()));
    }

    private final void i() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.e) {
            this.g.put(thread, true);
        }
        thread.setUncaughtExceptionHandler(new c(this, thread.getUncaughtExceptionHandler()));
    }

    private static boolean j(Context context) {
        if (context == null) {
            return false;
        }
        synchronized (d) {
            if (c == null) {
                c = Boolean.valueOf(u.d().nextInt(100) < ((Integer) p.bX.g()).intValue());
            }
        }
        return c.booleanValue() && !((Boolean) p.aX.g()).booleanValue();
    }

    @Override // com.google.android.gms.ads.internal.report.f
    public final void e(Throwable th, String str) {
        if (this.n) {
            return;
        }
        f(th, str, 1.0f);
    }

    @Override // com.google.android.gms.ads.internal.report.f
    public final void f(Throwable th, String str, float f) {
        Throwable th2;
        String str2;
        PackageInfo f2;
        ActivityManager activityManager;
        ActivityManager.MemoryInfo memoryInfo;
        if (this.n) {
            return;
        }
        Handler handler = com.google.android.gms.ads.internal.util.client.f.a;
        boolean z = false;
        if (((Boolean) s.e.d()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable th3 = th; th3 != null; th3 = th3.getCause()) {
                linkedList.push(th3);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th4 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th4.getStackTrace();
                boolean z2 = ((Boolean) p.U.g()).booleanValue() && stackTrace != null && stackTrace.length == 0 && com.google.android.gms.ads.internal.util.client.f.g(th4.getClass().getName());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th4.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (com.google.android.gms.ads.internal.util.client.f.g(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z2 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z2) {
                    th2 = th2 == null ? new Throwable(th4.getMessage()) : new Throwable(th4.getMessage(), th2);
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 != null) {
            String name = th.getClass().getName();
            String c2 = c(th);
            String d2 = ((Boolean) p.bo.g()).booleanValue() ? d(th) : "";
            double d3 = f;
            double random = Math.random();
            int i = f > 0.0f ? (int) (1.0f / f) : 1;
            if (random < d3) {
                ArrayList<String> arrayList2 = new ArrayList();
                try {
                    z = auwr.b(this.f).l();
                } catch (Throwable th5) {
                    h.h("Error fetching instant app info", th5);
                }
                try {
                    str2 = this.f.getPackageName();
                } catch (Throwable unused) {
                    h.k("Cannot obtain package name, proceeding.");
                    str2 = "unknown";
                }
                Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
                String str3 = Build.MANUFACTURER;
                String str4 = Build.MODEL;
                if (!str4.startsWith(str3)) {
                    str4 = defpackage.a.p(str4, str3, " ");
                }
                Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("device", str4);
                VersionInfoParcel versionInfoParcel = this.i;
                Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("js", versionInfoParcel.a).appendQueryParameter("appid", str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", c2).appendQueryParameter("eids", TextUtils.join(",", p.a())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "758020094").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(s.c.d()));
                int i2 = aswe.c;
                Context context = this.f;
                Uri.Builder appendQueryParameter4 = appendQueryParameter3.appendQueryParameter("gmscv", String.valueOf(asxd.a(context))).appendQueryParameter("lite", true != versionInfoParcel.e ? "0" : "1");
                if (!TextUtils.isEmpty(d2)) {
                    appendQueryParameter4.appendQueryParameter("hash", d2);
                }
                if (((Boolean) p.bd.g()).booleanValue()) {
                    if (context == null || (activityManager = (ActivityManager) context.getSystemService("activity")) == null) {
                        memoryInfo = null;
                    } else {
                        memoryInfo = new ActivityManager.MemoryInfo();
                        try {
                            activityManager.getMemoryInfo(memoryInfo);
                        } catch (NullPointerException unused2) {
                            h.k("Error retrieving the memory information.");
                        }
                    }
                    if (memoryInfo != null) {
                        appendQueryParameter4.appendQueryParameter("available_memory", Long.toString(memoryInfo.availMem));
                        appendQueryParameter4.appendQueryParameter("total_memory", Long.toString(memoryInfo.totalMem));
                        appendQueryParameter4.appendQueryParameter("is_low_memory", true == memoryInfo.lowMemory ? "1" : "0");
                    }
                }
                if (((Boolean) p.bc.g()).booleanValue()) {
                    String str5 = this.k;
                    if (!TextUtils.isEmpty(str5)) {
                        appendQueryParameter4.appendQueryParameter("countrycode", str5);
                    }
                    String str6 = this.l;
                    if (!TextUtils.isEmpty(str6)) {
                        appendQueryParameter4.appendQueryParameter("psv", str6);
                    }
                    Context context2 = this.f;
                    if (Build.VERSION.SDK_INT >= 26) {
                        f2 = WebView.getCurrentWebViewPackage();
                    } else {
                        if (context2 != null) {
                            try {
                                f2 = auwr.b(context2).f("com.android.webview", 128);
                            } catch (PackageManager.NameNotFoundException unused3) {
                            }
                        }
                        f2 = null;
                    }
                    if (f2 != null) {
                        appendQueryParameter4.appendQueryParameter("wvvc", Integer.toString(f2.versionCode));
                        appendQueryParameter4.appendQueryParameter("wvvn", f2.versionName);
                        appendQueryParameter4.appendQueryParameter("wvpn", f2.packageName);
                    }
                }
                PackageInfo packageInfo = this.j;
                if (packageInfo != null) {
                    appendQueryParameter4.appendQueryParameter("appvc", String.valueOf(packageInfo.versionCode));
                    appendQueryParameter4.appendQueryParameter("appvn", packageInfo.versionName);
                }
                arrayList2.add(appendQueryParameter4.toString());
                for (final String str7 : arrayList2) {
                    final m mVar = new m();
                    this.h.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.report.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            m.this.a(str7);
                        }
                    });
                }
            }
        }
    }

    protected final void g(Throwable th) {
        Context context;
        SharedPreferences sharedPreferences;
        if (th != null) {
            boolean z = false;
            boolean z2 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z |= com.google.android.gms.ads.internal.util.client.f.g(stackTraceElement.getClassName());
                    z2 |= getClass().getName().equals(stackTraceElement.getClassName());
                }
            }
            int intValue = ((Integer) p.aY.g()).intValue();
            if (intValue > 0) {
                if (this.o.size() >= intValue) {
                    return;
                }
                String d2 = d(th);
                if (this.o.contains(d2)) {
                    return;
                } else {
                    this.o.add(d2);
                }
            }
            if (!z || z2) {
                return;
            }
            if (!this.n) {
                e(th, "");
            }
            if (this.m.getAndSet(true) || !((Boolean) g.b.d()).booleanValue() || (sharedPreferences = (context = this.f).getSharedPreferences("admob", 0)) == null) {
                return;
            }
            sharedPreferences.edit().putInt("crash_without_write", com.google.android.gms.ads.internal.config.a.a(context, "crash_without_write") + 1).commit();
        }
    }

    protected d(Context context, VersionInfoParcel versionInfoParcel, byte[] bArr) {
        this(context, versionInfoParcel);
        this.n = true;
    }
}
