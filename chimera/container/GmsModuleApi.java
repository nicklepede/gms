package com.google.android.gms.chimera.container;

import android.content.Context;
import com.google.android.chimera.container.ModuleApi;
import com.google.android.gms.common.app.BaseApplicationContext;
import defpackage.aoce;
import defpackage.arfc;
import defpackage.asno;
import defpackage.byit;
import defpackage.byiu;
import defpackage.pqw;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class GmsModuleApi extends ModuleApi {
    @Override // com.google.android.chimera.container.ModuleApi
    public Set getInstrumentationFilterRules(Context context) {
        aoce a = aoce.a(context);
        if (a != null) {
            return a.c;
        }
        return null;
    }

    @Override // com.google.android.chimera.container.ModuleApi
    public void onApkLoaded(Context context) {
        a(context.getClassLoader().loadClass("com.google.android.gms.chimera.GmsModuleInitializer").getMethod("initializeModuleV0", Context.class, BaseApplicationContext.class), context, arfc.a());
    }

    @Override // com.google.android.chimera.container.ModuleApi
    public void onBeforeApkLoad(Context context, pqw pqwVar) {
        aoce a = aoce.a(context);
        if (a != null) {
            a.b(pqwVar);
        }
    }

    @Override // com.google.android.chimera.container.ModuleApi
    public void onModuleLoaded(String str, String str2, Context context) {
        if (str2 == null) {
            str2 = "com.google.android.gms.chimera.modules.".concat(String.valueOf(asno.h(str).replace("__", ".").replace('_', '.'))).concat(".AppContextProvider");
        }
        byiu.a(context.getClassLoader().loadClass(str2), "setApplicationContextV0", null, true, new byit(Context.class, context));
    }
}
