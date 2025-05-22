package com.google.android.gms.auth.aang.impl.deviceaccount;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cauf;
import defpackage.eluo;
import defpackage.wuc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class DeviceAccountTaskService extends GmsTaskBoundService {
    public static final ausn a = ausn.c("Auth", auid.DEVICE_ACCOUNT, "DeviceAccountTaskService");

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        String str = caufVar.a;
        if (str.hashCode() == -1875960784 && str.equals("TASK_DELETE_UNUSED_KEYSTORE_ALIASES")) {
            ((wuc) wuc.a.b()).c();
            return 0;
        }
        ((eluo) a.j()).B("Unknown tag: %s", str);
        return 0;
    }
}
