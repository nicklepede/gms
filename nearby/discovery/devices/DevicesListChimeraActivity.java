package com.google.android.gms.nearby.discovery.devices;

import android.os.Bundle;
import defpackage.cirb;
import defpackage.citi;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class DevicesListChimeraActivity extends rxx {
    private cirb j;

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        cirb cirbVar = new cirb(this, "com.google.android.gms.fastpair.devices.DevicesListActivity", new citi(this));
        this.j = cirbVar;
        cirbVar.b(getIntent());
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        super.onDestroy();
        this.j.a(this);
    }
}
