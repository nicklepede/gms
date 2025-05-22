package com.google.android.gms.wearable.backup.wear;

import android.os.Bundle;
import defpackage.auad;
import defpackage.dlxc;
import defpackage.elgx;
import defpackage.fwfq;
import defpackage.ryt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class KeyRecoveryChimeraActivity extends ryt {
    public static final auad j = new dlxc("KeyRecoveryActivity");

    static {
        elgx.t(7, '0', 8, '1', 9, '2', 10, '3', 11, '4', 12, '5', 13, '6', 14, '7', 15, '8', 16, '9');
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j.m("Finishing as restore is unsupported.", new Object[0]);
        setResult(1);
        if (fwfq.c()) {
            throw null;
        }
        finish();
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        throw null;
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onStop() {
        super.onStop();
        if (fwfq.c()) {
            return;
        }
        finish();
    }
}
