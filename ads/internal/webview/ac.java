package com.google.android.gms.ads.internal.webview;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.am;
import defpackage.btco;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ac extends n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(i iVar) {
        super(iVar);
        new com.google.android.gms.ads.internal.mraid.a(iVar, ((r) iVar).a.g(), new com.google.android.gms.ads.internal.common.b(iVar.getContext()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final WebResourceResponse g(WebView webView, String str, Map map) {
        if (!(webView instanceof i)) {
            int i = com.google.android.gms.ads.internal.util.c.a;
            com.google.android.gms.ads.internal.util.client.h.k("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        i iVar = (i) webView;
        if (!"mraid.js".equalsIgnoreCase(new File(btco.a.a(str)).getName())) {
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            return super.b(str, map);
        }
        if (iVar.m() != null) {
            final n m = iVar.m();
            synchronized (m.c) {
                m.d = true;
                com.google.android.gms.ads.internal.util.future.e.c.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.webview.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        i iVar2 = n.this.a;
                        am amVar = ((x) ((r) iVar2).a).f;
                        amVar.b = true;
                        if (amVar.a) {
                            amVar.a();
                        }
                        iVar2.n();
                    }
                });
            }
        }
        iVar.j();
        iVar.q();
        String str2 = (String) com.google.android.gms.ads.internal.config.p.k.g();
        com.google.android.gms.ads.internal.c.e();
        return com.google.android.gms.ads.internal.util.m.q(iVar.getContext(), iVar.i().a, str2);
    }
}
