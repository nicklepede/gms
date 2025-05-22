package com.google.android.gms.adid.settings;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.R;
import com.google.android.gms.ads.internal.c;
import com.google.android.gms.ads.internal.config.p;
import com.google.android.gms.ads.internal.flag.k;
import com.google.android.gms.googlehelp.GoogleHelp;
import defpackage.apzf;
import defpackage.aswd;
import defpackage.asxc;
import defpackage.asxd;
import defpackage.asxv;
import defpackage.aszg;
import defpackage.auid;
import defpackage.auqx;
import defpackage.aura;
import defpackage.ausn;
import defpackage.auvq;
import defpackage.auwe;
import defpackage.auwh;
import defpackage.auwj;
import defpackage.auwl;
import defpackage.bktr;
import defpackage.eluo;
import defpackage.fmqe;
import defpackage.fmqj;
import defpackage.fmqy;
import defpackage.ig;
import defpackage.uxc;
import defpackage.uxd;
import defpackage.uxe;
import defpackage.uxf;
import defpackage.uxl;
import defpackage.uxm;
import defpackage.uxo;
import defpackage.uxp;
import defpackage.uxr;
import defpackage.uxs;
import defpackage.vfc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AdsSettingsChimeraActivity extends apzf implements DialogInterface.OnCancelListener, auvq, uxl, uxr, uxo {
    public static final ausn j = ausn.b("AdsSettingsActivity", auid.AD_MEASUREMENT);
    public auwl k;
    auwl l;
    public SharedPreferences m;
    auwj n;
    private boolean o = false;

    private final void t(boolean z) {
        if (v()) {
            new uxe(this).execute(Boolean.valueOf(z));
        }
    }

    private final void u() {
        this.k.toggle();
        boolean z = this.k.h;
        new uxf(this).execute(Boolean.valueOf(z));
        if (fmqe.f()) {
            Bundle bundle = new Bundle();
            bundle.putString("action", "ads_settings_lat_change");
            bundle.putString("lat", Boolean.toString(z));
            c.e().m(this, null, "gmob-apps", bundle);
        }
    }

    private final boolean v() {
        if (!((Boolean) k.a.d()).booleanValue()) {
            return false;
        }
        try {
            return Settings.Global.getInt(getContentResolver(), "development_settings_enabled", 0) != 0;
        } catch (Exception e) {
            ((eluo) ((eluo) ((eluo) j.j()).s(e)).ai((char) 437)).x("Fail to determine debug setting.");
            return false;
        }
    }

    private final void w(auwj auwjVar, int i, int i2) {
        auwjVar.l(i2);
        auwjVar.r(i2);
        auwjVar.o(i);
        auwjVar.n(this);
    }

    public final void a(asxc asxcVar) {
        Activity containerActivity = getContainerActivity();
        int i = asxcVar.a;
        if (true == asxd.f(containerActivity, i)) {
            i = 18;
        }
        Dialog a = aswd.a.a(containerActivity, i, 1, null);
        a.setCanceledOnTouchOutside(false);
        try {
            asxv.x(a, this).show(getSupportFragmentManager(), "error_dialog");
        } catch (IllegalStateException e) {
            ((eluo) ((eluo) ((eluo) j.j()).s(e)).ai((char) 436)).x("Cannot show Chimera Error Dialog.");
        }
    }

    @Override // defpackage.uxl
    public final void k() {
        new uxc(this).execute(new Void[0]);
        if (fmqe.f()) {
            Bundle bundle = new Bundle();
            bundle.putString("action", "ads_settings_reset_adid");
            c.e().m(this, null, "gmob-apps", bundle);
        }
    }

    @Override // defpackage.uxo
    public final void l() {
        this.l.toggle();
        t(this.l.h);
    }

    @Override // defpackage.uxr
    public final void m() {
        u();
    }

    public final void n(boolean z) {
        this.m.edit().putBoolean("ad_settings_cache_lat", z).apply();
    }

    public final void o(String str) {
        this.n.q(getText(R.string.ads_prefs_your_adid) + "\n" + str);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        finish();
    }

    @Override // defpackage.apzf, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        this.m = getSharedPreferences("ad_settings_cache", 0);
        p.c(getApplicationContext());
        super.onCreate(bundle);
        if (fmqy.s() && ((UiModeManager) getSystemService("uimode")).getCurrentModeType() == 4) {
            Intent intent = new Intent("com.google.android.gms.adsidentity.ACTION_ADS_IDENTITY_SETTINGS");
            intent.setPackage(getPackageName());
            startActivity(intent);
            finish();
            return;
        }
        if (fmqj.d()) {
            setTheme(R.style.Theme_GoogleMaterial_DayNight);
            if (bundle != null) {
                this.o = bundle.getBoolean("SURVEY_REQUESTED", false);
            }
            if (!this.o) {
                this.o = true;
                new vfc(getApplicationContext(), getContainerActivity(), R.id.hats_frame_layout, null).a();
            }
        }
        ig hO = hO();
        int i = auqx.a;
        if (asxd.g(this)) {
            hO.o(false);
            hO.O();
        } else {
            hO.o(true);
        }
        if (fmqe.f()) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("action", "ads_settings_page_view");
            c.e().m(this, null, "gmob-apps", bundle2);
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.ads_settings_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId != R.id.help_and_feedback) {
            if (itemId != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            finish();
            return true;
        }
        Uri parse = Uri.parse(fmqe.a.lK().q());
        GoogleHelp googleHelp = new GoogleHelp("android_ads");
        googleHelp.q = parse;
        new bktr(this).a(googleHelp.a());
        return true;
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (fmqj.d()) {
            this.o = bundle.getBoolean("SURVEY_REQUESTED", false);
        }
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        super.onResume();
        new uxd(this).execute(new Void[0]);
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (fmqj.d()) {
            bundle.putBoolean("SURVEY_REQUESTED", this.o);
        }
    }

    @Override // defpackage.auvq
    public final void p(View view, auwj auwjVar) {
        int i = auwjVar.b;
        if (i == R.string.ads_prefs_ads_personalization) {
            if (this.k.h) {
                u();
                return;
            }
            try {
                new uxs().show(getSupportFragmentManager(), "toggle_lat_dialog");
                return;
            } catch (IllegalStateException e) {
                ((eluo) ((eluo) ((eluo) j.j()).s(e)).ai((char) 439)).x("Cannot show Toggle Limit Ad Tracking Dialog.");
                return;
            }
        }
        if (i == R.string.ads_prefs_reset_adid) {
            try {
                new uxm().show(getSupportFragmentManager(), "reset_dialog");
                return;
            } catch (IllegalStateException e2) {
                ((eluo) ((eluo) ((eluo) j.j()).s(e2)).ai((char) 440)).x("Cannot show Reset Advertising Id Dialog.");
                return;
            }
        }
        if (i == R.string.ads_prefs_ads_by_google) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(fmqe.a.lK().r()));
            if (aura.ad(this, intent)) {
                startActivity(intent);
            } else {
                aszg.a(this, intent);
            }
            Bundle bundle = new Bundle();
            bundle.putString("action", "ads_settings_ads_by_google_click");
            c.e().m(this, null, "gmob-apps", bundle);
            return;
        }
        if (i == R.string.debug_logging_enable) {
            auwl auwlVar = this.l;
            if (auwlVar.h) {
                auwlVar.toggle();
                t(this.l.h);
                return;
            }
            try {
                new uxp().show(getSupportFragmentManager(), "toggle_debug_logging_dialog");
            } catch (IllegalStateException e3) {
                ((eluo) ((eluo) ((eluo) j.j()).s(e3)).ai((char) 438)).x("Cannot show Toggle Debug Logging Dialog.");
            }
        }
    }

    @Override // defpackage.apzf
    protected final void q(auwh auwhVar) {
        auwj auwjVar = new auwj(this);
        w(auwjVar, 0, R.string.ads_prefs_reset_adid);
        auwe auweVar = auwhVar.a;
        auweVar.k(auwjVar);
        auwl auwlVar = new auwl(this, false);
        w(auwlVar, 1, R.string.ads_prefs_ads_personalization);
        this.k = auwlVar;
        auwlVar.p(R.string.ads_prefs_ads_personalization_summary);
        this.k.setChecked(this.m.getBoolean("ad_settings_cache_lat", false));
        auweVar.k(this.k);
        auwj auwjVar2 = new auwj(this);
        w(auwjVar2, 2, R.string.ads_prefs_ads_by_google);
        auweVar.k(auwjVar2);
        int i = 3;
        if (v()) {
            auwl auwlVar2 = new auwl(this, false);
            w(auwlVar2, 3, R.string.debug_logging_enable);
            this.l = auwlVar2;
            auwlVar2.p(R.string.debug_logging_enable_summary);
            this.l.setChecked(this.m.getBoolean("ad_settings_cache_enable_debug_logging", false));
            auweVar.k(this.l);
            i = 4;
        }
        auwj auwjVar3 = new auwj(this);
        this.n = auwjVar3;
        auwjVar3.o(i);
        this.n.p(R.string.ads_prefs_your_adid);
        auweVar.k(this.n);
    }

    @Override // defpackage.rxx, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void setContentView(int i) {
        if (!fmqj.d()) {
            super.setContentView(i);
            return;
        }
        super.setContentView(R.layout.hats_layout);
        getLayoutInflater().inflate(i, (FrameLayout) findViewById(R.id.hats_frame_layout));
    }

    @Override // defpackage.apzf
    public final void r() {
    }
}
