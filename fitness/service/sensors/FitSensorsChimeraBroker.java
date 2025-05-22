package com.google.android.gms.fitness.service.sensors;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import defpackage.biwj;
import defpackage.biwp;
import defpackage.biwr;
import defpackage.biyx;
import defpackage.biyz;
import defpackage.bzqb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class FitSensorsChimeraBroker extends biwr {
    public FitSensorsChimeraBroker() {
        super("com.google.android.gms.fitness.service.sensors.FitSensorsBroker");
    }

    @Override // defpackage.biwl
    public final /* bridge */ /* synthetic */ biwj b(String str) {
        return new biyz(this, str, this.d, this.f);
    }

    @Override // defpackage.biwl
    protected final bzqb c(Context context, biwp biwpVar) {
        return new bzqb(context, 55, d(), 3, biwpVar);
    }

    @Override // defpackage.biwl
    protected final boolean h(Intent intent) {
        return "com.google.android.gms.fitness.SensorsApi".equals(intent.getAction());
    }

    @Override // defpackage.biwr, defpackage.biwl, android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 100) {
            return super.handleMessage(message);
        }
        for (biyz biyzVar : this.a.values()) {
            biyx biyxVar = biyzVar.k;
            int beginBroadcast = biyxVar.beginBroadcast();
            while (beginBroadcast > 0) {
                beginBroadcast--;
                biyzVar.o(biyzVar.n(beginBroadcast));
            }
            biyxVar.finishBroadcast();
            biyxVar.kill();
        }
        return true;
    }

    @Override // defpackage.biwr, defpackage.biwl, com.google.android.chimera.Service
    public final void onDestroy() {
        this.d.sendEmptyMessage(100);
        super.onDestroy();
    }
}
