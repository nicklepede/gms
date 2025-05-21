package com.google.android.gms.people.backuplegacy.cp2;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.ctkm;
import defpackage.ctnp;
import defpackage.ctnz;
import defpackage.ctoc;
import defpackage.ctod;
import defpackage.ctof;
import defpackage.cuey;
import defpackage.cufp;
import defpackage.eiif;
import defpackage.ekwj;
import defpackage.ekwk;
import defpackage.fecj;
import defpackage.frhu;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class PeopleBackupOptOutIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Boolean valueOf;
        Boolean valueOf2;
        cufp.O();
        valueOf = Boolean.valueOf(frhu.a.a().aq());
        if (valueOf.booleanValue()) {
            Context applicationContext = getApplicationContext();
            intent.getAction();
            String action = intent.getAction();
            if (!"com.google.android.gms.backup.action.OPT_OUT".equals(action)) {
                cuey.n("BackupOptOutIntentOperation", "Received unexcepted message: %s", action);
                return;
            }
            String string = intent.getExtras().getString("com.google.android.gms.backup.extra.optOut.accountName");
            valueOf2 = Boolean.valueOf(frhu.a.a().ak());
            if (valueOf2.booleanValue() || cufp.a().booleanValue()) {
                try {
                    if (eiif.c(string)) {
                        cuey.l("BackupOptOutIntentOperation", "Backup account null or empty");
                        return;
                    }
                    ctnz ctnzVar = new ctnz();
                    ctnzVar.c = System.currentTimeMillis();
                    ctnzVar.a = string;
                    ctof.a().b(new ctod(ctnp.a(applicationContext), ctnzVar, new ctoc(applicationContext)));
                } catch (Exception unused) {
                    ctkm a = ctkm.a();
                    fecj v = ekwj.a.v();
                    if (!v.b.L()) {
                        v.U();
                    }
                    ekwj ekwjVar = (ekwj) v.b;
                    ekwjVar.b |= 512;
                    ekwjVar.l = true;
                    ekwj ekwjVar2 = (ekwj) v.Q();
                    fecj v2 = ekwk.a.v();
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    ekwk ekwkVar = (ekwk) v2.b;
                    ekwjVar2.getClass();
                    ekwkVar.m = ekwjVar2;
                    ekwkVar.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                    a.b((ekwk) v2.Q());
                }
            }
        }
    }
}
