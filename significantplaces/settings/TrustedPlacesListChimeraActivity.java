package com.google.android.gms.significantplaces.settings;

import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.view.MenuItem;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.R;
import com.google.android.gms.significantplaces.settings.TrustedPlacesListChimeraActivity;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.aby;
import defpackage.aca;
import defpackage.acq;
import defpackage.aia$$ExternalSyntheticApiModelOutline0;
import defpackage.aik;
import defpackage.aio;
import defpackage.aszs;
import defpackage.auub;
import defpackage.byyp;
import defpackage.byzf;
import defpackage.cbqa;
import defpackage.cbrh;
import defpackage.ccjt;
import defpackage.dete;
import defpackage.detm;
import defpackage.dewq;
import defpackage.dewr;
import defpackage.dewt;
import defpackage.eluo;
import defpackage.eqex;
import defpackage.fuvk;
import defpackage.fxxm;
import defpackage.fycr;
import defpackage.fyfr;
import defpackage.iri;
import defpackage.jvd;
import defpackage.rzk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class TrustedPlacesListChimeraActivity extends rzk {
    public fyfr j;
    private byzf k;
    private CancellationSignal l;

    private final void f() {
        aca registerForActivityResult = registerForActivityResult(new acq(), new aby() { // from class: dewo
            @Override // defpackage.aby
            public final void jF(Object obj) {
                fxxm.f((ActivityResult) obj, "result");
                int i = dete.a;
                dete.b(TrustedPlacesListChimeraActivity.this);
            }
        });
        int i = dete.a;
        dete.a();
        registerForActivityResult.b(new Intent().setClassName(this, "com.google.android.gms.significantplaces.settings.EnrollBiometricsActivity"));
    }

    private final void g(final Bundle bundle) {
        aca registerForActivityResult = registerForActivityResult(new acq(), new aby() { // from class: dewn
            @Override // defpackage.aby
            public final void jF(Object obj) {
                ActivityResult activityResult = (ActivityResult) obj;
                fxxm.f(activityResult, "it");
                int i = activityResult.a;
                TrustedPlacesListChimeraActivity trustedPlacesListChimeraActivity = this;
                if (i != -1 || bundle != null) {
                    int i2 = dete.a;
                    dete.b(trustedPlacesListChimeraActivity);
                } else {
                    bp bpVar = new bp(trustedPlacesListChimeraActivity.getSupportFragmentManager());
                    bpVar.F(R.id.content_frame, new dexf());
                    bpVar.a();
                }
            }
        });
        Object systemService = getSystemService("keyguard");
        fxxm.d(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
        Intent createConfirmDeviceCredentialIntent = ((KeyguardManager) systemService).createConfirmDeviceCredentialIntent(getString(R.string.mandatory_biometrics_prompt_title), "");
        if (createConfirmDeviceCredentialIntent != null) {
            try {
                int i = dete.a;
                dete.a();
                registerForActivityResult.b(createConfirmDeviceCredentialIntent);
                return;
            } catch (ActivityNotFoundException e) {
                ((eluo) ((eluo) detm.a.j()).s(e)).x("Failed to launch device credential intent");
                int i2 = dete.a;
                dete.b(this);
                return;
            }
        }
        try {
            int i3 = dete.a;
            dete.a();
            startActivity(new Intent("com.android.settings.SETUP_LOCK_SCREEN"));
        } catch (ActivityNotFoundException e2) {
            ((eluo) ((eluo) detm.a.j()).s(e2)).x("Failed to launch lock screen intent");
            int i4 = dete.a;
            dete.b(this);
        }
    }

    @Override // defpackage.rzk, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        int canAuthenticate;
        BiometricPrompt.Builder allowedAuthenticators;
        BiometricPrompt.Builder title;
        BiometricPrompt build;
        super.onCreate(bundle);
        int i = dete.a;
        dete.c(this);
        this.j = fycr.b(jvd.a(this), null, null, new dewq(this, null), 3);
        aszs aszsVar = cbrh.a;
        ccjt ccjtVar = new ccjt(this);
        cbqa cbqaVar = new cbqa();
        cbqaVar.d(102);
        cbqaVar.c(60000L);
        cbqaVar.e(2);
        ccjtVar.b(cbqaVar.a(), null);
        if (!auub.g()) {
            g(bundle);
            return;
        }
        if (!fuvk.a.lK().f()) {
            int i2 = iri.a;
            Object systemService = getSystemService("biometric");
            fxxm.d(systemService, "null cannot be cast to non-null type android.hardware.biometrics.BiometricManager");
            canAuthenticate = aia$$ExternalSyntheticApiModelOutline0.m63m(systemService).canAuthenticate(32783);
            if (canAuthenticate != 0) {
                if (canAuthenticate != 11) {
                    return;
                }
                f();
                return;
            }
            allowedAuthenticators = new BiometricPrompt.Builder(this).setAllowedAuthenticators(32783);
            title = allowedAuthenticators.setTitle(getString(R.string.mandatory_biometrics_prompt_title));
            fxxm.e(title, "setTitle(...)");
            build = title.build();
            fxxm.e(build, "build(...)");
            CancellationSignal cancellationSignal = this.l;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
            }
            CancellationSignal cancellationSignal2 = new CancellationSignal();
            this.l = cancellationSignal2;
            fxxm.c(cancellationSignal2);
            build.authenticate(cancellationSignal2, eqex.a, new dewt(this, bundle));
            return;
        }
        aik c = aik.c(this);
        this.k = byyp.a(this, new dewr(this, bundle));
        if (c.b(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) != 20) {
            aio a = byzf.a(this);
            byzf byzfVar = this.k;
            if (byzfVar != null) {
                byzfVar.e(a.a());
                return;
            }
            return;
        }
        int b = c.b(32783);
        if (b != 0) {
            if (b != 11) {
                dete.b(this);
                return;
            } else {
                f();
                return;
            }
        }
        aio aioVar = new aio();
        aioVar.i = 32783;
        aioVar.d = getString(R.string.significant_places_biometric_prompt_title);
        int i3 = iri.a;
        byzf byzfVar2 = this.k;
        if (byzfVar2 != null) {
            byzfVar2.e(aioVar.a());
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        fxxm.f(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        int i = dete.a;
        dete.b(this);
        return true;
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onStart() {
        super.onStart();
        int i = dete.a;
        dete.d(this);
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onStop() {
        CancellationSignal cancellationSignal = this.l;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
        }
        int i = dete.a;
        dete.e(this);
        super.onStop();
    }
}
