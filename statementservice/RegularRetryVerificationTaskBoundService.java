package com.google.android.gms.statementservice;

import android.content.Context;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.statementservice.database.VerificationRequestParamsDatabase;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cauf;
import defpackage.dhae;
import defpackage.dham;
import defpackage.dhao;
import defpackage.dhat;
import defpackage.dhau;
import defpackage.eluo;
import defpackage.fvca;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class RegularRetryVerificationTaskBoundService extends GmsTaskBoundService {
    static {
        ausn.b("AppLinksVerRegularRetry", auid.STATEMENT_SERVICE);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        if (fvca.c() && fvca.a.lK().c()) {
            Context applicationContext = getApplicationContext();
            ausn ausnVar = dham.a;
            dhau v = VerificationRequestParamsDatabase.w(applicationContext).v();
            dhae dhaeVar = new dhae(applicationContext);
            dhao dhaoVar = new dhao(applicationContext);
            ((eluo) dham.a.h()).z("Processing %d error requests.", v.a().size());
            for (dhat dhatVar : v.a()) {
                v.c(dhatVar);
                dhat dhatVar2 = new dhat(dhatVar.b, dhatVar.c, dhatVar.d, 0);
                v.b(dhatVar2);
                dham.b(dhatVar2, dhaeVar, v, dhaoVar);
            }
        }
        return 0;
    }
}
