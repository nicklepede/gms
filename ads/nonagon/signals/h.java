package com.google.android.gms.ads.nonagon.signals;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.config.p;
import com.google.android.gms.ads.internal.flag.o;
import com.google.android.gms.ads.nonagon.util.logging.cui.j;
import com.google.android.gms.ads.nonagon.util.logging.cui.k;
import com.google.android.gms.ads.nonagon.util.logging.cui.n;
import defpackage.ensj;
import defpackage.enss;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class h {
    public final Set a;
    public final com.google.android.gms.ads.nonagon.csi.d b;
    public long c = 0;
    public int d = 0;
    private final Context e;
    private final Executor f;
    private final k g;

    public h(Context context, Executor executor, Set set, k kVar, com.google.android.gms.ads.nonagon.csi.d dVar) {
        this.e = context;
        this.f = executor;
        this.a = set;
        this.g = kVar;
        this.b = dVar;
    }

    public final enss a(final Object obj, final Bundle bundle) {
        com.google.android.gms.ads.nonagon.util.logging.cui.b a = com.google.android.gms.ads.nonagon.util.logging.cui.a.a(this.e, 8);
        a.k();
        Set<e> set = this.a;
        final ArrayList arrayList = new ArrayList(set.size());
        List arrayList2 = new ArrayList();
        if (!((String) p.bP.g()).isEmpty()) {
            arrayList2 = Arrays.asList(((String) p.bP.g()).split(","));
        }
        com.google.android.gms.ads.internal.c.j();
        this.c = SystemClock.elapsedRealtime();
        final Bundle bundle2 = new Bundle();
        if (((Boolean) p.P.g()).booleanValue() && bundle != null) {
            com.google.android.gms.ads.internal.c.j();
            bundle.putLong(com.google.android.gms.ads.nonagon.csi.a.GMS_SIGNALS_START.N, System.currentTimeMillis());
        }
        for (final e eVar : set) {
            if (!arrayList2.contains(String.valueOf(eVar.a()))) {
                com.google.android.gms.ads.internal.c.j();
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                enss b = eVar.b();
                b.hn(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signals.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.gms.ads.internal.c.j();
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        boolean booleanValue = ((Boolean) o.a.d()).booleanValue();
                        Bundle bundle3 = bundle2;
                        e eVar2 = eVar;
                        if (booleanValue) {
                            eVar2.getClass().getCanonicalName();
                        }
                        h hVar = h.this;
                        if (((Boolean) p.P.g()).booleanValue() && ((Boolean) p.R.g()).booleanValue()) {
                            synchronized (hVar) {
                                bundle3.putLong("sig" + eVar2.a(), elapsedRealtime2);
                            }
                        }
                        if (((Boolean) p.N.g()).booleanValue()) {
                            final com.google.android.gms.ads.nonagon.csi.c cVar = new com.google.android.gms.ads.nonagon.csi.c(hVar.b);
                            cVar.a.putAll(cVar.b.c);
                            cVar.a("action", "lat_ms");
                            cVar.a("lat_grp", "sig_lat_grp");
                            cVar.a("lat_id", String.valueOf(eVar2.a()));
                            cVar.a("clat_ms", String.valueOf(elapsedRealtime2));
                            if (((Boolean) p.O.g()).booleanValue()) {
                                synchronized (hVar) {
                                    hVar.d++;
                                }
                                cVar.a("seq_num", com.google.android.gms.ads.internal.c.d().c.a.a());
                                synchronized (hVar) {
                                    if (hVar.d == hVar.a.size() && hVar.c != 0) {
                                        hVar.d = 0;
                                        com.google.android.gms.ads.internal.c.j();
                                        String valueOf = String.valueOf(SystemClock.elapsedRealtime() - hVar.c);
                                        eVar2.a();
                                        eVar2.a();
                                        cVar.a("lat_gmssg", valueOf);
                                    }
                                }
                            }
                            cVar.b.b.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.csi.b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    c cVar2 = c.this;
                                    cVar2.b.a.c(cVar2.a, true);
                                }
                            });
                        }
                    }
                }, com.google.android.gms.ads.internal.util.future.e.d);
                arrayList.add(b);
            }
        }
        enss a2 = ensj.c(arrayList).a(new Callable() { // from class: com.google.android.gms.ads.nonagon.signals.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object obj2;
                Bundle bundle3;
                Iterator it = arrayList.iterator();
                while (true) {
                    obj2 = obj;
                    if (!it.hasNext()) {
                        break;
                    }
                    c cVar = (c) ((enss) it.next()).get();
                    if (cVar != null) {
                        cVar.a(obj2);
                    }
                }
                if (((Boolean) p.P.g()).booleanValue() && (bundle3 = bundle) != null) {
                    Bundle bundle4 = bundle2;
                    com.google.android.gms.ads.internal.c.j();
                    bundle3.putLong(com.google.android.gms.ads.nonagon.csi.a.GMS_SIGNALS_END.N, System.currentTimeMillis());
                    bundle3.putBundle("gms_sig_latency_key", bundle4);
                }
                return obj2;
            }
        }, this.f);
        if (n.a()) {
            j.a(a2, this.g, a);
        }
        return a2;
    }
}
