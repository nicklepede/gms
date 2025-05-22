package com.google.android.gms.kids.auth.service;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.ModuleContext;
import com.google.android.chimera.Service;
import defpackage.aurt;
import defpackage.ausn;
import defpackage.braq;
import defpackage.bret;
import defpackage.breu;
import defpackage.brex;
import defpackage.brfn;
import defpackage.brfp;
import defpackage.brfr;
import defpackage.brgg;
import defpackage.brgp;
import defpackage.brhd;
import defpackage.brho;
import defpackage.brhp;
import defpackage.brhu;
import defpackage.brhx;
import defpackage.brid;
import defpackage.brja;
import defpackage.brjb;
import defpackage.brjf;
import defpackage.brjg;
import defpackage.brji;
import defpackage.elgt;
import defpackage.elgx;
import defpackage.eluo;
import defpackage.flni;
import defpackage.flnj;
import defpackage.fsbd;
import defpackage.fxuv;
import defpackage.fxxm;
import defpackage.fycr;
import defpackage.fyea;
import defpackage.fyeb;
import defpackage.fyft;
import defpackage.fygs;
import defpackage.fyig;
import defpackage.fyii;
import defpackage.fyik;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class SupervisionSetupChimeraService extends Service {
    public static final ausn a = braq.a("SupervisionSetupChimeraService");
    public static final Intent b = new Intent("com.google.android.gms.kids.auth.service.RECOVER_SETUP");
    public brjg c;
    public final fyig d;
    public brja e;
    public brfn f;
    private final fxuv g;
    private final boolean h;
    private final CoroutineExceptionHandler i;
    private final fyea j;
    private bret k;
    private final fyft l;

    public SupervisionSetupChimeraService() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final brja a() {
        brja brjaVar = this.e;
        if (brjaVar != null) {
            return brjaVar;
        }
        fxxm.j("currentState");
        return null;
    }

    public final brjg b() {
        brjg brjgVar = this.c;
        if (brjgVar != null) {
            return brjgVar;
        }
        fxxm.j("statesRepository");
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|(1:(1:(1:(1:(11:13|14|15|(1:17)|18|19|(1:21)|22|23|(3:25|26|(3:28|29|(11:31|32|(1:34)|15|(0)|18|19|(0)|22|23|(0)))(2:41|42))|44)(2:46|47))(7:48|49|50|51|36|(1:38)|39))(13:56|57|32|(0)|15|(0)|18|19|(0)|22|23|(0)|44))(3:58|26|(0)(0)))(4:59|23|(0)|44)))|61|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0107, code lost:
    
        if (r0.q(r10, r12, r2) != r3) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0137, code lost:
    
        if (r0.c(r12, r13, r14, r2) != r3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0068, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0158 A[Catch: all -> 0x0068, TryCatch #1 {all -> 0x0068, blocks: (B:14:0x0037, B:15:0x0139, B:17:0x0158, B:18:0x015d, B:29:0x009c, B:32:0x00db, B:34:0x00e7, B:36:0x0109, B:38:0x010d, B:39:0x0113, B:57:0x0063), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e7 A[Catch: all -> 0x0068, TryCatch #1 {all -> 0x0068, blocks: (B:14:0x0037, B:15:0x0139, B:17:0x0158, B:18:0x015d, B:29:0x009c, B:32:0x00db, B:34:0x00e7, B:36:0x0109, B:38:0x010d, B:39:0x0113, B:57:0x0063), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00e5 -> B:15:0x0139). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0137 -> B:15:0x0139). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.fxun r20) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.kids.auth.service.SupervisionSetupChimeraService.c(fxun):java.lang.Object");
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if (!this.h) {
            stopSelf();
        }
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        if (!this.h) {
            stopSelf();
            return;
        }
        if (this.k == null) {
            Context applicationContext = getApplication().getApplicationContext();
            fxxm.e(applicationContext, "getApplicationContext(...)");
            flni.b(applicationContext);
            ModuleContext moduleContext = ModuleContext.getModuleContext(this);
            if (moduleContext == null) {
                throw new IllegalStateException("Required value was null.");
            }
            fxuv fxuvVar = this.g;
            flni.b(fxuvVar);
            fyea fyeaVar = this.j;
            flni.b(fyeaVar);
            flni.a(applicationContext, Context.class);
            flni.a(moduleContext, ModuleContext.class);
            flni.a(fxuvVar, fxuv.class);
            flni.a(fyeaVar, fyea.class);
            this.k = new bret(applicationContext, moduleContext, fxuvVar, fyeaVar);
        }
        bret bretVar = this.k;
        if (bretVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        elgt i = elgx.i(7);
        brjb brjbVar = brjb.a;
        brhp brhpVar = new brhp();
        Context context = bretVar.a;
        brhpVar.f = context;
        brhpVar.k = bretVar.c();
        flnj flnjVar = bretVar.m;
        brhpVar.l = (brfn) flnjVar.a();
        aurt aurtVar = aurt.a;
        brhpVar.g = aurtVar;
        flnj flnjVar2 = bretVar.p;
        brhpVar.m = (brji) flnjVar2.a();
        flnj flnjVar3 = bretVar.j;
        brhpVar.n = (brgg) flnjVar3.a();
        brhpVar.h = bretVar.d();
        flnj flnjVar4 = bretVar.r;
        brhpVar.i = (brfr) flnjVar4.a();
        flnj flnjVar5 = bretVar.u;
        brhpVar.j = (brgp) flnjVar5.a();
        i.i(brjbVar, brhpVar);
        brjb brjbVar2 = brjb.b;
        brhu brhuVar = new brhu();
        brhuVar.f = context;
        brhuVar.k = bretVar.c();
        brhuVar.l = (brfn) flnjVar.a();
        brhuVar.g = aurtVar;
        brhuVar.m = (brji) flnjVar2.a();
        brhuVar.n = (brgg) flnjVar3.a();
        brhuVar.h = bretVar.d();
        brhuVar.i = (brfr) flnjVar4.a();
        brhuVar.j = (brgp) flnjVar5.a();
        i.i(brjbVar2, brhuVar);
        brjb brjbVar3 = brjb.c;
        brhd brhdVar = new brhd();
        brhdVar.f = context;
        brhdVar.k = bretVar.c();
        brhdVar.l = (brfn) flnjVar.a();
        brhdVar.g = aurtVar;
        brhdVar.m = (brji) flnjVar2.a();
        brhdVar.n = (brgg) flnjVar3.a();
        brhdVar.h = bretVar.d();
        brhdVar.i = (brfr) flnjVar4.a();
        brhdVar.j = (brgp) flnjVar5.a();
        i.i(brjbVar3, brhdVar);
        brjb brjbVar4 = brjb.d;
        brid bridVar = new brid(bretVar.b());
        bridVar.f = context;
        bridVar.k = bretVar.c();
        bridVar.l = (brfn) flnjVar.a();
        bridVar.g = aurtVar;
        bridVar.m = (brji) flnjVar2.a();
        bridVar.n = (brgg) flnjVar3.a();
        bridVar.h = bretVar.d();
        bridVar.i = (brfr) flnjVar4.a();
        bridVar.j = (brgp) flnjVar5.a();
        i.i(brjbVar4, bridVar);
        brjb brjbVar5 = brjb.e;
        bretVar.a();
        brjf brjfVar = new brjf(context, bretVar.b());
        brjfVar.f = context;
        brjfVar.k = bretVar.c();
        brjfVar.l = (brfn) flnjVar.a();
        brjfVar.g = aurtVar;
        brjfVar.m = (brji) flnjVar2.a();
        brjfVar.n = (brgg) flnjVar3.a();
        brjfVar.h = bretVar.d();
        brjfVar.i = (brfr) flnjVar4.a();
        brjfVar.j = (brgp) flnjVar5.a();
        i.i(brjbVar5, brjfVar);
        brjb brjbVar6 = brjb.f;
        brhx brhxVar = new brhx(bretVar.b());
        brhxVar.f = context;
        brhxVar.k = bretVar.c();
        brhxVar.l = (brfn) flnjVar.a();
        brhxVar.g = aurtVar;
        brhxVar.m = (brji) flnjVar2.a();
        brhxVar.n = (brgg) flnjVar3.a();
        brhxVar.h = bretVar.d();
        brhxVar.i = (brfr) flnjVar4.a();
        brhxVar.j = (brgp) flnjVar5.a();
        i.i(brjbVar6, brhxVar);
        brjb brjbVar7 = brjb.g;
        brho brhoVar = new brho(bretVar.a(), bretVar.b());
        brhoVar.f = context;
        brhoVar.k = bretVar.c();
        brhoVar.l = (brfn) flnjVar.a();
        brhoVar.g = aurtVar;
        brhoVar.m = (brji) flnjVar2.a();
        brhoVar.n = (brgg) flnjVar3.a();
        brhoVar.h = bretVar.d();
        brhoVar.i = (brfr) flnjVar4.a();
        brhoVar.j = (brgp) flnjVar5.a();
        i.i(brjbVar7, brhoVar);
        this.c = new brjg(i.b());
        this.f = (brfn) flnjVar.a();
        bretVar.c();
        bretVar.d();
        this.e = b().a(brjbVar);
        fycr.b(this.j, null, null, new breu(this, null), 3);
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        this.l.s(null);
        ((eluo) a.h()).x("Service stopped");
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (!this.h) {
            stopSelf();
            return 2;
        }
        if (intent == null) {
            intent = b;
        }
        brfp brfpVar = new brfp(intent, i, i2);
        brfp brfpVar2 = null;
        if (i2 == 1) {
            Intent intent2 = brfpVar.a;
            if (!fxxm.n(intent2.getAction(), "com.google.android.gms.kids.auth.service.RECOVER_SETUP") && !fxxm.n(intent2.getAction(), "com.google.android.gms.kids.auth.service.SETUP_STARTED")) {
                ((eluo) a.j()).B("Unexpected startId 1 for intent: `%s`, recovering first.", intent2.getAction());
                brfpVar2 = new brfp(b, i, 1);
            }
        }
        if (brfpVar2 != null && (this.d.j(brfpVar2) instanceof fyik)) {
            ((eluo) a.j()).x("Failed to recovery send command");
        }
        if (this.d.j(brfpVar) instanceof fyik) {
            ((eluo) a.j()).x("Failed to send command");
        }
        return 1;
    }

    public SupervisionSetupChimeraService(fxuv fxuvVar) {
        fxxm.f(fxuvVar, "blockingContext");
        this.g = fxuvVar;
        this.h = fsbd.a.lK().g();
        brex brexVar = new brex(CoroutineExceptionHandler.c, this);
        this.i = brexVar;
        fygs fygsVar = new fygs(null);
        this.l = fygsVar;
        this.j = fyeb.b(fxuvVar.plus(fygsVar).plus(brexVar));
        this.d = fyii.a(-2, 0, null, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ SupervisionSetupChimeraService(defpackage.fxuv r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
        /*
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L8
            fxuv r1 = defpackage.bsxe.a
            fxuv r1 = defpackage.bsxe.c
        L8:
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.kids.auth.service.SupervisionSetupChimeraService.<init>(fxuv, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
