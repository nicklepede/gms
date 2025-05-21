package com.google.android.gms.personalsafety.scanners;

import com.google.android.gms.chimera.modules.personalsafety.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.byln;
import defpackage.cvsy;
import defpackage.evpi;
import defpackage.fmzp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class BleScheduler extends GmsTaskBoundService {
    public static final String a = "com.google.android.gms.personalsafety.scanners.BleScheduler";

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        if (!fmzp.O()) {
            return 2;
        }
        cvsy.b(AppContextProvider.a()).f(evpi.AUTO, fmzp.f());
        return 0;
    }
}
