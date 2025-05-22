package com.google.android.gms.growth.ui.webview;

import android.accounts.Account;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.R;
import com.google.android.gms.growth.ui.webview.GrowthWebViewChimeraActivity;
import com.google.android.libraries.material.progress.MaterialProgressBar;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bmnj;
import defpackage.bmrr;
import defpackage.bmrs;
import defpackage.bmsc;
import defpackage.bmtl;
import defpackage.bmug;
import defpackage.bmuh;
import defpackage.bmui;
import defpackage.bmuj;
import defpackage.bmuq;
import defpackage.bmur;
import defpackage.bmvm;
import defpackage.bmvp;
import defpackage.bnei;
import defpackage.bnem;
import defpackage.bnfb;
import defpackage.dhln;
import defpackage.dhlq;
import defpackage.dhlw;
import defpackage.eluo;
import defpackage.eqgo;
import defpackage.evch;
import defpackage.fgrc;
import defpackage.flni;
import defpackage.rxx;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class GrowthWebViewChimeraActivity extends rxx {
    public static final String j = bnei.b(GrowthWebViewChimeraActivity.class);
    public static final ausn k = ausn.e(auid.GROWTH);
    private Account A;
    private bmvm B;
    public final bmtl l;
    public final bmvp m;
    public final bnfb n;
    public WebView o;
    public View p;
    public MaterialProgressBar q;
    bmuq r;
    public String s;
    public String t;
    public int u;
    public final bmsc v;
    private final bmnj w;
    private final Random x;
    private final eqgo y;
    private final bmur z;

    public GrowthWebViewChimeraActivity(bmsc bmscVar, bmnj bmnjVar, Random random, eqgo eqgoVar, bmur bmurVar, bmtl bmtlVar, bmvp bmvpVar, bnfb bnfbVar) {
        this.v = bmscVar;
        this.w = bmnjVar;
        this.x = random;
        this.y = eqgoVar;
        this.z = bmurVar;
        this.l = bmtlVar;
        this.m = bmvpVar;
        this.n = bnfbVar;
    }

    private static final void n(Uri.Builder builder, String str, String str2) {
        if (builder.build().getQueryParameter(str) == null) {
            builder.appendQueryParameter(str, str2);
        }
    }

    private final void o(int i) {
        String str = this.t;
        int i2 = this.u;
        fgrc v = evch.a.v();
        if (!v.b.L()) {
            v.U();
        }
        evch evchVar = (evch) v.b;
        bmsc bmscVar = this.v;
        evchVar.d = i - 1;
        evchVar.b |= 2;
        bmscVar.b(str, i2, v);
    }

    public static GrowthWebViewChimeraActivity provideInstance() {
        bmrs a = bmrr.a();
        flni.b(a);
        bmuh bmuhVar = new bmuh(a);
        bmug bmugVar = new bmug(a);
        bmuj bmujVar = new bmuj(a);
        bmui bmuiVar = new bmui(a);
        bmsc c = a.c();
        flni.d(c);
        bmnj b = a.b();
        Random random = new Random(System.currentTimeMillis());
        eqgo eqgoVar = (eqgo) ((bmrr) a).d.a();
        flni.d(eqgoVar);
        bmur bmurVar = new bmur(bmuhVar, bmugVar, bmujVar, bmuiVar);
        bmtl d = a.d();
        bmvp bmvpVar = new bmvp(a.d());
        bnfb f = a.f();
        flni.d(f);
        return new GrowthWebViewChimeraActivity(c, b, random, eqgoVar, bmurVar, d, bmvpVar, f);
    }

    public final void a() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            this.o.setVisibility(8);
            this.p.setVisibility(0);
            o(7);
            return;
        }
        findViewById(R.id.webview_loading).setVisibility(0);
        this.p.setVisibility(8);
        dhlw b = this.B.b(this.A, this.s);
        b.y(new dhln() { // from class: bmut
            @Override // defpackage.dhln
            public final void gB(Exception exc) {
                ((eluo) ((eluo) ((eluo) GrowthWebViewChimeraActivity.k.i()).s(exc)).ai((char) 5116)).x("Failed to set user auth cookies.");
            }
        });
        b.u(getContainerActivity(), new dhlq() { // from class: bmus
            @Override // defpackage.dhlq
            public final void gC(Object obj) {
                GrowthWebViewChimeraActivity growthWebViewChimeraActivity = GrowthWebViewChimeraActivity.this;
                growthWebViewChimeraActivity.o.loadUrl(growthWebViewChimeraActivity.s);
            }
        });
        b.r(getContainerActivity(), new dhln() { // from class: bmva
            @Override // defpackage.dhln
            public final void gB(Exception exc) {
                ((eluo) ((eluo) ((eluo) GrowthWebViewChimeraActivity.k.i()).s(exc)).ai((char) 5114)).x("Webview initialization failed.");
                GrowthWebViewChimeraActivity.this.k();
            }
        });
        o(6);
    }

    public final void k() {
        setResult(0);
        finish();
    }

    final void l() {
        setResult(-1);
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0125  */
    /* JADX WARN: Type inference failed for: r1v1, types: [bmsc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [bnfb, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(android.content.Intent r10, android.webkit.WebSettings r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.growth.ui.webview.GrowthWebViewChimeraActivity.m(android.content.Intent, android.webkit.WebSettings, boolean):void");
    }

    @Override // defpackage.rza, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onActivityResult(final int i, final int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (intent != null) {
            if (intent.getComponent() != null) {
                Objects.toString(intent.getComponent());
            }
            if (intent.getData() != null) {
                Objects.toString(intent.getData());
            }
            if (intent.getAction() != null) {
                intent.getAction();
            }
            Bundle extras = intent.getExtras();
            if (extras != null) {
                Iterator<String> it = extras.keySet().iterator();
                while (it.hasNext()) {
                    Objects.toString(extras.get(it.next()));
                }
            }
        }
        if (this.o == null) {
            return;
        }
        JSONObject jSONObject = null;
        if (intent != null && intent.getExtras() != null) {
            try {
                jSONObject = bnem.a(intent.getExtras());
            } catch (JSONException e) {
                ((eluo) ((eluo) ((eluo) k.j()).s(e)).ai((char) 5118)).x("Failed to encode intent extras to json.");
            }
        }
        final String obj = jSONObject == null ? JSONObject.NULL.toString() : jSONObject.toString();
        this.o.post(new Runnable() { // from class: bmuv
            @Override // java.lang.Runnable
            public final void run() {
                GrowthWebViewChimeraActivity.this.o.evaluateJavascript(frql.a.lK().c() + "(" + TextUtils.join(",", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj}) + ");", null);
            }
        });
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        if (this.o.canGoBack()) {
            this.o.goBack();
        } else {
            l();
        }
    }

    public void onClose(View view) {
        o(9);
        l();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019a  */
    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.growth.ui.webview.GrowthWebViewChimeraActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onPause() {
        super.onPause();
        String str = this.t;
        int i = this.u;
        fgrc v = evch.a.v();
        if (!v.b.L()) {
            v.U();
        }
        bmsc bmscVar = this.v;
        evch evchVar = (evch) v.b;
        evchVar.d = 15;
        evchVar.b |= 2;
        bmscVar.b(str, i, v);
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        super.onResume();
        String str = this.t;
        int i = this.u;
        fgrc v = evch.a.v();
        if (!v.b.L()) {
            v.U();
        }
        bmsc bmscVar = this.v;
        evch evchVar = (evch) v.b;
        evchVar.d = 16;
        evchVar.b |= 2;
        bmscVar.b(str, i, v);
    }

    public void onRetry(View view) {
        o(10);
        this.q.b();
        this.y.execute(new Runnable() { // from class: bmvh
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Thread.sleep(200L);
                } catch (InterruptedException unused) {
                }
                final GrowthWebViewChimeraActivity growthWebViewChimeraActivity = GrowthWebViewChimeraActivity.this;
                growthWebViewChimeraActivity.runOnUiThread(new Runnable() { // from class: bmuw
                    @Override // java.lang.Runnable
                    public final void run() {
                        GrowthWebViewChimeraActivity growthWebViewChimeraActivity2 = GrowthWebViewChimeraActivity.this;
                        growthWebViewChimeraActivity2.a();
                        growthWebViewChimeraActivity2.q.a();
                    }
                });
            }
        });
    }
}
