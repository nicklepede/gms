package com.google.android.gms.udc.service;

import android.accounts.Account;
import android.os.Binder;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.atwh;
import defpackage.bbtn;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.djlb;
import defpackage.djlr;
import defpackage.djmj;
import defpackage.elpp;
import defpackage.eluq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class FacsInternalSyncApiChimeraService extends bzot {
    public static final eluq a = djlb.c();

    public FacsInternalSyncApiChimeraService() {
        super(220, "com.google.android.gms.facs.internal.service.START", elpp.a, 0, 10);
        setWantIntentExtras(true);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f;
        Account account = getServiceRequest.j;
        int callingUid = Binder.getCallingUid();
        atwh atwhVar = new atwh();
        atwhVar.d = str;
        atwhVar.e = "com.google.android.gms";
        atwhVar.a = callingUid;
        atwhVar.c = account;
        atwhVar.b = account;
        eluq eluqVar = a;
        eluqVar.h().ai(11850).x("Receiving API connection to internal FACS API...");
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            bbtn bbtnVar = new bbtn(l(), atwhVar, djmj.b(this), djlr.g(this), djlr.f(this));
            Binder.restoreCallingIdentity(clearCallingIdentity);
            bzozVar.c(bbtnVar);
            eluqVar.h().ai(11851).x("API connection successful!");
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
