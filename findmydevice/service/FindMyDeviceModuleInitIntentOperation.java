package com.google.android.gms.findmydevice.service;

import android.content.Intent;
import defpackage.anya;
import defpackage.asej;
import defpackage.asng;
import defpackage.asot;
import defpackage.beym;
import defpackage.beyn;
import defpackage.bfdr;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class FindMyDeviceModuleInitIntentOperation extends anya {
    private final beym a;

    static {
        asot.b("FindMyDeviceModuleInit", asej.FIND_MY_DEVICE_SPOT);
    }

    public FindMyDeviceModuleInitIntentOperation() {
        this(new beyn());
    }

    @Override // defpackage.anya
    protected final void a(Intent intent, boolean z) {
        asng.K("com.google.android.gms.findmydevice.spot.suw.SetupWizardActivity", true);
        asng.K("com.google.android.gms.findmydevice.spot.locationreporting.taptoid.TapToIdHalfSheetActivity", true);
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        if (bfdr.c()) {
            asng.K("com.google.android.gms.findmydevice.spot.wearables.WearableCompanionListenerService", true);
        }
        this.a.a(getBaseContext());
    }

    public FindMyDeviceModuleInitIntentOperation(beym beymVar) {
        this.a = beymVar;
    }

    @Override // defpackage.anya
    protected final void c(Intent intent, boolean z) {
    }
}
