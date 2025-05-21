package com.google.android.gms.nearby.discovery.fastpair;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.R;
import defpackage.bp;
import defpackage.cgiv;
import defpackage.cgqf;
import defpackage.chmk;
import defpackage.ejhf;
import defpackage.febw;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.qfp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class AtvConnectChimeraActivity extends qfp {
    private Drawable j;
    private cgqf k;

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.fast_pair_bottom_sheet_exit);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setGravity(81);
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("com.google.android.gms.nearby.discovery.ATV_CONNECT");
        if (byteArrayExtra == null) {
            finish();
            return;
        }
        try {
            fecp y = fecp.y(chmk.b, byteArrayExtra, 0, byteArrayExtra.length, febw.a());
            fecp.M(y);
            chmk chmkVar = (chmk) y;
            if (chmkVar != null) {
                cgiv.a.d().B("AtvConnectChimeraActivity: Check the passing info %s", chmkVar.e);
            }
        } catch (fedk e) {
            ((ejhf) cgiv.a.g().s(e)).x("AtvConnectChimeraActivity: Error happened when passing info");
        }
        Intent intent = getIntent();
        Bundle bundle2 = new Bundle();
        bundle2.putByteArray("com.google.android.gms.nearby.discovery.ATV_CONNECT", intent.getByteArrayExtra("com.google.android.gms.nearby.discovery.ATV_CONNECT"));
        bundle2.putParcelable("com.google.android.gms.nearby.discovery.HALF_SHEET_ACCOUNT", intent.getParcelableExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_ACCOUNT"));
        bundle2.putString("com.google.android.gms.nearby.discovery.HALF_SHEET_DESCRIPTION", intent.getStringExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_DESCRIPTION"));
        bundle2.putInt("com.google.android.gms.nearby.discovery.HALF_SHEET_ID", intent.getIntExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_ID", 0));
        bundle2.putString("EXTRA_PAIRING_TYPE", intent.getStringExtra("EXTRA_PAIRING_TYPE"));
        if (bundle != null && bundle.containsKey("ARG_FRAGMENT_STATE")) {
            bundle2.putSerializable("ARG_FRAGMENT_STATE", bundle.getSerializable("ARG_FRAGMENT_STATE"));
        }
        cgqf cgqfVar = new cgqf();
        cgqfVar.setArguments(bundle2);
        this.k = cgqfVar;
        setContentView(R.layout.fast_pair_bottom_sheet);
        overridePendingTransition(R.anim.fast_pair_bottom_sheet_enter, 0);
        this.j = getResources().getDrawable(R.drawable.bottom_sheet_bg);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.bottom_sheet_dialog_height);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.bottom_sheet_margin);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.bottom_sheet_elevation);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = i - (dimensionPixelSize2 + dimensionPixelSize2);
        attributes.height = dimensionPixelSize;
        attributes.gravity = 81;
        attributes.horizontalMargin = 0.0f;
        attributes.verticalMargin = dimensionPixelSize2 / i2;
        attributes.format = -2;
        attributes.type = 2008;
        attributes.flags |= 128;
        attributes.flags |= 16777216;
        getWindow().setAttributes(attributes);
        getWindow().setBackgroundDrawable(this.j);
        getWindow().setElevation(dimensionPixelSize3);
        if (this.k != null) {
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.F(R.id.fragment_container, this.k);
            bpVar.a();
        }
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        cgqf cgqfVar = this.k;
        if (cgqfVar != null) {
            cgqfVar.onSaveInstanceState(bundle);
        }
    }
}
