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
public final class CredentialExchangeFormat_Fido2SupplementalKeysJsonAdapter extends fipo {
    private final fipu a;
    private final fipo b;

    public CredentialExchangeFormat_Fido2SupplementalKeysJsonAdapter(fiqq fiqqVar) {
        fvbo.f(fiqqVar, "moshi");
        this.a = fipt.a("device", "provider");
        this.b = fiqqVar.d(Boolean.class, fuwy.a, "device");
    }

    @Override // defpackage.fipo
    public final /* bridge */ /* synthetic */ Object a(fipw fipwVar) {
        fipwVar.i();
        Boolean bool = null;
        Boolean bool2 = null;
        while (fipwVar.o()) {
            int c = fipwVar.c(this.a);
            if (c == -1) {
                fipwVar.m();
                fipwVar.n();
            } else if (c == 0) {
                bool = (Boolean) this.b.a(fipwVar);
            } else if (c == 1) {
                bool2 = (Boolean) this.b.a(fipwVar);
            }
        }
        fipwVar.k();
        return new CredentialExchangeFormat$Fido2SupplementalKeys(bool, bool2);
    }

    @Override // defpackage.fipo
    public final /* bridge */ /* synthetic */ void b(fiqb fiqbVar, Object obj) {
        CredentialExchangeFormat$Fido2SupplementalKeys credentialExchangeFormat$Fido2SupplementalKeys = (CredentialExchangeFormat$Fido2SupplementalKeys) obj;
        if (credentialExchangeFormat$Fido2SupplementalKeys == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        fiqbVar.d();
        fiqbVar.j("device");
        fipo fipoVar = this.b;
        fipoVar.b(fiqbVar, credentialExchangeFormat$Fido2SupplementalKeys.a);
        fiqbVar.j("provider");
        fipoVar.b(fiqbVar, credentialExchangeFormat$Fido2SupplementalKeys.b);
        fiqbVar.f();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CredentialExchangeFormat.Fido2SupplementalKeys)";
    }
}
