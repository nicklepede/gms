package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.fipo;
import defpackage.fipt;
import defpackage.fipu;
import defpackage.fipw;
import defpackage.fiqb;
import defpackage.fiqq;
import defpackage.firg;
import defpackage.firp;
import defpackage.fuwy;
import defpackage.fvbo;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class CredentialExchangeFormat_Extension_SharedExtensionJsonAdapter extends fipo {
    private final fipu a;
    private final fipo b;

    public CredentialExchangeFormat_Extension_SharedExtensionJsonAdapter(fiqq fiqqVar) {
        fvbo.f(fiqqVar, "moshi");
        this.a = fipt.a("accessors");
        this.b = fiqqVar.d(firg.b(List.class, CredentialExchangeFormat$SharingAccessor.class), fuwy.a, "accessors");
    }

    @Override // defpackage.fipo
    public final /* bridge */ /* synthetic */ Object a(fipw fipwVar) {
        fipwVar.i();
        List list = null;
        while (fipwVar.o()) {
            int c = fipwVar.c(this.a);
            if (c == -1) {
                fipwVar.m();
                fipwVar.n();
            } else if (c == 0 && (list = (List) this.b.a(fipwVar)) == null) {
                throw firp.c("accessors", "accessors", fipwVar);
            }
        }
        fipwVar.k();
        if (list != null) {
            return new CredentialExchangeFormat$Extension$SharedExtension(list);
        }
        throw firp.b("accessors", "accessors", fipwVar);
    }

    @Override // defpackage.fipo
    public final /* bridge */ /* synthetic */ void b(fiqb fiqbVar, Object obj) {
        CredentialExchangeFormat$Extension$SharedExtension credentialExchangeFormat$Extension$SharedExtension = (CredentialExchangeFormat$Extension$SharedExtension) obj;
        if (credentialExchangeFormat$Extension$SharedExtension == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        fiqbVar.d();
        fiqbVar.j("accessors");
        this.b.b(fiqbVar, credentialExchangeFormat$Extension$SharedExtension.a);
        fiqbVar.f();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CredentialExchangeFormat.Extension.SharedExtension)";
    }
}
