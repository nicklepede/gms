package com.google.android.gms.ads.cache.io;

import java.io.OutputStream;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
final class a implements Runnable {
    final /* synthetic */ b a;
    private final OutputStream b;
    private final String c;
    private final int d;

    public a(b bVar, String str, OutputStream outputStream, int i) {
        this.a = bVar;
        this.c = str;
        this.d = i;
        this.b = outputStream;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a6, code lost:
    
        r0 = r9.getResponseCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ad, code lost:
    
        if ((r0 / 100) == 2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00af, code lost:
    
        r0 = defpackage.a.F(r4, r0, "Received bad status code, ", ", when downloading ", ".");
        r5 = com.google.android.gms.ads.internal.util.c.a;
        com.google.android.gms.ads.internal.util.client.h.k(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00be, code lost:
    
        defpackage.asra.c(r9);
        r0 = r12.a;
        r0.a(r4, -2);
        r0.b(r4, false);
        defpackage.aspm.b(r12.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ce, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cf, code lost:
    
        r5 = r9.getContentLength();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d8, code lost:
    
        if (r5 >= 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00de, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 24) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e0, code lost:
    
        r5 = r9.getContentLengthLong();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e4, code lost:
    
        r0 = r12.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e8, code lost:
    
        if (r5 < 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ec, code lost:
    
        r0.a(r4, r5);
        r5 = r9.getInputStream();
        r6 = r12.b;
        defpackage.aspm.i(r5, r6, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f8, code lost:
    
        defpackage.asra.c(r9);
        r0.a(r4, -2);
        r0.b(r4, true);
        defpackage.aspm.b(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0104, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00eb, code lost:
    
        r5 = -2;
     */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0138: MOVE (r0 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]) (LINE:313), block:B:61:0x0137 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.cache.io.a.run():void");
    }
}
