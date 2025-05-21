package com.google.android.gms.cast.rcn;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import com.google.android.chimera.Service;
import com.google.android.gms.cast.rcn.CastRemoteControlNotificationChimeraService;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.amap;
import defpackage.amgd;
import defpackage.amys;
import defpackage.amyt;
import defpackage.anav;
import defpackage.anfz;
import defpackage.angs;
import defpackage.angy;
import defpackage.anhb;
import defpackage.anhk;
import defpackage.annw;
import defpackage.asnz;
import defpackage.asoe;
import defpackage.byhr;
import defpackage.eijr;
import defpackage.eijy;
import defpackage.elzf;
import defpackage.iln;
import defpackage.kao;
import defpackage.kap;
import defpackage.kaq;
import defpackage.kaz;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CastRemoteControlNotificationChimeraService extends Service {
    public static final annw a = new annw("RCNService");
    public static final kap b;
    public static angs c;
    public amgd e;
    public kaz f;
    public anhb g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int l;
    private anhk p;
    private amap q;
    private anav r;
    private RemoteControlNotificationMediaIntentReceiver s;
    private Runnable t;
    private amyt u;
    private amys v;
    private final eijr m = eijy.a(new eijr() { // from class: anfv
        @Override // defpackage.eijr
        public final Object a() {
            return Boolean.valueOf(fmcb.d());
        }
    });
    private final eijr n = eijy.a(new eijr() { // from class: anfw
        @Override // defpackage.eijr
        public final Object a() {
            return Long.valueOf(fmcb.a.a().a());
        }
    });
    public final kaq d = new anfz(this);
    private final IntentReceiver o = new IntentReceiver();
    public final Handler k = new byhr(Looper.getMainLooper());

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    class IntentReceiver extends TracingBroadcastReceiver {
        public IntentReceiver() {
            super("cast");
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, Intent intent) {
            char c;
            CastRemoteControlNotificationChimeraService.a.n("IntentReceiver received %s", intent);
            String action = intent.getAction();
            if (action == null) {
                CastRemoteControlNotificationChimeraService.a.g("IntentReceiver received null action", new Object[0]);
                return;
            }
            switch (action.hashCode()) {
                case -2128145023:
                    if (action.equals("android.intent.action.SCREEN_OFF")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1644837463:
                    if (action.equals("com.google.android.gms.cast.rcn.ENABLED")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1454123155:
                    if (action.equals("android.intent.action.SCREEN_ON")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -821605132:
                    if (action.equals("com.google.android.gms.cast.rcn.DISABLED")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                CastRemoteControlNotificationChimeraService castRemoteControlNotificationChimeraService = CastRemoteControlNotificationChimeraService.this;
                castRemoteControlNotificationChimeraService.c(castRemoteControlNotificationChimeraService.h, castRemoteControlNotificationChimeraService.i, true);
                return;
            }
            if (c == 1) {
                CastRemoteControlNotificationChimeraService castRemoteControlNotificationChimeraService2 = CastRemoteControlNotificationChimeraService.this;
                castRemoteControlNotificationChimeraService2.c(castRemoteControlNotificationChimeraService2.h, castRemoteControlNotificationChimeraService2.i, false);
                return;
            }
            if (c == 2) {
                CastRemoteControlNotificationChimeraService castRemoteControlNotificationChimeraService3 = CastRemoteControlNotificationChimeraService.this;
                castRemoteControlNotificationChimeraService3.e.M(true);
                castRemoteControlNotificationChimeraService3.c(castRemoteControlNotificationChimeraService3.h, true, castRemoteControlNotificationChimeraService3.j);
            } else {
                if (c != 3) {
                    CastRemoteControlNotificationChimeraService.a.g("IntentReceiver received unsupported action: %s", action);
                    return;
                }
                CastRemoteControlNotificationChimeraService castRemoteControlNotificationChimeraService4 = CastRemoteControlNotificationChimeraService.this;
                castRemoteControlNotificationChimeraService4.e.M(false);
                castRemoteControlNotificationChimeraService4.c(castRemoteControlNotificationChimeraService4.h, false, castRemoteControlNotificationChimeraService4.j);
            }
        }
    }

    static {
        kao kaoVar = new kao();
        kaoVar.c("android.media.intent.category.REMOTE_PLAYBACK");
        b = kaoVar.a();
    }

    private final int e() {
        return asoe.i(getBaseContext()) ? 12 : 4;
    }

    public final void a() {
        a.m("stop generic discovery");
        Runnable runnable = this.t;
        if (runnable != null) {
            this.k.removeCallbacks(runnable);
            this.t = null;
        }
        this.f.e(this.d);
    }

    public final void b(boolean z) {
        c(z, this.i, this.j);
    }

    public final void c(boolean z, boolean z2, boolean z3) {
        elzf elzfVar;
        annw annwVar = a;
        boolean z4 = false;
        annwVar.f("updateRcnState to isNetworkAvailable: %b, isRcnSettingsEnabled: %b, isScreenOn: %b", Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3));
        boolean z5 = this.i;
        this.i = z2;
        eijr eijrVar = this.m;
        boolean z6 = ((Boolean) eijrVar.a()).booleanValue() && this.h != z;
        boolean z7 = !((Boolean) eijrVar.a()).booleanValue() || z;
        this.h = z7;
        boolean z8 = this.j;
        this.j = z3;
        this.g.h = z3;
        if (z7 && z2 && this.p.i && z3) {
            z4 = true;
        }
        annwVar.n("shouldDiscover = %b", Boolean.valueOf(z4));
        if (z4) {
            int i = this.l;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 != 0) {
                if (i2 == 2) {
                    annwVar.m("Screen On and RCN is enabled");
                    this.g.d();
                    return;
                } else {
                    if (i2 != 3) {
                        return;
                    }
                    annwVar.m("Screen On and RCN is disabled");
                    return;
                }
            }
            annwVar.m("start generic discovery");
            Runnable runnable = this.t;
            if (runnable != null) {
                this.k.removeCallbacks(runnable);
            }
            d(2);
            this.f.c(b, this.d, e());
            Runnable runnable2 = new Runnable() { // from class: anfy
                @Override // java.lang.Runnable
                public final void run() {
                    CastRemoteControlNotificationChimeraService.a.m("generic discovery is timed out");
                    CastRemoteControlNotificationChimeraService castRemoteControlNotificationChimeraService = CastRemoteControlNotificationChimeraService.this;
                    castRemoteControlNotificationChimeraService.d(4);
                    castRemoteControlNotificationChimeraService.f.e(castRemoteControlNotificationChimeraService.d);
                }
            };
            this.t = runnable2;
            this.k.postDelayed(runnable2, ((Long) this.n.a()).longValue());
            return;
        }
        int i3 = this.l;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        if (i4 == 1) {
            a();
            d(1);
            return;
        }
        if (i4 != 2) {
            if (i4 == 3 && z6) {
                d(1);
                return;
            }
            return;
        }
        elzf elzfVar2 = elzf.REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_UNKNOWN;
        if (z5 != z2 && !z2) {
            annwVar.m("RCN settings is disabled");
            elzfVar = elzf.REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_USER_DISABLE_FROM_SETTINGS;
        } else if (z6 && !this.h) {
            annwVar.m("Network is unavailable");
            elzfVar = elzf.REMOTE_CONTROL_NOTIFICATION_CANCEL_NETWORK_CHANGED;
            d(1);
        } else if (z8 == z3 || z3) {
            elzfVar = elzfVar2;
        } else {
            annwVar.m("Screen Off");
            elzfVar = elzf.REMOTE_CONTROL_NOTIFICATION_CANCEL_SCEEN_OFF;
        }
        if (elzfVar != elzfVar2) {
            anhb anhbVar = this.g;
            anhbVar.c();
            anhb.a.m("Remove all RCN notifications");
            anhbVar.g.d(elzfVar);
        }
    }

    public final void d(int i) {
        a.n("RCN mode is %s", i != 1 ? i != 2 ? i != 3 ? "MODE_DISABLED" : "MODE_ENABLED" : "MODE_PENDING" : "MODE_UNKNOWN");
        this.l = i;
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        annw annwVar = a;
        annwVar.m("onCreate");
        amap a2 = amap.a(getApplicationContext(), "RCNService");
        this.q = a2;
        this.e = a2.e;
        this.v = a2.r;
        this.r = a2.j;
        if (this.f == null) {
            this.f = kaz.b(this);
        }
        if (this.p == null) {
            this.p = new anhk(this, asnz.a);
        }
        if (c == null) {
            c = new angs(getApplicationContext(), this.e, this.p);
        }
        if (this.g == null) {
            this.g = new anhb(this.f, this.r, c, e());
        }
        anhb anhbVar = this.g;
        anav anavVar = anhbVar.f;
        angy angyVar = anhbVar.i;
        anavVar.a.e.add(angyVar);
        anavVar.b.e.add(angyVar);
        RemoteControlNotificationMediaIntentReceiver remoteControlNotificationMediaIntentReceiver = new RemoteControlNotificationMediaIntentReceiver(getApplicationContext(), c);
        this.s = remoteControlNotificationMediaIntentReceiver;
        if (!remoteControlNotificationMediaIntentReceiver.c) {
            RemoteControlNotificationMediaIntentReceiver.a.m("Register RCN media intent receiver.");
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.gms.cast.rcn.TOGGLE_MUTE");
            intentFilter.addAction("com.google.android.gms.cast.rcn.TOGGLE_PLAY_BACK");
            intentFilter.addAction("com.google.android.gms.cast.rcn.QUEUE_PREVIOUS");
            intentFilter.addAction("com.google.android.gms.cast.rcn.QUEUE_NEXT");
            intentFilter.addAction("com.google.android.gms.cast.rcn.VIRTUAL_REMOTE");
            intentFilter.addAction("com.google.android.gms.cast.rcn.STOP_CASTING");
            intentFilter.addAction("com.google.android.gms.cast.rcn.DISMISS");
            iln.c(remoteControlNotificationMediaIntentReceiver.b, remoteControlNotificationMediaIntentReceiver, intentFilter, "com.google.android.gms.permission.INTERNAL_BROADCAST", null, 4);
            remoteControlNotificationMediaIntentReceiver.c = true;
        }
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.intent.action.SCREEN_ON");
        intentFilter2.addAction("android.intent.action.SCREEN_OFF");
        intentFilter2.addAction("com.google.android.gms.cast.rcn.ENABLED");
        intentFilter2.addAction("com.google.android.gms.cast.rcn.DISABLED");
        iln.b(getApplicationContext(), this.o, intentFilter2, 4);
        this.i = true;
        if (!((Boolean) this.m.a()).booleanValue()) {
            annwVar.m("Trigger RCN discovery with network info");
            d(3);
            return;
        }
        annwVar.m("Trigger RCN discovery without network info");
        amyt amytVar = new amyt() { // from class: anfx
            @Override // defpackage.amyt
            public final void a(final boolean z) {
                CastRemoteControlNotificationChimeraService.a.n("network connectivity is changed to %b", Boolean.valueOf(z));
                final CastRemoteControlNotificationChimeraService castRemoteControlNotificationChimeraService = CastRemoteControlNotificationChimeraService.this;
                if (z) {
                    if (castRemoteControlNotificationChimeraService.h) {
                        castRemoteControlNotificationChimeraService.k.post(new Runnable() { // from class: anft
                            @Override // java.lang.Runnable
                            public final void run() {
                                CastRemoteControlNotificationChimeraService castRemoteControlNotificationChimeraService2 = CastRemoteControlNotificationChimeraService.this;
                                castRemoteControlNotificationChimeraService2.b(false);
                                castRemoteControlNotificationChimeraService2.b(true);
                            }
                        });
                        return;
                    }
                    z = true;
                }
                castRemoteControlNotificationChimeraService.k.post(new Runnable() { // from class: anfu
                    @Override // java.lang.Runnable
                    public final void run() {
                        CastRemoteControlNotificationChimeraService.this.b(z);
                    }
                });
            }
        };
        this.u = amytVar;
        this.v.c(amytVar);
        d(1);
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        amys amysVar;
        angy angyVar;
        a.m("onDestroy");
        anhb anhbVar = this.g;
        if (anhbVar != null) {
            anhbVar.c();
            anav anavVar = anhbVar.f;
            if (anavVar != null && (angyVar = anhbVar.i) != null) {
                anavVar.a.e.remove(angyVar);
                anavVar.b.e.remove(angyVar);
            }
        }
        kaz kazVar = this.f;
        if (kazVar != null) {
            kazVar.e(this.d);
        }
        getApplicationContext().unregisterReceiver(this.o);
        RemoteControlNotificationMediaIntentReceiver remoteControlNotificationMediaIntentReceiver = this.s;
        if (remoteControlNotificationMediaIntentReceiver != null) {
            if (remoteControlNotificationMediaIntentReceiver.c) {
                RemoteControlNotificationMediaIntentReceiver.a.m("Unregister RCN media intent receiver.");
                try {
                    remoteControlNotificationMediaIntentReceiver.b.unregisterReceiver(remoteControlNotificationMediaIntentReceiver);
                } catch (IllegalArgumentException unused) {
                }
                remoteControlNotificationMediaIntentReceiver.c = false;
            }
            this.s = null;
        }
        angs angsVar = c;
        angsVar.d(elzf.REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_SERVICE_STOPPED);
        angsVar.f.clear();
        angsVar.g.clear();
        amyt amytVar = this.u;
        if (amytVar != null && (amysVar = this.v) != null) {
            amysVar.d(amytVar);
        }
        if (this.q != null) {
            amap.b("RCNService");
            this.q = null;
        }
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        a.p("onStartCommand intent = %s, flags = %d", intent, Integer.valueOf(i));
        PowerManager powerManager = (PowerManager) getApplicationContext().getSystemService("power");
        c(this.v.l(), this.i, powerManager != null ? powerManager.isInteractive() : false);
        return 1;
    }
}
