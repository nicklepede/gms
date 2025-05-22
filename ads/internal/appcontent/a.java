package com.google.android.gms.ads.internal.appcontent;

import com.google.android.gms.ads.internal.util.client.h;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class a implements Runnable {
    final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar = this.a;
        synchronized (bVar.b) {
            if (bVar.c && bVar.d) {
                bVar.c = false;
                int i = com.google.android.gms.ads.internal.util.c.a;
                h.d("App went background");
                Iterator it = bVar.e.iterator();
                while (it.hasNext()) {
                    try {
                        ((com.google.android.gms.ads.internal.state.h) it.next()).a(false);
                    } catch (Exception e) {
                        h.g(e);
                    }
                }
            } else {
                int i2 = com.google.android.gms.ads.internal.util.c.a;
                h.d("App is still foreground");
            }
        }
    }
}
