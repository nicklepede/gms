package com.google.android.gms.statementservice;

import android.content.Context;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.statementservice.database.VerificationRequestParamsDatabase;
import defpackage.asej;
import defpackage.asot;
import defpackage.byln;
import defpackage.depb;
import defpackage.depj;
import defpackage.depl;
import defpackage.depq;
import defpackage.depr;
import defpackage.ejhf;
import defpackage.fshc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class RegularRetryVerificationTaskBoundService extends GmsTaskBoundService {
    static {
        asot.b("AppLinksVerRegularRetry", asej.STATEMENT_SERVICE);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        if (fshc.c() && fshc.a.a().c()) {
            Context applicationContext = getApplicationContext();
            asot asotVar = depj.a;
            depr v = VerificationRequestParamsDatabase.w(applicationContext).v();
            depb depbVar = new depb(applicationContext);
            depl deplVar = new depl(applicationContext);
            ((ejhf) depj.a.h()).z("Processing %d error requests.", v.a().size());
            for (depq depqVar : v.a()) {
                v.c(depqVar);
                depq depqVar2 = new depq(depqVar.b, depqVar.c, depqVar.d, 0);
                v.b(depqVar2);
                depj.b(depqVar2, depbVar, v, deplVar);
            }
        }
        return 0;
    }
}
