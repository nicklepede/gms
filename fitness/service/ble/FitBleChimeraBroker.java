package com.google.android.gms.fitness.service.ble;

import android.content.Context;
import android.content.Intent;
import defpackage.bgrt;
import defpackage.bgrv;
import defpackage.bgrz;
import defpackage.bgsh;
import defpackage.bxhl;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class FitBleChimeraBroker extends bgrv {
    @Override // defpackage.bgrv
    public final /* bridge */ /* synthetic */ bgrt b(String str) {
        return new bgsh(this, str, this.e, this.f);
    }

    @Override // defpackage.bgrv
    protected final bxhl c(Context context, bgrz bgrzVar) {
        return new bxhl(context, 59, d(), 3, bgrzVar);
    }

    @Override // defpackage.bgrv
    protected final boolean h(Intent intent) {
        return "com.google.android.gms.fitness.BleApi".equals(intent.getAction());
    }
}
