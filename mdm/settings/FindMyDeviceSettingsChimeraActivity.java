package com.google.android.gms.mdm.settings;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.preference.Preference;
import com.google.android.gms.R;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.auub;
import defpackage.bp;
import defpackage.cfff;
import defpackage.cfgn;
import defpackage.cfgo;
import defpackage.dg;
import defpackage.ds;
import defpackage.funx;
import defpackage.fuos;
import defpackage.mej;
import defpackage.mem;
import defpackage.rzk;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class FindMyDeviceSettingsChimeraActivity extends rzk implements mej {
    private boolean j;

    @Override // defpackage.mej
    public final void a(mem memVar, Preference preference) {
        Bundle r = preference.r();
        ds l = getSupportFragmentManager().l();
        getClassLoader();
        dg b = l.b((String) Objects.requireNonNull(preference.u));
        b.setArguments(r);
        b.setTargetFragment(memVar, 0);
        if (fuos.g()) {
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.F(R.id.content_frame, b);
            bpVar.a();
        } else {
            bp bpVar2 = new bp(getSupportFragmentManager());
            bpVar2.F(R.id.content_frame, b);
            bpVar2.w(null);
            bpVar2.a();
        }
    }

    @Override // defpackage.rzk, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
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
            if (fuos.g()) {
                bp bpVar = new bp(getSupportFragmentManager());
                bpVar.B();
                bpVar.C(R.id.content_frame, cls, bundle2);
                bpVar.a();
            } else {
                bp bpVar2 = new bp(getSupportFragmentManager());
                bpVar2.B();
                bpVar2.C(R.id.content_frame, cls, bundle2);
                bpVar2.w(null);
                bpVar2.a();
            }
        }
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.j) {
            dg g = getSupportFragmentManager().g(R.id.content_frame);
            if (z && (g instanceof cfgn)) {
                ((cfgn) g).R();
            }
        }
    }
}
