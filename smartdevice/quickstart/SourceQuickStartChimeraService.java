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
import defpackage.atzb;
import defpackage.auad;
import defpackage.aued;
import defpackage.aupz;
import defpackage.bsup;
import defpackage.caqj;
import defpackage.dfgy;
import defpackage.dfkq;
import defpackage.dfqr;
import defpackage.dfyj;
import defpackage.dgbt;
import defpackage.dgbv;
import defpackage.dgcn;
import defpackage.dggg;
import defpackage.dggi;
import defpackage.dggj;
import defpackage.dghu;
import defpackage.dghv;
import defpackage.dghw;
import defpackage.dghy;
import defpackage.dgio;
import defpackage.dgkg;
import defpackage.dgkh;
import defpackage.dgxz;
import defpackage.dgyb;
import defpackage.dgyt;
import defpackage.eocm;
import defpackage.fvak;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class SourceQuickStartChimeraService extends Service implements dfgy {
    public static final auad a = new dgyt(new String[]{"SourceQuickStartChimeraService"});
    public aued b;
    public dgcn c;
    public dfkq d;
    public dgio e;
    public dgkg f;
    public dgkh g;
    public dghy h;
    public dggg i;
    public String j = null;
    public dggj k;
    private Handler l;
    private dfqr m;

    public static void e(Context context) {
        a.d("Request to stop Service", new Object[0]);
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.smartdevice.quickstart.SourceQuickStartService");
        context.stopService(intent);
    }

    private final void f(int i) {
        try {
            dggg dgggVar = this.i;
            atzb.s(dgggVar);
            dgggVar.e(i);
        } catch (RemoteException | NullPointerException e) {
            a.n("Failed to call onError", e, new Object[0]);
        }
    }

    @Override // defpackage.dfgy
    public final void b(BootstrapCompletionResult bootstrapCompletionResult) {
        this.f.e(eocm.ACCOUNT_TRANSFER_SUCCESS);
        this.c.b();
    }

    @Override // defpackage.dfgy
    public final boolean c(BootstrapProgressResult bootstrapProgressResult) {
        return false;
    }

    @Override // defpackage.dfgy
    public final void d(int i, dfyj dfyjVar) {
        this.c.b();
        this.e.r();
        if (i != 10767 && i != 10769 && i != 10770) {
            this.f.g(i, dfyjVar);
        } else if (i == 10767) {
            this.f.e(eocm.USER_VERIFICATION_SKIPPED);
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
        dggi dggiVar = new dggi(this);
        this.k = dggiVar;
        dggiVar.asBinder();
        return dggiVar;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        a.d("onCreate().", new Object[0]);
        super.onCreate();
        for (String str : fvak.j().b) {
            Intent intent = new Intent("com.google.android.gms.smartdevice.quickstart.SOURCE_FLOW_START");
            intent.setFlags(268435456);
            intent.setPackage(str);
            sendBroadcast(intent);
        }
        HandlerThread handlerThread = new HandlerThread("SourceQuickStartBackground", 10);
        handlerThread.start();
        this.l = new dghv(this, handlerThread.getLooper());
        this.f = dgkg.a(this);
        this.g = dgkh.f();
        this.d = new dfkq(dgbv.a(this, "quickStart"), this, this.l);
        this.e = new dgio(this, this.l, this, this.d);
        this.b = aued.f(this);
        dgbt.a(this);
        this.c = new dgcn(new aupz(1, 10), null, fvak.a.lK().k(), new dghw(this));
        if (!fvak.p()) {
            this.c.a();
        }
        this.m = dfqr.b(this);
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        dgxz dgxzVar;
        a.d("onDestroy().", new Object[0]);
        this.c.b();
        dgio dgioVar = this.e;
        TracingBroadcastReceiver tracingBroadcastReceiver = dgioVar.u;
        if (tracingBroadcastReceiver != null) {
            try {
                dgioVar.g.unregisterReceiver(tracingBroadcastReceiver);
            } catch (IllegalArgumentException | IllegalStateException e) {
                dgio.f.l(e);
            }
        }
        if (dgioVar.t != null && Build.VERSION.SDK_INT >= 27) {
            dgioVar.t.close();
        }
        caqj caqjVar = dgioVar.r;
        if (caqjVar != null) {
            caqjVar.getLooper().quitSafely();
        }
        dgioVar.r();
        dgcn dgcnVar = dgioVar.D;
        if (dgcnVar != null) {
            dgcnVar.b();
        }
        dghu dghuVar = dgioVar.G;
        if (dghuVar != null && (dgxzVar = dghuVar.g) != null) {
            dgxzVar.a();
            BluetoothSocket bluetoothSocket = dghuVar.f;
            if (bluetoothSocket != null && bluetoothSocket.isConnected()) {
                try {
                    dghuVar.f.close();
                } catch (IOException e2) {
                    dghu.a.g("Could not close the client socket", e2, new Object[0]);
                }
            }
        }
        this.d.b();
        this.d.c();
        this.f.c();
        dgkh.e();
        dgyb.a(this.l);
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        a.d("onStartCommand.", new Object[0]);
        this.m.f(Arrays.asList(bsup.b(this).p("com.google")));
        return super.onStartCommand(intent, i, i2);
    }

    @Override // com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent) {
        this.e.z = false;
        return false;
    }

    @Override // defpackage.dfgy
    public final void a(String str) {
    }
}
