package com.google.android.gms.googlehelp.webview;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import com.google.android.chimera.WebView;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.common.HelpConfig;
import defpackage.asej;
import defpackage.asmf;
import defpackage.asng;
import defpackage.asot;
import defpackage.biqu;
import defpackage.birb;
import defpackage.birq;
import defpackage.birv;
import defpackage.bivh;
import defpackage.bivk;
import defpackage.bivr;
import defpackage.bivs;
import defpackage.biyw;
import defpackage.bjej;
import defpackage.bjfu;
import defpackage.bjgq;
import defpackage.bjhz;
import defpackage.bjib;
import defpackage.bjij;
import defpackage.ejhf;
import defpackage.ensv;
import defpackage.fomv;
import defpackage.ig;
import java.lang.ref.WeakReference;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GoogleHelpRenderingApiWebViewChimeraActivity extends biyw {
    public static final String j = "com.google.android.gms.googlehelp.webview.GoogleHelpRenderingApiWebViewActivity";
    private static final asot o = asot.b("gH_RndrApiWebViewActvty", asej.GOOGLE_HELP);
    public String k;
    public String l;
    public boolean m;
    public LinearLayout n;
    private String p;
    private boolean q;
    private biqu r;
    private boolean s;
    private ensv t;

    private final void m(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        if (asng.ad(this, intent)) {
            startActivity(intent);
            finish();
        } else {
            ((ejhf) o.j()).B("No activity can handle this URL: %s", uri);
            n();
        }
    }

    private final void n() {
        setResult(0);
        finish();
    }

    @Override // defpackage.biqn
    public final birq d() {
        throw null;
    }

    @Override // defpackage.biqn
    public final bivh e() {
        throw null;
    }

    public final void k() {
        biqu biquVar = this.r;
        boolean z = this.q;
        if (this.t == null) {
            this.t = new asmf(Integer.MAX_VALUE, 9);
        }
        ensv ensvVar = this.t;
        new bjfu(new WeakReference(this), biquVar, z, ensvVar).executeOnExecutor(ensvVar, new Void[0]);
    }

    public final void l() {
        WebView webView = new WebView(this);
        int i = bjij.a;
        webView.setWebViewClient(new bjhz(this));
        bjij.i(this, webView);
        webView.addJavascriptInterface(new bjgq(this), "activity");
        bjij.v(webView, this.p, this.l, this.k, bjej.a(this.W), this.s);
        setContentView(webView);
    }

    @Override // defpackage.biyw, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            ((ejhf) o.j()).x("The intent that started the Activity is null.");
            n();
            return;
        }
        Uri data = intent.getData();
        if (data == null) {
            ((ejhf) o.j()).x("The intent data is null.");
            n();
            return;
        }
        if (!bjib.d(data, true)) {
            ((ejhf) o.j()).B("The URL is not whitelisted to be shown: %s", data);
            m(data);
            return;
        }
        HelpConfig helpConfig = this.W;
        if (helpConfig != null) {
            bivs.c(this, helpConfig, R.style.gh_LightActivityStyle, R.style.gh_DarkActivityStyle, R.style.gh_DayNightActivityStyle);
            ig hy = hy();
            if (hy != null) {
                hy.w(bivr.b(getDrawable(2131233193), this, bivs.a(this, R.attr.ghf_greyIconColor)));
                hy.u(true != this.m ? R.string.close_button_label : R.string.gh_switch_back_to_chat_button_description);
                hy.o(true);
                hy.s(true);
            }
        }
        this.m = intent.getBooleanExtra("extra_is_from_chat", false);
        this.s = intent.getBooleanExtra("extra_is_from_sj", false);
        String uri = data.toString();
        this.p = uri;
        biqu V = biqu.V(uri, birb.a(), this.W, this.m, true != this.m ? 1 : 2);
        this.r = V;
        if (V == null) {
            ((ejhf) o.j()).B("Not a recognized support URL: %s", this.p);
            m(data);
            return;
        }
        if (!bivk.b(fomv.c())) {
            int i = birv.a;
            if ((getApplicationContext().getResources().getConfiguration().screenLayout & 15) < 3) {
                setRequestedOrientation(1);
            }
        }
        this.q = intent.getBooleanExtra("requireGcmToken", false);
        if (bundle == null) {
            if (this.r.G()) {
                this.l = getString(R.string.gh_survey);
            } else if (this.s) {
                this.l = getString(R.string.gh_top_appbar_support_label);
            } else {
                this.l = getString(R.string.common_list_apps_menu_help);
            }
            k();
        } else {
            this.k = bundle.getString("saved_instance_state_content_url");
            this.l = bundle.getString("saved_instance_state_page_title");
            l();
        }
        setTitle(this.l);
        hy().A(this.l);
        setResult(-1);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onCreateOptionsMenu(Menu menu) {
        biqu biquVar = this.r;
        if (biquVar == null || !biquVar.G()) {
            return super.onCreateOptionsMenu(menu);
        }
        if (this.W != null) {
            getMenuInflater().inflate(R.menu.gh_rendering_api_webview_activity_menu, menu);
        } else {
            getMenuInflater().inflate(R.menu.gh_rendering_api_activity_menu, menu);
        }
        bivr.r(menu.findItem(R.id.gh_rendering_api_activity_menu_close), this, bivs.a(this, R.attr.ghf_greyIconColor));
        return true;
    }

    @Override // defpackage.biyw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            finish();
            return true;
        }
        if (itemId != R.id.gh_rendering_api_activity_menu_close) {
            return super.onOptionsItemSelected(menuItem);
        }
        setResult(1);
        finish();
        return true;
    }

    @Override // defpackage.biyw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onSaveInstanceState(Bundle bundle) {
        if (getIntent() != null && getIntent().getData() != null) {
            bundle.putParcelable("EXTRA_HELP_CONFIG", this.W);
            bundle.putString("saved_instance_state_content_url", this.k);
            bundle.putString("saved_instance_state_page_title", this.l);
        }
        super.onSaveInstanceState(bundle);
    }
}
