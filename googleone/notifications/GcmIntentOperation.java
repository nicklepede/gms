package com.google.android.gms.googleone.notifications;

import com.google.android.chimera.IntentOperation;
import defpackage.auid;
import defpackage.ausn;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class GcmIntentOperation extends IntentOperation {
    private static final ausn a = ausn.b("GcmIntentOperation", auid.GOOGLEONE);

    /* JADX WARN: Removed duplicated region for block: B:11:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0060  */
    @Override // com.google.android.chimera.IntentOperation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onHandleIntent(android.content.Intent r6) {
        /*
            r5 = this;
            java.lang.String r0 = "intent"
            defpackage.fxxm.f(r6, r0)
            frnw r0 = defpackage.frnw.a
            frnx r0 = r0.lK()
            boolean r0 = r0.b()
            if (r0 != 0) goto L13
            goto Lb1
        L13:
            android.os.Bundle r6 = r6.getExtras()     // Catch: defpackage.fgsd -> Lb2
            r0 = 0
            r1 = 0
            if (r6 != 0) goto L2a
            ausn r6 = com.google.android.gms.googleone.notifications.GcmIntentOperation.a     // Catch: defpackage.fgsd -> Lb2
            eltz r6 = r6.j()     // Catch: defpackage.fgsd -> Lb2
            eluo r6 = (defpackage.eluo) r6     // Catch: defpackage.fgsd -> Lb2
            java.lang.String r2 = "Failed to parse Android Payload, extra is null."
            r6.x(r2)     // Catch: defpackage.fgsd -> Lb2
        L28:
            r6 = r1
            goto L5e
        L2a:
            java.lang.String r2 = "casp"
            java.lang.String r6 = r6.getString(r2)     // Catch: defpackage.fgsd -> Lb2
            boolean r2 = android.text.TextUtils.isEmpty(r6)     // Catch: defpackage.fgsd -> Lb2
            if (r2 == 0) goto L44
            ausn r6 = com.google.android.gms.googleone.notifications.GcmIntentOperation.a     // Catch: defpackage.fgsd -> Lb2
            eltz r6 = r6.j()     // Catch: defpackage.fgsd -> Lb2
            eluo r6 = (defpackage.eluo) r6     // Catch: defpackage.fgsd -> Lb2
            java.lang.String r2 = "Failed to parse Android Payload, androidPayloadString is empty."
            r6.x(r2)     // Catch: defpackage.fgsd -> Lb2
            goto L28
        L44:
            r2 = 1
            byte[] r6 = android.util.Base64.decode(r6, r2)     // Catch: defpackage.fgsd -> Lb2
            java.lang.String r2 = "decode(...)"
            defpackage.fxxm.e(r6, r2)     // Catch: defpackage.fgsd -> Lb2
            fgqp r2 = defpackage.fgqp.a()     // Catch: defpackage.fgsd -> Lb2
            ffij r3 = defpackage.ffij.a     // Catch: defpackage.fgsd -> Lb2
            int r4 = r6.length     // Catch: defpackage.fgsd -> Lb2
            fgri r6 = defpackage.fgri.y(r3, r6, r0, r4, r2)     // Catch: defpackage.fgsd -> Lb2
            defpackage.fgri.M(r6)     // Catch: defpackage.fgsd -> Lb2
            ffij r6 = (defpackage.ffij) r6     // Catch: defpackage.fgsd -> Lb2
        L5e:
            if (r6 != 0) goto L6e
            ausn r6 = com.google.android.gms.googleone.notifications.GcmIntentOperation.a
            eltz r6 = r6.j()
            eluo r6 = (defpackage.eluo) r6
            java.lang.String r2 = "Skip handle android payload, androidPayload is null."
            r6.x(r2)
            goto L8a
        L6e:
            java.lang.String r6 = r6.c
            java.lang.String r2 = "getRecipientOid(...)"
            defpackage.fxxm.e(r6, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 == 0) goto L89
            ausn r6 = com.google.android.gms.googleone.notifications.GcmIntentOperation.a
            eltz r6 = r6.j()
            eluo r6 = (defpackage.eluo) r6
            java.lang.String r2 = "android payload does not have obfuscated id."
            r6.x(r2)
            goto L8a
        L89:
            r1 = r6
        L8a:
            if (r1 == 0) goto Lb1
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r6.add(r1)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "com.google.android.gms.googleone.STORAGE_CHANGED"
            r1.<init>(r2)
            java.lang.String r2 = "com.google.android.gms"
            r1.setPackage(r2)
            java.lang.String r2 = "ACCOUNT_IDS"
            r1.putStringArrayListExtra(r2, r6)
            java.lang.String r6 = "IS_PERIODIC_SYNC"
            r1.putExtra(r6, r0)
            android.content.Context r6 = r5.getApplicationContext()
            r6.sendBroadcast(r1)
        Lb1:
            return
        Lb2:
            r6 = move-exception
            ausn r0 = com.google.android.gms.googleone.notifications.GcmIntentOperation.a
            eltz r0 = r0.j()
            java.lang.String r1 = "Not able to parse Android Payload from intent."
            defpackage.a.S(r0, r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.googleone.notifications.GcmIntentOperation.onHandleIntent(android.content.Intent):void");
    }
}
