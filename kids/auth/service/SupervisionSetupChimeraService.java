package com.google.android.gms.kids.auth.service;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.ModuleContext;
import com.google.android.chimera.Service;
import defpackage.asnz;
import defpackage.asot;
import defpackage.bota;
import defpackage.boxd;
import defpackage.boxe;
import defpackage.boxh;
import defpackage.boxx;
import defpackage.boxz;
import defpackage.boyb;
import defpackage.boyq;
import defpackage.boyz;
import defpackage.bozn;
import defpackage.bozy;
import defpackage.bozz;
import defpackage.bpae;
import defpackage.bpah;
import defpackage.bpan;
import defpackage.bpbk;
import defpackage.bpbl;
import defpackage.bpbp;
import defpackage.bpbq;
import defpackage.bpbs;
import defpackage.eito;
import defpackage.eits;
import defpackage.ejhf;
import defpackage.fixl;
import defpackage.fixm;
import defpackage.fphp;
import defpackage.fuyx;
import defpackage.fvbo;
import defpackage.fvgt;
import defpackage.fvic;
import defpackage.fvid;
import defpackage.fvjv;
import defpackage.fvku;
import defpackage.fvmi;
import defpackage.fvmk;
import defpackage.fvmm;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class SupervisionSetupChimeraService extends Service {
    public static final asot a = bota.a("SupervisionSetupChimeraService");
    public static final Intent b = new Intent("com.google.android.gms.kids.auth.service.RECOVER_SETUP");
    public bpbq c;
    public final fvmi d;
    public bpbk e;
    public boxx f;
    private final fuyx g;
    private final boolean h;
    private final CoroutineExceptionHandler i;
    private final fvic j;
    private boxd k;
    private final fvjv l;

    public SupervisionSetupChimeraService() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final bpbk a() {
        bpbk bpbkVar = this.e;
        if (bpbkVar != null) {
            return bpbkVar;
        }
        fvbo.j("currentState");
        return null;
    }

    public final bpbq b() {
        bpbq bpbqVar = this.c;
        if (bpbqVar != null) {
            return bpbqVar;
        }
        fvbo.j("statesRepository");
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
    public final java.lang.Object c(defpackage.fuyp r20) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.kids.auth.service.SupervisionSetupChimeraService.c(fuyp):java.lang.Object");
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
            fvbo.e(applicationContext, "getApplicationContext(...)");
            fixl.b(applicationContext);
            ModuleContext moduleContext = ModuleContext.getModuleContext(this);
            if (moduleContext == null) {
                throw new IllegalStateException("Required value was null.");
            }
            fuyx fuyxVar = this.g;
            fixl.b(fuyxVar);
            fvic fvicVar = this.j;
            fixl.b(fvicVar);
            fixl.a(applicationContext, Context.class);
            fixl.a(moduleContext, ModuleContext.class);
            fixl.a(fuyxVar, fuyx.class);
            fixl.a(fvicVar, fvic.class);
            this.k = new boxd(applicationContext, moduleContext, fuyxVar, fvicVar);
        }
        boxd boxdVar = this.k;
        if (boxdVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        eito i = eits.i(7);
        bpbl bpblVar = bpbl.a;
        bozz bozzVar = new bozz();
        Context context = boxdVar.a;
        bozzVar.f = context;
        bozzVar.k = boxdVar.c();
        fixm fixmVar = boxdVar.m;
        bozzVar.l = (boxx) fixmVar.a();
        asnz asnzVar = asnz.a;
        bozzVar.g = asnzVar;
        fixm fixmVar2 = boxdVar.p;
        bozzVar.m = (bpbs) fixmVar2.a();
        fixm fixmVar3 = boxdVar.j;
        bozzVar.n = (boyq) fixmVar3.a();
        bozzVar.h = boxdVar.d();
        fixm fixmVar4 = boxdVar.r;
        bozzVar.i = (boyb) fixmVar4.a();
        fixm fixmVar5 = boxdVar.u;
        bozzVar.j = (boyz) fixmVar5.a();
        i.i(bpblVar, bozzVar);
        bpbl bpblVar2 = bpbl.b;
        bpae bpaeVar = new bpae();
        bpaeVar.f = context;
        bpaeVar.k = boxdVar.c();
        bpaeVar.l = (boxx) fixmVar.a();
        bpaeVar.g = asnzVar;
        bpaeVar.m = (bpbs) fixmVar2.a();
        bpaeVar.n = (boyq) fixmVar3.a();
        bpaeVar.h = boxdVar.d();
        bpaeVar.i = (boyb) fixmVar4.a();
        bpaeVar.j = (boyz) fixmVar5.a();
        i.i(bpblVar2, bpaeVar);
        bpbl bpblVar3 = bpbl.c;
        bozn boznVar = new bozn();
        boznVar.f = context;
        boznVar.k = boxdVar.c();
        boznVar.l = (boxx) fixmVar.a();
        boznVar.g = asnzVar;
        boznVar.m = (bpbs) fixmVar2.a();
        boznVar.n = (boyq) fixmVar3.a();
        boznVar.h = boxdVar.d();
        boznVar.i = (boyb) fixmVar4.a();
        boznVar.j = (boyz) fixmVar5.a();
        i.i(bpblVar3, boznVar);
        bpbl bpblVar4 = bpbl.d;
        bpan bpanVar = new bpan(boxdVar.b());
        bpanVar.f = context;
        bpanVar.k = boxdVar.c();
        bpanVar.l = (boxx) fixmVar.a();
        bpanVar.g = asnzVar;
        bpanVar.m = (bpbs) fixmVar2.a();
        bpanVar.n = (boyq) fixmVar3.a();
        bpanVar.h = boxdVar.d();
        bpanVar.i = (boyb) fixmVar4.a();
        bpanVar.j = (boyz) fixmVar5.a();
        i.i(bpblVar4, bpanVar);
        bpbl bpblVar5 = bpbl.e;
        boxdVar.a();
        bpbp bpbpVar = new bpbp(context, boxdVar.b());
        bpbpVar.f = context;
        bpbpVar.k = boxdVar.c();
        bpbpVar.l = (boxx) fixmVar.a();
        bpbpVar.g = asnzVar;
        bpbpVar.m = (bpbs) fixmVar2.a();
        bpbpVar.n = (boyq) fixmVar3.a();
        bpbpVar.h = boxdVar.d();
        bpbpVar.i = (boyb) fixmVar4.a();
        bpbpVar.j = (boyz) fixmVar5.a();
        i.i(bpblVar5, bpbpVar);
        bpbl bpblVar6 = bpbl.f;
        bpah bpahVar = new bpah(boxdVar.b());
        bpahVar.f = context;
        bpahVar.k = boxdVar.c();
        bpahVar.l = (boxx) fixmVar.a();
        bpahVar.g = asnzVar;
        bpahVar.m = (bpbs) fixmVar2.a();
        bpahVar.n = (boyq) fixmVar3.a();
        bpahVar.h = boxdVar.d();
        bpahVar.i = (boyb) fixmVar4.a();
        bpahVar.j = (boyz) fixmVar5.a();
        i.i(bpblVar6, bpahVar);
        bpbl bpblVar7 = bpbl.g;
        bozy bozyVar = new bozy(boxdVar.a(), boxdVar.b());
        bozyVar.f = context;
        bozyVar.k = boxdVar.c();
        bozyVar.l = (boxx) fixmVar.a();
        bozyVar.g = asnzVar;
        bozyVar.m = (bpbs) fixmVar2.a();
        bozyVar.n = (boyq) fixmVar3.a();
        bozyVar.h = boxdVar.d();
        bozyVar.i = (boyb) fixmVar4.a();
        bozyVar.j = (boyz) fixmVar5.a();
        i.i(bpblVar7, bozyVar);
        this.c = new bpbq(i.b());
        this.f = (boxx) fixmVar.a();
        boxdVar.c();
        boxdVar.d();
        this.e = b().a(bpblVar);
        fvgt.b(this.j, null, null, new boxe(this, null), 3);
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        this.l.s(null);
        ((ejhf) a.h()).x("Service stopped");
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
        boxz boxzVar = new boxz(intent, i, i2);
        boxz boxzVar2 = null;
        if (i2 == 1) {
            Intent intent2 = boxzVar.a;
            if (!fvbo.n(intent2.getAction(), "com.google.android.gms.kids.auth.service.RECOVER_SETUP") && !fvbo.n(intent2.getAction(), "com.google.android.gms.kids.auth.service.SETUP_STARTED")) {
                ((ejhf) a.j()).B("Unexpected startId 1 for intent: `%s`, recovering first.", intent2.getAction());
                boxzVar2 = new boxz(b, i, 1);
            }
        }
        if (boxzVar2 != null && (this.d.j(boxzVar2) instanceof fvmm)) {
            ((ejhf) a.j()).x("Failed to recovery send command");
        }
        if (this.d.j(boxzVar) instanceof fvmm) {
            ((ejhf) a.j()).x("Failed to send command");
        }
        return 1;
    }

    public SupervisionSetupChimeraService(fuyx fuyxVar) {
        fvbo.f(fuyxVar, "blockingContext");
        this.g = fuyxVar;
        this.h = fphp.a.a().g();
        boxh boxhVar = new boxh(CoroutineExceptionHandler.c, this);
        this.i = boxhVar;
        fvku fvkuVar = new fvku(null);
        this.l = fvkuVar;
        this.j = fvid.b(fuyxVar.plus(fvkuVar).plus(boxhVar));
        this.d = fvmk.a(-2, 0, null, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ SupervisionSetupChimeraService(defpackage.fuyx r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
        /*
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L8
            fuyx r1 = defpackage.bqpn.a
            fuyx r1 = defpackage.bqpn.c
        L8:
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.kids.auth.service.SupervisionSetupChimeraService.<init>(fuyx, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
