package com.google.android.gms.wallet.redirect;

import android.R;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.redirect.StartAndroidAppRedirectActivity;
import defpackage.dkyr;
import defpackage.eifz;
import defpackage.ekce;
import defpackage.fgrc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class StartAndroidAppRedirectChimeraActivity extends StartAndroidAppRedirectActivity {
    public static final /* synthetic */ int a = 0;
    private BuyFlowConfig f;

    @Override // com.google.android.wallet.redirect.StartAndroidAppRedirectActivity
    protected final View e(ViewGroup viewGroup) {
        fgrc v = ekce.a.v();
        if (!v.b.L()) {
            v.U();
        }
        ekce ekceVar = (ekce) v.b;
        ekceVar.b |= 2;
        ekceVar.d = true;
        if (getString(R.string.ok) != null) {
            String string = getString(R.string.ok);
            if (!v.b.L()) {
                v.U();
            }
            ekce ekceVar2 = (ekce) v.b;
            string.getClass();
            ekceVar2.b |= 8;
            ekceVar2.f = string;
        }
        ekce ekceVar3 = (ekce) v.Q();
        LayoutInflater from = LayoutInflater.from(this);
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.google.android.gms.R.dimen.wallet_uic_start_android_app_redirect_ok_button_top_bottom_margin);
        BuyFlowConfig buyFlowConfig = this.f;
        int i = buyFlowConfig != null ? buyFlowConfig.b.g : 0;
        TypedArray obtainStyledAttributes = getTheme().obtainStyledAttributes(new int[]{com.google.android.gms.R.attr.internalUicUseGoogleMaterial2Theme});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return eifz.c(ekceVar3, 3, this, null, null, from, viewGroup, dimensionPixelSize, dimensionPixelSize, com.google.android.gms.R.id.ok_button, z, i == 1).e();
    }

    @Override // com.google.android.wallet.redirect.StartAndroidAppRedirectActivity
    protected final void f(Intent intent) {
        dkyr.C(this, this.f, dkyr.k, true);
    }

    @Override // com.google.android.wallet.redirect.StartAndroidAppRedirectActivity, defpackage.rhf, defpackage.rxc, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        this.f = (BuyFlowConfig) getIntent().getParcelableExtra("buyFlowConfig");
        super.onCreate(bundle);
    }
}
