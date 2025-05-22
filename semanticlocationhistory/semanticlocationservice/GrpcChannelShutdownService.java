package com.google.android.gms.semanticlocationhistory.semanticlocationservice;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.ausn;
import defpackage.cauf;
import defpackage.dbsp;
import defpackage.ddou;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class GrpcChannelShutdownService extends GmsTaskBoundService {
    public static final String a = "com.google.android.gms.semanticlocationhistory.semanticlocationservice.GrpcChannelShutdownService";

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        ausn ausnVar = dbsp.a;
        ddou.d();
        return 0;
    }
}
