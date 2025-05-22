package com.google.android.gms.findmydevice.service;

import android.content.Intent;
import defpackage.apzs;
import defpackage.auid;
import defpackage.aura;
import defpackage.ausn;
import defpackage.bgzz;
import defpackage.bhaa;
import defpackage.bhfh;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class FindMyDeviceModuleInitIntentOperation extends apzs {
    private final bgzz a;

    static {
        ausn.b("FindMyDeviceModuleInit", auid.FIND_MY_DEVICE_SPOT);
    }

    public FindMyDeviceModuleInitIntentOperation() {
        this(new bhaa());
    }

    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
        aura.K("com.google.android.gms.findmydevice.spot.suw.SetupWizardActivity", true);
        aura.K("com.google.android.gms.findmydevice.spot.locationreporting.taptoid.TapToIdHalfSheetActivity", true);
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        if (bhfh.c()) {
            aura.K("com.google.android.gms.findmydevice.spot.wearables.WearableCompanionListenerService", true);
        }
        this.a.a(getBaseContext());
    }

    public FindMyDeviceModuleInitIntentOperation(bgzz bgzzVar) {
        this.a = bgzzVar;
    }

    @Override // defpackage.apzs
    protected final void c(Intent intent, boolean z) {
    }
}
