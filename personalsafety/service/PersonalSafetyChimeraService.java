package com.google.android.gms.personalsafety.service;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.chimera.modules.personalsafety.AppContextProvider;
import com.google.android.gms.personalsafety.service.PersonalSafetyChimeraService;
import defpackage.asmf;
import defpackage.asnv;
import defpackage.asot;
import defpackage.cvpm;
import defpackage.cvpo;
import defpackage.cvsy;
import defpackage.cvtv;
import defpackage.cvud;
import defpackage.cvue;
import defpackage.cvuj;
import defpackage.ejhf;
import defpackage.ensj;
import defpackage.evqy;
import defpackage.evvg;
import defpackage.evwu;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fmzp;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class PersonalSafetyChimeraService extends Service implements cvuj {
    public static final /* synthetic */ int f = 0;
    private static final AtomicBoolean g = new AtomicBoolean(false);
    public cvsy a;
    public asnv b;
    public long c;
    public long d;
    public cvtv e;
    private cvpm h;

    public PersonalSafetyChimeraService() {
    }

    private final void h() {
        cvsy cvsyVar = this.a;
        if (cvsyVar != null) {
            asot asotVar = cvpo.a;
            cvsyVar.h.clear();
            cvsyVar.o.clear();
            cvsy.a = null;
        }
        cvtv cvtvVar = this.e;
        if (cvtvVar != null) {
            cvtvVar.e();
        }
    }

    private final void i(final Context context) {
        asmf asmfVar = new asmf(Integer.MAX_VALUE, 10);
        ensj.t(asmfVar.submit(new Callable() { // from class: cvuc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cvtn cvtnVar;
                Context context2 = context;
                cvug a = cvug.a(context2);
                ejhf ejhfVar = (ejhf) ((ejhf) cvpo.a.h()).ah(8652);
                boolean z = a.a;
                boolean z2 = a.b;
                ejhfVar.U("Create settings: %b %b %b %b", Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(a.c), Boolean.valueOf(a.d));
                PersonalSafetyChimeraService personalSafetyChimeraService = PersonalSafetyChimeraService.this;
                boolean z3 = false;
                if (!z && !z2) {
                    personalSafetyChimeraService.e(13);
                } else if (!z) {
                    personalSafetyChimeraService.e(11);
                } else if (z2) {
                    personalSafetyChimeraService.a = cvsy.b(personalSafetyChimeraService.getApplicationContext());
                    personalSafetyChimeraService.f(12);
                    Context applicationContext = personalSafetyChimeraService.getApplicationContext();
                    cvsy cvsyVar = personalSafetyChimeraService.a;
                    if (cviv.a == null) {
                        cviv.a = new cviv(new ArrayList(), cvjz.a(AppContextProvider.a()), new cvvp(), new asmf(Integer.MAX_VALUE, 9));
                    }
                    cviv cvivVar = cviv.a;
                    if (!fmzp.aj() || (cvtnVar = cvivVar.c) == null) {
                        cvsyVar.c(cvivVar);
                    } else {
                        cvtnVar.e(cvivVar, cvtm.MANUAL_SCAN_DATA_MANAGER);
                    }
                    if (fmzp.ah()) {
                        cvsf cvsfVar = new cvsf(cvsyVar, applicationContext);
                        if (fmzp.aj()) {
                            cvtn.b().e(cvsfVar, cvtm.PRE_RINGING_SCAN_DATA_MANAGER);
                        } else {
                            cvsfVar.a.c(cvsfVar);
                        }
                    }
                    personalSafetyChimeraService.f(10);
                    personalSafetyChimeraService.e = cvtv.a(context2);
                    personalSafetyChimeraService.f(9);
                    z3 = true;
                } else {
                    personalSafetyChimeraService.e(12);
                }
                return Boolean.valueOf(z3);
            }
        }), new cvud(this, context), asmfVar);
    }

    private final void j() {
        ((ejhf) ((ejhf) cvpo.a.h()).ah((char) 8666)).x("Init");
        if (!fmzp.ap() || g.compareAndSet(false, true)) {
            final Context applicationContext = getApplicationContext();
            new asmf(Integer.MAX_VALUE, 10).submit(new Runnable() { // from class: cvub
                @Override // java.lang.Runnable
                public final void run() {
                    PersonalSafetyChimeraService personalSafetyChimeraService = PersonalSafetyChimeraService.this;
                    personalSafetyChimeraService.b = asnz.a;
                    personalSafetyChimeraService.c = personalSafetyChimeraService.b.a();
                    personalSafetyChimeraService.d = cvyt.a();
                    asot asotVar = cvpo.a;
                    cvpp.b(personalSafetyChimeraService.c);
                    if (fmzp.ak()) {
                        if (cvuk.a == null) {
                            cvuk.a = new cvuk(applicationContext);
                        }
                        cvuk.a.b = personalSafetyChimeraService;
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
            cvpm a = cvpm.a(getApplicationContext());
            this.h = a;
            a.a.b();
        }
    }

    @Override // defpackage.cvuj
    public final void b(boolean z) {
        asot asotVar = cvpo.a;
        if (this.e == null) {
            ((ejhf) ((ejhf) cvpo.a.j()).ah((char) 8680)).x("Auto detection is null. Ignoring power-saver updates.");
            return;
        }
        cvpm cvpmVar = this.h;
        long a = this.b.a();
        fecj v = evwu.a.v();
        if (!v.b.L()) {
            v.U();
        }
        evwu evwuVar = (evwu) v.b;
        evwuVar.b |= 4;
        evwuVar.e = z;
        cvpmVar.i(a, (evwu) v.Q());
        if (z) {
            this.e.b();
        } else {
            this.e.c();
        }
    }

    @Override // defpackage.cvuj
    public final void c(int i) {
        if (i - 1 != 1) {
            ((ejhf) ((ejhf) cvpo.a.h()).ah((char) 8673)).x("Ble setting turned off, destroy scanners");
            h();
        } else {
            ((ejhf) ((ejhf) cvpo.a.h()).ah((char) 8672)).x("Ble setting turned on, re-init module");
            i(getApplicationContext());
        }
    }

    @Override // defpackage.cvuj
    public final void d(int i) {
        if (i - 1 != 1) {
            ((ejhf) ((ejhf) cvpo.a.h()).ah((char) 8676)).x("Location setting turned off, destroy location scanner");
            h();
        } else {
            ((ejhf) ((ejhf) cvpo.a.h()).ah((char) 8675)).x("Location setting turned on, re-init module");
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
            Method dump skipped, instructions count: 2156
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.personalsafety.service.PersonalSafetyChimeraService.dump(java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    public final void e(int i) {
        if (fmzp.K()) {
            a();
            this.h.o(i);
        }
    }

    public final void f(int i) {
        if (fmzp.K()) {
            a();
            this.h.n(i, 0L, 2);
        }
    }

    @Override // defpackage.cvuj
    public final void g(int i) {
        asot asotVar = cvpo.a;
        cvpm cvpmVar = this.h;
        long a = this.b.a();
        long j = this.d;
        long b = this.b.b();
        fecj v = evvg.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        evvg evvgVar = (evvg) fecpVar;
        evvgVar.b |= 1;
        evvgVar.c = a;
        if (!fecpVar.L()) {
            v.U();
        }
        fecp fecpVar2 = v.b;
        evvg evvgVar2 = (evvg) fecpVar2;
        evvgVar2.b |= 2;
        evvgVar2.d = j;
        if (!fecpVar2.L()) {
            v.U();
        }
        fecp fecpVar3 = v.b;
        evvg evvgVar3 = (evvg) fecpVar3;
        evvgVar3.b |= 4;
        evvgVar3.e = b;
        if (!fecpVar3.L()) {
            v.U();
        }
        fecp fecpVar4 = v.b;
        evvg evvgVar4 = (evvg) fecpVar4;
        evvgVar4.g = 2;
        evvgVar4.b |= 16;
        if (!fecpVar4.L()) {
            v.U();
        }
        evvg evvgVar5 = (evvg) v.b;
        evvgVar5.f = i - 1;
        evvgVar5.b |= 8;
        evvg evvgVar6 = (evvg) v.Q();
        fecj v2 = evqy.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        evqy evqyVar = (evqy) v2.b;
        evvgVar6.getClass();
        evqyVar.M = evvgVar6;
        evqyVar.c |= 8;
        cvpmVar.m((evqy) v2.Q(), 38);
        cvtv cvtvVar = this.e;
        if (cvtvVar != null) {
            if (i == 3) {
                cvtvVar.c();
            } else if (i == 2) {
                cvtvVar.b();
            }
        }
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        if (fmzp.ap() && cvue.c(getApplicationContext())) {
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
            boolean r5 = defpackage.cvue.c(r5)
            r6 = 1
            if (r5 != 0) goto Ld
            goto Lb4
        Ld:
            if (r4 != 0) goto L21
            asot r4 = defpackage.cvpo.a
            ejgq r4 = r4.h()
            java.lang.String r5 = "Re-initializing the UTA componentson null intent"
            r0 = 8664(0x21d8, float:1.2141E-41)
            defpackage.a.A(r4, r5, r0)
            r3.j()
            goto Lb4
        L21:
            r3.a()
            java.lang.String r5 = r4.getAction()
            defpackage.arwm.s(r5)
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
            asot r5 = defpackage.cvpo.a
            ejgq r5 = r5.j()
            java.lang.String r4 = r4.getAction()
            java.lang.String r0 = "Unexpected action %s"
            r1 = 8658(0x21d2, float:1.2132E-41)
            defpackage.a.S(r5, r0, r4, r1)
            goto Lb4
        L77:
            asot r4 = defpackage.cvpo.a
            cvtv r4 = r3.e
            if (r4 == 0) goto L81
            r4.e()
            goto Lb4
        L81:
            asot r4 = defpackage.cvpo.a
            ejgq r4 = r4.i()
            java.lang.String r5 = "AutoDetection is null. Unable to stop."
            r0 = 8663(0x21d7, float:1.214E-41)
            defpackage.a.A(r4, r5, r0)
            goto Lb4
        L8f:
            asot r4 = defpackage.cvpo.a
            cvtv r4 = r3.e
            if (r4 == 0) goto La1
            android.content.Context r5 = r3.getApplicationContext()
            cvug r5 = defpackage.cvug.a(r5)
            r4.d(r5)
            goto Lb4
        La1:
            asot r4 = defpackage.cvpo.a
            ejgq r4 = r4.i()
            java.lang.String r5 = "AutoDetection is null. Unable to start."
            r0 = 8661(0x21d5, float:1.2137E-41)
            defpackage.a.A(r4, r5, r0)
            goto Lb4
        Laf:
            asot r4 = defpackage.cvpo.a
            r3.j()
        Lb4:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.personalsafety.service.PersonalSafetyChimeraService.onStartCommand(android.content.Intent, int, int):int");
    }

    PersonalSafetyChimeraService(asnv asnvVar, cvtv cvtvVar, cvpm cvpmVar) {
        this.b = asnvVar;
        this.e = cvtvVar;
        this.h = cvpmVar;
    }
}
