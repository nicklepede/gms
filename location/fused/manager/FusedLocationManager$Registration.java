package com.google.android.gms.location.fused.manager;

import android.content.Context;
import android.location.Location;
import android.os.SystemClock;
import com.google.android.gms.libs.identity.ClientIdentity;
import com.google.android.gms.libs.platform.GmsAlarmManagerCompat$OnAlarmListener;
import com.google.android.gms.libs.platform.foreground.ForegroundHelper$ForegroundListener;
import defpackage.asmf;
import defpackage.asot;
import defpackage.bsa;
import defpackage.bwqu;
import defpackage.bwrl;
import defpackage.bwrx;
import defpackage.bxah;
import defpackage.bxbu;
import defpackage.bxcr;
import defpackage.bzlz;
import defpackage.bzme;
import defpackage.bzmf;
import defpackage.bzmw;
import defpackage.bzmz;
import defpackage.bznb;
import defpackage.bzsc;
import defpackage.bzsy;
import defpackage.canl;
import defpackage.capb;
import defpackage.eiig;
import defpackage.ejhf;
import defpackage.ipq;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public abstract class FusedLocationManager$Registration extends bwrx implements ForegroundHelper$ForegroundListener {
    private int f;
    private boolean g;
    private bzmz h;
    private boolean i;
    private long j;
    public final ClientIdentity l;
    public final bzmz m;
    public boolean n;
    public long o;
    public int p;
    public Location q;
    public bxbu r;
    public final /* synthetic */ bzsc s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected FusedLocationManager$Registration(bzsc bzscVar, bzmz bzmzVar, ClientIdentity clientIdentity, bzsy bzsyVar) {
        super(new asmf(1, 9), bzsyVar);
        this.s = bzscVar;
        this.j = -1L;
        this.l = clientIdentity;
        this.m = bzmzVar;
        this.f = 2;
        this.g = true;
        this.h = bzmzVar;
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
            bzsc r0 = r4.s
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
            asot r2 = defpackage.bzmw.a     // Catch: java.lang.Throwable -> L73
            com.google.android.gms.libs.identity.ClientIdentity r2 = r4.l     // Catch: java.lang.Throwable -> L73
            bzmw r0 = r0.g     // Catch: java.lang.Throwable -> L73
            boolean r3 = defpackage.bzma.a()     // Catch: java.lang.Throwable -> L73
            if (r3 == 0) goto L29
            bzmb r3 = new bzmb     // Catch: java.lang.Throwable -> L73
            r3.<init>(r2, r5)     // Catch: java.lang.Throwable -> L73
            r0.b(r3)     // Catch: java.lang.Throwable -> L73
        L29:
            if (r5 == 0) goto L42
            bzlz r5 = r0.a(r2)     // Catch: java.lang.Throwable -> L73
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
            bzlz r5 = r0.a(r2)     // Catch: java.lang.Throwable -> L73
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
        if (this.b && w().a == 100 && w().b < 300000 && (w().m || ((this.g || !this.s.n.s("network")) && this.s.n.s("gps")))) {
            z = true;
        }
        if (z == this.i) {
            return;
        }
        this.i = z;
        if (z) {
            asot asotVar = bzmw.a;
            ClientIdentity clientIdentity = this.l;
            this.s.o.m("android:monitor_location_high_power", clientIdentity.c, clientIdentity.e, clientIdentity.f);
        } else {
            asot asotVar2 = bzmw.a;
            ClientIdentity clientIdentity2 = this.l;
            this.s.o.i("android:monitor_location_high_power", clientIdentity2.c, clientIdentity2.e, clientIdentity2.f);
        }
        this.s.I();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f3 A[Catch: all -> 0x0147, DONT_GENERATE, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x0023, B:7:0x0040, B:13:0x0056, B:18:0x0060, B:22:0x006e, B:24:0x0074, B:26:0x007a, B:27:0x00cf, B:30:0x00e2, B:32:0x00f3, B:35:0x00f5, B:37:0x0119, B:38:0x011f, B:51:0x013b, B:52:0x013c, B:55:0x0145, B:59:0x0097, B:60:0x00ad, B:63:0x004b, B:64:0x0050, B:66:0x0053, B:40:0x0120, B:42:0x0128, B:44:0x012a, B:46:0x0134, B:47:0x0137), top: B:3:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f5 A[Catch: all -> 0x0147, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x0023, B:7:0x0040, B:13:0x0056, B:18:0x0060, B:22:0x006e, B:24:0x0074, B:26:0x007a, B:27:0x00cf, B:30:0x00e2, B:32:0x00f3, B:35:0x00f5, B:37:0x0119, B:38:0x011f, B:51:0x013b, B:52:0x013c, B:55:0x0145, B:59:0x0097, B:60:0x00ad, B:63:0x004b, B:64:0x0050, B:66:0x0053, B:40:0x0120, B:42:0x0128, B:44:0x012a, B:46:0x0134, B:47:0x0137), top: B:3:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean A() {
        /*
            Method dump skipped, instructions count: 330
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
            bzsc r0 = r9.s
            android.content.Context r1 = r0.d
            com.google.android.gms.libs.identity.ClientIdentity r2 = r9.l
            int r1 = defpackage.capb.a(r1, r2)
            int r3 = r9.f
            r4 = 0
            if (r1 == r3) goto L3e
            asot r3 = defpackage.bzmw.a
            bzmw r3 = r0.g
            boolean r5 = defpackage.bzma.a()
            if (r5 == 0) goto L21
            bzmc r5 = new bzmc
            r5.<init>(r2, r1)
            r3.b(r5)
        L21:
            bzlz r3 = r3.a(r2)
            monitor-enter(r3)
            r3.b()     // Catch: java.lang.Throwable -> L3b
            r3.a = r1     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r3)
            r9.f = r1
            bzmz r1 = r9.w()
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
            boolean r3 = defpackage.capb.e(r3, r5)
            r5 = 1
            if (r3 == 0) goto L5d
            bxah r3 = r0.o
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
            asot r1 = defpackage.bzmw.a
            bzmw r0 = r0.g
            boolean r1 = defpackage.bzma.a()
            if (r1 == 0) goto L75
            bzmd r1 = new bzmd
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
        eiig.p(i == this.l.c);
        p(z);
    }

    @Override // defpackage.bwrm
    protected void b() {
        asot asotVar = bzmw.a;
        bzsc bzscVar = this.s;
        bzmw bzmwVar = bzscVar.g;
        ClientIdentity clientIdentity = this.l;
        bzlz a = bzmwVar.a(clientIdentity);
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
        bzscVar.o.m("android:monitor_location", clientIdentity.c, clientIdentity.e, clientIdentity.f);
        q();
    }

    @Override // defpackage.bwrm
    protected void c() {
        if (!w().c()) {
            q();
            try {
                bxah bxahVar = this.s.o;
                ClientIdentity clientIdentity = this.l;
                bxahVar.i("android:monitor_location", clientIdentity.c, clientIdentity.e, clientIdentity.f);
            } catch (IllegalArgumentException e) {
                ((ejhf) ((ejhf) ((ejhf) bzmw.a.j()).s(e)).ah((char) 5571)).x("error finishing monitor location op");
            }
        }
        bzlz a = this.s.g.a(this.l);
        synchronized (a) {
            a.b();
            int i = a.c - 1;
            a.c = i;
            if (i < 0) {
                throw new IllegalStateException("Check failed.");
            }
        }
    }

    @Override // defpackage.bwrx, defpackage.bwrm
    protected void f() {
        bzsc bzscVar = this.s;
        bzscVar.q.c(this);
        bxbu bxbuVar = this.r;
        if (bxbuVar != null) {
            bxbuVar.a();
            this.r = null;
        }
        super.f();
        bzmw bzmwVar = bzscVar.g;
        ClientIdentity clientIdentity = this.l;
        bzmwVar.b(new bzmf(clientIdentity, bzme.b, null));
        String str = clientIdentity.g;
        bzlz a = bzmwVar.a(clientIdentity);
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

    @Override // defpackage.bwrx
    protected final /* synthetic */ bwqu h() {
        return this.s;
    }

    @Override // defpackage.bwrx
    protected void j() {
        long j;
        asot asotVar = bzmw.a;
        ClientIdentity clientIdentity = this.l;
        bzme bzmeVar = bzme.a;
        bzmz bzmzVar = this.m;
        bzmf bzmfVar = new bzmf(clientIdentity, bzmeVar, bzmzVar);
        bzmw bzmwVar = this.s.g;
        bzmwVar.b(bzmfVar);
        bzlz a = bzmwVar.a(clientIdentity);
        String str = clientIdentity.g;
        synchronized (a) {
            int i = a.b;
            a.b = i + 1;
            if (i == 0) {
                a.h = SystemClock.elapsedRealtime();
                a.a = 2;
            }
            a.a(str, bzmzVar);
        }
        long j2 = this.j;
        if (j2 < 0) {
            j2 = SystemClock.elapsedRealtime();
            this.j = j2;
        }
        try {
            long c = ipq.c(j2, this.m.h);
            this.o = c;
            j = c;
        } catch (ArithmeticException unused) {
            this.o = Long.MAX_VALUE;
            j = Long.MAX_VALUE;
        }
        if (j < Long.MAX_VALUE) {
            bzsc bzscVar = this.s;
            this.r = bzscVar.B.b("FusedLocation:expire", 2, j, w().n.b(), bzscVar.e, new GmsAlarmManagerCompat$OnAlarmListener() { // from class: com.google.android.gms.location.fused.manager.FusedLocationManager$Registration$$ExternalSyntheticLambda1
                @Override // com.google.android.gms.libs.platform.GmsAlarmManagerCompat$OnAlarmListener
                public final void a(bxbu bxbuVar) {
                    FusedLocationManager$Registration fusedLocationManager$Registration = FusedLocationManager$Registration.this;
                    synchronized (fusedLocationManager$Registration.s.a) {
                        if (bxbuVar == fusedLocationManager$Registration.r) {
                            fusedLocationManager$Registration.r = null;
                            fusedLocationManager$Registration.s();
                        }
                    }
                }
            });
        }
        bzsc bzscVar2 = this.s;
        ClientIdentity clientIdentity2 = this.l;
        bxcr bxcrVar = bzscVar2.q;
        Context context = bzscVar2.d;
        int i2 = clientIdentity2.c;
        bxcrVar.a(context, i2, bzscVar2.e, this);
        B();
        p(bxcrVar.d(i2));
        A();
    }

    @Override // defpackage.bwrx
    public final void k(boolean z) {
        if (z) {
            return;
        }
        ib(new bwrl() { // from class: bzsb
            @Override // defpackage.bwrl
            public final void c(Object obj) {
                ((bzsy) obj).d();
            }

            @Override // defpackage.bwrl
            public final /* synthetic */ void a(boolean z2) {
            }

            @Override // defpackage.bwrl
            public final /* synthetic */ void b(boolean z2) {
            }
        });
    }

    public abstract bwrl o(bznb bznbVar, boolean z);

    public abstract void r(boolean z);

    protected void s() {
        asot asotVar = bzmw.a;
        canl.c(this.o);
        m(false);
    }

    public final int t() {
        int b;
        synchronized (this.s.a) {
            b = capb.b(w().k, this.f);
        }
        return b;
    }

    public final String toString() {
        String sb;
        synchronized (this.s.a) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.l);
            bsa bsaVar = new bsa(2);
            if (!this.g) {
                bsaVar.add("bg");
            }
            if (!this.n) {
                bsaVar.add("na");
            }
            if (!bsaVar.isEmpty()) {
                sb2.append(" ");
                sb2.append(bsaVar);
            }
            sb2.append(" (");
            sb2.append(capb.d(this.f));
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

    public final bzmz w() {
        bzmz bzmzVar;
        synchronized (this.s.a) {
            bzmzVar = this.h;
        }
        return bzmzVar;
    }

    public final String x() {
        String c;
        synchronized (this.s.a) {
            c = capb.c(w().k, this.f);
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
