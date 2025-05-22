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
public final class CredentialExchangeFormat_Fido2HmacSecretJsonAdapter extends flfl {
    private final flfr a;
    private final flfl b;

    public CredentialExchangeFormat_Fido2HmacSecretJsonAdapter(flgn flgnVar) {
        fxxm.f(flgnVar, "moshi");
        this.a = flfq.a("algorithm", "secret");
        this.b = flgnVar.d(String.class, fxsw.a, "algorithm");
    }

    @Override // defpackage.flfl
    public final /* bridge */ /* synthetic */ Object a(flft flftVar) {
        flftVar.i();
        String str = null;
        String str2 = null;
        while (flftVar.o()) {
            int c = flftVar.c(this.a);
            if (c == -1) {
                flftVar.m();
                flftVar.n();
            } else if (c == 0) {
                str = (String) this.b.a(flftVar);
                if (str == null) {
                    throw flhm.c("algorithm", "algorithm", flftVar);
                }
            } else if (c == 1 && (str2 = (String) this.b.a(flftVar)) == null) {
                throw flhm.c("secret", "secret", flftVar);
            }
        }
        flftVar.k();
        if (str == null) {
            throw flhm.b("algorithm", "algorithm", flftVar);
        }
        if (str2 != null) {
            return new CredentialExchangeFormat$Fido2HmacSecret(str, str2);
        }
        throw flhm.b("secret", "secret", flftVar);
    }

    @Override // defpackage.flfl
    public final /* bridge */ /* synthetic */ void b(flfy flfyVar, Object obj) {
        CredentialExchangeFormat$Fido2HmacSecret credentialExchangeFormat$Fido2HmacSecret = (CredentialExchangeFormat$Fido2HmacSecret) obj;
        if (credentialExchangeFormat$Fido2HmacSecret == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        flfyVar.d();
        flfyVar.j("algorithm");
        flfl flflVar = this.b;
        flflVar.b(flfyVar, credentialExchangeFormat$Fido2HmacSecret.a);
        flfyVar.j("secret");
        flflVar.b(flfyVar, credentialExchangeFormat$Fido2HmacSecret.b);
        flfyVar.f();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CredentialExchangeFormat.Fido2HmacSecret)";
    }
}
