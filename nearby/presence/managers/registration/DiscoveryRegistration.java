package com.google.android.gms.nearby.presence.managers.registration;

import android.content.Context;
import android.os.WorkSource;
import android.util.ArrayMap;
import android.util.ArraySet;
import com.google.android.gms.libs.identity.ClientIdentity;
import com.google.android.gms.libs.platform.foreground.ForegroundHelper$ForegroundListener;
import com.google.android.gms.nearby.presence.DiscoveryFilter;
import com.google.android.gms.nearby.presence.DiscoveryRequest;
import com.google.android.gms.nearby.presence.PresenceAction;
import com.google.android.gms.nearby.presence.PresenceDevice;
import com.google.android.gms.nearby.presence.PresenceIdentity;
import com.google.android.gms.nearby.presence.PresenceZone;
import com.google.android.gms.nearby.presence.log.NearbyPresenceDiscoveryRequestAttribution;
import com.google.android.gms.nearby.presence.managers.registration.DiscoveryRegistration;
import defpackage.asot;
import defpackage.asrj;
import defpackage.bwqu;
import defpackage.bwrd;
import defpackage.bwrl;
import defpackage.bwrx;
import defpackage.bxah;
import defpackage.bxcp;
import defpackage.bxcr;
import defpackage.cfcm;
import defpackage.cfdj;
import defpackage.cklu;
import defpackage.cklv;
import defpackage.ckmb;
import defpackage.ckmy;
import defpackage.ckna;
import defpackage.cknb;
import defpackage.ckne;
import defpackage.ckoh;
import defpackage.clex;
import defpackage.clfq;
import defpackage.clfs;
import defpackage.clfz;
import defpackage.deqr;
import defpackage.dnlf;
import defpackage.egtz;
import defpackage.eitj;
import defpackage.eius;
import defpackage.eiuu;
import defpackage.ejcb;
import defpackage.ejck;
import defpackage.ejhf;
import defpackage.fqma;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public abstract class DiscoveryRegistration extends bwrx implements ForegroundHelper$ForegroundListener {
    private final bwrd A;
    private cknb B;
    private int C;
    private boolean D;
    private final ScheduledExecutorService E;
    private final clex F;
    public final Object f;
    public final dnlf g;
    public final ckoh h;
    public final DiscoveryFilter i;
    public final DiscoveryRequest j;
    public final WorkSource k;
    public final deqr l;
    public final Long m;
    public final String n;
    public final cklu o;
    public final Map p;
    public final Set q;
    public final Map r;
    public final Map s;
    public final Map t;
    public boolean u;
    private final bxah v;
    private final Context w;
    private final bxcr x;
    private final cklv y;
    private final int z;

    protected DiscoveryRegistration(Context context, DiscoveryRequest discoveryRequest, ckoh ckohVar, clfz clfzVar, bwrd bwrdVar, Object obj, clex clexVar, Long l, Executor executor, dnlf dnlfVar) {
        super(executor, clfzVar);
        String str;
        this.s = new ArrayMap();
        this.t = new ArrayMap();
        this.E = cfdj.f();
        this.w = context;
        this.i = discoveryRequest.d;
        this.j = discoveryRequest;
        this.h = ckohVar;
        this.A = bwrdVar;
        this.f = obj;
        this.x = bxcp.a();
        this.F = clexVar;
        ClientIdentity clientIdentity = ckohVar.a;
        if (asrj.g(discoveryRequest.g) || !clientIdentity.p()) {
            WorkSource workSource = new WorkSource();
            asrj.e(workSource, clientIdentity.c, clientIdentity.e);
            this.k = workSource;
        } else {
            this.k = discoveryRequest.g;
        }
        this.m = l;
        String str2 = clientIdentity.f;
        if (str2 == null) {
            str = clientIdentity.e;
        } else {
            str = clientIdentity.e + ":" + str2;
        }
        this.n = str;
        this.g = dnlfVar;
        cklv cklvVar = (cklv) cfcm.c(context, cklv.class);
        this.y = cklvVar;
        int d = cklvVar.d(str);
        this.z = d;
        this.o = cklvVar.c(d, str);
        if (fqma.a.a().Z() && discoveryRequest.e != null && discoveryRequest.f > System.currentTimeMillis()) {
            NearbyPresenceDiscoveryRequestAttribution nearbyPresenceDiscoveryRequestAttribution = discoveryRequest.e;
        }
        this.p = new ArrayMap();
        this.q = new ArraySet();
        this.r = new ArrayMap();
        this.v = bxah.f(context);
        this.B = ckna.a(new ArrayMap(), null, 400, ejck.a);
        deqr deqrVar = new deqr(context, 1, "PresenceDiscovery", "ClientRegistration", clientIdentity.e);
        this.l = deqrVar;
        deqrVar.j(true);
        deqrVar.k(this.k);
    }

    static String[] v() {
        String[] strArr = {"android:fine_location"};
        if (fqma.F()) {
            int i = eitj.d;
            eitj eitjVar = ejcb.a;
            int i2 = ((ejcb) eitjVar).c;
            strArr = (String[]) Objects.requireNonNull((String[]) Arrays.copyOf(strArr, i2 + 1));
            int i3 = 0;
            while (i3 < i2) {
                int i4 = i3 + 1;
                strArr[i4] = (String) eitjVar.get(i3);
                i3 = i4;
            }
        }
        return strArr;
    }

    private final boolean w() {
        ArrayMap arrayMap;
        boolean z;
        ckmy ckmyVar;
        boolean z2;
        Object obj = this.f;
        synchronized (obj) {
            arrayMap = new ArrayMap();
            ejck ejckVar = ejck.a;
            DiscoveryFilter discoveryFilter = this.i;
            Iterator it = discoveryFilter.c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (((PresenceZone) it.next()).a != null) {
                    z = true;
                    break;
                }
            }
            DiscoveryRequest discoveryRequest = this.j;
            if (discoveryRequest == null || !discoveryRequest.c) {
                Iterator it2 = discoveryFilter.c().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        ckmyVar = new ckmy(discoveryFilter.a, z, false);
                        break;
                    }
                    if (!((PresenceZone) it2.next()).a().isEmpty()) {
                        ckmyVar = new ckmy(discoveryFilter.a, z, true);
                        break;
                    }
                }
            } else {
                ckmyVar = new ckmy(discoveryFilter.a, z, true);
            }
            if (discoveryFilter.a().isEmpty()) {
                Iterator it3 = discoveryFilter.b().iterator();
                while (it3.hasNext()) {
                    ckna.b(new PresenceAction(-1), (PresenceIdentity) it3.next(), ckmyVar, arrayMap);
                }
            } else {
                for (PresenceAction presenceAction : discoveryFilter.a()) {
                    Iterator it4 = discoveryFilter.b().iterator();
                    while (it4.hasNext()) {
                        ckna.b(presenceAction, (PresenceIdentity) it4.next(), ckmyVar, arrayMap);
                    }
                }
            }
            synchronized (obj) {
                z2 = this.D;
            }
        }
        int i = 200;
        if (z2 && ((int) fqma.f()) == 100) {
            i = 100;
        }
        WorkSource workSource = this.k;
        int[] iArr = (int[]) Objects.requireNonNull(this.j.a());
        eiuu eiuuVar = ejck.a;
        if (iArr != null) {
            eius eiusVar = new eius();
            eiusVar.k(eiuuVar);
            for (int i2 : iArr) {
                eiusVar.c(Integer.valueOf(i2));
            }
            eiuuVar = eiusVar.g();
        }
        cknb a = ckna.a(arrayMap, workSource, i, eiuuVar);
        if (this.B.equals(a)) {
            return false;
        }
        this.B = a;
        asot asotVar = ckmb.a;
        this.F.a.B();
        return true;
    }

    @Override // com.google.android.gms.libs.platform.foreground.ForegroundHelper$ForegroundListener
    public final void a(int i, boolean z) {
        if (this.h.a.c != i) {
            return;
        }
        synchronized (this.f) {
            if (g()) {
                if (z == this.D) {
                    return;
                }
                asot asotVar = ckmb.a;
                this.D = z;
                if (w()) {
                    n();
                }
            }
        }
    }

    @Override // defpackage.bwrx, defpackage.bwrm
    protected void f() {
        synchronized (this.f) {
            Map map = this.s;
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((clfs) it.next()).a();
            }
            map.clear();
            this.p.clear();
            this.q.clear();
            this.r.clear();
        }
        super.f();
        this.x.c(this);
        ((ejhf) ckmb.a.f(ckmb.a()).ah(8005)).B("removed registration %s", this.h);
        this.o.h();
        this.y.b(this.z);
    }

    @Override // defpackage.bwrx
    protected final /* synthetic */ bwqu h() {
        return this.A;
    }

    @Override // defpackage.bwrx
    protected void j() {
        ejhf ejhfVar = (ejhf) ckmb.a.f(ckmb.a()).ah(8004);
        ckoh ckohVar = this.h;
        ejhfVar.P("added registration %s -> %s", ckohVar, this.i);
        int i = ckohVar.a.c;
        bxcr bxcrVar = this.x;
        bxcrVar.a(this.w, i, this.E, this);
        u();
        a(i, bxcrVar.d(i));
        w();
        if (fqma.H()) {
            this.o.f(this.j);
        } else {
            this.o.e();
        }
    }

    public final ClientIdentity o() {
        return this.h.a;
    }

    public final bwrl p(ckne ckneVar) {
        final long j = ckneVar.a.a;
        this.t.remove(Long.valueOf(j));
        return q(1, ckneVar, new Runnable() { // from class: clfm
            @Override // java.lang.Runnable
            public final void run() {
                DiscoveryRegistration discoveryRegistration = DiscoveryRegistration.this;
                Object obj = discoveryRegistration.f;
                long j2 = j;
                synchronized (obj) {
                    Set set = discoveryRegistration.q;
                    Long valueOf = Long.valueOf(j2);
                    set.remove(valueOf);
                    discoveryRegistration.p.remove(valueOf);
                    discoveryRegistration.r.remove(valueOf);
                    clfs clfsVar = (clfs) discoveryRegistration.s.remove(valueOf);
                    if (clfsVar != null) {
                        clfsVar.a();
                    }
                }
            }
        });
    }

    public final bwrl q(int i, ckne ckneVar, Runnable runnable) {
        ((ejhf) ckmb.a.f(ckmb.a()).ah(8006)).G("[NP_API_CALLBACK] report result %s, %s", i, ckneVar);
        for (String str : v()) {
            if (this.v.c(str, o().c, o().e, o().f, o().g) != 0) {
                ((ejhf) ckmb.a.f(ckmb.a()).ah(8007)).B("delivery noteOp denied for %s", o());
                return null;
            }
        }
        return new clfq(this, i, ckneVar, runnable);
    }

    public final cknb r() {
        cknb cknbVar;
        synchronized (this.f) {
            cknbVar = this.B;
        }
        return cknbVar;
    }

    public final void s(ckne ckneVar) {
        if (ckneVar.d != egtz.MDNS) {
            PresenceDevice presenceDevice = ckneVar.a;
            Map map = this.s;
            Long valueOf = Long.valueOf(presenceDevice.a);
            clfs clfsVar = (clfs) map.get(valueOf);
            if (clfsVar == null) {
                clfs clfsVar2 = new clfs(this, ckneVar, this.E);
                map.put(valueOf, clfsVar2);
                clfsVar = clfsVar2;
            }
            clfsVar.b();
            ((ejhf) ckmb.a.f(ckmb.a()).ah(8008)).B("FusedDiscoveryEngine updated state for %s", presenceDevice);
        }
    }

    public final boolean t() {
        int i;
        synchronized (this.f) {
            i = this.C;
        }
        return 1 == i;
    }

    public final String toString() {
        String sb;
        synchronized (this.f) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.h);
            ArraySet arraySet = new ArraySet(2);
            if (!this.D) {
                arraySet.add("bg");
            }
            if (!this.u) {
                arraySet.add("na");
            }
            if (!arraySet.isEmpty()) {
                sb2.append(" ");
                sb2.append(arraySet);
            }
            sb2.append(" (");
            sb2.append(this.C != 0 ? "LOCATION_ONLY" : "NONE");
            sb2.append(") ");
            sb2.append(r());
            sb = sb2.toString();
        }
        return sb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u() {
        /*
            r10 = this;
            android.content.Context r0 = r10.w
            ckoh r1 = r10.h
            boolean r2 = defpackage.fqma.F()
            java.lang.String r3 = "android.permission.ACCESS_FINE_LOCATION"
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L19
            com.google.android.gms.libs.identity.ClientIdentity r2 = r1.a
            java.lang.String[] r3 = new java.lang.String[]{r3}
            boolean r0 = r2.m(r0, r3)
            goto L28
        L19:
            com.google.android.gms.libs.identity.ClientIdentity r2 = r1.a
            java.lang.String[] r3 = new java.lang.String[]{r3}
            boolean r0 = r2.m(r0, r3)
            if (r0 == 0) goto L27
            r0 = r4
            goto L28
        L27:
            r0 = r5
        L28:
            int r2 = r10.C
            if (r0 == r2) goto L30
            asot r2 = defpackage.ckmb.a
            r10.C = r0
        L30:
            boolean r0 = defpackage.fqma.F()
            if (r0 == 0) goto L38
            com.google.android.gms.libs.identity.ClientIdentity r0 = r1.a
        L38:
            int r0 = r10.C
            if (r0 <= 0) goto L61
            com.google.android.gms.nearby.presence.DiscoveryRequest r0 = r10.j
            com.google.android.gms.nearby.presence.DiscoveryFilter r0 = r0.d
            defpackage.fqma.F()
            java.lang.String[] r0 = v()
            int r2 = r0.length
            r3 = r5
        L49:
            if (r3 >= r2) goto L5f
            r6 = r0[r3]
            bxah r7 = r10.v
            com.google.android.gms.libs.identity.ClientIdentity r8 = r1.a
            int r9 = r8.c
            java.lang.String r8 = r8.e
            int r6 = r7.a(r6, r9, r8)
            if (r6 == 0) goto L5c
            goto L86
        L5c:
            int r3 = r3 + 1
            goto L49
        L5f:
            r0 = r4
            goto L87
        L61:
            asot r0 = defpackage.ckmb.a
            java.util.logging.Level r2 = defpackage.ckmb.a()
            ejhf r0 = r0.f(r2)
            r2 = 7993(0x1f39, float:1.12E-41)
            ejgq r0 = r0.ah(r2)
            ejhf r0 = (defpackage.ejhf) r0
            com.google.android.gms.libs.identity.ClientIdentity r2 = r10.o()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            int r6 = r10.C
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r7 = "discovery permission denied for %s, required permission level is: %s, actual permission level is: %s"
            r0.T(r7, r2, r3, r6)
        L86:
            r0 = r5
        L87:
            boolean r2 = r10.u
            if (r0 == r2) goto L92
            r10.u = r0
            asot r0 = defpackage.ckmb.a
            com.google.android.gms.libs.identity.ClientIdentity r0 = r1.a
            return r4
        L92:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.presence.managers.registration.DiscoveryRegistration.u():boolean");
    }
}
