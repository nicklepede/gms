package com.google.android.gms.common.stats;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.asnv;
import defpackage.asnz;
import defpackage.bhfz;
import defpackage.bqux;
import defpackage.byln;
import defpackage.fmut;
import defpackage.fndk;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class AvailabilityFilesCleanupTask extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;
    private final asnv b;

    public AvailabilityFilesCleanupTask() {
        this.b = asnz.a;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        long a2 = this.b.a() - TimeUnit.HOURS.toMillis(fndk.a.a().d());
        File b = bhfz.b();
        String[] list = b.list();
        if (list != null) {
            for (String str : list) {
                File file = fmut.i() ? new File(bqux.a.b(b, str)) : new File(b, str);
                long a3 = bhfz.a(file);
                if (a3 < 0 || a3 < a2) {
                    file.delete();
                }
            }
        }
        return 0;
    }

    AvailabilityFilesCleanupTask(asnv asnvVar) {
        this.b = asnvVar;
    }
}
