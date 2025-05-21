package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class s {
    public final f a;
    public final d b;
    public com.google.android.gms.ads.internal.report.f c;

    public s(f fVar, d dVar) {
        this.a = fVar;
        this.b = dVar;
    }

    public static void a(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        u.b();
        com.google.android.gms.ads.internal.util.client.f.o(context, u.c().a, bundle);
    }
}
