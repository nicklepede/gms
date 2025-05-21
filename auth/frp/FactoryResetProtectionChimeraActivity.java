package com.google.android.gms.auth.frp;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.auth.login.BrowserChimeraActivity;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import defpackage.arwm;
import defpackage.arxo;
import defpackage.qfn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class FactoryResetProtectionChimeraActivity extends qfn {
    private static final arxo h = new arxo("GLSActivity", "FactoryResetProtectionActivity");
    private static final String i = "url";
    private String j;

    private final void a() {
        String str = this.j;
        int i2 = BrowserChimeraActivity.B;
        Intent className = new Intent().setClassName(AppContextProvider.a(), "com.google.android.gms.auth.login.BrowserActivity");
        className.putExtra("account_name", (String) null);
        className.putExtra("url", str);
        className.putExtra("access_token", (String) null);
        className.putExtra("creating_account", false);
        className.putStringArrayListExtra("allowed_domains", null);
        if (!TextUtils.isEmpty(null)) {
            className.putExtra("purchaser_email", (String) null);
        }
        if (!TextUtils.isEmpty(null)) {
            className.putExtra("purchaser_name", (String) null);
        }
        className.putExtra("firstRun", true);
        className.putExtra("useImmersiveMode", true);
        startActivityForResult(className, 101);
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i3 == 0) {
            setResult(0);
            finish();
            return;
        }
        if (i3 != -1) {
            a();
            return;
        }
        if (i2 != 101) {
            if (i2 != 102) {
                return;
            }
            setResult(-1);
            finish();
            return;
        }
        if (intent == null) {
            a();
            return;
        }
        Bundle extras = intent.getExtras();
        arwm.s(extras);
        String string = extras.getString("obfuscated_gaia_id");
        String string2 = extras.getString("authorization_code");
        if (string != null) {
            if (string2 != null) {
                int i4 = FrpInterstitialChimeraActivity.i;
                startActivityForResult(new Intent().setClassName(this, "com.google.android.gms.auth.frp.FrpInterstitialActivity").putExtra("account_id", string), 102);
                return;
            }
            string2 = null;
        }
        h.m(String.format("gaiaid (%s) or authCode (%s) is null.", string, Boolean.valueOf(string2 == null)), new Object[0]);
        a();
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.j = getIntent().getStringExtra(i);
        } else {
            this.j = bundle.getString(i);
        }
        a();
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString(i, this.j);
    }
}
