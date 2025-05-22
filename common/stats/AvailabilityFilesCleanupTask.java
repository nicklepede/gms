package com.google.android.gms.common.stats;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.aurp;
import defpackage.aurt;
import defpackage.bjkp;
import defpackage.btco;
import defpackage.cauf;
import defpackage.fpmr;
import defpackage.fpvj;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class AvailabilityFilesCleanupTask extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;
    private final aurp b;

    public AvailabilityFilesCleanupTask() {
        this.b = aurt.a;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        long a2 = this.b.a() - TimeUnit.HOURS.toMillis(fpvj.a.lK().d());
        File b = bjkp.b();
        String[] list = b.list();
        if (list != null) {
            for (String str : list) {
                File file = fpmr.i() ? new File(btco.a.b(b, str)) : new File(b, str);
                long a3 = bjkp.a(file);
                if (a3 < 0 || a3 < a2) {
                    file.delete();
                }
            }
        }
        return 0;
    }

    AvailabilityFilesCleanupTask(aurp aurpVar) {
        this.b = aurpVar;
    }
}
