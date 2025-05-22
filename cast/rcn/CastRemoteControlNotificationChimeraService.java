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
import defpackage.aoca;
import defpackage.aoho;
import defpackage.apad;
import defpackage.apae;
import defpackage.apch;
import defpackage.aphm;
import defpackage.apif;
import defpackage.apil;
import defpackage.apio;
import defpackage.apix;
import defpackage.appp;
import defpackage.aurt;
import defpackage.aury;
import defpackage.caqj;
import defpackage.ekww;
import defpackage.ekxd;
import defpackage.eomt;
import defpackage.ind;
import defpackage.lsy;
import defpackage.lsz;
import defpackage.lta;
import defpackage.ltj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CastRemoteControlNotificationChimeraService extends Service {
    public static final appp a = new appp("RCNService");
    public static final lsz b;
    public static apif c;
    public aoho e;
    public ltj f;
    public apio g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int l;
    private apix p;
    private aoca q;
    private apch r;
    private RemoteControlNotificationMediaIntentReceiver s;
    private Runnable t;
    private apae u;
    private apad v;
    private final ekww m = ekxd.a(new ekww() { // from class: aphi
        @Override // defpackage.ekww
        public final Object lK() {
            return Boolean.valueOf(fotj.d());
        }
    });
    private final ekww n = ekxd.a(new ekww() { // from class: aphj
        @Override // defpackage.ekww
        public final Object lK() {
            return Long.valueOf(fotj.a.lK().a());
        }
    });
    public final lta d = new aphm(this);
    private final IntentReceiver o = new IntentReceiver();
    public final Handler k = new caqj(Looper.getMainLooper());

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    class IntentReceiver extends TracingBroadcastReceiver {
        public IntentReceiver() {
            super("cast");
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, Intent intent) {
            char c;
            appp apppVar = CastRemoteControlNotificationChimeraService.a;
            apppVar.n("IntentReceiver received %s", intent);
            String action = intent.getAction();
            if (action == null) {
                apppVar.g("IntentReceiver received null action", new Object[0]);
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
                    apppVar.g("IntentReceiver received unsupported action: %s", action);
                    return;
                }
                CastRemoteControlNotificationChimeraService castRemoteControlNotificationChimeraService4 = CastRemoteControlNotificationChimeraService.this;
                castRemoteControlNotificationChimeraService4.e.M(false);
                castRemoteControlNotificationChimeraService4.c(castRemoteControlNotificationChimeraService4.h, false, castRemoteControlNotificationChimeraService4.j);
            }
        }
    }

    static {
        lsy lsyVar = new lsy();
        lsyVar.c("android.media.intent.category.REMOTE_PLAYBACK");
        b = lsyVar.a();
    }

    private final int e() {
        return aury.i(getBaseContext()) ? 12 : 4;
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
        eomt eomtVar;
        appp apppVar = a;
        boolean z4 = false;
        apppVar.f("updateRcnState to isNetworkAvailable: %b, isRcnSettingsEnabled: %b, isScreenOn: %b", Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3));
        boolean z5 = this.i;
        this.i = z2;
        ekww ekwwVar = this.m;
        boolean z6 = ((Boolean) ekwwVar.lK()).booleanValue() && this.h != z;
        boolean z7 = !((Boolean) ekwwVar.lK()).booleanValue() || z;
        this.h = z7;
        boolean z8 = this.j;
        this.j = z3;
        this.g.h = z3;
        if (z7 && z2 && this.p.i && z3) {
            z4 = true;
        }
        apppVar.n("shouldDiscover = %b", Boolean.valueOf(z4));
        if (z4) {
            int i = this.l;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 != 0) {
                if (i2 == 2) {
                    apppVar.m("Screen On and RCN is enabled");
                    this.g.d();
                    return;
                } else {
                    if (i2 != 3) {
                        return;
                    }
                    apppVar.m("Screen On and RCN is disabled");
                    return;
                }
            }
            apppVar.m("start generic discovery");
            Runnable runnable = this.t;
            if (runnable != null) {
                this.k.removeCallbacks(runnable);
            }
            d(2);
            this.f.c(b, this.d, e());
            Runnable runnable2 = new Runnable() { // from class: aphl
                @Override // java.lang.Runnable
                public final void run() {
                    CastRemoteControlNotificationChimeraService.a.m("generic discovery is timed out");
                    CastRemoteControlNotificationChimeraService castRemoteControlNotificationChimeraService = CastRemoteControlNotificationChimeraService.this;
                    castRemoteControlNotificationChimeraService.d(4);
                    castRemoteControlNotificationChimeraService.f.e(castRemoteControlNotificationChimeraService.d);
                }
            };
            this.t = runnable2;
            this.k.postDelayed(runnable2, ((Long) this.n.lK()).longValue());
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
        eomt eomtVar2 = eomt.REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_UNKNOWN;
        if (z5 != z2 && !z2) {
            apppVar.m("RCN settings is disabled");
            eomtVar = eomt.REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_USER_DISABLE_FROM_SETTINGS;
        } else if (z6 && !this.h) {
            apppVar.m("Network is unavailable");
            eomtVar = eomt.REMOTE_CONTROL_NOTIFICATION_CANCEL_NETWORK_CHANGED;
            d(1);
        } else if (z8 == z3 || z3) {
            eomtVar = eomtVar2;
        } else {
            apppVar.m("Screen Off");
            eomtVar = eomt.REMOTE_CONTROL_NOTIFICATION_CANCEL_SCEEN_OFF;
        }
        if (eomtVar != eomtVar2) {
            apio apioVar = this.g;
            apioVar.c();
            apio.a.m("Remove all RCN notifications");
            apioVar.g.d(eomtVar);
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
        appp apppVar = a;
        apppVar.m("onCreate");
        aoca a2 = aoca.a(getApplicationContext(), "RCNService");
        this.q = a2;
        this.e = a2.e;
        this.v = a2.r;
        this.r = a2.j;
        if (this.f == null) {
            this.f = ltj.b(this);
        }
        if (this.p == null) {
            this.p = new apix(this, aurt.a);
        }
        if (c == null) {
            c = new apif(getApplicationContext(), this.e, this.p);
        }
        if (this.g == null) {
            this.g = new apio(this.f, this.r, c, e());
        }
        apio apioVar = this.g;
        apch apchVar = apioVar.f;
        apil apilVar = apioVar.i;
        apchVar.a.e.add(apilVar);
        apchVar.b.e.add(apilVar);
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
            ind.c(remoteControlNotificationMediaIntentReceiver.b, remoteControlNotificationMediaIntentReceiver, intentFilter, "com.google.android.gms.permission.INTERNAL_BROADCAST", null, 4);
            remoteControlNotificationMediaIntentReceiver.c = true;
        }
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.intent.action.SCREEN_ON");
        intentFilter2.addAction("android.intent.action.SCREEN_OFF");
        intentFilter2.addAction("com.google.android.gms.cast.rcn.ENABLED");
        intentFilter2.addAction("com.google.android.gms.cast.rcn.DISABLED");
        ind.b(getApplicationContext(), this.o, intentFilter2, 4);
        this.i = true;
        if (!((Boolean) this.m.lK()).booleanValue()) {
            apppVar.m("Trigger RCN discovery with network info");
            d(3);
            return;
        }
        apppVar.m("Trigger RCN discovery without network info");
        apae apaeVar = new apae() { // from class: aphk
            @Override // defpackage.apae
            public final void a(final boolean z) {
                CastRemoteControlNotificationChimeraService.a.n("network connectivity is changed to %b", Boolean.valueOf(z));
                final CastRemoteControlNotificationChimeraService castRemoteControlNotificationChimeraService = CastRemoteControlNotificationChimeraService.this;
                if (z) {
                    if (castRemoteControlNotificationChimeraService.h) {
                        castRemoteControlNotificationChimeraService.k.post(new Runnable() { // from class: aphg
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
                castRemoteControlNotificationChimeraService.k.post(new Runnable() { // from class: aphh
                    @Override // java.lang.Runnable
                    public final void run() {
                        CastRemoteControlNotificationChimeraService.this.b(z);
                    }
                });
            }
        };
        this.u = apaeVar;
        this.v.c(apaeVar);
        d(1);
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        apad apadVar;
        apil apilVar;
        a.m("onDestroy");
        apio apioVar = this.g;
        if (apioVar != null) {
            apioVar.c();
            apch apchVar = apioVar.f;
            if (apchVar != null && (apilVar = apioVar.i) != null) {
                apchVar.a.e.remove(apilVar);
                apchVar.b.e.remove(apilVar);
            }
        }
        ltj ltjVar = this.f;
        if (ltjVar != null) {
            ltjVar.e(this.d);
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
        apif apifVar = c;
        apifVar.d(eomt.REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_SERVICE_STOPPED);
        apifVar.f.clear();
        apifVar.g.clear();
        apae apaeVar = this.u;
        if (apaeVar != null && (apadVar = this.v) != null) {
            apadVar.d(apaeVar);
        }
        if (this.q != null) {
            aoca.b("RCNService");
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
