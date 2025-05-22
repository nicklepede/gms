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
import defpackage.auid;
import defpackage.aupz;
import defpackage.aura;
import defpackage.ausn;
import defpackage.bkvj;
import defpackage.bkvq;
import defpackage.bkwf;
import defpackage.bkwk;
import defpackage.bkzw;
import defpackage.bkzz;
import defpackage.blag;
import defpackage.blah;
import defpackage.bldl;
import defpackage.bliy;
import defpackage.blkj;
import defpackage.bllf;
import defpackage.blmo;
import defpackage.blmq;
import defpackage.blmy;
import defpackage.eluo;
import defpackage.eqgo;
import defpackage.frfo;
import defpackage.ig;
import java.lang.ref.WeakReference;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class GoogleHelpRenderingApiWebViewChimeraActivity extends bldl {
    public static final String j = "com.google.android.gms.googlehelp.webview.GoogleHelpRenderingApiWebViewActivity";
    private static final ausn o = ausn.b("gH_RndrApiWebViewActvty", auid.GOOGLE_HELP);
    public String k;
    public String l;
    public boolean m;
    public LinearLayout n;
    private String p;
    private boolean q;
    private bkvj r;
    private boolean s;
    private eqgo t;

    private final void m(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        if (aura.ad(this, intent)) {
            startActivity(intent);
            finish();
        } else {
            ((eluo) o.j()).B("No activity can handle this URL: %s", uri);
            n();
        }
    }

    private final void n() {
        setResult(0);
        finish();
    }

    @Override // defpackage.bkvc
    public final bkwf d() {
        throw null;
    }

    @Override // defpackage.bkvc
    public final bkzw e() {
        throw null;
    }

    public final void k() {
        bkvj bkvjVar = this.r;
        boolean z = this.q;
        if (this.t == null) {
            this.t = new aupz(Integer.MAX_VALUE, 9);
        }
        eqgo eqgoVar = this.t;
        new blkj(new WeakReference(this), bkvjVar, z, eqgoVar).executeOnExecutor(eqgoVar, new Void[0]);
    }

    public final void l() {
        WebView webView = new WebView(this);
        int i = blmy.a;
        webView.setWebViewClient(new blmo(this));
        blmy.i(this, webView);
        webView.addJavascriptInterface(new bllf(this), "activity");
        blmy.v(webView, this.p, this.l, this.k, bliy.a(this.W), this.s);
        setContentView(webView);
    }

    @Override // defpackage.bldl, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            ((eluo) o.j()).x("The intent that started the Activity is null.");
            n();
            return;
        }
        Uri data = intent.getData();
        if (data == null) {
            ((eluo) o.j()).x("The intent data is null.");
            n();
            return;
        }
        if (!blmq.d(data, true)) {
            ((eluo) o.j()).B("The URL is not whitelisted to be shown: %s", data);
            m(data);
            return;
        }
        HelpConfig helpConfig = this.W;
        if (helpConfig != null) {
            blah.c(this, helpConfig, R.style.gh_LightActivityStyle, R.style.gh_DarkActivityStyle, R.style.gh_DayNightActivityStyle);
            ig hO = hO();
            if (hO != null) {
                hO.w(blag.b(getDrawable(2131233259), this, blah.a(this, R.attr.ghf_greyIconColor)));
                hO.u(true != this.m ? R.string.close_button_label : R.string.gh_switch_back_to_chat_button_description);
                hO.o(true);
                hO.s(true);
            }
        }
        this.m = intent.getBooleanExtra("extra_is_from_chat", false);
        this.s = intent.getBooleanExtra("extra_is_from_sj", false);
        String uri = data.toString();
        this.p = uri;
        bkvj V = bkvj.V(uri, bkvq.a(), this.W, this.m, true != this.m ? 1 : 2);
        this.r = V;
        if (V == null) {
            ((eluo) o.j()).B("Not a recognized support URL: %s", this.p);
            m(data);
            return;
        }
        if (!bkzz.b(frfo.c())) {
            int i = bkwk.a;
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
        hO().A(this.l);
        setResult(-1);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onCreateOptionsMenu(Menu menu) {
        bkvj bkvjVar = this.r;
        if (bkvjVar == null || !bkvjVar.G()) {
            return super.onCreateOptionsMenu(menu);
        }
        if (this.W != null) {
            getMenuInflater().inflate(R.menu.gh_rendering_api_webview_activity_menu, menu);
        } else {
            getMenuInflater().inflate(R.menu.gh_rendering_api_activity_menu, menu);
        }
        blag.r(menu.findItem(R.id.gh_rendering_api_activity_menu_close), this, blah.a(this, R.attr.ghf_greyIconColor));
        return true;
    }

    @Override // defpackage.bldl, com.google.android.chimera.android.Activity, defpackage.rtn
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

    @Override // defpackage.bldl, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onSaveInstanceState(Bundle bundle) {
        if (getIntent() != null && getIntent().getData() != null) {
            bundle.putParcelable("EXTRA_HELP_CONFIG", this.W);
            bundle.putString("saved_instance_state_content_url", this.k);
            bundle.putString("saved_instance_state_page_title", this.l);
        }
        super.onSaveInstanceState(bundle);
    }
}
