package com.google.android.gms.ads.config;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.client.w;
import com.google.android.gms.ads.internal.config.i;
import com.google.android.gms.ads.internal.config.p;
import defpackage.fphn;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class d {
    public static final Set a;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("gads:content_age_weight");
        hashSet.add("gads:content_length_weight");
        hashSet.add("gads:dynamite_load:fail:sample_rate");
        hashSet.add("gads:fingerprint_number");
        hashSet.add("gads:min_content_len");
        hashSet.add("gads:sleep_sec");
        a = hashSet;
    }

    public static void a(Context context) {
        p.c(context);
        w.c();
        SharedPreferences b = i.b(context);
        if (b == null) {
            return;
        }
        SharedPreferences.Editor edit = b.edit();
        com.google.android.gms.ads.internal.flag.b.a(new c(edit));
        edit.putString("gad:dynamite_module:experiment_id", fphn.a.lK().a());
        if (((Boolean) p.af.g()).booleanValue()) {
            return;
        }
        w.c();
        i.a(context, edit);
    }
}
