package com.google.android.gms.phonesky.recovery;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.cwhj;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class RollbackCommittedIntentOperation extends IntentOperation {
    public static final BlockingQueue a = new LinkedBlockingQueue();
    public static final long b = 30000;

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if ("android.intent.action.ROLLBACK_COMMITTED".equals(intent.getAction())) {
            a.add(intent);
        } else {
            cwhj.b("Invalid rollback committed intent", new Object[0]);
        }
    }
}
