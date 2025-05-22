package com.google.android.gms.googlesettings.service.attribution;

import android.content.Intent;
import defpackage.auid;
import defpackage.ausn;
import defpackage.blwd;
import defpackage.blzf;
import defpackage.blzh;
import defpackage.blzk;
import defpackage.btah;
import defpackage.cblb;
import defpackage.dpvo;
import defpackage.fxuw;
import defpackage.fxxm;
import defpackage.fycs;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class FeatureStatusObserverIntentOperation extends blzk {
    public dpvo b;
    public cblb c;
    public btah d;
    public blwd e;
    private static final blzf f = new blzf();
    public static final ausn a = ausn.b("FeatureStatusObserverIntentOperation", auid.GOOGLESETTINGS);

    private final long i() {
        dpvo dpvoVar = this.b;
        if (dpvoVar == null) {
            fxxm.j("clock");
            dpvoVar = null;
        }
        return dpvoVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r10v10, types: [android.accounts.Account, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [blzf] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x01ea -> B:76:0x01ed). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r31, defpackage.cbjl r32, defpackage.fxun r33) {
        /*
            Method dump skipped, instructions count: 1195
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.googlesettings.service.attribution.FeatureStatusObserverIntentOperation.a(java.lang.String, cbjl, fxun):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(android.content.Intent r6, defpackage.fxun r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.blzi
            if (r0 == 0) goto L13
            r0 = r7
            blzi r0 = (defpackage.blzi) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            blzi r0 = new blzi
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fxuz r1 = defpackage.fxuz.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.fxrc.b(r7)     // Catch: java.lang.Throwable -> L27
            goto L88
        L27:
            r6 = move-exception
            goto L91
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.fxrc.b(r7)
            boolean r7 = defpackage.froa.d()
            if (r7 != 0) goto L4a
            ausn r6 = com.google.android.gms.googlesettings.service.attribution.FeatureStatusObserverIntentOperation.a
            eltz r6 = r6.h()
            eluo r6 = (defpackage.eluo) r6
            java.lang.String r7 = "feature is disabled"
            r6.x(r7)
            fxrq r6 = defpackage.fxrq.a
            return r6
        L4a:
            r7 = 0
            if (r6 == 0) goto L52
            java.lang.String r2 = r6.getAction()
            goto L53
        L52:
            r2 = r7
        L53:
            java.lang.String r4 = "com.google.android.gms.googlesettings.service.attribution.FEATURE_STATUS_DIFF"
            boolean r2 = defpackage.fxxm.n(r2, r4)
            if (r2 != 0) goto L71
            ausn r0 = com.google.android.gms.googlesettings.service.attribution.FeatureStatusObserverIntentOperation.a
            eltz r0 = r0.h()
            eluo r0 = (defpackage.eluo) r0
            if (r6 == 0) goto L69
            java.lang.String r7 = r6.getAction()
        L69:
            java.lang.String r6 = "unexpected action: %s"
            r0.B(r6, r7)
            fxrq r6 = defpackage.fxrq.a
            return r6
        L71:
            long r6 = defpackage.bmbn.a
            blzb r6 = defpackage.bmbn.b
            boolean r7 = r6 instanceof defpackage.blyz
            if (r7 == 0) goto L98
            blyz r6 = (defpackage.blyz) r6
            java.lang.String r7 = r6.a
            cbjl r6 = r6.b
            r0.c = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r6 = r5.a(r7, r6, r0)     // Catch: java.lang.Throwable -> L27
            if (r6 != r1) goto L88
            return r1
        L88:
            long r6 = defpackage.bmbn.a
            blza r6 = defpackage.blza.a
            defpackage.bmbn.b = r6
            fxrq r6 = defpackage.fxrq.a
            return r6
        L91:
            long r0 = defpackage.bmbn.a
            blza r7 = defpackage.blza.a
            defpackage.bmbn.b = r7
            throw r6
        L98:
            boolean r6 = r6 instanceof defpackage.blza
            if (r6 == 0) goto Lac
            ausn r6 = com.google.android.gms.googlesettings.service.attribution.FeatureStatusObserverIntentOperation.a
            eltz r6 = r6.j()
            eluo r6 = (defpackage.eluo) r6
            java.lang.String r7 = "invalid diff status"
            r6.x(r7)
            fxrq r6 = defpackage.fxrq.a
            return r6
        Lac:
            fxqx r6 = new fxqx
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.googlesettings.service.attribution.FeatureStatusObserverIntentOperation.b(android.content.Intent, fxun):java.lang.Object");
    }

    public final blwd c() {
        blwd blwdVar = this.e;
        if (blwdVar != null) {
            return blwdVar;
        }
        fxxm.j("accountManager");
        return null;
    }

    public final btah d() {
        btah btahVar = this.d;
        if (btahVar != null) {
            return btahVar;
        }
        fxxm.j("featureStatusFetcher");
        return null;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        fxxm.f(intent, "intent");
        fycs.a(fxuw.a, new blzh(this, intent, null));
    }
}
