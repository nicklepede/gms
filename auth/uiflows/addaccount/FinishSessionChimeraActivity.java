package com.google.android.gms.auth.uiflows.addaccount;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.auth.uiflows.controller.Controller;
import com.google.android.gms.auth.uiflows.updatecredentials.FinishUpdateCredentialsSessionController;
import defpackage.aano;
import defpackage.aanp;
import defpackage.adlg;
import defpackage.adli;
import defpackage.arka;
import defpackage.arke;
import defpackage.qfn;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class FinishSessionChimeraActivity extends qfn {
    private AccountAuthenticatorResponse u;
    private static final aano t = new aano("accountSessionBundle");
    static final aano h = new aano("am_response");
    public static final aano i = new aano("session_type");
    static final aano j = new aano("is_setup_wizard");
    public static final aano k = new aano("use_immersive_mode");
    public static final aano l = new aano("ui_parameters");
    public static final aano m = new aano("auth_code");
    static final aano n = new aano("obfuscated_gaia_id");
    static final aano o = new aano("terms_of_service_accepted");
    static final aano p = new aano("is_new_account");
    public static final aano q = new aano("account");
    static final aano r = new aano("account_type");
    static final aano s = new aano("account_name");

    public static Intent a(Context context, AccountAuthenticatorResponse accountAuthenticatorResponse, String str, Bundle bundle) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.addaccount.FinishSessionActivity");
        aanp aanpVar = new aanp();
        aanpVar.d(h, accountAuthenticatorResponse);
        aanpVar.d(r, str);
        aanpVar.d(t, bundle);
        return className.putExtras(aanpVar.a);
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

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        adli adliVar;
        Controller finishUpdateCredentialsSessionController;
        super.onCreate(bundle);
        aanp aanpVar = new aanp(getIntent().getExtras());
        this.u = (AccountAuthenticatorResponse) aanpVar.a(h);
        Bundle bundle2 = (Bundle) aanpVar.a(t);
        if (bundle2 == null) {
            Log.w("Auth", String.format(Locale.US, "[FinishSessionChimeraActivity] Session bundle cannot be null!", new Object[0]));
            b("Session bundle cannot be null!");
            return;
        }
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.u;
        aanp aanpVar2 = new aanp(bundle2);
        aano aanoVar = i;
        String str = (String) aanpVar2.a(aanoVar);
        Controller controller = null;
        if ("finish_add_account_session_type".equals(str)) {
            aanp aanpVar3 = new aanp(bundle2);
            if ("finish_add_account_session_type".equals((String) aanpVar3.a(aanoVar))) {
                String str2 = (String) aanpVar3.a(r);
                String str3 = (String) aanpVar3.a(s);
                finishUpdateCredentialsSessionController = new FinishAddAccountSessionController(accountAuthenticatorResponse, str2, ((Boolean) aanpVar3.a(j)).booleanValue(), ((Boolean) aanpVar3.a(k)).booleanValue(), arke.b((Bundle) aanpVar3.a(l)), str3, (String) aanpVar3.a(m), (String) aanpVar3.a(n), ((Boolean) aanpVar3.a(o)).booleanValue(), ((Boolean) aanpVar3.a(p)).booleanValue(), null, false, false, false, null, null, false, false, false, null, ((Boolean) aanpVar3.b(arka.a, false)).booleanValue());
                adliVar = null;
                controller = finishUpdateCredentialsSessionController;
            } else {
                adliVar = null;
            }
        } else {
            adliVar = null;
            if ("finish_update_credentials_session_type".equals(str)) {
                aanp aanpVar4 = new aanp(bundle2);
                if ("finish_update_credentials_session_type".equals((String) aanpVar4.a(aanoVar))) {
                    finishUpdateCredentialsSessionController = new FinishUpdateCredentialsSessionController(accountAuthenticatorResponse, (Account) aanpVar4.a(q), ((Boolean) aanpVar4.a(k)).booleanValue(), arke.b((Bundle) aanpVar4.a(l)), (String) aanpVar4.a(m), null);
                    controller = finishUpdateCredentialsSessionController;
                }
            }
            controller = null;
        }
        if (controller == null) {
            b("Failed to create controller from session bundle!");
        } else {
            adlg.z(this, controller, controller.a(adliVar));
            finish();
        }
    }
}
