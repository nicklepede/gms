package com.google.android.gms.ads.jams;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.ejck;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
final class e {
    public final SharedPreferences a;
    public final Context b;

    public e(Context context) {
        this.a = context.getSharedPreferences("jams.prefs.default", 0);
        this.b = context;
    }

    final int a() {
        return e().size();
    }

    final long b() {
        return this.a.getLong("retry_count", 0L);
    }

    public final SharedPreferences c(String str) {
        return this.b.getSharedPreferences("jams.prefs.".concat(String.valueOf(str)), 0);
    }

    final String d() {
        return this.a.getString("default_account_name", "");
    }

    final Set e() {
        return this.a.getStringSet("all_account_names", ejck.a);
    }

    final void f(long j) {
        this.a.edit().putLong("retry_count", j).apply();
    }

    final boolean g() {
        return this.a.getBoolean("negotiation_enabled", false);
    }

    final boolean h() {
        return this.a.getBoolean("non_default_account_enabled", false);
    }
}
