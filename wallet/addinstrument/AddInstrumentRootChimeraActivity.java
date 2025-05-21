package com.google.android.gms.wallet.addinstrument;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import com.google.android.gms.R;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.ui.common.ProgressSpinnerView;
import com.google.android.wallet.clientlog.LogContext;
import defpackage.arwm;
import defpackage.diez;
import defpackage.dife;
import defpackage.ding;
import defpackage.emen;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class AddInstrumentRootChimeraActivity extends diez {
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

    @Override // defpackage.diez, defpackage.pob, defpackage.qdy, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        ding.C(this, l(), ding.e, true);
        q(bundle, true, 7, emen.FLOW_TYPE_ADD_INSTRUMENT);
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
        kJ().o(true);
        ((diez) this).d = (ProgressSpinnerView) findViewById(R.id.progress_spinner_container);
        if (((dife) m()) == null) {
            BuyFlowConfig l = l();
            String str = this.a;
            byte[] bArr = this.i;
            byte[] bArr2 = this.j;
            LogContext logContext = this.b;
            arwm.c(bArr != null && bArr.length > 0, "Parameters is required to lauch AddInstrument.");
            dife difeVar = new dife();
            Bundle bZ = dife.bZ(l, str, logContext);
            bZ.putByteArray("parameters", bArr);
            if (bArr2 != null) {
                bZ.putByteArray("productAuthToken", bArr2);
            }
            difeVar.setArguments(bZ);
            B(difeVar, R.id.add_instrument_container);
        }
        ding.A(findViewById(R.id.wallet_root));
    }
}
