package com.google.android.gms.ads.internal.util;

import android.content.Context;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class ad extends b {
    private final com.google.android.gms.ads.internal.util.client.m a;
    private final String c;

    public ad(Context context, String str, String str2) {
        this.a = new com.google.android.gms.ads.internal.util.client.m(com.google.android.gms.ads.internal.c.e().a(context, str));
        this.c = str2;
    }

    @Override // com.google.android.gms.ads.internal.util.b
    public final void a() {
        this.a.a(this.c);
    }
}
