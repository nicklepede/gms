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
import defpackage.atmm;
import defpackage.atzb;
import defpackage.auad;
import defpackage.dfzj;
import defpackage.dgro;
import defpackage.dgrt;
import defpackage.dgwi;
import defpackage.dgwj;
import defpackage.dgwk;
import defpackage.dgwl;
import defpackage.dgwo;
import defpackage.dgwp;
import defpackage.dgyt;
import defpackage.fmtw;
import defpackage.fvae;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.Semaphore;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
    public dgro q;
    private volatile ArrayList t;
    private CookieManager u;
    private View v;
    private WebViewClient w;
    private final Runnable x;
    public static final auad a = new dgyt(new String[]{"Setup", "UI", "View", "AccountChallengeWebView"});
    private static final int r = R.id.glif_notice;
    public static final String b = fvae.a.lK().v();
    public static final String c = fvae.a.lK().w();
    private static final String s = fvae.a.lK().x();

    public AccountChallengeWebView(Context context) {
        super(context);
        this.h = new ArrayList();
        this.x = new dgwo(this);
        j();
    }

    private final void i() {
        this.k++;
        a();
    }

    private final void j() {
        if (fmtw.d()) {
            Context context = getContext();
            atzb.s(context);
            LayoutInflater cloneInContext = LayoutInflater.from(context).cloneInContext(context);
            cloneInContext.setFactory2(new atmm());
            this.v = cloneInContext.inflate(R.layout.smartdevice_account_challenge_webview, this);
        } else {
            this.v = inflate(getContext(), R.layout.smartdevice_account_challenge_webview, this);
        }
        this.u = CookieManager.getInstance();
        this.n = (WebView) this.v.findViewById(R.id.webview);
        dgwi dgwiVar = new dgwi(this);
        this.w = dgwiVar;
        this.n.setWebViewClient(dgwiVar);
        this.o = (GlifLayout) this.v.findViewById(r);
        d();
    }

    public final void a() {
        d();
        if (!h()) {
            new dgwl(this).execute(new Void[0]);
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
            new dgwp(this, string, string2, this.m.getString("firstName"), this.m.getString("lastName")).execute(new Void[0]);
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
        this.u.removeAllCookies(new dgwk(this, buildUpon.toString()));
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
        dfzj.b(getContext(), this.o, this.g);
    }

    public final void d() {
        dgro dgroVar = this.q;
        if (dgroVar != null) {
            dgrt dgrtVar = dgroVar.b;
            if (dgrtVar.isAdded()) {
                dgrtVar.x(dgrtVar.b);
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
        atzb.m(this.t == null, "Cannot call AccountChallengeWebView#startChallenges more than once.");
        this.t = arrayList;
        this.k = 0;
        this.m = null;
        atzb.m(!arrayList.isEmpty(), "Must have at least one account.");
        this.i = this.t.size();
        post(new dgwj(this));
    }

    public final void g() {
        auad auadVar = a;
        auadVar.j("Acquiring semaphore.", new Object[0]);
        if (!this.j.tryAcquire()) {
            auadVar.o("This should not happen.", new Object[0]);
        } else {
            auadVar.j("Semaphore acquired successfully.", new Object[0]);
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
        this.x = new dgwo(this);
        j();
    }

    public AccountChallengeWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = new ArrayList();
        this.x = new dgwo(this);
        j();
    }

    public AccountChallengeWebView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.h = new ArrayList();
        this.x = new dgwo(this);
        j();
    }
}
