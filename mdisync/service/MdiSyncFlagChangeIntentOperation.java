package com.google.android.gms.mdisync.service;

import com.google.android.chimera.IntentOperation;
import defpackage.eijr;
import defpackage.eijy;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MdiSyncFlagChangeIntentOperation extends IntentOperation {
    private final eijr a;
    private final eijr b;

    public MdiSyncFlagChangeIntentOperation() {
        this(new eijr() { // from class: ccre
            @Override // defpackage.eijr
            public final Object a() {
                ccog a = ccog.a();
                return new ccrg((byxs) a.B.a(), (ccqc) a.Q.a(), (dphg) a.E.a());
            }
        }, new eijr() { // from class: ccrf
            @Override // defpackage.eijr
            public final Object a() {
                return ccog.a().c();
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:8|(2:12|(5:17|18|19|20|21))|27|(1:15)|17|18|19|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
    
        r5.a.c(6);
        defpackage.ccqb.b().j().ah(6371).x("Scheduling was interrupted.");
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009c, code lost:
    
        r5.a.c(4);
        r5.b.d().s(r0.getCause()).ah(6370).x("Failed to schedule periodic tasks.");
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037 A[ADDED_TO_REGION] */
    @Override // com.google.android.chimera.IntentOperation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onHandleIntent(android.content.Intent r5) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.mdisync.service.MdiSyncFlagChangeIntentOperation.onHandleIntent(android.content.Intent):void");
    }

    public MdiSyncFlagChangeIntentOperation(eijr eijrVar, eijr eijrVar2) {
        this.a = eijy.a(eijrVar);
        this.b = eijy.a(eijrVar2);
    }
}
