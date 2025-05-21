package com.google.android.gms.ads.internal.appcontent;

import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.ads.internal.config.p;
import com.google.android.gms.ads.internal.flag.f;
import com.google.android.gms.ads.internal.util.client.h;
import java.util.LinkedList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class d extends Thread {
    public boolean a;
    public final Object b;
    private boolean c;
    private final int d;

    public d() {
        new LinkedList();
        this.a = false;
        this.c = false;
        this.b = new Object();
        ((Long) f.d.d()).intValue();
        ((Long) f.a.d()).intValue();
        ((Long) f.e.d()).intValue();
        ((Long) f.c.d()).intValue();
        ((Integer) p.n.g()).intValue();
        ((Integer) p.o.g()).intValue();
        ((Integer) p.p.g()).intValue();
        this.d = ((Long) f.f.d()).intValue();
        ((Boolean) p.r.g()).booleanValue();
        ((Boolean) p.s.g()).booleanValue();
        ((Boolean) p.t.g()).booleanValue();
        setName("ContentFetchTask");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                c a = com.google.android.gms.ads.internal.c.a();
                synchronized (a.a) {
                    if (a.b != null) {
                    }
                }
            } catch (Throwable th) {
                try {
                    com.google.android.gms.ads.internal.c.d().d(th, "ContentFetchTask.isInForeground");
                } catch (InterruptedException e) {
                    int i = com.google.android.gms.ads.internal.util.c.a;
                    h.h("Error in ContentFetchTask", e);
                } catch (Exception e2) {
                    int i2 = com.google.android.gms.ads.internal.util.c.a;
                    h.h("Error in ContentFetchTask", e2);
                    com.google.android.gms.ads.internal.c.d().d(e2, "ContentFetchTask.run");
                }
            }
            int i3 = com.google.android.gms.ads.internal.util.c.a;
            h.d("ContentFetchTask: sleeping");
            synchronized (this.b) {
                this.c = true;
                h.d(defpackage.a.Z(true, "ContentFetchThread: paused, pause = "));
            }
            Thread.sleep(this.d * ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS);
            Object obj = this.b;
            synchronized (obj) {
                while (this.c) {
                    try {
                        h.d("ContentFetchTask: waiting");
                        obj.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }
}
