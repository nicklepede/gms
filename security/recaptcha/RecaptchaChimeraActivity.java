package com.google.android.gms.security.recaptcha;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.webkit.WebSettings;
import android.widget.LinearLayout;
import com.google.android.chimera.WebView;
import com.google.android.gms.R;
import defpackage.auid;
import defpackage.aupv;
import defpackage.aupx;
import defpackage.auqy;
import defpackage.aury;
import defpackage.ausn;
import defpackage.dbbw;
import defpackage.dbcf;
import defpackage.dbch;
import defpackage.dbcj;
import defpackage.dbcn;
import defpackage.dbco;
import defpackage.dbcp;
import defpackage.dbct;
import defpackage.ryt;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class RecaptchaChimeraActivity extends ryt {
    public static final String j;
    public static final long k;
    public String l;
    public int m;
    public int n;
    public float o;
    public LinearLayout p;
    public WebView q;
    public ResultReceiver r;
    public long s;
    public boolean t;
    private dbct u = null;
    private ScheduledExecutorService v;

    static {
        ausn.b("Recaptcha", auid.SECURITY);
        j = "https://www.google.com/recaptcha/api2/mframe";
        k = TimeUnit.MINUTES.toMillis(2L);
    }

    public final dbct a() {
        if (this.u == null) {
            this.u = new dbct();
        }
        return this.u;
    }

    public final void b(Runnable runnable, long j2, TimeUnit timeUnit) {
        synchronized (this) {
            ScheduledExecutorService scheduledExecutorService = this.v;
            if (scheduledExecutorService != null) {
                ((aupv) scheduledExecutorService).schedule(runnable, j2, timeUnit);
            }
        }
    }

    public final void c(String str, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("error", str);
        bundle.putInt("errorCode", i);
        this.r.send(i, bundle);
    }

    public final void f(StringBuilder sb, String str, boolean z) {
        dbbw.l(sb, "mt", String.valueOf(System.currentTimeMillis()));
        new aupx(9, new dbcj(this, str, sb.toString(), z)).start();
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final void finish() {
        if (this.q != null) {
            g(0, 0, false);
        }
        synchronized (this) {
            ScheduledExecutorService scheduledExecutorService = this.v;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
                this.v = null;
            }
        }
        super.finish();
    }

    public final void g(int i, int i2, boolean z) {
        runOnUiThread(new dbch(this, i, i2, z));
    }

    public final void h(int i, int i2, boolean z) {
        runOnUiThread(new dbcf(this, Math.min((int) (i * this.o), this.m), Math.min((int) (i2 * this.o), this.n), z));
    }

    public final void k() {
        this.s = SystemClock.elapsedRealtime();
    }

    public final void l() {
        c("Session Timeout", 15);
        finish();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        ResultReceiver resultReceiver = (ResultReceiver) intent.getParcelableExtra("result");
        this.r = resultReceiver;
        if (resultReceiver == null) {
            finish();
            return;
        }
        this.l = intent.getStringExtra("params");
        requestWindowFeature(1);
        setContentView(R.layout.recaptcha_activity);
        this.p = (LinearLayout) findViewById(R.id.recaptcha_loading_layout);
        WebView webView = (WebView) findViewById(R.id.recaptcha_webview);
        this.q = webView;
        webView.setWebViewClient(new dbco(this));
        WebSettings settings = this.q.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setSupportZoom(false);
        settings.setDisplayZoomControls(false);
        settings.setCacheMode(2);
        this.q.addJavascriptInterface(new dbcn(this), "RecaptchaEmbedder");
        this.q.setVisibility(8);
        if (!aury.n(getResources()) && Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        this.v = new aupv(1, 9);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.o = displayMetrics.density;
        this.m = displayMetrics.widthPixels;
        this.n = (displayMetrics.heightPixels - auqy.a(getContainerActivity())) - ((int) (this.o * 20.0f));
        k();
        b(new dbcp(this), k, TimeUnit.MILLISECONDS);
        f(new StringBuilder(this.l), "frame", true);
    }
}
