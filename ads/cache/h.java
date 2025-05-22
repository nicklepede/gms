package com.google.android.gms.ads.cache;

import android.net.Uri;
import defpackage.atzb;
import defpackage.ekvk;
import java.io.UnsupportedEncodingException;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class h {
    public static String a(String str, String str2, String str3) {
        atzb.s(str);
        atzb.s(str2);
        atzb.s(str3);
        return str.length() + "P" + str + str2.length() + "N" + str2 + str3.length() + "I" + str3;
    }

    public static String b(String str) {
        if (ekvk.c(str)) {
            return null;
        }
        try {
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter("itag");
            if (queryParameter == null) {
                List<String> pathSegments = parse.getPathSegments();
                for (int i = 1; i < pathSegments.size() - 1; i += 2) {
                    if (pathSegments.get(i).equals("itag")) {
                        return pathSegments.get(i + 1);
                    }
                }
            }
            return queryParameter;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            int i2 = com.google.android.gms.ads.internal.util.c.a;
            com.google.android.gms.ads.internal.util.client.h.k("Unable to extract itag from video url");
            return null;
        }
    }

    public static final byte[] c(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new g("unable to encode cache key as UTF-8 bytes", e);
        }
    }
}
