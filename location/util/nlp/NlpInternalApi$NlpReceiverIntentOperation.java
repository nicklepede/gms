package com.google.android.gms.location.util.nlp;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import com.google.android.chimera.IntentOperation;
import defpackage.caou;
import defpackage.caov;
import defpackage.ejhf;
import defpackage.irw;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class NlpInternalApi$NlpReceiverIntentOperation extends IntentOperation {
    private static final AtomicInteger a = new AtomicInteger();

    public static PendingIntent a(Context context, int i) {
        PendingIntent pendingIntent = getPendingIntent(context, NlpInternalApi$NlpReceiverIntentOperation.class, new Intent("com.google.android.gms.location.util.nlp.RESULT").putExtra("NlpInternalApi:id", i), a.getAndIncrement(), 268435456, true);
        irw.a(pendingIntent);
        return pendingIntent;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        caou caouVar;
        if ("com.google.android.gms.location.util.nlp.RESULT".equals(intent.getAction()) && intent.hasExtra("NlpInternalApi:id")) {
            int intExtra = intent.getIntExtra("NlpInternalApi:id", 0);
            SparseArray sparseArray = caov.c;
            synchronized (sparseArray) {
                caouVar = (caou) sparseArray.get(intExtra);
            }
            if (caouVar == null) {
                ((ejhf) ((ejhf) caov.a.h()).ah((char) 5662)).z("unregistered nlp listener id: %d", intExtra);
                return;
            }
            Object obj = caouVar.b;
            if (obj != null) {
                caouVar.b(intent, obj);
            }
        }
    }
}
