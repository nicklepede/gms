package com.google.android.gms.location.util.nlp;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import com.google.android.chimera.IntentOperation;
import defpackage.ccxk;
import defpackage.ccxl;
import defpackage.eluo;
import defpackage.itm;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class NlpInternalApi$NlpReceiverIntentOperation extends IntentOperation {
    private static final AtomicInteger a = new AtomicInteger();

    public static PendingIntent a(Context context, int i) {
        PendingIntent pendingIntent = getPendingIntent(context, NlpInternalApi$NlpReceiverIntentOperation.class, new Intent("com.google.android.gms.location.util.nlp.RESULT").putExtra("NlpInternalApi:id", i), a.getAndIncrement(), 268435456, true);
        itm.a(pendingIntent);
        return pendingIntent;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        ccxk ccxkVar;
        if ("com.google.android.gms.location.util.nlp.RESULT".equals(intent.getAction()) && intent.hasExtra("NlpInternalApi:id")) {
            int intExtra = intent.getIntExtra("NlpInternalApi:id", 0);
            SparseArray sparseArray = ccxl.c;
            synchronized (sparseArray) {
                ccxkVar = (ccxk) sparseArray.get(intExtra);
            }
            if (ccxkVar == null) {
                ((eluo) ((eluo) ccxl.a.h()).ai((char) 5676)).z("unregistered nlp listener id: %d", intExtra);
                return;
            }
            Object obj = ccxkVar.b;
            if (obj != null) {
                ccxkVar.b(intent, obj);
            }
        }
    }
}
