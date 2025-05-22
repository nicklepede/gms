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
import defpackage.dete;
import defpackage.detu;
import defpackage.ekxj;
import defpackage.fuvk;
import defpackage.fxxm;
import defpackage.ikv;
import defpackage.rzk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class EnrollBiometricsChimeraActivity extends rzk {
    @Override // defpackage.rzk, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = dete.a;
        dete.c(this);
        if (!fuvk.f()) {
            setTheme(R.style.TrustedPlacesPlacePickerTheme);
            setTitle(R.string.significant_places_enroll_biometrics_title);
            setContentView(R.layout.significant_places_enroll_biometrics);
            ((Button) findViewById(R.id.button_set_screen_lock)).setOnClickListener(new View.OnClickListener() { // from class: dets
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EnrollBiometricsChimeraActivity.this.startActivity(new Intent("android.settings.BIOMETRIC_ENROLL").putExtra("android.provider.extra.BIOMETRIC_AUTHENTICATORS_ALLOWED", 32783));
                }
            });
            return;
        }
        View findViewById = findViewById(R.id.content_frame);
        ekxj.e(findViewById);
        FrameLayout frameLayout = (FrameLayout) findViewById;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        fxxm.d(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        ikv ikvVar = (ikv) layoutParams;
        ikvVar.width = -2;
        ikvVar.height = -2;
        ikvVar.c = 17;
        frameLayout.setLayoutParams(ikvVar);
        if (bundle == null) {
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.F(R.id.content_frame, new detu());
            bpVar.a();
        }
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onStart() {
        super.onStart();
        int i = dete.a;
        dete.d(this);
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onStop() {
        int i = dete.a;
        dete.e(this);
        super.onStop();
    }
}
