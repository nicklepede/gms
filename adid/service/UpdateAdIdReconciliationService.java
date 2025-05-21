package com.google.android.gms.adid.service;

import android.content.Context;
import com.google.android.gms.ads.identifier.settings.b;
import com.google.android.gms.ads.identifier.util.a;
import com.google.android.gms.chimera.modules.adid.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.asej;
import defpackage.asot;
import defpackage.byln;
import defpackage.fjux;
import java.util.concurrent.Executors;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class UpdateAdIdReconciliationService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;

    static {
        asot.b("UpdateAdIdReconTask", asej.ADID);
        Executors.newCachedThreadPool();
    }

    public UpdateAdIdReconciliationService() {
        this(AppContextProvider.a());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        fjux.c();
        return 2;
    }

    private UpdateAdIdReconciliationService(Context context) {
        this(context, new a(), new com.google.android.gms.ads.identifier.log.a(), b.c(context));
    }

    public UpdateAdIdReconciliationService(Context context, a aVar, com.google.android.gms.ads.identifier.log.a aVar2, b bVar) {
    }
}
