package com.google.android.gms.ads.internal.config;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.asqv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class i {
    public static final void a(Context context, SharedPreferences.Editor editor) {
        asqv.a(context, editor, "google_ads_flags");
    }

    public static final SharedPreferences b(Context context) {
        try {
            return context.getSharedPreferences("google_ads_flags", 0);
        } catch (IllegalStateException e) {
            com.google.android.gms.ads.internal.util.client.h.l(e);
            return null;
        }
    }
}
