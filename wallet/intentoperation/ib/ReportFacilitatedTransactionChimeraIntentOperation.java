package com.google.android.gms.wallet.intentoperation.ib;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.arxd;
import defpackage.dill;
import defpackage.disd;
import defpackage.diuh;
import defpackage.ehhq;
import defpackage.feay;
import defpackage.fecj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ReportFacilitatedTransactionChimeraIntentOperation extends IntentOperation {
    public dill a;
    private diuh b;

    public ReportFacilitatedTransactionChimeraIntentOperation() {
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        dill dillVar = new dill(getApplicationContext());
        this.b = new diuh(this, "ReportTxnIntentOp");
        this.a = dillVar;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        BuyFlowConfig buyFlowConfig = (BuyFlowConfig) arxd.b(intent, "com.google.android.gms.wallet.buyFlowConfig", BuyFlowConfig.CREATOR);
        fecj v = ehhq.a.v();
        feay w = feay.w(intent.getByteArrayExtra("com.google.android.gms.wallet.service.ib.ReportFacilitatedTransactionChimeraIntentOperation.transactionCompletionToken"));
        if (!v.b.L()) {
            v.U();
        }
        ehhq ehhqVar = (ehhq) v.b;
        ehhqVar.b |= 2;
        ehhqVar.c = w;
        ehhq ehhqVar2 = (ehhq) v.Q();
        Account account = buyFlowConfig.b.b;
        Log.i("ReportTxnIntentOp", "Reported facilitated transaction.");
        this.b.a(new disd(this, account, buyFlowConfig, ehhqVar2));
    }

    public ReportFacilitatedTransactionChimeraIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
