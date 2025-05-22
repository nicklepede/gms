package com.google.android.gms.time.trustedtime.singleuserapi.service;

import android.os.SystemClock;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.a;
import defpackage.ausn;
import defpackage.cauf;
import defpackage.ditn;
import defpackage.ditq;
import defpackage.ditr;
import defpackage.ditz;
import defpackage.diud;
import defpackage.diuf;
import defpackage.diug;
import defpackage.dwzt;
import defpackage.eluo;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class TrustedTimeMaintenanceTaskService extends GmsTaskBoundService {
    public static final String a = "com.google.android.gms.time.trustedtime.singleuserapi.service.TrustedTimeMaintenanceTaskService";
    private final diuf b;

    public TrustedTimeMaintenanceTaskService() {
        this(ditn.b);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        ausn ausnVar = diud.a;
        ((eluo) ((eluo) ausnVar.h()).ai((char) 11420)).x("Trusted time maintenance task executing");
        if (!diug.b()) {
            ((eluo) ((eluo) ausnVar.h()).ai((char) 11422)).x("Trusted time is disabled: Skipping tasks");
            return 0;
        }
        ditn ditnVar = (ditn) this.b.b();
        if (!"PeriodicTrustedTimeMaintenanceTask".equals(caufVar.a)) {
            String str = caufVar.a;
            if ("OneOffTrustedTimeMaintenanceTask".equals(str)) {
                ditnVar.d();
                return 0;
            }
            ((eluo) ((eluo) diud.a.j()).ai((char) 11421)).B("Unknown task '%s'", str);
            return 2;
        }
        synchronized (ditnVar.c) {
            if (ditnVar.d) {
                ditr ditrVar = ditnVar.e;
                dwzt dwztVar = new dwzt("onRunWatchDogTask(): ");
                synchronized (ditrVar.a) {
                    int i = ditrVar.f().a;
                    if (i != 0) {
                        if (i == 1) {
                            ditrVar.e.a(dwzt.a(dwztVar, new dwzt("State machine expected to be initialized but was in STATE_UNINITIALIZED")));
                        } else if (i == 2 || i == 3) {
                            Long l = ditrVar.f().c;
                            if (SystemClock.elapsedRealtime() - ditz.a(ditrVar.b.f) > (l != null ? l.longValue() : 0L)) {
                                ditrVar.g();
                            }
                        } else if (i != 4) {
                            if (i != 5) {
                                throw new IllegalStateException(a.x(ditq.b(i).a, "Unexpected state enum "));
                            }
                        }
                    }
                    diud diudVar = ditrVar.e;
                    dwzt[] dwztVarArr = {new dwzt("Expected to be in INITIALIZED or IDLE state but was in an inactive/unexpected state: "), ditq.b(i)};
                    StringBuilder sb = new StringBuilder(dwztVar.a);
                    for (int i2 = 0; i2 < 2; i2++) {
                        sb.append(dwztVarArr[i2].a);
                    }
                    diudVar.a(new dwzt(sb.toString()));
                }
            } else {
                ditnVar.a(new dwzt("onRunWatchDogTask"));
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onDestroy() {
        super.onDestroy();
        ((eluo) ((eluo) diud.a.h()).ai((char) 11419)).x("TrustedTimeMaintenanceTaskService destroyed");
    }

    public TrustedTimeMaintenanceTaskService(diuf diufVar) {
        this.b = (diuf) Objects.requireNonNull(diufVar);
    }
}
