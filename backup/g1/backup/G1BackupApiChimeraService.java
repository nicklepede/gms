package com.google.android.gms.backup.g1.backup;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.albb;
import defpackage.atzb;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.bzpe;
import defpackage.elhz;
import defpackage.fodw;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class G1BackupApiChimeraService extends bzot {
    public G1BackupApiChimeraService() {
        super(182, "com.google.android.gms.backup.G1_BACKUP", Collections.EMPTY_SET, 0, 10, elhz.G(fodw.j().b));
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzpe l = l();
        atzb.s(getServiceRequest);
        bzozVar.c(new albb(this, l, getServiceRequest, getServiceRequest.f, getServiceRequest.p));
    }
}
