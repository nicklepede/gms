package com.google.android.gms.stats;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.libs.scheduler.PendingCallback;
import defpackage.auid;
import defpackage.ausn;
import defpackage.dhbm;
import defpackage.eluo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class RequestCollectorChimeraService extends IntentOperation {
    private static final ausn a = ausn.b("RequestCollectorService", auid.STATS);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        ((eluo) ((eluo) a.h()).ai((char) 10912)).x("Requesting collection");
        Intent intent2 = new Intent();
        PendingCallback pendingCallback = new PendingCallback(new dhbm());
        intent2.setClassName("com.google.android.gms", "com.google.android.gms.stats.PlatformStatsCollectorService");
        intent2.setAction("com.google.android.gms.gcm.ACTION_TASK_READY");
        intent2.putExtras(intent);
        intent2.putExtra("callback", pendingCallback);
        startService(intent2);
    }
}
