package com.google.android.gms.appstate.service;

import android.accounts.Account;
import android.os.Binder;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.apzc;
import defpackage.auid;
import defpackage.auqz;
import defpackage.aura;
import defpackage.ausn;
import defpackage.auum;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.elpp;
import defpackage.wfi;
import defpackage.wfj;
import java.util.HashMap;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class AppStateAndroidChimeraService extends bzot {
    public static final HashMap a;
    public static final Object b;

    static {
        ausn.b("AppStateService", auid.APP_STATE);
        a = new HashMap();
        b = new Object();
    }

    public AppStateAndroidChimeraService() {
        super(7, "com.google.android.gms.appstate.service.START", elpp.a, 3, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        int callingUid = Binder.getCallingUid();
        String str = getServiceRequest.f;
        Account account = getServiceRequest.j;
        Account a2 = getServiceRequest.a();
        String[] d = auum.d(getServiceRequest.h);
        apzc apzcVar = AppStateIntentChimeraService.b;
        wfj wfjVar = new wfj(bzozVar, callingUid, str, account, a2, d, a2 != null);
        auqz auqzVar = aura.a;
        apzcVar.offer(new wfi(wfjVar));
        startService(aura.j("com.google.android.gms.appstate.service.INTENT"));
    }
}
