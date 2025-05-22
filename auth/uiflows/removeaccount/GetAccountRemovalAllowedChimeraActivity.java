package com.google.android.gms.auth.uiflows.removeaccount;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Intent;
import android.os.Bundle;
import defpackage.afll;
import defpackage.afln;
import defpackage.ryr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class GetAccountRemovalAllowedChimeraActivity extends ryr {
    public static final /* synthetic */ int h = 0;

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        GetAccountRemovalAllowedController getAccountRemovalAllowedController = new GetAccountRemovalAllowedController((AccountAuthenticatorResponse) intent.getParcelableExtra("am_response"), (Account) intent.getParcelableExtra("account"), intent.getBooleanExtra("show_lock_screen", false), intent.getStringExtra("caller"));
        afll a = getAccountRemovalAllowedController.a(null);
        Intent intent2 = a.b;
        afln.y(intent2, getAccountRemovalAllowedController, a.a);
        startActivity(intent2.addFlags(33554432));
        finish();
    }
}
