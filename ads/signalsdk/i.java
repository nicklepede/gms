package com.google.android.gms.ads.signalsdk;

import android.content.Context;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class i implements g {
    private final String a;
    private final Context b;

    public i(Context context, String str) {
        this.b = context;
        this.a = str;
    }

    @Override // com.google.android.gms.ads.signalsdk.g
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.ads.signalsdk.g
    public final boolean b() {
        return "com.android.vending".equals(this.b.getPackageManager().getInstallerPackageName(this.a));
    }
}
