package com.google.android.gms.nearby.discovery.fastpair;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.gms.nearby.fastpair.service.TaskSchedulerChimeraService;
import defpackage.byki;
import defpackage.bykv;
import defpackage.byll;
import defpackage.cgiv;
import defpackage.cigw;
import defpackage.ciqg;
import defpackage.ejhf;
import defpackage.fnck;
import defpackage.fqkx;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class GcmChimeraBroadcastReceiver extends BroadcastReceiver {
    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        byll d;
        if (intent == null) {
            return;
        }
        cgiv.a.d().B("onReceive Gcm for push notifications action=%s", intent.getAction());
        Intent intent2 = new Intent("com.google.android.gms.nearby.fastpair.service.ACTION_FOOTPRINTS_FORCE_SYNC");
        intent2.setClassName(context, "com.google.android.gms.nearby.discovery.service.DiscoveryService");
        context.startService(intent2);
        int i = TaskSchedulerChimeraService.a;
        ((ejhf) cigw.a.d().ah(7404)).x("TSS schedules the footprints recon sync task.");
        if (fnck.e()) {
            d = TaskSchedulerChimeraService.e("TAG_FOOTPRINTS_RECON_SYNC_SCHEDULE", bykv.e((int) fqkx.a.a().aQ()));
        } else {
            d = TaskSchedulerChimeraService.d("TAG_FOOTPRINTS_RECON_SYNC_SCHEDULE", byki.a(TimeUnit.HOURS.toSeconds(fqkx.a.a().aR())));
        }
        ciqg.d(context, d);
    }
}
