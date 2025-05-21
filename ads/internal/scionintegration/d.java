package com.google.android.gms.ads.internal.scionintegration;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.u;
import com.google.android.gms.ads.internal.config.p;
import com.google.android.gms.ads.internal.util.client.f;
import com.google.android.gms.ads.internal.util.client.h;
import defpackage.aqtp;
import defpackage.asnp;
import defpackage.byhj;
import defpackage.byhp;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class d {
    private final ConcurrentMap g;
    private final AtomicReference d = new AtomicReference(null);
    public final Object a = new Object();
    public String b = null;
    final AtomicBoolean c = new AtomicBoolean(false);
    private final AtomicInteger e = new AtomicInteger(-1);
    private final AtomicReference f = new AtomicReference(null);

    public d() {
        new AtomicReference(null);
        this.g = new ConcurrentHashMap(9);
        new AtomicReference(null);
        new ArrayBlockingQueue(20);
    }

    public static final Bundle f(Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str : map.keySet()) {
                try {
                    if (Objects.equals(str, "value")) {
                        bundle.putDouble(str, Double.parseDouble((String) map.get(str)));
                    } else {
                        bundle.putString(str, (String) map.get(str));
                    }
                } catch (NullPointerException | NumberFormatException unused) {
                }
            }
        }
        return bundle;
    }

    private final void g(Context context, String str, String str2, Bundle bundle) {
        if (e(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e) {
                String concat = "Invalid event ID: ".concat(str2);
                int i = com.google.android.gms.ads.internal.util.c.a;
                h.h(concat, e);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            bundle2.putAll(bundle);
            if (i(context, this.f)) {
                ConcurrentMap concurrentMap = this.g;
                Method method = (Method) concurrentMap.get("logEventInternal");
                if (method == null) {
                    try {
                        method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        concurrentMap.put("logEventInternal", method);
                    } catch (Exception unused) {
                        h("logEventInternal", true);
                        method = null;
                    }
                }
                try {
                    method.invoke(this.f.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    h("logEventInternal", true);
                }
            }
        }
    }

    private final void h(String str, boolean z) {
        AtomicBoolean atomicBoolean = this.c;
        if (atomicBoolean.get()) {
            return;
        }
        String a = defpackage.a.a(str, "Invoke Firebase method ", " error.");
        int i = com.google.android.gms.ads.internal.util.c.a;
        h.k(a);
        if (z) {
            h.k("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            atomicBoolean.set(true);
        }
    }

    private final boolean i(Context context, AtomicReference atomicReference) {
        if (atomicReference.get() == null) {
            try {
                a.a(atomicReference, context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            } catch (Exception unused) {
                h("getInstance", true);
                return false;
            }
        }
        return true;
    }

    public final Object a(String str, Context context) {
        if (i(context, this.f)) {
            ConcurrentMap concurrentMap = this.g;
            Method method = (Method) concurrentMap.get(str);
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, null);
                    concurrentMap.put(str, method);
                } catch (Exception unused) {
                    h(str, false);
                    method = null;
                }
            }
            try {
                return method.invoke(this.f.get(), null);
            } catch (Exception unused2) {
                h(str, true);
            }
        }
        return null;
    }

    public final String b(final Context context) {
        if (!e(context)) {
            return null;
        }
        long longValue = ((Long) p.A.g()).longValue();
        if (longValue < 0) {
            return (String) a("getAppInstanceId", context);
        }
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() == null) {
            a.a(atomicReference, asnp.d() ? byhj.b.g(((Integer) p.B.g()).intValue(), new c(), byhp.HIGH_SPEED) : new ThreadPoolExecutor(((Integer) p.B.g()).intValue(), ((Integer) p.B.g()).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new c()));
        }
        try {
            return (String) ((ExecutorService) atomicReference.get()).submit(new Callable() { // from class: com.google.android.gms.ads.internal.scionintegration.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return (String) d.this.a("getAppInstanceId", context);
                }
            }).get(longValue, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused) {
            return "TIME_OUT";
        } catch (Exception unused2) {
            return null;
        }
    }

    public final void c(Context context, String str, Map map) {
        g(context, "_ac", str, f(map));
    }

    public final void d(Context context, String str, Map map) {
        g(context, "_ai", str, f(map));
    }

    public final boolean e(Context context) {
        if (((Boolean) p.u.g()).booleanValue() && !this.c.get()) {
            if (((Boolean) p.C.g()).booleanValue()) {
                return true;
            }
            AtomicInteger atomicInteger = this.e;
            if (atomicInteger.get() == -1) {
                u.b();
                if (!f.m(context)) {
                    u.b();
                    int m = aqtp.d.m(context);
                    if (m == 0 || m == 2) {
                        int i = com.google.android.gms.ads.internal.util.c.a;
                        h.k("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        atomicInteger.set(0);
                    }
                }
                atomicInteger.set(1);
            }
            if (atomicInteger.get() == 1) {
                return true;
            }
        }
        return false;
    }
}
