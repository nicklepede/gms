package com.google.android.gms.wallet;

import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class GcmReceiverChimeraService extends TracingIntentService {
    public GcmReceiverChimeraService() {
        super("WalletGcmReceiver");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae A[Catch: all -> 0x00d1, TryCatch #2 {all -> 0x00d1, blocks: (B:3:0x0002, B:7:0x0014, B:10:0x001c, B:11:0x0036, B:13:0x003c, B:15:0x0045, B:16:0x0047, B:20:0x004d, B:22:0x0053, B:24:0x0057, B:25:0x0059, B:27:0x0061, B:29:0x006f, B:31:0x0071, B:32:0x0079, B:34:0x007d, B:35:0x007f, B:41:0x00aa, B:43:0x00ae, B:45:0x00bf, B:48:0x00b8, B:49:0x00a3, B:52:0x009c, B:55:0x008b, B:65:0x00c6, B:68:0x00cc), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bf A[Catch: all -> 0x00d1, TryCatch #2 {all -> 0x00d1, blocks: (B:3:0x0002, B:7:0x0014, B:10:0x001c, B:11:0x0036, B:13:0x003c, B:15:0x0045, B:16:0x0047, B:20:0x004d, B:22:0x0053, B:24:0x0057, B:25:0x0059, B:27:0x0061, B:29:0x006f, B:31:0x0071, B:32:0x0079, B:34:0x007d, B:35:0x007f, B:41:0x00aa, B:43:0x00ae, B:45:0x00bf, B:48:0x00b8, B:49:0x00a3, B:52:0x009c, B:55:0x008b, B:65:0x00c6, B:68:0x00cc), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8 A[Catch: all -> 0x00d1, TryCatch #2 {all -> 0x00d1, blocks: (B:3:0x0002, B:7:0x0014, B:10:0x001c, B:11:0x0036, B:13:0x003c, B:15:0x0045, B:16:0x0047, B:20:0x004d, B:22:0x0053, B:24:0x0057, B:25:0x0059, B:27:0x0061, B:29:0x006f, B:31:0x0071, B:32:0x0079, B:34:0x007d, B:35:0x007f, B:41:0x00aa, B:43:0x00ae, B:45:0x00bf, B:48:0x00b8, B:49:0x00a3, B:52:0x009c, B:55:0x008b, B:65:0x00c6, B:68:0x00cc), top: B:2:0x0002 }] */
    @Override // com.google.android.gms.framework.tracing.wrapper.TracingIntentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void a(android.content.Intent r14) {
        /*
            r13 = this;
            java.lang.String r0 = "serverPushMessageBase64"
            fwac r1 = defpackage.fwac.a     // Catch: java.lang.Throwable -> Ld1
            fwad r1 = r1.lK()     // Catch: java.lang.Throwable -> Ld1
            boolean r1 = r1.a()     // Catch: java.lang.Throwable -> Ld1
            if (r1 != 0) goto L10
            goto Ld1
        L10:
            java.lang.String r1 = "WalletGcmReceiver"
            if (r14 == 0) goto Lcc
            boolean r2 = r14.hasExtra(r0)     // Catch: java.lang.Throwable -> Ld1
            if (r2 != 0) goto L1c
            goto Lcc
        L1c:
            java.lang.String r14 = r14.getStringExtra(r0)     // Catch: defpackage.fgsd -> Lc3 java.lang.IllegalArgumentException -> Lc5 java.lang.Throwable -> Ld1
            r0 = 2
            byte[] r14 = android.util.Base64.decode(r14, r0)     // Catch: defpackage.fgsd -> Lc3 java.lang.IllegalArgumentException -> Lc5 java.lang.Throwable -> Ld1
            fgqp r2 = defpackage.fgqp.a()     // Catch: defpackage.fgsd -> Lc3 java.lang.IllegalArgumentException -> Lc5 java.lang.Throwable -> Ld1
            ekqd r3 = defpackage.ekqd.a     // Catch: defpackage.fgsd -> Lc3 java.lang.IllegalArgumentException -> Lc5 java.lang.Throwable -> Ld1
            int r4 = r14.length     // Catch: defpackage.fgsd -> Lc3 java.lang.IllegalArgumentException -> Lc5 java.lang.Throwable -> Ld1
            r5 = 0
            fgri r14 = defpackage.fgri.y(r3, r14, r5, r4, r2)     // Catch: defpackage.fgsd -> Lc3 java.lang.IllegalArgumentException -> Lc5 java.lang.Throwable -> Ld1
            defpackage.fgri.M(r14)     // Catch: defpackage.fgsd -> Lc3 java.lang.IllegalArgumentException -> Lc5 java.lang.Throwable -> Ld1
            ekqd r14 = (defpackage.ekqd) r14     // Catch: defpackage.fgsd -> Lc3 java.lang.IllegalArgumentException -> Lc5 java.lang.Throwable -> Ld1
            int r2 = r14.b     // Catch: java.lang.Throwable -> Ld1
            r3 = 1
            r2 = r2 & r3
            if (r2 == 0) goto L4d
            int r2 = defpackage.dkwc.a(r13)     // Catch: java.lang.Throwable -> Ld1
            long r6 = (long) r2     // Catch: java.lang.Throwable -> Ld1
            ekqc r2 = r14.e     // Catch: java.lang.Throwable -> Ld1
            if (r2 != 0) goto L47
            ekqc r2 = defpackage.ekqc.a     // Catch: java.lang.Throwable -> Ld1
        L47:
            long r8 = r2.c     // Catch: java.lang.Throwable -> Ld1
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 < 0) goto Ld1
        L4d:
            int r2 = r14.b     // Catch: java.lang.Throwable -> Ld1
            r2 = r2 & r3
            r4 = 0
            if (r2 == 0) goto La9
            ekqc r2 = r14.e     // Catch: java.lang.Throwable -> Ld1
            if (r2 != 0) goto L59
            ekqc r2 = defpackage.ekqc.a     // Catch: java.lang.Throwable -> Ld1
        L59:
            java.lang.String r2 = r2.b     // Catch: java.lang.Throwable -> Ld1
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> Ld1
            if (r2 != 0) goto La9
            bsup r2 = defpackage.bsup.b(r13)     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r6 = "com.google"
            android.accounts.Account[] r2 = r2.p(r6)     // Catch: java.lang.Throwable -> Ld1
            int r6 = r2.length     // Catch: java.lang.Throwable -> Ld1
            r7 = r5
        L6d:
            if (r7 >= r6) goto L9f
            r8 = r2[r7]     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r9 = r8.name     // Catch: defpackage.wjw -> L88 java.io.IOException -> L8a java.lang.Throwable -> Ld1
            java.lang.String r10 = defpackage.wjx.a     // Catch: defpackage.wjw -> L88 java.io.IOException -> L8a java.lang.Throwable -> Ld1
            java.lang.String r9 = defpackage.wkg.e(r13, r9)     // Catch: defpackage.wjw -> L88 java.io.IOException -> L8a java.lang.Throwable -> Ld1
            ekqc r10 = r14.e     // Catch: java.lang.Throwable -> Ld1
            if (r10 != 0) goto L7f
            ekqc r10 = defpackage.ekqc.a     // Catch: java.lang.Throwable -> Ld1
        L7f:
            java.lang.String r10 = r10.b     // Catch: java.lang.Throwable -> Ld1
            boolean r9 = android.text.TextUtils.equals(r10, r9)     // Catch: java.lang.Throwable -> Ld1
            if (r9 == 0) goto L9c
            goto La0
        L88:
            r9 = move-exception
            goto L8b
        L8a:
            r9 = move-exception
        L8b:
            java.util.Locale r10 = java.util.Locale.US     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r11 = "Failed determining id for account! Skipping account %s"
            java.lang.String r8 = r8.name     // Catch: java.lang.Throwable -> Ld1
            java.lang.Object[] r12 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Ld1
            r12[r5] = r8     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r8 = java.lang.String.format(r10, r11, r12)     // Catch: java.lang.Throwable -> Ld1
            android.util.Log.w(r1, r8, r9)     // Catch: java.lang.Throwable -> Ld1
        L9c:
            int r7 = r7 + 1
            goto L6d
        L9f:
            r8 = r4
        La0:
            if (r8 == 0) goto La3
            goto Laa
        La3:
            java.lang.String r14 = "Failed to find account corresponding to serverMessage!"
            android.util.Log.w(r1, r14)     // Catch: java.lang.Throwable -> Ld1
            goto Ld1
        La9:
            r8 = r4
        Laa:
            int r2 = r14.c     // Catch: java.lang.Throwable -> Ld1
            if (r2 != r0) goto Lb8
            dlkc r4 = new dlkc     // Catch: java.lang.Throwable -> Ld1
            android.content.Context r0 = r13.getApplicationContext()     // Catch: java.lang.Throwable -> Ld1
            r4.<init>(r0, r8, r14)     // Catch: java.lang.Throwable -> Ld1
            goto Lbd
        Lb8:
            java.lang.String r14 = "Could not find a supported specific submessage from ServerPushMessage to handle!"
            android.util.Log.w(r1, r14)     // Catch: java.lang.Throwable -> Ld1
        Lbd:
            if (r4 == 0) goto Ld1
            r4.run()     // Catch: java.lang.Throwable -> Ld1
            goto Ld1
        Lc3:
            r14 = move-exception
            goto Lc6
        Lc5:
            r14 = move-exception
        Lc6:
            java.lang.String r0 = "Failed to parse serverPushMessage"
            android.util.Log.w(r1, r0, r14)     // Catch: java.lang.Throwable -> Ld1
            goto Ld1
        Lcc:
            java.lang.String r14 = "Received GCM intent is either null or does not contain the expected extra!"
            android.util.Log.w(r1, r14)     // Catch: java.lang.Throwable -> Ld1
        Ld1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wallet.GcmReceiverChimeraService.a(android.content.Intent):void");
    }
}
