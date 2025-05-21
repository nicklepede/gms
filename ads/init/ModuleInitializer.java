package com.google.android.gms.ads.init;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.identifier.settings.q;
import com.google.android.gms.ads.internal.config.p;
import com.google.android.gms.ads.settings.internal.a;
import defpackage.anya;
import defpackage.asri;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ModuleInitializer extends anya {
    @Override // defpackage.anya
    protected final void c(Intent intent, boolean z) {
        asri.b();
        Context applicationContext = getApplicationContext();
        int i = a.a;
        p.c(applicationContext);
        q.a(applicationContext).c();
    }
}
