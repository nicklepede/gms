package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.awhm;
import defpackage.awhn;
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
public final class CredentialExchangeFormat_EditableFieldJsonAdapter extends flfl {
    private final flfr a;
    private final flfl b;
    private final flfl c;
    private final flfl d;
    private final flfl e;
    private volatile Constructor f;

    public CredentialExchangeFormat_EditableFieldJsonAdapter(flgn flgnVar) {
        fxxm.f(flgnVar, "moshi");
        this.a = flfq.a("id", "fieldType", "value", "label", "extensions");
        fxsw fxswVar = fxsw.a;
        this.b = flgnVar.d(String.class, fxswVar, "id");
        this.c = flgnVar.d(awhn.class, fxswVar, "fieldType");
        this.d = flgnVar.d(String.class, fxswVar, "value");
        this.e = flgnVar.d(flhd.b(List.class, awhm.class), fxswVar, "extensions");
    }

    @Override // defpackage.flfl
    public final /* bridge */ /* synthetic */ Object a(flft flftVar) {
        char c;
        flftVar.i();
        int i = -1;
        String str = null;
        awhn awhnVar = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        while (flftVar.o()) {
            int c2 = flftVar.c(this.a);
            if (c2 == -1) {
                flftVar.m();
                flftVar.n();
            } else if (c2 == 0) {
                str = (String) this.b.a(flftVar);
                i &= -2;
            } else if (c2 == 1) {
                awhnVar = (awhn) this.c.a(flftVar);
                if (awhnVar == null) {
                    throw flhm.c("fieldType", "fieldType", flftVar);
                }
            } else if (c2 == 2) {
                str2 = (String) this.d.a(flftVar);
                if (str2 == null) {
                    throw flhm.c("value_", "value", flftVar);
                }
            } else if (c2 == 3) {
                str3 = (String) this.b.a(flftVar);
                i &= -9;
            } else if (c2 == 4) {
                list = (List) this.e.a(flftVar);
                if (list == null) {
                    throw flhm.c("extensions", "extensions", flftVar);
                }
                i &= -17;
            } else {
                continue;
            }
        }
        flftVar.k();
        if (i == -26) {
            if (awhnVar == null) {
                throw flhm.b("fieldType", "fieldType", flftVar);
            }
            if (str2 == null) {
                throw flhm.b("value_", "value", flftVar);
            }
            fxxm.d(list, "null cannot be cast to non-null type kotlin.collections.List<com.google.android.gms.credential.manager.credentialexchange.CredentialExchangeFormat.Extension>");
            return new CredentialExchangeFormat$EditableField(str, awhnVar, str2, str3, list);
        }
        Constructor constructor = this.f;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            fxxm.c(cls);
            Class cls2 = flhm.d;
            fxxm.c(cls2);
            c = 6;
            constructor = CredentialExchangeFormat$EditableField.class.getDeclaredConstructor(String.class, awhn.class, String.class, String.class, List.class, cls, cls2);
            fxxm.e(constructor, "getDeclaredConstructor(...)");
            this.f = constructor;
        } else {
            c = 6;
        }
        if (awhnVar == null) {
            throw flhm.b("fieldType", "fieldType", flftVar);
        }
        if (str2 == null) {
            throw flhm.b("value_", "value", flftVar);
        }
        Integer valueOf = Integer.valueOf(i);
        Object[] objArr = new Object[7];
        objArr[0] = str;
        objArr[1] = awhnVar;
        objArr[2] = str2;
        objArr[3] = str3;
        objArr[4] = list;
        objArr[5] = valueOf;
        objArr[c] = null;
        Object newInstance = constructor.newInstance(objArr);
        fxxm.e(newInstance, "newInstance(...)");
        return (CredentialExchangeFormat$EditableField) newInstance;
    }

    @Override // defpackage.flfl
    public final /* bridge */ /* synthetic */ void b(flfy flfyVar, Object obj) {
        CredentialExchangeFormat$EditableField credentialExchangeFormat$EditableField = (CredentialExchangeFormat$EditableField) obj;
        if (credentialExchangeFormat$EditableField == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        flfyVar.d();
        flfyVar.j("id");
        flfl flflVar = this.b;
        flflVar.b(flfyVar, credentialExchangeFormat$EditableField.a);
        flfyVar.j("fieldType");
        this.c.b(flfyVar, credentialExchangeFormat$EditableField.b);
        flfyVar.j("value");
        this.d.b(flfyVar, credentialExchangeFormat$EditableField.c);
        flfyVar.j("label");
        flflVar.b(flfyVar, credentialExchangeFormat$EditableField.d);
        flfyVar.j("extensions");
        this.e.b(flfyVar, credentialExchangeFormat$EditableField.e);
        flfyVar.f();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CredentialExchangeFormat.EditableField)";
    }
}
