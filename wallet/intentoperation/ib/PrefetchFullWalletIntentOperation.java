package com.google.android.gms.wallet.intentoperation.ib;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.tapandpay.firstparty.TransactionData;
import com.google.android.gms.wallet.service.ib.IbBuyFlowInput;
import com.google.android.gms.wallet.service.ib.IbMerchantParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.arwm;
import defpackage.arxd;
import defpackage.dewv;
import defpackage.dezg;
import defpackage.dikh;
import defpackage.dill;
import defpackage.diwn;
import defpackage.dixi;
import defpackage.dixn;
import defpackage.dixp;
import defpackage.diys;
import defpackage.dize;
import defpackage.dizr;
import defpackage.djbg;
import defpackage.djbh;
import defpackage.djby;
import defpackage.edna;
import defpackage.ehlo;
import defpackage.eiif;
import defpackage.fehp;
import java.security.SecureRandom;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PrefetchFullWalletIntentOperation extends IntentOperation {
    private diwn a;
    private dizr b;
    private SecureRandom c;
    private diys d;
    private dezg e;

    public static Intent a(Context context, BuyFlowConfig buyFlowConfig, String str, String str2) {
        Intent startIntent = IntentOperation.getStartIntent(context, PrefetchFullWalletIntentOperation.class, "com.google.android.gms.wallet.ib.PREFETCH_FULL_WALLET");
        arwm.s(startIntent);
        arxd.l(buyFlowConfig, startIntent, "com.google.android.gms.wallet.buyFlowConfig");
        startIntent.putExtra("googleTransactionId", str);
        startIntent.putExtra("merchantTransactionId", str2);
        return startIntent;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        Context applicationContext = getApplicationContext();
        dill dillVar = new dill(applicationContext);
        edna a = dikh.a(applicationContext);
        dize dizeVar = new dize(this, new djbg(this, dillVar, a), a);
        diwn a2 = diwn.a();
        SecureRandom c = djbh.c();
        diys diysVar = new diys(applicationContext);
        this.a = a2;
        this.b = dizeVar;
        this.c = c;
        this.d = diysVar;
        this.e = new dezg(this);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        fehp a;
        try {
            BuyFlowConfig buyFlowConfig = (BuyFlowConfig) arxd.b(intent, "com.google.android.gms.wallet.buyFlowConfig", BuyFlowConfig.CREATOR);
            String stringExtra = intent.getStringExtra("googleTransactionId");
            String stringExtra2 = intent.getStringExtra("merchantTransactionId");
            String b = eiif.b(stringExtra);
            String b2 = eiif.b(stringExtra2);
            if (buyFlowConfig == null || (a = this.d.a(b)) == null) {
                return;
            }
            IbBuyFlowInput c = IbBuyFlowInput.c(a.e);
            ehlo ehloVar = a.g;
            if (ehloVar == null) {
                ehloVar = ehlo.a;
            }
            String str = ehloVar.c;
            ehlo ehloVar2 = a.g;
            if (ehloVar2 == null) {
                ehloVar2 = ehlo.a;
            }
            if (dixi.ag(c, ehloVar2.c) != 3) {
                c.P(5);
                ehlo ehloVar3 = a.g;
                if (ehloVar3 == null) {
                    ehloVar3 = ehlo.a;
                }
                if (ehloVar3.i) {
                    dewv dewvVar = (dewv) this.a.c(new dixp(buyFlowConfig, new djby(this, this.e), str, b, c.a(str), new TransactionData(this.c.nextLong(), 0L, null, 0, Collections.singletonList(1), 0, false, null, null, null)));
                    if (!dewvVar.a().e()) {
                        return;
                    }
                    c.P(5);
                    c.x(djbh.f(dewvVar.b(), 2));
                }
                this.a.c(new dixn(buyFlowConfig, this.b, c, new IbMerchantParameters(0, b2, false, null), a.f.M()));
            }
        } catch (Throwable unused) {
            getApplicationContext();
        }
    }
}
