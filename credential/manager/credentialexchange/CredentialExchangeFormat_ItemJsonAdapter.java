package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.audf;
import defpackage.audh;
import defpackage.audj;
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
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class CredentialExchangeFormat_ItemJsonAdapter extends fipo {
    private final fipu a;
    private final fipo b;
    private final fipo c;
    private final fipo d;
    private final fipo e;
    private final fipo f;
    private final fipo g;
    private final fipo h;
    private final fipo i;
    private volatile Constructor j;

    public CredentialExchangeFormat_ItemJsonAdapter(fiqq fiqqVar) {
        fvbo.f(fiqqVar, "moshi");
        this.a = fipt.a("id", "creationAt", "modifiedAt", "type", "title", "subtitle", "favorite", "credentials", "tags", "extensions");
        fuwy fuwyVar = fuwy.a;
        this.b = fiqqVar.d(String.class, fuwyVar, "id");
        this.c = fiqqVar.d(Long.class, fuwyVar, "creationAt");
        this.d = fiqqVar.d(audj.class, fuwyVar, "type");
        this.e = fiqqVar.d(String.class, fuwyVar, "subtitle");
        this.f = fiqqVar.d(Boolean.TYPE, fuwyVar, "favorite");
        this.g = fiqqVar.d(firg.b(List.class, audf.class), fuwyVar, "credentials");
        this.h = fiqqVar.d(firg.b(Set.class, String.class), fuwyVar, "tags");
        this.i = fiqqVar.d(firg.b(List.class, audh.class), fuwyVar, "extensions");
    }

    @Override // defpackage.fipo
    public final /* bridge */ /* synthetic */ Object a(fipw fipwVar) {
        String str;
        boolean z = false;
        Boolean bool = false;
        fipwVar.i();
        int i = -1;
        String str2 = null;
        Long l = null;
        Long l2 = null;
        audj audjVar = null;
        String str3 = null;
        String str4 = null;
        List list = null;
        Set set = null;
        List list2 = null;
        while (true) {
            boolean z2 = z;
            Boolean bool2 = bool;
            if (!fipwVar.o()) {
                fipwVar.k();
                if (i == -865) {
                    if (str2 == null) {
                        throw firp.b("id", "id", fipwVar);
                    }
                    if (audjVar == null) {
                        throw firp.b("type", "type", fipwVar);
                    }
                    if (str3 == null) {
                        throw firp.b("title", "title", fipwVar);
                    }
                    boolean booleanValue = bool2.booleanValue();
                    if (list != null) {
                        return new CredentialExchangeFormat$Item(str2, l, l2, audjVar, str3, str4, booleanValue, list, set, list2);
                    }
                    throw firp.b("credentials", "credentials", fipwVar);
                }
                Constructor constructor = this.j;
                int i2 = i;
                if (constructor == null) {
                    Class cls = Boolean.TYPE;
                    fvbo.c(cls);
                    Class cls2 = Integer.TYPE;
                    fvbo.c(cls2);
                    Class cls3 = firp.d;
                    fvbo.c(cls3);
                    str = str2;
                    Class[] clsArr = new Class[12];
                    clsArr[z2 ? 1 : 0] = String.class;
                    clsArr[1] = Long.class;
                    clsArr[2] = Long.class;
                    clsArr[3] = audj.class;
                    clsArr[4] = String.class;
                    clsArr[5] = String.class;
                    clsArr[6] = cls;
                    clsArr[7] = List.class;
                    clsArr[8] = Set.class;
                    clsArr[9] = List.class;
                    clsArr[10] = cls2;
                    clsArr[11] = cls3;
                    constructor = CredentialExchangeFormat$Item.class.getDeclaredConstructor(clsArr);
                    fvbo.e(constructor, "getDeclaredConstructor(...)");
                    this.j = constructor;
                } else {
                    str = str2;
                }
                if (str == null) {
                    throw firp.b("id", "id", fipwVar);
                }
                if (audjVar == null) {
                    throw firp.b("type", "type", fipwVar);
                }
                if (str3 == null) {
                    throw firp.b("title", "title", fipwVar);
                }
                if (list == null) {
                    throw firp.b("credentials", "credentials", fipwVar);
                }
                Integer valueOf = Integer.valueOf(i2);
                Object[] objArr = new Object[12];
                objArr[z2 ? 1 : 0] = str;
                objArr[1] = l;
                objArr[2] = l2;
                objArr[3] = audjVar;
                objArr[4] = str3;
                objArr[5] = str4;
                objArr[6] = bool2;
                objArr[7] = list;
                objArr[8] = set;
                objArr[9] = list2;
                objArr[10] = valueOf;
                objArr[11] = null;
                Object newInstance = constructor.newInstance(objArr);
                fvbo.e(newInstance, "newInstance(...)");
                return (CredentialExchangeFormat$Item) newInstance;
            }
            switch (fipwVar.c(this.a)) {
                case -1:
                    fipwVar.m();
                    fipwVar.n();
                    break;
                case 0:
                    str2 = (String) this.b.a(fipwVar);
                    if (str2 == null) {
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
                    audjVar = (audj) this.d.a(fipwVar);
                    if (audjVar == null) {
                        throw firp.c("type", "type", fipwVar);
                    }
                    break;
                case 4:
                    str3 = (String) this.b.a(fipwVar);
                    if (str3 == null) {
                        throw firp.c("title", "title", fipwVar);
                    }
                    break;
                case 5:
                    str4 = (String) this.e.a(fipwVar);
                    i &= -33;
                    break;
                case 6:
                    bool = (Boolean) this.f.a(fipwVar);
                    if (bool == null) {
                        throw firp.c("favorite", "favorite", fipwVar);
                    }
                    i &= -65;
                    z = z2 ? 1 : 0;
                    continue;
                case 7:
                    list = (List) this.g.a(fipwVar);
                    if (list == null) {
                        throw firp.c("credentials", "credentials", fipwVar);
                    }
                    break;
                case 8:
                    set = (Set) this.h.a(fipwVar);
                    i &= -257;
                    break;
                case 9:
                    list2 = (List) this.i.a(fipwVar);
                    i &= -513;
                    break;
            }
            z = z2 ? 1 : 0;
            bool = bool2;
        }
    }

    @Override // defpackage.fipo
    public final /* bridge */ /* synthetic */ void b(fiqb fiqbVar, Object obj) {
        CredentialExchangeFormat$Item credentialExchangeFormat$Item = (CredentialExchangeFormat$Item) obj;
        if (credentialExchangeFormat$Item == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        fiqbVar.d();
        fiqbVar.j("id");
        fipo fipoVar = this.b;
        fipoVar.b(fiqbVar, credentialExchangeFormat$Item.a);
        fiqbVar.j("creationAt");
        fipo fipoVar2 = this.c;
        fipoVar2.b(fiqbVar, credentialExchangeFormat$Item.b);
        fiqbVar.j("modifiedAt");
        fipoVar2.b(fiqbVar, credentialExchangeFormat$Item.c);
        fiqbVar.j("type");
        this.d.b(fiqbVar, credentialExchangeFormat$Item.d);
        fiqbVar.j("title");
        fipoVar.b(fiqbVar, credentialExchangeFormat$Item.e);
        fiqbVar.j("subtitle");
        this.e.b(fiqbVar, credentialExchangeFormat$Item.f);
        fiqbVar.j("favorite");
        this.f.b(fiqbVar, Boolean.valueOf(credentialExchangeFormat$Item.g));
        fiqbVar.j("credentials");
        this.g.b(fiqbVar, credentialExchangeFormat$Item.h);
        fiqbVar.j("tags");
        this.h.b(fiqbVar, credentialExchangeFormat$Item.i);
        fiqbVar.j("extensions");
        this.i.b(fiqbVar, credentialExchangeFormat$Item.j);
        fiqbVar.f();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CredentialExchangeFormat.Item)";
    }
}
