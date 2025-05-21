package com.google.android.gms.significantplaces.settings;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.R;
import com.google.android.gms.significantplaces.settings.EnrollBiometricsChimeraActivity;
import defpackage.bp;
import defpackage.dciy;
import defpackage.dcjo;
import defpackage.eike;
import defpackage.fsao;
import defpackage.fvbo;
import defpackage.ijf;
import defpackage.qgg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class EnrollBiometricsChimeraActivity extends qgg {
    @Override // defpackage.qgg, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = dciy.a;
        dciy.c(this);
        if (!fsao.a.a().e()) {
            setTheme(R.style.TrustedPlacesPlacePickerTheme);
            setTitle(R.string.significant_places_enroll_biometrics_title);
            setContentView(R.layout.significant_places_enroll_biometrics);
            ((Button) findViewById(R.id.button_set_screen_lock)).setOnClickListener(new View.OnClickListener() { // from class: dcjm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EnrollBiometricsChimeraActivity.this.startActivity(new Intent("android.settings.BIOMETRIC_ENROLL").putExtra("android.provider.extra.BIOMETRIC_AUTHENTICATORS_ALLOWED", 32783));
                }
            });
            return;
        }
        View findViewById = findViewById(R.id.content_frame);
        eike.e(findViewById);
        FrameLayout frameLayout = (FrameLayout) findViewById;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        fvbo.d(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        ijf ijfVar = (ijf) layoutParams;
        ijfVar.width = -2;
        ijfVar.height = -2;
        ijfVar.c = 17;
        frameLayout.setLayoutParams(ijfVar);
        if (bundle == null) {
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.F(R.id.content_frame, new dcjo());
            bpVar.a();
        }
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onStart() {
        super.onStart();
        int i = dciy.a;
        dciy.d(this);
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onStop() {
        int i = dciy.a;
        dciy.e(this);
        super.onStop();
    }
}
