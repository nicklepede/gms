package com.google.android.gms.growth.watchdog.chimera;

import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.bklb;
import defpackage.bkyk;
import defpackage.bkyl;
import defpackage.byln;
import defpackage.fixl;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GrowthWatchdogTaskChimeraService extends GmsTaskChimeraService {
    private final bkyk a;

    public GrowthWatchdogTaskChimeraService(bkyk bkykVar) {
        this.a = bkykVar;
    }

    public static GrowthWatchdogTaskChimeraService provideInstance() {
        bkyl bkylVar = new bkyl();
        bkylVar.b(bklb.a());
        bkyk f = bkylVar.a().a.f();
        fixl.d(f);
        return new GrowthWatchdogTaskChimeraService(f);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        return this.a.a(bylnVar);
    }
}
