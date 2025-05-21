package com.google.android.gms.udc.service;

import android.accounts.Account;
import android.os.Binder;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.arts;
import defpackage.asmf;
import defpackage.azor;
import defpackage.azoy;
import defpackage.azpl;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.dgxj;
import defpackage.dgzv;
import defpackage.dhac;
import defpackage.dhal;
import defpackage.dhas;
import defpackage.dhbd;
import defpackage.ejck;
import defpackage.ejhh;
import defpackage.fspw;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class FacsCacheApiChimeraService extends bxgd {
    public static final ejhh a = dgzv.c();
    final ExecutorService b;

    public FacsCacheApiChimeraService() {
        super(202, "com.google.android.gms.facs.cache.service.START", ejck.a, 1, 9);
        this.b = new asmf(1, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        ejhh ejhhVar = a;
        ejhhVar.h().ah(11839).B("Receiving API connection to FACS API from package '%s'...", getServiceRequest.f);
        if (!fspw.p()) {
            bxgjVar.a(16, null);
            ejhhVar.j().ah(11841).x("API connection rejected!");
            return;
        }
        String str = getServiceRequest.f;
        Account account = getServiceRequest.j;
        int callingUid = Binder.getCallingUid();
        arts artsVar = new arts();
        artsVar.d = str;
        artsVar.e = "com.google.android.gms";
        artsVar.a = callingUid;
        artsVar.c = account;
        artsVar.b = account;
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            azpl azplVar = new azpl(account, l(), m(this.b), artsVar, dhbd.b(this), dhas.a(this), new dhac(new dgxj(this, account)), dhal.g(this), dhal.f(this), dhal.a(getApplicationContext()), dhal.b(getApplicationContext()).a, new azoy(this, new azor(account)));
            Binder.restoreCallingIdentity(clearCallingIdentity);
            bxgjVar.c(azplVar);
            ejhhVar.h().ah(11840).x("API connection successful!");
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
