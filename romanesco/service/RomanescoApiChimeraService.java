package com.google.android.gms.romanesco.service;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.chimera.modules.romanesco.AppContextProvider;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxao;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.cxph;
import defpackage.eiuu;
import defpackage.frsn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class RomanescoApiChimeraService extends bxgd {
    private static final eiuu a = eiuu.L("android.permission-group.CONTACTS", "android.permission-group.PHONE", "android.permission-group.SMS");

    public RomanescoApiChimeraService() {
        super(new int[]{135}, new String[]{"com.google.android.gms.romanesco.service.START"}, a, 0, 9, (int) frsn.a.a().b(), null, eiuu.G(frsn.a.a().g().b));
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f;
        if (frsn.a.a().k()) {
            Context a2 = AppContextProvider.a();
            int a3 = bxao.a(a2, "android.permission.READ_CONTACTS", Binder.getCallingPid(), Binder.getCallingUid(), str);
            int a4 = bxao.a(a2, "android.permission.WRITE_CONTACTS", Binder.getCallingPid(), Binder.getCallingUid(), str);
            if (a3 != 0 || a4 != 0) {
                bxgjVar.a(16, new Bundle());
                return;
            }
        }
        bxgjVar.c(new cxph(l(), str, getServiceRequest.p));
    }
}
