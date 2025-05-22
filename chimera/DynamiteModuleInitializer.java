package com.google.android.gms.chimera;

import android.content.Context;
import defpackage.apzh;
import defpackage.bbmt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class DynamiteModuleInitializer {
    public static void initializeModuleV1(Context context) {
        initializeModuleV2(context, "com.google.android.gms".equals(context.getPackageName()));
    }

    public static void initializeModuleV2(Context context, boolean z) {
        apzh.a(context);
        bbmt.g(z);
    }
}
