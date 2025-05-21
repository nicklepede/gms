package com.google.android.gms.udc.service;

import android.accounts.Account;
import android.os.Binder;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.arts;
import defpackage.azpr;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.dgzv;
import defpackage.dhal;
import defpackage.dhbd;
import defpackage.ejck;
import defpackage.ejhh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class FacsInternalSyncApiChimeraService extends bxgd {
    public static final ejhh a = dgzv.c();

    public FacsInternalSyncApiChimeraService() {
        super(220, "com.google.android.gms.facs.internal.service.START", ejck.a, 0, 10);
        setWantIntentExtras(true);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f;
        Account account = getServiceRequest.j;
        int callingUid = Binder.getCallingUid();
        arts artsVar = new arts();
        artsVar.d = str;
        artsVar.e = "com.google.android.gms";
        artsVar.a = callingUid;
        artsVar.c = account;
        artsVar.b = account;
        ejhh ejhhVar = a;
        ejhhVar.h().ah(11847).x("Receiving API connection to internal FACS API...");
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            azpr azprVar = new azpr(l(), artsVar, dhbd.b(this), dhal.g(this), dhal.f(this));
            Binder.restoreCallingIdentity(clearCallingIdentity);
            bxgjVar.c(azprVar);
            ejhhVar.h().ah(11848).x("API connection successful!");
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
