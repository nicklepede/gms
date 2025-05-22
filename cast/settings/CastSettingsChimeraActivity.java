package com.google.android.gms.cast.settings;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import com.google.android.gms.R;
import defpackage.apmg;
import defpackage.apmh;
import defpackage.apmy;
import defpackage.appp;
import defpackage.bp;
import defpackage.ig;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CastSettingsChimeraActivity extends rxx {
    private final appp j;

    public CastSettingsChimeraActivity() {
        super(R.layout.cast_settings_activity);
        this.j = new appp("CastSettingsChimera");
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        this.j.n("onCreate CastSettingsChimeraActivity with action = %s", action);
        ig hO = hO();
        if (hO == null) {
            return;
        }
        hO.o(true);
        if (TextUtils.equals(action, "com.google.android.gms.cast.settings.CastSettingsAction")) {
            hO.A(apmy.j(this) ? getString(R.string.cast_sender_options) : getString(R.string.cast_options));
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.F(R.id.cast_settings_fragment, new apmh());
            bpVar.a();
            return;
        }
        if (TextUtils.equals(action, "com.google.android.gms.cast.settings.CastSettingsDebugAction")) {
            hO.A(getString(R.string.cast_settings_debug));
            bp bpVar2 = new bp(getSupportFragmentManager());
            bpVar2.F(R.id.cast_settings_fragment, new apmg());
            bpVar2.a();
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        this.j.m("onOptionsItemSelected");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
