package com.google.android.gms.gcm.connection;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.cast.JGCastService;
import com.google.android.gms.gcm.connection.HeartbeatChimeraAlarm;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.aurp;
import defpackage.bkfp;
import defpackage.bkfr;
import defpackage.bkgj;
import defpackage.bkhl;
import defpackage.bkic;
import defpackage.bkis;
import defpackage.frbt;
import defpackage.frbw;
import defpackage.fxqo;
import j$.time.Duration;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class HeartbeatChimeraAlarm extends TracingBroadcastReceiver {
    static final Duration a = Duration.ofSeconds(30);
    public boolean b;
    public long c;
    public final bkfp d;
    public final fxqo e;
    public final bkis f;
    public long g;
    public int h;
    public volatile bkfr i;
    public int j;
    public boolean k;
    public long l;
    long m;
    public long n;
    long o;
    boolean p;
    public final aurp q;
    boolean r;
    public final bkic s;
    private final Context t;
    private final Intent u;

    public HeartbeatChimeraAlarm(Context context, bkic bkicVar, bkfp bkfpVar, bkis bkisVar, aurp aurpVar, fxqo fxqoVar) {
        super("gcm");
        this.b = false;
        this.c = 0L;
        this.m = 0L;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
        Intent intent = new Intent("com.google.android.gms.gcm.ACTION_DID_HEARTBEAT");
        this.u = intent;
        this.r = false;
        this.t = context;
        this.s = bkicVar;
        this.d = bkfpVar;
        this.f = bkisVar;
        this.q = aurpVar;
        this.e = fxqoVar;
        intent.setFlags(JGCastService.FLAG_PRIVATE_DISPLAY);
        this.k = false;
        bkisVar.i(new bkhl(this));
    }

    public static boolean k(int i) {
        return !Arrays.asList(frbw.a.lK().l().split(";")).contains(Integer.toString(i));
    }

    private final void n() {
        bkfr bkfrVar = this.i;
        if (bkfrVar == null || !j(bkfrVar)) {
            return;
        }
        int a2 = bkfrVar.a();
        bkfrVar.d(1);
        this.k = a2 == bkfrVar.a();
    }

    public final int b() {
        bkfr bkfrVar = this.i;
        int a2 = (bkfrVar == null || !j(bkfrVar)) ? -1 : bkfrVar.a();
        if (a2 == -1 || a2 == this.j) {
            return -1;
        }
        return a2;
    }

    public final long c() {
        long f = frbw.f();
        return (!this.r || f <= 0) ? l() ? d() + frbw.a.lK().i() : d() : f;
    }

    public final long d() {
        bkfr a2;
        long d = frbw.d();
        long j = this.h;
        if (j > 0 && d > j) {
            d = j;
        }
        this.i = null;
        int b = this.s.b();
        if (!k(b) || (a2 = this.d.b(b).a(this.t)) == null) {
            return d;
        }
        this.i = a2;
        return a2.a();
    }

    public final void e() {
        bkgj bkgjVar = (bkgj) this.e.a();
        if (!frbt.q() || !bkgjVar.v()) {
            bkgjVar.p(false);
        }
        this.f.h();
    }

    public final void f() {
        fxqo fxqoVar = this.e;
        bkgj bkgjVar = (bkgj) fxqoVar.a();
        if (frbt.q() && bkgjVar.v() && this.b) {
            this.l = SystemClock.elapsedRealtime() - this.m;
            if (this.p) {
                n();
            }
            this.b = false;
        } else if (bkgjVar.r()) {
            this.l = SystemClock.elapsedRealtime() - this.m;
            bkgjVar.p(false);
            if (this.p) {
                n();
            }
        } else if (((bkgj) fxqoVar.a()).v() && SystemClock.elapsedRealtime() - Math.max(this.n, this.o) > d() - a.toMillis()) {
            n();
        }
        this.o = SystemClock.elapsedRealtime();
        this.f.g(c());
    }

    public final void g() {
        bkgj bkgjVar = (bkgj) this.e.a();
        if (bkgjVar.s()) {
            if (frbt.q() && bkgjVar.v()) {
                if (this.b) {
                    n();
                    this.b = false;
                }
                i(true);
                return;
            }
            if (!bkgjVar.r()) {
                i(true);
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.m;
            long e = frbw.e();
            if (j < e) {
                this.f.g(e - j);
                Log.w("GCM", "Heartbeat alarm fired early: " + j);
                return;
            }
            Log.w("GCM", "Heartbeat timeout, GCM connection reset " + (this.f.e() - elapsedRealtime));
            e();
            bkgjVar.y(6, null);
            this.g = SystemClock.elapsedRealtime();
        }
    }

    public final void h() {
        this.f.a.g();
    }

    public final void i(boolean z) {
        bkgj bkgjVar = (bkgj) this.e.a();
        if (!frbt.q()) {
            this.f.a.c(bkgjVar.c());
        }
        this.p = SystemClock.elapsedRealtime() >= this.n + d();
        bkgjVar.x();
        this.m = SystemClock.elapsedRealtime();
        if (frbw.a.lK().q() && z) {
            this.t.sendBroadcast(this.u);
        }
        if (frbt.q() && bkgjVar.v()) {
            this.b = true;
            this.f.g(c());
        } else {
            bkgjVar.p(true);
            this.f.g(frbw.e());
        }
    }

    public final boolean j(bkfr bkfrVar) {
        int b = this.s.b();
        return k(b) && bkfrVar.a.c == b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        char c;
        fxqo fxqoVar = this.e;
        String action = intent.getAction();
        bkgj bkgjVar = (bkgj) fxqoVar.a();
        if (action == null) {
            if (Log.isLoggable("GCM", 4)) {
                Log.i("GCM", "Action not present in HeartbeatAlarm: null");
                return;
            }
            return;
        }
        switch (action.hashCode()) {
            case -2128145023:
                if (action.equals("android.intent.action.SCREEN_OFF")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1700544179:
                if (action.equals("com.google.android.intent.action.MCS_HEARTBEAT")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -264073239:
                if (action.equals("com.google.android.gms.gcm.HEARTBEAT_ALARM")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 764219535:
                if (action.equals("com.google.android.gms.gcm.ACTION_HEARTBEAT_NOW")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 823795052:
                if (action.equals("android.intent.action.USER_PRESENT")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            this.r = true;
        } else if (c != 1 && c != 2) {
            if (c == 3) {
                this.r = false;
                return;
            } else if (c == 4) {
                bkgjVar.n(new Runnable() { // from class: bkhk
                    @Override // java.lang.Runnable
                    public final void run() {
                        HeartbeatChimeraAlarm.this.g();
                    }
                });
                return;
            } else {
                if (Log.isLoggable("GCM", 4)) {
                    Log.i("GCM", "Unknown intent action in HeartbeatAlarm: ".concat(action));
                    return;
                }
                return;
            }
        }
        bkgjVar.n(new Runnable() { // from class: bkhj
            @Override // java.lang.Runnable
            public final void run() {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                HeartbeatChimeraAlarm heartbeatChimeraAlarm = HeartbeatChimeraAlarm.this;
                long j = elapsedRealtime - heartbeatChimeraAlarm.c;
                long f = frbw.f();
                bkgj bkgjVar2 = (bkgj) heartbeatChimeraAlarm.e.a();
                if (f < 0 || heartbeatChimeraAlarm.m()) {
                    return;
                }
                if (j >= f || heartbeatChimeraAlarm.c == 0) {
                    heartbeatChimeraAlarm.c = SystemClock.elapsedRealtime();
                    if (bkgjVar2.s()) {
                        heartbeatChimeraAlarm.i(false);
                    } else {
                        heartbeatChimeraAlarm.s.g();
                    }
                }
            }
        });
    }

    public final boolean l() {
        if (frbw.h()) {
            return ((bkgj) this.e.a()).v();
        }
        return false;
    }

    public final boolean m() {
        bkgj bkgjVar = (bkgj) this.e.a();
        return (frbt.q() && bkgjVar.v()) ? SystemClock.elapsedRealtime() - this.m < frbt.i() + frbt.a.lK().V() : bkgjVar.r();
    }
}
