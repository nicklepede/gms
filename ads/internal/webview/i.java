package com.google.android.gms.ads.internal.webview;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public interface i extends com.google.android.gms.ads.internal.client.a, com.google.android.gms.ads.nonagon.ad.event.e, com.google.android.gms.ads.internal.js.a, ab, com.google.android.gms.ads.internal.js.l, com.google.android.gms.ads.internal.video.c {
    void destroy();

    Activity f();

    Context g();

    Context getContext();

    int getHeight();

    void getLocationOnScreen(int[] iArr);

    ViewParent getParent();

    int getWidth();

    WebViewClient h();

    VersionInfoParcel i();

    af j();

    void k();

    boolean l();

    void loadData(String str, String str2, String str3);

    void loadUrl(String str);

    n m();

    void measure(int i, int i2);

    void n();

    void o();

    void p();

    void q();

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);
}
