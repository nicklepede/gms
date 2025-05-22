package com.google.android.gms.auth.aang.impl.deviceaccount;

import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.aebj;
import defpackage.atzb;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.bzpe;
import defpackage.elhz;
import defpackage.elpp;
import defpackage.fmvu;
import defpackage.xex;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class DeviceAccountChimeraService extends bzot {
    private aebj a;

    public DeviceAccountChimeraService() {
        super(316, "com.google.android.gms.auth.account.device.deviceaccount.START", elpp.a, 0, 10, elhz.G(fmvu.a.lK().c().b));
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        this.a = new aebj(AppContextProvider.a());
        bzpe l = l();
        aebj aebjVar = this.a;
        atzb.s(aebjVar);
        bzozVar.c(new xex(l, aebjVar));
    }

    @Override // defpackage.bzot, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onDestroy() {
        aebj aebjVar = this.a;
        if (aebjVar != null) {
            aebjVar.b();
        }
        super.onDestroy();
    }
}
