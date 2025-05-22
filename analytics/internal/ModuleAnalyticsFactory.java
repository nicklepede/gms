package com.google.android.gms.analytics.internal;

import android.content.Context;
import defpackage.vhb;
import defpackage.vhc;
import defpackage.vib;
import defpackage.vjw;
import defpackage.vjx;
import defpackage.vka;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ModuleAnalyticsFactory extends vhc {
    public ModuleAnalyticsFactory(Context context) {
        super(context);
    }

    @Override // defpackage.vhc
    public final vib a(vhb vhbVar) {
        return new vjw(vhbVar);
    }

    @Override // defpackage.vhc
    public final vka b(vhb vhbVar) {
        return new vjx(vhbVar);
    }
}
