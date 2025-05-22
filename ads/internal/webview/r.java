package com.google.android.gms.ads.internal.webview;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class r extends FrameLayout implements i {
    public final i a;
    public final com.google.android.gms.ads.internal.video.b b;
    public final AtomicBoolean c;

    /* JADX WARN: Multi-variable type inference failed */
    public r(i iVar) {
        super(iVar.getContext());
        this.c = new AtomicBoolean();
        this.a = iVar;
        this.b = new com.google.android.gms.ads.internal.video.b(iVar.g());
        addView((View) iVar);
    }

    @Override // com.google.android.gms.ads.internal.js.a
    public final void b(String str, JSONObject jSONObject) {
        this.a.b(str, jSONObject);
    }

    @Override // com.google.android.gms.ads.internal.video.c
    public final void c() {
        this.a.c();
    }

    @Override // com.google.android.gms.ads.internal.video.c
    public final void d() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.webview.i
    public final void destroy() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.js.l
    public final void e(String str, JSONObject jSONObject) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.webview.i
    public final Activity f() {
        return this.a.f();
    }

    @Override // com.google.android.gms.ads.internal.webview.i
    public final Context g() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.js.l
    public final void gl(String str) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.webview.i
    public final WebViewClient h() {
        return ((x) this.a).b;
    }

    @Override // com.google.android.gms.ads.internal.webview.i
    public final VersionInfoParcel i() {
        return ((x) this.a).a;
    }

    @Override // com.google.android.gms.ads.internal.webview.i
    public final af j() {
        return this.a.j();
    }

    @Override // com.google.android.gms.ads.internal.webview.i
    public final void k() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.webview.i
    public final boolean l() {
        return this.a.l();
    }

    @Override // com.google.android.gms.ads.internal.webview.i
    public final void loadData(String str, String str2, String str3) {
        this.a.loadData(str, "text/html", "UTF-8");
    }

    @Override // com.google.android.gms.ads.internal.webview.i
    public final void loadUrl(String str) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.webview.i
    public final n m() {
        return ((x) this.a).b;
    }

    @Override // com.google.android.gms.ads.internal.webview.i
    public final void n() {
        this.a.n();
    }

    @Override // com.google.android.gms.ads.internal.webview.i
    public final void o() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.webview.i
    public final void p() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.webview.i
    public final void q() {
        this.a.q();
    }

    @Override // android.view.View, com.google.android.gms.ads.internal.webview.i
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.ads.internal.webview.i
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.a.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.ads.internal.webview.i
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.webview.i
    public final void setWebViewClient(WebViewClient webViewClient) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.a
    public final void a() {
    }
}
