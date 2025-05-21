package com.google.android.gms.auth.aang.impl.deviceaccount;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.asej;
import defpackage.asot;
import defpackage.byln;
import defpackage.ejhf;
import defpackage.uyc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class DeviceAccountTaskService extends GmsTaskBoundService {
    public static final asot a = asot.c("Auth", asej.DEVICE_ACCOUNT, "DeviceAccountTaskService");

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        String str = bylnVar.a;
        if (str.hashCode() == -1875960784 && str.equals("TASK_DELETE_UNUSED_KEYSTORE_ALIASES")) {
            ((uyc) uyc.a.b()).c();
            return 0;
        }
        ((ejhf) a.j()).B("Unknown tag: %s", str);
        return 0;
    }
}
