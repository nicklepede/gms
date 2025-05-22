package com.google.android.gms.common.stats.permissions;

import android.content.Context;
import com.google.android.gms.chimera.modules.core.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.auok;
import defpackage.bsxe;
import defpackage.cauf;
import defpackage.eqgl;
import defpackage.fxuv;
import defpackage.fyeb;
import defpackage.fyqe;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class PermissionStateLoggingTask extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x01d6, code lost:
    
        if (defpackage.fyqe.b(r13, r0) != r1) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(android.content.Context r13, defpackage.fxun r14) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.stats.permissions.PermissionStateLoggingTask.d(android.content.Context, fxun):java.lang.Object");
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        Context a2 = AppContextProvider.a();
        fxuv fxuvVar = bsxe.a;
        return fyqe.d(fyeb.b(bsxe.b), new auok(this, a2, null));
    }
}
