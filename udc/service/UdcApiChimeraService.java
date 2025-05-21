package com.google.android.gms.udc.service;

import android.accounts.Account;
import android.os.Binder;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.asmf;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.dgyr;
import defpackage.eits;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class UdcApiChimeraService extends bxgd {
    public static final /* synthetic */ int a = 0;

    public UdcApiChimeraService() {
        super(new int[]{35}, new String[]{"com.google.android.gms.udc.service.START"}, Collections.EMPTY_SET, 2, new asmf(Integer.MAX_VALUE, 9), (eits) null);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f;
        Account account = getServiceRequest.j;
        int callingUid = Binder.getCallingUid();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            dgyr dgyrVar = new dgyr(this, l(), account, str, callingUid);
            Binder.restoreCallingIdentity(clearCallingIdentity);
            bxgjVar.c(dgyrVar);
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
