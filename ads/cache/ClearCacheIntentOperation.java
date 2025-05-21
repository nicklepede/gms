package com.google.android.gms.ads.cache;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class ClearCacheIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        com.google.android.gms.ads.internal.config.p.c(getApplicationContext());
        com.google.android.gms.ads.internal.c.d().b(getApplicationContext(), new VersionInfoParcel(251661004, 251661004));
        f c = j.c(this);
        if (c != null) {
            try {
                synchronized (c.a) {
                    com.google.android.gms.ads.cache.policy.b d = c.d();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = d.b().iterator();
                    while (it.hasNext()) {
                        Iterator it2 = d.a((String) it.next()).iterator();
                        while (it2.hasNext()) {
                            arrayList.add((s) it2.next());
                        }
                    }
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        c.h((s) it3.next());
                    }
                }
            } catch (g e) {
                com.google.android.gms.ads.internal.c.d().d(e, "ClearCacheIntentOperation");
            }
        }
    }
}
