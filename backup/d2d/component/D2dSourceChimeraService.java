package com.google.android.gms.backup.d2d.component;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.chimera.Service;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.backup.d2d.component.D2dSourceChimeraService;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.ahhp;
import defpackage.ahwd;
import defpackage.ahwz;
import defpackage.aias;
import defpackage.aicw;
import defpackage.aies;
import defpackage.aiiq;
import defpackage.aiir;
import defpackage.aijs;
import defpackage.aiju;
import defpackage.aijx;
import defpackage.aikd;
import defpackage.aikv;
import defpackage.ailf;
import defpackage.ailq;
import defpackage.ailz;
import defpackage.aimg;
import defpackage.aimn;
import defpackage.aimo;
import defpackage.airn;
import defpackage.arwm;
import defpackage.asmb;
import defpackage.asmf;
import defpackage.deqr;
import defpackage.ejhf;
import defpackage.enre;
import defpackage.ensj;
import defpackage.ensv;
import defpackage.fllb;
import defpackage.flpq;
import defpackage.iln;
import j$.util.Objects;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class D2dSourceChimeraService extends Service {
    public static final ahwd a = new ahwd("D2dSourceChimeraService");
    public ensv b;
    public ailz c;
    public ailq d;
    public aikd e;
    private aimo f;
    private aimn g;
    private BroadcastReceiver h;
    private aimg i;
    private aias j;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    /* renamed from: com.google.android.gms.backup.d2d.component.D2dSourceChimeraService$1, reason: invalid class name */
    public class AnonymousClass1 extends TracingBroadcastReceiver {
        public AnonymousClass1() {
            super("backup");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, Intent intent) {
            final int intExtra = intent.getIntExtra("e2e_tcp_source_port", -1);
            final boolean booleanExtra = intent.getBooleanExtra("e2e_is_duplex_transfer", false);
            D2dSourceChimeraService.this.b.execute(new Runnable() { // from class: aiip
                @Override // java.lang.Runnable
                public final void run() {
                    if (!aies.h()) {
                        throw new RuntimeException();
                    }
                    final int i = intExtra;
                    boolean z = booleanExtra;
                    D2dSourceChimeraService.AnonymousClass1 anonymousClass1 = D2dSourceChimeraService.AnonymousClass1.this;
                    if (z) {
                        D2dSourceChimeraService.this.c.c(new aire() { // from class: aiin
                            @Override // defpackage.aire
                            public final airg a() {
                                return new airo(i);
                            }
                        });
                    } else {
                        D2dSourceChimeraService.this.c.g(new aire() { // from class: aiio
                            @Override // defpackage.aire
                            public final airg a() {
                                return new airo(i);
                            }
                        });
                    }
                }
            });
        }
    }

    public static Intent a(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.backup.component.D2dSourceService");
        return intent;
    }

    @Override // com.google.android.chimera.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.g.b(printWriter);
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        a.j("onBind", new Object[0]);
        return new ailf(this);
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        a.j("onCreate", new Object[0]);
        super.onCreate();
        this.b = new asmf(1, 9);
        this.e = new aikd();
        final aijx aijxVar = new aijx(this);
        asmf asmfVar = new asmf(1, 10);
        Objects.requireNonNull(aijxVar);
        asmfVar.execute(new Runnable() { // from class: aiil
            @Override // java.lang.Runnable
            public final void run() {
                PowerManager powerManager;
                aijx aijxVar2 = aijx.this;
                aijxVar2.d = SystemClock.elapsedRealtime();
                fecj fecjVar = aijxVar2.e;
                fecp fecpVar = fecjVar.b;
                if (((fhmj) fecpVar).c == -10) {
                    if (!fecpVar.L()) {
                        fecjVar.U();
                    }
                    fhmj fhmjVar = (fhmj) fecjVar.b;
                    fhmjVar.b |= 1;
                    fhmjVar.c = -1;
                }
                Context context = aijxVar2.b;
                int i = ModuleManager.get(context).getCurrentModuleApk().apkVersionCode;
                aijx.a.d("Apk version: %d", Integer.valueOf(i));
                fecj fecjVar2 = aijxVar2.l;
                if (!fecjVar2.b.L()) {
                    fecjVar2.U();
                }
                fhmk fhmkVar = (fhmk) fecjVar2.b;
                fhmk fhmkVar2 = fhmk.a;
                fhmkVar.b |= 2;
                fhmkVar.e = i;
                try {
                    if (fllb.r()) {
                        try {
                            eijr a2 = eijy.a(new vbf());
                            dvni.f(context);
                            int length = vbh.a(context, new vay(context), a2).length;
                            fecj fecjVar3 = aijxVar2.l;
                            if (!fecjVar3.b.L()) {
                                fecjVar3.U();
                            }
                            fhmk fhmkVar3 = (fhmk) fecjVar3.b;
                            fhmkVar3.b |= 8;
                            fhmkVar3.j = length;
                        } catch (RemoteException | aqum | aqun e) {
                            aijx.a.g("Unable to get number of accounts", e, new Object[0]);
                            fecj fecjVar4 = aijxVar2.l;
                            if (!fecjVar4.b.L()) {
                                fecjVar4.U();
                            }
                            fhmk fhmkVar4 = (fhmk) fecjVar4.b;
                            fhmkVar4.b |= 8;
                            fhmkVar4.j = -1;
                        }
                    }
                    if (fllb.r()) {
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) aijxVar2.b.getSystemService("connectivity")).getActiveNetworkInfo();
                        fecj fecjVar5 = aijxVar2.l;
                        boolean z = activeNetworkInfo != null && activeNetworkInfo.isConnected();
                        if (!fecjVar5.b.L()) {
                            fecjVar5.U();
                        }
                        fhmk fhmkVar5 = (fhmk) fecjVar5.b;
                        fhmkVar5.b |= 16;
                        fhmkVar5.k = z;
                    }
                    if (!flpn.a.a().d() || (powerManager = (PowerManager) aijxVar2.b.getSystemService("power")) == null) {
                        return;
                    }
                    fecj fecjVar6 = aijxVar2.l;
                    boolean isPowerSaveMode = powerManager.isPowerSaveMode();
                    if (!fecjVar6.b.L()) {
                        fecjVar6.U();
                    }
                    fhmk fhmkVar6 = (fhmk) fecjVar6.b;
                    fhmkVar6.b |= 128;
                    fhmkVar6.o = isPowerSaveMode;
                } catch (Throwable th) {
                    fecj fecjVar7 = aijxVar2.l;
                    if (!fecjVar7.b.L()) {
                        fecjVar7.U();
                    }
                    fhmk fhmkVar7 = (fhmk) fecjVar7.b;
                    fhmkVar7.b |= 8;
                    fhmkVar7.j = -1;
                    throw th;
                }
            }
        });
        ahwd ahwdVar = aimo.a;
        this.f = new aimo(new deqr(this, 1, "com.google.android.gms.backup.component.D2dSourceService.wakelock_tag"));
        this.i = new aimg(this);
        this.d = ailq.a(this);
        aikv a2 = aikv.a(this, aijxVar);
        asmb asmbVar = new asmb(1, 10);
        this.j = new aias(this, asmbVar, "com.google.android.gms.backup.component.D2dSourceService");
        this.g = new aimn(this, a2, aijxVar, this.e, this.i, this.j, new aicw(new asmb(1, 10)), asmbVar);
        this.c = new ailz(this, this.b, asmbVar, this.e, aijxVar, this.g, this.f, this.i, a2, new ahwz(this), new ahhp(this), this.d, new asmf(1, 10), new aijs(this));
        this.h = new AnonymousClass1();
        if (aies.h()) {
            iln.b(this, this.h, new IntentFilter("com.google.android.gms.backup.ACTION_LAUNCH_SOURCE_E2E_TEST"), 2);
            ((ejhf) airn.a.h()).x("source receiver registered");
        }
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        ahwd ahwdVar = a;
        ahwdVar.j("onDestroy", new Object[0]);
        if (this.f.a()) {
            ahwdVar.m("Wake lock should have been released before source service onDestroy.", new Object[0]);
        }
        this.b.execute(new Runnable() { // from class: aiim
            @Override // java.lang.Runnable
            public final void run() {
                D2dSourceChimeraService d2dSourceChimeraService = D2dSourceChimeraService.this;
                ailz ailzVar = d2dSourceChimeraService.c;
                aiqp aiqpVar = ailzVar.p;
                if (aiqpVar != null) {
                    aiqpVar.d();
                }
                ailzVar.i();
                d2dSourceChimeraService.c = null;
            }
        });
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        ahwd ahwdVar = a;
        ahwdVar.j("#onStartCommand", new Object[0]);
        if (fllb.a.a().af() && intent == null) {
            ahwdVar.m("OnStartCommand called with null intent, not doing any work as there are no pending starts to this service.", new Object[0]);
            return 2;
        }
        if (intent.getBooleanExtra("stop_service", false)) {
            this.g.i(11, null, 1, 1);
            this.f.a();
            this.g.g();
            return 2;
        }
        if (!flpq.e()) {
            new aiir(this).start();
        }
        aimo aimoVar = this.f;
        arwm.h("Wake lock must be acquired from the main thread.");
        deqr deqrVar = aimoVar.b;
        if (deqrVar.l()) {
            aimo.a.j("acquireWakeLockIfNotHeld(): wake lock already held so not acquiring", new Object[0]);
        } else {
            aimo.a.j("acquireWakeLockIfNotHeld(): wake lock not held so acquiring", new Object[0]);
            deqrVar.d("migrate_transfer");
        }
        this.i.c.b = intent.getBooleanExtra("is_wifi_d2d", false);
        this.i.a();
        ensj.t(this.j.a(), new aiiq(), enre.a);
        new aiju().a(this);
        return 2;
    }
}
