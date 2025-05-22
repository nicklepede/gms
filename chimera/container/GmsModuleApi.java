package com.google.android.gms.chimera.container;

import android.content.Context;
import com.google.android.chimera.container.ModuleApi;
import com.google.android.gms.common.app.BaseApplicationContext;
import defpackage.aqdw;
import defpackage.athr;
import defpackage.auri;
import defpackage.carl;
import defpackage.carm;
import defpackage.rka;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class GmsModuleApi extends ModuleApi {
    @Override // com.google.android.chimera.container.ModuleApi
    public Set getInstrumentationFilterRules(Context context) {
        aqdw a = aqdw.a(context);
        if (a != null) {
            return a.c;
        }
        return null;
    }

    @Override // com.google.android.chimera.container.ModuleApi
    public void onApkLoaded(Context context) {
        a(context.getClassLoader().loadClass("com.google.android.gms.chimera.GmsModuleInitializer").getMethod("initializeModuleV0", Context.class, BaseApplicationContext.class), context, athr.a());
    }

    @Override // com.google.android.chimera.container.ModuleApi
    public void onBeforeApkLoad(Context context, rka rkaVar) {
        aqdw a = aqdw.a(context);
        if (a != null) {
            a.b(rkaVar);
        }
    }

    @Override // com.google.android.chimera.container.ModuleApi
    public void onModuleLoaded(String str, String str2, Context context) {
        if (str2 == null) {
            str2 = "com.google.android.gms.chimera.modules.".concat(String.valueOf(auri.i(str).replace("__", ".").replace('_', '.'))).concat(".AppContextProvider");
        }
        carm.a(context.getClassLoader().loadClass(str2), "setApplicationContextV0", null, true, new carl(Context.class, context));
    }
}
