package com.google.android.gms.wallet.ow;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.atzb;
import defpackage.dkyr;
import defpackage.eini;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ShowLockScreenChimeraActivity extends eini {
    public static Intent f(BuyFlowConfig buyFlowConfig) {
        atzb.t(buyFlowConfig, "buyFlowConfig is required");
        Intent intent = new Intent();
        intent.putExtra("forceLockscreenToShow", true);
        intent.setClassName("com.google.android.gms", "com.google.android.gms.wallet.ow.ShowLockScreenActivity");
        intent.putExtra("buyFlowConfig", buyFlowConfig);
        return intent;
    }

    @Override // defpackage.eini
    public final Activity e() {
        return getContainerActivity();
    }

    @Override // defpackage.eini, defpackage.rhf, defpackage.rxc, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BuyFlowConfig buyFlowConfig = (BuyFlowConfig) getIntent().getParcelableExtra("buyFlowConfig");
        atzb.t(buyFlowConfig, "buyFlowConfig is required");
        dkyr.C(this, buyFlowConfig, dkyr.a, false);
    }
}
