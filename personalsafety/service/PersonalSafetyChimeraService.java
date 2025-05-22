package com.google.android.gms.personalsafety.service;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.chimera.modules.personalsafety.AppContextProvider;
import com.google.android.gms.personalsafety.service.PersonalSafetyChimeraService;
import defpackage.aupz;
import defpackage.aurp;
import defpackage.ausn;
import defpackage.cxzc;
import defpackage.cxze;
import defpackage.cycr;
import defpackage.cyds;
import defpackage.cyea;
import defpackage.cyeb;
import defpackage.cyeg;
import defpackage.eluo;
import defpackage.eqgc;
import defpackage.eygu;
import defpackage.eylc;
import defpackage.eymq;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fpro;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class PersonalSafetyChimeraService extends Service implements cyeg {
    public static final /* synthetic */ int f = 0;
    private static final AtomicBoolean g = new AtomicBoolean(false);
    public cycr a;
    public aurp b;
    public long c;
    public long d;
    public cyds e;
    private cxzc h;

    public PersonalSafetyChimeraService() {
    }

    private final void h() {
        cycr cycrVar = this.a;
        if (cycrVar != null) {
            ausn ausnVar = cxze.a;
            cycrVar.r.clear();
            cycr.a = null;
        }
        cyds cydsVar = this.e;
        if (cydsVar != null) {
            cydsVar.e();
        }
    }

    private final void i(final Context context) {
        aupz aupzVar = new aupz(Integer.MAX_VALUE, 10);
        eqgc.t(aupzVar.submit(new Callable() { // from class: cydz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = context;
                cyed a = cyed.a(context2);
                eluo eluoVar = (eluo) ((eluo) cxze.a.h()).ai(8650);
                boolean z = a.a;
                boolean z2 = a.b;
                eluoVar.U("Create settings: %b %b %b %b", Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(a.c), Boolean.valueOf(a.d));
                PersonalSafetyChimeraService personalSafetyChimeraService = PersonalSafetyChimeraService.this;
                boolean z3 = false;
                if (!z && !z2) {
                    personalSafetyChimeraService.e(13);
                } else if (!z) {
                    personalSafetyChimeraService.e(11);
                } else if (z2) {
                    personalSafetyChimeraService.a = cycr.b(personalSafetyChimeraService.getApplicationContext());
                    personalSafetyChimeraService.f(12);
                    Context applicationContext = personalSafetyChimeraService.getApplicationContext();
                    if (cxsl.a == null) {
                        cxsl.a = new cxsl(new ArrayList(), cxtp.a(AppContextProvider.a()), new cyfm(), new aupz(Integer.MAX_VALUE, 9));
                    }
                    cxsl cxslVar = cxsl.a;
                    cydj cydjVar = cxslVar.e;
                    if (cydjVar != null) {
                        cydjVar.f(cxslVar, cydi.MANUAL_SCAN_DATA_MANAGER);
                    }
                    if (fpro.ak()) {
                        cybv cybvVar = new cybv(applicationContext);
                        cydj c = cydj.c();
                        if (c != null) {
                            c.f(cybvVar, cydi.PRE_RINGING_SCAN_DATA_MANAGER);
                        }
                    }
                    personalSafetyChimeraService.f(10);
                    personalSafetyChimeraService.e = cyds.a(context2);
                    personalSafetyChimeraService.f(9);
                    z3 = true;
                } else {
                    personalSafetyChimeraService.e(12);
                }
                return Boolean.valueOf(z3);
            }
        }), new cyea(this, context), aupzVar);
    }

    private final void j() {
        ((eluo) ((eluo) cxze.a.h()).ai((char) 8664)).x("Init");
        if (!fpro.ar() || g.compareAndSet(false, true)) {
            final Context applicationContext = getApplicationContext();
            new aupz(Integer.MAX_VALUE, 10).submit(new Runnable() { // from class: cydy
                @Override // java.lang.Runnable
                public final void run() {
                    PersonalSafetyChimeraService personalSafetyChimeraService = PersonalSafetyChimeraService.this;
                    personalSafetyChimeraService.b = aurt.a;
                    personalSafetyChimeraService.c = personalSafetyChimeraService.b.a();
                    personalSafetyChimeraService.d = cyiq.a();
                    ausn ausnVar = cxze.a;
                    cxzf.b(personalSafetyChimeraService.c);
                    if (fpro.am()) {
                        if (cyeh.a == null) {
                            cyeh.a = new cyeh(applicationContext);
                        }
                        cyeh.a.b = personalSafetyChimeraService;
                    }
                    personalSafetyChimeraService.a();
                    personalSafetyChimeraService.f(3);
                }
            });
            i(getApplicationContext());
        }
    }

    public final void a() {
        if (this.h == null) {
            cxzc a = cxzc.a(getApplicationContext());
            this.h = a;
            a.a.b();
        }
    }

    @Override // defpackage.cyeg
    public final void b(boolean z) {
        ausn ausnVar = cxze.a;
        if (this.e == null) {
            ((eluo) ((eluo) cxze.a.j()).ai((char) 8678)).x("Auto detection is null. Ignoring power-saver updates.");
            return;
        }
        cxzc cxzcVar = this.h;
        long a = this.b.a();
        fgrc v = eymq.a.v();
        if (!v.b.L()) {
            v.U();
        }
        eymq eymqVar = (eymq) v.b;
        eymqVar.b |= 4;
        eymqVar.e = z;
        cxzcVar.i(a, (eymq) v.Q());
        if (z) {
            this.e.b();
        } else {
            this.e.c();
        }
    }

    @Override // defpackage.cyeg
    public final void c(int i) {
        if (i - 1 != 1) {
            ((eluo) ((eluo) cxze.a.h()).ai((char) 8671)).x("Ble setting turned off, destroy scanners");
            h();
        } else {
            ((eluo) ((eluo) cxze.a.h()).ai((char) 8670)).x("Ble setting turned on, re-init module");
            i(getApplicationContext());
        }
    }

    @Override // defpackage.cyeg
    public final void d(int i) {
        if (i - 1 != 1) {
            ((eluo) ((eluo) cxze.a.h()).ai((char) 8674)).x("Location setting turned off, destroy location scanner");
            h();
        } else {
            ((eluo) ((eluo) cxze.a.h()).ai((char) 8673)).x("Location setting turned on, re-init module");
            i(getApplicationContext());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0669 A[SYNTHETIC] */
    @Override // com.google.android.chimera.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dump(java.io.FileDescriptor r32, java.io.PrintWriter r33, java.lang.String[] r34) {
        /*
            Method dump skipped, instructions count: 2137
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.personalsafety.service.PersonalSafetyChimeraService.dump(java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    public final void e(int i) {
        if (fpro.M()) {
            a();
            this.h.o(i);
        }
    }

    public final void f(int i) {
        if (fpro.M()) {
            a();
            this.h.n(i, 0L, 2);
        }
    }

    @Override // defpackage.cyeg
    public final void g(int i) {
        ausn ausnVar = cxze.a;
        cxzc cxzcVar = this.h;
        long a = this.b.a();
        long j = this.d;
        long b = this.b.b();
        fgrc v = eylc.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        eylc eylcVar = (eylc) fgriVar;
        eylcVar.b |= 1;
        eylcVar.c = a;
        if (!fgriVar.L()) {
            v.U();
        }
        fgri fgriVar2 = v.b;
        eylc eylcVar2 = (eylc) fgriVar2;
        eylcVar2.b |= 2;
        eylcVar2.d = j;
        if (!fgriVar2.L()) {
            v.U();
        }
        fgri fgriVar3 = v.b;
        eylc eylcVar3 = (eylc) fgriVar3;
        eylcVar3.b |= 4;
        eylcVar3.e = b;
        if (!fgriVar3.L()) {
            v.U();
        }
        fgri fgriVar4 = v.b;
        eylc eylcVar4 = (eylc) fgriVar4;
        eylcVar4.g = 2;
        eylcVar4.b |= 16;
        if (!fgriVar4.L()) {
            v.U();
        }
        eylc eylcVar5 = (eylc) v.b;
        eylcVar5.f = i - 1;
        eylcVar5.b |= 8;
        eylc eylcVar6 = (eylc) v.Q();
        fgrc v2 = eygu.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        eygu eyguVar = (eygu) v2.b;
        eylcVar6.getClass();
        eyguVar.M = eylcVar6;
        eyguVar.c |= 8;
        cxzcVar.m((eygu) v2.Q(), 38);
        cyds cydsVar = this.e;
        if (cydsVar != null) {
            if (i == 3) {
                cydsVar.c();
            } else if (i == 2) {
                cydsVar.b();
            }
        }
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        if (fpro.ar() && cyeb.c(getApplicationContext())) {
            j();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
    @Override // com.google.android.chimera.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int onStartCommand(android.content.Intent r4, int r5, int r6) {
        /*
            r3 = this;
            android.content.Context r5 = r3.getApplicationContext()
            boolean r5 = defpackage.cyeb.c(r5)
            r6 = 1
            if (r5 != 0) goto Ld
            goto Lb4
        Ld:
            if (r4 != 0) goto L21
            ausn r4 = defpackage.cxze.a
            eltz r4 = r4.h()
            java.lang.String r5 = "Re-initializing the UTA componentson null intent"
            r0 = 8662(0x21d6, float:1.2138E-41)
            defpackage.a.A(r4, r5, r0)
            r3.j()
            goto Lb4
        L21:
            r3.a()
            java.lang.String r5 = r4.getAction()
            defpackage.atzb.s(r5)
            int r0 = r5.hashCode()
            r1 = -1214620864(0xffffffffb79a5b40, float:-1.8400722E-5)
            r2 = 2
            if (r0 == r1) goto L54
            r1 = 1001464947(0x3bb12473, float:0.0054059564)
            if (r0 == r1) goto L4a
            r1 = 1767285733(0x6956a3e5, float:1.6217756E25)
            if (r0 == r1) goto L40
            goto L5e
        L40:
            java.lang.String r0 = "com.google.android.gms.personalsafety.ACTION_INIT"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L5e
            r5 = 0
            goto L5f
        L4a:
            java.lang.String r0 = "SETTING_OPT_OUT"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L5e
            r5 = r2
            goto L5f
        L54:
            java.lang.String r0 = "SETTING_OPT_IN"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L5e
            r5 = r6
            goto L5f
        L5e:
            r5 = -1
        L5f:
            if (r5 == 0) goto Laf
            if (r5 == r6) goto L8f
            if (r5 == r2) goto L77
            ausn r5 = defpackage.cxze.a
            eltz r5 = r5.j()
            java.lang.String r4 = r4.getAction()
            java.lang.String r0 = "Unexpected action %s"
            r1 = 8656(0x21d0, float:1.213E-41)
            defpackage.a.U(r5, r0, r4, r1)
            goto Lb4
        L77:
            ausn r4 = defpackage.cxze.a
            cyds r4 = r3.e
            if (r4 == 0) goto L81
            r4.e()
            goto Lb4
        L81:
            ausn r4 = defpackage.cxze.a
            eltz r4 = r4.i()
            java.lang.String r5 = "AutoDetection is null. Unable to stop."
            r0 = 8661(0x21d5, float:1.2137E-41)
            defpackage.a.A(r4, r5, r0)
            goto Lb4
        L8f:
            ausn r4 = defpackage.cxze.a
            cyds r4 = r3.e
            if (r4 == 0) goto La1
            android.content.Context r5 = r3.getApplicationContext()
            cyed r5 = defpackage.cyed.a(r5)
            r4.d(r5)
            goto Lb4
        La1:
            ausn r4 = defpackage.cxze.a
            eltz r4 = r4.i()
            java.lang.String r5 = "AutoDetection is null. Unable to start."
            r0 = 8659(0x21d3, float:1.2134E-41)
            defpackage.a.A(r4, r5, r0)
            goto Lb4
        Laf:
            ausn r4 = defpackage.cxze.a
            r3.j()
        Lb4:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.personalsafety.service.PersonalSafetyChimeraService.onStartCommand(android.content.Intent, int, int):int");
    }

    PersonalSafetyChimeraService(aurp aurpVar, cyds cydsVar, cxzc cxzcVar) {
        this.b = aurpVar;
        this.e = cydsVar;
        this.h = cxzcVar;
    }
}
