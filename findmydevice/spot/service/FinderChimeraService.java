package com.google.android.gms.findmydevice.spot.service;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.findmydevice.spot.service.FinderChimeraService;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.asej;
import defpackage.asmf;
import defpackage.asot;
import defpackage.bczy;
import defpackage.bdad;
import defpackage.bebo;
import defpackage.bebp;
import defpackage.beih;
import defpackage.benw;
import defpackage.dxad;
import defpackage.dxai;
import defpackage.eijr;
import defpackage.fobb;
import defpackage.fobh;
import defpackage.iln;
import j$.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class FinderChimeraService extends Service {
    public final dxad a;
    public final dxad b;
    public final dxad c;
    private final Object d;
    private boolean e;
    private final dxad f;
    private final Executor g;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    class OfflineBeaconBroadcastReceiver extends TracingBroadcastReceiver {
        public OfflineBeaconBroadcastReceiver(Context context) {
            super(context);
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, Intent intent) {
            if (Objects.equals(intent.getAction(), "android.intent.action.ACTION_SHUTDOWN")) {
                ((bczy) FinderChimeraService.this.b.a()).b();
            } else if (Objects.equals(intent.getAction(), "android.intent.action.BATTERY_LOW")) {
                ((bdad) FinderChimeraService.this.c.a()).a();
            }
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    class PowerSaveModeBroadcastReceiver extends TracingBroadcastReceiver {
        public PowerSaveModeBroadcastReceiver(Context context) {
            super(context);
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, Intent intent) {
            dxai.a(((benw) FinderChimeraService.this.a.a()).a(), "Self location fetcher refresh failed.", new Object[0]);
        }
    }

    static {
        asot.b("FinderService", asej.FIND_MY_DEVICE_SPOT);
    }

    public FinderChimeraService() {
        this(bebo.a(), new asmf(1, 10));
    }

    public final void a() {
        if (fobb.g()) {
            dxai.a(((bczy) this.b.a()).a(), "Offline beacon state refresh failed.", new Object[0]);
        }
        synchronized (this.d) {
            if (!this.e) {
                if (fobb.h()) {
                    dxai.a(((benw) this.a.a()).a(), "Self location fetcher initialization failed.", new Object[0]);
                    if (fobh.i()) {
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                        iln.b(this, new PowerSaveModeBroadcastReceiver(this), intentFilter, 2);
                    }
                }
                if (fobb.g() && ((bdad) this.c.a()).d()) {
                    IntentFilter intentFilter2 = new IntentFilter();
                    intentFilter2.addAction("android.intent.action.ACTION_SHUTDOWN");
                    intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                    intentFilter2.setPriority(999);
                    iln.b(this, new OfflineBeaconBroadcastReceiver(this), intentFilter2, 2);
                }
                this.e = true;
            }
        }
        ((beih) this.f.a()).a();
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (!fobb.h() && !fobb.g()) {
            return 2;
        }
        if (fobb.a.a().G()) {
            this.g.execute(new Runnable() { // from class: beyg
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

    public FinderChimeraService(final bebp bebpVar, Executor executor) {
        this.d = new Object();
        this.e = false;
        Objects.requireNonNull(bebpVar);
        this.a = new dxad(new eijr() { // from class: beyc
            @Override // defpackage.eijr
            public final Object a() {
                return bebp.this.t();
            }
        }, fobb.k());
        Objects.requireNonNull(bebpVar);
        this.b = new dxad(new eijr() { // from class: beyd
            @Override // defpackage.eijr
            public final Object a() {
                return bebp.this.e();
            }
        }, fobb.k());
        Objects.requireNonNull(bebpVar);
        this.c = new dxad(new eijr() { // from class: beye
            @Override // defpackage.eijr
            public final Object a() {
                return bebp.this.f();
            }
        }, fobb.k());
        Objects.requireNonNull(bebpVar);
        this.f = new dxad(new eijr() { // from class: beyf
            @Override // defpackage.eijr
            public final Object a() {
                return bebp.this.k();
            }
        }, fobb.k());
        this.g = executor;
    }
}
