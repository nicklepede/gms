package com.google.android.gms.nearby.discovery;

import android.content.ComponentName;
import android.content.Intent;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import defpackage.anya;
import defpackage.asqh;
import defpackage.cexc;
import defpackage.cexd;
import defpackage.cgiv;
import defpackage.chru;
import defpackage.ejhf;
import defpackage.excq;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class ModuleInitializer extends anya {
    private static final String[] a = {"com.google.android.gms.nearby.discovery.devices.DevicesListActivity", "com.google.android.gms.nearby.discovery.service.DiscoveryService", "com.google.android.gms.nearby.discovery.fastpair.CompanionAppInstallActivity", "com.google.android.gms.nearby.discovery.fastpair.HalfSheetActivity", "com.google.android.gms.nearby.discovery.fastpair.AtvConnectActivity", "com.google.android.gms.nearby.discovery.fastpair.GcmBroadcastReceiver", "com.google.android.gms.nearby.discovery.devices.FindDeviceActivity", "com.google.android.gms.nearby.discovery.fastpair.slice.FastPairSliceProvider", "com.google.android.gms.nearby.discovery.offline.OfflineCachingService"};

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        boolean d = excq.d(this, cexc.e(this));
        String[] strArr = a;
        for (int i2 = 0; i2 < 9; i2++) {
            cexd.a(this, strArr[i2], d);
        }
        try {
            cexd.a(this, "com.google.android.gms.nearby.discovery.fastpair.slice.FastPairContextualCardProvider", asqh.f());
            if (asqh.f()) {
                Intent intent2 = new Intent("com.google.android.setupwizard.SETUP_WIZARD_FINISHED");
                intent2.setComponent(new ComponentName("com.google.android.settings.intelligence", "com.google.android.settings.intelligence.modules.contextualcards.impl.JobBootBroadcastReceiver"));
                sendBroadcast(intent2);
                cgiv.a.d().x("Trigger rescan contextual cards");
            }
        } catch (IllegalArgumentException e) {
            ((ejhf) cgiv.a.e().s(e)).v();
        }
        startService(DiscoveryChimeraService.a(getBaseContext()).setAction("com.google.android.gms.nearby.discovery:ACTION_INIT_RUNTIME_STATE"));
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            chru.d(getBaseContext());
        }
    }
}
