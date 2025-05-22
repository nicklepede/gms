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
import defpackage.ajif;
import defpackage.ajwt;
import defpackage.ajxp;
import defpackage.akbi;
import defpackage.akdm;
import defpackage.akfi;
import defpackage.akjg;
import defpackage.akjh;
import defpackage.akki;
import defpackage.akkk;
import defpackage.akkn;
import defpackage.akkt;
import defpackage.akll;
import defpackage.aklv;
import defpackage.akmg;
import defpackage.akmp;
import defpackage.akmw;
import defpackage.aknd;
import defpackage.akne;
import defpackage.aksd;
import defpackage.atzb;
import defpackage.aupv;
import defpackage.aupz;
import defpackage.dhbu;
import defpackage.eluo;
import defpackage.eqex;
import defpackage.eqgc;
import defpackage.eqgo;
import defpackage.focl;
import defpackage.foha;
import defpackage.ind;
import j$.util.Objects;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class D2dSourceChimeraService extends Service {
    public static final ajwt a = new ajwt("D2dSourceChimeraService");
    public eqgo b;
    public akmp c;
    public akmg d;
    public akkt e;
    private akne f;
    private aknd g;
    private BroadcastReceiver h;
    private akmw i;
    private akbi j;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    /* renamed from: com.google.android.gms.backup.d2d.component.D2dSourceChimeraService$1, reason: invalid class name */
    public class AnonymousClass1 extends TracingBroadcastReceiver {
        public AnonymousClass1() {
            super("backup");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, Intent intent) {
            final int intExtra = intent.getIntExtra("e2e_tcp_source_port", -1);
            final boolean booleanExtra = intent.getBooleanExtra("e2e_is_duplex_transfer", false);
            D2dSourceChimeraService.this.b.execute(new Runnable() { // from class: akjf
                @Override // java.lang.Runnable
                public final void run() {
                    if (!akfi.h()) {
                        throw new RuntimeException();
                    }
                    final int i = intExtra;
                    boolean z = booleanExtra;
                    D2dSourceChimeraService.AnonymousClass1 anonymousClass1 = D2dSourceChimeraService.AnonymousClass1.this;
                    if (z) {
                        D2dSourceChimeraService.this.c.c(new akru() { // from class: akjd
                            @Override // defpackage.akru
                            public final akrw a() {
                                return new akse(i);
                            }
                        });
                    } else {
                        D2dSourceChimeraService.this.c.g(new akru() { // from class: akje
                            @Override // defpackage.akru
                            public final akrw a() {
                                return new akse(i);
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
        return new aklv(this);
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        a.j("onCreate", new Object[0]);
        super.onCreate();
        this.b = new aupz(1, 9);
        this.e = new akkt();
        final akkn akknVar = new akkn(this);
        aupz aupzVar = new aupz(1, 10);
        Objects.requireNonNull(akknVar);
        aupzVar.execute(new Runnable() { // from class: akjb
            @Override // java.lang.Runnable
            public final void run() {
                PowerManager powerManager;
                akkn akknVar2 = akkn.this;
                akknVar2.d = SystemClock.elapsedRealtime();
                fgrc fgrcVar = akknVar2.e;
                fgri fgriVar = fgrcVar.b;
                if (((fkcg) fgriVar).c == -10) {
                    if (!fgriVar.L()) {
                        fgrcVar.U();
                    }
                    fkcg fkcgVar = (fkcg) fgrcVar.b;
                    fkcgVar.b |= 1;
                    fkcgVar.c = -1;
                }
                Context context = akknVar2.b;
                int i = ModuleManager.get(context).getCurrentModuleApk().apkVersionCode;
                akkn.a.d("Apk version: %d", Integer.valueOf(i));
                fgrc fgrcVar2 = akknVar2.l;
                if (!fgrcVar2.b.L()) {
                    fgrcVar2.U();
                }
                fkch fkchVar = (fkch) fgrcVar2.b;
                fkch fkchVar2 = fkch.a;
                fkchVar.b |= 2;
                fkchVar.e = i;
                try {
                    if (focl.r()) {
                        try {
                            ekww a2 = ekxd.a(new wxf());
                            dxyi.f(context);
                            int length = wxh.a(context, new wwy(context), a2).length;
                            fgrc fgrcVar3 = akknVar2.l;
                            if (!fgrcVar3.b.L()) {
                                fgrcVar3.U();
                            }
                            fkch fkchVar3 = (fkch) fgrcVar3.b;
                            fkchVar3.b |= 8;
                            fkchVar3.j = length;
                        } catch (RemoteException | asxb | asxc e) {
                            akkn.a.g("Unable to get number of accounts", e, new Object[0]);
                            fgrc fgrcVar4 = akknVar2.l;
                            if (!fgrcVar4.b.L()) {
                                fgrcVar4.U();
                            }
                            fkch fkchVar4 = (fkch) fgrcVar4.b;
                            fkchVar4.b |= 8;
                            fkchVar4.j = -1;
                        }
                    }
                    if (focl.r()) {
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) akknVar2.b.getSystemService("connectivity")).getActiveNetworkInfo();
                        fgrc fgrcVar5 = akknVar2.l;
                        boolean z = activeNetworkInfo != null && activeNetworkInfo.isConnected();
                        if (!fgrcVar5.b.L()) {
                            fgrcVar5.U();
                        }
                        fkch fkchVar5 = (fkch) fgrcVar5.b;
                        fkchVar5.b |= 16;
                        fkchVar5.k = z;
                    }
                    if (!fogx.a.lK().d() || (powerManager = (PowerManager) akknVar2.b.getSystemService("power")) == null) {
                        return;
                    }
                    fgrc fgrcVar6 = akknVar2.l;
                    boolean isPowerSaveMode = powerManager.isPowerSaveMode();
                    if (!fgrcVar6.b.L()) {
                        fgrcVar6.U();
                    }
                    fkch fkchVar6 = (fkch) fgrcVar6.b;
                    fkchVar6.b |= 128;
                    fkchVar6.o = isPowerSaveMode;
                } catch (Throwable th) {
                    fgrc fgrcVar7 = akknVar2.l;
                    if (!fgrcVar7.b.L()) {
                        fgrcVar7.U();
                    }
                    fkch fkchVar7 = (fkch) fgrcVar7.b;
                    fkchVar7.b |= 8;
                    fkchVar7.j = -1;
                    throw th;
                }
            }
        });
        ajwt ajwtVar = akne.a;
        this.f = new akne(new dhbu(this, 1, "com.google.android.gms.backup.component.D2dSourceService.wakelock_tag"));
        this.i = new akmw(this);
        this.d = akmg.a(this);
        akll a2 = akll.a(this, akknVar);
        aupv aupvVar = new aupv(1, 10);
        this.j = new akbi(this, aupvVar, "com.google.android.gms.backup.component.D2dSourceService");
        this.g = new aknd(this, a2, akknVar, this.e, this.i, this.j, new akdm(new aupv(1, 10)), aupvVar);
        this.c = new akmp(this, this.b, aupvVar, this.e, akknVar, this.g, this.f, this.i, a2, new ajxp(this), new ajif(this), this.d, new aupz(1, 10), new akki(this));
        this.h = new AnonymousClass1();
        if (akfi.h()) {
            ind.b(this, this.h, new IntentFilter("com.google.android.gms.backup.ACTION_LAUNCH_SOURCE_E2E_TEST"), 2);
            ((eluo) aksd.a.h()).x("source receiver registered");
        }
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        ajwt ajwtVar = a;
        ajwtVar.j("onDestroy", new Object[0]);
        if (this.f.a()) {
            ajwtVar.m("Wake lock should have been released before source service onDestroy.", new Object[0]);
        }
        this.b.execute(new Runnable() { // from class: akjc
            @Override // java.lang.Runnable
            public final void run() {
                D2dSourceChimeraService d2dSourceChimeraService = D2dSourceChimeraService.this;
                akmp akmpVar = d2dSourceChimeraService.c;
                akrf akrfVar = akmpVar.p;
                if (akrfVar != null) {
                    akrfVar.d();
                }
                akmpVar.i();
                d2dSourceChimeraService.c = null;
            }
        });
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        ajwt ajwtVar = a;
        ajwtVar.j("#onStartCommand", new Object[0]);
        if (focl.a.lK().af() && intent == null) {
            ajwtVar.m("OnStartCommand called with null intent, not doing any work as there are no pending starts to this service.", new Object[0]);
            return 2;
        }
        if (intent.getBooleanExtra("stop_service", false)) {
            this.g.i(11, null, 1, 1);
            this.f.a();
            this.g.g();
            return 2;
        }
        if (!foha.e()) {
            new akjh(this).start();
        }
        akne akneVar = this.f;
        atzb.h("Wake lock must be acquired from the main thread.");
        dhbu dhbuVar = akneVar.b;
        if (dhbuVar.l()) {
            akne.a.j("acquireWakeLockIfNotHeld(): wake lock already held so not acquiring", new Object[0]);
        } else {
            akne.a.j("acquireWakeLockIfNotHeld(): wake lock not held so acquiring", new Object[0]);
            dhbuVar.d("migrate_transfer");
        }
        this.i.c.b = intent.getBooleanExtra("is_wifi_d2d", false);
        this.i.a();
        eqgc.t(this.j.a(), new akjg(), eqex.a);
        new akkk().a(this);
        return 2;
    }
}
