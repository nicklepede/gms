package com.google.android.gms.udc.service;

import android.accounts.Account;
import android.os.Binder;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.atwh;
import defpackage.aupz;
import defpackage.bbsn;
import defpackage.bbsu;
import defpackage.bbth;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.djip;
import defpackage.djlb;
import defpackage.djli;
import defpackage.djlr;
import defpackage.djly;
import defpackage.djmj;
import defpackage.elpp;
import defpackage.eluq;
import defpackage.fvll;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class FacsCacheApiChimeraService extends bzot {
    public static final eluq a = djlb.c();
    final ExecutorService b;

    public FacsCacheApiChimeraService() {
        super(202, "com.google.android.gms.facs.cache.service.START", elpp.a, 1, 9);
        this.b = new aupz(1, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        eluq eluqVar = a;
        eluqVar.h().ai(11842).B("Receiving API connection to FACS API from package '%s'...", getServiceRequest.f);
        if (!fvll.p()) {
            bzozVar.a(16, null);
            eluqVar.j().ai(11844).x("API connection rejected!");
            return;
        }
        String str = getServiceRequest.f;
        Account account = getServiceRequest.j;
        int callingUid = Binder.getCallingUid();
        atwh atwhVar = new atwh();
        atwhVar.d = str;
        atwhVar.e = "com.google.android.gms";
        atwhVar.a = callingUid;
        atwhVar.c = account;
        atwhVar.b = account;
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            bbth bbthVar = new bbth(account, l(), m(this.b), atwhVar, djmj.b(this), djly.a(this), new djli(new djip(this, account)), djlr.g(this), djlr.f(this), djlr.a(getApplicationContext()), djlr.b(getApplicationContext()).a, new bbsu(this, new bbsn(account)));
            Binder.restoreCallingIdentity(clearCallingIdentity);
            bzozVar.c(bbthVar);
            eluqVar.h().ai(11843).x("API connection successful!");
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
