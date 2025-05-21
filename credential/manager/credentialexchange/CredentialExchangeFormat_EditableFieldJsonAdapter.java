package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.audh;
import defpackage.audi;
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
public final class CredentialExchangeFormat_EditableFieldJsonAdapter extends fipo {
    private final fipu a;
    private final fipo b;
    private final fipo c;
    private final fipo d;
    private final fipo e;
    private volatile Constructor f;

    public CredentialExchangeFormat_EditableFieldJsonAdapter(fiqq fiqqVar) {
        fvbo.f(fiqqVar, "moshi");
        this.a = fipt.a("id", "fieldType", "value", "label", "extensions");
        fuwy fuwyVar = fuwy.a;
        this.b = fiqqVar.d(String.class, fuwyVar, "id");
        this.c = fiqqVar.d(audi.class, fuwyVar, "fieldType");
        this.d = fiqqVar.d(String.class, fuwyVar, "value");
        this.e = fiqqVar.d(firg.b(List.class, audh.class), fuwyVar, "extensions");
    }

    @Override // defpackage.fipo
    public final /* bridge */ /* synthetic */ Object a(fipw fipwVar) {
        char c;
        fipwVar.i();
        int i = -1;
        String str = null;
        audi audiVar = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        while (fipwVar.o()) {
            int c2 = fipwVar.c(this.a);
            if (c2 == -1) {
                fipwVar.m();
                fipwVar.n();
            } else if (c2 == 0) {
                str = (String) this.b.a(fipwVar);
                i &= -2;
            } else if (c2 == 1) {
                audiVar = (audi) this.c.a(fipwVar);
                if (audiVar == null) {
                    throw firp.c("fieldType", "fieldType", fipwVar);
                }
            } else if (c2 == 2) {
                str2 = (String) this.d.a(fipwVar);
                if (str2 == null) {
                    throw firp.c("value_", "value", fipwVar);
                }
            } else if (c2 == 3) {
                str3 = (String) this.b.a(fipwVar);
                i &= -9;
            } else if (c2 == 4) {
                list = (List) this.e.a(fipwVar);
                if (list == null) {
                    throw firp.c("extensions", "extensions", fipwVar);
                }
                i &= -17;
            } else {
                continue;
            }
        }
        fipwVar.k();
        if (i == -26) {
            if (audiVar == null) {
                throw firp.b("fieldType", "fieldType", fipwVar);
            }
            if (str2 == null) {
                throw firp.b("value_", "value", fipwVar);
            }
            fvbo.d(list, "null cannot be cast to non-null type kotlin.collections.List<com.google.android.gms.credential.manager.credentialexchange.CredentialExchangeFormat.Extension>");
            return new CredentialExchangeFormat$EditableField(str, audiVar, str2, str3, list);
        }
        Constructor constructor = this.f;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            fvbo.c(cls);
            Class cls2 = firp.d;
            fvbo.c(cls2);
            c = 6;
            constructor = CredentialExchangeFormat$EditableField.class.getDeclaredConstructor(String.class, audi.class, String.class, String.class, List.class, cls, cls2);
            fvbo.e(constructor, "getDeclaredConstructor(...)");
            this.f = constructor;
        } else {
            c = 6;
        }
        if (audiVar == null) {
            throw firp.b("fieldType", "fieldType", fipwVar);
        }
        if (str2 == null) {
            throw firp.b("value_", "value", fipwVar);
        }
        Integer valueOf = Integer.valueOf(i);
        Object[] objArr = new Object[7];
        objArr[0] = str;
        objArr[1] = audiVar;
        objArr[2] = str2;
        objArr[3] = str3;
        objArr[4] = list;
        objArr[5] = valueOf;
        objArr[c] = null;
        Object newInstance = constructor.newInstance(objArr);
        fvbo.e(newInstance, "newInstance(...)");
        return (CredentialExchangeFormat$EditableField) newInstance;
    }

    @Override // defpackage.fipo
    public final /* bridge */ /* synthetic */ void b(fiqb fiqbVar, Object obj) {
        CredentialExchangeFormat$EditableField credentialExchangeFormat$EditableField = (CredentialExchangeFormat$EditableField) obj;
        if (credentialExchangeFormat$EditableField == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        fiqbVar.d();
        fiqbVar.j("id");
        fipo fipoVar = this.b;
        fipoVar.b(fiqbVar, credentialExchangeFormat$EditableField.a);
        fiqbVar.j("fieldType");
        this.c.b(fiqbVar, credentialExchangeFormat$EditableField.b);
        fiqbVar.j("value");
        this.d.b(fiqbVar, credentialExchangeFormat$EditableField.c);
        fiqbVar.j("label");
        fipoVar.b(fiqbVar, credentialExchangeFormat$EditableField.d);
        fiqbVar.j("extensions");
        this.e.b(fiqbVar, credentialExchangeFormat$EditableField.e);
        fiqbVar.f();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CredentialExchangeFormat.EditableField)";
    }
}
