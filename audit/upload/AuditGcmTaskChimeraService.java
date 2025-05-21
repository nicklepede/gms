package com.google.android.gms.audit.upload;

import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AuditGcmTaskChimeraService extends GmsTaskChimeraService {
    /* JADX WARN: Can't wrap try/catch for region: R(27:8|(1:10)|11|(1:13)|14|(1:16)(1:84)|17|(5:(21:23|24|(1:26)|27|(1:29)|30|(1:32)|33|34|35|(1:37)|38|(1:40)|41|42|43|44|45|46|48|49)|45|46|48|49)|68|(2:69|(5:71|72|73|75|(1:77)(2:79|80))(2:82|83))|78|24|(0)|27|(0)|30|(0)|33|34|35|(0)|38|(0)|41|42|43|44) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:(21:23|24|(1:26)|27|(1:29)|30|(1:32)|33|34|35|(1:37)|38|(1:40)|41|42|43|44|45|46|48|49)|45|46|48|49) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0128, code lost:
    
        r6.b(false, r12.h(), false, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0134, code lost:
    
        if (defpackage.unh.a(r0) != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0120, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0126, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0127, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0145, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6 A[Catch: all -> 0x0157, LevelDbException -> 0x015f, TryCatch #4 {all -> 0x0157, blocks: (B:3:0x0037, B:6:0x0043, B:8:0x004b, B:10:0x0051, B:11:0x0053, B:13:0x0057, B:14:0x0059, B:16:0x005d, B:17:0x0064, B:19:0x006c, B:24:0x00a2, B:26:0x00a6, B:27:0x00a8, B:29:0x00b9, B:30:0x00bb, B:32:0x00bf, B:35:0x00c2, B:37:0x00d7, B:38:0x00da, B:40:0x00f0, B:41:0x00f3, B:43:0x010f, B:46:0x0118, B:49:0x0137, B:56:0x0128, B:68:0x0077, B:69:0x0083, B:71:0x0089, B:73:0x008f, B:78:0x009d, B:84:0x0062, B:87:0x0147, B:89:0x014f), top: B:2:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b9 A[Catch: all -> 0x0157, LevelDbException -> 0x015f, TryCatch #4 {all -> 0x0157, blocks: (B:3:0x0037, B:6:0x0043, B:8:0x004b, B:10:0x0051, B:11:0x0053, B:13:0x0057, B:14:0x0059, B:16:0x005d, B:17:0x0064, B:19:0x006c, B:24:0x00a2, B:26:0x00a6, B:27:0x00a8, B:29:0x00b9, B:30:0x00bb, B:32:0x00bf, B:35:0x00c2, B:37:0x00d7, B:38:0x00da, B:40:0x00f0, B:41:0x00f3, B:43:0x010f, B:46:0x0118, B:49:0x0137, B:56:0x0128, B:68:0x0077, B:69:0x0083, B:71:0x0089, B:73:0x008f, B:78:0x009d, B:84:0x0062, B:87:0x0147, B:89:0x014f), top: B:2:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf A[Catch: all -> 0x0157, LevelDbException -> 0x015f, TRY_LEAVE, TryCatch #4 {all -> 0x0157, blocks: (B:3:0x0037, B:6:0x0043, B:8:0x004b, B:10:0x0051, B:11:0x0053, B:13:0x0057, B:14:0x0059, B:16:0x005d, B:17:0x0064, B:19:0x006c, B:24:0x00a2, B:26:0x00a6, B:27:0x00a8, B:29:0x00b9, B:30:0x00bb, B:32:0x00bf, B:35:0x00c2, B:37:0x00d7, B:38:0x00da, B:40:0x00f0, B:41:0x00f3, B:43:0x010f, B:46:0x0118, B:49:0x0137, B:56:0x0128, B:68:0x0077, B:69:0x0083, B:71:0x0089, B:73:0x008f, B:78:0x009d, B:84:0x0062, B:87:0x0147, B:89:0x014f), top: B:2:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d7 A[Catch: LevelDbException -> 0x0145, all -> 0x0157, TryCatch #4 {all -> 0x0157, blocks: (B:3:0x0037, B:6:0x0043, B:8:0x004b, B:10:0x0051, B:11:0x0053, B:13:0x0057, B:14:0x0059, B:16:0x005d, B:17:0x0064, B:19:0x006c, B:24:0x00a2, B:26:0x00a6, B:27:0x00a8, B:29:0x00b9, B:30:0x00bb, B:32:0x00bf, B:35:0x00c2, B:37:0x00d7, B:38:0x00da, B:40:0x00f0, B:41:0x00f3, B:43:0x010f, B:46:0x0118, B:49:0x0137, B:56:0x0128, B:68:0x0077, B:69:0x0083, B:71:0x0089, B:73:0x008f, B:78:0x009d, B:84:0x0062, B:87:0x0147, B:89:0x014f), top: B:2:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f0 A[Catch: LevelDbException -> 0x0145, all -> 0x0157, TryCatch #4 {all -> 0x0157, blocks: (B:3:0x0037, B:6:0x0043, B:8:0x004b, B:10:0x0051, B:11:0x0053, B:13:0x0057, B:14:0x0059, B:16:0x005d, B:17:0x0064, B:19:0x006c, B:24:0x00a2, B:26:0x00a6, B:27:0x00a8, B:29:0x00b9, B:30:0x00bb, B:32:0x00bf, B:35:0x00c2, B:37:0x00d7, B:38:0x00da, B:40:0x00f0, B:41:0x00f3, B:43:0x010f, B:46:0x0118, B:49:0x0137, B:56:0x0128, B:68:0x0077, B:69:0x0083, B:71:0x0089, B:73:0x008f, B:78:0x009d, B:84:0x0062, B:87:0x0147, B:89:0x014f), top: B:2:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0137 A[SYNTHETIC] */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(defpackage.byln r20) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.audit.upload.AuditGcmTaskChimeraService.a(byln):int");
    }
}
