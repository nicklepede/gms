package com.google.android.gms.fitness.service.goals;

import android.content.Context;
import android.content.Intent;
import defpackage.biwj;
import defpackage.biwl;
import defpackage.biwp;
import defpackage.bixf;
import defpackage.bzqb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class FitGoalsChimeraBroker extends biwl {
    @Override // defpackage.biwl
    public final /* bridge */ /* synthetic */ biwj b(String str) {
        return new bixf(this, str, this.f);
    }

    @Override // defpackage.biwl
    protected final bzqb c(Context context, biwp biwpVar) {
        return new bzqb(context, 125, d(), 3, biwpVar);
    }

    @Override // defpackage.biwl
    protected final boolean h(Intent intent) {
        return "com.google.android.gms.fitness.GoalsApi".equals(intent.getAction());
    }
}
