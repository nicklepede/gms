package com.google.android.gms.gass;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.asej;
import defpackage.asot;
import defpackage.bhsv;
import defpackage.bhsw;
import defpackage.bhte;
import defpackage.bhtf;
import defpackage.bhuq;
import defpackage.bhur;
import defpackage.ejhf;
import defpackage.febw;
import defpackage.fecp;
import defpackage.feep;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GassIntentOperation extends IntentOperation {
    protected static final String a = "GassIntentOperation";
    private static final asot b = asot.b(a, asej.GASS);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            ((ejhf) b.j()).x("Intent cannot be null.");
            return;
        }
        try {
            byte[] byteArray = intent.getExtras().getByteArray("IntentParameter");
            bhur bhurVar = bhur.a;
            int length = byteArray.length;
            febw febwVar = febw.a;
            feep feepVar = feep.a;
            fecp y = fecp.y(bhurVar, byteArray, 0, length, febw.a);
            fecp.M(y);
            bhur bhurVar2 = (bhur) y;
            int i = bhtf.a;
            int a2 = bhuq.a(bhurVar2.c);
            if (a2 == 0) {
                a2 = 1;
            }
            int i2 = a2 - 1;
            bhte bhsvVar = i2 != 1 ? i2 != 2 ? null : new bhsv(this) : new bhsw();
            if (bhsvVar == null) {
                ((ejhf) b.j()).x("Failed to create task");
            } else {
                bhsvVar.a(this, bhurVar2);
            }
        } catch (IOException e) {
            ((ejhf) ((ejhf) b.j()).s(e)).x("Failed to parse task info");
        }
    }
}
