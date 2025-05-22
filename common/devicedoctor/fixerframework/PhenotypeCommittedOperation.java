package com.google.android.gms.common.devicedoctor.fixerframework;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import defpackage.atsd;
import defpackage.atsj;
import defpackage.ekwo;
import defpackage.elgo;
import defpackage.epmi;
import defpackage.fplw;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class PhenotypeCommittedOperation extends IntentOperation {
    private final atsj a = new atsj();

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent != null) {
            fplw fplwVar = fplw.a;
            if (fplwVar.lK().G()) {
                String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
                Log.i("PTCommittedOperation", "Receive new configuration for ".concat(String.valueOf(stringExtra)));
                if (elgo.i(ekwo.e(',').i().d().n(fplwVar.lK().v())).contains(stringExtra)) {
                    Log.i("PTCommittedOperation", "Running Fixer Framework for ".concat(String.valueOf(stringExtra)));
                    atsd atsdVar = new atsd();
                    atsdVar.b = this;
                    atsdVar.a = epmi.PHENOTYPE_UPDATE;
                    this.a.a(atsdVar.a());
                }
            }
        }
    }
}
