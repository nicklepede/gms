package com.google.android.gms.wallet.intentoperation.ib;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.aswd;
import defpackage.asxd;
import defpackage.atzb;
import defpackage.atzs;
import defpackage.dkww;
import defpackage.dldn;
import defpackage.dlfs;
import defpackage.dlhr;
import defpackage.dljb;
import defpackage.ejut;
import defpackage.ejuu;
import defpackage.fdga;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fvzl;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ReportErrorChimeraIntentOperation extends IntentOperation {
    public dkww a;
    private Context b;
    private dlhr c;
    private ModuleManager d;
    private dlfs e;

    public ReportErrorChimeraIntentOperation() {
    }

    public static void a(BuyFlowConfig buyFlowConfig, String str, int i, int i2, int i3, Context context) {
        if (i2 == 7 || !fvzl.a.lK().e()) {
            return;
        }
        atzb.t(buyFlowConfig, "buyFlowConfig is required");
        Intent startIntent = IntentOperation.getStartIntent(context, ReportErrorChimeraIntentOperation.class, "com.google.android.gms.wallet.ib.REPORT_ERROR");
        atzs.l(buyFlowConfig, startIntent, "com.google.android.gms.wallet.buyFlowConfig");
        startIntent.putExtra("com.google.android.gms.wallet.service.ib.ReportErrorChimeraIntentOperation.googleTransactionId", str);
        startIntent.putExtra("com.google.android.gms.wallet.service.ib.ReportErrorChimeraIntentOperation.apiCall", i - 1);
        startIntent.putExtra("com.google.android.gms.wallet.service.ib.ReportErrorChimeraIntentOperation.clientPublicErrorCode", i2);
        startIntent.putExtra("com.google.android.gms.wallet.service.ib.ReportErrorChimeraIntentOperation.internalErrorCode", i3);
        context.startService(startIntent);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.b = getApplicationContext();
        dlhr dlhrVar = new dlhr(this.b);
        ModuleManager moduleManager = ModuleManager.get(this);
        dkww dkwwVar = new dkww(this.b);
        this.e = new dlfs(this, "ReportErrorIntentOp");
        this.c = dlhrVar;
        this.d = moduleManager;
        this.a = dkwwVar;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        BuyFlowConfig buyFlowConfig = (BuyFlowConfig) atzs.b(intent, "com.google.android.gms.wallet.buyFlowConfig", BuyFlowConfig.CREATOR);
        fgrc v = ejuu.a.v();
        int a = ejut.a(intent.getIntExtra("com.google.android.gms.wallet.service.ib.ReportErrorChimeraIntentOperation.apiCall", 0));
        if (!v.b.L()) {
            v.U();
        }
        ejuu ejuuVar = (ejuu) v.b;
        int i = a - 1;
        if (a == 0) {
            throw null;
        }
        ejuuVar.h = i;
        ejuuVar.b |= 32;
        int intExtra = intent.getIntExtra("com.google.android.gms.wallet.service.ib.ReportErrorChimeraIntentOperation.clientPublicErrorCode", 13);
        if (!v.b.L()) {
            v.U();
        }
        ejuu ejuuVar2 = (ejuu) v.b;
        ejuuVar2.b |= 16;
        ejuuVar2.g = intExtra;
        int intExtra2 = intent.getIntExtra("com.google.android.gms.wallet.service.ib.ReportErrorChimeraIntentOperation.internalErrorCode", 0);
        if (!v.b.L()) {
            v.U();
        }
        ejuu ejuuVar3 = (ejuu) v.b;
        ejuuVar3.b |= 8;
        ejuuVar3.f = intExtra2;
        dlhr dlhrVar = this.c;
        String str = buyFlowConfig.c;
        atzb.s(str);
        fdga x = dljb.x(dlhrVar.a(str));
        if (!v.b.L()) {
            v.U();
        }
        ejuu ejuuVar4 = (ejuu) v.b;
        x.getClass();
        ejuuVar4.e = x;
        ejuuVar4.b |= 4;
        aswd aswdVar = aswd.a;
        int a2 = asxd.a(this.b);
        if (!v.b.L()) {
            v.U();
        }
        ejuu ejuuVar5 = (ejuu) v.b;
        ejuuVar5.b |= 1;
        ejuuVar5.c = a2;
        long j = this.d.getCurrentModule().moduleVersion;
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        ejuu ejuuVar6 = (ejuu) fgriVar;
        ejuuVar6.b |= 2;
        ejuuVar6.d = j;
        int i2 = buyFlowConfig.b.a;
        if (!fgriVar.L()) {
            v.U();
        }
        ejuu ejuuVar7 = (ejuu) v.b;
        ejuuVar7.b |= 128;
        ejuuVar7.i = i2;
        ejuu ejuuVar8 = (ejuu) v.Q();
        Account account = buyFlowConfig.b.b;
        Locale locale = Locale.US;
        int a3 = ejut.a(ejuuVar8.h);
        if (a3 == 0) {
            a3 = 1;
        }
        Log.w("ReportErrorIntentOp", String.format(locale, "Reported %d.%d.%d", Integer.valueOf(a3 - 1), Integer.valueOf(ejuuVar8.g), Integer.valueOf(ejuuVar8.f)));
        this.e.a(new dldn(this, account, buyFlowConfig, ejuuVar8));
    }

    public ReportErrorChimeraIntentOperation(Context context) {
        attachBaseContext(context);
        this.b = getApplicationContext();
    }
}
