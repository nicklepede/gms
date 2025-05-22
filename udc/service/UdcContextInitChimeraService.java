package com.google.android.gms.udc.service;

import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.djlb;
import defpackage.eluq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class UdcContextInitChimeraService extends GmsTaskChimeraService {
    private static final eluq a = djlb.c();

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:2|3)|(7:5|6|7|8|9|10|11)|17|6|7|8|9|10|11) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0079, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007a, code lost:
    
        com.google.android.gms.udc.service.UdcContextInitChimeraService.a.i().s(r5).ai(11860).x("context manager (un)subscription failed");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean d(android.content.Context r5, android.accounts.Account r6) {
        /*
            java.lang.String r0 = "com.google.android.gms.udc.intentoperation.UdcContextListenerIntentOperation"
            java.lang.String r1 = "com.google.android.gms.udc.CONTEXT_CHANGED"
            android.content.Intent r0 = com.google.android.chimera.IntentOperation.getStartIntent(r5, r0, r1)
            java.lang.String r1 = "UdcAccountName"
            java.lang.String r2 = r6.name
            r0.putExtra(r1, r2)
            avrx r1 = new avrx
            r1.<init>()
            r2 = 10002(0x2712, float:1.4016E-41)
            r1.b(r2)
            r1.a()
            java.lang.String r1 = r6.name     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = defpackage.wkg.e(r5, r1)     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = defpackage.djms.b(r5, r1)     // Catch: java.lang.Throwable -> L31
            boolean r2 = defpackage.auur.d(r1)     // Catch: java.lang.Throwable -> L31
            if (r2 != 0) goto L31
            int r1 = r1.hashCode()     // Catch: java.lang.Throwable -> L31
            goto L35
        L31:
            int r1 = r6.hashCode()
        L35:
            r2 = 0
            android.app.PendingIntent r0 = android.app.PendingIntent.getService(r5, r1, r0, r2)
            ajgv r1 = defpackage.ajgv.c(r6)
            aszs r3 = defpackage.ajgu.a
            atad r3 = new atad
            r4 = 0
            r3.<init>(r5, r1, r4)
            eluq r5 = com.google.android.gms.udc.service.UdcContextInitChimeraService.a     // Catch: java.lang.InterruptedException -> L75 java.util.concurrent.TimeoutException -> L77 java.util.concurrent.ExecutionException -> L79
            eltz r5 = r5.h()     // Catch: java.lang.InterruptedException -> L75 java.util.concurrent.TimeoutException -> L77 java.util.concurrent.ExecutionException -> L79
            r1 = 11858(0x2e52, float:1.6617E-41)
            eltz r5 = r5.ai(r1)     // Catch: java.lang.InterruptedException -> L75 java.util.concurrent.TimeoutException -> L77 java.util.concurrent.ExecutionException -> L79
            java.lang.String r1 = "Unregistering with contextmanager"
            r5.x(r1)     // Catch: java.lang.InterruptedException -> L75 java.util.concurrent.TimeoutException -> L77 java.util.concurrent.ExecutionException -> L79
            atah r5 = r3.D     // Catch: java.lang.InterruptedException -> L75 java.util.concurrent.TimeoutException -> L77 java.util.concurrent.ExecutionException -> L79
            aszs r1 = defpackage.avsj.a     // Catch: java.lang.InterruptedException -> L75 java.util.concurrent.TimeoutException -> L77 java.util.concurrent.ExecutionException -> L79
            defpackage.atzb.s(r0)     // Catch: java.lang.InterruptedException -> L75 java.util.concurrent.TimeoutException -> L77 java.util.concurrent.ExecutionException -> L79
            avsi r1 = new avsi     // Catch: java.lang.InterruptedException -> L75 java.util.concurrent.TimeoutException -> L77 java.util.concurrent.ExecutionException -> L79
            r1.<init>(r5, r0)     // Catch: java.lang.InterruptedException -> L75 java.util.concurrent.TimeoutException -> L77 java.util.concurrent.ExecutionException -> L79
            r5.d(r1)     // Catch: java.lang.InterruptedException -> L75 java.util.concurrent.TimeoutException -> L77 java.util.concurrent.ExecutionException -> L79
            dhlw r5 = defpackage.atyv.c(r1)     // Catch: java.lang.InterruptedException -> L75 java.util.concurrent.TimeoutException -> L77 java.util.concurrent.ExecutionException -> L79
            long r0 = defpackage.fvll.b()     // Catch: java.lang.InterruptedException -> L75 java.util.concurrent.TimeoutException -> L77 java.util.concurrent.ExecutionException -> L79
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> L75 java.util.concurrent.TimeoutException -> L77 java.util.concurrent.ExecutionException -> L79
            defpackage.dhmr.o(r5, r0, r3)     // Catch: java.lang.InterruptedException -> L75 java.util.concurrent.TimeoutException -> L77 java.util.concurrent.ExecutionException -> L79
            r2 = 1
            goto L8f
        L75:
            r5 = move-exception
            goto L7a
        L77:
            r5 = move-exception
            goto L7a
        L79:
            r5 = move-exception
        L7a:
            eluq r0 = com.google.android.gms.udc.service.UdcContextInitChimeraService.a
            eltz r0 = r0.i()
            eltz r5 = r0.s(r5)
            r0 = 11860(0x2e54, float:1.662E-41)
            eltz r5 = r5.ai(r0)
            java.lang.String r0 = "context manager (un)subscription failed"
            r5.x(r0)
        L8f:
            java.lang.String r5 = r6.name
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.udc.service.UdcContextInitChimeraService.d(android.content.Context, android.accounts.Account):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0145 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x007f  */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(defpackage.cauf r12) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.udc.service.UdcContextInitChimeraService.a(cauf):int");
    }
}
