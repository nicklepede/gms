package com.google.android.gms.backup.g1.interstitial;

import android.accounts.Account;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.widget.Button;
import com.google.android.chimera.WebView;
import com.google.android.gms.R;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.backup.g1.interstitial.GoogleOneInterstitialChimeraActivity;
import com.google.android.gms.common.api.Status;
import defpackage.ajwt;
import defpackage.albj;
import defpackage.albk;
import defpackage.asxb;
import defpackage.asxc;
import defpackage.atfp;
import defpackage.atzb;
import defpackage.aupz;
import defpackage.dhln;
import defpackage.dhlq;
import defpackage.dhma;
import defpackage.dhmf;
import defpackage.dyne;
import defpackage.eabj;
import defpackage.ekww;
import defpackage.ekxd;
import defpackage.emdj;
import defpackage.emdw;
import defpackage.eqgo;
import defpackage.fhbp;
import defpackage.fodw;
import defpackage.ryt;
import defpackage.wkg;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class GoogleOneInterstitialChimeraActivity extends ryt {
    public static final ajwt j = new ajwt("GoogleOneInterstitialChimeraActivity");
    public String k;
    public fhbp l;
    public dhma m;
    public View n;
    public View o;
    public WebView p;
    Button q;
    Button r;
    albk s;
    private final ekww t = ekxd.a(new ekww() { // from class: albd
        @Override // defpackage.ekww
        public final Object lK() {
            return Boolean.valueOf(fodw.a.lK().ai());
        }
    });
    private String u;
    private eqgo v;
    private eabj w;

    private final void f() {
        dhmf dhmfVar;
        final Account account;
        int length;
        g();
        if (this.v == null) {
            this.v = new aupz(Integer.MAX_VALUE, 9);
        }
        this.m = new dhma();
        try {
            Account[] n = wkg.n(this);
            String str = this.u;
            if (str != null && str.length() != 0 && (length = n.length) != 0) {
                for (int i = 0; i < length; i++) {
                    try {
                        account = n[i];
                        int i2 = emdw.b;
                        if (emdj.a.c(account.name, StandardCharsets.UTF_8).c() == Long.parseLong(this.u)) {
                            break;
                        }
                    } catch (NumberFormatException unused) {
                        j.f("Error while getting account.", new Object[0]);
                    }
                }
            }
            account = null;
            if (account == null) {
                atfp.c(Status.d, null, this.m);
                dhmfVar = this.m.a;
            } else {
                atzb.s(this.k);
                this.v.execute(new Runnable() { // from class: albg
                    @Override // java.lang.Runnable
                    public final void run() {
                        GoogleOneInterstitialChimeraActivity googleOneInterstitialChimeraActivity = GoogleOneInterstitialChimeraActivity.this;
                        Account account2 = account;
                        try {
                            dhma dhmaVar = googleOneInterstitialChimeraActivity.m;
                            ekxd.a(new wxf());
                            dxyi.f(googleOneInterstitialChimeraActivity);
                            dhmaVar.b(wxh.e(googleOneInterstitialChimeraActivity, account2, String.format(Locale.getDefault(), "weblogin:service=gaia&continue=%s", Uri.encode(googleOneInterstitialChimeraActivity.k)), new wwy(googleOneInterstitialChimeraActivity)));
                        } catch (UserRecoverableAuthException e) {
                            if (e.a() != null) {
                                googleOneInterstitialChimeraActivity.startActivityForResult(e.a(), 123);
                            } else {
                                atfp.c(Status.d, null, googleOneInterstitialChimeraActivity.m);
                            }
                        } catch (IOException | wjw unused2) {
                            atfp.c(Status.d, null, googleOneInterstitialChimeraActivity.m);
                        }
                    }
                });
                dhmfVar = this.m.a;
            }
        } catch (RemoteException | asxb | asxc unused2) {
            atfp.c(Status.d, null, this.m);
            dhmfVar = this.m.a;
        }
        dhmfVar.z(new dhlq() { // from class: albe
            @Override // defpackage.dhlq
            public final void gC(Object obj) {
                GoogleOneInterstitialChimeraActivity googleOneInterstitialChimeraActivity = GoogleOneInterstitialChimeraActivity.this;
                String str2 = (String) obj;
                if (str2 != null && str2.length() > 0) {
                    googleOneInterstitialChimeraActivity.p.loadUrl(str2);
                } else {
                    GoogleOneInterstitialChimeraActivity.j.f("Error while retrieving token", new Object[0]);
                    googleOneInterstitialChimeraActivity.c();
                }
            }
        });
        dhmfVar.y(new dhln() { // from class: albf
            @Override // defpackage.dhln
            public final void gB(Exception exc) {
                GoogleOneInterstitialChimeraActivity.j.f("Error while retrieving token", new Object[0]);
                GoogleOneInterstitialChimeraActivity.this.c();
            }
        });
    }

    private final void g() {
        this.p.setVisibility(8);
        this.n.setVisibility(8);
        this.o.setVisibility(0);
    }

    private final boolean h() {
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
        return (connectivityManager == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) == null || !networkCapabilities.hasCapability(12)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        if (r0.length() != 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r4 = this;
            android.content.Intent r0 = r4.getIntent()
            r1 = 0
            if (r0 == 0) goto L3e
            android.content.Intent r0 = r4.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            if (r0 != 0) goto L12
            goto L3e
        L12:
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r2 = "url"
            java.lang.String r0 = r0.getStringExtra(r2)
            r4.k = r0
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getStringExtra(r2)
            r4.u = r0
            java.lang.String r0 = r4.k
            if (r0 == 0) goto L3e
            int r0 = r0.length()
            if (r0 == 0) goto L3e
            java.lang.String r0 = r4.u
            if (r0 == 0) goto L3e
            int r0 = r0.length()
            if (r0 != 0) goto L4a
        L3e:
            ajwt r0 = com.google.android.gms.backup.g1.interstitial.GoogleOneInterstitialChimeraActivity.j
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "Could not retrieve intent extras"
            r0.f(r3, r2)
            r4.c()
        L4a:
            boolean r0 = r4.h()
            if (r0 != 0) goto L5d
            ajwt r0 = com.google.android.gms.backup.g1.interstitial.GoogleOneInterstitialChimeraActivity.j
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Not connected to network"
            r0.f(r2, r1)
            r4.c()
            return
        L5d:
            r4.f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.backup.g1.interstitial.GoogleOneInterstitialChimeraActivity.a():void");
    }

    public final void b(int i) {
        Intent intent = new Intent();
        intent.putExtra("UPSELL_RESULT_KEY", i);
        setResult(-1, intent);
    }

    public final void c() {
        this.p.setVisibility(8);
        this.o.setVisibility(8);
        this.n.setVisibility(0);
    }

    @Override // defpackage.rza, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 123 && i2 == -1) {
            f();
        } else {
            atfp.c(Status.d, null, this.m);
        }
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        if (this.p.canGoBack() && h() && this.p.getVisibility() == 0) {
            this.p.goBack();
        } else {
            finish();
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ekww ekwwVar = this.t;
        ((Boolean) ekwwVar.lK()).booleanValue();
        setContentView(R.layout.interstitial_webview);
        this.n = findViewById(R.id.error_layout);
        this.o = findViewById(R.id.loading_layout);
        this.p = (WebView) findViewById(R.id.webview);
        this.q = (Button) findViewById(R.id.error_try_again);
        this.r = (Button) findViewById(R.id.error_close);
        this.q.setOnClickListener(new View.OnClickListener() { // from class: albh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GoogleOneInterstitialChimeraActivity googleOneInterstitialChimeraActivity = GoogleOneInterstitialChimeraActivity.this;
                googleOneInterstitialChimeraActivity.n.setVisibility(8);
                googleOneInterstitialChimeraActivity.a();
            }
        });
        this.r.setOnClickListener(new View.OnClickListener() { // from class: albi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GoogleOneInterstitialChimeraActivity.this.finish();
            }
        });
        g();
        this.l = fodw.a.lK().p();
        this.p.getSettings().setLoadsImagesAutomatically(true);
        this.p.getSettings().setJavaScriptEnabled(true);
        this.p.setScrollBarStyle(0);
        albk albkVar = new albk(this);
        this.s = albkVar;
        albkVar.i(dyne.a);
        this.p.setWebViewClient(this.s);
        if (((Boolean) ekwwVar.lK()).booleanValue()) {
            WebView webView = this.p;
            eabj eabjVar = new eabj(webView, new albj(this));
            this.w = eabjVar;
            webView.addJavascriptInterface(eabjVar, "UpsellInterface");
            if (bundle != null) {
                eabj eabjVar2 = this.w;
                eabjVar2.a = bundle.getString("familyCreationSuccessCallback");
                eabjVar2.b = bundle.getString("familyCreationFailureCallback");
                eabjVar2.c = bundle.getString("buyFlowSuccessCallback");
                eabjVar2.d = bundle.getString("buyFlowFailureCallback");
                this.p.restoreState(bundle);
            }
        }
        a();
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        eabj eabjVar = this.w;
        if (eabjVar != null) {
            bundle.putString("familyCreationSuccessCallback", eabjVar.a);
            bundle.putString("familyCreationFailureCallback", eabjVar.b);
            bundle.putString("buyFlowSuccessCallback", eabjVar.c);
            bundle.putString("buyFlowFailureCallback", eabjVar.d);
        }
    }
}
