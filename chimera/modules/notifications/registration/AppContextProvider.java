package com.google.android.gms.chimera.modules.notifications.registration;

import android.app.Application;
import android.content.Context;
import defpackage.apzw;
import defpackage.ekxj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class AppContextProvider extends apzw {
    public static AppContextProvider c;

    private AppContextProvider(Context context, String str) {
        super(context, str);
    }

    public static Application a() {
        AppContextProvider appContextProvider = c;
        if (appContextProvider != null) {
            return appContextProvider.b;
        }
        return null;
    }

    private static void setApplicationContextV0(Context context) {
        ekxj.a(c == null);
        c = new AppContextProvider(context, "com.google.android.gms.chimera.modules.notifications.registration.ModuleApplication");
    }
}
