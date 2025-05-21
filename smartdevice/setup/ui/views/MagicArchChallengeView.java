package com.google.android.gms.smartdevice.setup.ui.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import com.google.android.gms.R;
import com.google.android.gms.smartdevice.d2d.FallbackAccount;
import com.google.android.gms.smartdevice.directtransfer.UiCustomization;
import com.google.android.gms.smartdevice.setup.ui.views.MagicArchChallengeView;
import com.google.android.setupdesign.GlifLayout;
import defpackage.arjx;
import defpackage.arkc;
import defpackage.arwm;
import defpackage.arxo;
import defpackage.asmb;
import defpackage.ddoe;
import defpackage.delr;
import defpackage.delt;
import defpackage.delu;
import defpackage.delw;
import defpackage.denq;
import defpackage.edeq;
import defpackage.edib;
import defpackage.edif;
import defpackage.edjs;
import defpackage.fsdd;
import defpackage.fsds;
import defpackage.fsek;
import defpackage.ips;
import defpackage.qfn;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class MagicArchChallengeView extends LinearLayout {
    public static final arxo a = new denq(new String[]{"Setup", "UI", "View", "MagicArchChallengeView"});
    public qfn b;
    public WebView c;
    public GlifLayout d;
    public View e;
    public View f;
    public boolean g;
    public delu h;
    public volatile List i;
    public CountDownLatch j;
    public int k;
    delw l;
    public final ArrayList m;
    private WebViewClient n;
    private CookieManager o;
    private boolean p;

    public MagicArchChallengeView(Context context) {
        super(context);
        this.m = new ArrayList();
        h();
    }

    private final void h() {
        boolean k = arkc.k(getContext());
        this.p = k;
        arxo arxoVar = a;
        arxoVar.d("isNightModeActive = %b", Boolean.valueOf(k));
        Context context = getContext();
        arwm.s(context);
        LayoutInflater cloneInContext = LayoutInflater.from(context).cloneInContext(context);
        cloneInContext.setFactory2(new arjx());
        View inflate = cloneInContext.inflate(R.layout.smartdevice_magic_arch_webview, this);
        this.c = (WebView) inflate.findViewById(R.id.webview);
        delw delwVar = new delw(this);
        this.l = delwVar;
        this.c.addJavascriptInterface(delwVar, "mm");
        this.o = CookieManager.getInstance();
        this.d = (GlifLayout) inflate.findViewById(R.id.glif_layout);
        this.e = inflate.findViewById(R.id.sud_layout_header);
        this.f = inflate.findViewById(R.id.sud_layout_content);
        boolean k2 = arkc.k(getContext());
        this.g = k2;
        arxoVar.d("useDarkTheme = %b", Boolean.valueOf(k2));
        delr delrVar = new delr(this);
        this.n = delrVar;
        this.c.setWebViewClient(delrVar);
        this.c.getSettings().setJavaScriptEnabled(true);
    }

    public final void a() {
        this.c.setVisibility(8);
        this.e.setVisibility(0);
        this.d.z().setVisibility(0);
        this.d.y().setVisibility(0);
        this.d.J(true);
        if (!fsek.i()) {
            this.d.K(true);
        }
        if (this.k >= this.i.size() && this.h != null) {
            if (fsek.i()) {
                this.h.b(this.m);
                return;
            } else {
                asmb asmbVar = new asmb(1, 9);
                asmbVar.submit(new Runnable() { // from class: deln
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            MagicArchChallengeView.this.j.await(fsek.a.a().h(), TimeUnit.SECONDS);
                        } catch (InterruptedException e) {
                            MagicArchChallengeView.a.l(e);
                        }
                    }
                }).hn(new Runnable() { // from class: delo
                    @Override // java.lang.Runnable
                    public final void run() {
                        MagicArchChallengeView magicArchChallengeView = MagicArchChallengeView.this;
                        magicArchChallengeView.h.b(magicArchChallengeView.m);
                    }
                }, asmbVar);
                return;
            }
        }
        String str = ((FallbackAccount) this.i.get(this.k)).c;
        if (TextUtils.isEmpty(str)) {
            a.m("Url is empty.", new Object[0]);
            this.k++;
            a();
            return;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon().appendQueryParameter("hl", Locale.getDefault().getLanguage()).build().buildUpon();
        buildUpon.appendQueryParameter("hide_status_bar", "1");
        int i = ips.a;
        if (fsek.a.a().o()) {
            qfn qfnVar = this.b;
            int i2 = edjs.a;
            if (edeq.z(qfnVar)) {
                buildUpon.appendQueryParameter("theme", "mn");
            }
        }
        if (this.g) {
            buildUpon.appendQueryParameter("color_scheme", "dark");
        }
        this.o.removeAllCookies(new delt(this, buildUpon.toString()));
    }

    public final void b() {
        if (!fsdd.e()) {
            this.m.add((FallbackAccount) this.i.get(this.k));
        }
        this.k++;
        a();
    }

    public final void c(qfn qfnVar, delu deluVar, String str, String str2, int i, UiCustomization uiCustomization) {
        arxo arxoVar = a;
        arxoVar.d("initializeView()", new Object[0]);
        this.d.b(str);
        this.d.G(str2);
        ddoe.b(getContext(), this.d, i);
        this.c.setVisibility(8);
        this.d.setImportantForAccessibility(0);
        boolean k = arkc.k(getContext());
        arxoVar.d("isNightModeActive: %b, currentNightMode: %b", Boolean.valueOf(this.p), Boolean.valueOf(k));
        boolean z = this.p;
        if (z != k) {
            arxoVar.d("fixHeaderTextColor(isNightModeActive = %b)", Boolean.valueOf(z));
            Resources resources = this.d.getResources();
            Configuration configuration = resources.getConfiguration();
            configuration.uiMode = true != z ? 16 : 32;
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
            ColorStateList valueOf = ColorStateList.valueOf(resources.getColor(R.color.sud_system_primary_text));
            ((edif) this.d.q(edif.class)).e(valueOf);
            ((edib) this.d.q(edib.class)).c(valueOf);
        }
        this.d.z().setVisibility(0);
        this.d.y().setVisibility(0);
        this.e.setVisibility(0);
        if (!fsek.i()) {
            this.d.K(true);
        }
        if (fsds.f() && uiCustomization != null) {
            ddoe.a(uiCustomization, this.d);
        }
        this.h = deluVar;
        this.b = qfnVar;
    }

    public final void d() {
        if (this.c.getVisibility() == 0) {
            this.c.reload();
        }
    }

    public final void e(qfn qfnVar, delu deluVar, String str, String str2, int i, List list, UiCustomization uiCustomization) {
        if (str != null) {
            this.d.b(str);
        } else {
            this.d.b(getResources().getQuantityString(R.plurals.smartdevice_d2d_copying_accounts, list == null ? 0 : list.size()));
        }
        this.d.G(str2);
        ddoe.b(getContext(), this.d, i);
        if (fsds.f() && uiCustomization != null) {
            ddoe.a(uiCustomization, this.d);
        }
        this.h = deluVar;
        this.i = list;
        this.j = new CountDownLatch(list.size());
        this.b = qfnVar;
        a();
    }

    public final void f() {
        this.j.countDown();
        this.k++;
        a();
    }

    public final boolean g() {
        return this.d.gK();
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        a.d("onRestoreInstanceState", new Object[0]);
        Bundle bundle = (Bundle) parcelable;
        Parcelable parcelable2 = bundle.getParcelable("internalState");
        if (parcelable2 != null) {
            super.onRestoreInstanceState(parcelable2);
        }
        this.k = bundle.getInt("index");
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        a.j("onSaveInstanceState()", new Object[0]);
        Bundle bundle = new Bundle();
        bundle.putInt("index", this.k);
        bundle.putParcelable("internalState", super.onSaveInstanceState());
        return bundle;
    }

    public MagicArchChallengeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = new ArrayList();
        h();
    }

    public MagicArchChallengeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = new ArrayList();
        h();
    }

    public MagicArchChallengeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.m = new ArrayList();
        h();
    }
}
