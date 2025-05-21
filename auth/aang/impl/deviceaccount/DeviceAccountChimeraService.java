package com.google.android.gms.auth.aang.impl.deviceaccount;

import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.acbj;
import defpackage.arwm;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.bxgo;
import defpackage.eiuu;
import defpackage.ejck;
import defpackage.fkfi;
import defpackage.viw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class DeviceAccountChimeraService extends bxgd {
    private acbj a;

    public DeviceAccountChimeraService() {
        super(316, "com.google.android.gms.auth.account.device.deviceaccount.START", ejck.a, 0, 10, eiuu.G(fkfi.a.a().c().b));
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        this.a = new acbj(AppContextProvider.a());
        bxgo l = l();
        acbj acbjVar = this.a;
        arwm.s(acbjVar);
        bxgjVar.c(new viw(l, acbjVar));
    }

    @Override // defpackage.bxgd, com.google.android.chimera.BoundService, defpackage.qan
    public final void onDestroy() {
        acbj acbjVar = this.a;
        if (acbjVar != null) {
            acbjVar.b();
        }
        super.onDestroy();
    }
}
