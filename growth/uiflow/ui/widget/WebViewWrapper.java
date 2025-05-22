package com.google.android.gms.growth.uiflow.ui.widget;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import com.google.android.chimera.WebView;
import com.google.android.gms.R;
import com.google.android.gms.growth.uiflow.ui.widget.WebViewWrapper;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bmqb;
import defpackage.bmrj;
import defpackage.bnbn;
import defpackage.bnbq;
import defpackage.bncp;
import defpackage.frpg;
import defpackage.fxqu;
import defpackage.fxre;
import defpackage.fxwd;
import defpackage.fxwo;
import defpackage.fxxm;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class WebViewWrapper extends FrameLayout implements bncp {
    public static final ausn a = ausn.b("UiFlow", auid.GROWTH_UIFLOW);
    public bmqb b;
    private final fxqu c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebViewWrapper(Context context) {
        this(context, null, 0, 6, null);
        fxxm.f(context, "context");
    }

    private final WebView b() {
        Object a2 = this.c.a();
        fxxm.e(a2, "getValue(...)");
        return (WebView) a2;
    }

    public final void a(fxwo fxwoVar) {
        WebView b = b();
        WebSettings settings = b.getSettings();
        settings.setAllowContentAccess(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setSupportMultipleWindows(true);
        b.setBackgroundColor(0);
        fxwoVar.a(b);
        String url = b().getUrl();
        bmqb bmqbVar = null;
        String host = url != null ? Uri.parse(url).getHost() : null;
        b.setWebChromeClient(new bnbn());
        bmqb bmqbVar2 = this.b;
        if (bmqbVar2 == null) {
            fxxm.j("clientStreamz");
        } else {
            bmqbVar = bmqbVar2;
        }
        b.setWebViewClient(new bnbq(this, bmqbVar, host));
    }

    @Override // defpackage.bncp
    public final void g(bmrj bmrjVar) {
        fxxm.f(bmrjVar, "uiFlowFlags");
        setSaveEnabled(true);
        if (frpg.c()) {
            FrameLayout.inflate(getContext(), R.layout.webview_wrapper_bc25, this);
        } else {
            FrameLayout.inflate(getContext(), R.layout.webview_wrapper, this);
        }
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
        } else {
            super.onRestoreInstanceState(((Bundle) parcelable).getParcelable("_parent_state"));
            a(new fxwo() { // from class: bnbk
                @Override // defpackage.fxwo
                public final Object a(Object obj) {
                    String url;
                    WebView webView = (WebView) obj;
                    ausn ausnVar = WebViewWrapper.a;
                    fxxm.f(webView, "$this$initializeWebView");
                    webView.restoreState((Bundle) parcelable);
                    if (Build.VERSION.SDK_INT >= 29 && (url = webView.getUrl()) != null) {
                        Uri parse = Uri.parse(url);
                        if (!fxxm.n(parse.getQueryParameter("dark"), bnbm.a(webView))) {
                            fxxm.c(parse);
                            webView.loadUrl(bnbm.b(webView, parse).toString());
                        }
                    }
                    return fxrq.a;
                }
            });
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("_parent_state", super.onSaveInstanceState());
        b().saveState(bundle);
        return bundle;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebViewWrapper(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        fxxm.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewWrapper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        fxxm.f(context, "context");
        this.c = new fxre(new fxwd() { // from class: bnbj
            @Override // defpackage.fxwd
            public final Object a() {
                return (WebView) WebViewWrapper.this.findViewById(R.id.webview);
            }
        });
    }

    public /* synthetic */ WebViewWrapper(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
