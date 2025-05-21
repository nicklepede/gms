package com.google.android.gms.setupservices;

import android.content.Intent;
import defpackage.anya;
import defpackage.arxo;
import defpackage.asng;
import defpackage.fsae;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SetupServicesInitIntentOperation extends anya {
    private static final arxo a = new arxo("SetupServices", new String[0]);

    @Override // defpackage.anya
    protected final void a(Intent intent, boolean z) {
        if (fsae.a.a().ab()) {
            a.d("Enabling component com.google.android.gms.setupservices.GoogleServicesActivity", new Object[0]);
            asng.H(this, "com.google.android.gms.setupservices.GoogleServicesActivity", true);
        }
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
    }
}
