package com.google.android.gms.nearby.discovery.fastpair;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.gms.nearby.fastpair.service.TaskSchedulerChimeraService;
import defpackage.cata;
import defpackage.catn;
import defpackage.caud;
import defpackage.ciqy;
import defpackage.ckpb;
import defpackage.ckyl;
import defpackage.eluo;
import defpackage.fpuj;
import defpackage.ftes;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class GcmChimeraBroadcastReceiver extends BroadcastReceiver {
    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        caud d;
        if (intent == null) {
            return;
        }
        ciqy.a.d().B("onReceive Gcm for push notifications action=%s", intent.getAction());
        Intent intent2 = new Intent("com.google.android.gms.nearby.fastpair.service.ACTION_FOOTPRINTS_FORCE_SYNC");
        intent2.setClassName(context, "com.google.android.gms.nearby.discovery.service.DiscoveryService");
        context.startService(intent2);
        int i = TaskSchedulerChimeraService.a;
        ((eluo) ckpb.a.d().ai(7353)).x("TSS schedules the footprints recon sync task.");
        if (fpuj.e()) {
            d = TaskSchedulerChimeraService.e("TAG_FOOTPRINTS_RECON_SYNC_SCHEDULE", catn.e((int) ftes.a.lK().aQ()));
        } else {
            d = TaskSchedulerChimeraService.d("TAG_FOOTPRINTS_RECON_SYNC_SCHEDULE", cata.a(TimeUnit.HOURS.toSeconds(ftes.a.lK().aR())));
        }
        ckyl.d(context, d);
    }
}
