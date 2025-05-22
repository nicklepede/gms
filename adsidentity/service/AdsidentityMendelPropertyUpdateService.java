package com.google.android.gms.adsidentity.service;

import android.util.Log;
import com.google.android.gms.chimera.modules.adsidentity.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.cauf;
import defpackage.vah;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AdsidentityMendelPropertyUpdateService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        vah a2 = vah.a(AppContextProvider.a());
        Log.i("adservices", "Register privacy sandbox mendel properties via daily job");
        a2.b();
        return 0;
    }
}
