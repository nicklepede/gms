package com.google.android.gms.auth.easyunlock.authorization;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.aavw;
import defpackage.aawh;
import defpackage.aawi;
import defpackage.aawj;
import defpackage.aaws;
import defpackage.arlb;
import defpackage.asmf;
import defpackage.asot;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class EasyUnlockChimeraService extends Service {
    public static final asot a = aaws.a("EasyUnlockService");
    private static aawj c;
    public BluetoothAdapter b;
    private ExecutorService d;
    private Future e;

    public EasyUnlockChimeraService() {
    }

    public static Intent a(Context context) {
        return new Intent().setClassName(context, "com.google.android.gms.auth.easyunlock.authorization.InitializerIntentService");
    }

    public static aawj b() {
        aawj aawjVar;
        synchronized (EasyUnlockChimeraService.class) {
            aawjVar = c;
        }
        return aawjVar;
    }

    public static void c(aawj aawjVar) {
        synchronized (EasyUnlockChimeraService.class) {
            c = aawjVar;
        }
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        this.b = arlb.a(this);
        this.d = new asmf(1, 10);
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        Future future = this.e;
        if (future != null) {
            future.cancel(false);
            this.e = null;
        }
        aawj b = b();
        if (b != null) {
            b.a();
            c(null);
        }
        this.d.shutdown();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        Future future = this.e;
        if (future != null && !future.isDone()) {
            return 1;
        }
        this.e = this.d.submit(new aawh(this));
        return 1;
    }

    EasyUnlockChimeraService(aavw aavwVar, BluetoothAdapter bluetoothAdapter, aawi aawiVar, ExecutorService executorService) {
        this.b = bluetoothAdapter;
        this.d = executorService;
    }
}
