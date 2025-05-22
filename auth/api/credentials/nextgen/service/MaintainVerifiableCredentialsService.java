package com.google.android.gms.auth.api.credentials.nextgen.service;

import com.google.android.gms.auth.api.credentials.nextgen.service.MaintainVerifiableCredentialsService;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.aasn;
import defpackage.aatn;
import defpackage.bokp;
import defpackage.bolc;
import defpackage.bold;
import defpackage.bolg;
import defpackage.boqy;
import defpackage.bosm;
import defpackage.cauf;
import defpackage.elhz;
import defpackage.eqbm;
import defpackage.eqgc;
import defpackage.eqgl;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class MaintainVerifiableCredentialsService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        return elhz.K("RecurringMaintainVerifiableCredentials", "OneOffMaintainVerifiableCredentials").contains(caufVar.a) ? ((aatn) ((boqy) aasn.a.lK()).B(new aasn())).a().k(new bosm() { // from class: aasv
            @Override // defpackage.bosm
            public final Object a(Object obj) {
                int i = MaintainVerifiableCredentialsService.a;
                return 0;
            }
        }).e(bold.c(bolg.class, new bokp(), eqbm.j(28469, 7)).c(1)).e(new bolc(Exception.class).c(2)) : eqgc.i(2);
    }
}
