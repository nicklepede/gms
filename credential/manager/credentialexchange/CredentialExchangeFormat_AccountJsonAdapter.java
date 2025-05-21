package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.audh;
import defpackage.fipo;
import defpackage.fipt;
import defpackage.fipu;
import defpackage.fipw;
import defpackage.fiqb;
import defpackage.fiqq;
import defpackage.firg;
import defpackage.firp;
import defpackage.fuwy;
import defpackage.fvbo;
import java.lang.reflect.Constructor;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class CredentialExchangeFormat_AccountJsonAdapter extends fipo {
    private final fipu a;
    private final fipo b;
    private final fipo c;
    private final fipo d;
    private final fipo e;
    private final fipo f;
    private volatile Constructor g;

    public CredentialExchangeFormat_AccountJsonAdapter(fiqq fiqqVar) {
        fvbo.f(fiqqVar, "moshi");
        this.a = fipt.a("id", "username", "email", "fullName", "collections", "items", "extensions");
        fuwy fuwyVar = fuwy.a;
        this.b = fiqqVar.d(String.class, fuwyVar, "id");
        this.c = fiqqVar.d(String.class, fuwyVar, "fullName");
        this.d = fiqqVar.d(firg.b(List.class, CredentialExchangeFormat$Collection.class), fuwyVar, "collections");
        this.e = fiqqVar.d(firg.b(List.class, CredentialExchangeFormat$Item.class), fuwyVar, "items");
        this.f = fiqqVar.d(firg.b(List.class, audh.class), fuwyVar, "extensions");
    }

    @Override // defpackage.fipo
    public final /* bridge */ /* synthetic */ Object a(fipw fipwVar) {
        fipwVar.i();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        while (fipwVar.o()) {
            switch (fipwVar.c(this.a)) {
                case -1:
                    fipwVar.m();
                    fipwVar.n();
                    break;
                case 0:
                    str = (String) this.b.a(fipwVar);
                    if (str == null) {
                        throw firp.c("id", "id", fipwVar);
                    }
                    break;
                case 1:
                    str2 = (String) this.b.a(fipwVar);
                    if (str2 == null) {
                        throw firp.c("username", "username", fipwVar);
                    }
                    break;
                case 2:
                    str3 = (String) this.b.a(fipwVar);
                    if (str3 == null) {
                        throw firp.c("email", "email", fipwVar);
                    }
                    break;
                case 3:
                    str4 = (String) this.c.a(fipwVar);
                    i &= -9;
                    break;
                case 4:
                    list = (List) this.d.a(fipwVar);
                    if (list == null) {
                        throw firp.c("collections", "collections", fipwVar);
                    }
                    break;
                case 5:
                    list2 = (List) this.e.a(fipwVar);
                    if (list2 == null) {
                        throw firp.c("items", "items", fipwVar);
                    }
                    break;
                case 6:
                    list3 = (List) this.f.a(fipwVar);
                    if (list3 == null) {
                        throw firp.c("extensions", "extensions", fipwVar);
                    }
                    i &= -65;
                    break;
            }
        }
        fipwVar.k();
        if (i == -73) {
            if (str == null) {
                throw firp.b("id", "id", fipwVar);
            }
            if (str2 == null) {
                throw firp.b("username", "username", fipwVar);
            }
            if (str3 == null) {
                throw firp.b("email", "email", fipwVar);
            }
            if (list == null) {
                throw firp.b("collections", "collections", fipwVar);
            }
            if (list2 == null) {
                throw firp.b("items", "items", fipwVar);
            }
            fvbo.d(list3, "null cannot be cast to non-null type kotlin.collections.List<com.google.android.gms.credential.manager.credentialexchange.CredentialExchangeFormat.Extension>");
            return new CredentialExchangeFormat$Account(str, str2, str3, str4, list, list2, list3);
        }
        Constructor constructor = this.g;
        int i2 = i;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            fvbo.c(cls);
            Class cls2 = firp.d;
            fvbo.c(cls2);
            constructor = CredentialExchangeFormat$Account.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, List.class, List.class, List.class, cls, cls2);
            fvbo.e(constructor, "getDeclaredConstructor(...)");
            this.g = constructor;
        }
        if (str == null) {
            throw firp.b("id", "id", fipwVar);
        }
        if (str2 == null) {
            throw firp.b("username", "username", fipwVar);
        }
        if (str3 == null) {
            throw firp.b("email", "email", fipwVar);
        }
        if (list == null) {
            throw firp.b("collections", "collections", fipwVar);
        }
        if (list2 == null) {
            throw firp.b("items", "items", fipwVar);
        }
        Object newInstance = constructor.newInstance(str, str2, str3, str4, list, list2, list3, Integer.valueOf(i2), null);
        fvbo.e(newInstance, "newInstance(...)");
        return (CredentialExchangeFormat$Account) newInstance;
    }

    @Override // defpackage.fipo
    public final /* bridge */ /* synthetic */ void b(fiqb fiqbVar, Object obj) {
        CredentialExchangeFormat$Account credentialExchangeFormat$Account = (CredentialExchangeFormat$Account) obj;
        if (credentialExchangeFormat$Account == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        fiqbVar.d();
        fiqbVar.j("id");
        fipo fipoVar = this.b;
        fipoVar.b(fiqbVar, credentialExchangeFormat$Account.a);
        fiqbVar.j("username");
        fipoVar.b(fiqbVar, credentialExchangeFormat$Account.b);
        fiqbVar.j("email");
        fipoVar.b(fiqbVar, credentialExchangeFormat$Account.c);
        fiqbVar.j("fullName");
        this.c.b(fiqbVar, credentialExchangeFormat$Account.d);
        fiqbVar.j("collections");
        this.d.b(fiqbVar, credentialExchangeFormat$Account.e);
        fiqbVar.j("items");
        this.e.b(fiqbVar, credentialExchangeFormat$Account.f);
        fiqbVar.j("extensions");
        this.f.b(fiqbVar, credentialExchangeFormat$Account.g);
        fiqbVar.f();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CredentialExchangeFormat.Account)";
    }
}
