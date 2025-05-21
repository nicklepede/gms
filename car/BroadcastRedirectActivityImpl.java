package com.google.android.gms.car;

import android.content.Intent;
import android.os.Bundle;
import defpackage.juc;
import defpackage.qfp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class BroadcastRedirectActivityImpl extends qfp {
    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(getIntent());
        intent.setComponent(null);
        juc.a(this).e(intent);
        finish();
    }
}
