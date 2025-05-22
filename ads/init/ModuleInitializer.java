package com.google.android.gms.ads.init;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.identifier.settings.q;
import com.google.android.gms.ads.internal.config.p;
import com.google.android.gms.ads.settings.internal.a;
import defpackage.apzs;
import defpackage.auvc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ModuleInitializer extends apzs {
    @Override // defpackage.apzs
    protected final void c(Intent intent, boolean z) {
        auvc.b();
        Context applicationContext = getApplicationContext();
        int i = a.a;
        p.c(applicationContext);
        q.a(applicationContext).c();
    }
}
