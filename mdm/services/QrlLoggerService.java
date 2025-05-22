package com.google.android.gms.mdm.services;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.cauf;
import defpackage.cfjf;
import defpackage.cfjm;
import defpackage.fhtg;
import defpackage.fhtn;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class QrlLoggerService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        if (!Objects.equals(caufVar.a, "qrl_logging")) {
            return 2;
        }
        cfjf.b(cfjm.a(fhtn.QUICK_REMOTE_LOCK_PERIODIC, (fhtg) cfjm.d(getApplicationContext()).Q()));
        return 0;
    }
}
