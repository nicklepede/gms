package com.google.android.gms.nearby.sharing.migration;

import defpackage.qet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class TransparentTrampolineChimeraActivity extends qet {
    private final String j = "com.google.android.gms.SHARE_NEARBY";
    private final String k = "com.google.android.gms.nearby.SEND_FOLDER";
    private final String l = "com.google.android.gms.RECEIVE_NEARBY";
    private final String m = "com.google.android.gms.nearby.sharing.QUICK_SETTINGS";
    private final String n = "com.google.android.gms.settings.SHARING";

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            super.onCreate(r8)
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r8 = r8.getAction()
            java.lang.String r0 = r7.j
            boolean r0 = defpackage.fvbo.n(r8, r0)
            if (r0 != 0) goto L3d
            java.lang.String r0 = r7.k
            boolean r0 = defpackage.fvbo.n(r8, r0)
            if (r0 == 0) goto L1c
            goto L3d
        L1c:
            java.lang.String r0 = r7.l
            boolean r0 = defpackage.fvbo.n(r8, r0)
            if (r0 != 0) goto L3a
            java.lang.String r0 = r7.m
            boolean r0 = defpackage.fvbo.n(r8, r0)
            if (r0 == 0) goto L2d
            goto L3a
        L2d:
            java.lang.String r0 = r7.n
            boolean r8 = defpackage.fvbo.n(r8, r0)
            if (r8 == 0) goto L38
            cohy r8 = defpackage.cohy.e
            goto L3f
        L38:
            r8 = 0
            goto L3f
        L3a:
            cohy r8 = defpackage.cohy.d
            goto L3f
        L3d:
            cohy r8 = defpackage.cohy.b
        L3f:
            if (r8 == 0) goto Lcb
            cohy r0 = defpackage.cohy.b
            if (r8 != r0) goto Lb9
            android.content.Intent r0 = r7.getIntent()
            android.content.Intent r1 = r7.getIntent()
            int r2 = defpackage.crln.n(r7, r1)
            int r3 = defpackage.crnp.b(r1)
            r4 = 1
            r5 = 1
            if (r3 == r4) goto L60
            int r1 = defpackage.crnp.a(r1)
        L5e:
            long r1 = (long) r1
            goto Lad
        L60:
            java.lang.String r3 = r1.getAction()
            java.lang.String r4 = "com.google.android.gms.nearby.SEND_FOLDER"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L71
            int r1 = defpackage.crmk.a(r1)
            goto L5e
        L71:
            boolean r3 = defpackage.fqmk.K()
            if (r3 == 0) goto L7f
            com.google.android.gms.nearby.sharing.StreamAttachment r3 = defpackage.crln.d(r1)
            if (r3 == 0) goto L7f
        L7d:
            r1 = r5
            goto Lad
        L7f:
            r3 = 4
            if (r2 != r3) goto L8a
            com.google.android.gms.nearby.sharing.WifiCredentialsAttachment r2 = defpackage.crln.f(r1)
            if (r2 == 0) goto L89
            goto L7d
        L89:
            r2 = r3
        L8a:
            r3 = 5
            if (r2 != r3) goto L96
            eitj r1 = defpackage.crln.g(r7, r1)
            ejcb r1 = (defpackage.ejcb) r1
            int r1 = r1.c
            goto L5e
        L96:
            r3 = 3
            if (r2 != r3) goto La4
            java.lang.String r2 = defpackage.crnv.b(r7, r1)
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto La4
            goto L7d
        La4:
            eitj r1 = defpackage.cmvd.a(r7, r1)
            int r1 = r1.size()
            goto L5e
        Lad:
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto Lb4
            java.lang.String r1 = "android.intent.action.SEND_MULTIPLE"
            goto Lb6
        Lb4:
            java.lang.String r1 = "android.intent.action.SEND"
        Lb6:
            r0.setAction(r1)
        Lb9:
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r1 = "getIntent(...)"
            defpackage.fvbo.e(r0, r1)
            android.content.Intent r8 = defpackage.cohz.a(r7, r0, r8)
            if (r8 == 0) goto Lcb
            r7.startActivity(r8)
        Lcb:
            r7.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.sharing.migration.TransparentTrampolineChimeraActivity.onCreate(android.os.Bundle):void");
    }
}
