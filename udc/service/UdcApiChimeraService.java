package com.google.android.gms.udc.service;

import android.accounts.Account;
import android.os.Binder;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.aupz;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.djjx;
import defpackage.elgx;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class UdcApiChimeraService extends bzot {
    public static final /* synthetic */ int a = 0;

    public UdcApiChimeraService() {
        super(new int[]{35}, new String[]{"com.google.android.gms.udc.service.START"}, Collections.EMPTY_SET, 2, new aupz(Integer.MAX_VALUE, 9), (elgx) null);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f;
        Account account = getServiceRequest.j;
        int callingUid = Binder.getCallingUid();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            djjx djjxVar = new djjx(this, l(), account, str, callingUid);
            Binder.restoreCallingIdentity(clearCallingIdentity);
            bzozVar.c(djjxVar);
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
