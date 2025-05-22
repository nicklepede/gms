package com.google.android.gms.semanticlocationhistory.edit;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.edit.EditMergeJob;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cauf;
import defpackage.dbsv;
import defpackage.dbtc;
import defpackage.dcnm;
import defpackage.dcnp;
import defpackage.dcry;
import defpackage.ekut;
import defpackage.eqdl;
import defpackage.eqex;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.fgvq;
import defpackage.fuqy;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class EditMergeJob extends GmsTaskBoundService {
    public static final String a = "com.google.android.gms.semanticlocationhistory.edit.EditMergeJob";
    private dcnm b;
    private dbtc c;
    private dcry d;

    static {
        ausn.c("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY, "EditMergeJob");
    }

    private final dbtc d() {
        if (this.c == null) {
            this.c = new dbtc();
        }
        return this.c;
    }

    private final dcry e() {
        if (this.d == null) {
            this.d = new dcry();
        }
        return this.d;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        Context a2 = AppContextProvider.a();
        boolean z = true;
        for (Account account : dbsv.d(a2)) {
            d().e("EditMergeJobCalls");
            if (this.b == null) {
                this.b = dcnp.w(a2);
            }
            if (this.b.q(account)) {
                d().e("EditMergeJobSuccess");
            } else {
                d().e("EditMergeJobFailure");
                z = false;
            }
        }
        return fuqy.d() ? !z ? eqdl.f(e().g("EditMergeJob", fgvq.h(System.currentTimeMillis())), new ekut() { // from class: ddah
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                String str = EditMergeJob.a;
                return 2;
            }
        }, eqex.a) : eqdl.f(e().e("EditMergeJob", false), new ekut() { // from class: ddai
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                String str = EditMergeJob.a;
                return 0;
            }
        }, eqex.a) : eqgc.i(0);
    }
}
