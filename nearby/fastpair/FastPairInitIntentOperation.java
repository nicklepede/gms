package com.google.android.gms.nearby.fastpair;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.nearby.fastpair.service.TaskSchedulerChimeraService;
import defpackage.anya;
import defpackage.arwm;
import defpackage.bxdd;
import defpackage.bxdf;
import defpackage.byki;
import defpackage.bykv;
import defpackage.cexc;
import defpackage.cexd;
import defpackage.cfcp;
import defpackage.cidy;
import defpackage.cigw;
import defpackage.ciqg;
import defpackage.citj;
import defpackage.eiif;
import defpackage.ejhf;
import defpackage.fnck;
import defpackage.fqld;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class FastPairInitIntentOperation extends anya {
    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        cexd.a(this, "com.google.android.gms.nearby.fastpair.sass.device.connection.ui.SassProcessActivity", false);
        if (cexc.j(this)) {
            cexd.a(this, "com.google.android.gms.nearby.fastpair.service.WearableDataListenerService", false);
            return;
        }
        boolean ar = fqld.ar();
        cfcp cfcpVar = cigw.a;
        cfcpVar.d().B("onInitRuntimeState isEnableWearableListener: %s", Boolean.valueOf(ar));
        cexd.a(this, "com.google.android.gms.nearby.fastpair.service.WearableDataListenerService", ar);
        bxdf bxdfVar = new citj(this).a;
        boolean aq = fqld.aq();
        bxdd c = bxdfVar.c();
        c.e("IS_PERIPHERAL_API_ENABLED", aq);
        cidy.b(c);
        Intent startIntent = IntentOperation.getStartIntent(this, PersistentFastPairInitIntentOperation.class, "com.google.android.gms.nearby.fastpair.PersistentFastPairInitIntentOperation.INIT_RUNTIME_STATE");
        arwm.s(startIntent);
        startService(startIntent);
        String action = intent.getAction();
        if (eiif.c(action)) {
            return;
        }
        if ("android.intent.action.BOOT_COMPLETED".equals(action) || IntentOperation.ACTION_NEW_MODULE.equals(action) || "com.google.android.gms.chimera.container.CONTAINER_UPDATED".equals(action)) {
            cfcpVar.d().x("FastPairInitIntentOperation: check the Footprints sync tasks.");
            if (fqld.L()) {
                cfcpVar.d().x("FastPairInitIntentOperation: re-schedules the Footprints sync task.");
                int i2 = TaskSchedulerChimeraService.a;
                if (fqld.L()) {
                    ciqg.d(this, fnck.e() ? TaskSchedulerChimeraService.e("TAG_FOOTPRINTS_PERIODIC_SCHEDULE", bykv.j) : TaskSchedulerChimeraService.d("TAG_FOOTPRINTS_PERIODIC_SCHEDULE", byki.EVERY_DAY));
                } else {
                    ((ejhf) cfcpVar.d().ah(7414)).x("TSS scheduleFootprintsPeriodicSync: not enable");
                }
            } else {
                cfcpVar.f().x("FastPairInitIntentOperation: cancels the Footprints sync task.");
                TaskSchedulerChimeraService.f(this);
            }
            if ("android.intent.action.BOOT_COMPLETED".equals(action)) {
                TaskSchedulerChimeraService.g(this, false);
            }
        }
    }
}
