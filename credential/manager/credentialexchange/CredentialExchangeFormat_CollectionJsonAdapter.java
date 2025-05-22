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
public final class CredentialExchangeFormat_CollectionJsonAdapter extends flfl {
    private final flfr a;
    private final flfl b;
    private final flfl c;
    private final flfl d;
    private final flfl e;
    private final flfl f;
    private final flfl g;
    private volatile Constructor h;

    public CredentialExchangeFormat_CollectionJsonAdapter(flgn flgnVar) {
        fxxm.f(flgnVar, "moshi");
        this.a = flfq.a("id", "creationAt", "modifiedAt", "title", "subtitle", "items", "subCollections", "extensions");
        fxsw fxswVar = fxsw.a;
        this.b = flgnVar.d(String.class, fxswVar, "id");
        this.c = flgnVar.d(Long.class, fxswVar, "creationAt");
        this.d = flgnVar.d(String.class, fxswVar, "subtitle");
        this.e = flgnVar.d(flhd.b(List.class, CredentialExchangeFormat$LinkedItem.class), fxswVar, "items");
        this.f = flgnVar.d(flhd.b(List.class, CredentialExchangeFormat$Collection.class), fxswVar, "subCollections");
        this.g = flgnVar.d(flhd.b(List.class, awhm.class), fxswVar, "extensions");
    }

    @Override // defpackage.flfl
    public final /* bridge */ /* synthetic */ Object a(flft flftVar) {
        int i;
        flftVar.i();
        int i2 = -1;
        String str = null;
        Long l = null;
        Long l2 = null;
        String str2 = null;
        String str3 = null;
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
                    l = (Long) this.c.a(flftVar);
                    break;
                case 2:
                    l2 = (Long) this.c.a(flftVar);
                    break;
                case 3:
                    str2 = (String) this.b.a(flftVar);
                    if (str2 == null) {
                        throw flhm.c("title", "title", flftVar);
                    }
                    break;
                case 4:
                    str3 = (String) this.d.a(flftVar);
                    break;
                case 5:
                    list = (List) this.e.a(flftVar);
                    if (list == null) {
                        throw flhm.c("items", "items", flftVar);
                    }
                    break;
                case 6:
                    list2 = (List) this.f.a(flftVar);
                    i2 &= -65;
                    break;
                case 7:
                    list3 = (List) this.g.a(flftVar);
                    i2 &= -129;
                    break;
            }
        }
        flftVar.k();
        if (i2 == -193) {
            if (str == null) {
                throw flhm.b("id", "id", flftVar);
            }
            if (str2 == null) {
                throw flhm.b("title", "title", flftVar);
            }
            if (list != null) {
                return new CredentialExchangeFormat$Collection(str, l, l2, str2, str3, list, list2, list3);
            }
            throw flhm.b("items", "items", flftVar);
        }
        Constructor constructor = this.h;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            fxxm.c(cls);
            Class cls2 = flhm.d;
            fxxm.c(cls2);
            i = i2;
            constructor = CredentialExchangeFormat$Collection.class.getDeclaredConstructor(String.class, Long.class, Long.class, String.class, String.class, List.class, List.class, List.class, cls, cls2);
            fxxm.e(constructor, "getDeclaredConstructor(...)");
            this.h = constructor;
        } else {
            i = i2;
        }
        if (str == null) {
            throw flhm.b("id", "id", flftVar);
        }
        if (str2 == null) {
            throw flhm.b("title", "title", flftVar);
        }
        if (list == null) {
            throw flhm.b("items", "items", flftVar);
        }
        Object newInstance = constructor.newInstance(str, l, l2, str2, str3, list, list2, list3, Integer.valueOf(i), null);
        fxxm.e(newInstance, "newInstance(...)");
        return (CredentialExchangeFormat$Collection) newInstance;
    }

    @Override // defpackage.flfl
    public final /* bridge */ /* synthetic */ void b(flfy flfyVar, Object obj) {
        CredentialExchangeFormat$Collection credentialExchangeFormat$Collection = (CredentialExchangeFormat$Collection) obj;
        if (credentialExchangeFormat$Collection == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        flfyVar.d();
        flfyVar.j("id");
        flfl flflVar = this.b;
        flflVar.b(flfyVar, credentialExchangeFormat$Collection.a);
        flfyVar.j("creationAt");
        flfl flflVar2 = this.c;
        flflVar2.b(flfyVar, credentialExchangeFormat$Collection.b);
        flfyVar.j("modifiedAt");
        flflVar2.b(flfyVar, credentialExchangeFormat$Collection.c);
        flfyVar.j("title");
        flflVar.b(flfyVar, credentialExchangeFormat$Collection.d);
        flfyVar.j("subtitle");
        this.d.b(flfyVar, credentialExchangeFormat$Collection.e);
        flfyVar.j("items");
        this.e.b(flfyVar, credentialExchangeFormat$Collection.f);
        flfyVar.j("subCollections");
        this.f.b(flfyVar, credentialExchangeFormat$Collection.g);
        flfyVar.j("extensions");
        this.g.b(flfyVar, credentialExchangeFormat$Collection.h);
        flfyVar.f();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CredentialExchangeFormat.Collection)";
    }
}
