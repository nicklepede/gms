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
import defpackage.ding;
import defpackage.efsw;
import defpackage.ehoy;
import defpackage.fecj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class StartAndroidAppRedirectChimeraActivity extends StartAndroidAppRedirectActivity {
    public static final /* synthetic */ int a = 0;
    private BuyFlowConfig f;

    @Override // com.google.android.wallet.redirect.StartAndroidAppRedirectActivity
    protected final View e(ViewGroup viewGroup) {
        fecj v = ehoy.a.v();
        if (!v.b.L()) {
            v.U();
        }
        ehoy ehoyVar = (ehoy) v.b;
        ehoyVar.b |= 2;
        ehoyVar.d = true;
        if (getString(R.string.ok) != null) {
            String string = getString(R.string.ok);
            if (!v.b.L()) {
                v.U();
            }
            ehoy ehoyVar2 = (ehoy) v.b;
            string.getClass();
            ehoyVar2.b |= 8;
            ehoyVar2.f = string;
        }
        ehoy ehoyVar3 = (ehoy) v.Q();
        LayoutInflater from = LayoutInflater.from(this);
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.google.android.gms.R.dimen.wallet_uic_start_android_app_redirect_ok_button_top_bottom_margin);
        BuyFlowConfig buyFlowConfig = this.f;
        int i = buyFlowConfig != null ? buyFlowConfig.b.g : 0;
        TypedArray obtainStyledAttributes = getTheme().obtainStyledAttributes(new int[]{com.google.android.gms.R.attr.internalUicUseGoogleMaterial2Theme});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return efsw.c(ehoyVar3, 3, this, null, null, from, viewGroup, dimensionPixelSize, dimensionPixelSize, com.google.android.gms.R.id.ok_button, z, i == 1).c();
    }

    @Override // com.google.android.wallet.redirect.StartAndroidAppRedirectActivity
    protected final void f(Intent intent) {
        ding.C(this, this.f, ding.k, true);
    }

    @Override // com.google.android.wallet.redirect.StartAndroidAppRedirectActivity, defpackage.pob, defpackage.qdy, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        this.f = (BuyFlowConfig) getIntent().getParcelableExtra("buyFlowConfig");
        super.onCreate(bundle);
    }
}
