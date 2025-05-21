package com.google.android.gms.appstate.service;

import android.accounts.Account;
import android.os.Binder;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.anxk;
import defpackage.asej;
import defpackage.asnf;
import defpackage.asng;
import defpackage.asot;
import defpackage.asqs;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.ejck;
import defpackage.ujj;
import defpackage.ujk;
import java.util.HashMap;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class AppStateAndroidChimeraService extends bxgd {
    public static final HashMap a;
    public static final Object b;

    static {
        asot.b("AppStateService", asej.APP_STATE);
        a = new HashMap();
        b = new Object();
    }

    public AppStateAndroidChimeraService() {
        super(7, "com.google.android.gms.appstate.service.START", ejck.a, 3, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        int callingUid = Binder.getCallingUid();
        String str = getServiceRequest.f;
        Account account = getServiceRequest.j;
        Account a2 = getServiceRequest.a();
        String[] d = asqs.d(getServiceRequest.h);
        anxk anxkVar = AppStateIntentChimeraService.b;
        ujk ujkVar = new ujk(bxgjVar, callingUid, str, account, a2, d, a2 != null);
        asnf asnfVar = asng.a;
        anxkVar.offer(new ujj(ujkVar));
        startService(asng.j("com.google.android.gms.appstate.service.INTENT"));
    }
}
