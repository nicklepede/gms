package com.google.android.gms.wallet.intentoperation;

import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class CrashReportIntentOperation extends IntentOperation {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
    @Override // com.google.android.chimera.IntentOperation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onHandleIntent(android.content.Intent r15) {
        /*
            r14 = this;
            java.lang.String r0 = "com.google.android.gms.wallet.CRASH_LOG"
            java.lang.String r15 = r15.getStringExtra(r0)
            auqz r0 = defpackage.aura.a
            java.nio.charset.Charset r0 = com.google.android.gms.wallet.dynamite.logging.d.a
            java.lang.String r0 = "/"
            java.lang.String[] r0 = r15.split(r0)
            int r1 = r0.length
            java.lang.String r2 = "\n"
            r3 = 0
            r4 = 2
            if (r1 > r4) goto L18
            goto L5f
        L18:
            r1 = 0
            r1 = r0[r1]
            java.lang.String r5 = "UTF8-BASE64-TRACE:"
            boolean r5 = r1.startsWith(r5)
            if (r5 == 0) goto L3e
            r5 = 18
            java.lang.String r5 = r1.substring(r5)     // Catch: java.lang.Exception -> L37
            r6 = 10
            byte[] r5 = android.util.Base64.decode(r5, r6)     // Catch: java.lang.Exception -> L37
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Exception -> L37
            java.nio.charset.Charset r7 = com.google.android.gms.wallet.dynamite.logging.d.a     // Catch: java.lang.Exception -> L37
            r6.<init>(r5, r7)     // Catch: java.lang.Exception -> L37
            goto L44
        L37:
            java.lang.String r5 = "CrashBin"
            java.lang.String r6 = "Failed to decode encoded trace."
            android.util.Log.e(r5, r6)
        L3e:
            java.lang.String r5 = "@"
            java.lang.String r6 = r1.replaceAll(r5, r2)
        L44:
            r8 = r6
            r1 = 1
            r1 = r0[r1]
            long r10 = com.google.android.gms.wallet.dynamite.logging.d.a(r1)
            r1 = r0[r4]
            long r12 = com.google.android.gms.wallet.dynamite.logging.d.a(r1)
            int r1 = r0.length
            r4 = 3
            if (r1 <= r4) goto L58
            r3 = r0[r4]
        L58:
            r9 = r3
            com.google.android.gms.wallet.dynamite.logging.d r7 = new com.google.android.gms.wallet.dynamite.logging.d
            r7.<init>(r8, r9, r10, r12)
            r3 = r7
        L5f:
            java.lang.String r0 = "CrashReportIntentOperat"
            if (r3 != 0) goto L71
            java.lang.String r15 = java.lang.String.valueOf(r15)
            java.lang.String r1 = "Uncaught exception: "
            java.lang.String r15 = r1.concat(r15)
            android.util.Log.e(r0, r15)
            return
        L71:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r1 = "Uncaught exception:\nPackage name: "
            r15.<init>(r1)
            java.lang.String r1 = r3.c
            r15.append(r1)
            r15.append(r2)
            java.lang.String r1 = r3.b
            r15.append(r1)
            java.lang.String r15 = r15.toString()
            android.util.Log.e(r0, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wallet.intentoperation.CrashReportIntentOperation.onHandleIntent(android.content.Intent):void");
    }
}
