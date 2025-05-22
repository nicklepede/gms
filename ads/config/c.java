package com.google.android.gms.ads.config;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.flag.z;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class c implements z {
    final /* synthetic */ SharedPreferences.Editor a;

    public c(SharedPreferences.Editor editor) {
        this.a = editor;
    }

    @Override // com.google.android.gms.ads.internal.flag.z
    public final void a(String str, double d) {
        this.a.putFloat(str, (float) d);
    }

    @Override // com.google.android.gms.ads.internal.flag.z
    public final void b(String str, long j) {
        if (d.a.contains(str)) {
            this.a.putInt(str, (int) j);
        } else {
            this.a.putLong(str, j);
        }
    }

    @Override // com.google.android.gms.ads.internal.flag.z
    public final void c(String str, String str2) {
        this.a.putString(str, str2);
    }

    @Override // com.google.android.gms.ads.internal.flag.z
    public final void d(String str, boolean z) {
        this.a.putBoolean(str, z);
    }
}
