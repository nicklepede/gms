package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.flfl;
import defpackage.flfq;
import defpackage.flfr;
import defpackage.flft;
import defpackage.flfy;
import defpackage.flgn;
import defpackage.flhm;
import defpackage.fxrh;
import defpackage.fxsw;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class CredentialExchangeFormat_Fido2LargeBlobJsonAdapter extends flfl {
    private final flfr a;
    private final flfl b;
    private final flfl c;

    public CredentialExchangeFormat_Fido2LargeBlobJsonAdapter(flgn flgnVar) {
        fxxm.f(flgnVar, "moshi");
        this.a = flfq.a("size", "alg", "data");
        fxsw fxswVar = fxsw.a;
        this.b = flgnVar.d(fxrh.class, fxswVar, "size");
        this.c = flgnVar.d(String.class, fxswVar, "alg");
    }

    @Override // defpackage.flfl
    public final /* bridge */ /* synthetic */ Object a(flft flftVar) {
        flftVar.i();
        fxrh fxrhVar = null;
        String str = null;
        String str2 = null;
        while (flftVar.o()) {
            int c = flftVar.c(this.a);
            if (c == -1) {
                flftVar.m();
                flftVar.n();
            } else if (c == 0) {
                fxrhVar = (fxrh) this.b.a(flftVar);
                if (fxrhVar == null) {
                    throw flhm.c("size", "size", flftVar);
                }
            } else if (c == 1) {
                str = (String) this.c.a(flftVar);
                if (str == null) {
                    throw flhm.c("alg", "alg", flftVar);
                }
            } else if (c == 2 && (str2 = (String) this.c.a(flftVar)) == null) {
                throw flhm.c("data_", "data", flftVar);
            }
        }
        flftVar.k();
        if (fxrhVar == null) {
            throw flhm.b("size", "size", flftVar);
        }
        if (str == null) {
            throw flhm.b("alg", "alg", flftVar);
        }
        if (str2 != null) {
            return new CredentialExchangeFormat$Fido2LargeBlob(fxrhVar.a, str, str2);
        }
        throw flhm.b("data_", "data", flftVar);
    }

    @Override // defpackage.flfl
    public final /* bridge */ /* synthetic */ void b(flfy flfyVar, Object obj) {
        CredentialExchangeFormat$Fido2LargeBlob credentialExchangeFormat$Fido2LargeBlob = (CredentialExchangeFormat$Fido2LargeBlob) obj;
        if (credentialExchangeFormat$Fido2LargeBlob == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        flfyVar.d();
        flfyVar.j("size");
        this.b.b(flfyVar, new fxrh(credentialExchangeFormat$Fido2LargeBlob.a));
        flfyVar.j("alg");
        flfl flflVar = this.c;
        flflVar.b(flfyVar, credentialExchangeFormat$Fido2LargeBlob.b);
        flfyVar.j("data");
        flflVar.b(flfyVar, credentialExchangeFormat$Fido2LargeBlob.c);
        flfyVar.f();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CredentialExchangeFormat.Fido2LargeBlob)";
    }
}
