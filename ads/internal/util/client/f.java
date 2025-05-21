package com.google.android.gms.ads.internal.util.client;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.config.p;
import com.google.android.gms.ads.internal.flag.s;
import defpackage.aqtp;
import defpackage.aquo;
import defpackage.byhr;
import defpackage.tca;
import defpackage.tce;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class f {
    public static final Handler a = new byhr(Looper.getMainLooper());
    public static final String b = tce.class.getName();
    public static final String c = com.google.android.gms.ads.interstitial.b.class.getName();
    public static final String d = com.google.android.gms.ads.admanager.a.class.getName();
    public static final String e = com.google.android.gms.ads.admanager.b.class.getName();
    public static final String f = com.google.android.gms.ads.search.a.class.getName();
    public static final String g = tca.class.getName();
    private float h = -1.0f;

    public static String b() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return bigInteger;
    }

    public static String c(String str, String str2) {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    public static boolean g(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((String) s.d.d());
    }

    public static final int h(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, i, displayMetrics);
    }

    public static final boolean i() {
        ((Boolean) p.bI.g()).booleanValue();
        return Build.DEVICE.startsWith("generic");
    }

    public static final int j(DisplayMetrics displayMetrics, int i) {
        return Math.round(i / displayMetrics.density);
    }

    public static final int k(Context context, int i) {
        return h(context.getResources().getDisplayMetrics(), i);
    }

    public static final String l(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || i()) {
            string = "emulator";
        }
        return c(string, "MD5");
    }

    public static final boolean m(Context context) {
        return aqtp.d.m(context) == 0;
    }

    public static final void n(Context context, String str, String str2, Bundle bundle, e eVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            int i = aqtp.c;
            str = defpackage.a.W(aquo.a(context), ".251661000");
        }
        bundle.putString("js", str);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", str2);
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        eVar.a(appendQueryParameter.toString());
    }

    public static final void o(Context context, String str, Bundle bundle) {
        n(context, str, "gmob-apps", bundle, new e() { // from class: com.google.android.gms.ads.internal.util.client.c
            @Override // com.google.android.gms.ads.internal.util.client.e
            public final void a(String str2) {
                Handler handler = f.a;
                new d(str2).start();
            }
        });
    }

    private final JSONArray p(Collection collection) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            q(jSONArray, it.next());
        }
        return jSONArray;
    }

    private final void q(JSONArray jSONArray, Object obj) {
        if (obj instanceof Bundle) {
            jSONArray.put(e((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONArray.put(f((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONArray.put(p((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONArray.put(d((Object[]) obj));
        } else {
            jSONArray.put(obj);
        }
    }

    private final void r(JSONObject jSONObject, String str, Object obj) {
        Boolean[] boolArr;
        Long[] lArr;
        Double[] dArr;
        Integer[] numArr;
        if (((Boolean) p.g.g()).booleanValue()) {
            str = String.valueOf(str);
        }
        if (obj instanceof Bundle) {
            jSONObject.put(str, e((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONObject.put(str, f((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONObject.put(String.valueOf(str), p((Collection) obj));
            return;
        }
        if (obj instanceof Object[]) {
            jSONObject.put(str, p(Arrays.asList((Object[]) obj)));
            return;
        }
        int i = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            if (iArr == null) {
                numArr = new Integer[0];
            } else {
                int length = iArr.length;
                Integer[] numArr2 = new Integer[length];
                while (i < length) {
                    numArr2[i] = Integer.valueOf(iArr[i]);
                    i++;
                }
                numArr = numArr2;
            }
            jSONObject.put(str, d(numArr));
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr2 = (double[]) obj;
            if (dArr2 == null) {
                dArr = new Double[0];
            } else {
                int length2 = dArr2.length;
                Double[] dArr3 = new Double[length2];
                while (i < length2) {
                    dArr3[i] = Double.valueOf(dArr2[i]);
                    i++;
                }
                dArr = dArr3;
            }
            jSONObject.put(str, d(dArr));
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            if (jArr == null) {
                lArr = new Long[0];
            } else {
                int length3 = jArr.length;
                Long[] lArr2 = new Long[length3];
                while (i < length3) {
                    lArr2[i] = Long.valueOf(jArr[i]);
                    i++;
                }
                lArr = lArr2;
            }
            jSONObject.put(str, d(lArr));
            return;
        }
        if (!(obj instanceof boolean[])) {
            jSONObject.put(str, obj);
            return;
        }
        boolean[] zArr = (boolean[]) obj;
        if (zArr == null) {
            boolArr = new Boolean[0];
        } else {
            int length4 = zArr.length;
            Boolean[] boolArr2 = new Boolean[length4];
            while (i < length4) {
                boolArr2[i] = Boolean.valueOf(zArr[i]);
                i++;
            }
            boolArr = boolArr2;
        }
        jSONObject.put(str, d(boolArr));
    }

    public final int a(Context context, int i) {
        if (this.h < 0.0f) {
            synchronized (this) {
                if (this.h < 0.0f) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager == null) {
                        return 0;
                    }
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    defaultDisplay.getMetrics(displayMetrics);
                    this.h = displayMetrics.density;
                }
            }
        }
        return Math.round(i / this.h);
    }

    final JSONArray d(Object[] objArr) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : objArr) {
            q(jSONArray, obj);
        }
        return jSONArray;
    }

    public final JSONObject e(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            r(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public final JSONObject f(Map map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                r(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e2) {
            throw new JSONException("Could not convert map to JSON: ".concat(String.valueOf(e2.getMessage())));
        }
    }
}
