package com.google.android.gms.appinvite;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.vsq;
import defpackage.vss;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes2.dex */
public final class AppInviteIntentOperation extends IntentOperation {
    public static final Queue a = new ConcurrentLinkedQueue();
    public static final vsq b = new vsq();
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
        vsq vsqVar = b;
        Long valueOf = Long.valueOf(j);
        HashMap hashMap = vsqVar.a;
        if (!hashMap.containsKey(valueOf)) {
            while (true) {
                ArrayList arrayList = vsqVar.b;
                if (arrayList.size() < 2000) {
                    break;
                }
                hashMap.remove(arrayList.get(0));
                arrayList.remove(0);
            }
        } else {
            vsqVar.b.remove(valueOf);
        }
        vsqVar.b.add(valueOf);
        hashMap.put(valueOf, intent);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Queue queue = a;
        for (vss vssVar = (vss) queue.poll(); vssVar != null; vssVar = (vss) queue.poll()) {
            vssVar.f(getApplicationContext());
        }
    }
}
