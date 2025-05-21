package com.google.android.gms.common.stats;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.byjl;
import defpackage.byln;
import defpackage.dupj;
import defpackage.fnaw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class DiskStatsCollectionTaskService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;
    private final dupj b;

    public DiskStatsCollectionTaskService() {
        this.b = dupj.a();
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        if (fnaw.f()) {
            this.b.e();
            return 0;
        }
        byjl.a(this).d("diskstats", DiskStatsCollectionTaskService.class.getName());
        return 0;
    }

    DiskStatsCollectionTaskService(dupj dupjVar) {
        this.b = dupjVar;
    }
}
