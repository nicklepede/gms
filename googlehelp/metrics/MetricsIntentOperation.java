package com.google.android.gms.googlehelp.metrics;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.common.HelpConfig;
import defpackage.apta;
import defpackage.asej;
import defpackage.asot;
import defpackage.bivk;
import defpackage.bjag;
import defpackage.bjay;
import defpackage.bjbk;
import defpackage.bjdc;
import defpackage.ejhf;
import defpackage.febw;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.folw;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class MetricsIntentOperation extends IntentOperation {
    private static final asot a = asot.b("gH_MetricsIntentOp", asej.GOOGLE_HELP);
    private bjay b;

    public static void a(Context context, bjdc bjdcVar, boolean z) {
        GoogleHelp googleHelp = new GoogleHelp("gms:googlehelp");
        if (!bjdcVar.h.isEmpty()) {
            googleHelp.D = bjdcVar.h;
        }
        googleHelp.e = bjdcVar.d;
        fecj fecjVar = (fecj) bjdcVar.iB(5, null);
        fecjVar.X(bjdcVar);
        if (((bjdc) fecjVar.b).s <= 0) {
            long currentTimeMillis = System.currentTimeMillis();
            if (!fecjVar.b.L()) {
                fecjVar.U();
            }
            bjdc bjdcVar2 = (bjdc) fecjVar.b;
            bjdcVar2.b |= 16777216;
            bjdcVar2.s = currentTimeMillis;
        }
        if (bivk.b(folw.i()) && !bivk.b(folw.a.a().i())) {
            if (z) {
                if (!fecjVar.b.L()) {
                    fecjVar.U();
                }
                bjdc.b((bjdc) fecjVar.b);
            }
            bjag.a(context, ((bjdc) fecjVar.Q()).r(), googleHelp);
            return;
        }
        if (!z) {
            bjag.a(context, ((bjdc) fecjVar.Q()).r(), googleHelp);
            return;
        }
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        bjdc.b((bjdc) fecjVar.b);
        new ArrayList(1).add((bjdc) fecjVar.Q());
    }

    public static void b(Context context, String str, String str2, int i, int i2, boolean z) {
        fecj v = bjdc.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        bjdc bjdcVar = (bjdc) fecpVar;
        bjdcVar.i = i - 1;
        bjdcVar.b |= 256;
        if (!fecpVar.L()) {
            v.U();
        }
        fecp fecpVar2 = v.b;
        bjdc bjdcVar2 = (bjdc) fecpVar2;
        bjdcVar2.j = i2 - 1;
        bjdcVar2.b |= 1024;
        if (!fecpVar2.L()) {
            v.U();
        }
        bjdc bjdcVar3 = (bjdc) v.b;
        str2.getClass();
        bjdcVar3.b |= 2;
        bjdcVar3.d = str2;
        if (!TextUtils.isEmpty(str)) {
            if (!v.b.L()) {
                v.U();
            }
            bjdc bjdcVar4 = (bjdc) v.b;
            str.getClass();
            bjdcVar4.b |= 64;
            bjdcVar4.h = str;
        }
        a(context, (bjdc) v.Q(), z);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onDestroy() {
        bjay bjayVar = this.b;
        if (bjayVar != null) {
            bjayVar.close();
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            ((ejhf) a.i()).x("Null intent received.");
            return;
        }
        if (!intent.hasExtra("EXTRA_METRIC_DATA")) {
            ((ejhf) a.i()).x("No metric data sent!");
            return;
        }
        try {
            fecj fecjVar = (fecj) bjdc.a.v().D(intent.getByteArrayExtra("EXTRA_METRIC_DATA"), febw.a());
            bjbk.G(fecjVar, this);
            bjdc bjdcVar = (bjdc) fecjVar.Q();
            HelpConfig helpConfig = new HelpConfig();
            helpConfig.b = bjdcVar.d;
            helpConfig.e = bjdcVar.h;
            helpConfig.C = bjdcVar.w;
            helpConfig.c = bjdcVar.f;
            if (intent.hasExtra("EXTRA_GOOGLE_HELP")) {
                helpConfig = HelpConfig.d((GoogleHelp) intent.getParcelableExtra("EXTRA_GOOGLE_HELP"), this);
                bjbk.C(fecjVar, helpConfig, this);
            }
            if (helpConfig.h) {
                if (bivk.b(folw.j())) {
                    bjay bjayVar = new bjay(this);
                    this.b = bjayVar;
                    bjayVar.c((bjdc) fecjVar.Q());
                }
                if (bivk.b(folw.i())) {
                    Account account = helpConfig.d;
                    bjbk.D(new apta(getApplicationContext(), folw.e(), account != null ? account.name : null), fecjVar, this);
                }
            }
        } catch (fedk e) {
            ((ejhf) ((ejhf) a.i()).s(e)).x("Could not parse metric data.");
        }
    }
}
