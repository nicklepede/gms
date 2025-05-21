package com.google.android.gms.findmydevice.spot.locationreporting;

import android.content.Intent;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.asej;
import defpackage.asot;
import defpackage.beiz;
import defpackage.byln;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class LocationReportUploadGmsTaskService extends GmsTaskBoundService {
    static {
        asot.b("LocationReportUplGmsSvc", asej.FIND_MY_DEVICE_SPOT);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        Intent d = beiz.d(this);
        if (d == null) {
            return 0;
        }
        d.putExtra("scheduled_by", "BATCH_UPLOAD_TRIGGERED_BY_GMS_TASK");
        getApplicationContext().startService(d);
        return 0;
    }
}
