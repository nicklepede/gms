package com.google.android.gms.chimera.container;

import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class FeatureRequestOperation extends IntentOperation {
    private static final String a = "FeatureRequestOperation";

    /* JADX WARN: Removed duplicated region for block: B:13:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b5  */
    @Override // com.google.android.chimera.IntentOperation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onHandleIntent(android.content.Intent r18) {
        /*
            r17 = this;
            java.lang.String r0 = "com.google.android.chimera.container.REQUEST_FEATURES"
            r1 = r18
            android.os.Bundle r0 = r1.getBundleExtra(r0)
            android.content.UriMatcher r1 = defpackage.prc.a
            int r1 = android.os.Binder.getCallingUid()
            int r2 = android.os.Process.myUid()
            java.lang.String r3 = "listener"
            java.lang.String r4 = "result"
            java.lang.String r5 = "ModuleProvider"
            r6 = 0
            if (r1 == r2) goto L22
            java.lang.String r1 = "requesting feature from outside of GmsCore is not supported"
            android.util.Log.e(r5, r1)
        L20:
            r2 = r6
            goto L8d
        L22:
            if (r0 != 0) goto L25
        L24:
            goto L20
        L25:
            java.lang.String r1 = "requester"
            java.lang.String r8 = r0.getString(r1)
            if (r8 != 0) goto L2e
            goto L24
        L2e:
            java.lang.String r1 = "unrequested"
            java.util.ArrayList r1 = r0.getStringArrayList(r1)
            if (r1 != 0) goto L38
            java.util.List r1 = java.util.Collections.EMPTY_LIST
        L38:
            r10 = r1
            java.lang.String r1 = "forceUnrequest"
            boolean r11 = r0.getBoolean(r1)
            java.lang.String r1 = "urgent"
            boolean r12 = r0.getBoolean(r1)
            puv r13 = defpackage.qad.b(r0, r3)
            java.lang.String r1 = "sessionId"
            java.lang.String r14 = r0.getString(r1)
            java.lang.String r1 = "requesterAppPackage"
            java.lang.String r16 = r0.getString(r1)
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            java.lang.String r2 = "requested"
            byte[] r2 = r0.getByteArray(r2)
            if (r2 == 0) goto L7b
            febw r1 = defpackage.febw.a     // Catch: defpackage.fedk -> L75
            feep r1 = defpackage.feep.a     // Catch: defpackage.fedk -> L75
            febw r1 = defpackage.febw.a     // Catch: defpackage.fedk -> L75
            pup r7 = defpackage.pup.a     // Catch: defpackage.fedk -> L75
            int r9 = r2.length     // Catch: defpackage.fedk -> L75
            r15 = 0
            fecp r1 = defpackage.fecp.y(r7, r2, r15, r9, r1)     // Catch: defpackage.fedk -> L75
            defpackage.fecp.M(r1)     // Catch: defpackage.fedk -> L75
            pup r1 = (defpackage.pup) r1     // Catch: defpackage.fedk -> L75
            fedh r1 = r1.b     // Catch: defpackage.fedk -> L75
            goto L7b
        L75:
            java.lang.String r1 = "Malformed requested features"
            android.util.Log.e(r5, r1)
            goto L20
        L7b:
            r9 = r1
            ppt r7 = defpackage.ppt.d()
            r15 = 0
            boolean r1 = r7.k(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r2.putBoolean(r4, r1)
        L8d:
            if (r2 == 0) goto L99
            boolean r1 = r2.getBoolean(r4)
            if (r1 != 0) goto L96
            goto L99
        L96:
            r1 = r17
            goto Lbb
        L99:
            java.lang.String r1 = com.google.android.gms.chimera.container.FeatureRequestOperation.a
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "Failed writing feature request to the config for request: "
            java.lang.String r2 = r4.concat(r2)
            android.util.Log.e(r1, r2)
            if (r0 != 0) goto Laf
            goto Lb3
        Laf:
            puv r6 = defpackage.qad.b(r0, r3)
        Lb3:
            if (r6 == 0) goto L96
            r0 = 1
            r1 = r17
            defpackage.qad.e(r6, r0, r1)
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.chimera.container.FeatureRequestOperation.onHandleIntent(android.content.Intent):void");
    }
}
