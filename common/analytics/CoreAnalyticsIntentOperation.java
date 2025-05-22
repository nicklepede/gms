package com.google.android.gms.common.analytics;

import android.content.SharedPreferences;
import com.google.android.chimera.IntentOperation;
import defpackage.auid;
import defpackage.ausn;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CoreAnalyticsIntentOperation extends IntentOperation {
    private static final ausn a = ausn.b("CoreAnalyticsIntentSrv", auid.CORE);

    protected final SharedPreferences a() {
        return getSharedPreferences("coreanalyticsprefs", 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x01ae, code lost:
    
        if (r0 == false) goto L115;
     */
    @Override // com.google.android.chimera.IntentOperation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onHandleIntent(android.content.Intent r17) {
        /*
            Method dump skipped, instructions count: 688
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.analytics.CoreAnalyticsIntentOperation.onHandleIntent(android.content.Intent):void");
    }
}
