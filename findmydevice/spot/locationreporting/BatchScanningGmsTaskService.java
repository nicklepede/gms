package com.google.android.gms.findmydevice.spot.locationreporting;

import android.os.Bundle;
import com.google.android.gms.findmydevice.util.SafeGmsTaskBoundService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bgda;
import defpackage.bgjt;
import defpackage.cauf;
import defpackage.eqgc;
import defpackage.eqgl;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class BatchScanningGmsTaskService extends SafeGmsTaskBoundService {
    private final bgjt a = bgda.a().k();

    static {
        ausn.b("BatchScanningGmsTask", auid.FIND_MY_DEVICE_SPOT);
    }

    @Override // com.google.android.gms.findmydevice.util.SafeGmsTaskBoundService
    protected final eqgl d(cauf caufVar) {
        Bundle bundle = caufVar.b;
        if (bundle == null || !bundle.getBoolean("start_batch_scanning")) {
            this.a.c();
        } else {
            this.a.b();
        }
        return eqgc.i(0);
    }
}
