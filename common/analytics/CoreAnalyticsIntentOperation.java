package com.google.android.gms.common.analytics;

import android.content.SharedPreferences;
import com.google.android.chimera.IntentOperation;
import defpackage.asej;
import defpackage.asot;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CoreAnalyticsIntentOperation extends IntentOperation {
    private static final asot a = asot.b("CoreAnalyticsIntentSrv", asej.CORE);

    protected final SharedPreferences a() {
        return getSharedPreferences("coreanalyticsprefs", 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x01aa, code lost:
    
        if (r0 == false) goto L114;
     */
    @Override // com.google.android.chimera.IntentOperation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onHandleIntent(android.content.Intent r17) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.analytics.CoreAnalyticsIntentOperation.onHandleIntent(android.content.Intent):void");
    }
}
