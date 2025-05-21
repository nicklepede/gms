package com.google.android.gms.fitness.service.sensors;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import defpackage.bgrt;
import defpackage.bgrz;
import defpackage.bgsb;
import defpackage.bguh;
import defpackage.bguj;
import defpackage.bxhl;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class FitSensorsChimeraBroker extends bgsb {
    public FitSensorsChimeraBroker() {
        super("com.google.android.gms.fitness.service.sensors.FitSensorsBroker");
    }

    @Override // defpackage.bgrv
    public final /* bridge */ /* synthetic */ bgrt b(String str) {
        return new bguj(this, str, this.d, this.f);
    }

    @Override // defpackage.bgrv
    protected final bxhl c(Context context, bgrz bgrzVar) {
        return new bxhl(context, 55, d(), 3, bgrzVar);
    }

    @Override // defpackage.bgrv
    protected final boolean h(Intent intent) {
        return "com.google.android.gms.fitness.SensorsApi".equals(intent.getAction());
    }

    @Override // defpackage.bgsb, defpackage.bgrv, android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 100) {
            return super.handleMessage(message);
        }
        for (bguj bgujVar : this.a.values()) {
            bguh bguhVar = bgujVar.k;
            int beginBroadcast = bguhVar.beginBroadcast();
            while (beginBroadcast > 0) {
                beginBroadcast--;
                bgujVar.o(bgujVar.n(beginBroadcast));
            }
            bguhVar.finishBroadcast();
            bguhVar.kill();
        }
        return true;
    }

    @Override // defpackage.bgsb, defpackage.bgrv, com.google.android.chimera.Service
    public final void onDestroy() {
        this.d.sendEmptyMessage(100);
        super.onDestroy();
    }
}
