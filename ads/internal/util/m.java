package com.google.android.gms.ads.internal.util;

import android.R;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import defpackage.asxd;
import defpackage.aurj;
import defpackage.aurr;
import defpackage.auup;
import defpackage.auwr;
import defpackage.caqj;
import defpackage.ekwo;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class m {
    public static final caqj a = new d(Looper.getMainLooper());
    private String h;
    private volatile String i;
    private final AtomicReference d = new AtomicReference(null);
    private final AtomicReference e = new AtomicReference(null);
    public final AtomicReference b = new AtomicReference(new Bundle());
    private final AtomicBoolean f = new AtomicBoolean();
    private final Object g = new Object();
    public final Executor c = Executors.newSingleThreadExecutor();

    public static List b() {
        List b = com.google.android.gms.ads.internal.config.p.b();
        ArrayList arrayList = new ArrayList();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            Iterator it2 = ekwo.e(',').l((String) it.next()).iterator();
            while (it2.hasNext()) {
                try {
                    arrayList.add(Long.valueOf((String) it2.next()));
                } catch (NumberFormatException unused) {
                }
            }
        }
        return arrayList;
    }

    public static final void f(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    static final String g() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        if (Build.VERSION.RELEASE != null) {
            sb.append(" ");
            sb.append(Build.VERSION.RELEASE);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        if (Build.DEVICE != null) {
            sb.append("; ");
            sb.append(Build.DEVICE);
            if (Build.DISPLAY != null) {
                sb.append(" Build/");
                sb.append(Build.DISPLAY);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public static final int[] h() {
        return new int[]{0, 0};
    }

    public static final boolean i(Context context, String str) {
        Context a2 = com.google.android.gms.ads.internal.reward.a.a(context);
        return auwr.b(a2).b(str, a2.getPackageName()) == 0;
    }

    public static final boolean j() {
        com.google.android.gms.ads.internal.client.u.b();
        return com.google.android.gms.ads.internal.util.client.f.i();
    }

    public static final void k(Context context, String str, String str2) {
        new ad(context, str, str2).b();
    }

    public static final void l(Context context, Throwable th) {
        if (context == null) {
            return;
        }
        try {
            if (((Boolean) com.google.android.gms.ads.internal.flag.s.b.d()).booleanValue()) {
                aurr.f(context, th);
            }
        } catch (IllegalStateException unused) {
        }
    }

    public static final Map n(Uri uri) {
        String encodedQuery;
        if (uri == null) {
            return null;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.config.p.h.g()).booleanValue()) {
            HashMap hashMap = new HashMap();
            for (String str : uri.getQueryParameterNames()) {
                if (!TextUtils.isEmpty(str)) {
                    hashMap.put(str, uri.getQueryParameter(str));
                }
            }
            return hashMap;
        }
        HashMap hashMap2 = new HashMap();
        if (!uri.isOpaque() && (encodedQuery = uri.getEncodedQuery()) != null) {
            int i = 0;
            while (true) {
                int indexOf = encodedQuery.indexOf(38, i);
                int length = encodedQuery.length();
                if (indexOf != -1) {
                    length = indexOf;
                }
                int indexOf2 = encodedQuery.indexOf(61, i);
                if (indexOf2 > length || indexOf2 == -1) {
                    indexOf2 = length;
                }
                hashMap2.put(Uri.decode(encodedQuery.substring(i, indexOf2)), indexOf2 == length ? "" : Uri.decode(encodedQuery.substring(indexOf2 + 1, length)));
                if (indexOf == -1) {
                    break;
                }
                i = indexOf + 1;
            }
        }
        return hashMap2;
    }

    public static final String o() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? str2 : defpackage.a.p(str2, str, " ");
    }

    public static final int[] p(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        return (window == null || (findViewById = window.findViewById(R.id.content)) == null) ? h() : new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    public static final WebResourceResponse q(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", com.google.android.gms.ads.internal.c.e().a(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new aa(context).a(0, str2, hashMap, null).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
            int i = c.a;
            com.google.android.gms.ads.internal.util.client.h.m("Could not fetch MRAID JS.", e);
        }
        return null;
    }

    public static final boolean r(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            int i = c.a;
            com.google.android.gms.ads.internal.util.client.h.h("Error loading class.", th);
            com.google.android.gms.ads.internal.c.d().d(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final void s(Context context, Intent intent) {
        if (!((Boolean) com.google.android.gms.ads.internal.config.p.by.g()).booleanValue()) {
            v(context, intent);
            return;
        }
        try {
            v(context, intent);
        } catch (SecurityException e) {
            int i = c.a;
            com.google.android.gms.ads.internal.util.client.h.l(e);
            com.google.android.gms.ads.internal.c.d().d(e, "AdUtil.startActivityWithUnknownContext");
        }
    }

    public static final void t(Context context, Intent intent) {
        if (!((Boolean) com.google.android.gms.ads.internal.config.p.ca.g()).booleanValue() || !(context instanceof com.google.android.gms.ads.internal.webview.ae)) {
            s(context, intent);
            return;
        }
        try {
            Uri data = intent.getData();
            if (data == null || data.toString() == null || !data.toString().matches((String) com.google.android.gms.ads.internal.config.p.cc.g())) {
                s(context, intent);
                return;
            }
            com.google.android.gms.ads.internal.webview.ae aeVar = (com.google.android.gms.ads.internal.webview.ae) context;
            if (aeVar.a != null) {
                String.valueOf(intent.getData());
                aeVar.a.startActivityForResult(intent, 236);
            } else {
                intent.setFlags(268435456);
                aeVar.b.startActivity(intent);
            }
            ((Boolean) com.google.android.gms.ads.internal.config.p.cb.g()).booleanValue();
        } catch (ActivityNotFoundException e) {
            e = e;
            int i = c.a;
            com.google.android.gms.ads.internal.util.client.h.h("Error occurred while starting activity for result", e);
            com.google.android.gms.ads.internal.c.d().d(e, "AdUtil.startActivityForResult");
            s(context, intent);
        } catch (SecurityException e2) {
            e = e2;
            int i2 = c.a;
            com.google.android.gms.ads.internal.util.client.h.h("Error occurred while starting activity for result", e);
            com.google.android.gms.ads.internal.c.d().d(e, "AdUtil.startActivityForResult");
            s(context, intent);
        } catch (Exception e3) {
            int i3 = c.a;
            com.google.android.gms.ads.internal.util.client.h.h("Error occurred while starting activity for result", e3);
            com.google.android.gms.ads.internal.c.d().d(e3, "AdUtil.startActivityForResult");
            s(context, intent);
        }
    }

    private static boolean u(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = (Pattern) atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    private static final void v(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    private static final String w(final Context context, String str) {
        String str2;
        String str3;
        if (str == null) {
            return g();
        }
        try {
            ai a2 = ai.a();
            if (TextUtils.isEmpty(a2.a)) {
                if (aurj.d()) {
                    str3 = (String) af.a(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.ag
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            Context context2 = context;
                            SharedPreferences sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                            String string = sharedPreferences.getString("user_agent", "");
                            if (!TextUtils.isEmpty(string)) {
                                return string;
                            }
                            String defaultUserAgent = WebSettings.getDefaultUserAgent(context2);
                            auup.a(context2, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
                            return defaultUserAgent;
                        }
                    });
                } else {
                    final Context b = asxd.b(context);
                    str3 = (String) af.a(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.ah
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            SharedPreferences sharedPreferences;
                            Context context2 = b;
                            Context context3 = context;
                            boolean z = false;
                            if (context2 != null) {
                                sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                            } else {
                                sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                                z = true;
                            }
                            String string = sharedPreferences.getString("user_agent", "");
                            if (!TextUtils.isEmpty(string)) {
                                return string;
                            }
                            String defaultUserAgent = WebSettings.getDefaultUserAgent(context3);
                            if (z) {
                                sharedPreferences.edit().putString("user_agent", defaultUserAgent).apply();
                            }
                            return defaultUserAgent;
                        }
                    });
                }
                a2.a = str3;
            }
            str2 = a2.a;
        } catch (Exception unused) {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = WebSettings.getDefaultUserAgent(context);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = g();
        }
        String p = defpackage.a.p(str, str2, " (Mobile; ");
        try {
            if (auwr.b(context).l()) {
                p = defpackage.a.r(p, ";aia");
            }
        } catch (Exception e) {
            com.google.android.gms.ads.internal.c.d().d(e, "AdUtil.getUserAgent");
        }
        return p.concat(")");
    }

    public final String a(Context context, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.config.p.bE.g()).booleanValue()) {
            if (this.i != null) {
                return this.i;
            }
            this.i = w(context, str);
            return this.i;
        }
        synchronized (this.g) {
            String str2 = this.h;
            if (str2 != null) {
                return str2;
            }
            String w = w(context, str);
            this.h = w;
            return w;
        }
    }

    public final boolean c(String str) {
        return u(str, this.d, (String) com.google.android.gms.ads.internal.config.p.v.g());
    }

    public final boolean d(String str) {
        return u(str, this.e, (String) com.google.android.gms.ads.internal.config.p.w.g());
    }

    public final void e(Context context, String str, HttpURLConnection httpURLConnection, int i) {
        if (i < 5000) {
            if (i > 0) {
                String l = defpackage.a.l(i, "HTTP timeout too low: ", " milliseconds. Reverting to default timeout: 60000 milliseconds.");
                int i2 = c.a;
                com.google.android.gms.ads.internal.util.client.h.k(l);
            }
            i = 60000;
        }
        String l2 = defpackage.a.l(i, "HTTP timeout: ", " milliseconds.");
        int i3 = c.a;
        com.google.android.gms.ads.internal.util.client.h.i(l2);
        httpURLConnection.setConnectTimeout(i);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(i);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", a(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    public final void m(final Context context, final String str, String str2, Bundle bundle) {
        com.google.android.gms.ads.internal.c.e();
        bundle.putString("device", o());
        bundle.putString("eids", TextUtils.join(",", com.google.android.gms.ads.internal.config.p.a()));
        if (bundle.isEmpty()) {
            int i = c.a;
            com.google.android.gms.ads.internal.util.client.h.d("Empty or null bundle.");
        } else {
            final String str3 = (String) com.google.android.gms.ads.internal.config.p.bt.g();
            if (!this.f.getAndSet(true)) {
                this.b.set(q.a(context, str3, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.ads.internal.util.j
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str4) {
                        m.this.b.set(q.b(context, str3));
                    }
                }));
            }
            bundle.putAll((Bundle) this.b.get());
        }
        com.google.android.gms.ads.internal.client.u.b();
        com.google.android.gms.ads.internal.util.client.f.n(context, str, str2, bundle, new com.google.android.gms.ads.internal.util.client.e() { // from class: com.google.android.gms.ads.internal.util.i
            @Override // com.google.android.gms.ads.internal.util.client.e
            public final void a(String str4) {
                caqj caqjVar = m.a;
                com.google.android.gms.ads.internal.c.e();
                m.k(context, str, str4);
            }
        });
    }
}
