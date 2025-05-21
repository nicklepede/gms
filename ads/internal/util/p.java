package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.webkit.WebResourceResponse;
import java.io.InputStream;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class p {
    public WebResourceResponse a(String str, String str2, int i, String str3, Map map, InputStream inputStream) {
        throw null;
    }

    public com.google.android.gms.ads.internal.webview.n b(com.google.android.gms.ads.internal.webview.i iVar, com.google.android.gms.ads.internal.clearcut.b bVar) {
        throw null;
    }

    public int c(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }
}
