package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.awhp;
import defpackage.awhq;
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
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class CredentialExchangeFormat_SharingAccessorJsonAdapter extends flfl {
    private final flfr a;
    private final flfl b;
    private final flfl c;
    private final flfl d;

    public CredentialExchangeFormat_SharingAccessorJsonAdapter(flgn flgnVar) {
        fxxm.f(flgnVar, "moshi");
        this.a = flfq.a("type", "accountId", "name", "permissions");
        fxsw fxswVar = fxsw.a;
        this.b = flgnVar.d(awhq.class, fxswVar, "type");
        this.c = flgnVar.d(String.class, fxswVar, "accountId");
        this.d = flgnVar.d(flhd.b(Set.class, awhp.class), fxswVar, "permissions");
    }

    @Override // defpackage.flfl
    public final /* bridge */ /* synthetic */ Object a(flft flftVar) {
        flftVar.i();
        awhq awhqVar = null;
        String str = null;
        String str2 = null;
        Set set = null;
        while (flftVar.o()) {
            int c = flftVar.c(this.a);
            if (c == -1) {
                flftVar.m();
                flftVar.n();
            } else if (c == 0) {
                awhqVar = (awhq) this.b.a(flftVar);
                if (awhqVar == null) {
                    throw flhm.c("type", "type", flftVar);
                }
            } else if (c == 1) {
                str = (String) this.c.a(flftVar);
                if (str == null) {
                    throw flhm.c("accountId", "accountId", flftVar);
                }
            } else if (c == 2) {
                str2 = (String) this.c.a(flftVar);
                if (str2 == null) {
                    throw flhm.c("name", "name", flftVar);
                }
            } else if (c == 3 && (set = (Set) this.d.a(flftVar)) == null) {
                throw flhm.c("permissions", "permissions", flftVar);
            }
        }
        flftVar.k();
        if (awhqVar == null) {
            throw flhm.b("type", "type", flftVar);
        }
        if (str == null) {
            throw flhm.b("accountId", "accountId", flftVar);
        }
        if (str2 == null) {
            throw flhm.b("name", "name", flftVar);
        }
        if (set != null) {
            return new CredentialExchangeFormat$SharingAccessor(awhqVar, str, str2, set);
        }
        throw flhm.b("permissions", "permissions", flftVar);
    }

    @Override // defpackage.flfl
    public final /* bridge */ /* synthetic */ void b(flfy flfyVar, Object obj) {
        CredentialExchangeFormat$SharingAccessor credentialExchangeFormat$SharingAccessor = (CredentialExchangeFormat$SharingAccessor) obj;
        if (credentialExchangeFormat$SharingAccessor == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        flfyVar.d();
        flfyVar.j("type");
        this.b.b(flfyVar, credentialExchangeFormat$SharingAccessor.a);
        flfyVar.j("accountId");
        flfl flflVar = this.c;
        flflVar.b(flfyVar, credentialExchangeFormat$SharingAccessor.b);
        flfyVar.j("name");
        flflVar.b(flfyVar, credentialExchangeFormat$SharingAccessor.c);
        flfyVar.j("permissions");
        this.d.b(flfyVar, credentialExchangeFormat$SharingAccessor.d);
        flfyVar.f();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CredentialExchangeFormat.SharingAccessor)";
    }
}
