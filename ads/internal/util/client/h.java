package com.google.android.gms.ads.internal.util.client;

import android.util.Log;
import defpackage.ekwo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class h {
    protected static final ekwo b = ekwo.b(4000);

    static String c(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        return str + " @" + stackTrace[3].getLineNumber();
    }

    public static void d(String str) {
        if (p(3)) {
            if (str.length() <= 4000) {
                Log.d("Ads", str);
                return;
            }
            boolean z = true;
            for (String str2 : b.l(str)) {
                if (z) {
                    Log.d("Ads", str2);
                } else {
                    Log.d("Ads-cont", str2);
                }
                z = false;
            }
        }
    }

    public static void e(String str, Throwable th) {
        if (p(3)) {
            Log.d("Ads", str, th);
        }
    }

    public static void f(String str) {
        if (p(6)) {
            if (str == null || str.length() <= 4000) {
                Log.e("Ads", str);
                return;
            }
            boolean z = true;
            for (String str2 : b.l(str)) {
                if (z) {
                    Log.e("Ads", str2);
                } else {
                    Log.e("Ads-cont", str2);
                }
                z = false;
            }
        }
    }

    public static void g(Throwable th) {
        h("", th);
    }

    public static void h(String str, Throwable th) {
        if (p(6)) {
            Log.e("Ads", str, th);
        }
    }

    public static void i(String str) {
        if (p(4)) {
            if (str.length() <= 4000) {
                Log.i("Ads", str);
                return;
            }
            boolean z = true;
            for (String str2 : b.l(str)) {
                if (z) {
                    Log.i("Ads", str2);
                } else {
                    Log.i("Ads-cont", str2);
                }
                z = false;
            }
        }
    }

    public static void j(String str, Throwable th) {
        if (p(4)) {
            Log.i("Ads", str, th);
        }
    }

    public static void k(String str) {
        if (p(5)) {
            if (str == null || str.length() <= 4000) {
                Log.w("Ads", str);
                return;
            }
            boolean z = true;
            for (String str2 : b.l(str)) {
                if (z) {
                    Log.w("Ads", str2);
                } else {
                    Log.w("Ads-cont", str2);
                }
                z = false;
            }
        }
    }

    public static void l(Throwable th) {
        m("", th);
    }

    public static void m(String str, Throwable th) {
        if (p(5)) {
            Log.w("Ads", str, th);
        }
    }

    public static void n(String str) {
        o(str, null);
    }

    public static void o(String str, Throwable th) {
        if (p(5)) {
            if (th != null) {
                m(c(str), th);
            } else {
                k(c(str));
            }
        }
    }

    public static boolean p(int i) {
        return i >= 5 || Log.isLoggable("Ads", i);
    }
}
