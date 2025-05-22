package com.google.android.gms.thunderbird;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.auua;
import defpackage.digs;
import defpackage.dikv;
import defpackage.dilr;
import defpackage.ekut;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ThunderbirdFlagsUpdateIntentOperation extends IntentOperation {
    private static final String a = auua.f("com.google.android.gms.thunderbird");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (("com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) || a.equals(intent.getAction())) && "com.google.android.gms.thunderbird".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            dilr.d(dikv.b(this).i(new ekut() { // from class: dika
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    fgrc fgrcVar = (fgrc) obj;
                    if (!fgrcVar.b.L()) {
                        fgrcVar.U();
                    }
                    dijw dijwVar = (dijw) fgrcVar.b;
                    dijw dijwVar2 = dijw.a;
                    dijwVar.d = fgtj.a;
                    return fgrcVar;
                }
            }));
            digs.f();
        }
    }
}
