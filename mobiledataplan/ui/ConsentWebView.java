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
import defpackage.auid;
import defpackage.ausn;
import defpackage.cgpa;
import defpackage.cgpb;
import defpackage.cgzp;
import defpackage.dyng;
import defpackage.ftac;
import defpackage.ftax;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class ConsentWebView extends WebView {
    public static final ausn a = ausn.b("MobileDataPlan", auid.MOBILE_DATA_PLAN);
    public cgpb b;
    private WebViewClient c;

    public ConsentWebView(Context context) {
        super(context);
        c(this);
    }

    public static void a(WebView webView, cgpb cgpbVar) {
        if (webView.canScrollVertically(1) || cgpbVar == null) {
            return;
        }
        cgpbVar.a();
    }

    private final void c(WebView webView) {
        cgpa cgpaVar = new cgpa(this, new dyng(new ArrayList()));
        this.c = cgpaVar;
        webView.setWebViewClient(cgpaVar);
        webView.setOnLongClickListener(new View.OnLongClickListener() { // from class: cgoz
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                ausn ausnVar = ConsentWebView.a;
                return true;
            }
        });
        webView.setLongClickable(false);
    }

    public final void b(ConsentAgreementText consentAgreementText) {
        String str;
        SafeHtml safeHtml;
        if (TextUtils.isEmpty(ftax.x())) {
            SafeHtml[] safeHtmlArr = consentAgreementText.b;
            if (safeHtmlArr == null || safeHtmlArr.length == 0 || (safeHtml = safeHtmlArr[0]) == null) {
                a.f(cgzp.h()).x("consent paragraph is empty");
                str = "";
            } else {
                str = safeHtml.a;
            }
        } else {
            str = ftax.x();
        }
        loadData(Base64.encodeToString(ftac.a.lK().c() ? str.getBytes(Charset.forName("ISO-8859-1")) : str.getBytes(), 1), "text/html", "base64");
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
