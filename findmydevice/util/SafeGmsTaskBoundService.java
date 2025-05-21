package com.google.android.gms.findmydevice.util;

import com.google.android.gms.findmydevice.util.SafeGmsTaskBoundService;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.asej;
import defpackage.asot;
import defpackage.byln;
import defpackage.egnc;
import defpackage.eiho;
import defpackage.enre;
import defpackage.enss;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public abstract class SafeGmsTaskBoundService extends GmsTaskBoundService {
    public static final asot h = asot.b("DeviceSyncService", asej.FIND_MY_DEVICE_SPOT);

    protected abstract enss d(byln bylnVar);

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        return egnc.e(d(bylnVar), Throwable.class, new eiho() { // from class: bfjb
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                ((ejhf) ((ejhf) ((ejhf) SafeGmsTaskBoundService.h.i()).s((Throwable) obj)).ah((char) 4582)).x("Failed to run task");
                return 2;
            }
        }, enre.a);
    }
}
