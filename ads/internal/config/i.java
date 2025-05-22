package com.google.android.gms.ads.internal.config;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.auup;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class i {
    public static final void a(Context context, SharedPreferences.Editor editor) {
        auup.a(context, editor, "google_ads_flags");
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
