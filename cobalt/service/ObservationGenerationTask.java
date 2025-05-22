package com.google.android.gms.cobalt.service;

import defpackage.auid;
import defpackage.ausn;
import defpackage.fxqo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class ObservationGenerationTask extends Pommel_ObservationGenerationTask {
    public static final ausn a = ausn.b("CobaltObservationGenerationTask", auid.COBALT);
    public fxqo b;

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0370, code lost:
    
        throw new java.lang.AssertionError(defpackage.a.j(r1, "Unrecognized or unsupported ReportType: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x023a, code lost:
    
        if (r10 != 2) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02e2, code lost:
    
        if (r7 != 2) goto L110;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03b1 A[Catch: SQLiteException -> 0x042a, asug -> 0x042d, TRY_ENTER, TRY_LEAVE, TryCatch #9 {SQLiteException -> 0x042a, blocks: (B:100:0x0332, B:101:0x0337, B:111:0x0350, B:115:0x035b, B:121:0x0367, B:122:0x0370, B:128:0x0371, B:131:0x037a, B:137:0x0384, B:138:0x038d, B:139:0x038e, B:142:0x03a2, B:145:0x039a, B:146:0x03b1, B:175:0x0307, B:177:0x030d, B:178:0x0319, B:179:0x031a, B:180:0x0324), top: B:99:0x0332 }] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x07cf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0a9a A[Catch: all -> 0x0b78, LOOP:9: B:433:0x0a94->B:435:0x0a9a, LOOP_END, TRY_LEAVE, TryCatch #13 {all -> 0x0b78, blocks: (B:432:0x0a7c, B:433:0x0a94, B:435:0x0a9a), top: B:431:0x0a7c, outer: #27 }] */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0aba A[Catch: SQLiteException -> 0x0b85, TRY_ENTER, TryCatch #27 {SQLiteException -> 0x0b85, blocks: (B:430:0x0a60, B:438:0x0aba, B:439:0x0abd, B:441:0x0ace, B:443:0x0adc, B:445:0x0ae2, B:447:0x0b1b, B:449:0x0b18, B:452:0x0b1e, B:454:0x0b28, B:456:0x0b36, B:458:0x0b66, B:469:0x0b84, B:468:0x0b81, B:432:0x0a7c, B:433:0x0a94, B:435:0x0a9a, B:464:0x0b7c), top: B:429:0x0a60, inners: #13, #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0ace A[Catch: SQLiteException -> 0x0b85, TryCatch #27 {SQLiteException -> 0x0b85, blocks: (B:430:0x0a60, B:438:0x0aba, B:439:0x0abd, B:441:0x0ace, B:443:0x0adc, B:445:0x0ae2, B:447:0x0b1b, B:449:0x0b18, B:452:0x0b1e, B:454:0x0b28, B:456:0x0b36, B:458:0x0b66, B:469:0x0b84, B:468:0x0b81, B:432:0x0a7c, B:433:0x0a94, B:435:0x0a9a, B:464:0x0b7c), top: B:429:0x0a60, inners: #13, #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0b28 A[Catch: SQLiteException -> 0x0b85, TryCatch #27 {SQLiteException -> 0x0b85, blocks: (B:430:0x0a60, B:438:0x0aba, B:439:0x0abd, B:441:0x0ace, B:443:0x0adc, B:445:0x0ae2, B:447:0x0b1b, B:449:0x0b18, B:452:0x0b1e, B:454:0x0b28, B:456:0x0b36, B:458:0x0b66, B:469:0x0b84, B:468:0x0b81, B:432:0x0a7c, B:433:0x0a94, B:435:0x0a9a, B:464:0x0b7c), top: B:429:0x0a60, inners: #13, #17 }] */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v18 */
    /* JADX WARN: Type inference failed for: r21v19 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v22 */
    /* JADX WARN: Type inference failed for: r21v25 */
    /* JADX WARN: Type inference failed for: r21v26 */
    /* JADX WARN: Type inference failed for: r21v27 */
    /* JADX WARN: Type inference failed for: r21v29 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v30 */
    /* JADX WARN: Type inference failed for: r21v34 */
    /* JADX WARN: Type inference failed for: r21v35 */
    /* JADX WARN: Type inference failed for: r21v36 */
    /* JADX WARN: Type inference failed for: r21v37 */
    /* JADX WARN: Type inference failed for: r21v38 */
    /* JADX WARN: Type inference failed for: r21v39, types: [int] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v40 */
    /* JADX WARN: Type inference failed for: r21v41 */
    /* JADX WARN: Type inference failed for: r21v42 */
    /* JADX WARN: Type inference failed for: r21v43 */
    /* JADX WARN: Type inference failed for: r21v46 */
    /* JADX WARN: Type inference failed for: r21v47 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v50 */
    /* JADX WARN: Type inference failed for: r21v51 */
    /* JADX WARN: Type inference failed for: r21v52 */
    /* JADX WARN: Type inference failed for: r21v53 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r21v9 */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(defpackage.cauf r45) {
        /*
            Method dump skipped, instructions count: 2970
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cobalt.service.ObservationGenerationTask.a(cauf):int");
    }
}
