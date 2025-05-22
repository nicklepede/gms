package com.google.android.gms.wallet.fixinstrument;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.clientlog.LogContext;
import defpackage.atzb;
import defpackage.dkqk;
import defpackage.dkuo;
import defpackage.dkyr;
import defpackage.dlcd;
import defpackage.eijr;
import defpackage.eosb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class FixInstrumentRootChimeraActivity extends dkqk implements View.OnFocusChangeListener {
    private Toolbar h;
    private View i;
    private byte[] j;
    private byte[] k;
    private byte[] l;

    public static Intent Z(Context context, Intent intent, BuyFlowConfig buyFlowConfig) {
        Intent intent2 = new Intent();
        intent2.setClassName(context, "com.google.android.gms.wallet.fixinstrument.FixInstrumentRootActivity");
        intent2.putExtras(intent.getExtras());
        intent2.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig);
        intent2.setAction("com.google.android.gms.wallet.firstparty.ACTION_FIX_INSTRUMENT");
        return intent2;
    }

    @Override // defpackage.dkqk
    public final Intent i() {
        return dkuo.b(this, getIntent());
    }

    @Override // defpackage.dkqk, defpackage.rhf, defpackage.rxc, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        boolean z = true;
        dkyr.C(this, l(), dkyr.e, true);
        q(bundle, true, 8, eosb.FLOW_TYPE_FIX_INSTRUMENT);
        super.onCreate(bundle);
        setContentView(R.layout.wallet_activity_common_with_focus_stealer);
        this.j = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
        this.k = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN");
        this.l = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_AUTH_TOKEN");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.h = toolbar;
        d(toolbar);
        kY().o(true);
        View findViewById = findViewById(R.id.focus_stealer);
        this.i = findViewById;
        findViewById.setOnFocusChangeListener(this);
        if (((dlcd) m()) == null) {
            BuyFlowConfig l = l();
            String str = this.a;
            byte[] bArr = this.j;
            byte[] bArr2 = this.k;
            byte[] bArr3 = this.l;
            LogContext logContext = this.b;
            boolean z2 = bArr != null && bArr.length > 0;
            boolean z3 = bArr2 != null && bArr2.length > 0;
            atzb.c(z2 || z3, "Parameters or initializeToken is required to launch FixInstrument.");
            if (z2 && z3) {
                z = false;
            }
            atzb.c(z, "Only parameters or initializeToken should be set when launching FixInstrument.");
            dlcd dlcdVar = new dlcd();
            Bundle bY = dlcd.bY(l, str, logContext);
            if (bArr != null) {
                bY.putByteArray("parameters", bArr);
            }
            if (bArr2 != null) {
                bY.putByteArray("initializeToken", bArr2);
            }
            if (bArr3 != null) {
                bY.putByteArray("productAuthToken", bArr3);
            }
            dlcdVar.setArguments(bY);
            B(dlcdVar, R.id.fragment_holder);
        }
        dkyr.A(findViewById(R.id.wallet_root));
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z && view == this.i) {
            eijr.ai(this, view);
        }
    }
}
