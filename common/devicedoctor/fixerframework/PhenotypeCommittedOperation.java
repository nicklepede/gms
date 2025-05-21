package com.google.android.gms.common.devicedoctor.fixerframework;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import defpackage.arpo;
import defpackage.arpu;
import defpackage.eijj;
import defpackage.eitj;
import defpackage.emyr;
import defpackage.fmty;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class PhenotypeCommittedOperation extends IntentOperation {
    private final arpu a = new arpu();

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent != null) {
            fmty fmtyVar = fmty.a;
            if (fmtyVar.a().G()) {
                String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
                Log.i("PTCommittedOperation", "Receive new configuration for ".concat(String.valueOf(stringExtra)));
                if (eitj.i(eijj.e(',').i().d().n(fmtyVar.a().v())).contains(stringExtra)) {
                    Log.i("PTCommittedOperation", "Running Fixer Framework for ".concat(String.valueOf(stringExtra)));
                    arpo arpoVar = new arpo();
                    arpoVar.b = this;
                    arpoVar.a = emyr.PHENOTYPE_UPDATE;
                    this.a.a(arpoVar.a());
                }
            }
        }
    }
}
