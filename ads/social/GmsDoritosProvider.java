package com.google.android.gms.ads.social;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import defpackage.ekut;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.eqgo;
import defpackage.eqls;
import defpackage.eqlt;
import defpackage.eqlu;
import defpackage.fgrc;
import defpackage.fmmx;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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

    public eqgl getDoritosCookieAsynchronously(final String str) {
        if (fmmx.k() && u.b(this.a, str)) {
            return eqgc.i(null);
        }
        eqgo eqgoVar = com.google.android.gms.ads.internal.util.future.e.a;
        return eqdl.g(eqgoVar.submit(new Callable() { // from class: com.google.android.gms.ads.social.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                if (fmmx.j()) {
                    if (u.b(GmsDoritosProvider.this.a, str)) {
                        return a.GAIALESS_DORITOS;
                    }
                }
                return a.DORITOS_WITH_GAIA;
            }
        }), new eqdv() { // from class: com.google.android.gms.ads.social.m
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                return GmsDoritosProvider.this.getDoritosCookieAsynchronouslyWithType(str, (a) obj);
            }
        }, eqgoVar);
    }

    public eqgl getDoritosCookieAsynchronouslyWithType(final String str, final a aVar) {
        return (fmmx.k() && u.b(this.a, str)) ? eqgc.i(null) : com.google.android.gms.ads.internal.util.future.e.a.submit(new Callable() { // from class: com.google.android.gms.ads.social.j
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

    public eqgl getDoritosCookieForActivePresenceManagerAccount(final String str) {
        return (fmmx.k() && u.b(this.a, str)) ? eqgc.i(null) : eqdl.f(this.b.b(), new ekut() { // from class: com.google.android.gms.ads.social.p
            /* JADX WARN: Removed duplicated region for block: B:14:0x0041 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
            @Override // defpackage.ekut
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
                    boolean r3 = defpackage.fmmx.j()
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

    public eqgl getDoritosCookiesAsynchronously(final String str) {
        if (fmmx.k() && u.b(this.a, str)) {
            return eqgc.i("");
        }
        eqgo eqgoVar = com.google.android.gms.ads.internal.util.future.e.a;
        return eqdl.g(eqgoVar.submit(new Callable() { // from class: com.google.android.gms.ads.social.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                if (fmmx.j()) {
                    if (u.b(GmsDoritosProvider.this.a, str)) {
                        return a.GAIALESS_DORITOS;
                    }
                }
                return a.DORITOS_WITH_GAIA;
            }
        }), new eqdv() { // from class: com.google.android.gms.ads.social.o
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                return GmsDoritosProvider.this.getDoritosCookiesAsynchronouslyWithType(str, (a) obj);
            }
        }, eqgoVar);
    }

    public eqgl getDoritosCookiesAsynchronouslyWithType(final String str, final a aVar) {
        return (fmmx.k() && u.b(this.a, str)) ? eqgc.i("") : com.google.android.gms.ads.internal.util.future.e.a.submit(new Callable() { // from class: com.google.android.gms.ads.social.q
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
                if ((((Boolean) com.google.android.gms.ads.internal.config.p.aN.g()).booleanValue() || fmmx.j()) && gmsDoritosProvider.d.b(d)) {
                    eVar.c();
                }
                for (Account account : d) {
                    if (!TextUtils.isEmpty(account.name)) {
                        String a = gmsDoritosProvider.d.a(account.name, aVar);
                        if (!TextUtils.isEmpty(a)) {
                            fgrc v = eqlt.a.v();
                            if (!v.b.L()) {
                                v.U();
                            }
                            eqlt eqltVar = (eqlt) v.b;
                            a.getClass();
                            eqltVar.b |= 1;
                            eqltVar.c = a;
                            if (account.name.equals(c)) {
                                if (!v.b.L()) {
                                    v.U();
                                }
                                eqlt.c((eqlt) v.b);
                            }
                            arrayList.add((eqlt) v.Q());
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    eqlt eqltVar2 = (eqlt) arrayList.get(0);
                    fgrc fgrcVar = (fgrc) eqltVar2.iQ(5, null);
                    fgrcVar.X(eqltVar2);
                    if (!fgrcVar.b.L()) {
                        fgrcVar.U();
                    }
                    eqlt.b((eqlt) fgrcVar.b);
                    arrayList.set(0, (eqlt) fgrcVar.Q());
                }
                eqls eqlsVar = (eqls) eqlu.a.v();
                eqlsVar.a(arrayList);
                return Base64.encodeToString(((eqlu) eqlsVar.Q()).r(), 10);
            }
        });
    }

    public eqgl getDoritosCookiesForActivePresenceManagerAccount(final String str) {
        return (fmmx.k() && u.b(this.a, str)) ? eqgc.i("") : eqdl.f(this.b.b(), new ekut() { // from class: com.google.android.gms.ads.social.k
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                String str2 = (String) obj;
                GmsDoritosProvider gmsDoritosProvider = GmsDoritosProvider.this;
                e eVar = gmsDoritosProvider.c;
                eVar.b();
                a aVar = a.DORITOS_WITH_GAIA;
                if (fmmx.j()) {
                    if (u.b(gmsDoritosProvider.a, str)) {
                        aVar = a.GAIALESS_DORITOS;
                    }
                }
                Account[] d = gmsDoritosProvider.b.d();
                ArrayList arrayList = new ArrayList();
                if ((((Boolean) com.google.android.gms.ads.internal.config.p.aN.g()).booleanValue() || fmmx.j()) && gmsDoritosProvider.d.b(d)) {
                    eVar.c();
                }
                for (Account account : d) {
                    if (!TextUtils.isEmpty(account.name)) {
                        String a = gmsDoritosProvider.d.a(account.name, aVar);
                        if (!TextUtils.isEmpty(a)) {
                            fgrc v = eqlt.a.v();
                            if (!v.b.L()) {
                                v.U();
                            }
                            eqlt eqltVar = (eqlt) v.b;
                            a.getClass();
                            eqltVar.b |= 1;
                            eqltVar.c = a;
                            if (account.name.equals(str2)) {
                                if (!v.b.L()) {
                                    v.U();
                                }
                                eqlt.c((eqlt) v.b);
                                if (!v.b.L()) {
                                    v.U();
                                }
                                eqlt.b((eqlt) v.b);
                                if (!v.b.L()) {
                                    v.U();
                                }
                                eqlt eqltVar2 = (eqlt) v.b;
                                eqltVar2.b |= 8;
                                eqltVar2.d = true;
                            }
                            arrayList.add((eqlt) v.Q());
                        }
                    }
                }
                eqls eqlsVar = (eqls) eqlu.a.v();
                eqlsVar.a(arrayList);
                return Base64.encodeToString(((eqlu) eqlsVar.Q()).r(), 10);
            }
        }, com.google.android.gms.ads.internal.util.future.e.a);
    }
}
