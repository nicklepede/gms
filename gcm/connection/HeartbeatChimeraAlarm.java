package com.google.android.gms.gcm.connection;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.cast.JGCastService;
import com.google.android.gms.gcm.connection.HeartbeatChimeraAlarm;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.asnv;
import defpackage.biba;
import defpackage.bibc;
import defpackage.bibu;
import defpackage.bicw;
import defpackage.bidn;
import defpackage.bied;
import defpackage.fojc;
import defpackage.fojf;
import defpackage.fuuq;
import j$.time.Duration;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class HeartbeatChimeraAlarm extends TracingBroadcastReceiver {
    static final Duration a = Duration.ofSeconds(30);
    public boolean b;
    public long c;
    public final biba d;
    public final fuuq e;
    public final bied f;
    public long g;
    public int h;
    public volatile bibc i;
    public int j;
    public boolean k;
    public long l;
    long m;
    public long n;
    long o;
    boolean p;
    public final asnv q;
    boolean r;
    public final bidn s;
    private final Context t;
    private final Intent u;

    public HeartbeatChimeraAlarm(Context context, bidn bidnVar, biba bibaVar, bied biedVar, asnv asnvVar, fuuq fuuqVar) {
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
        this.s = bidnVar;
        this.d = bibaVar;
        this.f = biedVar;
        this.q = asnvVar;
        this.e = fuuqVar;
        intent.setFlags(JGCastService.FLAG_PRIVATE_DISPLAY);
        this.k = false;
        biedVar.i(new bicw(this));
    }

    public static boolean k(int i) {
        return !Arrays.asList(fojf.a.a().l().split(";")).contains(Integer.toString(i));
    }

    private final void n() {
        bibc bibcVar = this.i;
        if (bibcVar == null || !j(bibcVar)) {
            return;
        }
        int a2 = bibcVar.a();
        bibcVar.d(1);
        this.k = a2 == bibcVar.a();
    }

    public final int b() {
        bibc bibcVar = this.i;
        int a2 = (bibcVar == null || !j(bibcVar)) ? -1 : bibcVar.a();
        if (a2 == -1 || a2 == this.j) {
            return -1;
        }
        return a2;
    }

    public final long c() {
        long f = fojf.f();
        return (!this.r || f <= 0) ? l() ? d() + fojf.a.a().i() : d() : f;
    }

    public final long d() {
        bibc a2;
        long d = fojf.d();
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
        bibu bibuVar = (bibu) this.e.a();
        if (!fojc.r() || !bibuVar.v()) {
            bibuVar.p(false);
        }
        this.f.h();
    }

    public final void f() {
        fuuq fuuqVar = this.e;
        bibu bibuVar = (bibu) fuuqVar.a();
        if (fojc.r() && bibuVar.v() && this.b) {
            this.l = SystemClock.elapsedRealtime() - this.m;
            if (this.p) {
                n();
            }
            this.b = false;
        } else if (bibuVar.r()) {
            this.l = SystemClock.elapsedRealtime() - this.m;
            bibuVar.p(false);
            if (this.p) {
                n();
            }
        } else if (((bibu) fuuqVar.a()).v() && SystemClock.elapsedRealtime() - Math.max(this.n, this.o) > d() - a.toMillis()) {
            n();
        }
        this.o = SystemClock.elapsedRealtime();
        this.f.g(c());
    }

    public final void g() {
        bibu bibuVar = (bibu) this.e.a();
        if (bibuVar.s()) {
            if (fojc.r() && bibuVar.v()) {
                if (this.b) {
                    n();
                    this.b = false;
                }
                i(true);
                return;
            }
            if (!bibuVar.r()) {
                i(true);
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.m;
            long e = fojf.e();
            if (j < e) {
                this.f.g(e - j);
                Log.w("GCM", "Heartbeat alarm fired early: " + j);
                return;
            }
            Log.w("GCM", "Heartbeat timeout, GCM connection reset " + (this.f.e() - elapsedRealtime));
            e();
            bibuVar.y(6, null);
            this.g = SystemClock.elapsedRealtime();
        }
    }

    public final void h() {
        this.f.a.g();
    }

    public final void i(boolean z) {
        bibu bibuVar = (bibu) this.e.a();
        if (!fojc.r()) {
            this.f.a.c(bibuVar.c());
        }
        this.p = SystemClock.elapsedRealtime() >= this.n + d();
        bibuVar.x();
        this.m = SystemClock.elapsedRealtime();
        if (fojf.a.a().q() && z) {
            this.t.sendBroadcast(this.u);
        }
        if (fojc.r() && bibuVar.v()) {
            this.b = true;
            this.f.g(c());
        } else {
            bibuVar.p(true);
            this.f.g(fojf.e());
        }
    }

    public final boolean j(bibc bibcVar) {
        int b = this.s.b();
        return k(b) && bibcVar.a.c == b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        char c;
        fuuq fuuqVar = this.e;
        String action = intent.getAction();
        bibu bibuVar = (bibu) fuuqVar.a();
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
                bibuVar.n(new Runnable() { // from class: bicv
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
        bibuVar.n(new Runnable() { // from class: bicu
            @Override // java.lang.Runnable
            public final void run() {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                HeartbeatChimeraAlarm heartbeatChimeraAlarm = HeartbeatChimeraAlarm.this;
                long j = elapsedRealtime - heartbeatChimeraAlarm.c;
                long f = fojf.f();
                bibu bibuVar2 = (bibu) heartbeatChimeraAlarm.e.a();
                if (f < 0 || heartbeatChimeraAlarm.m()) {
                    return;
                }
                if (j >= f || heartbeatChimeraAlarm.c == 0) {
                    heartbeatChimeraAlarm.c = SystemClock.elapsedRealtime();
                    if (bibuVar2.s()) {
                        heartbeatChimeraAlarm.i(false);
                    } else {
                        heartbeatChimeraAlarm.s.g();
                    }
                }
            }
        });
    }

    public final boolean l() {
        if (fojf.h()) {
            return ((bibu) this.e.a()).v();
        }
        return false;
    }

    public final boolean m() {
        bibu bibuVar = (bibu) this.e.a();
        return (fojc.r() && bibuVar.v()) ? SystemClock.elapsedRealtime() - this.m < fojc.i() + fojc.a.a().U() : bibuVar.r();
    }
}
