package com.google.android.gms.ads.nonagon.ad.event;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class c {
    protected final Map a = new HashMap();

    public c(Set set) {
        c(set);
    }

    public final synchronized void a(d dVar) {
        b(dVar.a, dVar.b);
    }

    public final synchronized void b(Object obj, Executor executor) {
        this.a.put(obj, executor);
    }

    public final synchronized void c(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a((d) it.next());
        }
    }

    public final synchronized void d(final b bVar) {
        for (Map.Entry entry : this.a.entrySet()) {
            final Object key = entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.ad.event.a
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        b.this.a(key);
                    } catch (Throwable th) {
                        com.google.android.gms.ads.internal.c.d().c(th, "EventEmitter.notify");
                    }
                }
            });
        }
    }
}
