package com.google.android.gms.wallet.intentoperation.ib;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.tapandpay.firstparty.TransactionData;
import com.google.android.gms.wallet.service.ib.IbBuyFlowInput;
import com.google.android.gms.wallet.service.ib.IbMerchantParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.atzb;
import defpackage.atzs;
import defpackage.dhhz;
import defpackage.dhkm;
import defpackage.dkvs;
import defpackage.dkww;
import defpackage.dlhy;
import defpackage.dljb;
import defpackage.dljg;
import defpackage.dlji;
import defpackage.dlkl;
import defpackage.dlkx;
import defpackage.dllk;
import defpackage.dlmz;
import defpackage.dlna;
import defpackage.dlnr;
import defpackage.efzw;
import defpackage.ejyu;
import defpackage.ekvk;
import defpackage.fgwi;
import java.security.SecureRandom;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class PrefetchFullWalletIntentOperation extends IntentOperation {
    private dlhy a;
    private dllk b;
    private SecureRandom c;
    private dlkl d;
    private dhkm e;

    public static Intent a(Context context, BuyFlowConfig buyFlowConfig, String str, String str2) {
        Intent startIntent = IntentOperation.getStartIntent(context, PrefetchFullWalletIntentOperation.class, "com.google.android.gms.wallet.ib.PREFETCH_FULL_WALLET");
        atzb.s(startIntent);
        atzs.l(buyFlowConfig, startIntent, "com.google.android.gms.wallet.buyFlowConfig");
        startIntent.putExtra("googleTransactionId", str);
        startIntent.putExtra("merchantTransactionId", str2);
        return startIntent;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        Context applicationContext = getApplicationContext();
        dkww dkwwVar = new dkww(applicationContext);
        efzw a = dkvs.a(applicationContext);
        dlkx dlkxVar = new dlkx(this, new dlmz(this, dkwwVar, a), a);
        dlhy a2 = dlhy.a();
        SecureRandom c = dlna.c();
        dlkl dlklVar = new dlkl(applicationContext);
        this.a = a2;
        this.b = dlkxVar;
        this.c = c;
        this.d = dlklVar;
        this.e = new dhkm(this);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        fgwi a;
        try {
            BuyFlowConfig buyFlowConfig = (BuyFlowConfig) atzs.b(intent, "com.google.android.gms.wallet.buyFlowConfig", BuyFlowConfig.CREATOR);
            String stringExtra = intent.getStringExtra("googleTransactionId");
            String stringExtra2 = intent.getStringExtra("merchantTransactionId");
            String b = ekvk.b(stringExtra);
            String b2 = ekvk.b(stringExtra2);
            if (buyFlowConfig == null || (a = this.d.a(b)) == null) {
                return;
            }
            IbBuyFlowInput c = IbBuyFlowInput.c(a.e);
            ejyu ejyuVar = a.g;
            if (ejyuVar == null) {
                ejyuVar = ejyu.a;
            }
            String str = ejyuVar.c;
            ejyu ejyuVar2 = a.g;
            if (ejyuVar2 == null) {
                ejyuVar2 = ejyu.a;
            }
            if (dljb.ai(c, ejyuVar2.c) != 3) {
                c.P(5);
                ejyu ejyuVar3 = a.g;
                if (ejyuVar3 == null) {
                    ejyuVar3 = ejyu.a;
                }
                if (ejyuVar3.i) {
                    dhhz dhhzVar = (dhhz) this.a.c(new dlji(buyFlowConfig, new dlnr(this, this.e), str, b, c.a(str), new TransactionData(this.c.nextLong(), 0L, null, 0, Collections.singletonList(1), 0, false, null, null, null)));
                    if (!dhhzVar.a().e()) {
                        return;
                    }
                    c.P(5);
                    c.x(dlna.f(dhhzVar.b(), 2));
                }
                this.a.c(new dljg(buyFlowConfig, this.b, c, new IbMerchantParameters(0, b2, false, null), a.f.M()));
            }
        } catch (Throwable unused) {
            getApplicationContext();
        }
    }
}
