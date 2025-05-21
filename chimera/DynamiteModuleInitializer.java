package com.google.android.gms.chimera;

import android.content.Context;
import defpackage.anxp;
import defpackage.azix;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class DynamiteModuleInitializer {
    public static void initializeModuleV1(Context context) {
        initializeModuleV2(context, "com.google.android.gms".equals(context.getPackageName()));
    }

    public static void initializeModuleV2(Context context, boolean z) {
        anxp.a(context);
        azix.g(z);
    }
}
