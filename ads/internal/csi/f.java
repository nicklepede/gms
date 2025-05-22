package com.google.android.gms.ads.internal.csi;

import android.text.TextUtils;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class f extends g {
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        if (r0 != r6.length()) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.lang.String b(java.lang.String r6) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L7
            goto L37
        L7:
            int r0 = r6.length()
            r1 = 0
            r2 = r1
        Ld:
            int r3 = r6.length()
            r4 = 44
            if (r2 >= r3) goto L1e
            char r3 = r6.charAt(r2)
            if (r3 != r4) goto L1e
            int r2 = r2 + 1
            goto Ld
        L1e:
            if (r0 <= 0) goto L2a
            int r3 = r0 + (-1)
            char r5 = r6.charAt(r3)
            if (r5 != r4) goto L2a
            r0 = r3
            goto L1e
        L2a:
            if (r0 >= r2) goto L2e
            r6 = 0
            return r6
        L2e:
            if (r2 != 0) goto L38
            int r2 = r6.length()
            if (r0 == r2) goto L37
            goto L39
        L37:
            return r6
        L38:
            r1 = r2
        L39:
            java.lang.String r6 = r6.substring(r1, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.csi.f.b(java.lang.String):java.lang.String");
    }

    @Override // com.google.android.gms.ads.internal.csi.g
    public final String a(String str, String str2) {
        String b = b(str);
        String b2 = b(str2);
        return TextUtils.isEmpty(b) ? b2 : TextUtils.isEmpty(b2) ? b : defpackage.a.p(b2, b, ",");
    }
}
