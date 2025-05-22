package com.google.android.gms.googlehelp.metrics;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.common.HelpConfig;
import defpackage.arvr;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bkzz;
import defpackage.blev;
import defpackage.blfn;
import defpackage.blfz;
import defpackage.blhr;
import defpackage.eluo;
import defpackage.fgqp;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.frep;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class MetricsIntentOperation extends IntentOperation {
    private static final ausn a = ausn.b("gH_MetricsIntentOp", auid.GOOGLE_HELP);
    private blfn b;

    public static void a(Context context, blhr blhrVar, boolean z) {
        GoogleHelp googleHelp = new GoogleHelp("gms:googlehelp");
        if (!blhrVar.h.isEmpty()) {
            googleHelp.D = blhrVar.h;
        }
        googleHelp.e = blhrVar.d;
        fgrc fgrcVar = (fgrc) blhrVar.iQ(5, null);
        fgrcVar.X(blhrVar);
        if (((blhr) fgrcVar.b).s <= 0) {
            long currentTimeMillis = System.currentTimeMillis();
            if (!fgrcVar.b.L()) {
                fgrcVar.U();
            }
            blhr blhrVar2 = (blhr) fgrcVar.b;
            blhrVar2.b |= 16777216;
            blhrVar2.s = currentTimeMillis;
        }
        if (bkzz.b(frep.i()) && !bkzz.b(frep.a.lK().i())) {
            if (z) {
                if (!fgrcVar.b.L()) {
                    fgrcVar.U();
                }
                blhr.b((blhr) fgrcVar.b);
            }
            blev.a(context, ((blhr) fgrcVar.Q()).r(), googleHelp);
            return;
        }
        if (!z) {
            blev.a(context, ((blhr) fgrcVar.Q()).r(), googleHelp);
            return;
        }
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        blhr.b((blhr) fgrcVar.b);
        new ArrayList(1).add((blhr) fgrcVar.Q());
    }

    public static void b(Context context, String str, String str2, int i, int i2, boolean z) {
        fgrc v = blhr.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        blhr blhrVar = (blhr) fgriVar;
        blhrVar.i = i - 1;
        blhrVar.b |= 256;
        if (!fgriVar.L()) {
            v.U();
        }
        fgri fgriVar2 = v.b;
        blhr blhrVar2 = (blhr) fgriVar2;
        blhrVar2.j = i2 - 1;
        blhrVar2.b |= 1024;
        if (!fgriVar2.L()) {
            v.U();
        }
        blhr blhrVar3 = (blhr) v.b;
        str2.getClass();
        blhrVar3.b |= 2;
        blhrVar3.d = str2;
        if (!TextUtils.isEmpty(str)) {
            if (!v.b.L()) {
                v.U();
            }
            blhr blhrVar4 = (blhr) v.b;
            str.getClass();
            blhrVar4.b |= 64;
            blhrVar4.h = str;
        }
        a(context, (blhr) v.Q(), z);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onDestroy() {
        blfn blfnVar = this.b;
        if (blfnVar != null) {
            blfnVar.close();
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            ((eluo) a.i()).x("Null intent received.");
            return;
        }
        if (!intent.hasExtra("EXTRA_METRIC_DATA")) {
            ((eluo) a.i()).x("No metric data sent!");
            return;
        }
        try {
            fgrc fgrcVar = (fgrc) blhr.a.v().D(intent.getByteArrayExtra("EXTRA_METRIC_DATA"), fgqp.a());
            blfz.G(fgrcVar, this);
            blhr blhrVar = (blhr) fgrcVar.Q();
            HelpConfig helpConfig = new HelpConfig();
            helpConfig.b = blhrVar.d;
            helpConfig.e = blhrVar.h;
            helpConfig.C = blhrVar.w;
            helpConfig.c = blhrVar.f;
            if (intent.hasExtra("EXTRA_GOOGLE_HELP")) {
                helpConfig = HelpConfig.d((GoogleHelp) intent.getParcelableExtra("EXTRA_GOOGLE_HELP"), this);
                blfz.C(fgrcVar, helpConfig, this);
            }
            if (helpConfig.h) {
                if (bkzz.b(frep.j())) {
                    blfn blfnVar = new blfn(this);
                    this.b = blfnVar;
                    blfnVar.c((blhr) fgrcVar.Q());
                }
                if (bkzz.b(frep.i())) {
                    Account account = helpConfig.d;
                    blfz.D(new arvr(getApplicationContext(), frep.e(), account != null ? account.name : null), fgrcVar, this);
                }
            }
        } catch (fgsd e) {
            ((eluo) ((eluo) a.i()).s(e)).x("Could not parse metric data.");
        }
    }
}
