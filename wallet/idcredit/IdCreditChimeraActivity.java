package com.google.android.gms.wallet.idcredit;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.Toolbar;
import com.google.android.gms.R;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.clientlog.LogContext;
import defpackage.diez;
import defpackage.difa;
import defpackage.dihb;
import defpackage.ding;
import defpackage.dirh;
import defpackage.efdk;
import defpackage.emen;
import defpackage.fape;
import defpackage.feen;
import defpackage.fsvg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class IdCreditChimeraActivity extends diez {
    public static Intent Z(Context context, Intent intent, BuyFlowConfig buyFlowConfig) {
        Intent intent2 = new Intent();
        intent2.setClassName(context, "com.google.android.gms.wallet.idcredit.IdCreditActivity");
        intent2.putExtras(intent.getExtras());
        intent2.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig);
        intent2.setAction("com.google.android.gms.wallet.firstparty.ACTION_VERIFY_IDENTITY");
        return intent2;
    }

    @Override // defpackage.diez
    protected final boolean N() {
        fape fapeVar = getIntent().getExtras().containsKey("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS") ? (fape) efdk.b(getIntent(), "com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS", (feen) fape.a.iB(7, null)) : null;
        return fapeVar != null && fsvg.a.a().e().b.contains(Integer.valueOf(fapeVar.b));
    }

    @Override // defpackage.diez
    protected final Intent i() {
        return dihb.i(this, 7, getIntent().getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS"), getIntent().getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS"), l(), getIntent().getLongExtra("com.google.android.gms.wallet.intentBuildTimeMs", 0L));
    }

    @Override // defpackage.diez, defpackage.pob, defpackage.qdy, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        if (Q()) {
            q(bundle, true, 5, emen.FLOW_TYPE_IDENTITY_CREDIT);
            super.onCreate(bundle);
            return;
        }
        Intent intent = getIntent();
        BuyFlowConfig buyFlowConfig = (BuyFlowConfig) intent.getParcelableExtra("com.google.android.gms.wallet.buyFlowConfig");
        ding.C(this, buyFlowConfig, ding.e, true);
        q(bundle, true, 5, emen.FLOW_TYPE_IDENTITY_CREDIT);
        super.onCreate(bundle);
        difa.b(this);
        setContentView(R.layout.wallet_activity_common_with_focus_stealer);
        d((Toolbar) findViewById(R.id.toolbar));
        kJ().o(true);
        if (((dirh) m()) == null) {
            if (intent.getExtras().containsKey("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN")) {
                byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN");
                String str = this.a;
                LogContext logContext = this.b;
                dirh dirhVar = new dirh();
                Bundle bZ = dirh.bZ(buyFlowConfig, str, logContext);
                bZ.putByteArray("initializeToken", byteArrayExtra);
                dirhVar.setArguments(bZ);
                B(dirhVar, R.id.fragment_holder);
            } else {
                if (!intent.getExtras().containsKey("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS")) {
                    throw new IllegalArgumentException("IdCreditChimeraActivity requires either encrypted parameters or initialization token");
                }
                byte[] byteArrayExtra2 = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
                String str2 = this.a;
                LogContext logContext2 = this.b;
                dirh dirhVar2 = new dirh();
                Bundle bZ2 = dirh.bZ(buyFlowConfig, str2, logContext2);
                bZ2.putByteArray("encryptedParams", byteArrayExtra2);
                dirhVar2.setArguments(bZ2);
                B(dirhVar2, R.id.fragment_holder);
            }
        }
        ding.A(findViewById(R.id.wallet_root));
    }

    @Override // defpackage.diez, defpackage.djew
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
