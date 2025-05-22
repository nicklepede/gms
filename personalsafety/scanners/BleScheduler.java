package com.google.android.gms.personalsafety.scanners;

import com.google.android.gms.chimera.modules.personalsafety.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.cauf;
import defpackage.cycr;
import defpackage.eyfe;
import defpackage.fpro;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class BleScheduler extends GmsTaskBoundService {
    public static final String a = "com.google.android.gms.personalsafety.scanners.BleScheduler";

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        if (!fpro.Q()) {
            return 2;
        }
        cycr.b(AppContextProvider.a()).e(eyfe.AUTO, fpro.f());
        return 0;
    }
}
