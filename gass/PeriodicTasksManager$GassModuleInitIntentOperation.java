package com.google.android.gms.gass;

import android.content.Intent;
import defpackage.anya;
import defpackage.asng;
import defpackage.bhsx;
import defpackage.fnck;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class PeriodicTasksManager$GassModuleInitIntentOperation extends anya {
    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        asng.H(this, "com.google.android.gms.gass.GassService", true);
        boolean z = bhsx.a;
        intent.getAction();
        if (fnck.i()) {
            bhsx.b(getBaseContext());
            bhsx.c(getBaseContext());
        } else {
            if (!bhsx.b) {
                bhsx.a(getBaseContext());
                bhsx.b = true;
            }
            if (!bhsx.c) {
                bhsx.d(getBaseContext());
                bhsx.c = true;
            }
        }
        if (fnck.c()) {
            bhsx.f(getBaseContext());
        } else {
            if (bhsx.a) {
                return;
            }
            bhsx.e(getBaseContext());
            bhsx.a = true;
        }
    }
}
