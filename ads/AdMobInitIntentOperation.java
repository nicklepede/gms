package com.google.android.gms.ads;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.config.d;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.ads.play.GmsCachingPlayStoreParentalControlProvider;
import com.google.android.gms.ads.social.e;
import defpackage.anya;
import defpackage.asri;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AdMobInitIntentOperation extends anya {
    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        d.a(this);
        Context applicationContext = getApplicationContext();
        e a = e.a(applicationContext);
        a.d();
        a.e();
        GmsCachingPlayStoreParentalControlProvider.b().c(applicationContext);
        String valueOf = String.valueOf(asri.o());
        int i2 = c.a;
        h.i("Initialized AdMob in container ".concat(valueOf));
    }
}
