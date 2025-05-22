package com.google.android.gms.ads.nonagon.signals.gmscore;

import android.content.pm.PackageInfo;
import com.google.android.gms.ads.internal.config.p;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.chimera.modules.admob.AppContextProvider;
import defpackage.bjxe;
import defpackage.ekut;
import defpackage.eqcq;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.eqgo;
import defpackage.fgqp;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.qls;
import defpackage.qlu;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class i implements com.google.android.gms.ads.nonagon.signals.e {
    public final String a;
    private final Executor b;
    private final PackageInfo c;
    private final int d;
    private final com.google.android.gms.ads.adinfo.g e;

    public i(com.google.android.gms.ads.adinfo.g gVar, Executor executor, String str, PackageInfo packageInfo, int i) {
        this.e = gVar;
        this.b = executor;
        this.a = str;
        this.c = packageInfo;
        this.d = i;
    }

    @Override // com.google.android.gms.ads.nonagon.signals.e
    public final int a() {
        return com.google.android.gms.ads.nonagon.signals.d.a(42);
    }

    @Override // com.google.android.gms.ads.nonagon.signals.e
    public final eqgl b() {
        eqgl i = eqgc.i(null);
        final com.google.android.gms.ads.adinfo.g gVar = this.e;
        final String str = this.a;
        final int i2 = this.d;
        final PackageInfo packageInfo = this.c;
        eqgl g = eqdl.g(i, new eqdv() { // from class: com.google.android.gms.ads.adinfo.d
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                eqgl g2;
                final g gVar2 = g.this;
                final String str2 = str;
                eqgl i3 = eqgc.i(str2);
                if (gVar2.b == null) {
                    return i3;
                }
                eqgl[] eqglVarArr = new eqgl[2];
                if (((Boolean) p.K.g()).booleanValue()) {
                    g2 = eqgc.i(null);
                } else {
                    eqgl a = g.a(AppContextProvider.a(), i2);
                    ekut ekutVar = new ekut() { // from class: com.google.android.gms.ads.adinfo.a
                        @Override // defpackage.ekut
                        public final Object apply(Object obj2) {
                            com.google.android.gms.ads.identifier.c cVar = (com.google.android.gms.ads.identifier.c) obj2;
                            fgrc v = com.google.ads.afma.proto2api.b.a.v();
                            String str3 = cVar.a;
                            if (!v.b.L()) {
                                v.U();
                            }
                            fgri fgriVar = v.b;
                            com.google.ads.afma.proto2api.b bVar = (com.google.ads.afma.proto2api.b) fgriVar;
                            str3.getClass();
                            bVar.d |= 33554432;
                            bVar.n = str3;
                            boolean z = cVar.b;
                            if (!fgriVar.L()) {
                                v.U();
                            }
                            fgri fgriVar2 = v.b;
                            com.google.ads.afma.proto2api.b bVar2 = (com.google.ads.afma.proto2api.b) fgriVar2;
                            bVar2.d |= 134217728;
                            bVar2.p = z;
                            if (!fgriVar2.L()) {
                                v.U();
                            }
                            com.google.ads.afma.proto2api.b bVar3 = (com.google.ads.afma.proto2api.b) v.b;
                            bVar3.o = 5;
                            bVar3.d |= 67108864;
                            return (com.google.ads.afma.proto2api.b) v.Q();
                        }
                    };
                    eqgo eqgoVar = com.google.android.gms.ads.internal.util.future.e.d;
                    g2 = eqcq.g(eqdl.f(a, ekutVar, eqgoVar), Throwable.class, new eqdv() { // from class: com.google.android.gms.ads.adinfo.b
                        @Override // defpackage.eqdv
                        public final eqgl a(Object obj2) {
                            return eqgc.i(null);
                        }
                    }, eqgoVar);
                }
                final PackageInfo packageInfo2 = packageInfo;
                eqglVarArr[0] = g2;
                eqglVarArr[1] = com.google.android.gms.ads.internal.util.future.e.a.submit(new Callable() { // from class: com.google.android.gms.ads.adinfo.f
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        g gVar3 = g.this;
                        PackageInfo packageInfo3 = packageInfo2;
                        try {
                            if (packageInfo3 == null) {
                                throw new IllegalArgumentException("Package Info cannot be null");
                            }
                            com.google.ads.afma.proto2api.b a2 = bjxe.a(gVar3.a, packageInfo3.packageName, Long.toString(packageInfo3.versionCode));
                            if (a2.f.isEmpty()) {
                                return null;
                            }
                            return a2;
                        } catch (Throwable th) {
                            int i4 = com.google.android.gms.ads.internal.util.c.a;
                            h.d("Failed to get gmscore side info.");
                            com.google.android.gms.ads.internal.c.d().d(th, "SignalsDecorator.maybeGetSignals");
                            return null;
                        }
                    }
                });
                return eqdl.f(eqgc.f(eqglVarArr), new ekut() { // from class: com.google.android.gms.ads.adinfo.e
                    @Override // defpackage.ekut
                    public final Object apply(Object obj2) {
                        fgrc v = com.google.ads.afma.proto2api.b.a.v();
                        for (com.google.ads.afma.proto2api.b bVar : (List) obj2) {
                            if (bVar != null) {
                                try {
                                    v.D(bVar.r(), fgqp.a());
                                } catch (fgsd unused) {
                                }
                            }
                        }
                        byte[] c = qlu.c(str2, new String(((com.google.ads.afma.proto2api.b) v.Q()).r(), Charset.forName("ISO-8859-1")));
                        String b = c != null ? qls.b(c) : Integer.toString(7);
                        int i4 = com.google.android.gms.ads.internal.util.c.a;
                        h.d("Merged client and gmscore signals");
                        return b;
                    }
                }, com.google.android.gms.ads.internal.util.future.e.d);
            }
        }, com.google.android.gms.ads.internal.util.future.e.a);
        ekut ekutVar = new ekut() { // from class: com.google.android.gms.ads.nonagon.signals.gmscore.g
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                return new j((String) obj);
            }
        };
        Executor executor = this.b;
        return eqcq.g(eqdl.f(g, ekutVar, executor), Throwable.class, new eqdv() { // from class: com.google.android.gms.ads.nonagon.signals.gmscore.h
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                return eqgc.i(new j(i.this.a));
            }
        }, executor);
    }
}
