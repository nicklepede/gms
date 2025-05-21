package com.google.android.gms.mdm.settings;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.preference.Preference;
import com.google.android.gms.R;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.asqh;
import defpackage.bp;
import defpackage.ccwi;
import defpackage.ccxp;
import defpackage.ccxq;
import defpackage.dg;
import defpackage.ds;
import defpackage.frte;
import defpackage.frty;
import defpackage.kly;
import defpackage.kmb;
import defpackage.qgg;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class FindMyDeviceSettingsChimeraActivity extends qgg implements kly {
    private boolean j;

    @Override // defpackage.kly
    public final void a(kmb kmbVar, Preference preference) {
        Bundle r = preference.r();
        ds l = getSupportFragmentManager().l();
        getClassLoader();
        dg b = l.b((String) Objects.requireNonNull(preference.u));
        b.setArguments(r);
        b.setTargetFragment(kmbVar, 0);
        if (frty.g()) {
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

    @Override // defpackage.qgg, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
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
            if (frty.g()) {
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

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.j) {
            dg g = getSupportFragmentManager().g(R.id.content_frame);
            if (z && (g instanceof ccxp)) {
                ((ccxp) g).R();
            }
        }
    }
}
