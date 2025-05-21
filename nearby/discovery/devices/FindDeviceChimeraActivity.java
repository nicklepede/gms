package com.google.android.gms.nearby.discovery.devices;

import android.os.Bundle;
import defpackage.cgiy;
import defpackage.cglf;
import defpackage.qet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class FindDeviceChimeraActivity extends qet {
    private cgiy j;

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        cgiy cgiyVar = new cgiy(this, "com.google.android.gms.fastpair.fmd.FindDeviceActivity", new cglf(this));
        this.j = cgiyVar;
        cgiyVar.b(getIntent());
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        super.onDestroy();
        this.j.a(this);
    }
}
