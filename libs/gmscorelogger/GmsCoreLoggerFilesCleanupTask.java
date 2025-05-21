package com.google.android.gms.libs.gmscorelogger;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.asnv;
import defpackage.asnz;
import defpackage.brgr;
import defpackage.brgt;
import defpackage.brmq;
import defpackage.bwnz;
import defpackage.bwoa;
import defpackage.byln;
import defpackage.fmvs;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class GmsCoreLoggerFilesCleanupTask extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;
    private final asnv b;

    public GmsCoreLoggerFilesCleanupTask() {
        this.b = asnz.a;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        if (!fmvs.X()) {
            return 2;
        }
        long millis = TimeUnit.HOURS.toMillis(fmvs.a.a().m());
        long a2 = this.b.a();
        for (bwnz bwnzVar : bwoa.e(bwoa.b(), true)) {
            brgt brgtVar = bwnzVar.b;
            if (brgtVar == brgt.UNKNOWN) {
                bwnzVar.a.delete();
            } else if (Math.abs(a2 - bwnzVar.d) > millis) {
                brmq c = brgr.b().c(brgtVar);
                if (c != null) {
                    c.e(bwnzVar.a);
                } else {
                    bwnzVar.a.delete();
                }
            }
        }
        return 0;
    }

    GmsCoreLoggerFilesCleanupTask(asnv asnvVar) {
        this.b = asnvVar;
    }
}
