package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.fipo;
import defpackage.fipt;
import defpackage.fipu;
import defpackage.fipw;
import defpackage.fiqb;
import defpackage.fiqq;
import defpackage.fuwy;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class CredentialExchangeFormat_Fido2ExtensionsJsonAdapter extends fipo {
    private final fipu a;
    private final fipo b;
    private final fipo c;
    private final fipo d;
    private final fipo e;
    private final fipo f;

    public CredentialExchangeFormat_Fido2ExtensionsJsonAdapter(fiqq fiqqVar) {
        fvbo.f(fiqqVar, "moshi");
        this.a = fipt.a("hmacSecret", "credBlob", "largeBlob", "payments", "supplementalKeys");
        fuwy fuwyVar = fuwy.a;
        this.b = fiqqVar.d(CredentialExchangeFormat$Fido2HmacSecret.class, fuwyVar, "hmacSecret");
        this.c = fiqqVar.d(String.class, fuwyVar, "credBlob");
        this.d = fiqqVar.d(CredentialExchangeFormat$Fido2LargeBlob.class, fuwyVar, "largeBlob");
        this.e = fiqqVar.d(Boolean.class, fuwyVar, "payments");
        this.f = fiqqVar.d(CredentialExchangeFormat$Fido2SupplementalKeys.class, fuwyVar, "supplementalKeys");
    }

    @Override // defpackage.fipo
    public final /* bridge */ /* synthetic */ Object a(fipw fipwVar) {
        fipwVar.i();
        CredentialExchangeFormat$Fido2HmacSecret credentialExchangeFormat$Fido2HmacSecret = null;
        String str = null;
        CredentialExchangeFormat$Fido2LargeBlob credentialExchangeFormat$Fido2LargeBlob = null;
        Boolean bool = null;
        CredentialExchangeFormat$Fido2SupplementalKeys credentialExchangeFormat$Fido2SupplementalKeys = null;
        while (fipwVar.o()) {
            int c = fipwVar.c(this.a);
            if (c == -1) {
                fipwVar.m();
                fipwVar.n();
            } else if (c == 0) {
                credentialExchangeFormat$Fido2HmacSecret = (CredentialExchangeFormat$Fido2HmacSecret) this.b.a(fipwVar);
            } else if (c == 1) {
                str = (String) this.c.a(fipwVar);
            } else if (c == 2) {
                credentialExchangeFormat$Fido2LargeBlob = (CredentialExchangeFormat$Fido2LargeBlob) this.d.a(fipwVar);
            } else if (c == 3) {
                bool = (Boolean) this.e.a(fipwVar);
            } else if (c == 4) {
                credentialExchangeFormat$Fido2SupplementalKeys = (CredentialExchangeFormat$Fido2SupplementalKeys) this.f.a(fipwVar);
            }
        }
        fipwVar.k();
        return new CredentialExchangeFormat$Fido2Extensions(credentialExchangeFormat$Fido2HmacSecret, str, credentialExchangeFormat$Fido2LargeBlob, bool, credentialExchangeFormat$Fido2SupplementalKeys);
    }

    @Override // defpackage.fipo
    public final /* bridge */ /* synthetic */ void b(fiqb fiqbVar, Object obj) {
        CredentialExchangeFormat$Fido2Extensions credentialExchangeFormat$Fido2Extensions = (CredentialExchangeFormat$Fido2Extensions) obj;
        if (credentialExchangeFormat$Fido2Extensions == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        fiqbVar.d();
        fiqbVar.j("hmacSecret");
        this.b.b(fiqbVar, credentialExchangeFormat$Fido2Extensions.a);
        fiqbVar.j("credBlob");
        this.c.b(fiqbVar, credentialExchangeFormat$Fido2Extensions.b);
        fiqbVar.j("largeBlob");
        this.d.b(fiqbVar, credentialExchangeFormat$Fido2Extensions.c);
        fiqbVar.j("payments");
        this.e.b(fiqbVar, credentialExchangeFormat$Fido2Extensions.d);
        fiqbVar.j("supplementalKeys");
        this.f.b(fiqbVar, credentialExchangeFormat$Fido2Extensions.e);
        fiqbVar.f();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CredentialExchangeFormat.Fido2Extensions)";
    }
}
