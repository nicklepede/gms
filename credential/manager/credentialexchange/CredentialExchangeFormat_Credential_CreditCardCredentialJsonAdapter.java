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
public final class CredentialExchangeFormat_Credential_CreditCardCredentialJsonAdapter extends fipo {
    private final fipu a;
    private final fipo b;
    private final fipo c;

    public CredentialExchangeFormat_Credential_CreditCardCredentialJsonAdapter(fiqq fiqqVar) {
        fvbo.f(fiqqVar, "moshi");
        this.a = fipt.a("number", "fullName", "cardType", "verificationNumber", "expiryDate", "validFrom");
        fuwy fuwyVar = fuwy.a;
        this.b = fiqqVar.d(String.class, fuwyVar, "number");
        this.c = fiqqVar.d(String.class, fuwyVar, "cardType");
    }

    @Override // defpackage.fipo
    public final /* bridge */ /* synthetic */ Object a(fipw fipwVar) {
        fipwVar.i();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (fipwVar.o()) {
            switch (fipwVar.c(this.a)) {
                case -1:
                    fipwVar.m();
                    fipwVar.n();
                    break;
                case 0:
                    str = (String) this.b.a(fipwVar);
                    if (str == null) {
                        throw firp.c("number", "number", fipwVar);
                    }
                    break;
                case 1:
                    str2 = (String) this.b.a(fipwVar);
                    if (str2 == null) {
                        throw firp.c("fullName", "fullName", fipwVar);
                    }
                    break;
                case 2:
                    str3 = (String) this.c.a(fipwVar);
                    break;
                case 3:
                    str4 = (String) this.c.a(fipwVar);
                    break;
                case 4:
                    str5 = (String) this.c.a(fipwVar);
                    break;
                case 5:
                    str6 = (String) this.c.a(fipwVar);
                    break;
            }
        }
        fipwVar.k();
        if (str == null) {
            throw firp.b("number", "number", fipwVar);
        }
        if (str2 != null) {
            return new CredentialExchangeFormat$Credential$CreditCardCredential(str, str2, str3, str4, str5, str6);
        }
        throw firp.b("fullName", "fullName", fipwVar);
    }

    @Override // defpackage.fipo
    public final /* bridge */ /* synthetic */ void b(fiqb fiqbVar, Object obj) {
        CredentialExchangeFormat$Credential$CreditCardCredential credentialExchangeFormat$Credential$CreditCardCredential = (CredentialExchangeFormat$Credential$CreditCardCredential) obj;
        if (credentialExchangeFormat$Credential$CreditCardCredential == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        fiqbVar.d();
        fiqbVar.j("number");
        fipo fipoVar = this.b;
        fipoVar.b(fiqbVar, credentialExchangeFormat$Credential$CreditCardCredential.a);
        fiqbVar.j("fullName");
        fipoVar.b(fiqbVar, credentialExchangeFormat$Credential$CreditCardCredential.b);
        fiqbVar.j("cardType");
        fipo fipoVar2 = this.c;
        fipoVar2.b(fiqbVar, credentialExchangeFormat$Credential$CreditCardCredential.c);
        fiqbVar.j("verificationNumber");
        fipoVar2.b(fiqbVar, credentialExchangeFormat$Credential$CreditCardCredential.d);
        fiqbVar.j("expiryDate");
        fipoVar2.b(fiqbVar, credentialExchangeFormat$Credential$CreditCardCredential.e);
        fiqbVar.j("validFrom");
        fipoVar2.b(fiqbVar, credentialExchangeFormat$Credential$CreditCardCredential.f);
        fiqbVar.f();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CredentialExchangeFormat.Credential.CreditCardCredential)";
    }
}
