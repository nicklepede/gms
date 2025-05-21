package com.google.android.gms.smartdevice.quickstart;

import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.chimera.Service;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import defpackage.arwm;
import defpackage.arxo;
import defpackage.asbo;
import defpackage.asmf;
import defpackage.bqna;
import defpackage.byhr;
import defpackage.dcvt;
import defpackage.dczl;
import defpackage.ddfm;
import defpackage.ddne;
import defpackage.ddqo;
import defpackage.ddqq;
import defpackage.ddri;
import defpackage.ddvb;
import defpackage.ddvd;
import defpackage.ddve;
import defpackage.ddwq;
import defpackage.ddwr;
import defpackage.ddws;
import defpackage.ddwu;
import defpackage.ddxk;
import defpackage.ddzc;
import defpackage.ddzd;
import defpackage.demw;
import defpackage.demy;
import defpackage.denq;
import defpackage.eloy;
import defpackage.fsfn;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class SourceQuickStartChimeraService extends Service implements dcvt {
    public static final arxo a = new denq(new String[]{"SourceQuickStartChimeraService"});
    public asbo b;
    public ddri c;
    public dczl d;
    public ddxk e;
    public ddzc f;
    public ddzd g;
    public ddwu h;
    public ddvb i;
    public String j = null;
    public ddve k;
    private Handler l;
    private ddfm m;

    public static void e(Context context) {
        a.d("Request to stop Service", new Object[0]);
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.smartdevice.quickstart.SourceQuickStartService");
        context.stopService(intent);
    }

    private final void f(int i) {
        try {
            ddvb ddvbVar = this.i;
            arwm.s(ddvbVar);
            ddvbVar.e(i);
        } catch (RemoteException | NullPointerException e) {
            a.n("Failed to call onError", e, new Object[0]);
        }
    }

    @Override // defpackage.dcvt
    public final void b(BootstrapCompletionResult bootstrapCompletionResult) {
        this.f.e(eloy.ACCOUNT_TRANSFER_SUCCESS);
        this.c.b();
    }

    @Override // defpackage.dcvt
    public final boolean c(BootstrapProgressResult bootstrapProgressResult) {
        return false;
    }

    @Override // defpackage.dcvt
    public final void d(int i, ddne ddneVar) {
        this.c.b();
        this.e.r();
        if (i != 10767 && i != 10769 && i != 10770) {
            this.f.g(i, ddneVar);
        } else if (i == 10767) {
            this.f.e(eloy.USER_VERIFICATION_SKIPPED);
        } else {
            this.d.b();
            this.d.c();
            f(i);
            e(this);
        }
        if (i == 10564 && this.e.E == 7) {
            f(10564);
        } else if (this.e.E == 3) {
            f(i);
        }
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        ddvd ddvdVar = new ddvd(this);
        this.k = ddvdVar;
        ddvdVar.asBinder();
        return ddvdVar;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        a.d("onCreate().", new Object[0]);
        super.onCreate();
        for (String str : fsfn.j().b) {
            Intent intent = new Intent("com.google.android.gms.smartdevice.quickstart.SOURCE_FLOW_START");
            intent.setFlags(268435456);
            intent.setPackage(str);
            sendBroadcast(intent);
        }
        HandlerThread handlerThread = new HandlerThread("SourceQuickStartBackground", 10);
        handlerThread.start();
        this.l = new ddwr(this, handlerThread.getLooper());
        this.f = ddzc.a(this);
        this.g = ddzd.f();
        this.d = new dczl(ddqq.a(this, "quickStart"), this, this.l);
        this.e = new ddxk(this, this.l, this, this.d);
        this.b = asbo.f(this);
        ddqo.a(this);
        this.c = new ddri(new asmf(1, 10), null, fsfn.a.a().k(), new ddws(this));
        if (!fsfn.p()) {
            this.c.a();
        }
        this.m = ddfm.b(this);
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        demw demwVar;
        a.d("onDestroy().", new Object[0]);
        this.c.b();
        ddxk ddxkVar = this.e;
        TracingBroadcastReceiver tracingBroadcastReceiver = ddxkVar.u;
        if (tracingBroadcastReceiver != null) {
            try {
                ddxkVar.g.unregisterReceiver(tracingBroadcastReceiver);
            } catch (IllegalArgumentException | IllegalStateException e) {
                ddxk.f.l(e);
            }
        }
        if (ddxkVar.t != null && Build.VERSION.SDK_INT >= 27) {
            ddxkVar.t.close();
        }
        byhr byhrVar = ddxkVar.r;
        if (byhrVar != null) {
            byhrVar.getLooper().quitSafely();
        }
        ddxkVar.r();
        ddri ddriVar = ddxkVar.D;
        if (ddriVar != null) {
            ddriVar.b();
        }
        ddwq ddwqVar = ddxkVar.G;
        if (ddwqVar != null && (demwVar = ddwqVar.g) != null) {
            demwVar.a();
            BluetoothSocket bluetoothSocket = ddwqVar.f;
            if (bluetoothSocket != null && bluetoothSocket.isConnected()) {
                try {
                    ddwqVar.f.close();
                } catch (IOException e2) {
                    ddwq.a.g("Could not close the client socket", e2, new Object[0]);
                }
            }
        }
        this.d.b();
        this.d.c();
        this.f.c();
        ddzd.e();
        demy.a(this.l);
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        a.d("onStartCommand.", new Object[0]);
        this.m.f(Arrays.asList(bqna.b(this).p("com.google")));
        return super.onStartCommand(intent, i, i2);
    }

    @Override // com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent) {
        this.e.z = false;
        return false;
    }

    @Override // defpackage.dcvt
    public final void a(String str) {
    }
}
