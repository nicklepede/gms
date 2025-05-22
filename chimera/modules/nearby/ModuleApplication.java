package com.google.android.gms.chimera.modules.nearby;

import android.content.Context;
import defpackage.aquw;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class ModuleApplication extends aquw {
    private static volatile ModuleApplication a;

    public static ModuleApplication getInstance(Context context) {
        ModuleApplication moduleApplication;
        ModuleApplication moduleApplication2 = a;
        if (moduleApplication2 != null) {
            return moduleApplication2;
        }
        synchronized (ModuleApplication.class) {
            moduleApplication = a;
            if (moduleApplication == null) {
                moduleApplication = new ModuleApplication();
                moduleApplication.attachBaseContext(context);
                moduleApplication.onCreate();
                a = moduleApplication;
            }
        }
        return moduleApplication;
    }
}
