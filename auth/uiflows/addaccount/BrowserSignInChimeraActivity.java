package com.google.android.gms.auth.uiflows.addaccount;

import android.R;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import defpackage.acno;
import defpackage.afeg;
import defpackage.afeh;
import defpackage.afkn;
import defpackage.afkq;
import defpackage.afkr;
import defpackage.afmd;
import defpackage.afme;
import defpackage.bp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class BrowserSignInChimeraActivity extends afkn implements afkq, afeg {
    private static final acno h = new acno("am_response");
    private static final acno i = new acno("url");
    private static final acno j = new acno("account_type");
    private static final acno k = new acno("account_name");
    private AccountAuthenticatorResponse l;

    private final void p() {
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.l;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(5, "add account failed");
        }
        setResult(0, new Intent().putExtra("errorCode", 5).putExtra("errorMessage", "add account failed"));
        finish();
    }

    @Override // defpackage.afkq
    public final void b(afmd afmdVar) {
        String str = afmdVar.a;
        if (str != null) {
            afeh.x(this, false, false, (String) s().a(j), str, afmdVar.b, null, false, false, false);
        }
    }

    @Override // defpackage.afkn
    protected final String gW() {
        return "BrowserSignInActivity";
    }

    @Override // defpackage.afeg
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

    @Override // defpackage.afeg
    public final void k() {
        p();
    }

    @Override // defpackage.afeg
    public final void l(int i2) {
        p();
    }

    @Override // defpackage.afeg
    public final void n() {
        p();
    }

    @Override // defpackage.afkq
    public final void o(afkr afkrVar) {
        Uri.Builder buildUpon = Uri.parse((String) s().a(i)).buildUpon();
        String str = (String) s().a(k);
        if (str != null) {
            buildUpon.appendQueryParameter("Email", str);
            buildUpon.appendQueryParameter("tmpl", "reauth");
        } else {
            buildUpon.appendQueryParameter("tmpl", "new_account");
        }
        String uri = buildUpon.build().toString();
        afme.b().d();
        afkrVar.z(uri);
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.l;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(4, "user canceled");
        }
        super.onBackPressed();
    }

    @Override // defpackage.afkn, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.l = (AccountAuthenticatorResponse) s().a(h);
        if (bundle == null) {
            bp bpVar = new bp(gY());
            bpVar.t(R.id.content, new afkr());
            bpVar.a();
        }
    }
}
