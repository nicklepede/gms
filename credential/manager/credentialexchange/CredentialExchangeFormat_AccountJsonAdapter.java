package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.awhm;
import defpackage.flfl;
import defpackage.flfq;
import defpackage.flfr;
import defpackage.flft;
import defpackage.flfy;
import defpackage.flgn;
import defpackage.flhd;
import defpackage.flhm;
import defpackage.fxsw;
import defpackage.fxxm;
import java.lang.reflect.Constructor;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class CredentialExchangeFormat_AccountJsonAdapter extends flfl {
    private final flfr a;
    private final flfl b;
    private final flfl c;
    private final flfl d;
    private final flfl e;
    private final flfl f;
    private volatile Constructor g;

    public CredentialExchangeFormat_AccountJsonAdapter(flgn flgnVar) {
        fxxm.f(flgnVar, "moshi");
        this.a = flfq.a("id", "username", "email", "fullName", "collections", "items", "extensions");
        fxsw fxswVar = fxsw.a;
        this.b = flgnVar.d(String.class, fxswVar, "id");
        this.c = flgnVar.d(String.class, fxswVar, "fullName");
        this.d = flgnVar.d(flhd.b(List.class, CredentialExchangeFormat$Collection.class), fxswVar, "collections");
        this.e = flgnVar.d(flhd.b(List.class, CredentialExchangeFormat$Item.class), fxswVar, "items");
        this.f = flgnVar.d(flhd.b(List.class, awhm.class), fxswVar, "extensions");
    }

    @Override // defpackage.flfl
    public final /* bridge */ /* synthetic */ Object a(flft flftVar) {
        flftVar.i();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        while (flftVar.o()) {
            switch (flftVar.c(this.a)) {
                case -1:
                    flftVar.m();
                    flftVar.n();
                    break;
                case 0:
                    str = (String) this.b.a(flftVar);
                    if (str == null) {
                        throw flhm.c("id", "id", flftVar);
                    }
                    break;
                case 1:
                    str2 = (String) this.b.a(flftVar);
                    if (str2 == null) {
                        throw flhm.c("username", "username", flftVar);
                    }
                    break;
                case 2:
                    str3 = (String) this.b.a(flftVar);
                    if (str3 == null) {
                        throw flhm.c("email", "email", flftVar);
                    }
                    break;
                case 3:
                    str4 = (String) this.c.a(flftVar);
                    i &= -9;
                    break;
                case 4:
                    list = (List) this.d.a(flftVar);
                    if (list == null) {
                        throw flhm.c("collections", "collections", flftVar);
                    }
                    break;
                case 5:
                    list2 = (List) this.e.a(flftVar);
                    if (list2 == null) {
                        throw flhm.c("items", "items", flftVar);
                    }
                    break;
                case 6:
                    list3 = (List) this.f.a(flftVar);
                    if (list3 == null) {
                        throw flhm.c("extensions", "extensions", flftVar);
                    }
                    i &= -65;
                    break;
            }
        }
        flftVar.k();
        if (i == -73) {
            if (str == null) {
                throw flhm.b("id", "id", flftVar);
            }
            if (str2 == null) {
                throw flhm.b("username", "username", flftVar);
            }
            if (str3 == null) {
                throw flhm.b("email", "email", flftVar);
            }
            if (list == null) {
                throw flhm.b("collections", "collections", flftVar);
            }
            if (list2 == null) {
                throw flhm.b("items", "items", flftVar);
            }
            fxxm.d(list3, "null cannot be cast to non-null type kotlin.collections.List<com.google.android.gms.credential.manager.credentialexchange.CredentialExchangeFormat.Extension>");
            return new CredentialExchangeFormat$Account(str, str2, str3, str4, list, list2, list3);
        }
        Constructor constructor = this.g;
        int i2 = i;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            fxxm.c(cls);
            Class cls2 = flhm.d;
            fxxm.c(cls2);
            constructor = CredentialExchangeFormat$Account.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, List.class, List.class, List.class, cls, cls2);
            fxxm.e(constructor, "getDeclaredConstructor(...)");
            this.g = constructor;
        }
        if (str == null) {
            throw flhm.b("id", "id", flftVar);
        }
        if (str2 == null) {
            throw flhm.b("username", "username", flftVar);
        }
        if (str3 == null) {
            throw flhm.b("email", "email", flftVar);
        }
        if (list == null) {
            throw flhm.b("collections", "collections", flftVar);
        }
        if (list2 == null) {
            throw flhm.b("items", "items", flftVar);
        }
        Object newInstance = constructor.newInstance(str, str2, str3, str4, list, list2, list3, Integer.valueOf(i2), null);
        fxxm.e(newInstance, "newInstance(...)");
        return (CredentialExchangeFormat$Account) newInstance;
    }

    @Override // defpackage.flfl
    public final /* bridge */ /* synthetic */ void b(flfy flfyVar, Object obj) {
        CredentialExchangeFormat$Account credentialExchangeFormat$Account = (CredentialExchangeFormat$Account) obj;
        if (credentialExchangeFormat$Account == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        flfyVar.d();
        flfyVar.j("id");
        flfl flflVar = this.b;
        flflVar.b(flfyVar, credentialExchangeFormat$Account.a);
        flfyVar.j("username");
        flflVar.b(flfyVar, credentialExchangeFormat$Account.b);
        flfyVar.j("email");
        flflVar.b(flfyVar, credentialExchangeFormat$Account.c);
        flfyVar.j("fullName");
        this.c.b(flfyVar, credentialExchangeFormat$Account.d);
        flfyVar.j("collections");
        this.d.b(flfyVar, credentialExchangeFormat$Account.e);
        flfyVar.j("items");
        this.e.b(flfyVar, credentialExchangeFormat$Account.f);
        flfyVar.j("extensions");
        this.f.b(flfyVar, credentialExchangeFormat$Account.g);
        flfyVar.f();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CredentialExchangeFormat.Account)";
    }
}
