package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.flfl;
import defpackage.flfq;
import defpackage.flfr;
import defpackage.flft;
import defpackage.flfy;
import defpackage.flgn;
import defpackage.flhd;
import defpackage.flhm;
import defpackage.fxsw;
import defpackage.fxxm;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class CredentialExchangeFormat_Extension_SharedExtensionJsonAdapter extends flfl {
    private final flfr a;
    private final flfl b;

    public CredentialExchangeFormat_Extension_SharedExtensionJsonAdapter(flgn flgnVar) {
        fxxm.f(flgnVar, "moshi");
        this.a = flfq.a("accessors");
        this.b = flgnVar.d(flhd.b(List.class, CredentialExchangeFormat$SharingAccessor.class), fxsw.a, "accessors");
    }

    @Override // defpackage.flfl
    public final /* bridge */ /* synthetic */ Object a(flft flftVar) {
        flftVar.i();
        List list = null;
        while (flftVar.o()) {
            int c = flftVar.c(this.a);
            if (c == -1) {
                flftVar.m();
                flftVar.n();
            } else if (c == 0 && (list = (List) this.b.a(flftVar)) == null) {
                throw flhm.c("accessors", "accessors", flftVar);
            }
        }
        flftVar.k();
        if (list != null) {
            return new CredentialExchangeFormat$Extension$SharedExtension(list);
        }
        throw flhm.b("accessors", "accessors", flftVar);
    }

    @Override // defpackage.flfl
    public final /* bridge */ /* synthetic */ void b(flfy flfyVar, Object obj) {
        CredentialExchangeFormat$Extension$SharedExtension credentialExchangeFormat$Extension$SharedExtension = (CredentialExchangeFormat$Extension$SharedExtension) obj;
        if (credentialExchangeFormat$Extension$SharedExtension == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        flfyVar.d();
        flfyVar.j("accessors");
        this.b.b(flfyVar, credentialExchangeFormat$Extension$SharedExtension.a);
        flfyVar.f();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CredentialExchangeFormat.Extension.SharedExtension)";
    }
}
