package com.google.android.gms.learning.dynamite.training;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.asmb;
import defpackage.asnx;
import defpackage.bqhv;
import defpackage.bqif;
import defpackage.bqig;
import defpackage.bqld;
import defpackage.ensj;
import defpackage.enss;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GmsTrainingJobTaskBoundService extends GmsTaskBoundService {
    private static final Object a = new Object();
    private bqig b;

    protected final bqig d() {
        bqig bqigVar;
        synchronized (a) {
            if (this.b == null) {
                bqld.a();
                this.b = new bqig(new bqhv(this), new asmb(1, 10));
            }
            bqigVar = this.b;
        }
        return bqigVar;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final void fR() {
        final bqig d = d();
        d.i.c(1124);
        final enss g = d.h.g();
        bqig.b(ensj.b(g).a(new Callable() { // from class: bqid
            @Override // java.util.concurrent.Callable
            public final Object call() {
                try {
                    ensj.r(g);
                    return null;
                } catch (ExecutionException e) {
                    bqig.this.i.c(1123);
                    throw e;
                }
            }
        }, d.e), d.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        if ((r6.c == 13 ? (defpackage.dtgq) r6.d : defpackage.dtgq.a).h.isEmpty() != false) goto L22;
     */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.enss im(defpackage.byln r17) {
        /*
            Method dump skipped, instructions count: 701
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.learning.dynamite.training.GmsTrainingJobTaskBoundService.im(byln):enss");
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, defpackage.qan
    public final void onDestroy() {
        synchronized (a) {
            bqig bqigVar = this.b;
            if (bqigVar != null) {
                try {
                    bqigVar.f(1198);
                    synchronized (bqig.b) {
                        bqif bqifVar = bqigVar.d;
                        if (bqifVar != null) {
                            bqigVar.d(bqifVar, true);
                        }
                    }
                    bqigVar.f.close();
                    bqigVar.f = null;
                } catch (RuntimeException e) {
                    bqigVar.f(1197);
                    asnx.f(bqigVar.c, e);
                    throw e;
                }
            }
        }
        super.onDestroy();
    }
}
