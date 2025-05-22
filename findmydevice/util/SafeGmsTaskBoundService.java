package com.google.android.gms.findmydevice.util;

import com.google.android.gms.findmydevice.util.SafeGmsTaskBoundService;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cauf;
import defpackage.ejaf;
import defpackage.ekut;
import defpackage.eqex;
import defpackage.eqgl;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public abstract class SafeGmsTaskBoundService extends GmsTaskBoundService {
    public static final ausn h = ausn.b("DeviceSyncService", auid.FIND_MY_DEVICE_SPOT);

    protected abstract eqgl d(cauf caufVar);

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        return ejaf.e(d(caufVar), Throwable.class, new ekut() { // from class: bhkr
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                ((eluo) ((eluo) ((eluo) SafeGmsTaskBoundService.h.i()).s((Throwable) obj)).ai((char) 4592)).x("Failed to run task");
                return 2;
            }
        }, eqex.a);
    }
}
