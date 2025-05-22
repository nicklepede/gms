package com.google.android.gms.clearcut.bootcount;

import android.content.Intent;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.asdx;
import defpackage.bzot;
import defpackage.bzoz;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class BootCountChimeraService extends bzot {
    public BootCountChimeraService() {
        super(124, "com.google.android.gms.clearcut.bootcount.service.START", Collections.EMPTY_SET, 2, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new asdx(this));
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final boolean onUnbind(Intent intent) {
        return true;
    }
}
