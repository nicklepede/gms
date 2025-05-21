package com.google.android.gms.octarine.operations;

import android.content.Context;
import android.content.Intent;
import defpackage.anya;
import defpackage.asng;
import defpackage.asri;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class ModuleInitializer extends anya {
    private static final String[] a = {"com.google.android.gms.octarine.ui.OctarineWebviewActivity"};

    public ModuleInitializer() {
    }

    @Override // defpackage.anya
    protected final void a(Intent intent, boolean z) {
        if (asri.a() != 13) {
            asng.K(a[0], true);
        }
    }

    ModuleInitializer(Context context) {
        attachBaseContext(context);
    }
}
