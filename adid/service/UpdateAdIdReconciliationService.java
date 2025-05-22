package com.google.android.gms.adid.service;

import android.content.Context;
import com.google.android.gms.ads.identifier.settings.b;
import com.google.android.gms.ads.identifier.util.a;
import com.google.android.gms.chimera.modules.adid.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cauf;
import defpackage.fmla;
import java.util.concurrent.Executors;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class UpdateAdIdReconciliationService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;

    static {
        ausn.b("UpdateAdIdReconTask", auid.ADID);
        Executors.newCachedThreadPool();
    }

    public UpdateAdIdReconciliationService() {
        this(AppContextProvider.a());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        fmla.c();
        return 2;
    }

    private UpdateAdIdReconciliationService(Context context) {
        this(context, new a(), new com.google.android.gms.ads.identifier.log.a(), b.c(context));
    }

    public UpdateAdIdReconciliationService(Context context, a aVar, com.google.android.gms.ads.identifier.log.a aVar2, b bVar) {
    }
}
