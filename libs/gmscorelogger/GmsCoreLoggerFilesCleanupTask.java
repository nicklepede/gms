package com.google.android.gms.libs.gmscorelogger;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.aurp;
import defpackage.aurt;
import defpackage.btoi;
import defpackage.btok;
import defpackage.btui;
import defpackage.bywm;
import defpackage.bywn;
import defpackage.cauf;
import defpackage.fpnq;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class GmsCoreLoggerFilesCleanupTask extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;
    private final aurp b;

    public GmsCoreLoggerFilesCleanupTask() {
        this.b = aurt.a;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        long millis = TimeUnit.HOURS.toMillis(fpnq.a.lK().m());
        long a2 = this.b.a();
        for (bywm bywmVar : bywn.e(bywn.b(), true)) {
            btok btokVar = bywmVar.b;
            if (btokVar == btok.UNKNOWN) {
                bywmVar.a.delete();
            } else if (Math.abs(a2 - bywmVar.d) > millis) {
                btui c = btoi.b().c(btokVar);
                if (c != null) {
                    c.e(bywmVar.a);
                } else {
                    bywmVar.a.delete();
                }
            }
        }
        return 0;
    }

    GmsCoreLoggerFilesCleanupTask(aurp aurpVar) {
        this.b = aurpVar;
    }
}
