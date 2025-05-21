package com.google.android.gms.auth.uiflows.addaccount;

import android.R;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import defpackage.aano;
import defpackage.adee;
import defpackage.adef;
import defpackage.adkg;
import defpackage.adkj;
import defpackage.adkk;
import defpackage.adlw;
import defpackage.adlx;
import defpackage.bp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class BrowserSignInChimeraActivity extends adkg implements adkj, adee {
    private static final aano h = new aano("am_response");
    private static final aano i = new aano("url");
    private static final aano j = new aano("account_type");
    private static final aano k = new aano("account_name");
    private AccountAuthenticatorResponse l;

    private final void p() {
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.l;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(5, "add account failed");
        }
        setResult(0, new Intent().putExtra("errorCode", 5).putExtra("errorMessage", "add account failed"));
        finish();
    }

    @Override // defpackage.adkj
    public final void b(adlw adlwVar) {
        String str = adlwVar.a;
        if (str != null) {
            adef.x(this, false, false, (String) s().a(j), str, adlwVar.b, null, false, false, false);
        }
    }

    @Override // defpackage.adkg
    protected final String gG() {
        return "BrowserSignInActivity";
    }

    @Override // defpackage.adee
    public final void j(Account account, String str, boolean z, Intent intent, boolean z2, String str2, boolean z3) {
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", account.name);
        bundle.putString("accountType", account.type);
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.l;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onResult(bundle);
        }
        setResult(-1, new Intent().putExtras(bundle));
        finish();
    }

    @Override // defpackage.adee
    public final void k() {
        p();
    }

    @Override // defpackage.adee
    public final void l(int i2) {
        p();
    }

    @Override // defpackage.adee
    public final void n() {
        p();
    }

    @Override // defpackage.adkj
    public final void o(adkk adkkVar) {
        Uri.Builder buildUpon = Uri.parse((String) s().a(i)).buildUpon();
        String str = (String) s().a(k);
        if (str != null) {
            buildUpon.appendQueryParameter("Email", str);
            buildUpon.appendQueryParameter("tmpl", "reauth");
        } else {
            buildUpon.appendQueryParameter("tmpl", "new_account");
        }
        String uri = buildUpon.build().toString();
        adlx.b().d();
        adkkVar.z(uri);
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.l;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(4, "user canceled");
        }
        super.onBackPressed();
    }

    @Override // defpackage.adkg, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.l = (AccountAuthenticatorResponse) s().a(h);
        if (bundle == null) {
            bp bpVar = new bp(gI());
            bpVar.t(R.id.content, new adkk());
            bpVar.a();
        }
    }
}
