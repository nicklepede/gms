package com.google.android.gms.kids.auth.tasks;

import android.content.Context;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.brjn;
import defpackage.brjq;
import defpackage.brmk;
import defpackage.brmm;
import defpackage.brmn;
import defpackage.brnl;
import defpackage.cauf;
import defpackage.eqgl;
import defpackage.flni;
import defpackage.fxuv;
import defpackage.fxxg;
import defpackage.fxxm;
import defpackage.fxya;
import defpackage.fyeb;
import defpackage.fyqe;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class PeriodicHealthMetricsBoundService extends GmsTaskBoundService {
    public static final String a;
    private final fxuv b;

    static {
        int i = fxya.a;
        String b = new fxxg(PeriodicHealthMetricsBoundService.class).b();
        if (b == null) {
            throw new IllegalStateException("Required value was null.");
        }
        a = b;
    }

    public PeriodicHealthMetricsBoundService() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        Context applicationContext = getApplicationContext();
        fxxm.e(applicationContext, "getApplicationContext(...)");
        flni.b(applicationContext);
        fxuv fxuvVar = this.b;
        flni.b(fxuvVar);
        fyeb.b(fxuvVar);
        return fyqe.d(fyeb.b(fxuvVar), new brjn(new brjq(new brmk(applicationContext, fxuvVar, brmn.c(applicationContext), brmm.c(applicationContext)), new brnl(applicationContext, fxuvVar), applicationContext), null));
    }

    public PeriodicHealthMetricsBoundService(fxuv fxuvVar) {
        fxxm.f(fxuvVar, "blockingContext");
        this.b = fxuvVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ PeriodicHealthMetricsBoundService(defpackage.fxuv r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
        /*
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L8
            fxuv r1 = defpackage.bsxe.a
            fxuv r1 = defpackage.bsxe.d
        L8:
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.kids.auth.tasks.PeriodicHealthMetricsBoundService.<init>(fxuv, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
