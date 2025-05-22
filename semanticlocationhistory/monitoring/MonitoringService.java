package com.google.android.gms.semanticlocationhistory.monitoring;

import android.content.Context;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.dbtc;
import defpackage.dbte;
import defpackage.dbvg;
import defpackage.dcnm;
import defpackage.dcnp;
import defpackage.dcqi;
import defpackage.dcry;
import defpackage.ddoj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class MonitoringService extends GmsTaskBoundService {
    public static final String a = "com.google.android.gms.semanticlocationhistory.monitoring.MonitoringService";
    private static final ausn b = ausn.c("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY, "MonitoringService");
    private dbte c;
    private dcnm d;
    private dcqi e;
    private ddoj f;
    private dbvg g;
    private dcry h;

    private final dbvg e() {
        if (this.g == null) {
            this.g = new dbvg(new dbtc());
        }
        return this.g;
    }

    private final dcnm f(Context context) {
        if (this.d == null) {
            this.d = dcnp.w(context);
        }
        return this.d;
    }

    private final void g() {
        if (this.e == null) {
            this.e = new dcqi();
        }
    }

    public final dbte d() {
        if (this.c == null) {
            this.c = dbte.a();
        }
        return this.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x00f4, code lost:
    
        r5 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x00f2, code lost:
    
        if (e().h().containsKey(r15.name) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x05f2, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00df, code lost:
    
        if (j$.util.DesugarCollections.unmodifiableMap(e().g().c).containsKey(r15.name) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f6, code lost:
    
        r5 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x07b8  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x07ce  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x07f9  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0814  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x082f  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x084e  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0864  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x087f  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0898  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x08b1  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x08cc  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x08ec A[Catch: InterruptedException | ExecutionException -> 0x0935, TryCatch #18 {InterruptedException | ExecutionException -> 0x0935, blocks: (B:321:0x08e8, B:323:0x08ec, B:324:0x08f3, B:325:0x08f9, B:329:0x090a, B:329:0x090a, B:353:0x091b, B:353:0x091b, B:355:0x0923, B:355:0x0923, B:356:0x0926, B:356:0x0926, B:360:0x0934, B:360:0x0934), top: B:320:0x08e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x08fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0376  */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v17, types: [long] */
    /* JADX WARN: Type inference failed for: r16v22 */
    /* JADX WARN: Type inference failed for: r16v23 */
    /* JADX WARN: Type inference failed for: r16v24 */
    /* JADX WARN: Type inference failed for: r16v25 */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.eqgl iB(defpackage.cauf r29) {
        /*
            Method dump skipped, instructions count: 2522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.semanticlocationhistory.monitoring.MonitoringService.iB(cauf):eqgl");
    }
}
