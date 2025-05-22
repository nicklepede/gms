package com.google.android.gms.people.backuplegacy.cp2;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.cvts;
import defpackage.cvwv;
import defpackage.cvxf;
import defpackage.cvxi;
import defpackage.cvxj;
import defpackage.cvxl;
import defpackage.cwof;
import defpackage.cwow;
import defpackage.ekvk;
import defpackage.enjv;
import defpackage.enjw;
import defpackage.fgrc;
import defpackage.fubp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class PeopleBackupOptOutIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Boolean valueOf;
        Boolean valueOf2;
        cwow.N();
        valueOf = Boolean.valueOf(fubp.a.lK().aq());
        if (valueOf.booleanValue()) {
            Context applicationContext = getApplicationContext();
            intent.getAction();
            String action = intent.getAction();
            if (!"com.google.android.gms.backup.action.OPT_OUT".equals(action)) {
                cwof.n("CBR_BackupOptOutIntentOperation", "Received unexcepted message: %s", action);
                return;
            }
            String string = intent.getExtras().getString("com.google.android.gms.backup.extra.optOut.accountName");
            valueOf2 = Boolean.valueOf(fubp.a.lK().ak());
            if (valueOf2.booleanValue() || cwow.a().booleanValue()) {
                try {
                    if (ekvk.c(string)) {
                        cwof.l("CBR_BackupOptOutIntentOperation", "Backup account null or empty");
                        return;
                    }
                    cvxf cvxfVar = new cvxf();
                    cvxfVar.b = System.currentTimeMillis();
                    cvxfVar.a = string;
                    cvxl.a().b(new cvxj(cvwv.a(applicationContext), cvxfVar, new cvxi(applicationContext)));
                } catch (Exception unused) {
                    cvts a = cvts.a();
                    fgrc v = enjv.a.v();
                    if (!v.b.L()) {
                        v.U();
                    }
                    enjv enjvVar = (enjv) v.b;
                    enjvVar.b |= 512;
                    enjvVar.i = true;
                    enjv enjvVar2 = (enjv) v.Q();
                    fgrc v2 = enjw.a.v();
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    enjw enjwVar = (enjw) v2.b;
                    enjvVar2.getClass();
                    enjwVar.m = enjvVar2;
                    enjwVar.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                    a.b((enjw) v2.Q());
                }
            }
        }
    }
}
