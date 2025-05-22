package com.google.android.gms.ads.internal.webview;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class ad extends ac {
    public ad(i iVar, com.google.android.gms.ads.internal.clearcut.b bVar) {
        super(iVar);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return g(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
