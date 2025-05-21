package com.google.android.gms.fitness.service.goals;

import android.content.Context;
import android.content.Intent;
import defpackage.bgrt;
import defpackage.bgrv;
import defpackage.bgrz;
import defpackage.bgsp;
import defpackage.bxhl;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class FitGoalsChimeraBroker extends bgrv {
    @Override // defpackage.bgrv
    public final /* bridge */ /* synthetic */ bgrt b(String str) {
        return new bgsp(this, str, this.f);
    }

    @Override // defpackage.bgrv
    protected final bxhl c(Context context, bgrz bgrzVar) {
        return new bxhl(context, 125, d(), 3, bgrzVar);
    }

    @Override // defpackage.bgrv
    protected final boolean h(Intent intent) {
        return "com.google.android.gms.fitness.GoalsApi".equals(intent.getAction());
    }
}
