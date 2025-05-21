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
public final class CredentialExchangeFormat_CollectionJsonAdapter extends fipo {
    private final fipu a;
    private final fipo b;
    private final fipo c;
    private final fipo d;
    private final fipo e;
    private final fipo f;
    private final fipo g;
    private volatile Constructor h;

    public CredentialExchangeFormat_CollectionJsonAdapter(fiqq fiqqVar) {
        fvbo.f(fiqqVar, "moshi");
        this.a = fipt.a("id", "creationAt", "modifiedAt", "title", "subtitle", "items", "subCollections", "extensions");
        fuwy fuwyVar = fuwy.a;
        this.b = fiqqVar.d(String.class, fuwyVar, "id");
        this.c = fiqqVar.d(Long.class, fuwyVar, "creationAt");
        this.d = fiqqVar.d(String.class, fuwyVar, "subtitle");
        this.e = fiqqVar.d(firg.b(List.class, CredentialExchangeFormat$LinkedItem.class), fuwyVar, "items");
        this.f = fiqqVar.d(firg.b(List.class, CredentialExchangeFormat$Collection.class), fuwyVar, "subCollections");
        this.g = fiqqVar.d(firg.b(List.class, audh.class), fuwyVar, "extensions");
    }

    @Override // defpackage.fipo
    public final /* bridge */ /* synthetic */ Object a(fipw fipwVar) {
        int i;
        fipwVar.i();
        int i2 = -1;
        String str = null;
        Long l = null;
        Long l2 = null;
        String str2 = null;
        String str3 = null;
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
                    l = (Long) this.c.a(fipwVar);
                    break;
                case 2:
                    l2 = (Long) this.c.a(fipwVar);
                    break;
                case 3:
                    str2 = (String) this.b.a(fipwVar);
                    if (str2 == null) {
                        throw firp.c("title", "title", fipwVar);
                    }
                    break;
                case 4:
                    str3 = (String) this.d.a(fipwVar);
                    break;
                case 5:
                    list = (List) this.e.a(fipwVar);
                    if (list == null) {
                        throw firp.c("items", "items", fipwVar);
                    }
                    break;
                case 6:
                    list2 = (List) this.f.a(fipwVar);
                    i2 &= -65;
                    break;
                case 7:
                    list3 = (List) this.g.a(fipwVar);
                    i2 &= -129;
                    break;
            }
        }
        fipwVar.k();
        if (i2 == -193) {
            if (str == null) {
                throw firp.b("id", "id", fipwVar);
            }
            if (str2 == null) {
                throw firp.b("title", "title", fipwVar);
            }
            if (list != null) {
                return new CredentialExchangeFormat$Collection(str, l, l2, str2, str3, list, list2, list3);
            }
            throw firp.b("items", "items", fipwVar);
        }
        Constructor constructor = this.h;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            fvbo.c(cls);
            Class cls2 = firp.d;
            fvbo.c(cls2);
            i = i2;
            constructor = CredentialExchangeFormat$Collection.class.getDeclaredConstructor(String.class, Long.class, Long.class, String.class, String.class, List.class, List.class, List.class, cls, cls2);
            fvbo.e(constructor, "getDeclaredConstructor(...)");
            this.h = constructor;
        } else {
            i = i2;
        }
        if (str == null) {
            throw firp.b("id", "id", fipwVar);
        }
        if (str2 == null) {
            throw firp.b("title", "title", fipwVar);
        }
        if (list == null) {
            throw firp.b("items", "items", fipwVar);
        }
        Object newInstance = constructor.newInstance(str, l, l2, str2, str3, list, list2, list3, Integer.valueOf(i), null);
        fvbo.e(newInstance, "newInstance(...)");
        return (CredentialExchangeFormat$Collection) newInstance;
    }

    @Override // defpackage.fipo
    public final /* bridge */ /* synthetic */ void b(fiqb fiqbVar, Object obj) {
        CredentialExchangeFormat$Collection credentialExchangeFormat$Collection = (CredentialExchangeFormat$Collection) obj;
        if (credentialExchangeFormat$Collection == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        fiqbVar.d();
        fiqbVar.j("id");
        fipo fipoVar = this.b;
        fipoVar.b(fiqbVar, credentialExchangeFormat$Collection.a);
        fiqbVar.j("creationAt");
        fipo fipoVar2 = this.c;
        fipoVar2.b(fiqbVar, credentialExchangeFormat$Collection.b);
        fiqbVar.j("modifiedAt");
        fipoVar2.b(fiqbVar, credentialExchangeFormat$Collection.c);
        fiqbVar.j("title");
        fipoVar.b(fiqbVar, credentialExchangeFormat$Collection.d);
        fiqbVar.j("subtitle");
        this.d.b(fiqbVar, credentialExchangeFormat$Collection.e);
        fiqbVar.j("items");
        this.e.b(fiqbVar, credentialExchangeFormat$Collection.f);
        fiqbVar.j("subCollections");
        this.f.b(fiqbVar, credentialExchangeFormat$Collection.g);
        fiqbVar.j("extensions");
        this.g.b(fiqbVar, credentialExchangeFormat$Collection.h);
        fiqbVar.f();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CredentialExchangeFormat.Collection)";
    }
}
