package com.google.android.gms.wallet.idcredit;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.Toolbar;
import com.google.android.gms.R;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.clientlog.LogContext;
import defpackage.dkqk;
import defpackage.dkql;
import defpackage.dksm;
import defpackage.dkyr;
import defpackage.dlcs;
import defpackage.ehqn;
import defpackage.eosb;
import defpackage.fddt;
import defpackage.fgtg;
import defpackage.fvra;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class IdCreditChimeraActivity extends dkqk {
    public static Intent Z(Context context, Intent intent, BuyFlowConfig buyFlowConfig) {
        Intent intent2 = new Intent();
        intent2.setClassName(context, "com.google.android.gms.wallet.idcredit.IdCreditActivity");
        intent2.putExtras(intent.getExtras());
        intent2.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig);
        intent2.setAction("com.google.android.gms.wallet.firstparty.ACTION_VERIFY_IDENTITY");
        return intent2;
    }

    @Override // defpackage.dkqk
    protected final boolean N() {
        fddt fddtVar = getIntent().getExtras().containsKey("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS") ? (fddt) ehqn.b(getIntent(), "com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS", (fgtg) fddt.a.iQ(7, null)) : null;
        return fddtVar != null && fvra.a.lK().e().b.contains(Integer.valueOf(fddtVar.b));
    }

    @Override // defpackage.dkqk
    protected final Intent i() {
        return dksm.i(this, 7, getIntent().getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS"), getIntent().getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS"), l(), getIntent().getLongExtra("com.google.android.gms.wallet.intentBuildTimeMs", 0L));
    }

    @Override // defpackage.dkqk, defpackage.rhf, defpackage.rxc, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        if (Q()) {
            q(bundle, true, 5, eosb.FLOW_TYPE_IDENTITY_CREDIT);
            super.onCreate(bundle);
            return;
        }
        Intent intent = getIntent();
        BuyFlowConfig buyFlowConfig = (BuyFlowConfig) intent.getParcelableExtra("com.google.android.gms.wallet.buyFlowConfig");
        dkyr.C(this, buyFlowConfig, dkyr.e, true);
        q(bundle, true, 5, eosb.FLOW_TYPE_IDENTITY_CREDIT);
        super.onCreate(bundle);
        dkql.b(this);
        setContentView(R.layout.wallet_activity_common_with_focus_stealer);
        d((Toolbar) findViewById(R.id.toolbar));
        kY().o(true);
        if (((dlcs) m()) == null) {
            if (intent.getExtras().containsKey("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN")) {
                byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN");
                String str = this.a;
                LogContext logContext = this.b;
                dlcs dlcsVar = new dlcs();
                Bundle bY = dlcs.bY(buyFlowConfig, str, logContext);
                bY.putByteArray("initializeToken", byteArrayExtra);
                dlcsVar.setArguments(bY);
                B(dlcsVar, R.id.fragment_holder);
            } else {
                if (!intent.getExtras().containsKey("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS")) {
                    throw new IllegalArgumentException("IdCreditChimeraActivity requires either encrypted parameters or initialization token");
                }
                byte[] byteArrayExtra2 = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
                String str2 = this.a;
                LogContext logContext2 = this.b;
                dlcs dlcsVar2 = new dlcs();
                Bundle bY2 = dlcs.bY(buyFlowConfig, str2, logContext2);
                bY2.putByteArray("encryptedParams", byteArrayExtra2);
                dlcsVar2.setArguments(bY2);
                B(dlcsVar2, R.id.fragment_holder);
            }
        }
        dkyr.A(findViewById(R.id.wallet_root));
    }

    @Override // defpackage.dkqk, defpackage.dlqp
    public final /* bridge */ /* synthetic */ void z(Parcelable parcelable, boolean z) {
        byte[] bArr;
        IdCreditResult idCreditResult = (IdCreditResult) parcelable;
        Intent T = T(z);
        if (idCreditResult != null && (bArr = idCreditResult.a) != null && bArr.length > 0) {
            T.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN", bArr);
        }
        H(-1, T);
    }
}
