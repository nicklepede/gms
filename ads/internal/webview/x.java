package com.google.android.gms.ads.internal.webview;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.am;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.lth;
import defpackage.luc;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class x extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, i {
    public static final /* synthetic */ int h = 0;
    public final VersionInfoParcel a;
    public n b;
    public com.google.android.gms.ads.internal.csi.h c;
    public com.google.android.gms.ads.internal.csi.h d;
    public com.google.android.gms.ads.internal.csi.i e;
    public am f;
    public final com.google.android.gms.ads.internal.clearcut.b g;
    private final ae i;
    private final DisplayMetrics j;
    private af k;
    private final String l;
    private boolean m;
    private Boolean n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private final WindowManager u;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0131, code lost:
    
        if (r1 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected x(com.google.android.gms.ads.internal.webview.ae r4, com.google.android.gms.ads.internal.webview.af r5, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r6, com.google.android.gms.ads.internal.clearcut.b r7) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.webview.x.<init>(com.google.android.gms.ads.internal.webview.ae, com.google.android.gms.ads.internal.webview.af, com.google.android.gms.ads.internal.util.client.VersionInfoParcel, com.google.android.gms.ads.internal.clearcut.b):void");
    }

    private final synchronized void B() {
        int i = com.google.android.gms.ads.internal.util.c.a;
        com.google.android.gms.ads.internal.util.client.h.d("Enabling hardware acceleration on an AdView.");
    }

    private final synchronized void C() {
        if (this.o) {
            return;
        }
        this.o = true;
        com.google.android.gms.ads.internal.c.d().h.decrementAndGet();
    }

    private final void D() {
        com.google.android.gms.ads.internal.csi.b a;
        com.google.android.gms.ads.internal.csi.i iVar = this.e;
        if (iVar == null || (a = com.google.android.gms.ads.internal.c.d().a()) == null) {
            return;
        }
        a.a.offer(iVar.b);
    }

    private final synchronized void E() {
        Boolean bool;
        com.google.android.gms.ads.internal.state.e d = com.google.android.gms.ads.internal.c.d();
        synchronized (d.a) {
            bool = d.g;
        }
        this.n = bool;
        if (bool == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                y(true);
            } catch (IllegalStateException unused) {
                y(false);
            }
        }
    }

    private final synchronized void F() {
        try {
            com.google.android.gms.ads.internal.util.m.a.post(new Runnable() { // from class: com.google.android.gms.ads.internal.webview.t
                @Override // java.lang.Runnable
                public final void run() {
                    x.this.A();
                }
            });
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.c.d().d(th, "AdWebViewImpl.loadUrlUnsafe");
            int i = com.google.android.gms.ads.internal.util.c.a;
            com.google.android.gms.ads.internal.util.client.h.m("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final void G() {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", "0");
        t("onAdVisibilityChanged", hashMap);
    }

    public final /* synthetic */ void A() {
        super.loadUrl("about:blank");
    }

    @Override // com.google.android.gms.ads.internal.js.a
    public final void b(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        String concat = "Dispatching AFMA event: ".concat(sb.toString());
        int i = com.google.android.gms.ads.internal.util.c.a;
        com.google.android.gms.ads.internal.util.client.h.d(concat);
        u(sb.toString());
    }

    @Override // com.google.android.gms.ads.internal.video.c
    public final synchronized void c() {
    }

    @Override // com.google.android.gms.ads.internal.video.c
    public final synchronized void d() {
    }

    @Override // android.webkit.WebView, com.google.android.gms.ads.internal.webview.i
    public final synchronized void destroy() {
        D();
        am amVar = this.f;
        amVar.b = false;
        amVar.b();
        this.b.c();
        setOnClickListener(null);
        setOnTouchListener(null);
        if (this.m) {
            return;
        }
        com.google.android.gms.ads.internal.c.h().a();
        this.m = true;
        if (!((Boolean) com.google.android.gms.ads.internal.config.p.bu.g()).booleanValue()) {
            k();
            return;
        }
        Activity f = f();
        if (f == null || !f.isDestroyed()) {
            F();
        } else {
            k();
        }
    }

    @Override // com.google.android.gms.ads.internal.js.l
    public final void e(String str, JSONObject jSONObject) {
        throw null;
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(final String str, final ValueCallback valueCallback) {
        if (l()) {
            int i = com.google.android.gms.ads.internal.util.c.a;
            com.google.android.gms.ads.internal.util.client.h.n("#004 The webview is destroyed. Ignoring action.");
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.config.p.bv.g()).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            com.google.android.gms.ads.internal.util.future.e.c.submit(new Runnable() { // from class: com.google.android.gms.ads.internal.webview.s
                @Override // java.lang.Runnable
                public final void run() {
                    x.this.v(str, valueCallback);
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.webview.i
    public final Activity f() {
        return this.i.a;
    }

    @Override // com.google.android.gms.ads.internal.js.l
    public final void fW(String str) {
        throw null;
    }

    protected final void finalize() {
        try {
            synchronized (this) {
                if (!this.m) {
                    this.b.c();
                    com.google.android.gms.ads.internal.c.h().a();
                    C();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.ads.internal.webview.i
    public final Context g() {
        return this.i.c;
    }

    @Override // com.google.android.gms.ads.internal.webview.i
    public final WebViewClient h() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.webview.i
    public final VersionInfoParcel i() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.internal.webview.i
    public final synchronized af j() {
        return this.k;
    }

    @Override // com.google.android.gms.ads.internal.webview.i
    public final synchronized void k() {
        C();
        com.google.android.gms.ads.internal.util.m.a.post(new w(this));
    }

    @Override // com.google.android.gms.ads.internal.webview.i
    public final synchronized boolean l() {
        return this.m;
    }

    @Override // android.webkit.WebView, com.google.android.gms.ads.internal.webview.i
    public final synchronized void loadData(String str, String str2, String str3) {
        if (!l()) {
            super.loadData(str, str2, str3);
        } else {
            int i = com.google.android.gms.ads.internal.util.c.a;
            com.google.android.gms.ads.internal.util.client.h.k("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (!l()) {
                super.loadDataWithBaseURL(str, str2, str3, str4, str5);
            } else {
                int i = com.google.android.gms.ads.internal.util.c.a;
                com.google.android.gms.ads.internal.util.client.h.k("#004 The webview is destroyed. Ignoring action.");
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.ads.internal.webview.i
    public final synchronized void loadUrl(final String str) {
        if (l()) {
            int i = com.google.android.gms.ads.internal.util.c.a;
            com.google.android.gms.ads.internal.util.client.h.k("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            com.google.android.gms.ads.internal.util.m.a.post(new Runnable() { // from class: com.google.android.gms.ads.internal.webview.v
                @Override // java.lang.Runnable
                public final void run() {
                    x.this.w(str);
                }
            });
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.c.d().d(th, "AdWebViewImpl.loadUrl");
            int i2 = com.google.android.gms.ads.internal.util.c.a;
            com.google.android.gms.ads.internal.util.client.h.m("Could not call loadUrl. ", th);
        }
    }

    @Override // com.google.android.gms.ads.internal.webview.i
    public final /* synthetic */ n m() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.internal.webview.i
    public final synchronized void n() {
    }

    @Override // com.google.android.gms.ads.internal.webview.i
    public final synchronized void o() {
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!l()) {
            am amVar = this.f;
            amVar.a = true;
            if (amVar.b) {
                amVar.a();
            }
        }
        n nVar = this.b;
        if (nVar != null) {
            nVar.f();
        }
        G();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        synchronized (this) {
            if (!l()) {
                am amVar = this.f;
                amVar.a = false;
                amVar.b();
            }
            super.onDetachedFromWindow();
        }
        G();
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) com.google.android.gms.ads.internal.config.p.by.g()).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            com.google.android.gms.ads.internal.c.e();
            com.google.android.gms.ads.internal.util.m.r(getContext(), intent);
        } catch (ActivityNotFoundException e) {
            String i = defpackage.a.i(str4, str, "Couldn't find an Activity to view url/mimetype: ", " / ");
            int i2 = com.google.android.gms.ads.internal.util.c.a;
            com.google.android.gms.ads.internal.util.client.h.d(i);
            com.google.android.gms.ads.internal.c.d().d(e, "AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (l()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean z;
        int i;
        int i2;
        n nVar = this.b;
        synchronized (nVar.c) {
            z = nVar.d;
        }
        if (!z) {
            this.b.f();
            return;
        }
        com.google.android.gms.ads.internal.client.u.b();
        DisplayMetrics displayMetrics = this.j;
        int j = com.google.android.gms.ads.internal.util.client.f.j(displayMetrics, displayMetrics.widthPixels);
        com.google.android.gms.ads.internal.client.u.b();
        int j2 = com.google.android.gms.ads.internal.util.client.f.j(displayMetrics, displayMetrics.heightPixels);
        Activity f = f();
        if (f == null || f.getWindow() == null) {
            i = j;
            i2 = j2;
        } else {
            com.google.android.gms.ads.internal.c.e();
            int[] o = com.google.android.gms.ads.internal.util.m.o(f);
            com.google.android.gms.ads.internal.client.u.b();
            int j3 = com.google.android.gms.ads.internal.util.client.f.j(displayMetrics, o[0]);
            com.google.android.gms.ads.internal.client.u.b();
            i2 = com.google.android.gms.ads.internal.util.client.f.j(displayMetrics, o[1]);
            i = j3;
        }
        com.google.android.gms.ads.internal.c.e();
        int rotation = this.u.getDefaultDisplay().getRotation();
        if (this.q == j && this.p == j2 && this.r == i && this.s == i2 && (!((Boolean) com.google.android.gms.ads.internal.config.p.m.g()).booleanValue() || this.t == rotation)) {
            return;
        }
        if (this.q == j && this.p == j2) {
            ((Boolean) com.google.android.gms.ads.internal.config.p.m.g()).booleanValue();
        }
        this.q = j;
        this.p = j2;
        this.r = i;
        this.s = i2;
        this.t = rotation;
        new com.google.android.gms.ads.internal.mraid.b(this).b(j, j2, i, i2, displayMetrics.density, rotation);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected final synchronized void onMeasure(int i, int i2) {
        if (l()) {
            setMeasuredDimension(0, 0);
        } else {
            isInEditMode();
            super.onMeasure(i, i2);
        }
    }

    @Override // android.webkit.WebView
    public final void onPause() {
        if (l()) {
            return;
        }
        try {
            super.onPause();
            if (((Boolean) com.google.android.gms.ads.internal.config.p.bU.g()).booleanValue() && luc.a("MUTE_AUDIO")) {
                int i = com.google.android.gms.ads.internal.util.c.a;
                com.google.android.gms.ads.internal.util.client.h.d("Muting webview");
                lth.d(this, true);
            }
        } catch (Exception e) {
            int i2 = com.google.android.gms.ads.internal.util.c.a;
            com.google.android.gms.ads.internal.util.client.h.h("Could not pause webview.", e);
            if (((Boolean) com.google.android.gms.ads.internal.config.p.bV.g()).booleanValue()) {
                com.google.android.gms.ads.internal.c.d().d(e, "AdWebViewImpl.onPause");
            }
        }
    }

    @Override // android.webkit.WebView
    public final void onResume() {
        if (l()) {
            return;
        }
        try {
            super.onResume();
            if (((Boolean) com.google.android.gms.ads.internal.config.p.bU.g()).booleanValue() && luc.a("MUTE_AUDIO")) {
                int i = com.google.android.gms.ads.internal.util.c.a;
                com.google.android.gms.ads.internal.util.client.h.d("Unmuting webview");
                lth.d(this, false);
            }
        } catch (Exception e) {
            int i2 = com.google.android.gms.ads.internal.util.c.a;
            com.google.android.gms.ads.internal.util.client.h.h("Could not resume webview.", e);
            if (((Boolean) com.google.android.gms.ads.internal.config.p.bV.g()).booleanValue()) {
                com.google.android.gms.ads.internal.c.d().d(e, "AdWebViewImpl.onResume");
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.config.p.ae.g()).booleanValue()) {
            synchronized (this.b.c) {
            }
        }
        this.b.f();
        if (l()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.google.android.gms.ads.internal.webview.i
    public final synchronized void p() {
    }

    @Override // com.google.android.gms.ads.internal.webview.i
    public final synchronized void q() {
    }

    final synchronized Boolean r() {
        return this.n;
    }

    @Override // android.webkit.WebView, com.google.android.gms.ads.internal.webview.i
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof n) {
            this.b = (n) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (l()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            int i = com.google.android.gms.ads.internal.util.c.a;
            com.google.android.gms.ads.internal.util.client.h.h("Could not stop loading webview.", e);
        }
    }

    public final void t(String str, Map map) {
        try {
            b(str, com.google.android.gms.ads.internal.client.u.b().f(map));
        } catch (JSONException unused) {
            int i = com.google.android.gms.ads.internal.util.c.a;
            com.google.android.gms.ads.internal.util.client.h.k("Could not convert parameters to JSON.");
        }
    }

    public final void u(String str) {
        if (r() == null) {
            E();
        }
        if (r().booleanValue()) {
            z(str);
        } else {
            x("javascript:".concat(str));
        }
    }

    public final /* synthetic */ void v(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    public final /* synthetic */ void w(String str) {
        super.loadUrl(str);
    }

    protected final synchronized void x(String str) {
        if (!l()) {
            loadUrl(str);
        } else {
            int i = com.google.android.gms.ads.internal.util.c.a;
            com.google.android.gms.ads.internal.util.client.h.k("#004 The webview is destroyed. Ignoring action.");
        }
    }

    final void y(Boolean bool) {
        synchronized (this) {
            this.n = bool;
        }
        com.google.android.gms.ads.internal.state.e d = com.google.android.gms.ads.internal.c.d();
        synchronized (d.a) {
            d.g = bool;
        }
    }

    protected final synchronized void z(String str) {
        if (!l()) {
            evaluateJavascript(str, null);
        } else {
            int i = com.google.android.gms.ads.internal.util.c.a;
            com.google.android.gms.ads.internal.util.client.h.k("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.ads.internal.client.a
    public final void a() {
    }
}
