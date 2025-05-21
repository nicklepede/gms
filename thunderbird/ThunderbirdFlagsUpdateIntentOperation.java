package com.google.android.gms.thunderbird;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.asqg;
import defpackage.dfvn;
import defpackage.dfzq;
import defpackage.dgam;
import defpackage.eiho;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ThunderbirdFlagsUpdateIntentOperation extends IntentOperation {
    private static final String a = asqg.f("com.google.android.gms.thunderbird");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (("com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) || a.equals(intent.getAction())) && "com.google.android.gms.thunderbird".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            dgam.d(dfzq.b(this).i(new eiho() { // from class: dfyv
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    fecj fecjVar = (fecj) obj;
                    if (!fecjVar.b.L()) {
                        fecjVar.U();
                    }
                    dfyr dfyrVar = (dfyr) fecjVar.b;
                    dfyr dfyrVar2 = dfyr.a;
                    dfyrVar.d = feeq.a;
                    return fecjVar;
                }
            }));
            dfvn.f();
        }
    }
}
