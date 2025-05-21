package com.google.android.gms.play.integrity.api.service;

import android.content.Intent;
import defpackage.anya;
import defpackage.asej;
import defpackage.asot;
import defpackage.cwjd;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class IntegrityApiInitIntentOperation extends anya {
    static {
        asot.b("PlayIntegrityApiModuleInit", asej.PLAY_INTEGRITY_API);
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        cwjd.a(getApplicationContext());
    }

    @Override // defpackage.anya
    protected final void a(Intent intent, boolean z) {
    }
}
