package com.google.android.gms.chimera.modules.admob;

import android.content.Context;
import defpackage.anye;
import defpackage.arfc;
import defpackage.eike;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class AppContextProvider extends anye {
    private static AppContextProvider c;

    private AppContextProvider(Context context, String str) {
        super(context, str);
    }

    public static Context a() {
        AppContextProvider appContextProvider = c;
        return appContextProvider == null ? arfc.a() : appContextProvider.a;
    }

    private static void setApplicationContextV0(Context context) {
        eike.a(c == null);
        c = new AppContextProvider(context, null);
    }
}
