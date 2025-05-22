package com.google.android.gms.nearby.discovery;

import android.content.ComponentName;
import android.content.Intent;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import defpackage.apzs;
import defpackage.auub;
import defpackage.chen;
import defpackage.cheo;
import defpackage.ciqy;
import defpackage.cjzv;
import defpackage.eluo;
import defpackage.ezqz;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class ModuleInitializer extends apzs {
    private static final String[] a = {"com.google.android.gms.nearby.discovery.devices.DevicesListActivity", "com.google.android.gms.nearby.discovery.service.DiscoveryService", "com.google.android.gms.nearby.discovery.fastpair.CompanionAppInstallActivity", "com.google.android.gms.nearby.discovery.fastpair.HalfSheetActivity", "com.google.android.gms.nearby.discovery.fastpair.AtvConnectActivity", "com.google.android.gms.nearby.discovery.fastpair.GcmBroadcastReceiver", "com.google.android.gms.nearby.discovery.devices.FindDeviceActivity", "com.google.android.gms.nearby.discovery.fastpair.slice.FastPairSliceProvider", "com.google.android.gms.nearby.discovery.offline.OfflineCachingService"};

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        boolean d = ezqz.d(this, chen.f(this));
        String[] strArr = a;
        for (int i2 = 0; i2 < 9; i2++) {
            cheo.a(this, strArr[i2], d);
        }
        try {
            cheo.a(this, "com.google.android.gms.nearby.discovery.fastpair.slice.FastPairContextualCardProvider", auub.f());
            if (auub.f()) {
                Intent intent2 = new Intent("com.google.android.setupwizard.SETUP_WIZARD_FINISHED");
                intent2.setComponent(new ComponentName("com.google.android.settings.intelligence", "com.google.android.settings.intelligence.modules.contextualcards.impl.JobBootBroadcastReceiver"));
                sendBroadcast(intent2);
                ciqy.a.d().x("Trigger rescan contextual cards");
            }
        } catch (IllegalArgumentException e) {
            ((eluo) ciqy.a.e().s(e)).v();
        }
        startService(DiscoveryChimeraService.a(getBaseContext()).setAction("com.google.android.gms.nearby.discovery:ACTION_INIT_RUNTIME_STATE"));
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            cjzv.d(getBaseContext());
        }
    }
}
