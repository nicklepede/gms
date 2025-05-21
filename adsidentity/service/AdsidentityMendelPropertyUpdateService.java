package com.google.android.gms.adsidentity.service;

import android.util.Log;
import com.google.android.gms.chimera.modules.adsidentity.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.byln;
import defpackage.teh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AdsidentityMendelPropertyUpdateService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        teh a2 = teh.a(AppContextProvider.a());
        Log.i("adservices", "Register privacy sandbox mendel properties via daily job");
        a2.b();
        return 0;
    }
}
