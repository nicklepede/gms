package com.google.android.gms.ads.internal.common;

import android.content.Context;
import android.content.Intent;
import defpackage.atzb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class b {
    public final Context a;

    public b(Context context) {
        atzb.t(context, "Context can not be null");
        this.a = context;
    }

    public final boolean a(Intent intent) {
        atzb.t(intent, "Intent can not be null");
        return !this.a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }
}
