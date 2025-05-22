package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.awhk;
import defpackage.awhm;
import defpackage.awho;
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
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class CredentialExchangeFormat_ItemJsonAdapter extends flfl {
    private final flfr a;
    private final flfl b;
    private final flfl c;
    private final flfl d;
    private final flfl e;
    private final flfl f;
    private final flfl g;
    private final flfl h;
    private final flfl i;
    private volatile Constructor j;

    public CredentialExchangeFormat_ItemJsonAdapter(flgn flgnVar) {
        fxxm.f(flgnVar, "moshi");
        this.a = flfq.a("id", "creationAt", "modifiedAt", "type", "title", "subtitle", "favorite", "credentials", "tags", "extensions");
        fxsw fxswVar = fxsw.a;
        this.b = flgnVar.d(String.class, fxswVar, "id");
        this.c = flgnVar.d(Long.class, fxswVar, "creationAt");
        this.d = flgnVar.d(awho.class, fxswVar, "type");
        this.e = flgnVar.d(String.class, fxswVar, "subtitle");
        this.f = flgnVar.d(Boolean.TYPE, fxswVar, "favorite");
        this.g = flgnVar.d(flhd.b(List.class, awhk.class), fxswVar, "credentials");
        this.h = flgnVar.d(flhd.b(Set.class, String.class), fxswVar, "tags");
        this.i = flgnVar.d(flhd.b(List.class, awhm.class), fxswVar, "extensions");
    }

    @Override // defpackage.flfl
    public final /* bridge */ /* synthetic */ Object a(flft flftVar) {
        String str;
        boolean z = false;
        Boolean bool = false;
        flftVar.i();
        int i = -1;
        String str2 = null;
        Long l = null;
        Long l2 = null;
        awho awhoVar = null;
        String str3 = null;
        String str4 = null;
        List list = null;
        Set set = null;
        List list2 = null;
        while (true) {
            boolean z2 = z;
            Boolean bool2 = bool;
            if (!flftVar.o()) {
                flftVar.k();
                if (i == -865) {
                    if (str2 == null) {
                        throw flhm.b("id", "id", flftVar);
                    }
                    if (awhoVar == null) {
                        throw flhm.b("type", "type", flftVar);
                    }
                    if (str3 == null) {
                        throw flhm.b("title", "title", flftVar);
                    }
                    boolean booleanValue = bool2.booleanValue();
                    if (list != null) {
                        return new CredentialExchangeFormat$Item(str2, l, l2, awhoVar, str3, str4, booleanValue, list, set, list2);
                    }
                    throw flhm.b("credentials", "credentials", flftVar);
                }
                Constructor constructor = this.j;
                int i2 = i;
                if (constructor == null) {
                    Class cls = Boolean.TYPE;
                    fxxm.c(cls);
                    Class cls2 = Integer.TYPE;
                    fxxm.c(cls2);
                    Class cls3 = flhm.d;
                    fxxm.c(cls3);
                    str = str2;
                    Class[] clsArr = new Class[12];
                    clsArr[z2 ? 1 : 0] = String.class;
                    clsArr[1] = Long.class;
                    clsArr[2] = Long.class;
                    clsArr[3] = awho.class;
                    clsArr[4] = String.class;
                    clsArr[5] = String.class;
                    clsArr[6] = cls;
                    clsArr[7] = List.class;
                    clsArr[8] = Set.class;
                    clsArr[9] = List.class;
                    clsArr[10] = cls2;
                    clsArr[11] = cls3;
                    constructor = CredentialExchangeFormat$Item.class.getDeclaredConstructor(clsArr);
                    fxxm.e(constructor, "getDeclaredConstructor(...)");
                    this.j = constructor;
                } else {
                    str = str2;
                }
                if (str == null) {
                    throw flhm.b("id", "id", flftVar);
                }
                if (awhoVar == null) {
                    throw flhm.b("type", "type", flftVar);
                }
                if (str3 == null) {
                    throw flhm.b("title", "title", flftVar);
                }
                if (list == null) {
                    throw flhm.b("credentials", "credentials", flftVar);
                }
                Integer valueOf = Integer.valueOf(i2);
                Object[] objArr = new Object[12];
                objArr[z2 ? 1 : 0] = str;
                objArr[1] = l;
                objArr[2] = l2;
                objArr[3] = awhoVar;
                objArr[4] = str3;
                objArr[5] = str4;
                objArr[6] = bool2;
                objArr[7] = list;
                objArr[8] = set;
                objArr[9] = list2;
                objArr[10] = valueOf;
                objArr[11] = null;
                Object newInstance = constructor.newInstance(objArr);
                fxxm.e(newInstance, "newInstance(...)");
                return (CredentialExchangeFormat$Item) newInstance;
            }
            switch (flftVar.c(this.a)) {
                case -1:
                    flftVar.m();
                    flftVar.n();
                    break;
                case 0:
                    str2 = (String) this.b.a(flftVar);
                    if (str2 == null) {
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
                    awhoVar = (awho) this.d.a(flftVar);
                    if (awhoVar == null) {
                        throw flhm.c("type", "type", flftVar);
                    }
                    break;
                case 4:
                    str3 = (String) this.b.a(flftVar);
                    if (str3 == null) {
                        throw flhm.c("title", "title", flftVar);
                    }
                    break;
                case 5:
                    str4 = (String) this.e.a(flftVar);
                    i &= -33;
                    break;
                case 6:
                    bool = (Boolean) this.f.a(flftVar);
                    if (bool == null) {
                        throw flhm.c("favorite", "favorite", flftVar);
                    }
                    i &= -65;
                    z = z2 ? 1 : 0;
                    continue;
                case 7:
                    list = (List) this.g.a(flftVar);
                    if (list == null) {
                        throw flhm.c("credentials", "credentials", flftVar);
                    }
                    break;
                case 8:
                    set = (Set) this.h.a(flftVar);
                    i &= -257;
                    break;
                case 9:
                    list2 = (List) this.i.a(flftVar);
                    i &= -513;
                    break;
            }
            z = z2 ? 1 : 0;
            bool = bool2;
        }
    }

    @Override // defpackage.flfl
    public final /* bridge */ /* synthetic */ void b(flfy flfyVar, Object obj) {
        CredentialExchangeFormat$Item credentialExchangeFormat$Item = (CredentialExchangeFormat$Item) obj;
        if (credentialExchangeFormat$Item == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        flfyVar.d();
        flfyVar.j("id");
        flfl flflVar = this.b;
        flflVar.b(flfyVar, credentialExchangeFormat$Item.a);
        flfyVar.j("creationAt");
        flfl flflVar2 = this.c;
        flflVar2.b(flfyVar, credentialExchangeFormat$Item.b);
        flfyVar.j("modifiedAt");
        flflVar2.b(flfyVar, credentialExchangeFormat$Item.c);
        flfyVar.j("type");
        this.d.b(flfyVar, credentialExchangeFormat$Item.d);
        flfyVar.j("title");
        flflVar.b(flfyVar, credentialExchangeFormat$Item.e);
        flfyVar.j("subtitle");
        this.e.b(flfyVar, credentialExchangeFormat$Item.f);
        flfyVar.j("favorite");
        this.f.b(flfyVar, Boolean.valueOf(credentialExchangeFormat$Item.g));
        flfyVar.j("credentials");
        this.g.b(flfyVar, credentialExchangeFormat$Item.h);
        flfyVar.j("tags");
        this.h.b(flfyVar, credentialExchangeFormat$Item.i);
        flfyVar.j("extensions");
        this.i.b(flfyVar, credentialExchangeFormat$Item.j);
        flfyVar.f();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CredentialExchangeFormat.Item)";
    }
}
