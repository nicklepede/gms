package com.google.android.gms.growth.watchdog.chimera;

import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.bmrr;
import defpackage.bnfb;
import defpackage.bnfc;
import defpackage.cauf;
import defpackage.flni;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class GrowthWatchdogTaskChimeraService extends GmsTaskChimeraService {
    private final bnfb a;

    public GrowthWatchdogTaskChimeraService(bnfb bnfbVar) {
        this.a = bnfbVar;
    }

    public static GrowthWatchdogTaskChimeraService provideInstance() {
        bnfc bnfcVar = new bnfc();
        bnfcVar.b(bmrr.a());
        bnfb f = bnfcVar.a().a.f();
        flni.d(f);
        return new GrowthWatchdogTaskChimeraService(f);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        return this.a.a(caufVar);
    }
}
