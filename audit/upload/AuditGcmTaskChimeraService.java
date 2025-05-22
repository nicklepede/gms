package com.google.android.gms.audit.upload;

import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AuditGcmTaskChimeraService extends GmsTaskChimeraService {
    /* JADX WARN: Can't wrap try/catch for region: R(27:8|(1:10)|11|(1:13)|14|(1:16)(1:84)|17|(5:(21:23|24|(1:26)|27|(1:29)|30|(1:32)|33|34|35|(1:37)|38|(1:40)|41|42|43|44|45|46|48|49)|45|46|48|49)|68|(2:69|(5:71|72|73|75|(1:77)(2:79|80))(2:82|83))|78|24|(0)|27|(0)|30|(0)|33|34|35|(0)|38|(0)|41|42|43|44) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:(21:23|24|(1:26)|27|(1:29)|30|(1:32)|33|34|35|(1:37)|38|(1:40)|41|42|43|44|45|46|48|49)|45|46|48|49) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0126, code lost:
    
        r6.b(false, r12.h(), false, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0132, code lost:
    
        if (defpackage.wjg.a(r0) != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0120, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0125, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0143, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a4 A[Catch: all -> 0x0155, LevelDbException -> 0x015d, TryCatch #3 {LevelDbException -> 0x015d, blocks: (B:3:0x0035, B:6:0x0041, B:8:0x0049, B:10:0x004f, B:11:0x0051, B:13:0x0055, B:14:0x0057, B:16:0x005b, B:17:0x0062, B:19:0x006a, B:24:0x00a0, B:26:0x00a4, B:27:0x00a6, B:29:0x00b7, B:30:0x00b9, B:32:0x00bd, B:68:0x0075, B:69:0x0081, B:71:0x0087, B:78:0x009b, B:84:0x0060), top: B:2:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7 A[Catch: all -> 0x0155, LevelDbException -> 0x015d, TryCatch #3 {LevelDbException -> 0x015d, blocks: (B:3:0x0035, B:6:0x0041, B:8:0x0049, B:10:0x004f, B:11:0x0051, B:13:0x0055, B:14:0x0057, B:16:0x005b, B:17:0x0062, B:19:0x006a, B:24:0x00a0, B:26:0x00a4, B:27:0x00a6, B:29:0x00b7, B:30:0x00b9, B:32:0x00bd, B:68:0x0075, B:69:0x0081, B:71:0x0087, B:78:0x009b, B:84:0x0060), top: B:2:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd A[Catch: all -> 0x0155, LevelDbException -> 0x015d, TRY_LEAVE, TryCatch #3 {LevelDbException -> 0x015d, blocks: (B:3:0x0035, B:6:0x0041, B:8:0x0049, B:10:0x004f, B:11:0x0051, B:13:0x0055, B:14:0x0057, B:16:0x005b, B:17:0x0062, B:19:0x006a, B:24:0x00a0, B:26:0x00a4, B:27:0x00a6, B:29:0x00b7, B:30:0x00b9, B:32:0x00bd, B:68:0x0075, B:69:0x0081, B:71:0x0087, B:78:0x009b, B:84:0x0060), top: B:2:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5 A[Catch: LevelDbException -> 0x0143, all -> 0x0155, TryCatch #4 {all -> 0x0155, blocks: (B:3:0x0035, B:6:0x0041, B:8:0x0049, B:10:0x004f, B:11:0x0051, B:13:0x0055, B:14:0x0057, B:16:0x005b, B:17:0x0062, B:19:0x006a, B:24:0x00a0, B:26:0x00a4, B:27:0x00a6, B:29:0x00b7, B:30:0x00b9, B:32:0x00bd, B:35:0x00c0, B:37:0x00d5, B:38:0x00d8, B:40:0x00ee, B:41:0x00f1, B:43:0x010d, B:46:0x0116, B:49:0x0135, B:56:0x0126, B:68:0x0075, B:69:0x0081, B:71:0x0087, B:73:0x008d, B:78:0x009b, B:84:0x0060, B:87:0x0145, B:89:0x014d), top: B:2:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ee A[Catch: LevelDbException -> 0x0143, all -> 0x0155, TryCatch #4 {all -> 0x0155, blocks: (B:3:0x0035, B:6:0x0041, B:8:0x0049, B:10:0x004f, B:11:0x0051, B:13:0x0055, B:14:0x0057, B:16:0x005b, B:17:0x0062, B:19:0x006a, B:24:0x00a0, B:26:0x00a4, B:27:0x00a6, B:29:0x00b7, B:30:0x00b9, B:32:0x00bd, B:35:0x00c0, B:37:0x00d5, B:38:0x00d8, B:40:0x00ee, B:41:0x00f1, B:43:0x010d, B:46:0x0116, B:49:0x0135, B:56:0x0126, B:68:0x0075, B:69:0x0081, B:71:0x0087, B:73:0x008d, B:78:0x009b, B:84:0x0060, B:87:0x0145, B:89:0x014d), top: B:2:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0135 A[SYNTHETIC] */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(defpackage.cauf r20) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.audit.upload.AuditGcmTaskChimeraService.a(cauf):int");
    }
}
