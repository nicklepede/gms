package com.google.android.gms.personalsafety.service;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.chimera.Service;
import com.google.android.gms.chimera.modules.personalsafety.AppContextProvider;
import com.google.android.gms.personalsafety.psa.ConnectivityProtectionLockingIntentOperation;
import defpackage.aupz;
import defpackage.ausn;
import defpackage.auti;
import defpackage.auub;
import defpackage.auun;
import defpackage.auuo;
import defpackage.caqj;
import defpackage.cxyx;
import defpackage.cxze;
import defpackage.cyaa;
import defpackage.cyag;
import defpackage.cybf;
import defpackage.cydw;
import defpackage.cydx;
import defpackage.ekvl;
import defpackage.eqgc;
import defpackage.iri;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class PSAChimeraService extends Service implements auun {
    public cyaa b;
    private auuo e;
    private cybf f;
    private Context h;
    private final Executor d = new aupz(Integer.MAX_VALUE, 9);
    public final Object a = new Object();
    public boolean c = false;
    private boolean g = false;

    private final void d() {
        final cybf cybfVar = this.f;
        ekvl.y(cybfVar);
        if (auub.g()) {
            cybfVar.b();
        } else {
            caqj caqjVar = cybfVar.c;
            ekvl.y(caqjVar);
            caqjVar.post(new Runnable() { // from class: cyaz
                @Override // java.lang.Runnable
                public final void run() {
                    cybf.this.b();
                }
            });
        }
        this.g = false;
        ausn ausnVar = cxze.a;
    }

    @Override // defpackage.auun
    public final void a() {
        if (cyag.b(this)) {
            return;
        }
        stopSelf();
    }

    public final void c() {
        cyaa cyaaVar = this.b;
        ekvl.y(cyaaVar);
        if (cyaaVar.d) {
            cyaaVar.b.unregisterNetworkCallback(cyaaVar.c);
        }
        cyaaVar.d = false;
        ConnectivityProtectionLockingIntentOperation.b(cyaaVar.a);
        this.c = false;
        ausn ausnVar = cxze.a;
    }

    @Override // com.google.android.chimera.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append("==== START PSA Dump ====\n");
        auti autiVar = new auti(printWriter, "  ");
        printWriter.append("\n== Flags ==\n");
        autiVar.b();
        cydw.a(autiVar);
        autiVar.a();
        printWriter.append("\n== Backup dump of Snd flags ==\n");
        autiVar.b();
        cydw.b(autiVar);
        autiVar.a();
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.h = this;
        auuo auuoVar = new auuo(this, new caqj(Looper.getMainLooper()));
        this.e = auuoVar;
        auuoVar.b(this);
        Context a = AppContextProvider.a();
        if (auub.c()) {
            synchronized (this.a) {
                this.b = new cyaa(a);
                if (auub.e()) {
                    this.f = new cybf(a);
                }
                int i = iri.a;
            }
        }
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        super.onDestroy();
        this.e.c();
        if (auub.c()) {
            synchronized (this.a) {
                c();
                if (auub.e()) {
                    d();
                }
                int i = iri.a;
            }
        }
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (auub.c()) {
            Context context = this.h;
            ekvl.y(context);
            if (cyag.b(context)) {
                Context context2 = this.h;
                ekvl.y(context2);
                if (cxyx.a(context2)) {
                    eqgc.t(cyaa.d() ? eqgc.i(true) : cyaa.a(this), new cydx(this), this.d);
                    if (auub.e()) {
                        synchronized (this.a) {
                            if (!cybf.c(this)) {
                                d();
                            } else if (!this.g) {
                                final cybf cybfVar = this.f;
                                ekvl.y(cybfVar);
                                if (auub.g()) {
                                    cybfVar.a(new Runnable() { // from class: cyax
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            cybf cybfVar2 = cybf.this;
                                            Executor executor = cybfVar2.b;
                                            ekvl.y(executor);
                                            cybfVar2.a.addOnSubscriptionsChangedListener(executor, cybfVar2.d);
                                        }
                                    });
                                } else {
                                    caqj caqjVar = cybfVar.c;
                                    ekvl.y(caqjVar);
                                    caqjVar.post(new Runnable() { // from class: cyay
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            final cybf cybfVar2 = cybf.this;
                                            cybfVar2.a(new Runnable() { // from class: cyba
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    cybf cybfVar3 = cybf.this;
                                                    cybfVar3.a.addOnSubscriptionsChangedListener(cybfVar3.d);
                                                }
                                            });
                                        }
                                    });
                                }
                                this.g = true;
                                ausn ausnVar = cxze.a;
                            }
                        }
                    }
                    int i3 = iri.a;
                    return 1;
                }
            }
        }
        stopSelf(i2);
        return 2;
    }

    @Override // defpackage.auun
    public final void b() {
    }
}
