package com.google.android.gms.wallet.common.ui;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.atzb;
import defpackage.dkyr;
import defpackage.eihd;
import defpackage.eihe;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ErrorChimeraActivity extends Activity implements eihd {
    public static Intent a(BuyFlowConfig buyFlowConfig, Intent intent, String str) {
        Intent intent2 = new Intent();
        intent2.setClassName("com.google.android.gms", "com.google.android.gms.wallet.common.ui.ErrorActivity");
        intent2.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig);
        intent2.putExtra("resultCode", 0);
        intent2.putExtra("resultData", intent);
        atzb.s(str);
        intent2.putExtra("message", str);
        return intent2;
    }

    private final void b() {
        Intent intent = getIntent();
        setResult(intent.getIntExtra("resultCode", 0), (Intent) intent.getParcelableExtra("resultData"));
        finish();
    }

    @Override // defpackage.eihd
    public final void ak(int i, int i2) {
        b();
    }

    @Override // defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        b();
    }

    @Override // defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        dkyr.C(this, (BuyFlowConfig) intent.getParcelableExtra("com.google.android.gms.wallet.buyFlowConfig"), dkyr.a, false);
        super.onCreate(bundle);
        eihe eiheVar = (eihe) getSupportFragmentManager().findFragmentByTag("errorDialogFragment");
        if (bundle == null) {
            eiheVar = eihe.b(4, null, intent.getStringExtra("message"), 0);
            getSupportFragmentManager().beginTransaction().add(eiheVar, "errorDialogFragment").commit();
        }
        eiheVar.a = this;
    }
}
