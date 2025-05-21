package com.google.android.gms.phonesky.recovery;

import android.content.Intent;
import defpackage.anya;
import defpackage.cwhj;
import defpackage.cwhm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class PhoneskyRecoveryModuleInitIntentOperation extends anya {
    @Override // defpackage.anya
    public final void b(Intent intent, int i) {
        if ((i & 2) == 0 && (i & 4) == 0 && (i & 8) == 0) {
            cwhj.b("Module triggered without updates or boot complete", new Object[0]);
        } else {
            new cwhm(this).a();
        }
    }
}
