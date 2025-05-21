package com.google.android.gms.personalsafety.service;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.chimera.Service;
import com.google.android.gms.chimera.modules.personalsafety.AppContextProvider;
import com.google.android.gms.personalsafety.psa.ConnectivityProtectionLockingIntentOperation;
import defpackage.asmf;
import defpackage.asot;
import defpackage.aspo;
import defpackage.asqh;
import defpackage.asqt;
import defpackage.asqu;
import defpackage.byhr;
import defpackage.cvph;
import defpackage.cvpo;
import defpackage.cvqk;
import defpackage.cvqq;
import defpackage.cvrp;
import defpackage.cvtz;
import defpackage.cvua;
import defpackage.eiig;
import defpackage.ensj;
import defpackage.ips;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class PSAChimeraService extends Service implements asqt {
    public cvqk b;
    private asqu e;
    private cvrp f;
    private Context h;
    private final Executor d = new asmf(Integer.MAX_VALUE, 9);
    public final Object a = new Object();
    public boolean c = false;
    private boolean g = false;

    private final void d() {
        final cvrp cvrpVar = this.f;
        eiig.x(cvrpVar);
        if (asqh.g()) {
            cvrpVar.b();
        } else {
            byhr byhrVar = cvrpVar.c;
            eiig.x(byhrVar);
            byhrVar.post(new Runnable() { // from class: cvrj
                @Override // java.lang.Runnable
                public final void run() {
                    cvrp.this.b();
                }
            });
        }
        this.g = false;
        asot asotVar = cvpo.a;
    }

    @Override // defpackage.asqt
    public final void a() {
        if (cvqq.b(this)) {
            return;
        }
        stopSelf();
    }

    public final void c() {
        cvqk cvqkVar = this.b;
        eiig.x(cvqkVar);
        if (cvqkVar.d) {
            cvqkVar.b.unregisterNetworkCallback(cvqkVar.c);
        }
        cvqkVar.d = false;
        ConnectivityProtectionLockingIntentOperation.b(cvqkVar.a);
        this.c = false;
        asot asotVar = cvpo.a;
    }

    @Override // com.google.android.chimera.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append("==== START PSA Dump ====\n");
        aspo aspoVar = new aspo(printWriter, "  ");
        printWriter.append("\n== Flags ==\n");
        aspoVar.b();
        cvtz.a(aspoVar);
        aspoVar.a();
        printWriter.append("\n== Backup dump of Snd flags ==\n");
        aspoVar.b();
        cvtz.b(aspoVar);
        aspoVar.a();
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.h = this;
        asqu asquVar = new asqu(this, new byhr(Looper.getMainLooper()));
        this.e = asquVar;
        asquVar.b(this);
        Context a = AppContextProvider.a();
        if (asqh.c()) {
            synchronized (this.a) {
                this.b = new cvqk(a);
                if (asqh.e()) {
                    this.f = new cvrp(a);
                }
                int i = ips.a;
            }
        }
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        super.onDestroy();
        this.e.c();
        if (asqh.c()) {
            synchronized (this.a) {
                c();
                if (asqh.e()) {
                    d();
                }
                int i = ips.a;
            }
        }
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (asqh.c()) {
            Context context = this.h;
            eiig.x(context);
            if (cvqq.b(context)) {
                Context context2 = this.h;
                eiig.x(context2);
                if (cvph.a(context2)) {
                    ensj.t(cvqk.d() ? ensj.i(true) : cvqk.a(this), new cvua(this), this.d);
                    if (asqh.e()) {
                        synchronized (this.a) {
                            if (!cvrp.c(this)) {
                                d();
                            } else if (!this.g) {
                                final cvrp cvrpVar = this.f;
                                eiig.x(cvrpVar);
                                if (asqh.g()) {
                                    cvrpVar.a(new Runnable() { // from class: cvrh
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            cvrp cvrpVar2 = cvrp.this;
                                            Executor executor = cvrpVar2.b;
                                            eiig.x(executor);
                                            cvrpVar2.a.addOnSubscriptionsChangedListener(executor, cvrpVar2.d);
                                        }
                                    });
                                } else {
                                    byhr byhrVar = cvrpVar.c;
                                    eiig.x(byhrVar);
                                    byhrVar.post(new Runnable() { // from class: cvri
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            final cvrp cvrpVar2 = cvrp.this;
                                            cvrpVar2.a(new Runnable() { // from class: cvrk
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    cvrp cvrpVar3 = cvrp.this;
                                                    cvrpVar3.a.addOnSubscriptionsChangedListener(cvrpVar3.d);
                                                }
                                            });
                                        }
                                    });
                                }
                                this.g = true;
                                asot asotVar = cvpo.a;
                            }
                        }
                    }
                    int i3 = ips.a;
                    return 1;
                }
            }
        }
        stopSelf(i2);
        return 2;
    }

    @Override // defpackage.asqt
    public final void b() {
    }
}
