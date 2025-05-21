package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.fipo;
import defpackage.fipt;
import defpackage.fipu;
import defpackage.fipw;
import defpackage.fiqb;
import defpackage.fiqq;
import defpackage.firp;
import defpackage.fuvj;
import defpackage.fuwy;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class CredentialExchangeFormat_Fido2LargeBlobJsonAdapter extends fipo {
    private final fipu a;
    private final fipo b;
    private final fipo c;

    public CredentialExchangeFormat_Fido2LargeBlobJsonAdapter(fiqq fiqqVar) {
        fvbo.f(fiqqVar, "moshi");
        this.a = fipt.a("size", "alg", "data");
        fuwy fuwyVar = fuwy.a;
        this.b = fiqqVar.d(fuvj.class, fuwyVar, "size");
        this.c = fiqqVar.d(String.class, fuwyVar, "alg");
    }

    @Override // defpackage.fipo
    public final /* bridge */ /* synthetic */ Object a(fipw fipwVar) {
        fipwVar.i();
        fuvj fuvjVar = null;
        String str = null;
        String str2 = null;
        while (fipwVar.o()) {
            int c = fipwVar.c(this.a);
            if (c == -1) {
                fipwVar.m();
                fipwVar.n();
            } else if (c == 0) {
                fuvjVar = (fuvj) this.b.a(fipwVar);
                if (fuvjVar == null) {
                    throw firp.c("size", "size", fipwVar);
                }
            } else if (c == 1) {
                str = (String) this.c.a(fipwVar);
                if (str == null) {
                    throw firp.c("alg", "alg", fipwVar);
                }
            } else if (c == 2 && (str2 = (String) this.c.a(fipwVar)) == null) {
                throw firp.c("data_", "data", fipwVar);
            }
        }
        fipwVar.k();
        if (fuvjVar == null) {
            throw firp.b("size", "size", fipwVar);
        }
        if (str == null) {
            throw firp.b("alg", "alg", fipwVar);
        }
        if (str2 != null) {
            return new CredentialExchangeFormat$Fido2LargeBlob(fuvjVar.a, str, str2);
        }
        throw firp.b("data_", "data", fipwVar);
    }

    @Override // defpackage.fipo
    public final /* bridge */ /* synthetic */ void b(fiqb fiqbVar, Object obj) {
        CredentialExchangeFormat$Fido2LargeBlob credentialExchangeFormat$Fido2LargeBlob = (CredentialExchangeFormat$Fido2LargeBlob) obj;
        if (credentialExchangeFormat$Fido2LargeBlob == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        fiqbVar.d();
        fiqbVar.j("size");
        this.b.b(fiqbVar, new fuvj(credentialExchangeFormat$Fido2LargeBlob.a));
        fiqbVar.j("alg");
        fipo fipoVar = this.c;
        fipoVar.b(fiqbVar, credentialExchangeFormat$Fido2LargeBlob.b);
        fiqbVar.j("data");
        fipoVar.b(fiqbVar, credentialExchangeFormat$Fido2LargeBlob.c);
        fiqbVar.f();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CredentialExchangeFormat.Fido2LargeBlob)";
    }
}
