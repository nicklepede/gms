package com.google.android.gms.magictether.host;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.aupz;
import defpackage.ausn;
import defpackage.cdxe;
import defpackage.cdyn;
import defpackage.cdyr;
import defpackage.cdzg;
import defpackage.cdzx;
import defpackage.ceaq;
import defpackage.cear;
import defpackage.cebs;
import defpackage.ceec;
import defpackage.eqgo;
import defpackage.fssz;
import defpackage.fstg;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class TetherListenerChimeraService extends Service {
    public static final ausn a = cebs.a("TetherListenerService");
    public static BluetoothStateChangeReceiver b;
    public final Object c;
    public cdyr d;
    public ceaq e;
    private final eqgo f;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class BluetoothStateChangeReceiver extends TracingBroadcastReceiver {
        public BluetoothStateChangeReceiver() {
            super("auth_magictether");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, Intent intent) {
            Intent a = TetherListenerChimeraService.a(context);
            if (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10) == 12) {
                context.startService(a);
            } else {
                context.stopService(a);
            }
        }
    }

    public TetherListenerChimeraService() {
        this(new aupz(1, 10), null);
    }

    public static Intent a(Context context) {
        return (!cdyn.c(fstg.y()) || (fstg.a.lK().o() && cdxe.a(Build.MANUFACTURER) && context.getPackageManager().hasSystemFeature("com.samsung.android.feature.INSTANT_HOTSPOT_NOT_SUPPORTED"))) ? new Intent().setClassName(context, "com.google.android.gms.magictether.host.TetherListenerService") : ceec.a();
    }

    @Override // com.google.android.chimera.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append("==== TetherListenerService Dump ====\n");
        synchronized (this.c) {
            cdyr cdyrVar = this.d;
            if (cdyrVar != null) {
                cdyrVar.b(printWriter);
            }
        }
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        if (fssz.i()) {
            this.f.shutdown();
            super.onDestroy();
            return;
        }
        cdzx.a(this, true);
        ceaq ceaqVar = this.e;
        if (ceaqVar != null) {
            ceaqVar.d();
            ceaq ceaqVar2 = this.e;
            cdzg cdzgVar = ceaqVar2.b;
            if (cdzgVar != null) {
                cdzgVar.a();
                ceaqVar2.b = null;
            }
            this.e = null;
        }
        synchronized (this.c) {
            cdyr cdyrVar = this.d;
            if (cdyrVar != null) {
                cdyrVar.a();
                this.d = null;
            }
        }
        this.f.shutdown();
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (fssz.i()) {
            stopSelf();
            return 2;
        }
        this.f.execute(new cear(this));
        return 1;
    }

    public TetherListenerChimeraService(eqgo eqgoVar, cdyr cdyrVar) {
        this.c = new Object();
        this.f = eqgoVar;
        this.d = cdyrVar;
    }
}
