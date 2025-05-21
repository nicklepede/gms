package com.google.android.gms.ads.internal.js.function;

import com.google.android.gms.ads.internal.js.ab;
import com.google.android.gms.ads.internal.js.ag;
import com.google.android.gms.ads.internal.js.ah;
import defpackage.enqc;
import defpackage.enss;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class o implements enqc {
    public final c a;
    public final d b;
    public final String c;
    private final ah d;

    public o(ah ahVar, String str, d dVar, c cVar) {
        this.d = ahVar;
        this.c = str;
        this.b = dVar;
        this.a = cVar;
    }

    @Override // defpackage.enqc
    public final enss a(Object obj) {
        return b(obj);
    }

    public final enss b(Object obj) {
        ab a;
        com.google.android.gms.ads.internal.util.future.i iVar = new com.google.android.gms.ads.internal.util.future.i();
        final ah ahVar = this.d;
        Object obj2 = ahVar.a;
        synchronized (obj2) {
            synchronized (obj2) {
                ag agVar = ahVar.g;
                if (agVar != null && ahVar.h == 0) {
                    agVar.i(new com.google.android.gms.ads.internal.util.promise.c() { // from class: com.google.android.gms.ads.internal.js.p
                        @Override // com.google.android.gms.ads.internal.util.promise.c
                        public final void a(Object obj3) {
                            if (((k) obj3).a.l()) {
                                ah.this.h = 1;
                            }
                        }
                    }, new com.google.android.gms.ads.internal.util.promise.a() { // from class: com.google.android.gms.ads.internal.js.q
                        @Override // com.google.android.gms.ads.internal.util.promise.a
                        public final void a() {
                        }
                    });
                }
            }
            a.i(new l(this, a, obj, iVar), new m(iVar, a));
            return iVar;
        }
        ag agVar2 = ahVar.g;
        if (agVar2 != null && agVar2.e() != -1) {
            int i = ahVar.h;
            if (i == 0) {
                a = ahVar.g.a();
            } else if (i == 1) {
                ahVar.h = 2;
                ahVar.a();
                a = ahVar.g.a();
            } else {
                a = ahVar.g.a();
            }
            a.i(new l(this, a, obj, iVar), new m(iVar, a));
            return iVar;
        }
        ahVar.h = 2;
        ahVar.g = ahVar.a();
        a = ahVar.g.a();
        a.i(new l(this, a, obj, iVar), new m(iVar, a));
        return iVar;
    }

    public final Object c(Object obj, long j) {
        try {
            return b(obj).get(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new a(e);
        } catch (CancellationException e2) {
            e = e2;
            throw new a(e);
        } catch (ExecutionException e3) {
            e = e3;
            throw new a(e);
        } catch (TimeoutException e4) {
            e = e4;
            throw new a(e);
        }
    }
}
