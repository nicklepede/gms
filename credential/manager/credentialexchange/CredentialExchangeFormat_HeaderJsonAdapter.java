package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.fipo;
import defpackage.fipt;
import defpackage.fipu;
import defpackage.fipw;
import defpackage.fiqb;
import defpackage.fiqq;
import defpackage.firg;
import defpackage.firp;
import defpackage.fuvp;
import defpackage.fuwy;
import defpackage.fvbo;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class CredentialExchangeFormat_HeaderJsonAdapter extends fipo {
    private final fipu a;
    private final fipo b;
    private final fipo c;
    private final fipo d;
    private final fipo e;

    public CredentialExchangeFormat_HeaderJsonAdapter(fiqq fiqqVar) {
        fvbo.f(fiqqVar, "moshi");
        this.a = fipt.a("version", "exporterRpId", "exporterDisplayName", "timestamp", "accounts");
        fuwy fuwyVar = fuwy.a;
        this.b = fiqqVar.d(fuvp.class, fuwyVar, "version");
        this.c = fiqqVar.d(String.class, fuwyVar, "exporterRpId");
        this.d = fiqqVar.d(Long.TYPE, fuwyVar, "timestamp");
        this.e = fiqqVar.d(firg.b(List.class, CredentialExchangeFormat$Account.class), fuwyVar, "accounts");
    }

    @Override // defpackage.fipo
    public final /* bridge */ /* synthetic */ Object a(fipw fipwVar) {
        fipwVar.i();
        fuvp fuvpVar = null;
        Long l = null;
        String str = null;
        String str2 = null;
        List list = null;
        while (fipwVar.o()) {
            int c = fipwVar.c(this.a);
            if (c == -1) {
                fipwVar.m();
                fipwVar.n();
            } else if (c == 0) {
                fuvpVar = (fuvp) this.b.a(fipwVar);
                if (fuvpVar == null) {
                    throw firp.c("version", "version", fipwVar);
                }
            } else if (c == 1) {
                str = (String) this.c.a(fipwVar);
                if (str == null) {
                    throw firp.c("exporterRpId", "exporterRpId", fipwVar);
                }
            } else if (c == 2) {
                str2 = (String) this.c.a(fipwVar);
                if (str2 == null) {
                    throw firp.c("exporterDisplayName", "exporterDisplayName", fipwVar);
                }
            } else if (c == 3) {
                l = (Long) this.d.a(fipwVar);
                if (l == null) {
                    throw firp.c("timestamp", "timestamp", fipwVar);
                }
            } else if (c == 4 && (list = (List) this.e.a(fipwVar)) == null) {
                throw firp.c("accounts", "accounts", fipwVar);
            }
        }
        fipwVar.k();
        Long l2 = l;
        if (fuvpVar == null) {
            throw firp.b("version", "version", fipwVar);
        }
        if (str == null) {
            throw firp.b("exporterRpId", "exporterRpId", fipwVar);
        }
        if (str2 == null) {
            throw firp.b("exporterDisplayName", "exporterDisplayName", fipwVar);
        }
        if (l2 == null) {
            throw firp.b("timestamp", "timestamp", fipwVar);
        }
        long longValue = l2.longValue();
        if (list != null) {
            return new CredentialExchangeFormat$Header(fuvpVar.a, str, str2, longValue, list);
        }
        throw firp.b("accounts", "accounts", fipwVar);
    }

    @Override // defpackage.fipo
    public final /* bridge */ /* synthetic */ void b(fiqb fiqbVar, Object obj) {
        CredentialExchangeFormat$Header credentialExchangeFormat$Header = (CredentialExchangeFormat$Header) obj;
        if (credentialExchangeFormat$Header == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        fiqbVar.d();
        fiqbVar.j("version");
        this.b.b(fiqbVar, new fuvp(credentialExchangeFormat$Header.a));
        fiqbVar.j("exporterRpId");
        fipo fipoVar = this.c;
        fipoVar.b(fiqbVar, credentialExchangeFormat$Header.b);
        fiqbVar.j("exporterDisplayName");
        fipoVar.b(fiqbVar, credentialExchangeFormat$Header.c);
        fiqbVar.j("timestamp");
        this.d.b(fiqbVar, Long.valueOf(credentialExchangeFormat$Header.d));
        fiqbVar.j("accounts");
        this.e.b(fiqbVar, credentialExchangeFormat$Header.e);
        fiqbVar.f();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CredentialExchangeFormat.Header)";
    }
}
