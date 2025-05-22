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
import defpackage.atpj;
import defpackage.aumh;
import defpackage.aura;
import defpackage.auub;
import defpackage.bktr;
import defpackage.bp;
import defpackage.cfff;
import defpackage.cfgn;
import defpackage.cfgo;
import defpackage.dbbr;
import defpackage.dg;
import defpackage.ds;
import defpackage.ekxc;
import defpackage.elgx;
import defpackage.funx;
import defpackage.ig;
import defpackage.mej;
import defpackage.mem;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class AdmSettingsChimeraActivity extends rxx implements mej {
    private boolean j;

    public AdmSettingsChimeraActivity() {
        super(R.layout.adm_settings_activity);
    }

    public static Intent k(Context context) {
        return aura.a(context, "com.google.android.gms.mdm.settings.FindMyDeviceSettingsActivity") == 1 ? dbbr.b(context, FindMyDeviceSettingsChimeraActivity.class) : dbbr.b(context, AdmSettingsChimeraActivity.class);
    }

    @Override // defpackage.mej
    public final void a(mem memVar, Preference preference) {
        Bundle r = preference.r();
        ds l = getSupportFragmentManager().l();
        getClassLoader();
        dg b = l.b(preference.u);
        b.setArguments(r);
        b.setTargetFragment(memVar, 0);
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.F(R.id.find_my_device_preference_fragment_holder, b);
        bpVar.w(null);
        bpVar.a();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (auub.g() && funx.k()) {
            getWindow().addSystemFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        }
        boolean d = new cfgo(this).d();
        this.j = d;
        if (bundle == null && d) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("show_device_admin", getIntent().getBooleanExtra("show_device_admin", false));
            bundle2.putBoolean("show_modal_request", getIntent().getBooleanExtra("show_modal_request", false));
            Class cls = (funx.o() && getIntent().getBooleanExtra("open_fmdn", false)) ? cfff.class : cfgn.class;
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.B();
            bpVar.C(R.id.find_my_device_preference_fragment_holder, cls, bundle2);
            bpVar.a();
        }
        ig hO = hO();
        if (hO != null) {
            hO.o(true);
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId != R.id.security_apps_help) {
            if (itemId != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            if (funx.o()) {
                getOnBackPressedDispatcher().c();
            } else {
                finish();
            }
            return true;
        }
        elgx l = elgx.l("isMdmVisible", String.valueOf(new cfgo(this).d()));
        ThemeSettings a = aumh.a();
        String str = (String) ((ekxc) atpj.d).a;
        GoogleHelp googleHelp = new GoogleHelp("android_security");
        googleHelp.b(this);
        googleHelp.s = a;
        googleHelp.q = Uri.parse(str);
        googleHelp.e(l);
        new bktr(this).a(googleHelp.a());
        return true;
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.j) {
            dg g = getSupportFragmentManager().g(R.id.find_my_device_preference_fragment_holder);
            if (z && (g instanceof cfgn)) {
                ((cfgn) g).R();
            }
        }
    }
}
