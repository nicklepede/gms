package com.google.android.gms.ads;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.config.d;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.ads.play.GmsCachingPlayStoreParentalControlProvider;
import com.google.android.gms.ads.social.e;
import defpackage.apzs;
import defpackage.auvc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AdMobInitIntentOperation extends apzs {
    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        d.a(this);
        Context applicationContext = getApplicationContext();
        e a = e.a(applicationContext);
        a.d();
        a.e();
        GmsCachingPlayStoreParentalControlProvider.b().c(applicationContext);
        String valueOf = String.valueOf(auvc.o());
        int i2 = c.a;
        h.i("Initialized AdMob in container ".concat(valueOf));
    }
}
