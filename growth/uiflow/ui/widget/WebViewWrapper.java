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
import defpackage.asej;
import defpackage.asot;
import defpackage.bkjl;
import defpackage.bkkt;
import defpackage.bkux;
import defpackage.bkva;
import defpackage.bkvz;
import defpackage.fowd;
import defpackage.fuuw;
import defpackage.fuvg;
import defpackage.fvaf;
import defpackage.fvaq;
import defpackage.fvbo;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class WebViewWrapper extends FrameLayout implements bkvz {
    public static final asot a = asot.b("UiFlow", asej.GROWTH_UIFLOW);
    public bkjl b;
    private final fuuw c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebViewWrapper(Context context) {
        this(context, null, 0, 6, null);
        fvbo.f(context, "context");
    }

    private final WebView c() {
        Object a2 = this.c.a();
        fvbo.e(a2, "getValue(...)");
        return (WebView) a2;
    }

    @Override // defpackage.bkvz
    public final void a(bkkt bkktVar) {
        fvbo.f(bkktVar, "uiFlowFlags");
        setSaveEnabled(true);
        if (fowd.c()) {
            FrameLayout.inflate(getContext(), R.layout.webview_wrapper_bc25, this);
        } else {
            FrameLayout.inflate(getContext(), R.layout.webview_wrapper, this);
        }
    }

    public final void b(fvaq fvaqVar) {
        WebView c = c();
        WebSettings settings = c.getSettings();
        settings.setAllowContentAccess(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setSupportMultipleWindows(true);
        c.setBackgroundColor(0);
        fvaqVar.a(c);
        String url = c().getUrl();
        bkjl bkjlVar = null;
        String host = url != null ? Uri.parse(url).getHost() : null;
        c.setWebChromeClient(new bkux());
        bkjl bkjlVar2 = this.b;
        if (bkjlVar2 == null) {
            fvbo.j("clientStreamz");
        } else {
            bkjlVar = bkjlVar2;
        }
        c.setWebViewClient(new bkva(this, bkjlVar, host));
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
        } else {
            super.onRestoreInstanceState(((Bundle) parcelable).getParcelable("_parent_state"));
            b(new fvaq() { // from class: bkuu
                @Override // defpackage.fvaq
                public final Object a(Object obj) {
                    String url;
                    WebView webView = (WebView) obj;
                    asot asotVar = WebViewWrapper.a;
                    fvbo.f(webView, "$this$initializeWebView");
                    webView.restoreState((Bundle) parcelable);
                    if (Build.VERSION.SDK_INT >= 29 && (url = webView.getUrl()) != null) {
                        Uri parse = Uri.parse(url);
                        if (!fvbo.n(parse.getQueryParameter("dark"), bkuw.a(webView))) {
                            fvbo.c(parse);
                            webView.loadUrl(bkuw.b(webView, parse).toString());
                        }
                    }
                    return fuvs.a;
                }
            });
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("_parent_state", super.onSaveInstanceState());
        c().saveState(bundle);
        return bundle;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebViewWrapper(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        fvbo.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewWrapper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        fvbo.f(context, "context");
        this.c = new fuvg(new fvaf() { // from class: bkut
            @Override // defpackage.fvaf
            public final Object a() {
                return (WebView) WebViewWrapper.this.findViewById(R.id.webview);
            }
        });
    }

    public /* synthetic */ WebViewWrapper(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
