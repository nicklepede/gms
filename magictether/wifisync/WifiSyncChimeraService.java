package com.google.android.gms.magictether.wifisync;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.asmf;
import defpackage.asot;
import defpackage.cbta;
import defpackage.cbwh;
import defpackage.cbwi;
import defpackage.cbwl;
import defpackage.cbwm;
import defpackage.cbwo;
import defpackage.cbwp;
import defpackage.ensv;
import defpackage.fpzu;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Timer;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class WifiSyncChimeraService extends Service {
    public static final asot a = cbta.a("WifiSyncService");
    public final ensv b;
    public final cbwm c;
    public PlatformWifiBroadcastReceiver d;
    public ChromeSyncBroadcastReceiver e;
    public Timer f;
    public Set g;
    public long h;
    public int i;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class ChromeSyncBroadcastReceiver extends TracingBroadcastReceiver {
        public ChromeSyncBroadcastReceiver() {
            super("auth_magictether");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, Intent intent) {
            if (!fpzu.g() && "wifisync.CHROME_SYNC_DATA_UPDATED".equals(intent.getAction())) {
                WifiSyncChimeraService wifiSyncChimeraService = WifiSyncChimeraService.this;
                wifiSyncChimeraService.c.d(1);
                intent.getStringExtra("account_name");
                wifiSyncChimeraService.b();
            }
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class PlatformWifiBroadcastReceiver extends TracingBroadcastReceiver {
        public PlatformWifiBroadcastReceiver() {
            super("auth_magictether");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, Intent intent) {
            if (!fpzu.g() && "android.net.wifi.CONFIGURED_NETWORKS_CHANGE".equals(intent.getAction())) {
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
        this.b = new asmf(1, 10);
        this.c = cbwl.a();
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
        timer2.schedule(new cbwo(this), fpzu.b());
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        if (fpzu.g()) {
            return;
        }
        Iterator it = cbwh.a.b.values().iterator();
        while (it.hasNext()) {
            ((cbwi) it.next()).c();
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
        if (fpzu.g() || !fpzu.e()) {
            stopSelf();
            return 2;
        }
        this.b.execute(new cbwp(this));
        return 1;
    }

    WifiSyncChimeraService(ensv ensvVar) {
        this.f = null;
        this.g = new HashSet();
        this.h = 0L;
        this.i = 0;
        this.b = ensvVar;
        this.c = cbwl.a();
    }
}
