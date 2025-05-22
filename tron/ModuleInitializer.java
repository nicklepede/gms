package com.google.android.gms.tron;

import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ModuleInitializer extends IntentOperation {
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    @Override // com.google.android.chimera.IntentOperation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onHandleIntent(android.content.Intent r5) {
        /*
            r4 = this;
            java.lang.String r5 = r5.getAction()
            r0 = 0
            if (r5 == 0) goto L34
            int r1 = r5.hashCode()
            r2 = 438946629(0x1a29cb45, float:3.511258E-23)
            r3 = 1
            if (r1 == r2) goto L21
            r2 = 798292259(0x2f94f923, float:2.7098065E-10)
            if (r1 == r2) goto L17
            goto L2b
        L17:
            java.lang.String r1 = "android.intent.action.BOOT_COMPLETED"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L2b
            r5 = r0
            goto L2c
        L21:
            java.lang.String r1 = "com.google.android.gms.chimera.container.CONTAINER_UPDATED"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L2b
            r5 = r3
            goto L2c
        L2b:
            r5 = -1
        L2c:
            if (r5 == 0) goto L33
            if (r5 == r3) goto L31
            goto L34
        L31:
            r0 = 4
            goto L34
        L33:
            r0 = 3
        L34:
            android.content.Intent r5 = com.google.android.gms.tron.CollectionChimeraService.a(r4)
            java.lang.String r1 = "com.google.android.gms.tron.extra.reason"
            r5.putExtra(r1, r0)
            r4.startService(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tron.ModuleInitializer.onHandleIntent(android.content.Intent):void");
    }
}
