package com.google.android.gms.magictether.wifisync;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.aupz;
import defpackage.ausn;
import defpackage.cebs;
import defpackage.ceez;
import defpackage.cefa;
import defpackage.cefd;
import defpackage.cefe;
import defpackage.cefg;
import defpackage.cefh;
import defpackage.eqgo;
import defpackage.fstq;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Timer;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class WifiSyncChimeraService extends Service {
    public static final ausn a = cebs.a("WifiSyncService");
    public final eqgo b;
    public final cefe c;
    public PlatformWifiBroadcastReceiver d;
    public ChromeSyncBroadcastReceiver e;
    public Timer f;
    public Set g;
    public long h;
    public int i;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class ChromeSyncBroadcastReceiver extends TracingBroadcastReceiver {
        public ChromeSyncBroadcastReceiver() {
            super("auth_magictether");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, Intent intent) {
            if (!fstq.f() && "wifisync.CHROME_SYNC_DATA_UPDATED".equals(intent.getAction())) {
                WifiSyncChimeraService wifiSyncChimeraService = WifiSyncChimeraService.this;
                wifiSyncChimeraService.c.d(1);
                intent.getStringExtra("account_name");
                wifiSyncChimeraService.b();
            }
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class PlatformWifiBroadcastReceiver extends TracingBroadcastReceiver {
        public PlatformWifiBroadcastReceiver() {
            super("auth_magictether");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, Intent intent) {
            if (!fstq.f() && "android.net.wifi.CONFIGURED_NETWORKS_CHANGE".equals(intent.getAction())) {
                WifiSyncChimeraService wifiSyncChimeraService = WifiSyncChimeraService.this;
                wifiSyncChimeraService.c.d(0);
                wifiSyncChimeraService.b();
            }
        }
    }

    public WifiSyncChimeraService() {
        this.f = null;
        this.g = new HashSet();
        this.h = 0L;
        this.i = 0;
        this.b = new aupz(1, 10);
        this.c = cefd.a();
    }

    public static Intent a(Context context) {
        return new Intent().setClassName(context, "com.google.android.gms.magictether.wifisync.WifiSyncService");
    }

    public final void b() {
        Timer timer = this.f;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = new Timer();
        this.f = timer2;
        timer2.schedule(new cefg(this), fstq.b());
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        if (fstq.f()) {
            return;
        }
        Iterator it = ceez.a.b.values().iterator();
        while (it.hasNext()) {
            ((cefa) it.next()).c();
        }
        ChromeSyncBroadcastReceiver chromeSyncBroadcastReceiver = this.e;
        if (chromeSyncBroadcastReceiver != null) {
            unregisterReceiver(chromeSyncBroadcastReceiver);
            this.e = null;
        }
        PlatformWifiBroadcastReceiver platformWifiBroadcastReceiver = this.d;
        if (platformWifiBroadcastReceiver != null) {
            unregisterReceiver(platformWifiBroadcastReceiver);
            this.d = null;
        }
        this.b.shutdown();
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (fstq.f() || !fstq.d()) {
            stopSelf();
            return 2;
        }
        this.b.execute(new cefh(this));
        return 1;
    }

    WifiSyncChimeraService(eqgo eqgoVar) {
        this.f = null;
        this.g = new HashSet();
        this.h = 0L;
        this.i = 0;
        this.b = eqgoVar;
        this.c = cefd.a();
    }
}
