package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.flfl;
import defpackage.flfq;
import defpackage.flfr;
import defpackage.flft;
import defpackage.flfy;
import defpackage.flgn;
import defpackage.flhm;
import defpackage.fxsw;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class CredentialExchangeFormat_Credential_CreditCardCredentialJsonAdapter extends flfl {
    private final flfr a;
    private final flfl b;
    private final flfl c;

    public CredentialExchangeFormat_Credential_CreditCardCredentialJsonAdapter(flgn flgnVar) {
        fxxm.f(flgnVar, "moshi");
        this.a = flfq.a("number", "fullName", "cardType", "verificationNumber", "expiryDate", "validFrom");
        fxsw fxswVar = fxsw.a;
        this.b = flgnVar.d(String.class, fxswVar, "number");
        this.c = flgnVar.d(String.class, fxswVar, "cardType");
    }

    @Override // defpackage.flfl
    public final /* bridge */ /* synthetic */ Object a(flft flftVar) {
        flftVar.i();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (flftVar.o()) {
            switch (flftVar.c(this.a)) {
                case -1:
                    flftVar.m();
                    flftVar.n();
                    break;
                case 0:
                    str = (String) this.b.a(flftVar);
                    if (str == null) {
                        throw flhm.c("number", "number", flftVar);
                    }
                    break;
                case 1:
                    str2 = (String) this.b.a(flftVar);
                    if (str2 == null) {
                        throw flhm.c("fullName", "fullName", flftVar);
                    }
                    break;
                case 2:
                    str3 = (String) this.c.a(flftVar);
                    break;
                case 3:
                    str4 = (String) this.c.a(flftVar);
                    break;
                case 4:
                    str5 = (String) this.c.a(flftVar);
                    break;
                case 5:
                    str6 = (String) this.c.a(flftVar);
                    break;
            }
        }
        flftVar.k();
        if (str == null) {
            throw flhm.b("number", "number", flftVar);
        }
        if (str2 != null) {
            return new CredentialExchangeFormat$Credential$CreditCardCredential(str, str2, str3, str4, str5, str6);
        }
        throw flhm.b("fullName", "fullName", flftVar);
    }

    @Override // defpackage.flfl
    public final /* bridge */ /* synthetic */ void b(flfy flfyVar, Object obj) {
        CredentialExchangeFormat$Credential$CreditCardCredential credentialExchangeFormat$Credential$CreditCardCredential = (CredentialExchangeFormat$Credential$CreditCardCredential) obj;
        if (credentialExchangeFormat$Credential$CreditCardCredential == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        flfyVar.d();
        flfyVar.j("number");
        flfl flflVar = this.b;
        flflVar.b(flfyVar, credentialExchangeFormat$Credential$CreditCardCredential.a);
        flfyVar.j("fullName");
        flflVar.b(flfyVar, credentialExchangeFormat$Credential$CreditCardCredential.b);
        flfyVar.j("cardType");
        flfl flflVar2 = this.c;
        flflVar2.b(flfyVar, credentialExchangeFormat$Credential$CreditCardCredential.c);
        flfyVar.j("verificationNumber");
        flflVar2.b(flfyVar, credentialExchangeFormat$Credential$CreditCardCredential.d);
        flfyVar.j("expiryDate");
        flflVar2.b(flfyVar, credentialExchangeFormat$Credential$CreditCardCredential.e);
        flfyVar.j("validFrom");
        flflVar2.b(flfyVar, credentialExchangeFormat$Credential$CreditCardCredential.f);
        flfyVar.f();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CredentialExchangeFormat.Credential.CreditCardCredential)";
    }
}
