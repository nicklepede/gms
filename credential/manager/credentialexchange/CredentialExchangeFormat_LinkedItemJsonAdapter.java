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
public final class CredentialExchangeFormat_LinkedItemJsonAdapter extends flfl {
    private final flfr a;
    private final flfl b;
    private final flfl c;

    public CredentialExchangeFormat_LinkedItemJsonAdapter(flgn flgnVar) {
        fxxm.f(flgnVar, "moshi");
        this.a = flfq.a("item", "account");
        fxsw fxswVar = fxsw.a;
        this.b = flgnVar.d(String.class, fxswVar, "item");
        this.c = flgnVar.d(String.class, fxswVar, "account");
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
                    throw flhm.c("item", "item", flftVar);
                }
            } else if (c == 1) {
                str2 = (String) this.c.a(flftVar);
            }
        }
        flftVar.k();
        if (str != null) {
            return new CredentialExchangeFormat$LinkedItem(str, str2);
        }
        throw flhm.b("item", "item", flftVar);
    }

    @Override // defpackage.flfl
    public final /* bridge */ /* synthetic */ void b(flfy flfyVar, Object obj) {
        CredentialExchangeFormat$LinkedItem credentialExchangeFormat$LinkedItem = (CredentialExchangeFormat$LinkedItem) obj;
        if (credentialExchangeFormat$LinkedItem == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        flfyVar.d();
        flfyVar.j("item");
        this.b.b(flfyVar, credentialExchangeFormat$LinkedItem.a);
        flfyVar.j("account");
        this.c.b(flfyVar, credentialExchangeFormat$LinkedItem.b);
        flfyVar.f();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CredentialExchangeFormat.LinkedItem)";
    }
}
