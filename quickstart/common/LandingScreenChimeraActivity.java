package com.google.android.gms.quickstart.common;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.gms.quickstart.common.LandingScreenChimeraActivity;
import com.google.android.setupdesign.GlifLayout;
import defpackage.atmo;
import defpackage.auad;
import defpackage.czhx;
import defpackage.efsl;
import defpackage.efsm;
import defpackage.fmya;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class LandingScreenChimeraActivity extends rxx {
    private static final auad j = new auad("QuickStart", "LandingScreenChimeraActivity");

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        setRequestedOrientation(1);
        super.onCreate(bundle);
        auad auadVar = j;
        auadVar.d("onCreate()", new Object[0]);
        Bundle extras = getIntent().getExtras();
        String string = extras != null ? extras.getString("quickstart.intent.extra.DEVICE_NAME") : null;
        if (string == null) {
            auadVar.f("Missing target device name in extras", new Object[0]);
            finish();
            return;
        }
        if (fmya.c()) {
            atmo.a(this);
        }
        czhx.a(this);
        setContentView(R.layout.quickstart_glif_fragment_v2);
        GlifLayout glifLayout = (GlifLayout) findViewById(R.id.glif_layout);
        Drawable drawable = getDrawable(R.drawable.gs_celebration_vd_theme_40);
        if (drawable != null) {
            glifLayout.I(drawable);
        }
        glifLayout.b(getString(R.string.quickstart_landing_screen_title, new Object[]{string}));
        glifLayout.G(getString(R.string.quickstart_landing_screen_description));
        efsl efslVar = (efsl) glifLayout.q(efsl.class);
        efsm efsmVar = new efsm(this);
        efsmVar.b(R.string.common_done);
        efsmVar.c = 4;
        efsmVar.b = new View.OnClickListener() { // from class: czhv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LandingScreenChimeraActivity landingScreenChimeraActivity = LandingScreenChimeraActivity.this;
                landingScreenChimeraActivity.setResult(-1);
                landingScreenChimeraActivity.finishAndRemoveTask();
            }
        };
        efslVar.b(efsmVar.a());
    }
}
