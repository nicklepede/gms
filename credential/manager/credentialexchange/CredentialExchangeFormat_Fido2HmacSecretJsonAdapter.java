package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.fipo;
import defpackage.fipt;
import defpackage.fipu;
import defpackage.fipw;
import defpackage.fiqb;
import defpackage.fiqq;
import defpackage.firp;
import defpackage.fuwy;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class CredentialExchangeFormat_Fido2HmacSecretJsonAdapter extends fipo {
    private final fipu a;
    private final fipo b;

    public CredentialExchangeFormat_Fido2HmacSecretJsonAdapter(fiqq fiqqVar) {
        fvbo.f(fiqqVar, "moshi");
        this.a = fipt.a("algorithm", "secret");
        this.b = fiqqVar.d(String.class, fuwy.a, "algorithm");
    }

    @Override // defpackage.fipo
    public final /* bridge */ /* synthetic */ Object a(fipw fipwVar) {
        fipwVar.i();
        String str = null;
        String str2 = null;
        while (fipwVar.o()) {
            int c = fipwVar.c(this.a);
            if (c == -1) {
                fipwVar.m();
                fipwVar.n();
            } else if (c == 0) {
                str = (String) this.b.a(fipwVar);
                if (str == null) {
                    throw firp.c("algorithm", "algorithm", fipwVar);
                }
            } else if (c == 1 && (str2 = (String) this.b.a(fipwVar)) == null) {
                throw firp.c("secret", "secret", fipwVar);
            }
        }
        fipwVar.k();
        if (str == null) {
            throw firp.b("algorithm", "algorithm", fipwVar);
        }
        if (str2 != null) {
            return new CredentialExchangeFormat$Fido2HmacSecret(str, str2);
        }
        throw firp.b("secret", "secret", fipwVar);
    }

    @Override // defpackage.fipo
    public final /* bridge */ /* synthetic */ void b(fiqb fiqbVar, Object obj) {
        CredentialExchangeFormat$Fido2HmacSecret credentialExchangeFormat$Fido2HmacSecret = (CredentialExchangeFormat$Fido2HmacSecret) obj;
        if (credentialExchangeFormat$Fido2HmacSecret == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        fiqbVar.d();
        fiqbVar.j("algorithm");
        fipo fipoVar = this.b;
        fipoVar.b(fiqbVar, credentialExchangeFormat$Fido2HmacSecret.a);
        fiqbVar.j("secret");
        fipoVar.b(fiqbVar, credentialExchangeFormat$Fido2HmacSecret.b);
        fiqbVar.f();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CredentialExchangeFormat.Fido2HmacSecret)";
    }
}
