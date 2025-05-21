package com.google.android.gms.appinvite;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.twq;
import defpackage.tws;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes2.dex */
public final class AppInviteIntentOperation extends IntentOperation {
    public static final Queue a = new ConcurrentLinkedQueue();
    public static final twq b = new twq();
    private static long c = 0;

    public static synchronized long a() {
        long j;
        synchronized (AppInviteIntentOperation.class) {
            j = c + 1;
            c = j;
        }
        return j;
    }

    public static void b(long j, Intent intent) {
        twq twqVar = b;
        Long valueOf = Long.valueOf(j);
        HashMap hashMap = twqVar.a;
        if (!hashMap.containsKey(valueOf)) {
            while (true) {
                ArrayList arrayList = twqVar.b;
                if (arrayList.size() < 2000) {
                    break;
                }
                hashMap.remove(arrayList.get(0));
                arrayList.remove(0);
            }
        } else {
            twqVar.b.remove(valueOf);
        }
        twqVar.b.add(valueOf);
        hashMap.put(valueOf, intent);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Queue queue = a;
        for (tws twsVar = (tws) queue.poll(); twsVar != null; twsVar = (tws) queue.poll()) {
            twsVar.f(getApplicationContext());
        }
    }
}
