package com.google.android.gms.chimera.container.zapp;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class WaitDownloadCompleteOperation extends IntentOperation {
    public static Intent a(Context context) {
        return IntentOperation.getStartIntent(context, WaitDownloadCompleteOperation.class, "com.google.android.gms.chimera.action.WAIT_DOWNLOAD_COMPLETE");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        if (r2.a().await(r3, java.util.concurrent.TimeUnit.SECONDS) == false) goto L11;
     */
    @Override // com.google.android.chimera.IntentOperation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onHandleIntent(android.content.Intent r7) {
        /*
            r6 = this;
            aqjn r7 = defpackage.aqjn.a(r6)
            r7.e()
            boolean r7 = defpackage.fpxv.g()
            if (r7 == 0) goto L1a
            aqik r7 = defpackage.aqik.a(r6)
            android.content.Context r7 = r7.b
            aqhp r7 = defpackage.aqhp.a(r7)
            r7.c()
        L1a:
            long r0 = java.lang.System.currentTimeMillis()
            aqjc r7 = defpackage.aqjc.f(r6)
            aqja r2 = r7.h
            long r3 = defpackage.fpxv.b()
            java.util.concurrent.CountDownLatch r2 = r2.a()
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L35
            boolean r2 = r2.await(r3, r5)     // Catch: java.lang.InterruptedException -> L35
            if (r2 != 0) goto L4e
            goto L43
        L35:
            r2 = move-exception
            ausn r3 = defpackage.aqjc.c
            eltz r3 = r3.i()
            eluo r3 = (defpackage.eluo) r3
            java.lang.String r4 = "Interrupted while waiting for downloads: %s"
            r3.B(r4, r2)
        L43:
            android.content.Context r7 = r7.f
            aqfq r2 = defpackage.aqfq.e()
            r3 = 60
            r2.a(r7, r3)
        L4e:
            boolean r7 = defpackage.fpxv.g()
            if (r7 == 0) goto L90
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            long r0 = defpackage.fpxv.b()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r4
            aqhp r7 = defpackage.aqhp.a(r6)
            long r0 = r0 - r2
            r2 = 1
            long r0 = java.lang.Math.max(r2, r0)
            java.util.concurrent.CountDownLatch r2 = r7.b     // Catch: java.lang.InterruptedException -> L76
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> L76
            boolean r0 = r2.await(r0, r3)     // Catch: java.lang.InterruptedException -> L76
            if (r0 != 0) goto L90
            goto L85
        L76:
            r0 = move-exception
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            java.lang.String r1 = "ChimeraSplitInstllr"
            java.lang.String r2 = "Interrupted while waiting for all split downloads to complete."
            android.util.Log.e(r1, r2, r0)
        L85:
            android.content.Context r7 = r7.a
            aqfq r0 = defpackage.aqfq.e()
            r1 = 130(0x82, float:1.82E-43)
            r0.a(r7, r1)
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.chimera.container.zapp.WaitDownloadCompleteOperation.onHandleIntent(android.content.Intent):void");
    }
}
