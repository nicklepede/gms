package com.google.android.gms.auth.easyunlock.authorization;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.acvw;
import defpackage.acwh;
import defpackage.acwi;
import defpackage.acwj;
import defpackage.acws;
import defpackage.atnq;
import defpackage.aupz;
import defpackage.ausn;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class EasyUnlockChimeraService extends Service {
    public static final ausn a = acws.a("EasyUnlockService");
    private static acwj c;
    public BluetoothAdapter b;
    private ExecutorService d;
    private Future e;

    public EasyUnlockChimeraService() {
    }

    public static Intent a(Context context) {
        return new Intent().setClassName(context, "com.google.android.gms.auth.easyunlock.authorization.InitializerIntentService");
    }

    public static acwj b() {
        acwj acwjVar;
        synchronized (EasyUnlockChimeraService.class) {
            acwjVar = c;
        }
        return acwjVar;
    }

    public static void c(acwj acwjVar) {
        synchronized (EasyUnlockChimeraService.class) {
            c = acwjVar;
        }
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        this.b = atnq.a(this);
        this.d = new aupz(1, 10);
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        Future future = this.e;
        if (future != null) {
            future.cancel(false);
            this.e = null;
        }
        acwj b = b();
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
        this.e = this.d.submit(new acwh(this));
        return 1;
    }

    EasyUnlockChimeraService(acvw acvwVar, BluetoothAdapter bluetoothAdapter, acwi acwiVar, ExecutorService executorService) {
        this.b = bluetoothAdapter;
        this.d = executorService;
    }
}
