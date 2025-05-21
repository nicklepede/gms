package com.google.android.gms.semanticlocationhistory.monitoring;

import android.content.Context;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.asej;
import defpackage.asot;
import defpackage.czje;
import defpackage.czjg;
import defpackage.czlk;
import defpackage.dade;
import defpackage.dadh;
import defpackage.daga;
import defpackage.dahq;
import defpackage.dbeb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class MonitoringService extends GmsTaskBoundService {
    public static final String a = "com.google.android.gms.semanticlocationhistory.monitoring.MonitoringService";
    private static final asot b = asot.c("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY, "MonitoringService");
    private czjg c;
    private dade d;
    private daga e;
    private dbeb f;
    private czlk g;
    private dahq h;

    private final czlk e() {
        if (this.g == null) {
            this.g = new czlk(new czje());
        }
        return this.g;
    }

    private final dade f(Context context) {
        if (this.d == null) {
            this.d = dadh.w(context);
        }
        return this.d;
    }

    private final void g() {
        if (this.e == null) {
            this.e = new daga();
        }
    }

    public final czjg d() {
        if (this.c == null) {
            this.c = czjg.a();
        }
        return this.c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:195|196|540|209|210|211|(7:212|213|214|215|5a2|225|226)|227|(6:(36:(7:228|229|231|232|233|5fb|243)|258|259|(1:261)|262|263|(2:265|(2:267|(2:269|270))(2:377|(1:379)(2:380|(1:382)(2:383|384))))(2:385|786)|271|(1:273)|274|(1:276)|277|(1:279)|280|(1:282)|283|(3:285|(1:287)|288)|289|(3:291|(1:293)|294)|295|(3:297|(1:299)|300)|301|(1:303)|304|(3:306|(1:308)|309)|310|(3:312|(1:314)|315)|(3:317|(1:319)|320)|(3:322|(1:324)|325)|(3:327|(1:329)|330)|331|(7:332|333|(1:335)|336|947|341|(3:365|(1:367)|368)(1:343))|344|(1:346)|347|(6:349|(1:351)|352|9db|357|358)(2:363|364))|253|254|255|256|257)|244|245|246|247|248|249|250|251|252) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:(36:(7:228|229|231|232|233|5fb|243)|258|259|(1:261)|262|263|(2:265|(2:267|(2:269|270))(2:377|(1:379)(2:380|(1:382)(2:383|384))))(2:385|786)|271|(1:273)|274|(1:276)|277|(1:279)|280|(1:282)|283|(3:285|(1:287)|288)|289|(3:291|(1:293)|294)|295|(3:297|(1:299)|300)|301|(1:303)|304|(3:306|(1:308)|309)|310|(3:312|(1:314)|315)|(3:317|(1:319)|320)|(3:322|(1:324)|325)|(3:327|(1:329)|330)|331|(7:332|333|(1:335)|336|947|341|(3:365|(1:367)|368)(1:343))|344|(1:346)|347|(6:349|(1:351)|352|9db|357|358)(2:363|364))|253|254|255|256|257) */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x00f8, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x00f6, code lost:
    
        if (e().h().containsKey(r14.name) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e1, code lost:
    
        if (j$.util.DesugarCollections.unmodifiableMap(e().g().c).containsKey(r14.name) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00fa, code lost:
    
        r3 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x0712, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x071d, code lost:
    
        ((defpackage.dadh) r33).E("DataProvider could not execute getEditedSegmentsCount", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x0726, code lost:
    
        ((defpackage.dadh) r33).D();
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x071a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x071b, code lost:
    
        r33 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x0714, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0715, code lost:
    
        r33 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x06ae, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x06af, code lost:
    
        r19 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x06b1, code lost:
    
        r28 = r4;
        ((defpackage.dadh) r19).E("DataProvider could not execute getInferredSegmentsCount", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x06bc, code lost:
    
        r4 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x0a14, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x0a16, code lost:
    
        ((defpackage.dadh) r19).D();
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0a1d, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x06a8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x06a9, code lost:
    
        r19 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x0678, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x0679, code lost:
    
        r19 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x067b, code lost:
    
        r20 = r4;
        ((defpackage.dadh) r19).E("DataProvider could not execute getAvailableSpace", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x0686, code lost:
    
        ((defpackage.dadh) r19).D();
        r4 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x0a1e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x0a20, code lost:
    
        ((defpackage.dadh) r19).D();
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x0a27, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x0672, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x0673, code lost:
    
        r19 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x06f9 A[Catch: SQLiteException -> 0x0712, all -> 0x0a09, TRY_ENTER, TRY_LEAVE, TryCatch #23 {all -> 0x0a09, blocks: (B:257:0x06de, B:261:0x06f9, B:426:0x0711, B:425:0x070e, B:429:0x071d), top: B:253:0x06c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x081e  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0836  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0849  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0862  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x087d  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x089c  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x08cd  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x08e8  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0901  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x093a A[Catch: InterruptedException | ExecutionException -> 0x0983, TryCatch #2 {InterruptedException | ExecutionException -> 0x0983, blocks: (B:333:0x0936, B:335:0x093a, B:336:0x0941, B:337:0x0947, B:341:0x0958, B:341:0x0958, B:365:0x0969, B:365:0x0969, B:367:0x0971, B:367:0x0971, B:368:0x0974, B:368:0x0974, B:372:0x0982, B:372:0x0982), top: B:332:0x0936 }] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0948 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0388  */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v13, types: [int] */
    /* JADX WARN: Type inference failed for: r17v14 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r33v1, types: [int] */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r33v4 */
    /* JADX WARN: Type inference failed for: r4v25, types: [czlu] */
    /* JADX WARN: Type inference failed for: r5v66, types: [eynd] */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.enss im(defpackage.byln r33) {
        /*
            Method dump skipped, instructions count: 2600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.semanticlocationhistory.monitoring.MonitoringService.im(byln):enss");
    }
}
