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
import defpackage.abt;
import defpackage.abv;
import defpackage.acl;
import defpackage.aqxd;
import defpackage.asqh;
import defpackage.atm$$ExternalSyntheticApiModelOutline0;
import defpackage.bzhj;
import defpackage.bziq;
import defpackage.cabc;
import defpackage.dciy;
import defpackage.dcjg;
import defpackage.dclp;
import defpackage.dclr;
import defpackage.ejhf;
import defpackage.enre;
import defpackage.fvbo;
import defpackage.fvgt;
import defpackage.fvjt;
import defpackage.ips;
import defpackage.joo;
import defpackage.qgg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class TrustedPlacesListChimeraActivity extends qgg {
    public fvjt j;
    private CancellationSignal k;

    private final void c(final Bundle bundle) {
        abv registerForActivityResult = registerForActivityResult(new acl(), new abt() { // from class: dclm
            @Override // defpackage.abt
            public final void jq(Object obj) {
                ActivityResult activityResult = (ActivityResult) obj;
                fvbo.f(activityResult, "it");
                int i = activityResult.a;
                TrustedPlacesListChimeraActivity trustedPlacesListChimeraActivity = this;
                if (i != -1 || bundle != null) {
                    int i2 = dciy.a;
                    dciy.b(trustedPlacesListChimeraActivity);
                } else {
                    bp bpVar = new bp(trustedPlacesListChimeraActivity.getSupportFragmentManager());
                    bpVar.F(R.id.content_frame, new dcmc());
                    bpVar.a();
                }
            }
        });
        Object systemService = getSystemService("keyguard");
        fvbo.d(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
        Intent createConfirmDeviceCredentialIntent = ((KeyguardManager) systemService).createConfirmDeviceCredentialIntent(getString(R.string.mandatory_biometrics_prompt_title), "");
        if (createConfirmDeviceCredentialIntent != null) {
            try {
                int i = dciy.a;
                dciy.a();
                registerForActivityResult.b(createConfirmDeviceCredentialIntent);
                return;
            } catch (ActivityNotFoundException e) {
                ((ejhf) ((ejhf) dcjg.a.j()).s(e)).x("Failed to launch device credential intent");
                int i2 = dciy.a;
                dciy.b(this);
                return;
            }
        }
        try {
            int i3 = dciy.a;
            dciy.a();
            startActivity(new Intent("com.android.settings.SETUP_LOCK_SCREEN"));
        } catch (ActivityNotFoundException e2) {
            ((ejhf) ((ejhf) dcjg.a.j()).s(e2)).x("Failed to launch lock screen intent");
            int i4 = dciy.a;
            dciy.b(this);
        }
    }

    @Override // defpackage.qgg, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        int canAuthenticate;
        BiometricPrompt.Builder allowedAuthenticators;
        BiometricPrompt.Builder title;
        BiometricPrompt build;
        super.onCreate(bundle);
        int i = dciy.a;
        dciy.c(this);
        this.j = fvgt.b(joo.a(this), null, null, new dclp(this, null), 3);
        aqxd aqxdVar = bziq.a;
        cabc cabcVar = new cabc(this);
        bzhj bzhjVar = new bzhj();
        bzhjVar.d(102);
        bzhjVar.c(60000L);
        bzhjVar.e(2);
        cabcVar.b(bzhjVar.a(), null);
        if (!asqh.g()) {
            c(bundle);
            return;
        }
        int i2 = ips.a;
        Object systemService = getSystemService("biometric");
        fvbo.d(systemService, "null cannot be cast to non-null type android.hardware.biometrics.BiometricManager");
        canAuthenticate = atm$$ExternalSyntheticApiModelOutline0.m168m(systemService).canAuthenticate(32783);
        if (canAuthenticate != 0) {
            if (canAuthenticate != 11) {
                return;
            }
            abv registerForActivityResult = registerForActivityResult(new acl(), new abt() { // from class: dcln
                @Override // defpackage.abt
                public final void jq(Object obj) {
                    fvbo.f((ActivityResult) obj, "result");
                    int i3 = dciy.a;
                    dciy.b(TrustedPlacesListChimeraActivity.this);
                }
            });
            dciy.a();
            registerForActivityResult.b(new Intent().setClassName(this, "com.google.android.gms.significantplaces.settings.EnrollBiometricsActivity"));
            return;
        }
        allowedAuthenticators = new BiometricPrompt.Builder(this).setAllowedAuthenticators(32783);
        title = allowedAuthenticators.setTitle(getString(R.string.mandatory_biometrics_prompt_title));
        fvbo.e(title, "setTitle(...)");
        build = title.build();
        fvbo.e(build, "build(...)");
        CancellationSignal cancellationSignal = this.k;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
        }
        CancellationSignal cancellationSignal2 = new CancellationSignal();
        this.k = cancellationSignal2;
        fvbo.c(cancellationSignal2);
        build.authenticate(cancellationSignal2, enre.a, new dclr(this, bundle));
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        fvbo.f(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        int i = dciy.a;
        dciy.b(this);
        return true;
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onStart() {
        super.onStart();
        int i = dciy.a;
        dciy.d(this);
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onStop() {
        CancellationSignal cancellationSignal = this.k;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
        }
        int i = dciy.a;
        dciy.e(this);
        super.onStop();
    }
}
