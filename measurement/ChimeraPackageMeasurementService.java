package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.cduk;
import defpackage.cdul;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class ChimeraPackageMeasurementService extends Service implements cduk {
    private cdul a;

    private final cdul d() {
        if (this.a == null) {
            this.a = new cdul(this);
        }
        return this.a;
    }

    @Override // defpackage.cduk
    public final boolean b(int i) {
        return stopSelfResult(i);
    }

    @Override // defpackage.cduk
    public final void c(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.cduk
    public final void il(Intent intent) {
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
        cdul.e(intent);
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        d().f(intent, i2);
        return 2;
    }

    @Override // com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent) {
        d();
        cdul.g(intent);
        return true;
    }
}
