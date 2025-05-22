package com.google.android.gms.learning.dynamite.training;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.aupv;
import defpackage.aurr;
import defpackage.bspk;
import defpackage.bspu;
import defpackage.bspv;
import defpackage.bsss;
import defpackage.eqgc;
import defpackage.eqgl;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class GmsTrainingJobTaskBoundService extends GmsTaskBoundService {
    private static final Object a = new Object();
    private bspv b;

    protected final bspv d() {
        bspv bspvVar;
        synchronized (a) {
            if (this.b == null) {
                bsss.a();
                this.b = new bspv(new bspk(this), new aupv(1, 10));
            }
            bspvVar = this.b;
        }
        return bspvVar;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final void gf() {
        final bspv d = d();
        d.i.c(1124);
        final eqgl g = d.h.g();
        bspv.b(eqgc.b(g).a(new Callable() { // from class: bsps
            @Override // java.util.concurrent.Callable
            public final Object call() {
                try {
                    eqgc.r(g);
                    return null;
                } catch (ExecutionException e) {
                    bspv.this.i.c(1123);
                    throw e;
                }
            }
        }, d.e), d.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        if ((r6.c == 13 ? (defpackage.dvqy) r6.d : defpackage.dvqy.a).h.isEmpty() != false) goto L22;
     */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.eqgl iB(defpackage.cauf r17) {
        /*
            Method dump skipped, instructions count: 701
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.learning.dynamite.training.GmsTrainingJobTaskBoundService.iB(cauf):eqgl");
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onDestroy() {
        synchronized (a) {
            bspv bspvVar = this.b;
            if (bspvVar != null) {
                try {
                    bspvVar.f(1198);
                    synchronized (bspv.b) {
                        bspu bspuVar = bspvVar.d;
                        if (bspuVar != null) {
                            bspvVar.d(bspuVar, true);
                        }
                    }
                    bspvVar.f.close();
                    bspvVar.f = null;
                } catch (RuntimeException e) {
                    bspvVar.f(1197);
                    aurr.f(bspvVar.c, e);
                    throw e;
                }
            }
        }
        super.onDestroy();
    }
}
