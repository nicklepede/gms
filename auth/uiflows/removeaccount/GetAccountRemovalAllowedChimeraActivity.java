package com.google.android.gms.auth.uiflows.removeaccount;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Intent;
import android.os.Bundle;
import defpackage.adle;
import defpackage.adlg;
import defpackage.qfn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class GetAccountRemovalAllowedChimeraActivity extends qfn {
    public static final /* synthetic */ int h = 0;

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        GetAccountRemovalAllowedController getAccountRemovalAllowedController = new GetAccountRemovalAllowedController((AccountAuthenticatorResponse) intent.getParcelableExtra("am_response"), (Account) intent.getParcelableExtra("account"), intent.getBooleanExtra("show_lock_screen", false), intent.getStringExtra("caller"));
        adle a = getAccountRemovalAllowedController.a(null);
        Intent intent2 = a.b;
        adlg.y(intent2, getAccountRemovalAllowedController, a.a);
        startActivity(intent2.addFlags(33554432));
        finish();
    }
}
