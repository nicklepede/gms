package com.google.android.gms.ads.social;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import defpackage.eiho;
import defpackage.enps;
import defpackage.enqc;
import defpackage.ensj;
import defpackage.enss;
import defpackage.enxz;
import defpackage.enya;
import defpackage.enyb;
import defpackage.fecj;
import defpackage.fjwt;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class GmsDoritosProvider {
    private static GmsDoritosProvider e;
    private static final Object f = new Object();
    public final Context a;
    public final i b;
    public final e c;
    public final b d;

    @Deprecated
    public GmsDoritosProvider(Context context) {
        i a = i.a(context);
        e a2 = e.a(context);
        b bVar = new b(context);
        this.a = context;
        this.b = a;
        this.d = bVar;
        this.c = a2;
    }

    public static GmsDoritosProvider a(Context context) {
        GmsDoritosProvider gmsDoritosProvider;
        synchronized (f) {
            if (e == null) {
                e = new GmsDoritosProvider(context);
            }
            gmsDoritosProvider = e;
        }
        return gmsDoritosProvider;
    }

    public enss getDoritosCookieAsynchronously(final String str) {
        return (fjwt.k() && u.b(this.a, str)) ? ensj.i(null) : enps.g(com.google.android.gms.ads.internal.util.future.e.a.submit(new Callable() { // from class: com.google.android.gms.ads.social.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                if (fjwt.j()) {
                    if (u.b(GmsDoritosProvider.this.a, str)) {
                        return a.GAIALESS_DORITOS;
                    }
                }
                return a.DORITOS_WITH_GAIA;
            }
        }), new enqc() { // from class: com.google.android.gms.ads.social.m
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                return GmsDoritosProvider.this.getDoritosCookieAsynchronouslyWithType(str, (a) obj);
            }
        }, com.google.android.gms.ads.internal.util.future.e.a);
    }

    public enss getDoritosCookieAsynchronouslyWithType(final String str, final a aVar) {
        return (fjwt.k() && u.b(this.a, str)) ? ensj.i(null) : com.google.android.gms.ads.internal.util.future.e.a.submit(new Callable() { // from class: com.google.android.gms.ads.social.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                GmsDoritosProvider gmsDoritosProvider = GmsDoritosProvider.this;
                e eVar = gmsDoritosProvider.c;
                eVar.b();
                Context context = gmsDoritosProvider.a;
                String str2 = str;
                if (u.a(context, str2)) {
                    i iVar = gmsDoritosProvider.b;
                    String c = iVar.c(str2);
                    if (c == null) {
                        Account[] p = iVar.b.p("com.google");
                        c = p.length > 0 ? p[0].name : null;
                    }
                    if (!TextUtils.isEmpty(c)) {
                        a aVar2 = aVar;
                        b bVar = gmsDoritosProvider.d;
                        String a = bVar.a(c, aVar2);
                        if (!TextUtils.isEmpty(a)) {
                            return a;
                        }
                        int i = com.google.android.gms.ads.internal.util.c.a;
                        com.google.android.gms.ads.internal.util.client.h.d("DSID cookie not found. Running refresh task.");
                        eVar.c();
                        return bVar.a(c, aVar2);
                    }
                }
                return null;
            }
        });
    }

    public enss getDoritosCookieForActivePresenceManagerAccount(final String str) {
        return (fjwt.k() && u.b(this.a, str)) ? ensj.i(null) : enps.f(this.b.b(), new eiho() { // from class: com.google.android.gms.ads.social.p
            /* JADX WARN: Removed duplicated region for block: B:14:0x0041 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
            @Override // defpackage.eiho
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object apply(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.String r6 = (java.lang.String) r6
                    com.google.android.gms.ads.social.GmsDoritosProvider r0 = com.google.android.gms.ads.social.GmsDoritosProvider.this
                    com.google.android.gms.ads.social.e r1 = r0.c
                    r1.b()
                    com.google.android.gms.ads.social.a r2 = com.google.android.gms.ads.social.a.DORITOS_WITH_GAIA
                    boolean r3 = defpackage.fjwt.j()
                    if (r3 == 0) goto L1e
                    java.lang.String r3 = r2
                    android.content.Context r4 = r0.a
                    boolean r3 = com.google.android.gms.ads.social.u.b(r4, r3)
                    if (r3 == 0) goto L1e
                    com.google.android.gms.ads.social.a r3 = com.google.android.gms.ads.social.a.GAIALESS_DORITOS
                    goto L1f
                L1e:
                    r3 = r2
                L1f:
                    boolean r4 = android.text.TextUtils.isEmpty(r6)
                    if (r4 != 0) goto L41
                    com.google.android.gms.ads.social.b r0 = r0.d
                    java.lang.String r3 = r0.a(r6, r3)
                    boolean r4 = android.text.TextUtils.isEmpty(r3)
                    if (r4 == 0) goto L40
                    int r3 = com.google.android.gms.ads.internal.util.c.a
                    java.lang.String r3 = "DSID cookie not found. Running refresh task."
                    com.google.android.gms.ads.internal.util.client.h.d(r3)
                    r1.c()
                    java.lang.String r6 = r0.a(r6, r2)
                    return r6
                L40:
                    return r3
                L41:
                    r6 = 0
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.social.p.apply(java.lang.Object):java.lang.Object");
            }
        }, com.google.android.gms.ads.internal.util.future.e.a);
    }

    public enss getDoritosCookiesAsynchronously(final String str) {
        return (fjwt.k() && u.b(this.a, str)) ? ensj.i("") : enps.g(com.google.android.gms.ads.internal.util.future.e.a.submit(new Callable() { // from class: com.google.android.gms.ads.social.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                if (fjwt.j()) {
                    if (u.b(GmsDoritosProvider.this.a, str)) {
                        return a.GAIALESS_DORITOS;
                    }
                }
                return a.DORITOS_WITH_GAIA;
            }
        }), new enqc() { // from class: com.google.android.gms.ads.social.o
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                return GmsDoritosProvider.this.getDoritosCookiesAsynchronouslyWithType(str, (a) obj);
            }
        }, com.google.android.gms.ads.internal.util.future.e.a);
    }

    public enss getDoritosCookiesAsynchronouslyWithType(final String str, final a aVar) {
        return (fjwt.k() && u.b(this.a, str)) ? ensj.i("") : com.google.android.gms.ads.internal.util.future.e.a.submit(new Callable() { // from class: com.google.android.gms.ads.social.q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                GmsDoritosProvider gmsDoritosProvider = GmsDoritosProvider.this;
                e eVar = gmsDoritosProvider.c;
                eVar.b();
                i iVar = gmsDoritosProvider.b;
                String str2 = str;
                Account[] d = iVar.d();
                String c = iVar.c(str2);
                ArrayList arrayList = new ArrayList();
                if ((((Boolean) com.google.android.gms.ads.internal.config.p.aM.g()).booleanValue() || fjwt.j()) && gmsDoritosProvider.d.b(d)) {
                    eVar.c();
                }
                for (Account account : d) {
                    if (!TextUtils.isEmpty(account.name)) {
                        String a = gmsDoritosProvider.d.a(account.name, aVar);
                        if (!TextUtils.isEmpty(a)) {
                            fecj v = enya.a.v();
                            if (!v.b.L()) {
                                v.U();
                            }
                            enya enyaVar = (enya) v.b;
                            a.getClass();
                            enyaVar.b |= 1;
                            enyaVar.c = a;
                            if (account.name.equals(c)) {
                                if (!v.b.L()) {
                                    v.U();
                                }
                                enya.c((enya) v.b);
                            }
                            arrayList.add((enya) v.Q());
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    enya enyaVar2 = (enya) arrayList.get(0);
                    fecj fecjVar = (fecj) enyaVar2.iB(5, null);
                    fecjVar.X(enyaVar2);
                    if (!fecjVar.b.L()) {
                        fecjVar.U();
                    }
                    enya.b((enya) fecjVar.b);
                    arrayList.set(0, (enya) fecjVar.Q());
                }
                enxz enxzVar = (enxz) enyb.a.v();
                enxzVar.a(arrayList);
                return Base64.encodeToString(((enyb) enxzVar.Q()).r(), 10);
            }
        });
    }

    public enss getDoritosCookiesForActivePresenceManagerAccount(final String str) {
        return (fjwt.k() && u.b(this.a, str)) ? ensj.i("") : enps.f(this.b.b(), new eiho() { // from class: com.google.android.gms.ads.social.k
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                String str2 = (String) obj;
                GmsDoritosProvider gmsDoritosProvider = GmsDoritosProvider.this;
                e eVar = gmsDoritosProvider.c;
                eVar.b();
                a aVar = a.DORITOS_WITH_GAIA;
                if (fjwt.j()) {
                    if (u.b(gmsDoritosProvider.a, str)) {
                        aVar = a.GAIALESS_DORITOS;
                    }
                }
                Account[] d = gmsDoritosProvider.b.d();
                ArrayList arrayList = new ArrayList();
                if ((((Boolean) com.google.android.gms.ads.internal.config.p.aM.g()).booleanValue() || fjwt.j()) && gmsDoritosProvider.d.b(d)) {
                    eVar.c();
                }
                for (Account account : d) {
                    if (!TextUtils.isEmpty(account.name)) {
                        String a = gmsDoritosProvider.d.a(account.name, aVar);
                        if (!TextUtils.isEmpty(a)) {
                            fecj v = enya.a.v();
                            if (!v.b.L()) {
                                v.U();
                            }
                            enya enyaVar = (enya) v.b;
                            a.getClass();
                            enyaVar.b |= 1;
                            enyaVar.c = a;
                            if (account.name.equals(str2)) {
                                if (!v.b.L()) {
                                    v.U();
                                }
                                enya.c((enya) v.b);
                                if (!v.b.L()) {
                                    v.U();
                                }
                                enya.b((enya) v.b);
                                if (!v.b.L()) {
                                    v.U();
                                }
                                enya enyaVar2 = (enya) v.b;
                                enyaVar2.b |= 8;
                                enyaVar2.d = true;
                            }
                            arrayList.add((enya) v.Q());
                        }
                    }
                }
                enxz enxzVar = (enxz) enyb.a.v();
                enxzVar.a(arrayList);
                return Base64.encodeToString(((enyb) enxzVar.Q()).r(), 10);
            }
        }, com.google.android.gms.ads.internal.util.future.e.a);
    }
}
