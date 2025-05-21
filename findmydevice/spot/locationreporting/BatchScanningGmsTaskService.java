package com.google.android.gms.findmydevice.spot.locationreporting;

import android.os.Bundle;
import com.google.android.gms.findmydevice.util.SafeGmsTaskBoundService;
import defpackage.asej;
import defpackage.asot;
import defpackage.bebo;
import defpackage.beih;
import defpackage.byln;
import defpackage.ensj;
import defpackage.enss;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class BatchScanningGmsTaskService extends SafeGmsTaskBoundService {
    private final beih a = bebo.a().k();

    static {
        asot.b("BatchScanningGmsTask", asej.FIND_MY_DEVICE_SPOT);
    }

    @Override // com.google.android.gms.findmydevice.util.SafeGmsTaskBoundService
    protected final enss d(byln bylnVar) {
        Bundle bundle = bylnVar.b;
        if (bundle == null || !bundle.getBoolean("start_batch_scanning")) {
            this.a.c();
        } else {
            this.a.b();
        }
        return ensj.i(0);
    }
}
