package com.google.android.gms.ads.nonagon.signals.gmscore;

import android.content.pm.PackageInfo;
import com.google.android.gms.ads.internal.config.p;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.chimera.modules.admob.AppContextProvider;
import defpackage.bhsp;
import defpackage.eiho;
import defpackage.enox;
import defpackage.enps;
import defpackage.enqc;
import defpackage.ensj;
import defpackage.enss;
import defpackage.febw;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.osp;
import defpackage.osr;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
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
    public final enss b() {
        enss i = ensj.i(null);
        final com.google.android.gms.ads.adinfo.g gVar = this.e;
        final String str = this.a;
        final int i2 = this.d;
        final PackageInfo packageInfo = this.c;
        enss g = enps.g(i, new enqc() { // from class: com.google.android.gms.ads.adinfo.d
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                enss g2;
                final g gVar2 = g.this;
                final String str2 = str;
                enss i3 = ensj.i(str2);
                if (gVar2.b == null) {
                    return i3;
                }
                enss[] enssVarArr = new enss[2];
                if (((Boolean) p.K.g()).booleanValue()) {
                    g2 = ensj.i(null);
                } else {
                    g2 = enox.g(enps.f(g.a(AppContextProvider.a(), i2), new eiho() { // from class: com.google.android.gms.ads.adinfo.a
                        @Override // defpackage.eiho
                        public final Object apply(Object obj2) {
                            com.google.android.gms.ads.identifier.c cVar = (com.google.android.gms.ads.identifier.c) obj2;
                            fecj v = com.google.ads.afma.proto2api.b.a.v();
                            String str3 = cVar.a;
                            if (!v.b.L()) {
                                v.U();
                            }
                            fecp fecpVar = v.b;
                            com.google.ads.afma.proto2api.b bVar = (com.google.ads.afma.proto2api.b) fecpVar;
                            str3.getClass();
                            bVar.d |= 33554432;
                            bVar.n = str3;
                            boolean z = cVar.b;
                            if (!fecpVar.L()) {
                                v.U();
                            }
                            fecp fecpVar2 = v.b;
                            com.google.ads.afma.proto2api.b bVar2 = (com.google.ads.afma.proto2api.b) fecpVar2;
                            bVar2.d |= 134217728;
                            bVar2.p = z;
                            if (!fecpVar2.L()) {
                                v.U();
                            }
                            com.google.ads.afma.proto2api.b bVar3 = (com.google.ads.afma.proto2api.b) v.b;
                            bVar3.o = 5;
                            bVar3.d |= 67108864;
                            return (com.google.ads.afma.proto2api.b) v.Q();
                        }
                    }, com.google.android.gms.ads.internal.util.future.e.d), Throwable.class, new enqc() { // from class: com.google.android.gms.ads.adinfo.b
                        @Override // defpackage.enqc
                        public final enss a(Object obj2) {
                            return ensj.i(null);
                        }
                    }, com.google.android.gms.ads.internal.util.future.e.d);
                }
                final PackageInfo packageInfo2 = packageInfo;
                enssVarArr[0] = g2;
                enssVarArr[1] = com.google.android.gms.ads.internal.util.future.e.a.submit(new Callable() { // from class: com.google.android.gms.ads.adinfo.f
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        g gVar3 = g.this;
                        PackageInfo packageInfo3 = packageInfo2;
                        try {
                            if (packageInfo3 == null) {
                                throw new IllegalArgumentException("Package Info cannot be null");
                            }
                            com.google.ads.afma.proto2api.b a = bhsp.a(gVar3.a, packageInfo3.packageName, Long.toString(packageInfo3.versionCode));
                            if (a.f.isEmpty()) {
                                return null;
                            }
                            return a;
                        } catch (Throwable th) {
                            int i4 = com.google.android.gms.ads.internal.util.c.a;
                            h.d("Failed to get gmscore side info.");
                            com.google.android.gms.ads.internal.c.d().d(th, "SignalsDecorator.maybeGetSignals");
                            return null;
                        }
                    }
                });
                return enps.f(ensj.f(enssVarArr), new eiho() { // from class: com.google.android.gms.ads.adinfo.e
                    @Override // defpackage.eiho
                    public final Object apply(Object obj2) {
                        fecj v = com.google.ads.afma.proto2api.b.a.v();
                        for (com.google.ads.afma.proto2api.b bVar : (List) obj2) {
                            if (bVar != null) {
                                try {
                                    v.D(bVar.r(), febw.a());
                                } catch (fedk unused) {
                                }
                            }
                        }
                        byte[] c = osr.c(str2, new String(((com.google.ads.afma.proto2api.b) v.Q()).r(), Charset.forName("ISO-8859-1")));
                        String b = c != null ? osp.b(c) : Integer.toString(7);
                        int i4 = com.google.android.gms.ads.internal.util.c.a;
                        h.d("Merged client and gmscore signals");
                        return b;
                    }
                }, com.google.android.gms.ads.internal.util.future.e.d);
            }
        }, com.google.android.gms.ads.internal.util.future.e.a);
        eiho eihoVar = new eiho() { // from class: com.google.android.gms.ads.nonagon.signals.gmscore.g
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                return new j((String) obj);
            }
        };
        Executor executor = this.b;
        return enox.g(enps.f(g, eihoVar, executor), Throwable.class, new enqc() { // from class: com.google.android.gms.ads.nonagon.signals.gmscore.h
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                return ensj.i(new j(i.this.a));
            }
        }, executor);
    }
}
