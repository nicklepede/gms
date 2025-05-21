package com.google.android.gms.cobalt.service;

import defpackage.asej;
import defpackage.asot;
import defpackage.fuuq;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class ObservationGenerationTask extends Pommel_ObservationGenerationTask {
    public static final asot a = asot.b("CobaltObservationGenerationTask", asej.COBALT);
    public fuuq b;

    /* JADX WARN: Can't wrap try/catch for region: R(3:(8:(2:218|219)(2:61|(4:65|66|67|68))|(4:207|82|83|68)|76|77|(20:89|(1:91)|92|(1:(2:95|(2:97|98)(3:185|186|187))(5:188|(1:190)|191|(3:196|197|198)|199))(1:200)|99|(1:101)|157|(11:177|103|104|105|(1:107)|108|(3:110|(2:112|(1:1)(1:118))(7:128|(1:130)|131|(3:136|137|138)|139|(1:145)|142)|119)(4:146|(2:153|150)|149|150)|120|121|122|68)|160|(1:162)|163|(2:165|(2:167|(1:169)(3:170|171|172))(1:173))(1:174)|105|(0)|108|(0)(0)|120|121|122|68)|82|83|68)|73|74) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0306, code lost:
    
        if (r12 != 2) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0389, code lost:
    
        throw new java.lang.AssertionError(defpackage.a.j(r6, "Unrecognized or unsupported ReportType: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0252, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0253, code lost:
    
        r42 = r7;
        r22 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0242, code lost:
    
        if (r4 != 2) goto L418;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03ca A[Catch: SQLiteException -> 0x0441, aqrq -> 0x0443, TRY_ENTER, TRY_LEAVE, TryCatch #16 {SQLiteException -> 0x0441, blocks: (B:98:0x02bd, B:99:0x02fc, B:104:0x034b, B:105:0x0350, B:114:0x0369, B:118:0x0374, B:124:0x0380, B:125:0x0389, B:128:0x038a, B:131:0x0393, B:137:0x039d, B:138:0x03a6, B:139:0x03a7, B:142:0x03bb, B:145:0x03b3, B:146:0x03ca, B:157:0x0308, B:160:0x0313, B:163:0x031c, B:169:0x0327, B:171:0x032f, B:172:0x033a, B:173:0x033b, B:174:0x0343, B:186:0x02c3, B:187:0x02cc, B:188:0x02cd, B:191:0x02d6, B:197:0x02e0, B:198:0x02e9, B:199:0x02ea, B:200:0x02f7), top: B:97:0x02bd }] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x07ad  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x09bb A[Catch: all -> 0x0a99, LOOP:9: B:412:0x09b5->B:414:0x09bb, LOOP_END, TRY_LEAVE, TryCatch #24 {all -> 0x0a99, blocks: (B:411:0x099d, B:412:0x09b5, B:414:0x09bb), top: B:410:0x099d, outer: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:417:0x09db A[Catch: SQLiteException -> 0x0aa6, TRY_ENTER, TryCatch #9 {SQLiteException -> 0x0aa6, blocks: (B:409:0x0981, B:417:0x09db, B:418:0x09de, B:420:0x09ef, B:422:0x09fd, B:424:0x0a03, B:426:0x0a3c, B:428:0x0a39, B:431:0x0a3f, B:433:0x0a49, B:435:0x0a57, B:437:0x0a87, B:448:0x0aa5, B:447:0x0aa2, B:443:0x0a9d, B:411:0x099d, B:412:0x09b5, B:414:0x09bb), top: B:408:0x0981, inners: #0, #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:420:0x09ef A[Catch: SQLiteException -> 0x0aa6, TryCatch #9 {SQLiteException -> 0x0aa6, blocks: (B:409:0x0981, B:417:0x09db, B:418:0x09de, B:420:0x09ef, B:422:0x09fd, B:424:0x0a03, B:426:0x0a3c, B:428:0x0a39, B:431:0x0a3f, B:433:0x0a49, B:435:0x0a57, B:437:0x0a87, B:448:0x0aa5, B:447:0x0aa2, B:443:0x0a9d, B:411:0x099d, B:412:0x09b5, B:414:0x09bb), top: B:408:0x0981, inners: #0, #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0a49 A[Catch: SQLiteException -> 0x0aa6, TryCatch #9 {SQLiteException -> 0x0aa6, blocks: (B:409:0x0981, B:417:0x09db, B:418:0x09de, B:420:0x09ef, B:422:0x09fd, B:424:0x0a03, B:426:0x0a3c, B:428:0x0a39, B:431:0x0a3f, B:433:0x0a49, B:435:0x0a57, B:437:0x0a87, B:448:0x0aa5, B:447:0x0aa2, B:443:0x0a9d, B:411:0x099d, B:412:0x09b5, B:414:0x09bb), top: B:408:0x0981, inners: #0, #24 }] */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v11 */
    /* JADX WARN: Type inference failed for: r22v15 */
    /* JADX WARN: Type inference failed for: r22v17 */
    /* JADX WARN: Type inference failed for: r22v18 */
    /* JADX WARN: Type inference failed for: r22v19 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v21 */
    /* JADX WARN: Type inference failed for: r22v22 */
    /* JADX WARN: Type inference failed for: r22v23 */
    /* JADX WARN: Type inference failed for: r22v24 */
    /* JADX WARN: Type inference failed for: r22v25, types: [int] */
    /* JADX WARN: Type inference failed for: r22v26 */
    /* JADX WARN: Type inference failed for: r22v27 */
    /* JADX WARN: Type inference failed for: r22v28 */
    /* JADX WARN: Type inference failed for: r22v29 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v30 */
    /* JADX WARN: Type inference failed for: r22v31 */
    /* JADX WARN: Type inference failed for: r22v32 */
    /* JADX WARN: Type inference failed for: r22v35 */
    /* JADX WARN: Type inference failed for: r22v36 */
    /* JADX WARN: Type inference failed for: r22v37 */
    /* JADX WARN: Type inference failed for: r22v38 */
    /* JADX WARN: Type inference failed for: r22v39 */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Type inference failed for: r22v40 */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(defpackage.byln r45) {
        /*
            Method dump skipped, instructions count: 2747
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cobalt.service.ObservationGenerationTask.a(byln):int");
    }
}
