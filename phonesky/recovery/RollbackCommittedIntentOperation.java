package com.google.android.gms.phonesky.recovery;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.cyrg;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class RollbackCommittedIntentOperation extends IntentOperation {
    public static final BlockingQueue a = new LinkedBlockingQueue();
    public static final long b = 30000;

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if ("android.intent.action.ROLLBACK_COMMITTED".equals(intent.getAction())) {
            a.add(intent);
        } else {
            cyrg.b("Invalid rollback committed intent", new Object[0]);
        }
    }
}
