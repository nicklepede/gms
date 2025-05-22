package com.google.android.gms.octarine.operations;

import android.content.Context;
import android.content.Intent;
import defpackage.apzs;
import defpackage.aura;
import defpackage.auvc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class ModuleInitializer extends apzs {
    private static final String[] a = {"com.google.android.gms.octarine.ui.OctarineWebviewActivity"};

    public ModuleInitializer() {
    }

    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
        if (auvc.a() != 13) {
            aura.K(a[0], true);
        }
    }

    ModuleInitializer(Context context) {
        attachBaseContext(context);
    }
}
