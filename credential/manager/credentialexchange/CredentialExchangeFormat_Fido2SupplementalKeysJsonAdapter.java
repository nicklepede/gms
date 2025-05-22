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
public final class CredentialExchangeFormat_Fido2SupplementalKeysJsonAdapter extends flfl {
    private final flfr a;
    private final flfl b;

    public CredentialExchangeFormat_Fido2SupplementalKeysJsonAdapter(flgn flgnVar) {
        fxxm.f(flgnVar, "moshi");
        this.a = flfq.a("device", "provider");
        this.b = flgnVar.d(Boolean.class, fxsw.a, "device");
    }

    @Override // defpackage.flfl
    public final /* bridge */ /* synthetic */ Object a(flft flftVar) {
        flftVar.i();
        Boolean bool = null;
        Boolean bool2 = null;
        while (flftVar.o()) {
            int c = flftVar.c(this.a);
            if (c == -1) {
                flftVar.m();
                flftVar.n();
            } else if (c == 0) {
                bool = (Boolean) this.b.a(flftVar);
            } else if (c == 1) {
                bool2 = (Boolean) this.b.a(flftVar);
            }
        }
        flftVar.k();
        return new CredentialExchangeFormat$Fido2SupplementalKeys(bool, bool2);
    }

    @Override // defpackage.flfl
    public final /* bridge */ /* synthetic */ void b(flfy flfyVar, Object obj) {
        CredentialExchangeFormat$Fido2SupplementalKeys credentialExchangeFormat$Fido2SupplementalKeys = (CredentialExchangeFormat$Fido2SupplementalKeys) obj;
        if (credentialExchangeFormat$Fido2SupplementalKeys == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        flfyVar.d();
        flfyVar.j("device");
        flfl flflVar = this.b;
        flflVar.b(flfyVar, credentialExchangeFormat$Fido2SupplementalKeys.a);
        flfyVar.j("provider");
        flflVar.b(flfyVar, credentialExchangeFormat$Fido2SupplementalKeys.b);
        flfyVar.f();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CredentialExchangeFormat.Fido2SupplementalKeys)";
    }
}
