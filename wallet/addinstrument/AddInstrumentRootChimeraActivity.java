package com.google.android.gms.wallet.addinstrument;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import com.google.android.gms.R;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.ui.common.ProgressSpinnerView;
import com.google.android.wallet.clientlog.LogContext;
import defpackage.atzb;
import defpackage.dkqk;
import defpackage.dkqp;
import defpackage.dkyr;
import defpackage.eosb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class AddInstrumentRootChimeraActivity extends dkqk {
    private Toolbar h;
    private byte[] i;
    private byte[] j;

    public static Intent Z(Context context, Intent intent, BuyFlowConfig buyFlowConfig) {
        Intent intent2 = new Intent();
        intent2.setClassName(context, "com.google.android.gms.wallet.addinstrument.AddInstrumentRootActivity");
        intent2.putExtras(intent.getExtras());
        intent2.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig);
        intent2.setAction("com.google.android.gms.wallet.firstparty.ACTION_ADD_INSTRUMENT_WIDGET");
        return intent2;
    }

    @Override // defpackage.dkqk, defpackage.rhf, defpackage.rxc, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        dkyr.C(this, l(), dkyr.e, true);
        q(bundle, true, 7, eosb.FLOW_TYPE_ADD_INSTRUMENT);
        super.onCreate(bundle);
        setContentView(R.layout.wallet_activity_add_instrument_widget);
        if (intent.getExtras().containsKey("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS")) {
            this.i = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
        } else {
            if (!intent.getExtras().containsKey("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS")) {
                throw new IllegalArgumentException("AddInstrumentRootChimeraActivity requires AddInstrumentParameters");
            }
            this.i = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS");
        }
        this.j = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_AUTH_TOKEN");
        Toolbar toolbar = (Toolbar) findViewById(R.id.add_instrument_toolbar);
        this.h = toolbar;
        d(toolbar);
        kY().o(true);
        ((dkqk) this).d = (ProgressSpinnerView) findViewById(R.id.progress_spinner_container);
        if (((dkqp) m()) == null) {
            BuyFlowConfig l = l();
            String str = this.a;
            byte[] bArr = this.i;
            byte[] bArr2 = this.j;
            LogContext logContext = this.b;
            atzb.c(bArr != null && bArr.length > 0, "Parameters is required to lauch AddInstrument.");
            dkqp dkqpVar = new dkqp();
            Bundle bY = dkqp.bY(l, str, logContext);
            bY.putByteArray("parameters", bArr);
            if (bArr2 != null) {
                bY.putByteArray("productAuthToken", bArr2);
            }
            dkqpVar.setArguments(bY);
            B(dkqpVar, R.id.add_instrument_container);
        }
        dkyr.A(findViewById(R.id.wallet_root));
    }
}
