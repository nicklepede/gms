package com.google.android.gms.vision.service;

import android.content.Intent;
import defpackage.anya;
import defpackage.asng;
import defpackage.dibd;
import defpackage.dicc;
import defpackage.dicm;
import defpackage.eigb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class VisionIntentHandlers$OnInitOperation extends anya {
    @Override // defpackage.anya
    protected final void a(Intent intent, boolean z) {
        asng.H(this, "com.google.android.gms.vision.DependencyBroadcastReceiverProxy", true);
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        dicm.d(this, dicm.b(getBaseContext()), true, eigb.a);
    }

    @Override // defpackage.anya
    protected final void d(Intent intent) {
        dibd.a(dicc.a(this));
    }
}
