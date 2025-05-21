package com.google.android.gms.wallet.intentoperation.ib;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.aqto;
import defpackage.aquo;
import defpackage.arwm;
import defpackage.arxd;
import defpackage.dill;
import defpackage.disc;
import defpackage.diuh;
import defpackage.diwg;
import defpackage.dixi;
import defpackage.ehhn;
import defpackage.ehho;
import defpackage.farl;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.ftdx;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ReportErrorChimeraIntentOperation extends IntentOperation {
    public dill a;
    private Context b;
    private diwg c;
    private ModuleManager d;
    private diuh e;

    public ReportErrorChimeraIntentOperation() {
    }

    public static void a(BuyFlowConfig buyFlowConfig, String str, int i, int i2, int i3, Context context) {
        if (i2 == 7 || !ftdx.a.a().e()) {
            return;
        }
        arwm.t(buyFlowConfig, "buyFlowConfig is required");
        Intent startIntent = IntentOperation.getStartIntent(context, ReportErrorChimeraIntentOperation.class, "com.google.android.gms.wallet.ib.REPORT_ERROR");
        arxd.l(buyFlowConfig, startIntent, "com.google.android.gms.wallet.buyFlowConfig");
        startIntent.putExtra("com.google.android.gms.wallet.service.ib.ReportErrorChimeraIntentOperation.googleTransactionId", str);
        startIntent.putExtra("com.google.android.gms.wallet.service.ib.ReportErrorChimeraIntentOperation.apiCall", i - 1);
        startIntent.putExtra("com.google.android.gms.wallet.service.ib.ReportErrorChimeraIntentOperation.clientPublicErrorCode", i2);
        startIntent.putExtra("com.google.android.gms.wallet.service.ib.ReportErrorChimeraIntentOperation.internalErrorCode", i3);
        context.startService(startIntent);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.b = getApplicationContext();
        diwg diwgVar = new diwg(this.b);
        ModuleManager moduleManager = ModuleManager.get(this);
        dill dillVar = new dill(this.b);
        this.e = new diuh(this, "ReportErrorIntentOp");
        this.c = diwgVar;
        this.d = moduleManager;
        this.a = dillVar;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        BuyFlowConfig buyFlowConfig = (BuyFlowConfig) arxd.b(intent, "com.google.android.gms.wallet.buyFlowConfig", BuyFlowConfig.CREATOR);
        fecj v = ehho.a.v();
        int a = ehhn.a(intent.getIntExtra("com.google.android.gms.wallet.service.ib.ReportErrorChimeraIntentOperation.apiCall", 0));
        if (!v.b.L()) {
            v.U();
        }
        ehho ehhoVar = (ehho) v.b;
        int i = a - 1;
        if (a == 0) {
            throw null;
        }
        ehhoVar.h = i;
        ehhoVar.b |= 32;
        int intExtra = intent.getIntExtra("com.google.android.gms.wallet.service.ib.ReportErrorChimeraIntentOperation.clientPublicErrorCode", 13);
        if (!v.b.L()) {
            v.U();
        }
        ehho ehhoVar2 = (ehho) v.b;
        ehhoVar2.b |= 16;
        ehhoVar2.g = intExtra;
        int intExtra2 = intent.getIntExtra("com.google.android.gms.wallet.service.ib.ReportErrorChimeraIntentOperation.internalErrorCode", 0);
        if (!v.b.L()) {
            v.U();
        }
        ehho ehhoVar3 = (ehho) v.b;
        ehhoVar3.b |= 8;
        ehhoVar3.f = intExtra2;
        diwg diwgVar = this.c;
        String str = buyFlowConfig.c;
        arwm.s(str);
        farl x = dixi.x(diwgVar.a(str));
        if (!v.b.L()) {
            v.U();
        }
        ehho ehhoVar4 = (ehho) v.b;
        x.getClass();
        ehhoVar4.e = x;
        ehhoVar4.b |= 4;
        aqto aqtoVar = aqto.a;
        int a2 = aquo.a(this.b);
        if (!v.b.L()) {
            v.U();
        }
        ehho ehhoVar5 = (ehho) v.b;
        ehhoVar5.b |= 1;
        ehhoVar5.c = a2;
        long j = this.d.getCurrentModule().moduleVersion;
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        ehho ehhoVar6 = (ehho) fecpVar;
        ehhoVar6.b |= 2;
        ehhoVar6.d = j;
        int i2 = buyFlowConfig.b.a;
        if (!fecpVar.L()) {
            v.U();
        }
        ehho ehhoVar7 = (ehho) v.b;
        ehhoVar7.b |= 128;
        ehhoVar7.i = i2;
        ehho ehhoVar8 = (ehho) v.Q();
        Account account = buyFlowConfig.b.b;
        Locale locale = Locale.US;
        int a3 = ehhn.a(ehhoVar8.h);
        if (a3 == 0) {
            a3 = 1;
        }
        Log.w("ReportErrorIntentOp", String.format(locale, "Reported %d.%d.%d", Integer.valueOf(a3 - 1), Integer.valueOf(ehhoVar8.g), Integer.valueOf(ehhoVar8.f)));
        this.e.a(new disc(this, account, buyFlowConfig, ehhoVar8));
    }

    public ReportErrorChimeraIntentOperation(Context context) {
        attachBaseContext(context);
        this.b = getApplicationContext();
    }
}
