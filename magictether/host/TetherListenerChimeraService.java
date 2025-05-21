package com.google.android.gms.magictether.host;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.asmf;
import defpackage.asot;
import defpackage.cbom;
import defpackage.cbpv;
import defpackage.cbpz;
import defpackage.cbqo;
import defpackage.cbrf;
import defpackage.cbry;
import defpackage.cbrz;
import defpackage.cbta;
import defpackage.cbvk;
import defpackage.ensv;
import defpackage.fpzd;
import defpackage.fpzk;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class TetherListenerChimeraService extends Service {
    public static final asot a = cbta.a("TetherListenerService");
    public static BluetoothStateChangeReceiver b;
    public final Object c;
    public cbpz d;
    public cbry e;
    private final ensv f;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class BluetoothStateChangeReceiver extends TracingBroadcastReceiver {
        public BluetoothStateChangeReceiver() {
            super("auth_magictether");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, Intent intent) {
            Intent a = TetherListenerChimeraService.a(context);
            if (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10) == 12) {
                context.startService(a);
            } else {
                context.stopService(a);
            }
        }
    }

    public TetherListenerChimeraService() {
        this(new asmf(1, 10), null);
    }

    public static Intent a(Context context) {
        return (!cbpv.c(fpzk.y()) || (fpzk.a.a().o() && cbom.a(Build.MANUFACTURER) && context.getPackageManager().hasSystemFeature("com.samsung.android.feature.INSTANT_HOTSPOT_NOT_SUPPORTED"))) ? new Intent().setClassName(context, "com.google.android.gms.magictether.host.TetherListenerService") : cbvk.a();
    }

    @Override // com.google.android.chimera.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append("==== TetherListenerService Dump ====\n");
        synchronized (this.c) {
            cbpz cbpzVar = this.d;
            if (cbpzVar != null) {
                cbpzVar.b(printWriter);
            }
        }
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        if (fpzd.i()) {
            this.f.shutdown();
            super.onDestroy();
            return;
        }
        cbrf.a(this, true);
        cbry cbryVar = this.e;
        if (cbryVar != null) {
            cbryVar.d();
            cbry cbryVar2 = this.e;
            cbqo cbqoVar = cbryVar2.b;
            if (cbqoVar != null) {
                cbqoVar.a();
                cbryVar2.b = null;
            }
            this.e = null;
        }
        synchronized (this.c) {
            cbpz cbpzVar = this.d;
            if (cbpzVar != null) {
                cbpzVar.a();
                this.d = null;
            }
        }
        this.f.shutdown();
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (fpzd.i()) {
            stopSelf();
            return 2;
        }
        this.f.execute(new cbrz(this));
        return 1;
    }

    public TetherListenerChimeraService(ensv ensvVar, cbpz cbpzVar) {
        this.c = new Object();
        this.f = ensvVar;
        this.d = cbpzVar;
    }
}
