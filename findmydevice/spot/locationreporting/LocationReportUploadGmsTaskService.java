package com.google.android.gms.findmydevice.spot.locationreporting;

import android.content.Intent;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bgkl;
import defpackage.cauf;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class LocationReportUploadGmsTaskService extends GmsTaskBoundService {
    static {
        ausn.b("LocationReportUplGmsSvc", auid.FIND_MY_DEVICE_SPOT);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        Intent d = bgkl.d(this);
        if (d == null) {
            return 0;
        }
        d.putExtra("scheduled_by", "BATCH_UPLOAD_TRIGGERED_BY_GMS_TASK");
        getApplicationContext().startService(d);
        return 0;
    }
}
