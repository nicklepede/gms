package com.google.android.gms.gass;

import defpackage.bjwx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class PackageChangeBroadcastReceiverImpl extends bjwx {
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r0.isEmpty() == false) goto L10;
     */
    @Override // defpackage.bjwx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final byte[] a(android.content.Intent r5, android.content.Context r6) {
        /*
            r4 = this;
            android.net.Uri r0 = r5.getData()
            r1 = 0
            if (r0 == 0) goto L14
            java.lang.String r0 = r0.getSchemeSpecificPart()
            if (r0 == 0) goto L3a
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L3a
            goto L15
        L14:
            r0 = r1
        L15:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            if (r2 < r3) goto L3b
            java.lang.String r2 = "android.content.pm.extra.DATA_LOADER_TYPE"
            r3 = -1
            int r5 = r5.getIntExtra(r2, r3)
            r2 = 2
            if (r5 != r2) goto L3b
            frak r5 = defpackage.frak.a
            fral r5 = r5.lK()
            boolean r5 = r5.a()
            if (r5 == 0) goto L3a
            bjwy r5 = defpackage.bjwy.a(r6)
            r6 = 5013(0x1395, float:7.025E-42)
            r5.b(r6)
        L3a:
            return r1
        L3b:
            bjzh r5 = defpackage.bjzh.a
            fgrc r5 = r5.v()
            if (r0 == 0) goto L5a
            fgri r6 = r5.b
            boolean r6 = r6.L()
            if (r6 != 0) goto L4e
            r5.U()
        L4e:
            fgri r6 = r5.b
            bjzh r6 = (defpackage.bjzh) r6
            int r1 = r6.b
            r1 = r1 | 1
            r6.b = r1
            r6.c = r0
        L5a:
            fgri r5 = r5.Q()
            bjzh r5 = (defpackage.bjzh) r5
            byte[] r5 = r5.r()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gass.PackageChangeBroadcastReceiverImpl.a(android.content.Intent, android.content.Context):byte[]");
    }
}
