package com.google.android.gms.auth;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import defpackage.abxe;
import defpackage.adau;
import defpackage.adqb;
import defpackage.auid;
import defpackage.auqx;
import defpackage.aura;
import defpackage.ausn;
import defpackage.ryr;
import defpackage.wjx;
import defpackage.wkm;
import defpackage.wuv;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes2.dex */
public class TokenChimeraActivity extends ryr {
    private String i;
    private String j;
    private AppDescription l;
    private abxe n;
    private boolean h = false;
    private Bundle k = new Bundle();
    private String m = null;

    static {
        ausn.b("GLSActivity", auid.AUTH_ACCOUNT_DATA);
    }

    final void a(Intent intent, boolean z) {
        adau a;
        String stringExtra;
        Intent intent2 = new Intent();
        Intent intent3 = getIntent();
        intent2.putExtra("authAccount", this.i);
        intent2.putExtra("service", this.j);
        intent2.putExtra("callerExtras", this.k);
        if (z) {
            adqb.b.c(intent2);
            setResult(0, intent2);
            AccountAuthenticatorResponse accountAuthenticatorResponse = (AccountAuthenticatorResponse) intent3.getParcelableExtra("response");
            if (accountAuthenticatorResponse != null) {
                accountAuthenticatorResponse.onError(4, "canceled");
            }
            finish();
            return;
        }
        ausn ausnVar = adqb.a;
        if (intent == null) {
            a = adau.SUCCESS;
        } else {
            String stringExtra2 = intent.getStringExtra("Error");
            if (stringExtra2 == null) {
                a = adau.SUCCESS;
            } else {
                a = adau.a(stringExtra2);
                if (a == null) {
                    a = adau.UNKNOWN;
                }
            }
        }
        if (a != null) {
            adqb.b(a).c(intent2);
        }
        if (intent != null && (stringExtra = intent.getStringExtra("authtoken")) != null && this.h) {
            intent2.putExtra("authtoken", stringExtra);
        }
        AccountAuthenticatorResponse accountAuthenticatorResponse2 = (AccountAuthenticatorResponse) intent3.getParcelableExtra("response");
        if (accountAuthenticatorResponse2 != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("retry", true);
            accountAuthenticatorResponse2.onResult(bundle);
        }
        setResult(-1, intent2);
        finish();
    }

    public final void b(Bundle bundle) {
        this.j = bundle.getString("service");
        this.k = bundle.getBundle("callerExtras");
        this.i = bundle.getString("authAccount");
        this.h = bundle.getBoolean("is_for_result");
        Bundle bundle2 = this.k;
        if (bundle2 != null) {
            this.m = bundle2.getString("request_visible_actions");
        }
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 0) {
            a(intent, true);
        } else if (i == 101) {
            a(intent, false);
        }
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().clearFlags(2);
        this.n = new abxe(this);
        if (bundle != null) {
            b(bundle);
            return;
        }
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            setResult(0);
            finish();
            return;
        }
        b(extras);
        String string = this.k.getString(wjx.b);
        if (string != null) {
            int a = this.n.a(string);
            String p = aura.p(this);
            this.h = true;
            if (p == null) {
                p = this.k.containsKey("clientPackageName") ? this.k.getString("clientPackageName") : this.n.e;
                this.h = false;
            }
            this.k.putString("clientPackageName", p);
            int a2 = this.n.a(p);
            this.l = wuv.a(getApplicationInfo().uid, a2, string, a, this.n);
        }
        String str = this.i;
        String str2 = this.j;
        AppDescription appDescription = this.l;
        if (str != null && str2 != null && appDescription != null && appDescription.b != 0 && auqx.m(this, new Account(str, "com.google"))) {
            new wkm(this, this.m, this.i, this.j, this.k, this.l).execute(new Object[0]);
        } else {
            setResult(0);
            finish();
        }
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("authAccount", this.i);
        bundle.putString("service", this.j);
        bundle.putBundle("callerExtras", this.k);
        bundle.putBoolean("is_for_result", this.h);
    }
}
