package com.google.android.gms.smartdevice.setup.ui.views;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowInsets;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.gms.R;
import com.google.android.setupdesign.GlifLayout;
import defpackage.arjx;
import defpackage.arwm;
import defpackage.arxo;
import defpackage.ddoe;
import defpackage.degl;
import defpackage.degq;
import defpackage.delf;
import defpackage.delg;
import defpackage.delh;
import defpackage.deli;
import defpackage.dell;
import defpackage.delm;
import defpackage.denq;
import defpackage.fkdk;
import defpackage.fsfh;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.Semaphore;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class AccountChallengeWebView extends LinearLayout {
    public boolean d;
    public String e;
    public String f;
    public int g;
    public ArrayList h;
    public int i;
    public Semaphore j;
    public int k;
    public String l;
    public Bundle m;
    public WebView n;
    public GlifLayout o;
    public boolean p;
    public degl q;
    private volatile ArrayList t;
    private CookieManager u;
    private View v;
    private WebViewClient w;
    private final Runnable x;
    public static final arxo a = new denq(new String[]{"Setup", "UI", "View", "AccountChallengeWebView"});
    private static final int r = R.id.glif_notice;
    public static final String b = fsfh.a.a().v();
    public static final String c = fsfh.a.a().w();
    private static final String s = fsfh.a.a().x();

    public AccountChallengeWebView(Context context) {
        super(context);
        this.h = new ArrayList();
        this.x = new dell(this);
        j();
    }

    private final void i() {
        this.k++;
        a();
    }

    private final void j() {
        if (fkdk.d()) {
            Context context = getContext();
            arwm.s(context);
            LayoutInflater cloneInContext = LayoutInflater.from(context).cloneInContext(context);
            cloneInContext.setFactory2(new arjx());
            this.v = cloneInContext.inflate(R.layout.smartdevice_account_challenge_webview, this);
        } else {
            this.v = inflate(getContext(), R.layout.smartdevice_account_challenge_webview, this);
        }
        this.u = CookieManager.getInstance();
        this.n = (WebView) this.v.findViewById(R.id.webview);
        delf delfVar = new delf(this);
        this.w = delfVar;
        this.n.setWebViewClient(delfVar);
        this.o = (GlifLayout) this.v.findViewById(r);
        d();
    }

    public final void a() {
        d();
        if (!h()) {
            new deli(this).execute(new Void[0]);
            return;
        }
        Bundle bundle = (Bundle) this.t.get(this.k);
        this.m = bundle;
        String string = bundle.getString("name");
        String string2 = this.m.getString("credential");
        String string3 = this.m.getString("url");
        this.l = string;
        if (TextUtils.isEmpty(string3)) {
            this.h.add(this.m);
            new delm(this, string, string2, this.m.getString("firstName"), this.m.getString("lastName")).execute(new Void[0]);
            return;
        }
        Uri parse = Uri.parse(string3);
        String queryParameter = parse.getQueryParameter("hl");
        String locale = Locale.getDefault().toString();
        if (!TextUtils.isEmpty(queryParameter) && !queryParameter.equals(locale)) {
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            for (String str : parse.getQueryParameterNames()) {
                if (!str.equals("hl")) {
                    clearQuery.appendQueryParameter(str, parse.getQueryParameter(str));
                }
            }
            parse = clearQuery.appendQueryParameter("hl", locale).build();
        }
        Uri.Builder buildUpon = parse.buildUpon();
        if (this.d) {
            buildUpon.appendQueryParameter(c, "1");
        }
        if (this.p) {
            buildUpon.appendQueryParameter(s, "1");
        }
        this.u.removeAllCookies(new delh(this, buildUpon.toString()));
    }

    public final void b() {
        this.j.release();
        i();
    }

    public final void c() {
        String str = this.e;
        if (str != null) {
            this.o.b(str);
        } else {
            this.o.b(getResources().getQuantityString(R.plurals.smartdevice_d2d_copying_accounts, this.t == null ? 0 : this.t.size()));
        }
        String str2 = this.f;
        if (str2 != null) {
            this.o.G(str2);
        }
        ddoe.b(getContext(), this.o, this.g);
    }

    public final void d() {
        degl deglVar = this.q;
        if (deglVar != null) {
            degq degqVar = deglVar.b;
            if (degqVar.isAdded()) {
                degqVar.x(degqVar.b);
            }
        }
        this.n.setVisibility(8);
        this.o.setImportantForAccessibility(0);
        this.o.K(true);
        this.o.z().setVisibility(0);
        this.o.y().setVisibility(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public final void e() {
        if (h()) {
            i();
        }
    }

    public final void f(ArrayList arrayList) {
        arwm.m(this.t == null, "Cannot call AccountChallengeWebView#startChallenges more than once.");
        this.t = arrayList;
        this.k = 0;
        this.m = null;
        arwm.m(!arrayList.isEmpty(), "Must have at least one account.");
        this.i = this.t.size();
        post(new delg(this));
    }

    public final void g() {
        arxo arxoVar = a;
        arxoVar.j("Acquiring semaphore.", new Object[0]);
        if (!this.j.tryAcquire()) {
            arxoVar.o("This should not happen.", new Object[0]);
        } else {
            arxoVar.j("Semaphore acquired successfully.", new Object[0]);
            post(this.x);
        }
    }

    public final boolean h() {
        return this.k < this.t.size();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.n.getLayoutParams());
        layoutParams.topMargin = systemWindowInsetTop;
        this.n.setLayoutParams(layoutParams);
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable == null) {
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("internalState"));
        this.k = bundle.getInt("index");
        this.h = bundle.getParcelableArrayList("processedAccounts");
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        a.j("onSaveInstanceState()", new Object[0]);
        Bundle bundle = new Bundle();
        bundle.putInt("index", this.k);
        bundle.putParcelableArrayList("processedAccounts", this.h);
        bundle.putParcelable("internalState", super.onSaveInstanceState());
        return bundle;
    }

    public AccountChallengeWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = new ArrayList();
        this.x = new dell(this);
        j();
    }

    public AccountChallengeWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = new ArrayList();
        this.x = new dell(this);
        j();
    }

    public AccountChallengeWebView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.h = new ArrayList();
        this.x = new dell(this);
        j();
    }
}
