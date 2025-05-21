package com.google.android.gms.mdm.settings;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.preference.Preference;
import com.google.android.gms.R;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.armu;
import defpackage.asin;
import defpackage.asng;
import defpackage.asqh;
import defpackage.bipc;
import defpackage.bp;
import defpackage.ccwi;
import defpackage.ccxp;
import defpackage.ccxq;
import defpackage.cyrt;
import defpackage.dg;
import defpackage.ds;
import defpackage.eijx;
import defpackage.eits;
import defpackage.frte;
import defpackage.ig;
import defpackage.kly;
import defpackage.kmb;
import defpackage.qet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class AdmSettingsChimeraActivity extends qet implements kly {
    private boolean j;

    public AdmSettingsChimeraActivity() {
        super(R.layout.adm_settings_activity);
    }

    public static Intent k(Context context) {
        return asng.a(context, "com.google.android.gms.mdm.settings.FindMyDeviceSettingsActivity") == 1 ? cyrt.b(context, FindMyDeviceSettingsChimeraActivity.class) : cyrt.b(context, AdmSettingsChimeraActivity.class);
    }

    @Override // defpackage.kly
    public final void a(kmb kmbVar, Preference preference) {
        Bundle r = preference.r();
        ds l = getSupportFragmentManager().l();
        getClassLoader();
        dg b = l.b(preference.u);
        b.setArguments(r);
        b.setTargetFragment(kmbVar, 0);
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.F(R.id.find_my_device_preference_fragment_holder, b);
        bpVar.w(null);
        bpVar.a();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (asqh.g() && frte.k()) {
            getWindow().addSystemFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        }
        boolean d = new ccxq(this).d();
        this.j = d;
        if (bundle == null && d) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("show_device_admin", getIntent().getBooleanExtra("show_device_admin", false));
            bundle2.putBoolean("show_modal_request", getIntent().getBooleanExtra("show_modal_request", false));
            Class cls = (frte.o() && getIntent().getBooleanExtra("open_fmdn", false)) ? ccwi.class : ccxp.class;
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.B();
            bpVar.C(R.id.find_my_device_preference_fragment_holder, cls, bundle2);
            bpVar.a();
        }
        ig hy = hy();
        if (hy != null) {
            hy.o(true);
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId != R.id.security_apps_help) {
            if (itemId != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            if (frte.o()) {
                getOnBackPressedDispatcher().c();
            } else {
                finish();
            }
            return true;
        }
        eits l = eits.l("isMdmVisible", String.valueOf(new ccxq(this).d()));
        ThemeSettings a = asin.a();
        String str = (String) ((eijx) armu.d).a;
        GoogleHelp googleHelp = new GoogleHelp("android_security");
        googleHelp.b(this);
        googleHelp.s = a;
        googleHelp.q = Uri.parse(str);
        googleHelp.e(l);
        new bipc(this).a(googleHelp.a());
        return true;
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.j) {
            dg g = getSupportFragmentManager().g(R.id.find_my_device_preference_fragment_holder);
            if (z && (g instanceof ccxp)) {
                ((ccxp) g).R();
            }
        }
    }
}
