package com.google.android.gms.wallet.ow;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.arwm;
import defpackage.ding;
import defpackage.egaf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ShowLockScreenChimeraActivity extends egaf {
    public static Intent f(BuyFlowConfig buyFlowConfig) {
        arwm.t(buyFlowConfig, "buyFlowConfig is required");
        Intent intent = new Intent();
        intent.putExtra("forceLockscreenToShow", true);
        intent.setClassName("com.google.android.gms", "com.google.android.gms.wallet.ow.ShowLockScreenActivity");
        intent.putExtra("buyFlowConfig", buyFlowConfig);
        return intent;
    }

    @Override // defpackage.egaf
    public final Activity e() {
        return getContainerActivity();
    }

    @Override // defpackage.egaf, defpackage.pob, defpackage.qdy, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BuyFlowConfig buyFlowConfig = (BuyFlowConfig) getIntent().getParcelableExtra("buyFlowConfig");
        arwm.t(buyFlowConfig, "buyFlowConfig is required");
        ding.C(this, buyFlowConfig, ding.a, false);
    }
}
