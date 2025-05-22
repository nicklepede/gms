package com.google.android.gms.chimera.modules.mdi.download;

import android.content.Context;
import defpackage.apzw;
import defpackage.athr;
import defpackage.ekxj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class AppContextProvider extends apzw {
    private static AppContextProvider c;

    private AppContextProvider(Context context, String str) {
        super(context, str);
    }

    public static Context a() {
        AppContextProvider appContextProvider = c;
        return appContextProvider == null ? athr.a() : appContextProvider.a;
    }

    private static void setApplicationContextV0(Context context) {
        ekxj.a(c == null);
        c = new AppContextProvider(context, null);
    }
}
