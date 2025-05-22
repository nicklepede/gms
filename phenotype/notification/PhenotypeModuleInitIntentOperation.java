package com.google.android.gms.phenotype.notification;

import android.content.Intent;
import defpackage.apzs;
import defpackage.aura;
import defpackage.cylm;
import defpackage.cynv;
import defpackage.cyoe;
import defpackage.cyqg;
import defpackage.dpya;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class PhenotypeModuleInitIntentOperation extends apzs {
    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        aura.H(this, "com.google.android.gms.phenotype.service.FlagOverrideReceiver", true);
        if ((i & 12) != 0) {
            cyqg.c(this);
        }
    }

    @Override // defpackage.apzs
    protected final void d(Intent intent) {
        int i = cyoe.b;
        if (dpya.j()) {
            cylm.b();
            cynv.a.e();
        }
    }
}
