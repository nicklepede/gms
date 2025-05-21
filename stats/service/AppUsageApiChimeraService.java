package com.google.android.gms.stats.service;

import defpackage.bxgd;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class AppUsageApiChimeraService extends bxgd {
    public AppUsageApiChimeraService() {
        super(193, "com.google.android.gms.appusage.service.START", Collections.EMPTY_SET, 1, 10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:
    
        if (com.google.android.gms.chimera.modules.stats.AppContextProvider.a().getPackageManager().checkPermission("android.permission.PACKAGE_USAGE_STATS", r0) != 0) goto L9;
     */
    @Override // defpackage.bxgd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void a(defpackage.bxgj r5, com.google.android.gms.common.internal.GetServiceRequest r6) {
        /*
            r4 = this;
            java.lang.String r0 = r6.f
            fsiz r1 = defpackage.fsiz.a
            fsjd r1 = r1.a()
            java.lang.String r1 = r1.f()
            android.text.TextUtils$SimpleStringSplitter r2 = new android.text.TextUtils$SimpleStringSplitter
            r3 = 44
            r2.<init>(r3)
            r2.setString(r1)
            java.util.Iterator r1 = r2.iterator()
        L1a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L1a
            android.content.Context r1 = com.google.android.gms.chimera.modules.stats.AppContextProvider.a()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "android.permission.PACKAGE_USAGE_STATS"
            int r0 = r1.checkPermission(r2, r0)
            if (r0 == 0) goto L42
        L3c:
            r0 = 16
            r1 = 0
            r5.a(r0, r1)
        L42:
            ujp r0 = new ujp
            bxgo r1 = r4.l()
            java.lang.String r2 = r6.f
            java.lang.String r6 = r6.p
            r0.<init>(r1, r2, r6)
            r5.c(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.stats.service.AppUsageApiChimeraService.a(bxgj, com.google.android.gms.common.internal.GetServiceRequest):void");
    }
}
