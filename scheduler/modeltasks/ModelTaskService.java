package com.google.android.gms.scheduler.modeltasks;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.ausn;
import defpackage.bsxe;
import defpackage.cauf;
import defpackage.daoe;
import defpackage.eqgl;
import defpackage.fxuv;
import defpackage.fyea;
import defpackage.fyeb;
import defpackage.fyqe;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class ModelTaskService extends GmsTaskBoundService {
    public static final /* synthetic */ int b = 0;
    public final ausn a;
    private final fyea c;

    public ModelTaskService() {
        fxuv fxuvVar = bsxe.a;
        this.c = fyeb.b(bsxe.b);
        this.a = ausn.a("ModelTaskService");
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        return fyqe.d(this.c, new daoe(this, caufVar, null));
    }
}
