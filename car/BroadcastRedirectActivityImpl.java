package com.google.android.gms.car;

import android.content.Intent;
import android.os.Bundle;
import defpackage.kar;
import defpackage.ryt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class BroadcastRedirectActivityImpl extends ryt {
    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(getIntent());
        intent.setComponent(null);
        kar.a(this).e(intent);
        finish();
    }
}
