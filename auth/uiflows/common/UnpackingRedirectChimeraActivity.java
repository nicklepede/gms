package com.google.android.gms.auth.uiflows.common;

import android.accounts.AccountAuthenticatorResponse;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import defpackage.auid;
import defpackage.aura;
import defpackage.ausn;
import defpackage.eftg;
import defpackage.eluo;
import defpackage.fmua;
import defpackage.ryr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class UnpackingRedirectChimeraActivity extends ryr {
    private static final ausn h = ausn.b("UnpackingRedirectAct", auid.AUTH_ACCOUNT_DATA);

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (isFinishing()) {
            ((eluo) h.j()).x("Restarted UnpackingRedirectChimeraActivity.");
            if (fmua.a.lK().z()) {
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
            String p = aura.p(this);
            if (p != null) {
                intent.putExtra("caller", p);
            }
            eftg.a(getIntent(), intent);
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
                ((eluo) ((eluo) h.i()).s(e)).x("Unable to start unpacked pending intent!");
                setResult(0);
                finish();
            }
        }
        setResult(0);
        finish();
    }
}
