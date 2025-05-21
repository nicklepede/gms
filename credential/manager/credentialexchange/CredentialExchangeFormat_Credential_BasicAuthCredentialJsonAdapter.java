package com.google.android.gms.credential.manager.credentialexchange;

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
import java.lang.reflect.ParameterizedType;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class CredentialExchangeFormat_Credential_BasicAuthCredentialJsonAdapter extends fipo {
    private final fipu a;
    private final fipo b;
    private final fipo c;

    public CredentialExchangeFormat_Credential_BasicAuthCredentialJsonAdapter(fiqq fiqqVar) {
        fvbo.f(fiqqVar, "moshi");
        this.a = fipt.a("urls", "username", "password");
        ParameterizedType b = firg.b(Set.class, String.class);
        fuwy fuwyVar = fuwy.a;
        this.b = fiqqVar.d(b, fuwyVar, "urls");
        this.c = fiqqVar.d(CredentialExchangeFormat$EditableField.class, fuwyVar, "username");
    }

    @Override // defpackage.fipo
    public final /* bridge */ /* synthetic */ Object a(fipw fipwVar) {
        fipwVar.i();
        Set set = null;
        CredentialExchangeFormat$EditableField credentialExchangeFormat$EditableField = null;
        CredentialExchangeFormat$EditableField credentialExchangeFormat$EditableField2 = null;
        while (fipwVar.o()) {
            int c = fipwVar.c(this.a);
            if (c == -1) {
                fipwVar.m();
                fipwVar.n();
            } else if (c == 0) {
                set = (Set) this.b.a(fipwVar);
                if (set == null) {
                    throw firp.c("urls", "urls", fipwVar);
                }
            } else if (c == 1) {
                credentialExchangeFormat$EditableField = (CredentialExchangeFormat$EditableField) this.c.a(fipwVar);
            } else if (c == 2) {
                credentialExchangeFormat$EditableField2 = (CredentialExchangeFormat$EditableField) this.c.a(fipwVar);
            }
        }
        fipwVar.k();
        if (set != null) {
            return new CredentialExchangeFormat$Credential$BasicAuthCredential(set, credentialExchangeFormat$EditableField, credentialExchangeFormat$EditableField2);
        }
        throw firp.b("urls", "urls", fipwVar);
    }

    @Override // defpackage.fipo
    public final /* bridge */ /* synthetic */ void b(fiqb fiqbVar, Object obj) {
        CredentialExchangeFormat$Credential$BasicAuthCredential credentialExchangeFormat$Credential$BasicAuthCredential = (CredentialExchangeFormat$Credential$BasicAuthCredential) obj;
        if (credentialExchangeFormat$Credential$BasicAuthCredential == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        fiqbVar.d();
        fiqbVar.j("urls");
        this.b.b(fiqbVar, credentialExchangeFormat$Credential$BasicAuthCredential.a);
        fiqbVar.j("username");
        fipo fipoVar = this.c;
        fipoVar.b(fiqbVar, credentialExchangeFormat$Credential$BasicAuthCredential.b);
        fiqbVar.j("password");
        fipoVar.b(fiqbVar, credentialExchangeFormat$Credential$BasicAuthCredential.c);
        fiqbVar.f();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CredentialExchangeFormat.Credential.BasicAuthCredential)";
    }
}
