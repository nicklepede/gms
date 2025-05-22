package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.flfl;
import defpackage.flfq;
import defpackage.flfr;
import defpackage.flft;
import defpackage.flfy;
import defpackage.flgn;
import defpackage.flhd;
import defpackage.flhm;
import defpackage.fxrn;
import defpackage.fxsw;
import defpackage.fxxm;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class CredentialExchangeFormat_HeaderJsonAdapter extends flfl {
    private final flfr a;
    private final flfl b;
    private final flfl c;
    private final flfl d;
    private final flfl e;

    public CredentialExchangeFormat_HeaderJsonAdapter(flgn flgnVar) {
        fxxm.f(flgnVar, "moshi");
        this.a = flfq.a("version", "exporterRpId", "exporterDisplayName", "timestamp", "accounts");
        fxsw fxswVar = fxsw.a;
        this.b = flgnVar.d(fxrn.class, fxswVar, "version");
        this.c = flgnVar.d(String.class, fxswVar, "exporterRpId");
        this.d = flgnVar.d(Long.TYPE, fxswVar, "timestamp");
        this.e = flgnVar.d(flhd.b(List.class, CredentialExchangeFormat$Account.class), fxswVar, "accounts");
    }

    @Override // defpackage.flfl
    public final /* bridge */ /* synthetic */ Object a(flft flftVar) {
        flftVar.i();
        fxrn fxrnVar = null;
        Long l = null;
        String str = null;
        String str2 = null;
        List list = null;
        while (flftVar.o()) {
            int c = flftVar.c(this.a);
            if (c == -1) {
                flftVar.m();
                flftVar.n();
            } else if (c == 0) {
                fxrnVar = (fxrn) this.b.a(flftVar);
                if (fxrnVar == null) {
                    throw flhm.c("version", "version", flftVar);
                }
            } else if (c == 1) {
                str = (String) this.c.a(flftVar);
                if (str == null) {
                    throw flhm.c("exporterRpId", "exporterRpId", flftVar);
                }
            } else if (c == 2) {
                str2 = (String) this.c.a(flftVar);
                if (str2 == null) {
                    throw flhm.c("exporterDisplayName", "exporterDisplayName", flftVar);
                }
            } else if (c == 3) {
                l = (Long) this.d.a(flftVar);
                if (l == null) {
                    throw flhm.c("timestamp", "timestamp", flftVar);
                }
            } else if (c == 4 && (list = (List) this.e.a(flftVar)) == null) {
                throw flhm.c("accounts", "accounts", flftVar);
            }
        }
        flftVar.k();
        Long l2 = l;
        if (fxrnVar == null) {
            throw flhm.b("version", "version", flftVar);
        }
        if (str == null) {
            throw flhm.b("exporterRpId", "exporterRpId", flftVar);
        }
        if (str2 == null) {
            throw flhm.b("exporterDisplayName", "exporterDisplayName", flftVar);
        }
        if (l2 == null) {
            throw flhm.b("timestamp", "timestamp", flftVar);
        }
        long longValue = l2.longValue();
        if (list != null) {
            return new CredentialExchangeFormat$Header(fxrnVar.a, str, str2, longValue, list);
        }
        throw flhm.b("accounts", "accounts", flftVar);
    }

    @Override // defpackage.flfl
    public final /* bridge */ /* synthetic */ void b(flfy flfyVar, Object obj) {
        CredentialExchangeFormat$Header credentialExchangeFormat$Header = (CredentialExchangeFormat$Header) obj;
        if (credentialExchangeFormat$Header == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        flfyVar.d();
        flfyVar.j("version");
        this.b.b(flfyVar, new fxrn(credentialExchangeFormat$Header.a));
        flfyVar.j("exporterRpId");
        flfl flflVar = this.c;
        flflVar.b(flfyVar, credentialExchangeFormat$Header.b);
        flfyVar.j("exporterDisplayName");
        flflVar.b(flfyVar, credentialExchangeFormat$Header.c);
        flfyVar.j("timestamp");
        this.d.b(flfyVar, Long.valueOf(credentialExchangeFormat$Header.d));
        flfyVar.j("accounts");
        this.e.b(flfyVar, credentialExchangeFormat$Header.e);
        flfyVar.f();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CredentialExchangeFormat.Header)";
    }
}
