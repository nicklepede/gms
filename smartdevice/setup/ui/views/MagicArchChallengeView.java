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
import defpackage.atmm;
import defpackage.atmr;
import defpackage.atzb;
import defpackage.auad;
import defpackage.aupv;
import defpackage.dfzj;
import defpackage.dgwu;
import defpackage.dgww;
import defpackage.dgwx;
import defpackage.dgwz;
import defpackage.dgyt;
import defpackage.efrl;
import defpackage.efuw;
import defpackage.efva;
import defpackage.efwn;
import defpackage.fuya;
import defpackage.fuyp;
import defpackage.fuzh;
import defpackage.iri;
import defpackage.ryr;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class MagicArchChallengeView extends LinearLayout {
    public static final auad a = new dgyt(new String[]{"Setup", "UI", "View", "MagicArchChallengeView"});
    public ryr b;
    public WebView c;
    public GlifLayout d;
    public View e;
    public View f;
    public boolean g;
    public dgwx h;
    public volatile List i;
    public CountDownLatch j;
    public int k;
    dgwz l;
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
        boolean k = atmr.k(getContext());
        this.p = k;
        auad auadVar = a;
        auadVar.d("isNightModeActive = %b", Boolean.valueOf(k));
        Context context = getContext();
        atzb.s(context);
        LayoutInflater cloneInContext = LayoutInflater.from(context).cloneInContext(context);
        cloneInContext.setFactory2(new atmm());
        View inflate = cloneInContext.inflate(R.layout.smartdevice_magic_arch_webview, this);
        this.c = (WebView) inflate.findViewById(R.id.webview);
        dgwz dgwzVar = new dgwz(this);
        this.l = dgwzVar;
        this.c.addJavascriptInterface(dgwzVar, "mm");
        this.o = CookieManager.getInstance();
        this.d = (GlifLayout) inflate.findViewById(R.id.glif_layout);
        this.e = inflate.findViewById(R.id.sud_layout_header);
        this.f = inflate.findViewById(R.id.sud_layout_content);
        boolean k2 = atmr.k(getContext());
        this.g = k2;
        auadVar.d("useDarkTheme = %b", Boolean.valueOf(k2));
        dgwu dgwuVar = new dgwu(this);
        this.n = dgwuVar;
        this.c.setWebViewClient(dgwuVar);
        this.c.getSettings().setJavaScriptEnabled(true);
    }

    public final void a() {
        this.c.setVisibility(8);
        this.e.setVisibility(0);
        this.d.z().setVisibility(0);
        this.d.y().setVisibility(0);
        this.d.J(true);
        if (!fuzh.i()) {
            this.d.K(true);
        }
        if (this.k >= this.i.size() && this.h != null) {
            if (fuzh.i()) {
                this.h.b(this.m);
                return;
            } else {
                aupv aupvVar = new aupv(1, 9);
                aupvVar.submit(new Runnable() { // from class: dgwq
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            MagicArchChallengeView.this.j.await(fuzh.a.lK().h(), TimeUnit.SECONDS);
                        } catch (InterruptedException e) {
                            MagicArchChallengeView.a.l(e);
                        }
                    }
                }).hD(new Runnable() { // from class: dgwr
                    @Override // java.lang.Runnable
                    public final void run() {
                        MagicArchChallengeView magicArchChallengeView = MagicArchChallengeView.this;
                        magicArchChallengeView.h.b(magicArchChallengeView.m);
                    }
                }, aupvVar);
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
        int i = iri.a;
        if (fuzh.a.lK().p()) {
            ryr ryrVar = this.b;
            int i2 = efwn.a;
            if (efrl.z(ryrVar)) {
                buildUpon.appendQueryParameter("theme", "mn");
            }
        }
        if (this.g) {
            buildUpon.appendQueryParameter("color_scheme", "dark");
        }
        this.o.removeAllCookies(new dgww(this, buildUpon.toString()));
    }

    public final void b() {
        if (!fuya.e()) {
            this.m.add((FallbackAccount) this.i.get(this.k));
        }
        this.k++;
        a();
    }

    public final void c(ryr ryrVar, dgwx dgwxVar, String str, String str2, int i, UiCustomization uiCustomization) {
        auad auadVar = a;
        auadVar.d("initializeView()", new Object[0]);
        this.d.b(str);
        this.d.G(str2);
        dfzj.b(getContext(), this.d, i);
        this.c.setVisibility(8);
        this.d.setImportantForAccessibility(0);
        boolean k = atmr.k(getContext());
        auadVar.d("isNightModeActive: %b, currentNightMode: %b", Boolean.valueOf(this.p), Boolean.valueOf(k));
        boolean z = this.p;
        if (z != k) {
            auadVar.d("fixHeaderTextColor(isNightModeActive = %b)", Boolean.valueOf(z));
            Resources resources = this.d.getResources();
            Configuration configuration = resources.getConfiguration();
            configuration.uiMode = true != z ? 16 : 32;
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
            ColorStateList valueOf = ColorStateList.valueOf(resources.getColor(R.color.sud_system_primary_text));
            ((efva) this.d.q(efva.class)).e(valueOf);
            ((efuw) this.d.q(efuw.class)).c(valueOf);
        }
        this.d.z().setVisibility(0);
        this.d.y().setVisibility(0);
        this.e.setVisibility(0);
        if (!fuzh.i()) {
            this.d.K(true);
        }
        if (fuyp.f() && uiCustomization != null) {
            dfzj.a(uiCustomization, this.d);
        }
        this.h = dgwxVar;
        this.b = ryrVar;
    }

    public final void d() {
        if (this.c.getVisibility() == 0) {
            this.c.reload();
        }
    }

    public final void e(ryr ryrVar, dgwx dgwxVar, String str, String str2, int i, List list, UiCustomization uiCustomization) {
        if (str != null) {
            this.d.b(str);
        } else {
            this.d.b(getResources().getQuantityString(R.plurals.smartdevice_d2d_copying_accounts, list == null ? 0 : list.size()));
        }
        this.d.G(str2);
        dfzj.b(getContext(), this.d, i);
        if (fuyp.f() && uiCustomization != null) {
            dfzj.a(uiCustomization, this.d);
        }
        this.h = dgwxVar;
        this.i = list;
        this.j = new CountDownLatch(list.size());
        this.b = ryrVar;
        a();
    }

    public final void f() {
        this.j.countDown();
        this.k++;
        a();
    }

    public final boolean g() {
        return this.d.ha();
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
