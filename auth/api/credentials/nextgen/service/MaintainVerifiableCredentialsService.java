package com.google.android.gms.auth.api.credentials.nextgen.service;

import com.google.android.gms.auth.api.credentials.nextgen.service.MaintainVerifiableCredentialsService;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.bmdx;
import defpackage.bmek;
import defpackage.bmel;
import defpackage.bmeo;
import defpackage.bmkf;
import defpackage.bmlt;
import defpackage.byln;
import defpackage.eiuu;
import defpackage.ennt;
import defpackage.ensj;
import defpackage.enss;
import defpackage.ytm;
import defpackage.ytx;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class MaintainVerifiableCredentialsService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        return eiuu.K("RecurringMaintainVerifiableCredentials", "OneOffMaintainVerifiableCredentials").contains(bylnVar.a) ? ((ytx) ((bmkf) ytm.a.a()).z(new ytm())).a().j(new bmlt() { // from class: ytu
            @Override // defpackage.bmlt
            public final Object a(Object obj) {
                int i = MaintainVerifiableCredentialsService.a;
                return 0;
            }
        }).d(bmel.c(bmeo.class, new bmdx(), ennt.j(28469, 7)).c(1)).d(new bmek(Exception.class).c(2)) : ensj.i(2);
    }
}
