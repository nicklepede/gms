package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.cgdi;
import defpackage.cgdj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class ChimeraPackageMeasurementService extends Service implements cgdi {
    private cgdj a;

    private final cgdj d() {
        if (this.a == null) {
            this.a = new cgdj(this);
        }
        return this.a;
    }

    @Override // defpackage.cgdi
    public final boolean b(int i) {
        return stopSelfResult(i);
    }

    @Override // defpackage.cgdi
    public final void c(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.cgdi
    public final void iA(Intent intent) {
        ChimeraPackageMeasurementReceiver.completeWakefulIntent(intent);
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return d().a(intent);
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        d().b();
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        d().c();
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final void onRebind(Intent intent) {
        d();
        cgdj.e(intent);
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        d().f(intent, i2);
        return 2;
    }

    @Override // com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent) {
        d();
        cgdj.g(intent);
        return true;
    }
}
