package com.google.android.gms.vision.service;

import android.content.Intent;
import defpackage.apzs;
import defpackage.aura;
import defpackage.dkmo;
import defpackage.dknn;
import defpackage.dknx;
import defpackage.ektg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class VisionIntentHandlers$OnInitOperation extends apzs {
    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
        aura.H(this, "com.google.android.gms.vision.DependencyBroadcastReceiverProxy", true);
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        dknx.d(this, dknx.b(getBaseContext()), true, ektg.a);
    }

    @Override // defpackage.apzs
    protected final void d(Intent intent) {
        dkmo.a(dknn.a(this));
    }
}
