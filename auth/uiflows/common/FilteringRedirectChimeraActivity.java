package com.google.android.gms.auth.uiflows.common;

import android.accounts.AccountAuthenticatorResponse;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import defpackage.asej;
import defpackage.asot;
import defpackage.ejhf;
import defpackage.qfn;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class FilteringRedirectChimeraActivity extends qfn {
    private static final asot h = asot.b("GLSActivity", asej.AUTH_ACCOUNT_DATA);
    private AccountAuthenticatorResponse i;
    private List j;

    private final void a(int i, int i2, String str) {
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.i;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(i2, str);
        }
        Intent intent = new Intent();
        intent.putExtra("errorCode", i2);
        intent.putExtra("errorMessage", str);
        setResult(i, intent);
        finish();
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        super.onActivityResult(i, i2, intent);
        Intent intent2 = new Intent();
        if (i2 == -1) {
            if (intent != null && intent.getExtras() != null) {
                if (intent.hasExtra("booleanResult") && this.j.contains("booleanResult")) {
                    intent2.putExtra("booleanResult", intent.getBooleanExtra("booleanResult", false));
                    intent.removeExtra("booleanResult");
                    z = true;
                } else {
                    z = false;
                }
                if (intent.hasExtra("retry") && this.j.contains("retry")) {
                    intent2.putExtra("retry", intent.getBooleanExtra("retry", false));
                    intent.removeExtra("retry");
                    z = true;
                }
                if (intent.getExtras() != null) {
                    for (String str : intent.getExtras().keySet()) {
                        if (this.j.contains(str)) {
                            if ("accountSessionBundle".equals(str)) {
                                intent2.putExtra(str, intent.getBundleExtra(str));
                            } else {
                                intent2.putExtra(str, intent.getStringExtra(str));
                            }
                            z = true;
                        }
                    }
                }
                if (z) {
                    AccountAuthenticatorResponse accountAuthenticatorResponse = this.i;
                    if (accountAuthenticatorResponse != null) {
                        accountAuthenticatorResponse.onResult(intent2.getExtras());
                    }
                    setResult(-1, intent2);
                    finish();
                    return;
                }
            }
            i2 = -1;
        }
        int i3 = i2 == 0 ? 4 : 5;
        String str2 = i2 == 0 ? "canceled" : "unknown error";
        if (intent != null && intent.hasExtra("errorCode")) {
            i3 = intent.getIntExtra("errorCode", i3);
            str2 = intent.getStringExtra("errorMessage");
        }
        a(i2, i3, str2);
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        IntentSender intentSender;
        super.onCreate(bundle);
        if (bundle != null) {
            ((ejhf) h.h()).B("%sMarshalled state from icicle.", "[ FilteringRedirectActivity ] ");
            this.i = (AccountAuthenticatorResponse) bundle.getParcelable("response");
            this.j = bundle.getStringArrayList("com.google.android.gms.auth.redirect.whitelist");
            return;
        }
        Intent intent = getIntent();
        this.i = (AccountAuthenticatorResponse) intent.getParcelableExtra("response");
        this.j = intent.getStringArrayListExtra("com.google.android.gms.auth.redirect.whitelist");
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("com.google.android.gms.auth.redirect.INTENT");
        if (pendingIntent == null) {
            intentSender = null;
        } else {
            try {
                intentSender = pendingIntent.getIntentSender();
            } catch (IntentSender.SendIntentException e) {
                e = e;
                ((ejhf) h.i()).P("%s Unable to initiate pending workflow! %s", "[ FilteringRedirectActivity ] ", e.getMessage());
                a(0, 8, "Cannot launch workflow!");
            }
        }
        try {
            startIntentSenderForResult(intentSender, 0, null, 0, 0, 0);
            AccountAuthenticatorResponse accountAuthenticatorResponse = this.i;
            if (accountAuthenticatorResponse != null) {
                accountAuthenticatorResponse.onRequestContinued();
            }
        } catch (IntentSender.SendIntentException e2) {
            e = e2;
            ((ejhf) h.i()).P("%s Unable to initiate pending workflow! %s", "[ FilteringRedirectActivity ] ", e.getMessage());
            a(0, 8, "Cannot launch workflow!");
        }
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("response", this.i);
        bundle.putStringArrayList("com.google.android.gms.auth.redirect.whitelist", new ArrayList<>(this.j));
    }
}
