package com.google.android.gms.ads.cache.io;

import android.os.Binder;
import com.google.android.gms.ads.cache.q;
import com.google.android.gms.ads.cache.s;
import com.google.android.gms.ads.internal.config.p;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.chimera.modules.admob.AppContextProvider;
import defpackage.asmf;
import defpackage.bul;
import defpackage.fecj;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class b {
    public static final b a = new b();
    private final ThreadPoolExecutor b;
    private final bul c;
    private final bul d;
    private final bul e;

    public b() {
        p.c(AppContextProvider.a());
        this.c = new bul();
        this.d = new bul();
        this.e = new bul();
        this.b = new asmf(((Integer) p.ai.g()).intValue(), true != ((Boolean) p.aj.g()).booleanValue() ? 10 : 9);
    }

    public final synchronized void a(String str, long j) {
        com.google.android.gms.ads.cache.d dVar = (com.google.android.gms.ads.cache.d) this.d.remove(str);
        if (dVar != null) {
            com.google.android.gms.ads.cache.e eVar = dVar.a;
            com.google.android.gms.ads.cache.f fVar = eVar.h;
            synchronized (fVar.a) {
                try {
                    eVar.a();
                    fecj w = s.a.w(eVar.b);
                    q qVar = eVar.b.f;
                    if (qVar == null) {
                        qVar = q.a;
                    }
                    fecj w2 = q.a.w(qVar);
                    if (!w2.b.L()) {
                        w2.U();
                    }
                    q qVar2 = (q) w2.b;
                    qVar2.b |= 32;
                    qVar2.i = j;
                    if (!w.b.L()) {
                        w.U();
                    }
                    s sVar = (s) w.b;
                    q qVar3 = (q) w2.Q();
                    qVar3.getClass();
                    sVar.f = qVar3;
                    sVar.b |= 8;
                    eVar.b = (s) w.Q();
                    fVar.f(eVar.b);
                } catch (com.google.android.gms.ads.cache.g e) {
                    int i = com.google.android.gms.ads.internal.util.c.a;
                    h.h("Unable to update entry's content length.", e);
                }
            }
        }
    }

    public final synchronized void b(String str, boolean z) {
        com.google.android.gms.ads.cache.c cVar = (com.google.android.gms.ads.cache.c) this.c.remove(str);
        if (cVar != null) {
            com.google.android.gms.ads.cache.e eVar = cVar.a;
            com.google.android.gms.ads.cache.f fVar = eVar.h;
            synchronized (fVar.a) {
                try {
                    if (eVar.f) {
                        com.google.android.gms.ads.cache.csi.a aVar = eVar.d;
                        if (aVar != null) {
                            aVar.a();
                            eVar.d = null;
                        }
                        eVar.b();
                    }
                    eVar.a();
                    fecj w = s.a.w(eVar.b);
                    q qVar = eVar.b.f;
                    if (qVar == null) {
                        qVar = q.a;
                    }
                    fecj w2 = q.a.w(qVar);
                    if (!w2.b.L()) {
                        w2.U();
                    }
                    q qVar2 = (q) w2.b;
                    qVar2.b |= 8;
                    qVar2.g = z;
                    if (!w.b.L()) {
                        w.U();
                    }
                    s sVar = (s) w.b;
                    q qVar3 = (q) w2.Q();
                    qVar3.getClass();
                    sVar.f = qVar3;
                    sVar.b |= 8;
                    eVar.b = (s) w.Q();
                    fVar.f(eVar.b);
                    if (!z) {
                        try {
                            fVar.e(eVar.c, "onDownloadFinished").close();
                        } catch (IOException e) {
                            int i = com.google.android.gms.ads.internal.util.c.a;
                            h.m("Unable to truncate partially downloaded file.", e);
                        }
                    }
                } catch (com.google.android.gms.ads.cache.g e2) {
                    int i2 = com.google.android.gms.ads.internal.util.c.a;
                    h.h("Unable to update entry's download state.", e2);
                }
            }
        }
    }

    public final synchronized void c(String str) {
        Future future = (Future) this.e.remove(str);
        if (future == null) {
            return;
        }
        this.c.remove(str);
        this.d.remove(str);
        future.cancel(true);
    }

    public final synchronized boolean d(String str) {
        return this.c.containsKey(str);
    }

    public final synchronized boolean e(String str, OutputStream outputStream, com.google.android.gms.ads.cache.c cVar, com.google.android.gms.ads.cache.d dVar) {
        bul bulVar = this.c;
        if (bulVar.containsKey(str)) {
            return false;
        }
        bulVar.put(str, cVar);
        if (dVar != null) {
            this.d.put(str, dVar);
        }
        this.e.put(str, ((asmf) this.b).submit(new a(this, str, outputStream, Binder.getCallingUid())));
        return true;
    }
}
