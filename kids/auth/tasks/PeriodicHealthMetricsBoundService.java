package com.google.android.gms.kids.auth.tasks;

import android.content.Context;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.bpbx;
import defpackage.bpca;
import defpackage.bpeu;
import defpackage.bpew;
import defpackage.bpex;
import defpackage.bpfv;
import defpackage.byln;
import defpackage.enss;
import defpackage.fixl;
import defpackage.fuyx;
import defpackage.fuyy;
import defpackage.fvbi;
import defpackage.fvbo;
import defpackage.fvcc;
import defpackage.fvid;
import defpackage.fvie;
import defpackage.fvug;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class PeriodicHealthMetricsBoundService extends GmsTaskBoundService {
    public static final String a;
    private final fuyx b;

    static {
        int i = fvcc.a;
        String b = new fvbi(PeriodicHealthMetricsBoundService.class).b();
        if (b == null) {
            throw new IllegalStateException("Required value was null.");
        }
        a = b;
    }

    public PeriodicHealthMetricsBoundService() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        enss b;
        Context applicationContext = getApplicationContext();
        fvbo.e(applicationContext, "getApplicationContext(...)");
        fixl.b(applicationContext);
        fuyx fuyxVar = this.b;
        fixl.b(fuyxVar);
        fvid.b(fuyxVar);
        b = fvug.b(fvid.b(fuyxVar), fuyy.a, fvie.a, new bpbx(new bpca(new bpeu(applicationContext, fuyxVar, bpex.c(applicationContext), bpew.c(applicationContext)), new bpfv(applicationContext, fuyxVar), applicationContext), null));
        return b;
    }

    public PeriodicHealthMetricsBoundService(fuyx fuyxVar) {
        fvbo.f(fuyxVar, "blockingContext");
        this.b = fuyxVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ PeriodicHealthMetricsBoundService(defpackage.fuyx r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
        /*
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L8
            fuyx r1 = defpackage.bqpn.a
            fuyx r1 = defpackage.bqpn.d
        L8:
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.kids.auth.tasks.PeriodicHealthMetricsBoundService.<init>(fuyx, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
