package com.google.android.gms.analytics;

import android.content.Intent;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.byln;
import defpackage.tlb;
import defpackage.tlw;
import defpackage.tny;
import defpackage.toh;
import defpackage.toi;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ChimeraAnalyticsTaskService extends GmsTaskChimeraService implements toh {
    private toi a;

    private final toi d() {
        if (this.a == null) {
            this.a = new toi(this);
        }
        return this.a;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        String str = bylnVar.a;
        if (str.hashCode() != 563533826 || !str.equals("Analytics.AnalyticsTaskService.UPLOAD_TASK_TAG")) {
            return 2;
        }
        tlb e = tlb.e(this);
        final tny h = e.h();
        tlw tlwVar = e.d;
        h.y("Device ChimeraAnalyticsTaskService called.");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        synchronized (atomicBoolean) {
            d().c(new Runnable() { // from class: tjg
                @Override // java.lang.Runnable
                public final void run() {
                    tny.this.y("ChimeraAnalyticsTaskService processed last upload request.");
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    synchronized (atomicBoolean2) {
                        atomicBoolean2.set(true);
                        atomicBoolean2.notify();
                    }
                }
            });
            try {
                long currentTimeMillis = System.currentTimeMillis();
                long j = 30000 + currentTimeMillis;
                while (!atomicBoolean.get() && currentTimeMillis < j) {
                    atomicBoolean.wait(j - currentTimeMillis);
                    currentTimeMillis = System.currentTimeMillis();
                }
            } catch (InterruptedException e2) {
                h.C("Interrupted while uploading from task", e2);
                return 0;
            }
        }
        return 0;
    }

    @Override // defpackage.toh
    public final boolean fY(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        d().a();
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final void onDestroy() {
        d().b();
        super.onDestroy();
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent) {
        return true;
    }
}
