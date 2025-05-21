package com.google.android.gms.mobiledataplan.ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.mobiledataplan.consent.ConsentAgreementText;
import com.google.android.gms.mobiledataplan.consent.SafeHtml;
import com.google.android.gms.mobiledataplan.ui.ConsentWebView;
import defpackage.asej;
import defpackage.asot;
import defpackage.ceft;
import defpackage.cefu;
import defpackage.ceqi;
import defpackage.dwbf;
import defpackage.fqgk;
import defpackage.fqhf;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class ConsentWebView extends WebView {
    public static final asot a = asot.b("MobileDataPlan", asej.MOBILE_DATA_PLAN);
    public cefu b;
    private WebViewClient c;

    public ConsentWebView(Context context) {
        super(context);
        c(this);
    }

    public static void a(WebView webView, cefu cefuVar) {
        if (webView.canScrollVertically(1) || cefuVar == null) {
            return;
        }
        cefuVar.a();
    }

    private final void c(WebView webView) {
        ceft ceftVar = new ceft(this, new dwbf(new ArrayList()));
        this.c = ceftVar;
        webView.setWebViewClient(ceftVar);
        webView.setOnLongClickListener(new View.OnLongClickListener() { // from class: cefs
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                asot asotVar = ConsentWebView.a;
                return true;
            }
        });
        webView.setLongClickable(false);
    }

    public final void b(ConsentAgreementText consentAgreementText) {
        String str;
        SafeHtml safeHtml;
        if (TextUtils.isEmpty(fqhf.x())) {
            SafeHtml[] safeHtmlArr = consentAgreementText.b;
            if (safeHtmlArr == null || safeHtmlArr.length == 0 || (safeHtml = safeHtmlArr[0]) == null) {
                a.f(ceqi.h()).x("consent paragraph is empty");
                str = "";
            } else {
                str = safeHtml.a;
            }
        } else {
            str = fqhf.x();
        }
        loadData(Base64.encodeToString(fqgk.a.a().c() ? str.getBytes(Charset.forName("ISO-8859-1")) : str.getBytes(), 1), "text/html", "base64");
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onScrollChanged(int i, int i2, int i3, int i4) {
        a(this, this.b);
    }

    public ConsentWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(this);
    }

    public ConsentWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c(this);
    }
}
