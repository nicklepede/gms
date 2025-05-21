package com.google.android.gms.semanticlocationhistory.db;

import android.content.Context;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.asej;
import defpackage.asot;
import defpackage.czje;
import defpackage.czlk;
import defpackage.dade;
import defpackage.dadh;
import defpackage.daga;
import defpackage.dahq;
import defpackage.dbaa;
import defpackage.dbhz;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class OdlhPppCleanupJob extends GmsTaskBoundService {
    public static final String a = "com.google.android.gms.semanticlocationhistory.db.OdlhPppCleanupJob";
    private static final asot b = asot.c("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY, "OdlhPppCleanup");
    private dade c;
    private daga d;
    private dahq e;
    private czlk f;
    private dbaa g;
    private dbhz h;
    private czje j;

    private final czje d() {
        if (this.j == null) {
            this.j = new czje();
        }
        return this.j;
    }

    private final czlk e() {
        if (this.f == null) {
            this.f = new czlk(d());
        }
        return this.f;
    }

    private final dade f(Context context) {
        if (this.c == null) {
            this.c = dadh.w(context);
        }
        return this.c;
    }

    private final dahq g() {
        if (this.e == null) {
            this.e = new dahq();
        }
        return this.e;
    }

    private final dbhz h() {
        if (this.h == null) {
            this.h = new dbhz();
        }
        return this.h;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x03b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x01c4 A[Catch: all -> 0x021a, TryCatch #44 {all -> 0x021a, blocks: (B:184:0x01a0, B:190:0x01b6, B:192:0x01c4, B:193:0x01c7, B:230:0x01e2, B:232:0x01f7, B:233:0x01fa), top: B:183:0x01a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0223 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0715 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0704 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x033c A[Catch: all -> 0x03a7, TryCatch #9 {all -> 0x03a7, blocks: (B:117:0x02fa, B:79:0x0301, B:81:0x0305, B:82:0x0307, B:84:0x030b, B:85:0x030d, B:78:0x02ff, B:91:0x032e, B:93:0x033c, B:94:0x033f, B:141:0x0369, B:143:0x0383, B:144:0x0386), top: B:116:0x02fa }] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.enss im(defpackage.byln r48) {
        /*
            Method dump skipped, instructions count: 2596
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.semanticlocationhistory.db.OdlhPppCleanupJob.im(byln):enss");
    }
}
