package com.google.android.gms.mlbenchmark.installer.service;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.asej;
import defpackage.asot;
import defpackage.byln;
import defpackage.ejhf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MlBenchmarkInstallerSchedulerChimeraService extends GmsTaskBoundService {
    public static final asot a = asot.b("MlBenchmarkInstallerSch", asej.MLBENCHMARK_INSTALLER);

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        ((ejhf) ((ejhf) a.h()).ah((char) 6426)).x("ML Benchmark Installer Scheduler onRunTask() called.");
        MlBenchmarkInstallerModuleInitIntentOperation.f(getApplicationContext());
        return 0;
    }
}
