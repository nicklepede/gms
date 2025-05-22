package com.google.android.gms.auth.uiflows.addaccount;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.auth.uiflows.controller.Controller;
import com.google.android.gms.auth.uiflows.updatecredentials.FinishUpdateCredentialsSessionController;
import defpackage.acno;
import defpackage.acnp;
import defpackage.afln;
import defpackage.aflp;
import defpackage.atmp;
import defpackage.atmt;
import defpackage.ryr;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class FinishSessionChimeraActivity extends ryr {
    private AccountAuthenticatorResponse u;
    private static final acno t = new acno("accountSessionBundle");
    static final acno h = new acno("am_response");
    public static final acno i = new acno("session_type");
    static final acno j = new acno("is_setup_wizard");
    public static final acno k = new acno("use_immersive_mode");
    public static final acno l = new acno("ui_parameters");
    public static final acno m = new acno("auth_code");
    static final acno n = new acno("obfuscated_gaia_id");
    static final acno o = new acno("terms_of_service_accepted");
    static final acno p = new acno("is_new_account");
    public static final acno q = new acno("account");
    static final acno r = new acno("account_type");
    static final acno s = new acno("account_name");

    public static Intent a(Context context, AccountAuthenticatorResponse accountAuthenticatorResponse, String str, Bundle bundle) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.addaccount.FinishSessionActivity");
        acnp acnpVar = new acnp();
        acnpVar.d(h, accountAuthenticatorResponse);
        acnpVar.d(r, str);
        acnpVar.d(t, bundle);
        return className.putExtras(acnpVar.a);
    }

    private final void b(String str) {
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.u;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(8, str);
        }
        Intent intent = new Intent();
        intent.putExtra("errorCode", 8);
        intent.putExtra("errorMessage", str);
        setResult(0, intent);
        finish();
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        aflp aflpVar;
        Controller finishUpdateCredentialsSessionController;
        super.onCreate(bundle);
        acnp acnpVar = new acnp(getIntent().getExtras());
        this.u = (AccountAuthenticatorResponse) acnpVar.a(h);
        Bundle bundle2 = (Bundle) acnpVar.a(t);
        if (bundle2 == null) {
            Log.w("Auth", String.format(Locale.US, "[FinishSessionChimeraActivity] Session bundle cannot be null!", new Object[0]));
            b("Session bundle cannot be null!");
            return;
        }
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.u;
        acnp acnpVar2 = new acnp(bundle2);
        acno acnoVar = i;
        String str = (String) acnpVar2.a(acnoVar);
        Controller controller = null;
        if ("finish_add_account_session_type".equals(str)) {
            acnp acnpVar3 = new acnp(bundle2);
            if ("finish_add_account_session_type".equals((String) acnpVar3.a(acnoVar))) {
                String str2 = (String) acnpVar3.a(r);
                String str3 = (String) acnpVar3.a(s);
                finishUpdateCredentialsSessionController = new FinishAddAccountSessionController(accountAuthenticatorResponse, str2, ((Boolean) acnpVar3.a(j)).booleanValue(), ((Boolean) acnpVar3.a(k)).booleanValue(), atmt.b((Bundle) acnpVar3.a(l)), str3, (String) acnpVar3.a(m), (String) acnpVar3.a(n), ((Boolean) acnpVar3.a(o)).booleanValue(), ((Boolean) acnpVar3.a(p)).booleanValue(), null, false, false, false, null, null, false, false, false, null, ((Boolean) acnpVar3.b(atmp.a, false)).booleanValue());
                aflpVar = null;
                controller = finishUpdateCredentialsSessionController;
            } else {
                aflpVar = null;
            }
        } else {
            aflpVar = null;
            if ("finish_update_credentials_session_type".equals(str)) {
                acnp acnpVar4 = new acnp(bundle2);
                if ("finish_update_credentials_session_type".equals((String) acnpVar4.a(acnoVar))) {
                    finishUpdateCredentialsSessionController = new FinishUpdateCredentialsSessionController(accountAuthenticatorResponse, (Account) acnpVar4.a(q), ((Boolean) acnpVar4.a(k)).booleanValue(), atmt.b((Bundle) acnpVar4.a(l)), (String) acnpVar4.a(m), null);
                    controller = finishUpdateCredentialsSessionController;
                }
            }
            controller = null;
        }
        if (controller == null) {
            b("Failed to create controller from session bundle!");
        } else {
            afln.z(this, controller, controller.a(aflpVar));
            finish();
        }
    }
}
