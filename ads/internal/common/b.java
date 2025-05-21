package com.google.android.gms.ads.internal.common;

import android.content.Context;
import android.content.Intent;
import defpackage.arwm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class b {
    public final Context a;

    public b(Context context) {
        arwm.t(context, "Context can not be null");
        this.a = context;
    }

    public final boolean a(Intent intent) {
        arwm.t(intent, "Intent can not be null");
        return !this.a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }
}
