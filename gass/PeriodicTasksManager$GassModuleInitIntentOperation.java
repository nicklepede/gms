package com.google.android.gms.gass;

import android.content.Intent;
import defpackage.apzs;
import defpackage.aura;
import defpackage.bjxm;
import defpackage.fpuj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class PeriodicTasksManager$GassModuleInitIntentOperation extends apzs {
    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        aura.H(this, "com.google.android.gms.gass.GassService", true);
        boolean z = bjxm.a;
        intent.getAction();
        if (fpuj.i()) {
            bjxm.b(getBaseContext());
            bjxm.c(getBaseContext());
        } else {
            if (!bjxm.b) {
                bjxm.a(getBaseContext());
                bjxm.b = true;
            }
            if (!bjxm.c) {
                bjxm.d(getBaseContext());
                bjxm.c = true;
            }
        }
        if (fpuj.c()) {
            bjxm.f(getBaseContext());
        } else {
            if (bjxm.a) {
                return;
            }
            bjxm.e(getBaseContext());
            bjxm.a = true;
        }
    }
}
