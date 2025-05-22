package com.google.android.gms.ads.internal.scionintegration;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class e {
    public static Uri a(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = indexOf + 1;
        return Uri.parse(str.substring(0, i) + str2 + "=" + str3 + "&" + str.substring(i));
    }

    public static String b(String str, Context context) {
        String str2;
        d c = com.google.android.gms.ads.internal.c.c();
        if (c.e(context)) {
            synchronized (c.a) {
                String str3 = c.b;
                if (str3 != null) {
                    str2 = str3;
                } else {
                    c.b = (String) c.a("getGmpAppId", context);
                    str2 = c.b;
                }
            }
        } else {
            str2 = null;
        }
        String b = com.google.android.gms.ads.internal.c.c().b(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(str2)) {
            str = a(str, "gmp_app_id", str2).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(b)) ? str : a(str, "fbs_aiid", b).toString();
    }
}
