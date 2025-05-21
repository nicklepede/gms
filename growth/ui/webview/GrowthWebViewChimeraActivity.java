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
import defpackage.asej;
import defpackage.asot;
import defpackage.bkgt;
import defpackage.bklb;
import defpackage.bklc;
import defpackage.bklm;
import defpackage.bkmu;
import defpackage.bknp;
import defpackage.bknq;
import defpackage.bknr;
import defpackage.bkns;
import defpackage.bknz;
import defpackage.bkoa;
import defpackage.bkov;
import defpackage.bkoy;
import defpackage.bkxr;
import defpackage.bkxv;
import defpackage.bkyk;
import defpackage.dfah;
import defpackage.dfak;
import defpackage.dfaq;
import defpackage.ejhf;
import defpackage.ensv;
import defpackage.esmu;
import defpackage.fecj;
import defpackage.fixl;
import defpackage.qet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GrowthWebViewChimeraActivity extends qet {
    public static final String j = bkxr.b(GrowthWebViewChimeraActivity.class);
    public static final asot k = asot.e(asej.GROWTH);
    private Account A;
    private bkov B;
    public final bkmu l;
    public final bkoy m;
    public final bkyk n;
    public WebView o;
    public View p;
    public MaterialProgressBar q;
    bknz r;
    public String s;
    public String t;
    public int u;
    public final bklm v;
    private final bkgt w;
    private final Random x;
    private final ensv y;
    private final bkoa z;

    public GrowthWebViewChimeraActivity(bklm bklmVar, bkgt bkgtVar, Random random, ensv ensvVar, bkoa bkoaVar, bkmu bkmuVar, bkoy bkoyVar, bkyk bkykVar) {
        this.v = bklmVar;
        this.w = bkgtVar;
        this.x = random;
        this.y = ensvVar;
        this.z = bkoaVar;
        this.l = bkmuVar;
        this.m = bkoyVar;
        this.n = bkykVar;
    }

    private static final void n(Uri.Builder builder, String str, String str2) {
        if (builder.build().getQueryParameter(str) == null) {
            builder.appendQueryParameter(str, str2);
        }
    }

    private final void o(int i) {
        String str = this.t;
        int i2 = this.u;
        fecj v = esmu.a.v();
        if (!v.b.L()) {
            v.U();
        }
        esmu esmuVar = (esmu) v.b;
        bklm bklmVar = this.v;
        esmuVar.d = i - 1;
        esmuVar.b |= 2;
        bklmVar.b(str, i2, v);
    }

    public static GrowthWebViewChimeraActivity provideInstance() {
        bklc a = bklb.a();
        fixl.b(a);
        bknq bknqVar = new bknq(a);
        bknp bknpVar = new bknp(a);
        bkns bknsVar = new bkns(a);
        bknr bknrVar = new bknr(a);
        bklm c = a.c();
        fixl.d(c);
        bkgt b = a.b();
        Random random = new Random(System.currentTimeMillis());
        ensv ensvVar = (ensv) ((bklb) a).d.a();
        fixl.d(ensvVar);
        bkoa bkoaVar = new bkoa(bknqVar, bknpVar, bknsVar, bknrVar);
        bkmu d = a.d();
        bkoy bkoyVar = new bkoy(a.d());
        bkyk f = a.f();
        fixl.d(f);
        return new GrowthWebViewChimeraActivity(c, b, random, ensvVar, bkoaVar, d, bkoyVar, f);
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
        dfaq b = this.B.b(this.A, this.s);
        b.y(new dfah() { // from class: bkoc
            @Override // defpackage.dfah
            public final void gm(Exception exc) {
                ((ejhf) ((ejhf) ((ejhf) GrowthWebViewChimeraActivity.k.i()).s(exc)).ah((char) 5103)).x("Failed to set user auth cookies.");
            }
        });
        b.u(getContainerActivity(), new dfak() { // from class: bkob
            @Override // defpackage.dfak
            public final void gn(Object obj) {
                GrowthWebViewChimeraActivity growthWebViewChimeraActivity = GrowthWebViewChimeraActivity.this;
                growthWebViewChimeraActivity.o.loadUrl(growthWebViewChimeraActivity.s);
            }
        });
        b.r(getContainerActivity(), new dfah() { // from class: bkoj
            @Override // defpackage.dfah
            public final void gm(Exception exc) {
                ((ejhf) ((ejhf) ((ejhf) GrowthWebViewChimeraActivity.k.i()).s(exc)).ah((char) 5101)).x("Webview initialization failed.");
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
    /* JADX WARN: Type inference failed for: r1v1, types: [bklm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [bkyk, java.lang.Object] */
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

    @Override // defpackage.qfw, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
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
                jSONObject = bkxv.a(intent.getExtras());
            } catch (JSONException e) {
                ((ejhf) ((ejhf) ((ejhf) k.j()).s(e)).ah((char) 5105)).x("Failed to encode intent extras to json.");
            }
        }
        final String obj = jSONObject == null ? JSONObject.NULL.toString() : jSONObject.toString();
        this.o.post(new Runnable() { // from class: bkoe
            @Override // java.lang.Runnable
            public final void run() {
                GrowthWebViewChimeraActivity.this.o.evaluateJavascript(foxi.a.a().c() + "(" + TextUtils.join(",", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj}) + ");", null);
            }
        });
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
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

    /* JADX WARN: Removed duplicated region for block: B:37:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019c  */
    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.growth.ui.webview.GrowthWebViewChimeraActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onPause() {
        super.onPause();
        String str = this.t;
        int i = this.u;
        fecj v = esmu.a.v();
        if (!v.b.L()) {
            v.U();
        }
        bklm bklmVar = this.v;
        esmu esmuVar = (esmu) v.b;
        esmuVar.d = 15;
        esmuVar.b |= 2;
        bklmVar.b(str, i, v);
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        super.onResume();
        String str = this.t;
        int i = this.u;
        fecj v = esmu.a.v();
        if (!v.b.L()) {
            v.U();
        }
        bklm bklmVar = this.v;
        esmu esmuVar = (esmu) v.b;
        esmuVar.d = 16;
        esmuVar.b |= 2;
        bklmVar.b(str, i, v);
    }

    public void onRetry(View view) {
        o(10);
        this.q.b();
        this.y.execute(new Runnable() { // from class: bkoq
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Thread.sleep(200L);
                } catch (InterruptedException unused) {
                }
                final GrowthWebViewChimeraActivity growthWebViewChimeraActivity = GrowthWebViewChimeraActivity.this;
                growthWebViewChimeraActivity.runOnUiThread(new Runnable() { // from class: bkof
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
