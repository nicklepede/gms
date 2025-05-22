package com.google.android.gms.mlbenchmark.installer.service;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cauf;
import defpackage.eluo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class MlBenchmarkInstallerSchedulerChimeraService extends GmsTaskBoundService {
    public static final ausn a = ausn.b("MlBenchmarkInstallerSch", auid.MLBENCHMARK_INSTALLER);

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        ((eluo) ((eluo) a.h()).ai((char) 6445)).x("ML Benchmark Installer Scheduler onRunTask() called.");
        MlBenchmarkInstallerModuleInitIntentOperation.f(getApplicationContext());
        return 0;
    }
}
