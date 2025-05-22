package com.google.android.gms.credential.manager.credentialexchange;

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
import java.lang.reflect.ParameterizedType;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class CredentialExchangeFormat_Credential_BasicAuthCredentialJsonAdapter extends flfl {
    private final flfr a;
    private final flfl b;
    private final flfl c;

    public CredentialExchangeFormat_Credential_BasicAuthCredentialJsonAdapter(flgn flgnVar) {
        fxxm.f(flgnVar, "moshi");
        this.a = flfq.a("urls", "username", "password");
        ParameterizedType b = flhd.b(Set.class, String.class);
        fxsw fxswVar = fxsw.a;
        this.b = flgnVar.d(b, fxswVar, "urls");
        this.c = flgnVar.d(CredentialExchangeFormat$EditableField.class, fxswVar, "username");
    }

    @Override // defpackage.flfl
    public final /* bridge */ /* synthetic */ Object a(flft flftVar) {
        flftVar.i();
        Set set = null;
        CredentialExchangeFormat$EditableField credentialExchangeFormat$EditableField = null;
        CredentialExchangeFormat$EditableField credentialExchangeFormat$EditableField2 = null;
        while (flftVar.o()) {
            int c = flftVar.c(this.a);
            if (c == -1) {
                flftVar.m();
                flftVar.n();
            } else if (c == 0) {
                set = (Set) this.b.a(flftVar);
                if (set == null) {
                    throw flhm.c("urls", "urls", flftVar);
                }
            } else if (c == 1) {
                credentialExchangeFormat$EditableField = (CredentialExchangeFormat$EditableField) this.c.a(flftVar);
            } else if (c == 2) {
                credentialExchangeFormat$EditableField2 = (CredentialExchangeFormat$EditableField) this.c.a(flftVar);
            }
        }
        flftVar.k();
        if (set != null) {
            return new CredentialExchangeFormat$Credential$BasicAuthCredential(set, credentialExchangeFormat$EditableField, credentialExchangeFormat$EditableField2);
        }
        throw flhm.b("urls", "urls", flftVar);
    }

    @Override // defpackage.flfl
    public final /* bridge */ /* synthetic */ void b(flfy flfyVar, Object obj) {
        CredentialExchangeFormat$Credential$BasicAuthCredential credentialExchangeFormat$Credential$BasicAuthCredential = (CredentialExchangeFormat$Credential$BasicAuthCredential) obj;
        if (credentialExchangeFormat$Credential$BasicAuthCredential == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        flfyVar.d();
        flfyVar.j("urls");
        this.b.b(flfyVar, credentialExchangeFormat$Credential$BasicAuthCredential.a);
        flfyVar.j("username");
        flfl flflVar = this.c;
        flflVar.b(flfyVar, credentialExchangeFormat$Credential$BasicAuthCredential.b);
        flfyVar.j("password");
        flflVar.b(flfyVar, credentialExchangeFormat$Credential$BasicAuthCredential.c);
        flfyVar.f();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CredentialExchangeFormat.Credential.BasicAuthCredential)";
    }
}
