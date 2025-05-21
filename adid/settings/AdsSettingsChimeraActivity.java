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
import defpackage.anxn;
import defpackage.aqto;
import defpackage.aqun;
import defpackage.aquo;
import defpackage.aqvg;
import defpackage.aqwr;
import defpackage.asej;
import defpackage.asnd;
import defpackage.asng;
import defpackage.asot;
import defpackage.asrw;
import defpackage.assk;
import defpackage.assn;
import defpackage.assp;
import defpackage.assr;
import defpackage.bipc;
import defpackage.ejhf;
import defpackage.fjzz;
import defpackage.fkae;
import defpackage.fkas;
import defpackage.ig;
import defpackage.tbc;
import defpackage.tbd;
import defpackage.tbe;
import defpackage.tbf;
import defpackage.tbl;
import defpackage.tbm;
import defpackage.tbo;
import defpackage.tbp;
import defpackage.tbr;
import defpackage.tbs;
import defpackage.tjc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AdsSettingsChimeraActivity extends anxn implements DialogInterface.OnCancelListener, asrw, tbl, tbr, tbo {
    public static final asot j = asot.b("AdsSettingsActivity", asej.AD_MEASUREMENT);
    public assr k;
    assr l;
    public SharedPreferences m;
    assp n;
    private boolean o = false;

    private final void t(boolean z) {
        if (v()) {
            new tbe(this).execute(Boolean.valueOf(z));
        }
    }

    private final void u() {
        this.k.toggle();
        boolean z = this.k.h;
        new tbf(this).execute(Boolean.valueOf(z));
        if (fjzz.f()) {
            Bundle bundle = new Bundle();
            bundle.putString("action", "ads_settings_lat_change");
            bundle.putString("lat", Boolean.toString(z));
            c.e().l(this, null, "gmob-apps", bundle);
        }
    }

    private final boolean v() {
        if (!((Boolean) k.a.d()).booleanValue()) {
            return false;
        }
        try {
            return Settings.Global.getInt(getContentResolver(), "development_settings_enabled", 0) != 0;
        } catch (Exception e) {
            ((ejhf) ((ejhf) ((ejhf) j.j()).s(e)).ah((char) 437)).x("Fail to determine debug setting.");
            return false;
        }
    }

    private final void w(assp asspVar, int i, int i2) {
        asspVar.l(i2);
        asspVar.r(i2);
        asspVar.o(i);
        asspVar.n(this);
    }

    public final void a(aqun aqunVar) {
        Activity containerActivity = getContainerActivity();
        int i = aqunVar.a;
        if (true == aquo.f(containerActivity, i)) {
            i = 18;
        }
        Dialog a = aqto.a.a(containerActivity, i, 1, null);
        a.setCanceledOnTouchOutside(false);
        try {
            aqvg.x(a, this).show(getSupportFragmentManager(), "error_dialog");
        } catch (IllegalStateException e) {
            ((ejhf) ((ejhf) ((ejhf) j.j()).s(e)).ah((char) 436)).x("Cannot show Chimera Error Dialog.");
        }
    }

    @Override // defpackage.tbl
    public final void k() {
        new tbc(this).execute(new Void[0]);
        if (fjzz.f()) {
            Bundle bundle = new Bundle();
            bundle.putString("action", "ads_settings_reset_adid");
            c.e().l(this, null, "gmob-apps", bundle);
        }
    }

    @Override // defpackage.tbo
    public final void l() {
        this.l.toggle();
        t(this.l.h);
    }

    @Override // defpackage.tbr
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

    @Override // defpackage.anxn, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        this.m = getSharedPreferences("ad_settings_cache", 0);
        p.c(getApplicationContext());
        super.onCreate(bundle);
        if (fkas.s() && ((UiModeManager) getSystemService("uimode")).getCurrentModeType() == 4) {
            Intent intent = new Intent("com.google.android.gms.adsidentity.ACTION_ADS_IDENTITY_SETTINGS");
            intent.setPackage(getPackageName());
            startActivity(intent);
            finish();
            return;
        }
        if (fkae.d()) {
            setTheme(R.style.Theme_GoogleMaterial_DayNight);
            if (bundle != null) {
                this.o = bundle.getBoolean("SURVEY_REQUESTED", false);
            }
            if (!this.o) {
                this.o = true;
                new tjc(getApplicationContext(), getContainerActivity(), R.id.hats_frame_layout, null).a();
            }
        }
        ig hy = hy();
        int i = asnd.a;
        if (aquo.g(this)) {
            hy.o(false);
            hy.O();
        } else {
            hy.o(true);
        }
        if (fjzz.f()) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("action", "ads_settings_page_view");
            c.e().l(this, null, "gmob-apps", bundle2);
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.ads_settings_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId != R.id.help_and_feedback) {
            if (itemId != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            finish();
            return true;
        }
        Uri parse = Uri.parse(fjzz.a.a().q());
        GoogleHelp googleHelp = new GoogleHelp("android_ads");
        googleHelp.q = parse;
        new bipc(this).a(googleHelp.a());
        return true;
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (fkae.d()) {
            this.o = bundle.getBoolean("SURVEY_REQUESTED", false);
        }
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        super.onResume();
        new tbd(this).execute(new Void[0]);
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (fkae.d()) {
            bundle.putBoolean("SURVEY_REQUESTED", this.o);
        }
    }

    @Override // defpackage.asrw
    public final void p(View view, assp asspVar) {
        int i = asspVar.b;
        if (i == R.string.ads_prefs_ads_personalization) {
            if (this.k.h) {
                u();
                return;
            }
            try {
                new tbs().show(getSupportFragmentManager(), "toggle_lat_dialog");
                return;
            } catch (IllegalStateException e) {
                ((ejhf) ((ejhf) ((ejhf) j.j()).s(e)).ah((char) 439)).x("Cannot show Toggle Limit Ad Tracking Dialog.");
                return;
            }
        }
        if (i == R.string.ads_prefs_reset_adid) {
            try {
                new tbm().show(getSupportFragmentManager(), "reset_dialog");
                return;
            } catch (IllegalStateException e2) {
                ((ejhf) ((ejhf) ((ejhf) j.j()).s(e2)).ah((char) 440)).x("Cannot show Reset Advertising Id Dialog.");
                return;
            }
        }
        if (i == R.string.ads_prefs_ads_by_google) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(fjzz.a.a().r()));
            if (asng.ad(this, intent)) {
                startActivity(intent);
            } else {
                aqwr.a(this, intent);
            }
            Bundle bundle = new Bundle();
            bundle.putString("action", "ads_settings_ads_by_google_click");
            c.e().l(this, null, "gmob-apps", bundle);
            return;
        }
        if (i == R.string.debug_logging_enable) {
            assr assrVar = this.l;
            if (assrVar.h) {
                assrVar.toggle();
                t(this.l.h);
                return;
            }
            try {
                new tbp().show(getSupportFragmentManager(), "toggle_debug_logging_dialog");
            } catch (IllegalStateException e3) {
                ((ejhf) ((ejhf) ((ejhf) j.j()).s(e3)).ah((char) 438)).x("Cannot show Toggle Debug Logging Dialog.");
            }
        }
    }

    @Override // defpackage.anxn
    protected final void q(assn assnVar) {
        assp asspVar = new assp(this);
        w(asspVar, 0, R.string.ads_prefs_reset_adid);
        assk asskVar = assnVar.a;
        asskVar.k(asspVar);
        assr assrVar = new assr(this, false);
        w(assrVar, 1, R.string.ads_prefs_ads_personalization);
        this.k = assrVar;
        assrVar.p(R.string.ads_prefs_ads_personalization_summary);
        this.k.setChecked(this.m.getBoolean("ad_settings_cache_lat", false));
        asskVar.k(this.k);
        assp asspVar2 = new assp(this);
        w(asspVar2, 2, R.string.ads_prefs_ads_by_google);
        asskVar.k(asspVar2);
        int i = 3;
        if (v()) {
            assr assrVar2 = new assr(this, false);
            w(assrVar2, 3, R.string.debug_logging_enable);
            this.l = assrVar2;
            assrVar2.p(R.string.debug_logging_enable_summary);
            this.l.setChecked(this.m.getBoolean("ad_settings_cache_enable_debug_logging", false));
            asskVar.k(this.l);
            i = 4;
        }
        assp asspVar3 = new assp(this);
        this.n = asspVar3;
        asspVar3.o(i);
        this.n.p(R.string.ads_prefs_your_adid);
        asskVar.k(this.n);
    }

    @Override // defpackage.qet, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void setContentView(int i) {
        if (!fkae.d()) {
            super.setContentView(i);
            return;
        }
        super.setContentView(R.layout.hats_layout);
        getLayoutInflater().inflate(i, (FrameLayout) findViewById(R.id.hats_frame_layout));
    }

    @Override // defpackage.anxn
    public final void r() {
    }
}
