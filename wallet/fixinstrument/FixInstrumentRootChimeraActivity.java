package com.google.android.gms.wallet.fixinstrument;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.clientlog.LogContext;
import defpackage.arwm;
import defpackage.diez;
import defpackage.dije;
import defpackage.ding;
import defpackage.diqs;
import defpackage.efwo;
import defpackage.emen;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class FixInstrumentRootChimeraActivity extends diez implements View.OnFocusChangeListener {
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

    @Override // defpackage.diez
    public final Intent i() {
        return dije.b(this, getIntent());
    }

    @Override // defpackage.diez, defpackage.pob, defpackage.qdy, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        boolean z = true;
        ding.C(this, l(), ding.e, true);
        q(bundle, true, 8, emen.FLOW_TYPE_FIX_INSTRUMENT);
        super.onCreate(bundle);
        setContentView(R.layout.wallet_activity_common_with_focus_stealer);
        this.j = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
        this.k = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN");
        this.l = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_AUTH_TOKEN");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.h = toolbar;
        d(toolbar);
        kJ().o(true);
        View findViewById = findViewById(R.id.focus_stealer);
        this.i = findViewById;
        findViewById.setOnFocusChangeListener(this);
        if (((diqs) m()) == null) {
            BuyFlowConfig l = l();
            String str = this.a;
            byte[] bArr = this.j;
            byte[] bArr2 = this.k;
            byte[] bArr3 = this.l;
            LogContext logContext = this.b;
            boolean z2 = bArr != null && bArr.length > 0;
            boolean z3 = bArr2 != null && bArr2.length > 0;
            arwm.c(z2 || z3, "Parameters or initializeToken is required to launch FixInstrument.");
            if (z2 && z3) {
                z = false;
            }
            arwm.c(z, "Only parameters or initializeToken should be set when launching FixInstrument.");
            diqs diqsVar = new diqs();
            Bundle bZ = diqs.bZ(l, str, logContext);
            if (bArr != null) {
                bZ.putByteArray("parameters", bArr);
            }
            if (bArr2 != null) {
                bZ.putByteArray("initializeToken", bArr2);
            }
            if (bArr3 != null) {
                bZ.putByteArray("productAuthToken", bArr3);
            }
            diqsVar.setArguments(bZ);
            B(diqsVar, R.id.fragment_holder);
        }
        ding.A(findViewById(R.id.wallet_root));
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z && view == this.i) {
            efwo.ai(this, view);
        }
    }
}
