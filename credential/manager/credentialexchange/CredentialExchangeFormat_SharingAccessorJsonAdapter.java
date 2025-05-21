package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.audk;
import defpackage.audl;
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
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class CredentialExchangeFormat_SharingAccessorJsonAdapter extends fipo {
    private final fipu a;
    private final fipo b;
    private final fipo c;
    private final fipo d;

    public CredentialExchangeFormat_SharingAccessorJsonAdapter(fiqq fiqqVar) {
        fvbo.f(fiqqVar, "moshi");
        this.a = fipt.a("type", "accountId", "name", "permissions");
        fuwy fuwyVar = fuwy.a;
        this.b = fiqqVar.d(audl.class, fuwyVar, "type");
        this.c = fiqqVar.d(String.class, fuwyVar, "accountId");
        this.d = fiqqVar.d(firg.b(Set.class, audk.class), fuwyVar, "permissions");
    }

    @Override // defpackage.fipo
    public final /* bridge */ /* synthetic */ Object a(fipw fipwVar) {
        fipwVar.i();
        audl audlVar = null;
        String str = null;
        String str2 = null;
        Set set = null;
        while (fipwVar.o()) {
            int c = fipwVar.c(this.a);
            if (c == -1) {
                fipwVar.m();
                fipwVar.n();
            } else if (c == 0) {
                audlVar = (audl) this.b.a(fipwVar);
                if (audlVar == null) {
                    throw firp.c("type", "type", fipwVar);
                }
            } else if (c == 1) {
                str = (String) this.c.a(fipwVar);
                if (str == null) {
                    throw firp.c("accountId", "accountId", fipwVar);
                }
            } else if (c == 2) {
                str2 = (String) this.c.a(fipwVar);
                if (str2 == null) {
                    throw firp.c("name", "name", fipwVar);
                }
            } else if (c == 3 && (set = (Set) this.d.a(fipwVar)) == null) {
                throw firp.c("permissions", "permissions", fipwVar);
            }
        }
        fipwVar.k();
        if (audlVar == null) {
            throw firp.b("type", "type", fipwVar);
        }
        if (str == null) {
            throw firp.b("accountId", "accountId", fipwVar);
        }
        if (str2 == null) {
            throw firp.b("name", "name", fipwVar);
        }
        if (set != null) {
            return new CredentialExchangeFormat$SharingAccessor(audlVar, str, str2, set);
        }
        throw firp.b("permissions", "permissions", fipwVar);
    }

    @Override // defpackage.fipo
    public final /* bridge */ /* synthetic */ void b(fiqb fiqbVar, Object obj) {
        CredentialExchangeFormat$SharingAccessor credentialExchangeFormat$SharingAccessor = (CredentialExchangeFormat$SharingAccessor) obj;
        if (credentialExchangeFormat$SharingAccessor == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        fiqbVar.d();
        fiqbVar.j("type");
        this.b.b(fiqbVar, credentialExchangeFormat$SharingAccessor.a);
        fiqbVar.j("accountId");
        fipo fipoVar = this.c;
        fipoVar.b(fiqbVar, credentialExchangeFormat$SharingAccessor.b);
        fiqbVar.j("name");
        fipoVar.b(fiqbVar, credentialExchangeFormat$SharingAccessor.c);
        fiqbVar.j("permissions");
        this.d.b(fiqbVar, credentialExchangeFormat$SharingAccessor.d);
        fiqbVar.f();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CredentialExchangeFormat.SharingAccessor)";
    }
}
