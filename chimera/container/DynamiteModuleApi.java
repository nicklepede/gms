package com.google.android.gms.chimera.container;

import android.content.Context;
import android.util.Log;
import com.google.android.chimera.container.ModuleApi;
import defpackage.aqdw;
import defpackage.bbmt;
import defpackage.elgo;
import defpackage.rhy;
import defpackage.rjc;
import defpackage.rka;
import defpackage.ror;
import defpackage.rot;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class DynamiteModuleApi extends ModuleApi {
    private static boolean a = false;

    public static void setPackageSide(boolean z) {
        a = z;
        bbmt.g(z);
    }

    @Override // com.google.android.chimera.container.ModuleApi
    public Set getInstrumentationFilterRules(Context context) {
        aqdw a2 = aqdw.a(context);
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
    public void onBeforeApkLoad(Context context, rka rkaVar) {
        if (rkaVar instanceof rjc) {
            rjc rjcVar = (rjc) rkaVar;
            rjcVar.c = "com.google.android.gms.chimera.DynamiteModuleInitializer";
            rjcVar.d = new File(context.getFilesDir(), ".gms-dynamite-code-cache").getAbsolutePath();
            rjcVar.e = rjcVar.a();
        }
        aqdw a2 = aqdw.a(context);
        if (a2 != null) {
            a2.b(rkaVar);
        }
    }

    @Override // com.google.android.chimera.container.ModuleApi
    public boolean shouldLoadApkWithoutContainer(rot rotVar, int i, ror rorVar, rhy rhyVar) {
        if (!rhyVar.j()) {
            return false;
        }
        String k = rorVar.k();
        elgo a2 = rhyVar.a();
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
