package com.google.android.gms.semanticlocationhistory.db;

import android.content.Context;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.dbtc;
import defpackage.dbvg;
import defpackage.dcnm;
import defpackage.dcnp;
import defpackage.dcqi;
import defpackage.dcry;
import defpackage.ddki;
import defpackage.ddsf;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class OdlhPppCleanupJob extends GmsTaskBoundService {
    public static final String a = "com.google.android.gms.semanticlocationhistory.db.OdlhPppCleanupJob";
    private static final ausn b = ausn.c("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY, "OdlhPppCleanup");
    private dcnm c;
    private dcqi d;
    private dcry e;
    private dbvg f;
    private ddki g;
    private ddsf h;
    private dbtc j;

    private final dbtc d() {
        if (this.j == null) {
            this.j = new dbtc();
        }
        return this.j;
    }

    private final dbvg e() {
        if (this.f == null) {
            this.f = new dbvg(d());
        }
        return this.f;
    }

    private final dcnm f(Context context) {
        if (this.c == null) {
            this.c = dcnp.w(context);
        }
        return this.c;
    }

    private final dcry g() {
        if (this.e == null) {
            this.e = new dcry();
        }
        return this.e;
    }

    private final ddsf h() {
        if (this.h == null) {
            this.h = new ddsf();
        }
        return this.h;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x03b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x033d A[Catch: all -> 0x03aa, TryCatch #13 {all -> 0x03aa, blocks: (B:117:0x02f9, B:79:0x0300, B:81:0x0304, B:82:0x0306, B:84:0x030a, B:85:0x030c, B:78:0x02fe, B:112:0x032d, B:114:0x033d, B:115:0x0340, B:141:0x036a, B:143:0x0386, B:144:0x0389), top: B:116:0x02f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0720 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:403:0x070d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0294  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.eqgl iB(defpackage.cauf r56) {
        /*
            Method dump skipped, instructions count: 2606
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.semanticlocationhistory.db.OdlhPppCleanupJob.iB(cauf):eqgl");
    }
}
