package com.google.android.gms.ads.internal.webview;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
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
