package com.google.android.gms.location.fused.manager;

import android.content.Context;
import android.location.Location;
import android.os.SystemClock;
import com.google.android.gms.libs.identity.ClientIdentity;
import com.google.android.gms.libs.platform.GmsAlarmManagerCompat$OnAlarmListener;
import com.google.android.gms.libs.platform.foreground.ForegroundHelper$ForegroundListener;
import defpackage.aupz;
import defpackage.ausn;
import defpackage.bsl;
import defpackage.byzk;
import defpackage.bzab;
import defpackage.bzan;
import defpackage.bzix;
import defpackage.bzkk;
import defpackage.bzlh;
import defpackage.cbuq;
import defpackage.cbuv;
import defpackage.cbuw;
import defpackage.cbvn;
import defpackage.cbvq;
import defpackage.cbvs;
import defpackage.ccat;
import defpackage.ccbp;
import defpackage.ccwb;
import defpackage.ccxr;
import defpackage.ekvl;
import defpackage.eluo;
import defpackage.irg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public abstract class FusedLocationManager$Registration extends bzan implements ForegroundHelper$ForegroundListener {
    private int f;
    private boolean g;
    private cbvq h;
    private boolean i;
    private long j;
    public final ClientIdentity l;
    public final cbvq m;
    public boolean n;
    public long o;
    public int p;
    public Location q;
    public bzkk r;
    public final /* synthetic */ ccat s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected FusedLocationManager$Registration(ccat ccatVar, cbvq cbvqVar, ClientIdentity clientIdentity, ccbp ccbpVar) {
        super(new aupz(1, 9), ccbpVar);
        this.s = ccatVar;
        this.j = -1L;
        this.l = clientIdentity;
        this.m = cbvqVar;
        this.f = 2;
        this.g = true;
        this.h = cbvqVar;
        this.n = true;
        this.i = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0063 A[Catch: all -> 0x0073, TryCatch #1 {, blocks: (B:4:0x0005, B:6:0x000b, B:9:0x000d, B:11:0x0011, B:13:0x0013, B:15:0x0021, B:17:0x002b, B:18:0x002f, B:24:0x003d, B:26:0x005a, B:28:0x0063, B:29:0x0066, B:32:0x0040, B:33:0x0041, B:34:0x0042, B:35:0x0046, B:42:0x0059, B:46:0x0071, B:47:0x0072, B:37:0x0047, B:39:0x004b, B:41:0x0053, B:43:0x0068, B:44:0x006f, B:20:0x0030, B:22:0x0034), top: B:3:0x0005, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void p(boolean r5) {
        /*
            r4 = this;
            ccat r0 = r4.s
            java.lang.Object r1 = r0.a
            monitor-enter(r1)
            boolean r2 = r4.g()     // Catch: java.lang.Throwable -> L73
            if (r2 != 0) goto Ld
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L73
            return
        Ld:
            boolean r2 = r4.g     // Catch: java.lang.Throwable -> L73
            if (r5 != r2) goto L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L73
            return
        L13:
            r4.g = r5     // Catch: java.lang.Throwable -> L73
            ausn r2 = defpackage.cbvn.a     // Catch: java.lang.Throwable -> L73
            com.google.android.gms.libs.identity.ClientIdentity r2 = r4.l     // Catch: java.lang.Throwable -> L73
            cbvn r0 = r0.g     // Catch: java.lang.Throwable -> L73
            boolean r3 = defpackage.cbur.a()     // Catch: java.lang.Throwable -> L73
            if (r3 == 0) goto L29
            cbus r3 = new cbus     // Catch: java.lang.Throwable -> L73
            r3.<init>(r2, r5)     // Catch: java.lang.Throwable -> L73
            r0.b(r3)     // Catch: java.lang.Throwable -> L73
        L29:
            if (r5 == 0) goto L42
            cbuq r5 = r0.a(r2)     // Catch: java.lang.Throwable -> L73
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L73
            int r0 = r5.d     // Catch: java.lang.Throwable -> L3f
            if (r0 <= 0) goto L3d
            r5.b()     // Catch: java.lang.Throwable -> L3f
            int r0 = r5.d     // Catch: java.lang.Throwable -> L3f
            int r0 = r0 + (-1)
            r5.d = r0     // Catch: java.lang.Throwable -> L3f
        L3d:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L73
            goto L5a
        L3f:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L73
            throw r0     // Catch: java.lang.Throwable -> L73
        L42:
            cbuq r5 = r0.a(r2)     // Catch: java.lang.Throwable -> L73
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L73
            int r0 = r5.b     // Catch: java.lang.Throwable -> L70
            if (r0 <= 0) goto L68
            int r0 = r5.d     // Catch: java.lang.Throwable -> L70
            int r2 = r0 + 1
            r5.d = r2     // Catch: java.lang.Throwable -> L70
            if (r0 != 0) goto L59
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L70
            r5.j = r2     // Catch: java.lang.Throwable -> L70
        L59:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L73
        L5a:
            r4.q()     // Catch: java.lang.Throwable -> L73
            boolean r5 = r4.A()     // Catch: java.lang.Throwable -> L73
            if (r5 == 0) goto L66
            r4.n()     // Catch: java.lang.Throwable -> L73
        L66:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L73
            return
        L68:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L70
            java.lang.String r2 = "Check failed."
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L70
            throw r0     // Catch: java.lang.Throwable -> L70
        L70:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L73
            throw r0     // Catch: java.lang.Throwable -> L73
        L73:
            r5 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L73
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.fused.manager.FusedLocationManager$Registration.p(boolean):void");
    }

    private final void q() {
        boolean z = false;
        if (this.b && w().a == 100 && w().b < 300000 && (w().m || ((this.g || !this.s.n.t("network")) && this.s.n.t("gps")))) {
            z = true;
        }
        if (z == this.i) {
            return;
        }
        this.i = z;
        if (z) {
            ausn ausnVar = cbvn.a;
            ClientIdentity clientIdentity = this.l;
            this.s.o.m("android:monitor_location_high_power", clientIdentity.c, clientIdentity.e, clientIdentity.f);
        } else {
            ausn ausnVar2 = cbvn.a;
            ClientIdentity clientIdentity2 = this.l;
            this.s.o.i("android:monitor_location_high_power", clientIdentity2.c, clientIdentity2.e, clientIdentity2.f);
        }
        this.s.I();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fb A[Catch: all -> 0x014f, DONT_GENERATE, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x0023, B:7:0x0040, B:13:0x0056, B:18:0x0060, B:22:0x006e, B:24:0x0074, B:26:0x007a, B:27:0x00cf, B:30:0x00d7, B:33:0x00ea, B:35:0x00fb, B:38:0x00fd, B:40:0x0121, B:41:0x0127, B:54:0x0143, B:55:0x0144, B:58:0x014d, B:63:0x0097, B:64:0x00ad, B:67:0x004b, B:68:0x0050, B:70:0x0053, B:43:0x0128, B:45:0x0130, B:47:0x0132, B:49:0x013c, B:50:0x013f), top: B:3:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fd A[Catch: all -> 0x014f, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x0023, B:7:0x0040, B:13:0x0056, B:18:0x0060, B:22:0x006e, B:24:0x0074, B:26:0x007a, B:27:0x00cf, B:30:0x00d7, B:33:0x00ea, B:35:0x00fb, B:38:0x00fd, B:40:0x0121, B:41:0x0127, B:54:0x0143, B:55:0x0144, B:58:0x014d, B:63:0x0097, B:64:0x00ad, B:67:0x004b, B:68:0x0050, B:70:0x0053, B:43:0x0128, B:45:0x0130, B:47:0x0132, B:49:0x013c, B:50:0x013f), top: B:3:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean A() {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.fused.manager.FusedLocationManager$Registration.A():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean B() {
        /*
            r9 = this;
            ccat r0 = r9.s
            android.content.Context r1 = r0.d
            com.google.android.gms.libs.identity.ClientIdentity r2 = r9.l
            int r1 = defpackage.ccxr.a(r1, r2)
            int r3 = r9.f
            r4 = 0
            if (r1 == r3) goto L3e
            ausn r3 = defpackage.cbvn.a
            cbvn r3 = r0.g
            boolean r5 = defpackage.cbur.a()
            if (r5 == 0) goto L21
            cbut r5 = new cbut
            r5.<init>(r2, r1)
            r3.b(r5)
        L21:
            cbuq r3 = r3.a(r2)
            monitor-enter(r3)
            r3.b()     // Catch: java.lang.Throwable -> L3b
            r3.a = r1     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r3)
            r9.f = r1
            cbvq r1 = r9.w()
            int r1 = r1.k
            if (r1 != 0) goto L3e
            boolean r1 = r9.A()
            goto L3f
        L3b:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L3e:
            r1 = r4
        L3f:
            int r3 = r9.t()
            int r5 = r9.f
            boolean r3 = defpackage.ccxr.e(r3, r5)
            r5 = 1
            if (r3 == 0) goto L5d
            bzix r3 = r0.o
            java.lang.String r6 = r9.x()
            int r7 = r2.c
            java.lang.String r8 = r2.e
            int r3 = r3.a(r6, r7, r8)
            if (r3 != 0) goto L5d
            r4 = r5
        L5d:
            boolean r3 = r9.n
            if (r4 == r3) goto L76
            r9.n = r4
            ausn r1 = defpackage.cbvn.a
            cbvn r0 = r0.g
            boolean r1 = defpackage.cbur.a()
            if (r1 == 0) goto L75
            cbuu r1 = new cbuu
            r1.<init>(r2, r4)
            r0.b(r1)
        L75:
            return r5
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.fused.manager.FusedLocationManager$Registration.B():boolean");
    }

    public final boolean C() {
        boolean A;
        synchronized (this.s.a) {
            q();
            A = A();
        }
        return A;
    }

    @Override // com.google.android.gms.libs.platform.foreground.ForegroundHelper$ForegroundListener
    public final void a(int i, boolean z) {
        ekvl.q(i == this.l.c);
        p(z);
    }

    @Override // defpackage.bzac
    protected void b() {
        ausn ausnVar = cbvn.a;
        ccat ccatVar = this.s;
        cbvn cbvnVar = ccatVar.g;
        ClientIdentity clientIdentity = this.l;
        cbuq a = cbvnVar.a(clientIdentity);
        synchronized (a) {
            if (a.b <= 0) {
                throw new IllegalStateException("Check failed.");
            }
            int i = a.c;
            a.c = i + 1;
            if (i == 0) {
                a.i = SystemClock.elapsedRealtime();
            }
        }
        if (w().c()) {
            return;
        }
        ccatVar.o.m("android:monitor_location", clientIdentity.c, clientIdentity.e, clientIdentity.f);
        q();
    }

    @Override // defpackage.bzac
    protected void c() {
        if (!w().c()) {
            q();
            try {
                bzix bzixVar = this.s.o;
                ClientIdentity clientIdentity = this.l;
                bzixVar.i("android:monitor_location", clientIdentity.c, clientIdentity.e, clientIdentity.f);
            } catch (IllegalArgumentException e) {
                ((eluo) ((eluo) ((eluo) cbvn.a.j()).s(e)).ai((char) 5585)).x("error finishing monitor location op");
            }
        }
        cbuq a = this.s.g.a(this.l);
        synchronized (a) {
            a.b();
            int i = a.c - 1;
            a.c = i;
            if (i < 0) {
                throw new IllegalStateException("Check failed.");
            }
        }
    }

    @Override // defpackage.bzan, defpackage.bzac
    protected void f() {
        ccat ccatVar = this.s;
        ccatVar.q.c(this);
        bzkk bzkkVar = this.r;
        if (bzkkVar != null) {
            bzkkVar.a();
            this.r = null;
        }
        super.f();
        cbvn cbvnVar = ccatVar.g;
        ClientIdentity clientIdentity = this.l;
        cbvnVar.b(new cbuw(clientIdentity, cbuv.b, null));
        String str = clientIdentity.g;
        cbuq a = cbvnVar.a(clientIdentity);
        synchronized (a) {
            a.b();
            a.e.remove(str);
            int i = a.b - 1;
            a.b = i;
            if (i < 0) {
                throw new IllegalStateException("Check failed.");
            }
            a.c = (int) Math.min(i, a.c);
            a.d = (int) Math.min(a.b, a.d);
            if (a.b == 0) {
                a.a = 0;
            }
        }
    }

    @Override // defpackage.bzan
    protected final /* synthetic */ byzk h() {
        return this.s;
    }

    @Override // defpackage.bzan
    protected void j() {
        long j;
        ausn ausnVar = cbvn.a;
        ClientIdentity clientIdentity = this.l;
        cbuv cbuvVar = cbuv.a;
        cbvq cbvqVar = this.m;
        cbuw cbuwVar = new cbuw(clientIdentity, cbuvVar, cbvqVar);
        cbvn cbvnVar = this.s.g;
        cbvnVar.b(cbuwVar);
        cbuq a = cbvnVar.a(clientIdentity);
        String str = clientIdentity.g;
        synchronized (a) {
            int i = a.b;
            a.b = i + 1;
            if (i == 0) {
                a.h = SystemClock.elapsedRealtime();
                a.a = 2;
            }
            a.a(str, cbvqVar);
        }
        long j2 = this.j;
        if (j2 < 0) {
            j2 = SystemClock.elapsedRealtime();
            this.j = j2;
        }
        try {
            long c = irg.c(j2, this.m.h);
            this.o = c;
            j = c;
        } catch (ArithmeticException unused) {
            this.o = Long.MAX_VALUE;
            j = Long.MAX_VALUE;
        }
        if (j < Long.MAX_VALUE) {
            ccat ccatVar = this.s;
            this.r = ccatVar.B.b("FusedLocation:expire", 2, j, w().n.b(), ccatVar.e, new GmsAlarmManagerCompat$OnAlarmListener() { // from class: com.google.android.gms.location.fused.manager.FusedLocationManager$Registration$$ExternalSyntheticLambda1
                @Override // com.google.android.gms.libs.platform.GmsAlarmManagerCompat$OnAlarmListener
                public final void a(bzkk bzkkVar) {
                    FusedLocationManager$Registration fusedLocationManager$Registration = FusedLocationManager$Registration.this;
                    synchronized (fusedLocationManager$Registration.s.a) {
                        if (bzkkVar == fusedLocationManager$Registration.r) {
                            fusedLocationManager$Registration.r = null;
                            fusedLocationManager$Registration.s();
                        }
                    }
                }
            });
        }
        ccat ccatVar2 = this.s;
        ClientIdentity clientIdentity2 = this.l;
        bzlh bzlhVar = ccatVar2.q;
        Context context = ccatVar2.d;
        int i2 = clientIdentity2.c;
        bzlhVar.a(context, i2, ccatVar2.e, this);
        B();
        p(bzlhVar.d(i2));
        A();
    }

    @Override // defpackage.bzan
    public final void k(boolean z) {
        if (z) {
            return;
        }
        iq(new bzab() { // from class: ccas
            @Override // defpackage.bzab
            public final void c(Object obj) {
                ((ccbp) obj).d();
            }

            @Override // defpackage.bzab
            public final /* synthetic */ void a(boolean z2) {
            }

            @Override // defpackage.bzab
            public final /* synthetic */ void b(boolean z2) {
            }
        });
    }

    public abstract bzab o(cbvs cbvsVar, boolean z);

    public abstract void r(boolean z);

    protected void s() {
        ausn ausnVar = cbvn.a;
        ccwb.c(this.o);
        m(false);
    }

    public final int t() {
        int b;
        synchronized (this.s.a) {
            b = ccxr.b(w().k, this.f);
        }
        return b;
    }

    public final String toString() {
        String sb;
        synchronized (this.s.a) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.l);
            bsl bslVar = new bsl(2);
            if (!this.g) {
                bslVar.add("bg");
            }
            if (!this.n) {
                bslVar.add("na");
            }
            if (!bslVar.isEmpty()) {
                sb2.append(" ");
                sb2.append(bslVar);
            }
            sb2.append(" (");
            sb2.append(ccxr.d(this.f));
            sb2.append(") ");
            sb2.append(w());
            sb = sb2.toString();
        }
        return sb;
    }

    public final long u() {
        long j;
        synchronized (this.s.a) {
            j = this.j;
        }
        return j;
    }

    public final Location v() {
        Location location;
        synchronized (this.s.a) {
            location = this.q;
        }
        return location;
    }

    public final cbvq w() {
        cbvq cbvqVar;
        synchronized (this.s.a) {
            cbvqVar = this.h;
        }
        return cbvqVar;
    }

    public final String x() {
        String c;
        synchronized (this.s.a) {
            c = ccxr.c(w().k, this.f);
        }
        return c;
    }

    public final void y(Location location) {
        synchronized (this.s.a) {
            this.q = location;
        }
    }

    public final boolean z() {
        boolean z;
        synchronized (this.s.a) {
            z = this.g;
        }
        return z;
    }
}
