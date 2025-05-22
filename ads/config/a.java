package com.google.android.gms.ads.config;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.flag.z;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class a implements z {
    public String a;
    public String b;
    public SharedPreferences.Editor c;
    public int d;

    @Override // com.google.android.gms.ads.internal.flag.z
    public final void a(String str, double d) {
        if (this.a.equals(str)) {
            this.d++;
            this.c.putFloat(str, Float.parseFloat(this.b));
        }
    }

    @Override // com.google.android.gms.ads.internal.flag.z
    public final void b(String str, long j) {
        if (this.a.equals(str)) {
            this.d++;
            this.c.putLong(str, Long.parseLong(this.b));
        }
    }

    @Override // com.google.android.gms.ads.internal.flag.z
    public final void c(String str, String str2) {
        if (this.a.equals(str)) {
            this.d++;
            this.c.putString(str, this.b);
        }
    }

    @Override // com.google.android.gms.ads.internal.flag.z
    public final void d(String str, boolean z) {
        if (this.a.equals(str)) {
            this.d++;
            this.c.putBoolean(str, Boolean.parseBoolean(this.b));
        }
    }
}
