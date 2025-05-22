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
import defpackage.ausn;
import defpackage.auvd;
import defpackage.byzk;
import defpackage.byzt;
import defpackage.bzab;
import defpackage.bzan;
import defpackage.bzix;
import defpackage.bzlf;
import defpackage.bzlh;
import defpackage.chjy;
import defpackage.chkv;
import defpackage.cmtz;
import defpackage.cmua;
import defpackage.cmug;
import defpackage.cmvd;
import defpackage.cmvf;
import defpackage.cmvg;
import defpackage.cmvj;
import defpackage.cmwm;
import defpackage.cnnc;
import defpackage.cnnw;
import defpackage.cnny;
import defpackage.cnof;
import defpackage.dhbu;
import defpackage.dpvo;
import defpackage.ejhe;
import defpackage.elgo;
import defpackage.elhx;
import defpackage.elhz;
import defpackage.elpg;
import defpackage.elpp;
import defpackage.eluo;
import defpackage.ftfv;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public abstract class DiscoveryRegistration extends bzan implements ForegroundHelper$ForegroundListener {
    private final byzt A;
    private cmvg B;
    private int C;
    private boolean D;
    private final ScheduledExecutorService E;
    private final cnnc F;
    public final Object f;
    public final dpvo g;
    public final cmwm h;
    public final DiscoveryFilter i;
    public final DiscoveryRequest j;
    public final WorkSource k;
    public final dhbu l;
    public final Long m;
    public final String n;
    public final cmtz o;
    public final Map p;
    public final Set q;
    public final Map r;
    public final Map s;
    public final Map t;
    public boolean u;
    private final bzix v;
    private final Context w;
    private final bzlh x;
    private final cmua y;
    private final int z;

    protected DiscoveryRegistration(Context context, DiscoveryRequest discoveryRequest, cmwm cmwmVar, cnof cnofVar, byzt byztVar, Object obj, cnnc cnncVar, Long l, Executor executor, dpvo dpvoVar) {
        super(executor, cnofVar);
        String str;
        this.s = new ArrayMap();
        this.t = new ArrayMap();
        this.E = chkv.f();
        this.w = context;
        this.i = discoveryRequest.d;
        this.j = discoveryRequest;
        this.h = cmwmVar;
        this.A = byztVar;
        this.f = obj;
        this.x = bzlf.a();
        this.F = cnncVar;
        ClientIdentity clientIdentity = cmwmVar.a;
        if (auvd.g(discoveryRequest.g) || !clientIdentity.p()) {
            WorkSource workSource = new WorkSource();
            auvd.e(workSource, clientIdentity.c, clientIdentity.e);
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
        this.g = dpvoVar;
        cmua cmuaVar = (cmua) chjy.c(context, cmua.class);
        this.y = cmuaVar;
        int d = cmuaVar.d(str);
        this.z = d;
        this.o = cmuaVar.c(d, str);
        if (ftfv.a.lK().aa() && discoveryRequest.e != null && discoveryRequest.f > System.currentTimeMillis()) {
            NearbyPresenceDiscoveryRequestAttribution nearbyPresenceDiscoveryRequestAttribution = discoveryRequest.e;
        }
        this.p = new ArrayMap();
        this.q = new ArraySet();
        this.r = new ArrayMap();
        this.v = bzix.f(context);
        this.B = cmvf.a(new ArrayMap(), null, 400, elpp.a);
        dhbu dhbuVar = new dhbu(context, 1, "PresenceDiscovery", "ClientRegistration", clientIdentity.e);
        this.l = dhbuVar;
        dhbuVar.j(true);
        dhbuVar.k(this.k);
    }

    static String[] v() {
        String[] strArr = {"android:fine_location"};
        if (ftfv.H()) {
            int i = elgo.d;
            elgo elgoVar = elpg.a;
            int i2 = ((elpg) elgoVar).c;
            strArr = (String[]) Objects.requireNonNull((String[]) Arrays.copyOf(strArr, i2 + 1));
            int i3 = 0;
            while (i3 < i2) {
                int i4 = i3 + 1;
                strArr[i4] = (String) elgoVar.get(i3);
                i3 = i4;
            }
        }
        return strArr;
    }

    private final boolean w() {
        ArrayMap arrayMap;
        boolean z;
        cmvd cmvdVar;
        boolean z2;
        Object obj = this.f;
        synchronized (obj) {
            arrayMap = new ArrayMap();
            elpp elppVar = elpp.a;
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
                        cmvdVar = new cmvd(discoveryFilter.a, z, false);
                        break;
                    }
                    if (!((PresenceZone) it2.next()).a().isEmpty()) {
                        cmvdVar = new cmvd(discoveryFilter.a, z, true);
                        break;
                    }
                }
            } else {
                cmvdVar = new cmvd(discoveryFilter.a, z, true);
            }
            if (discoveryFilter.a().isEmpty()) {
                Iterator it3 = discoveryFilter.b().iterator();
                while (it3.hasNext()) {
                    cmvf.b(new PresenceAction(-1), (PresenceIdentity) it3.next(), cmvdVar, arrayMap);
                }
            } else {
                for (PresenceAction presenceAction : discoveryFilter.a()) {
                    Iterator it4 = discoveryFilter.b().iterator();
                    while (it4.hasNext()) {
                        cmvf.b(presenceAction, (PresenceIdentity) it4.next(), cmvdVar, arrayMap);
                    }
                }
            }
            synchronized (obj) {
                z2 = this.D;
            }
        }
        int i = 200;
        if (z2 && ((int) ftfv.f()) == 100) {
            i = 100;
        }
        WorkSource workSource = this.k;
        int[] iArr = (int[]) Objects.requireNonNull(this.j.a());
        elhz elhzVar = elpp.a;
        if (iArr != null) {
            elhx elhxVar = new elhx();
            elhxVar.k(elhzVar);
            for (int i2 : iArr) {
                elhxVar.c(Integer.valueOf(i2));
            }
            elhzVar = elhxVar.g();
        }
        cmvg a = cmvf.a(arrayMap, workSource, i, elhzVar);
        if (this.B.equals(a)) {
            return false;
        }
        this.B = a;
        ausn ausnVar = cmug.a;
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
                ausn ausnVar = cmug.a;
                this.D = z;
                if (w()) {
                    n();
                }
            }
        }
    }

    @Override // defpackage.bzan, defpackage.bzac
    protected void f() {
        synchronized (this.f) {
            Map map = this.s;
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((cnny) it.next()).a();
            }
            map.clear();
            this.p.clear();
            this.q.clear();
            this.r.clear();
        }
        super.f();
        this.x.c(this);
        ((eluo) cmug.a.f(cmug.a()).ai(7954)).B("removed registration %s", this.h);
        this.o.h();
        this.y.b(this.z);
    }

    @Override // defpackage.bzan
    protected final /* synthetic */ byzk h() {
        return this.A;
    }

    @Override // defpackage.bzan
    protected void j() {
        eluo eluoVar = (eluo) cmug.a.f(cmug.a()).ai(7953);
        cmwm cmwmVar = this.h;
        eluoVar.P("added registration %s -> %s", cmwmVar, this.i);
        int i = cmwmVar.a.c;
        bzlh bzlhVar = this.x;
        bzlhVar.a(this.w, i, this.E, this);
        u();
        a(i, bzlhVar.d(i));
        w();
        if (ftfv.I()) {
            this.o.f(this.j);
        } else {
            this.o.e();
        }
    }

    public final ClientIdentity o() {
        return this.h.a;
    }

    public final bzab p(cmvj cmvjVar) {
        final long j = cmvjVar.a.a;
        this.t.remove(Long.valueOf(j));
        return q(1, cmvjVar, new Runnable() { // from class: cnns
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
                    cnny cnnyVar = (cnny) discoveryRegistration.s.remove(valueOf);
                    if (cnnyVar != null) {
                        cnnyVar.a();
                    }
                }
            }
        });
    }

    public final bzab q(int i, cmvj cmvjVar, Runnable runnable) {
        ausn ausnVar = cmug.a;
        ((eluo) ausnVar.f(cmug.a()).ai(7955)).G("[NP_API_CALLBACK] report result %s, %s", i, cmvjVar);
        for (String str : v()) {
            if (this.v.c(str, o().c, o().e, o().f, o().g) != 0) {
                ((eluo) ausnVar.f(cmug.a()).ai(7956)).B("delivery noteOp denied for %s", o());
                return null;
            }
        }
        return new cnnw(this, i, cmvjVar, runnable);
    }

    public final cmvg r() {
        cmvg cmvgVar;
        synchronized (this.f) {
            cmvgVar = this.B;
        }
        return cmvgVar;
    }

    public final void s(cmvj cmvjVar) {
        if (cmvjVar.d != ejhe.MDNS) {
            PresenceDevice presenceDevice = cmvjVar.a;
            Map map = this.s;
            Long valueOf = Long.valueOf(presenceDevice.a);
            cnny cnnyVar = (cnny) map.get(valueOf);
            if (cnnyVar == null) {
                cnny cnnyVar2 = new cnny(this, cmvjVar, this.E);
                map.put(valueOf, cnnyVar2);
                cnnyVar = cnnyVar2;
            }
            cnnyVar.b();
            ((eluo) cmug.a.f(cmug.a()).ai(7957)).B("FusedDiscoveryEngine updated state for %s", presenceDevice);
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
            cmwm r1 = r10.h
            boolean r2 = defpackage.ftfv.H()
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
            ausn r2 = defpackage.cmug.a
            r10.C = r0
        L30:
            boolean r0 = defpackage.ftfv.H()
            if (r0 == 0) goto L38
            com.google.android.gms.libs.identity.ClientIdentity r0 = r1.a
        L38:
            int r0 = r10.C
            if (r0 <= 0) goto L61
            com.google.android.gms.nearby.presence.DiscoveryRequest r0 = r10.j
            com.google.android.gms.nearby.presence.DiscoveryFilter r0 = r0.d
            defpackage.ftfv.H()
            java.lang.String[] r0 = v()
            int r2 = r0.length
            r3 = r5
        L49:
            if (r3 >= r2) goto L5f
            r6 = r0[r3]
            bzix r7 = r10.v
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
            ausn r0 = defpackage.cmug.a
            java.util.logging.Level r2 = defpackage.cmug.a()
            eluo r0 = r0.f(r2)
            r2 = 7942(0x1f06, float:1.1129E-41)
            eltz r0 = r0.ai(r2)
            eluo r0 = (defpackage.eluo) r0
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
            ausn r0 = defpackage.cmug.a
            com.google.android.gms.libs.identity.ClientIdentity r0 = r1.a
            return r4
        L92:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.presence.managers.registration.DiscoveryRegistration.u():boolean");
    }
}
