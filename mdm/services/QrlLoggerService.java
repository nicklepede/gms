package com.google.android.gms.mdm.services;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.byln;
import defpackage.cdaf;
import defpackage.cdam;
import defpackage.ffei;
import defpackage.ffep;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class QrlLoggerService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        if (!Objects.equals(bylnVar.a, "qrl_logging")) {
            return 2;
        }
        cdaf.b(cdam.a(ffep.QUICK_REMOTE_LOCK_PERIODIC, (ffei) cdam.d(getApplicationContext()).Q()));
        return 0;
    }
}
