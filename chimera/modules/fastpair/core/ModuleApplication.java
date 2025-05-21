package com.google.android.gms.chimera.modules.fastpair.core;

import android.content.Context;
import defpackage.aopf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class ModuleApplication extends aopf {
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
