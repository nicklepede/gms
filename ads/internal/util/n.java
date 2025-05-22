package com.google.android.gms.ads.internal.util;

import android.webkit.WebResourceResponse;
import java.io.InputStream;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class n extends p {
    @Override // com.google.android.gms.ads.internal.util.p
    public final WebResourceResponse a(String str, String str2, int i, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i, str3, map, inputStream);
    }

    @Override // com.google.android.gms.ads.internal.util.p
    public final com.google.android.gms.ads.internal.webview.n b(com.google.android.gms.ads.internal.webview.i iVar, com.google.android.gms.ads.internal.clearcut.b bVar) {
        return new com.google.android.gms.ads.internal.webview.ad(iVar, bVar);
    }
}
