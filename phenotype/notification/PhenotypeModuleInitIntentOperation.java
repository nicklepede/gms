package com.google.android.gms.phenotype.notification;

import android.content.Intent;
import defpackage.anya;
import defpackage.asng;
import defpackage.cwbp;
import defpackage.cwdy;
import defpackage.cweh;
import defpackage.cwgj;
import defpackage.dnnr;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class PhenotypeModuleInitIntentOperation extends anya {
    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        asng.H(this, "com.google.android.gms.phenotype.service.FlagOverrideReceiver", true);
        if ((i & 12) != 0) {
            cwgj.c(this);
        }
    }

    @Override // defpackage.anya
    protected final void d(Intent intent) {
        int i = cweh.b;
        if (dnnr.j()) {
            cwbp.b();
            cwdy.a.e();
        }
    }
}
