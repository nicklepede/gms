package com.google.android.gms.cast.settings;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import com.google.android.gms.R;
import defpackage.ankt;
import defpackage.anku;
import defpackage.anlj;
import defpackage.annw;
import defpackage.bp;
import defpackage.ig;
import defpackage.qet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CastSettingsChimeraActivity extends qet {
    private final annw j;

    public CastSettingsChimeraActivity() {
        super(R.layout.cast_settings_activity);
        this.j = new annw("CastSettingsChimera");
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        this.j.n("onCreate CastSettingsChimeraActivity with action = %s", action);
        ig hy = hy();
        if (hy == null) {
            return;
        }
        hy.o(true);
        if (TextUtils.equals(action, "com.google.android.gms.cast.settings.CastSettingsAction")) {
            hy.A(anlj.j(this) ? getString(R.string.cast_sender_options) : getString(R.string.cast_options));
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.F(R.id.cast_settings_fragment, new anku());
            bpVar.a();
            return;
        }
        if (TextUtils.equals(action, "com.google.android.gms.cast.settings.CastSettingsDebugAction")) {
            hy.A(getString(R.string.cast_settings_debug));
            bp bpVar2 = new bp(getSupportFragmentManager());
            bpVar2.F(R.id.cast_settings_fragment, new ankt());
            bpVar2.a();
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        this.j.m("onOptionsItemSelected");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
