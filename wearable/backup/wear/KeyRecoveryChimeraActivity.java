package com.google.android.gms.wearable.backup.wear;

import android.os.Bundle;
import defpackage.arxo;
import defpackage.djlj;
import defpackage.eits;
import defpackage.ftjy;
import defpackage.qfp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class KeyRecoveryChimeraActivity extends qfp {
    public static final arxo j = new djlj("KeyRecoveryActivity");

    static {
        eits.t(7, '0', 8, '1', 9, '2', 10, '3', 11, '4', 12, '5', 13, '6', 14, '7', 15, '8', 16, '9');
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j.m("Finishing as restore is unsupported.", new Object[0]);
        setResult(1);
        if (ftjy.c()) {
            throw null;
        }
        finish();
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        throw null;
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onStop() {
        super.onStop();
        if (ftjy.c()) {
            return;
        }
        finish();
    }
}
