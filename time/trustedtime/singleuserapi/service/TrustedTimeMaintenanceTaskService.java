package com.google.android.gms.time.trustedtime.singleuserapi.service;

import android.os.SystemClock;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.a;
import defpackage.byln;
import defpackage.dgii;
import defpackage.dgil;
import defpackage.dgim;
import defpackage.dgiu;
import defpackage.dgiy;
import defpackage.dgja;
import defpackage.dgjb;
import defpackage.dupg;
import defpackage.ejhf;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class TrustedTimeMaintenanceTaskService extends GmsTaskBoundService {
    public static final String a = "com.google.android.gms.time.trustedtime.singleuserapi.service.TrustedTimeMaintenanceTaskService";
    private final dgja b;

    public TrustedTimeMaintenanceTaskService() {
        this(dgii.b);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        ((ejhf) ((ejhf) dgiy.a.h()).ah((char) 11417)).x("Trusted time maintenance task executing");
        if (!dgjb.b()) {
            ((ejhf) ((ejhf) dgiy.a.h()).ah((char) 11419)).x("Trusted time is disabled: Skipping tasks");
            return 0;
        }
        dgii dgiiVar = (dgii) this.b.b();
        if (!"PeriodicTrustedTimeMaintenanceTask".equals(bylnVar.a)) {
            String str = bylnVar.a;
            if ("OneOffTrustedTimeMaintenanceTask".equals(str)) {
                dgiiVar.d();
                return 0;
            }
            ((ejhf) ((ejhf) dgiy.a.j()).ah((char) 11418)).B("Unknown task '%s'", str);
            return 2;
        }
        synchronized (dgiiVar.c) {
            if (dgiiVar.d) {
                dgim dgimVar = dgiiVar.e;
                dupg dupgVar = new dupg("onRunWatchDogTask(): ");
                synchronized (dgimVar.a) {
                    int i = dgimVar.f().a;
                    if (i != 0) {
                        if (i == 1) {
                            dgimVar.e.a(dupg.a(dupgVar, new dupg("State machine expected to be initialized but was in STATE_UNINITIALIZED")));
                        } else if (i == 2 || i == 3) {
                            Long l = dgimVar.f().c;
                            if (SystemClock.elapsedRealtime() - dgiu.a(dgimVar.b.f) > (l != null ? l.longValue() : 0L)) {
                                dgimVar.g();
                            }
                        } else if (i != 4) {
                            if (i != 5) {
                                throw new IllegalStateException(a.x(dgil.b(i).a, "Unexpected state enum "));
                            }
                        }
                    }
                    dgiy dgiyVar = dgimVar.e;
                    dupg[] dupgVarArr = {new dupg("Expected to be in INITIALIZED or IDLE state but was in an inactive/unexpected state: "), dgil.b(i)};
                    StringBuilder sb = new StringBuilder(dupgVar.a);
                    for (int i2 = 0; i2 < 2; i2++) {
                        sb.append(dupgVarArr[i2].a);
                    }
                    dgiyVar.a(new dupg(sb.toString()));
                }
            } else {
                dgiiVar.a(new dupg("onRunWatchDogTask"));
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, defpackage.qan
    public final void onDestroy() {
        super.onDestroy();
        ((ejhf) ((ejhf) dgiy.a.h()).ah((char) 11416)).x("TrustedTimeMaintenanceTaskService destroyed");
    }

    public TrustedTimeMaintenanceTaskService(dgja dgjaVar) {
        this.b = (dgja) Objects.requireNonNull(dgjaVar);
    }
}
