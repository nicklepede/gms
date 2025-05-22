package com.google.android.gms.wallet.intentoperation.ib;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.atzs;
import defpackage.dkww;
import defpackage.dldo;
import defpackage.dlfs;
import defpackage.ejuw;
import defpackage.fgpr;
import defpackage.fgrc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ReportFacilitatedTransactionChimeraIntentOperation extends IntentOperation {
    public dkww a;
    private dlfs b;

    public ReportFacilitatedTransactionChimeraIntentOperation() {
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        dkww dkwwVar = new dkww(getApplicationContext());
        this.b = new dlfs(this, "ReportTxnIntentOp");
        this.a = dkwwVar;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        BuyFlowConfig buyFlowConfig = (BuyFlowConfig) atzs.b(intent, "com.google.android.gms.wallet.buyFlowConfig", BuyFlowConfig.CREATOR);
        fgrc v = ejuw.a.v();
        fgpr w = fgpr.w(intent.getByteArrayExtra("com.google.android.gms.wallet.service.ib.ReportFacilitatedTransactionChimeraIntentOperation.transactionCompletionToken"));
        if (!v.b.L()) {
            v.U();
        }
        ejuw ejuwVar = (ejuw) v.b;
        ejuwVar.b |= 2;
        ejuwVar.c = w;
        ejuw ejuwVar2 = (ejuw) v.Q();
        Account account = buyFlowConfig.b.b;
        Log.i("ReportTxnIntentOp", "Reported facilitated transaction.");
        this.b.a(new dldo(this, account, buyFlowConfig, ejuwVar2));
    }

    public ReportFacilitatedTransactionChimeraIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
