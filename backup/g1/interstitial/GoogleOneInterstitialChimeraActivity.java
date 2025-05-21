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
import defpackage.ahwd;
import defpackage.ajas;
import defpackage.aqum;
import defpackage.aqun;
import defpackage.arda;
import defpackage.arwm;
import defpackage.asmf;
import defpackage.dfah;
import defpackage.dfak;
import defpackage.dfau;
import defpackage.dfaz;
import defpackage.dwbd;
import defpackage.ejqa;
import defpackage.ejqn;
import defpackage.ensv;
import defpackage.femw;
import defpackage.flmm;
import defpackage.qfp;
import defpackage.uoh;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class GoogleOneInterstitialChimeraActivity extends qfp {
    public static final ahwd j = new ahwd("GoogleOneInterstitialChimeraActivity");
    public String k;
    public femw l;
    public dfau m;
    public View n;
    public View o;
    public WebView p;
    Button q;
    Button r;
    ajas s;
    private String t;
    private ensv u;

    private final void c() {
        dfaz dfazVar;
        final Account account;
        int length;
        f();
        if (this.u == null) {
            this.u = new asmf(Integer.MAX_VALUE, 9);
        }
        this.m = new dfau();
        try {
            Account[] p = uoh.p(this);
            String str = this.t;
            if (str != null && str.length() != 0 && (length = p.length) != 0) {
                for (int i = 0; i < length; i++) {
                    try {
                        account = p[i];
                        int i2 = ejqn.b;
                        if (ejqa.a.c(account.name, StandardCharsets.UTF_8).c() == Long.parseLong(this.t)) {
                            break;
                        }
                    } catch (NumberFormatException unused) {
                        j.f("Error while getting account.", new Object[0]);
                    }
                }
            }
            account = null;
            if (account == null) {
                arda.c(Status.d, null, this.m);
                dfazVar = this.m.a;
            } else {
                arwm.s(this.k);
                this.u.execute(new Runnable() { // from class: ajap
                    @Override // java.lang.Runnable
                    public final void run() {
                        GoogleOneInterstitialChimeraActivity googleOneInterstitialChimeraActivity = GoogleOneInterstitialChimeraActivity.this;
                        Account account2 = account;
                        try {
                            dfau dfauVar = googleOneInterstitialChimeraActivity.m;
                            eijy.a(new vbf());
                            dvni.f(googleOneInterstitialChimeraActivity);
                            dfauVar.b(vbh.e(googleOneInterstitialChimeraActivity, account2, String.format(Locale.getDefault(), "weblogin:service=gaia&continue=%s", Uri.encode(googleOneInterstitialChimeraActivity.k)), new vay(googleOneInterstitialChimeraActivity)));
                        } catch (UserRecoverableAuthException e) {
                            if (e.a() != null) {
                                googleOneInterstitialChimeraActivity.startActivityForResult(e.a(), 123);
                            } else {
                                arda.c(Status.d, null, googleOneInterstitialChimeraActivity.m);
                            }
                        } catch (IOException | unx unused2) {
                            arda.c(Status.d, null, googleOneInterstitialChimeraActivity.m);
                        }
                    }
                });
                dfazVar = this.m.a;
            }
        } catch (RemoteException | aqum | aqun unused2) {
            arda.c(Status.d, null, this.m);
            dfazVar = this.m.a;
        }
        dfazVar.z(new dfak() { // from class: ajan
            @Override // defpackage.dfak
            public final void gn(Object obj) {
                GoogleOneInterstitialChimeraActivity googleOneInterstitialChimeraActivity = GoogleOneInterstitialChimeraActivity.this;
                String str2 = (String) obj;
                if (str2 != null && str2.length() > 0) {
                    googleOneInterstitialChimeraActivity.p.loadUrl(str2);
                } else {
                    GoogleOneInterstitialChimeraActivity.j.f("Error while retrieving token", new Object[0]);
                    googleOneInterstitialChimeraActivity.b();
                }
            }
        });
        dfazVar.y(new dfah() { // from class: ajao
            @Override // defpackage.dfah
            public final void gm(Exception exc) {
                GoogleOneInterstitialChimeraActivity.j.f("Error while retrieving token", new Object[0]);
                GoogleOneInterstitialChimeraActivity.this.b();
            }
        });
    }

    private final void f() {
        this.p.setVisibility(8);
        this.n.setVisibility(8);
        this.o.setVisibility(0);
    }

    private final boolean g() {
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
            r4.t = r0
            java.lang.String r0 = r4.k
            if (r0 == 0) goto L3e
            int r0 = r0.length()
            if (r0 == 0) goto L3e
            java.lang.String r0 = r4.t
            if (r0 == 0) goto L3e
            int r0 = r0.length()
            if (r0 != 0) goto L4a
        L3e:
            ahwd r0 = com.google.android.gms.backup.g1.interstitial.GoogleOneInterstitialChimeraActivity.j
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "Could not retrieve intent extras"
            r0.f(r3, r2)
            r4.b()
        L4a:
            boolean r0 = r4.g()
            if (r0 != 0) goto L5d
            ahwd r0 = com.google.android.gms.backup.g1.interstitial.GoogleOneInterstitialChimeraActivity.j
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Not connected to network"
            r0.f(r2, r1)
            r4.b()
            return
        L5d:
            r4.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.backup.g1.interstitial.GoogleOneInterstitialChimeraActivity.a():void");
    }

    public final void b() {
        this.p.setVisibility(8);
        this.o.setVisibility(8);
        this.n.setVisibility(0);
    }

    @Override // defpackage.qfw, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 123 && i2 == -1) {
            c();
        } else {
            arda.c(Status.d, null, this.m);
        }
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        if (this.p.canGoBack() && g() && this.p.getVisibility() == 0) {
            this.p.goBack();
        } else {
            finish();
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.interstitial_webview);
        this.n = findViewById(R.id.error_layout);
        this.o = findViewById(R.id.loading_layout);
        this.p = (WebView) findViewById(R.id.webview);
        this.q = (Button) findViewById(R.id.error_try_again);
        this.r = (Button) findViewById(R.id.error_close);
        this.q.setOnClickListener(new View.OnClickListener() { // from class: ajaq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GoogleOneInterstitialChimeraActivity googleOneInterstitialChimeraActivity = GoogleOneInterstitialChimeraActivity.this;
                googleOneInterstitialChimeraActivity.n.setVisibility(8);
                googleOneInterstitialChimeraActivity.a();
            }
        });
        this.r.setOnClickListener(new View.OnClickListener() { // from class: ajar
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GoogleOneInterstitialChimeraActivity.this.finish();
            }
        });
        f();
        this.l = flmm.a.a().p();
        this.p.getSettings().setLoadsImagesAutomatically(true);
        this.p.getSettings().setJavaScriptEnabled(true);
        this.p.setScrollBarStyle(0);
        ajas ajasVar = new ajas(this);
        this.s = ajasVar;
        ajasVar.i(dwbd.a);
        this.p.setWebViewClient(this.s);
        a();
    }
}
