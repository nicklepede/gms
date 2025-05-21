package com.google.android.gms.chimera.container;

import android.content.Context;
import android.util.Log;
import com.google.android.chimera.container.ModuleApi;
import defpackage.aoce;
import defpackage.azix;
import defpackage.eitj;
import defpackage.pou;
import defpackage.ppy;
import defpackage.pqw;
import defpackage.pvn;
import defpackage.pvp;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class DynamiteModuleApi extends ModuleApi {
    private static boolean a = false;

    public static void setPackageSide(boolean z) {
        a = z;
        azix.g(z);
    }

    @Override // com.google.android.chimera.container.ModuleApi
    public Set getInstrumentationFilterRules(Context context) {
        aoce a2 = aoce.a(context);
        if (a2 != null) {
            return a2.c;
        }
        return null;
    }

    @Override // com.google.android.chimera.container.ModuleApi
    public void onApkLoaded(Context context) {
        Method declaredMethod;
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.google.android.gms.chimera.DynamiteModuleInitializer");
            Method method = null;
            try {
                method = loadClass.getDeclaredMethod("initializeModuleV2", Context.class, Boolean.TYPE);
                declaredMethod = null;
            } catch (NoSuchMethodException unused) {
                declaredMethod = loadClass.getDeclaredMethod("initializeModuleV1", Context.class);
            }
            if (method != null) {
                a(method, context, Boolean.valueOf(a));
            } else if (declaredMethod != null) {
                a(declaredMethod, context);
            }
        } catch (Exception e) {
            Log.w("DynamiteModuleApi", "Failed to set dynamite application context: ".concat(e.toString()));
        }
    }

    @Override // com.google.android.chimera.container.ModuleApi
    public void onBeforeApkLoad(Context context, pqw pqwVar) {
        if (pqwVar instanceof ppy) {
            ppy ppyVar = (ppy) pqwVar;
            ppyVar.c = "com.google.android.gms.chimera.DynamiteModuleInitializer";
            ppyVar.d = new File(context.getFilesDir(), ".gms-dynamite-code-cache").getAbsolutePath();
            ppyVar.e = ppyVar.a();
        }
        aoce a2 = aoce.a(context);
        if (a2 != null) {
            a2.b(pqwVar);
        }
    }

    @Override // com.google.android.chimera.container.ModuleApi
    public boolean shouldLoadApkWithoutContainer(pvp pvpVar, int i, pvn pvnVar, pou pouVar) {
        if (!pouVar.j()) {
            return false;
        }
        String k = pvnVar.k();
        eitj a2 = pouVar.a();
        int size = a2.size();
        int i2 = 0;
        while (i2 < size) {
            boolean endsWith = k.endsWith((String) a2.get(i2));
            i2++;
            if (endsWith) {
                return true;
            }
        }
        return false;
    }
}
