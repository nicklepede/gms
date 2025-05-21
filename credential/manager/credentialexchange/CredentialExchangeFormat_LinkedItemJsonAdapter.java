package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.fipo;
import defpackage.fipt;
import defpackage.fipu;
import defpackage.fipw;
import defpackage.fiqb;
import defpackage.fiqq;
import defpackage.firp;
import defpackage.fuwy;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class CredentialExchangeFormat_LinkedItemJsonAdapter extends fipo {
    private final fipu a;
    private final fipo b;
    private final fipo c;

    public CredentialExchangeFormat_LinkedItemJsonAdapter(fiqq fiqqVar) {
        fvbo.f(fiqqVar, "moshi");
        this.a = fipt.a("item", "account");
        fuwy fuwyVar = fuwy.a;
        this.b = fiqqVar.d(String.class, fuwyVar, "item");
        this.c = fiqqVar.d(String.class, fuwyVar, "account");
    }

    @Override // defpackage.fipo
    public final /* bridge */ /* synthetic */ Object a(fipw fipwVar) {
        fipwVar.i();
        String str = null;
        String str2 = null;
        while (fipwVar.o()) {
            int c = fipwVar.c(this.a);
            if (c == -1) {
                fipwVar.m();
                fipwVar.n();
            } else if (c == 0) {
                str = (String) this.b.a(fipwVar);
                if (str == null) {
                    throw firp.c("item", "item", fipwVar);
                }
            } else if (c == 1) {
                str2 = (String) this.c.a(fipwVar);
            }
        }
        fipwVar.k();
        if (str != null) {
            return new CredentialExchangeFormat$LinkedItem(str, str2);
        }
        throw firp.b("item", "item", fipwVar);
    }

    @Override // defpackage.fipo
    public final /* bridge */ /* synthetic */ void b(fiqb fiqbVar, Object obj) {
        CredentialExchangeFormat$LinkedItem credentialExchangeFormat$LinkedItem = (CredentialExchangeFormat$LinkedItem) obj;
        if (credentialExchangeFormat$LinkedItem == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        fiqbVar.d();
        fiqbVar.j("item");
        this.b.b(fiqbVar, credentialExchangeFormat$LinkedItem.a);
        fiqbVar.j("account");
        this.c.b(fiqbVar, credentialExchangeFormat$LinkedItem.b);
        fiqbVar.f();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CredentialExchangeFormat.LinkedItem)";
    }
}
