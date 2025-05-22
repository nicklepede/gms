package com.google.android.gms.findmydevice.spot.service;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.findmydevice.spot.service.FinderChimeraService;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.auid;
import defpackage.aupz;
import defpackage.ausn;
import defpackage.bfbk;
import defpackage.bfbp;
import defpackage.bgda;
import defpackage.bgdb;
import defpackage.bgjt;
import defpackage.bgpi;
import defpackage.dzmd;
import defpackage.dzmi;
import defpackage.ekww;
import defpackage.fqsv;
import defpackage.fqtb;
import defpackage.ind;
import j$.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class FinderChimeraService extends Service {
    public final dzmd a;
    public final dzmd b;
    public final dzmd c;
    private final Object d;
    private boolean e;
    private final dzmd f;
    private final Executor g;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    class OfflineBeaconBroadcastReceiver extends TracingBroadcastReceiver {
        public OfflineBeaconBroadcastReceiver(Context context) {
            super(context);
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, Intent intent) {
            if (Objects.equals(intent.getAction(), "android.intent.action.ACTION_SHUTDOWN")) {
                ((bfbk) FinderChimeraService.this.b.a()).b();
            } else if (Objects.equals(intent.getAction(), "android.intent.action.BATTERY_LOW")) {
                ((bfbp) FinderChimeraService.this.c.a()).a();
            }
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    class PowerSaveModeBroadcastReceiver extends TracingBroadcastReceiver {
        public PowerSaveModeBroadcastReceiver(Context context) {
            super(context);
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, Intent intent) {
            dzmi.a(((bgpi) FinderChimeraService.this.a.a()).a(), "Self location fetcher refresh failed.", new Object[0]);
        }
    }

    static {
        ausn.b("FinderService", auid.FIND_MY_DEVICE_SPOT);
    }

    public FinderChimeraService() {
        this(bgda.a(), new aupz(1, 10));
    }

    public final void a() {
        if (fqsv.g()) {
            dzmi.a(((bfbk) this.b.a()).a(), "Offline beacon state refresh failed.", new Object[0]);
        }
        synchronized (this.d) {
            if (!this.e) {
                if (fqsv.h()) {
                    dzmi.a(((bgpi) this.a.a()).a(), "Self location fetcher initialization failed.", new Object[0]);
                    if (fqtb.i()) {
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                        ind.b(this, new PowerSaveModeBroadcastReceiver(this), intentFilter, 2);
                    }
                }
                if (fqsv.g() && ((bfbp) this.c.a()).d()) {
                    IntentFilter intentFilter2 = new IntentFilter();
                    intentFilter2.addAction("android.intent.action.ACTION_SHUTDOWN");
                    intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                    intentFilter2.setPriority(999);
                    ind.b(this, new OfflineBeaconBroadcastReceiver(this), intentFilter2, 2);
                }
                this.e = true;
            }
        }
        ((bgjt) this.f.a()).a();
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (!fqsv.h() && !fqsv.g()) {
            return 2;
        }
        if (fqsv.a.lK().G()) {
            this.g.execute(new Runnable() { // from class: bgzt
                @Override // java.lang.Runnable
                public final void run() {
                    FinderChimeraService.this.a();
                }
            });
            return 1;
        }
        a();
        return 1;
    }

    public FinderChimeraService(final bgdb bgdbVar, Executor executor) {
        this.d = new Object();
        this.e = false;
        Objects.requireNonNull(bgdbVar);
        this.a = new dzmd(new ekww() { // from class: bgzp
            @Override // defpackage.ekww
            public final Object lK() {
                return bgdb.this.t();
            }
        }, fqsv.k());
        Objects.requireNonNull(bgdbVar);
        this.b = new dzmd(new ekww() { // from class: bgzq
            @Override // defpackage.ekww
            public final Object lK() {
                return bgdb.this.e();
            }
        }, fqsv.k());
        Objects.requireNonNull(bgdbVar);
        this.c = new dzmd(new ekww() { // from class: bgzr
            @Override // defpackage.ekww
            public final Object lK() {
                return bgdb.this.f();
            }
        }, fqsv.k());
        Objects.requireNonNull(bgdbVar);
        this.f = new dzmd(new ekww() { // from class: bgzs
            @Override // defpackage.ekww
            public final Object lK() {
                return bgdb.this.k();
            }
        }, fqsv.k());
        this.g = executor;
    }
}
