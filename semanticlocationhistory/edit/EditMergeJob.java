package com.google.android.gms.semanticlocationhistory.edit;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.edit.EditMergeJob;
import defpackage.asej;
import defpackage.asot;
import defpackage.byln;
import defpackage.czix;
import defpackage.czje;
import defpackage.dade;
import defpackage.dadh;
import defpackage.dahq;
import defpackage.eiho;
import defpackage.enps;
import defpackage.enre;
import defpackage.ensj;
import defpackage.enss;
import defpackage.fegx;
import defpackage.frwe;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class EditMergeJob extends GmsTaskBoundService {
    public static final String a = "com.google.android.gms.semanticlocationhistory.edit.EditMergeJob";
    private dade b;
    private czje c;
    private dahq d;

    static {
        asot.c("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY, "EditMergeJob");
    }

    private final czje d() {
        if (this.c == null) {
            this.c = new czje();
        }
        return this.c;
    }

    private final dahq e() {
        if (this.d == null) {
            this.d = new dahq();
        }
        return this.d;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        Context a2 = AppContextProvider.a();
        boolean z = true;
        for (Account account : czix.d(a2)) {
            d().e("EditMergeJobCalls");
            if (this.b == null) {
                this.b = dadh.w(a2);
            }
            if (this.b.q(account)) {
                d().e("EditMergeJobSuccess");
            } else {
                d().e("EditMergeJobFailure");
                z = false;
            }
        }
        return frwe.d() ? !z ? enps.f(e().g("EditMergeJob", fegx.h(System.currentTimeMillis())), new eiho() { // from class: dapz
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                String str = EditMergeJob.a;
                return 2;
            }
        }, enre.a) : enps.f(e().e("EditMergeJob", false), new eiho() { // from class: daqa
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                String str = EditMergeJob.a;
                return 0;
            }
        }, enre.a) : ensj.i(0);
    }
}
