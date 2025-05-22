package com.google.android.gms.mdisync.service;

import com.google.android.chimera.IntentOperation;
import defpackage.ekww;
import defpackage.ekxd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class MdiSyncFlagChangeIntentOperation extends IntentOperation {
    private final ekww a;
    private final ekww b;

    public MdiSyncFlagChangeIntentOperation() {
        this(new ekww() { // from class: cezy
            @Override // defpackage.ekww
            public final Object lK() {
                cexa a = cexa.a();
                return new cfaa((cbgj) a.B.a(), (ceyw) a.Q.a(), (drrp) a.E.a());
            }
        }, new ekww() { // from class: cezz
            @Override // defpackage.ekww
            public final Object lK() {
                return cexa.a().c();
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:8|(2:12|(5:17|18|19|20|21))|27|(1:15)|17|18|19|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
    
        r5.a.c(6);
        defpackage.ceyv.b().j().ai(6390).x("Scheduling was interrupted.");
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009c, code lost:
    
        r5.a.c(4);
        r5.b.d().s(r0.getCause()).ai(6389).x("Failed to schedule periodic tasks.");
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

    public MdiSyncFlagChangeIntentOperation(ekww ekwwVar, ekww ekwwVar2) {
        this.a = ekxd.a(ekwwVar);
        this.b = ekxd.a(ekwwVar2);
    }
}
