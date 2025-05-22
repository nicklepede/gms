package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.flfl;
import defpackage.flfq;
import defpackage.flfr;
import defpackage.flft;
import defpackage.flfy;
import defpackage.flgn;
import defpackage.fxsw;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class CredentialExchangeFormat_Fido2ExtensionsJsonAdapter extends flfl {
    private final flfr a;
    private final flfl b;
    private final flfl c;
    private final flfl d;
    private final flfl e;
    private final flfl f;

    public CredentialExchangeFormat_Fido2ExtensionsJsonAdapter(flgn flgnVar) {
        fxxm.f(flgnVar, "moshi");
        this.a = flfq.a("hmacSecret", "credBlob", "largeBlob", "payments", "supplementalKeys");
        fxsw fxswVar = fxsw.a;
        this.b = flgnVar.d(CredentialExchangeFormat$Fido2HmacSecret.class, fxswVar, "hmacSecret");
        this.c = flgnVar.d(String.class, fxswVar, "credBlob");
        this.d = flgnVar.d(CredentialExchangeFormat$Fido2LargeBlob.class, fxswVar, "largeBlob");
        this.e = flgnVar.d(Boolean.class, fxswVar, "payments");
        this.f = flgnVar.d(CredentialExchangeFormat$Fido2SupplementalKeys.class, fxswVar, "supplementalKeys");
    }

    @Override // defpackage.flfl
    public final /* bridge */ /* synthetic */ Object a(flft flftVar) {
        flftVar.i();
        CredentialExchangeFormat$Fido2HmacSecret credentialExchangeFormat$Fido2HmacSecret = null;
        String str = null;
        CredentialExchangeFormat$Fido2LargeBlob credentialExchangeFormat$Fido2LargeBlob = null;
        Boolean bool = null;
        CredentialExchangeFormat$Fido2SupplementalKeys credentialExchangeFormat$Fido2SupplementalKeys = null;
        while (flftVar.o()) {
            int c = flftVar.c(this.a);
            if (c == -1) {
                flftVar.m();
                flftVar.n();
            } else if (c == 0) {
                credentialExchangeFormat$Fido2HmacSecret = (CredentialExchangeFormat$Fido2HmacSecret) this.b.a(flftVar);
            } else if (c == 1) {
                str = (String) this.c.a(flftVar);
            } else if (c == 2) {
                credentialExchangeFormat$Fido2LargeBlob = (CredentialExchangeFormat$Fido2LargeBlob) this.d.a(flftVar);
            } else if (c == 3) {
                bool = (Boolean) this.e.a(flftVar);
            } else if (c == 4) {
                credentialExchangeFormat$Fido2SupplementalKeys = (CredentialExchangeFormat$Fido2SupplementalKeys) this.f.a(flftVar);
            }
        }
        flftVar.k();
        return new CredentialExchangeFormat$Fido2Extensions(credentialExchangeFormat$Fido2HmacSecret, str, credentialExchangeFormat$Fido2LargeBlob, bool, credentialExchangeFormat$Fido2SupplementalKeys);
    }

    @Override // defpackage.flfl
    public final /* bridge */ /* synthetic */ void b(flfy flfyVar, Object obj) {
        CredentialExchangeFormat$Fido2Extensions credentialExchangeFormat$Fido2Extensions = (CredentialExchangeFormat$Fido2Extensions) obj;
        if (credentialExchangeFormat$Fido2Extensions == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        flfyVar.d();
        flfyVar.j("hmacSecret");
        this.b.b(flfyVar, credentialExchangeFormat$Fido2Extensions.a);
        flfyVar.j("credBlob");
        this.c.b(flfyVar, credentialExchangeFormat$Fido2Extensions.b);
        flfyVar.j("largeBlob");
        this.d.b(flfyVar, credentialExchangeFormat$Fido2Extensions.c);
        flfyVar.j("payments");
        this.e.b(flfyVar, credentialExchangeFormat$Fido2Extensions.d);
        flfyVar.j("supplementalKeys");
        this.f.b(flfyVar, credentialExchangeFormat$Fido2Extensions.e);
        flfyVar.f();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CredentialExchangeFormat.Fido2Extensions)";
    }
}
