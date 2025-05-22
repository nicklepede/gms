package com.google.android.gms.backup.g1.restore;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.aleg;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.elhz;
import defpackage.fodw;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class G1RestoreApiChimeraService extends bzot {
    public G1RestoreApiChimeraService() {
        super(181, "com.google.android.gms.backup.G1_RESTORE", Collections.EMPTY_SET, 0, 10, elhz.G(fodw.j().b));
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new aleg(this, l(), getServiceRequest.f, getServiceRequest.p));
    }
}
