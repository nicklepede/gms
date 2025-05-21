package com.google.android.gms.auth.uiflows.common;

import android.accounts.AccountAuthenticatorResponse;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import defpackage.asej;
import defpackage.asng;
import defpackage.asot;
import defpackage.edgl;
import defpackage.ejhf;
import defpackage.fkdo;
import defpackage.qfn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class UnpackingRedirectChimeraActivity extends qfn {
    private static final asot h = asot.b("UnpackingRedirectAct", asej.AUTH_ACCOUNT_DATA);

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (isFinishing()) {
            ((ejhf) h.j()).x("Restarted UnpackingRedirectChimeraActivity.");
            if (fkdo.a.a().y()) {
                return;
            }
        }
        PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("target");
        if (pendingIntent != null) {
            Intent intent = new Intent();
            AccountAuthenticatorResponse accountAuthenticatorResponse = (AccountAuthenticatorResponse) getIntent().getParcelableExtra("response");
            if (accountAuthenticatorResponse != null) {
                intent.putExtra("response", accountAuthenticatorResponse);
            }
            String p = asng.p(this);
            if (p != null) {
                intent.putExtra("caller", p);
            }
            edgl.a(getIntent(), intent);
            try {
            } catch (IntentSender.SendIntentException e) {
                e = e;
            }
            try {
                startIntentSender(pendingIntent.getIntentSender(), intent, 33554432, 33554432, 0);
                finish();
                return;
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                ((ejhf) ((ejhf) h.i()).s(e)).x("Unable to start unpacked pending intent!");
                setResult(0);
                finish();
            }
        }
        setResult(0);
        finish();
    }
}
