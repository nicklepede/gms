package com.google.android.gms.quickstart.common;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.gms.quickstart.common.LandingScreenChimeraActivity;
import com.google.android.setupdesign.GlifLayout;
import defpackage.arjz;
import defpackage.arxo;
import defpackage.cwxz;
import defpackage.edfq;
import defpackage.edfr;
import defpackage.fkhl;
import defpackage.qet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class LandingScreenChimeraActivity extends qet {
    private static final arxo j = new arxo("QuickStart", "LandingScreenChimeraActivity");

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        setRequestedOrientation(1);
        super.onCreate(bundle);
        arxo arxoVar = j;
        arxoVar.d("onCreate()", new Object[0]);
        Bundle extras = getIntent().getExtras();
        String string = extras != null ? extras.getString("quickstart.intent.extra.DEVICE_NAME") : null;
        if (string == null) {
            arxoVar.f("Missing target device name in extras", new Object[0]);
            finish();
            return;
        }
        if (fkhl.c()) {
            arjz.a(this);
        }
        cwxz.a(this);
        setContentView(R.layout.quickstart_glif_fragment_v2);
        GlifLayout glifLayout = (GlifLayout) findViewById(R.id.glif_layout);
        Drawable drawable = getDrawable(R.drawable.gs_celebration_vd_theme_40);
        if (drawable != null) {
            glifLayout.I(drawable);
        }
        glifLayout.b(getString(R.string.quickstart_landing_screen_title, new Object[]{string}));
        glifLayout.G(getString(R.string.quickstart_landing_screen_description));
        edfq edfqVar = (edfq) glifLayout.q(edfq.class);
        edfr edfrVar = new edfr(this);
        edfrVar.b(R.string.common_done);
        edfrVar.c = 4;
        edfrVar.b = new View.OnClickListener() { // from class: cwxx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LandingScreenChimeraActivity landingScreenChimeraActivity = LandingScreenChimeraActivity.this;
                landingScreenChimeraActivity.setResult(-1);
                landingScreenChimeraActivity.finishAndRemoveTask();
            }
        };
        edfqVar.b(edfrVar.a());
    }
}
