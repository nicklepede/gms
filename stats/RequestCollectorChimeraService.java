package com.google.android.gms.stats;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.libs.scheduler.PendingCallback;
import defpackage.asej;
import defpackage.asot;
import defpackage.deqj;
import defpackage.ejhf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class RequestCollectorChimeraService extends IntentOperation {
    private static final asot a = asot.b("RequestCollectorService", asej.STATS);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        ((ejhf) ((ejhf) a.h()).ah((char) 10909)).x("Requesting collection");
        Intent intent2 = new Intent();
        PendingCallback pendingCallback = new PendingCallback(new deqj());
        intent2.setClassName("com.google.android.gms", "com.google.android.gms.stats.PlatformStatsCollectorService");
        intent2.setAction("com.google.android.gms.gcm.ACTION_TASK_READY");
        intent2.putExtras(intent);
        intent2.putExtra("callback", pendingCallback);
        startService(intent2);
    }
}
