package com.google.android.gms.common.stats;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.casd;
import defpackage.cauf;
import defpackage.dwzw;
import defpackage.fpsv;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class DiskStatsCollectionTaskService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;
    private final dwzw b;

    public DiskStatsCollectionTaskService() {
        this.b = dwzw.a();
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        if (fpsv.A()) {
            this.b.g();
            return 0;
        }
        casd.a(this).d("diskstats", DiskStatsCollectionTaskService.class.getName());
        return 0;
    }

    DiskStatsCollectionTaskService(dwzw dwzwVar) {
        this.b = dwzwVar;
    }
}
