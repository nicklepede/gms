package com.google.android.gms.ads.signalsdk;

import android.content.Context;
import android.content.pm.PackageManager;
import defpackage.asxh;
import defpackage.asxj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class h implements g {
    private boolean a;
    private boolean b;

    public h(Context context, String str) {
        try {
            asxj a = new asxh(context, str, 0L).a();
            this.a = a.b();
            this.b = a.c();
        } catch (PackageManager.NameNotFoundException unused) {
            this.a = false;
            this.b = false;
        }
    }

    @Override // com.google.android.gms.ads.signalsdk.g
    public final boolean a() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.signalsdk.g
    public final boolean b() {
        return this.b;
    }
}
