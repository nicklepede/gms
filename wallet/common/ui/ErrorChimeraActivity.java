package com.google.android.gms.wallet.common.ui;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.arwm;
import defpackage.ding;
import defpackage.efua;
import defpackage.efub;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ErrorChimeraActivity extends Activity implements efua {
    public static Intent a(BuyFlowConfig buyFlowConfig, Intent intent, String str) {
        Intent intent2 = new Intent();
        intent2.setClassName("com.google.android.gms", "com.google.android.gms.wallet.common.ui.ErrorActivity");
        intent2.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig);
        intent2.putExtra("resultCode", 0);
        intent2.putExtra("resultData", intent);
        arwm.s(str);
        intent2.putExtra("message", str);
        return intent2;
    }

    private final void b() {
        Intent intent = getIntent();
        setResult(intent.getIntExtra("resultCode", 0), (Intent) intent.getParcelableExtra("resultData"));
        finish();
    }

    @Override // defpackage.efua
    public final void ak(int i, int i2) {
        b();
    }

    @Override // defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        b();
    }

    @Override // defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        ding.C(this, (BuyFlowConfig) intent.getParcelableExtra("com.google.android.gms.wallet.buyFlowConfig"), ding.a, false);
        super.onCreate(bundle);
        efub efubVar = (efub) getSupportFragmentManager().findFragmentByTag("errorDialogFragment");
        if (bundle == null) {
            efubVar = efub.b(4, null, intent.getStringExtra("message"), 0);
            getSupportFragmentManager().beginTransaction().add(efubVar, "errorDialogFragment").commit();
        }
        efubVar.a = this;
    }
}
