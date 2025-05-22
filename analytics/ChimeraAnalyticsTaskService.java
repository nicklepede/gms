package com.google.android.gms.analytics;

import android.content.Intent;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.cauf;
import defpackage.vhb;
import defpackage.vhw;
import defpackage.vjy;
import defpackage.vkh;
import defpackage.vki;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ChimeraAnalyticsTaskService extends GmsTaskChimeraService implements vkh {
    private vki a;

    private final vki d() {
        if (this.a == null) {
            this.a = new vki(this);
        }
        return this.a;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        String str = caufVar.a;
        if (str.hashCode() != 563533826 || !str.equals("Analytics.AnalyticsTaskService.UPLOAD_TASK_TAG")) {
            return 2;
        }
        vhb e = vhb.e(this);
        final vjy h = e.h();
        vhw vhwVar = e.d;
        h.y("Device ChimeraAnalyticsTaskService called.");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        synchronized (atomicBoolean) {
            d().c(new Runnable() { // from class: vfg
                @Override // java.lang.Runnable
                public final void run() {
                    vjy.this.y("ChimeraAnalyticsTaskService processed last upload request.");
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

    @Override // defpackage.vkh
    public final boolean gn(int i) {
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
