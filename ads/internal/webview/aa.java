package com.google.android.gms.ads.internal.webview;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class aa {
    public final z a;
    private final ab b;

    public aa(ab abVar, z zVar) {
        this.a = zVar;
        this.b = abVar;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        TextUtils.isEmpty(str);
        return "";
    }

    @JavascriptInterface
    public String getViewSignals() {
        return "";
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (!TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.m.a.post(new Runnable() { // from class: com.google.android.gms.ads.internal.webview.y
                @Override // java.lang.Runnable
                public final void run() {
                    Uri parse = Uri.parse(str);
                    n nVar = ((x) aa.this.a.a).b;
                    if (nVar != null) {
                        nVar.d(parse);
                    } else {
                        int i = com.google.android.gms.ads.internal.util.c.a;
                        com.google.android.gms.ads.internal.util.client.h.f("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                    }
                }
            });
        } else {
            int i = com.google.android.gms.ads.internal.util.c.a;
            com.google.android.gms.ads.internal.util.client.h.k("URL is empty, ignoring message");
        }
    }
}
