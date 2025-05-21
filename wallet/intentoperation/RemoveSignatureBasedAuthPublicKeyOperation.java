package com.google.android.gms.wallet.intentoperation;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.arxd;
import defpackage.dikp;
import defpackage.djbu;
import defpackage.ehob;
import defpackage.ehos;
import defpackage.fecj;
import defpackage.feeq;
import defpackage.fehj;
import defpackage.fehm;
import j$.util.DesugarCollections;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class RemoveSignatureBasedAuthPublicKeyOperation extends IntentOperation {
    private djbu a;

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.a = new djbu(getApplicationContext());
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        try {
            BuyFlowConfig buyFlowConfig = (BuyFlowConfig) arxd.b(intent, "com.google.android.gms.wallet.buyFlowConfig", BuyFlowConfig.CREATOR);
            int a = ehob.a(intent.getIntExtra("EXTRA_AUTHENTICATOR", 0));
            ApplicationParameters applicationParameters = buyFlowConfig.b;
            int i = applicationParameters.a;
            Account account = applicationParameters.b;
            fehm c = this.a.c(i, account);
            if (c != null) {
                fecj fecjVar = (fecj) c.iB(5, null);
                fecjVar.X(c);
                fehj fehjVar = (fehj) fecjVar;
                ArrayList arrayList = new ArrayList();
                for (ehos ehosVar : DesugarCollections.unmodifiableList(((fehm) fehjVar.b).g)) {
                    int a2 = ehob.a(ehosVar.f);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    if (a2 != a) {
                        arrayList.add(ehosVar);
                    }
                }
                if (!fehjVar.b.L()) {
                    fehjVar.U();
                }
                ((fehm) fehjVar.b).g = feeq.a;
                fehjVar.a(arrayList);
                this.a.f(i, account, (fehm) fehjVar.Q());
            }
            dikp.a(getApplicationContext(), buyFlowConfig).i(a);
        } catch (Exception unused) {
            getApplicationContext();
        }
    }
}
