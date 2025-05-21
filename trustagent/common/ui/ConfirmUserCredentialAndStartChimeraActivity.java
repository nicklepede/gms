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
import defpackage.abt;
import defpackage.abv;
import defpackage.acl;
import defpackage.asej;
import defpackage.asot;
import defpackage.asqh;
import defpackage.dglq;
import defpackage.dgmj;
import defpackage.dgmk;
import defpackage.ejhf;
import defpackage.iln;
import defpackage.qfp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ConfirmUserCredentialAndStartChimeraActivity extends qfp implements abt {
    public abv k;
    private Intent m;
    private static final asot l = asot.b("TrustAgent", asej.TRUSTAGENT);
    public static final dglq j = new dgmj();

    public static Intent b(Context context, Intent intent, String str) {
        Intent intent2 = new Intent();
        intent2.setClassName(context, "com.google.android.gms.trustagent.ConfirmUserCredentialAndStartActivity");
        intent2.putExtra("google.gmscore.auth.confirm_user_credentials.INTENT_TO_START", intent);
        if (str != null) {
            intent2.putExtra("google.gmscore.auth.confirm_user_credentials.TITLE", str);
        }
        intent2.setFlags(67108864);
        if (!asqh.f()) {
            intent2.addFlags(268435456);
        }
        return intent2;
    }

    @Override // defpackage.abt
    public final /* bridge */ /* synthetic */ void jq(Object obj) {
        if (((ActivityResult) obj).a == -1) {
            ((ejhf) ((ejhf) l.h()).ah((char) 11628)).x("User authenticated, starting intent.");
            Intent intent = this.m;
            if (intent != null) {
                startActivity(intent);
                if (!asqh.f()) {
                    this.m.addFlags(268435456);
                }
            }
        } else {
            ((ejhf) ((ejhf) l.h()).ah((char) 11627)).x("User failed to authenticate.");
        }
        finish();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        BiometricPrompt.Builder allowedAuthenticators;
        BiometricPrompt.Builder confirmationRequired;
        BiometricPrompt.Builder title;
        BiometricPrompt build;
        super.onCreate(bundle);
        this.k = registerForActivityResult(new acl(), this);
        Intent intent = getIntent();
        this.m = intent;
        if (intent != null) {
            this.m = (Intent) intent.getParcelableExtra("google.gmscore.auth.confirm_user_credentials.INTENT_TO_START");
        }
        if (this.m == null) {
            ((ejhf) ((ejhf) l.i()).ah((char) 11631)).x("No intent to start specified in activity, exiting.");
            finish();
        }
        String stringExtra = getIntent().getStringExtra("google.gmscore.auth.confirm_user_credentials.TITLE");
        String stringExtra2 = getIntent().getStringExtra("google.gmscore.auth.confirm_user_credentials.DETAILS");
        if (asqh.g()) {
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
            build.authenticate(new CancellationSignal(), iln.g(this), new dgmk(this, intent2));
            return;
        }
        KeyguardManager keyguardManager = (KeyguardManager) getSystemService("keyguard");
        if (keyguardManager == null) {
            ((ejhf) ((ejhf) l.j()).ah((char) 11630)).x("Failed to get the KeyguardManager service.");
            finish();
            return;
        }
        try {
            this.k.b(keyguardManager.createConfirmDeviceCredentialIntent(stringExtra, stringExtra2));
        } catch (ActivityNotFoundException e) {
            ((ejhf) ((ejhf) ((ejhf) l.i()).s(e)).ah((char) 11629)).x("Activity to check user credential not found.");
            finish();
        }
    }
}
