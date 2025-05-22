package com.google.android.gms.nearby.fastpair;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.nearby.fastpair.service.TaskSchedulerChimeraService;
import defpackage.apzs;
import defpackage.atzb;
import defpackage.bzlt;
import defpackage.bzlv;
import defpackage.cata;
import defpackage.catn;
import defpackage.chen;
import defpackage.cheo;
import defpackage.chkb;
import defpackage.ckmd;
import defpackage.ckpb;
import defpackage.ckyl;
import defpackage.clbo;
import defpackage.ekvk;
import defpackage.eluo;
import defpackage.fpuj;
import defpackage.ftey;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class FastPairInitIntentOperation extends apzs {
    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        cheo.a(this, "com.google.android.gms.nearby.fastpair.sass.device.connection.ui.SassProcessActivity", false);
        if (chen.k(this)) {
            cheo.a(this, "com.google.android.gms.nearby.fastpair.service.WearableDataListenerService", false);
            return;
        }
        boolean as = ftey.as();
        chkb chkbVar = ckpb.a;
        chkbVar.d().B("onInitRuntimeState isEnableWearableListener: %s", Boolean.valueOf(as));
        cheo.a(this, "com.google.android.gms.nearby.fastpair.service.WearableDataListenerService", as);
        bzlv bzlvVar = new clbo(this).a;
        boolean ar = ftey.ar();
        bzlt c = bzlvVar.c();
        c.e("IS_PERIPHERAL_API_ENABLED", ar);
        ckmd.b(c);
        Intent startIntent = IntentOperation.getStartIntent(this, PersistentFastPairInitIntentOperation.class, "com.google.android.gms.nearby.fastpair.PersistentFastPairInitIntentOperation.INIT_RUNTIME_STATE");
        atzb.s(startIntent);
        startService(startIntent);
        String action = intent.getAction();
        if (ekvk.c(action)) {
            return;
        }
        if ("android.intent.action.BOOT_COMPLETED".equals(action) || IntentOperation.ACTION_NEW_MODULE.equals(action) || "com.google.android.gms.chimera.container.CONTAINER_UPDATED".equals(action)) {
            chkbVar.d().x("FastPairInitIntentOperation: check the Footprints sync tasks.");
            if (ftey.M()) {
                chkbVar.d().x("FastPairInitIntentOperation: re-schedules the Footprints sync task.");
                int i2 = TaskSchedulerChimeraService.a;
                if (ftey.M()) {
                    ckyl.d(this, fpuj.e() ? TaskSchedulerChimeraService.e("TAG_FOOTPRINTS_PERIODIC_SCHEDULE", catn.j) : TaskSchedulerChimeraService.d("TAG_FOOTPRINTS_PERIODIC_SCHEDULE", cata.EVERY_DAY));
                } else {
                    ((eluo) chkbVar.d().ai(7363)).x("TSS scheduleFootprintsPeriodicSync: not enable");
                }
            } else {
                chkbVar.f().x("FastPairInitIntentOperation: cancels the Footprints sync task.");
                TaskSchedulerChimeraService.f(this);
            }
            if ("android.intent.action.BOOT_COMPLETED".equals(action)) {
                TaskSchedulerChimeraService.g(this, false);
            }
        }
    }
}
