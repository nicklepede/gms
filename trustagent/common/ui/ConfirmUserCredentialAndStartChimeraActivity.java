package com.google.android.gms.trustagent.common.ui;

import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.text.TextUtils;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.R;
import defpackage.aby;
import defpackage.aca;
import defpackage.acq;
import defpackage.auid;
import defpackage.ausn;
import defpackage.auub;
import defpackage.diwv;
import defpackage.dixo;
import defpackage.dixp;
import defpackage.eluo;
import defpackage.ind;
import defpackage.ryt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ConfirmUserCredentialAndStartChimeraActivity extends ryt implements aby {
    public aca k;
    private Intent m;
    private static final ausn l = ausn.b("TrustAgent", auid.TRUSTAGENT);
    public static final diwv j = new dixo();

    public static Intent b(Context context, Intent intent, String str) {
        Intent intent2 = new Intent();
        intent2.setClassName(context, "com.google.android.gms.trustagent.ConfirmUserCredentialAndStartActivity");
        intent2.putExtra("google.gmscore.auth.confirm_user_credentials.INTENT_TO_START", intent);
        if (str != null) {
            intent2.putExtra("google.gmscore.auth.confirm_user_credentials.TITLE", str);
        }
        intent2.setFlags(67108864);
        if (!auub.f()) {
            intent2.addFlags(268435456);
        }
        return intent2;
    }

    @Override // defpackage.aby
    public final /* bridge */ /* synthetic */ void jF(Object obj) {
        if (((ActivityResult) obj).a == -1) {
            ((eluo) ((eluo) l.h()).ai((char) 11631)).x("User authenticated, starting intent.");
            Intent intent = this.m;
            if (intent != null) {
                startActivity(intent);
                if (!auub.f()) {
                    this.m.addFlags(268435456);
                }
            }
        } else {
            ((eluo) ((eluo) l.h()).ai((char) 11630)).x("User failed to authenticate.");
        }
        finish();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        BiometricPrompt.Builder allowedAuthenticators;
        BiometricPrompt.Builder confirmationRequired;
        BiometricPrompt.Builder title;
        BiometricPrompt build;
        super.onCreate(bundle);
        this.k = registerForActivityResult(new acq(), this);
        Intent intent = getIntent();
        this.m = intent;
        if (intent != null) {
            this.m = (Intent) intent.getParcelableExtra("google.gmscore.auth.confirm_user_credentials.INTENT_TO_START");
        }
        if (this.m == null) {
            ((eluo) ((eluo) l.i()).ai((char) 11634)).x("No intent to start specified in activity, exiting.");
            finish();
        }
        String stringExtra = getIntent().getStringExtra("google.gmscore.auth.confirm_user_credentials.TITLE");
        String stringExtra2 = getIntent().getStringExtra("google.gmscore.auth.confirm_user_credentials.DETAILS");
        if (auub.g()) {
            Intent intent2 = this.m;
            allowedAuthenticators = new BiometricPrompt.Builder(this).setAllowedAuthenticators(32768);
            confirmationRequired = allowedAuthenticators.setConfirmationRequired(false);
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = getString(R.string.personal_unlock_preference_name);
            }
            title = confirmationRequired.setTitle(stringExtra);
            if (!TextUtils.isEmpty(stringExtra2)) {
                title.setDescription(stringExtra2);
            }
            build = title.build();
            build.authenticate(new CancellationSignal(), ind.g(this), new dixp(this, intent2));
            return;
        }
        KeyguardManager keyguardManager = (KeyguardManager) getSystemService("keyguard");
        if (keyguardManager == null) {
            ((eluo) ((eluo) l.j()).ai((char) 11633)).x("Failed to get the KeyguardManager service.");
            finish();
            return;
        }
        try {
            this.k.b(keyguardManager.createConfirmDeviceCredentialIntent(stringExtra, stringExtra2));
        } catch (ActivityNotFoundException e) {
            ((eluo) ((eluo) ((eluo) l.i()).s(e)).ai((char) 11632)).x("Activity to check user credential not found.");
            finish();
        }
    }
}
