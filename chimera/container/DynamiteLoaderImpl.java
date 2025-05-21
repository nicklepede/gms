package com.google.android.gms.chimera.container;

import android.content.Context;
import android.database.Cursor;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamiteloader.DynamiteLoaderV2;
import defpackage.anzl;
import defpackage.anzs;
import defpackage.arfc;
import defpackage.asnp;
import defpackage.asnx;
import defpackage.azht;
import defpackage.azix;
import defpackage.azja;
import defpackage.eike;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class DynamiteLoaderImpl extends azja implements anzl {
    private final anzl a;

    public DynamiteLoaderImpl() {
        if (!arfc.b()) {
            this.a = null;
            int i = anzs.a;
        } else {
            ClassLoader classLoader = getClass().getClassLoader();
            eike.e(classLoader);
            this.a = (anzl) classLoader.loadClass("com.google.android.gms.chimera.container.dynamite.GmsProcessDynamiteLoaderImpl").asSubclass(anzl.class).getDeclaredConstructor(null).newInstance(null);
        }
    }

    private final anzl a() {
        anzl anzlVar = this.a;
        return anzlVar != null ? anzlVar : this;
    }

    @Override // defpackage.azjb
    public azht createModuleContext(azht azhtVar, String str, int i) {
        Context context = (Context) ObjectWrapper.a(azhtVar);
        if (context == null) {
            return new ObjectWrapper(null);
        }
        try {
            return createModuleContextNoCrashUtils(azhtVar, str, i);
        } catch (Throwable th) {
            if (!asnp.d()) {
                asnx.f(context, th);
            }
            throw th;
        }
    }

    @Override // defpackage.azjb
    public azht createModuleContext3NoCrashUtils(azht azhtVar, String str, int i, azht azhtVar2) {
        Context context = (Context) ObjectWrapper.a(azhtVar);
        if (context == null) {
            return new ObjectWrapper(null);
        }
        Cursor cursor = (Cursor) ObjectWrapper.a(azhtVar2);
        if (cursor != null) {
            try {
                if (cursor.moveToFirst()) {
                    if (cursor.getInt(0) >= i) {
                        return new ObjectWrapper(a().loadModule(context, str, i, cursor));
                    }
                    Log.e("DynamiteLoaderImpl", "Requested feature version is not available.");
                    return new ObjectWrapper(null);
                }
            } catch (Throwable th) {
                Log.e("DynamiteLoaderImpl", "Error creating module context: ".concat(th.toString()));
                throw th;
            }
        }
        Log.w("DynamiteLoaderImpl", "Failed to load remote feature.");
        return new ObjectWrapper(null);
    }

    @Override // defpackage.azjb
    public azht createModuleContextNoCrashUtils(azht azhtVar, String str, int i) {
        Context context = (Context) ObjectWrapper.a(azhtVar);
        if (context == null) {
            return new ObjectWrapper(null);
        }
        try {
            return createModuleContext3NoCrashUtils(azhtVar, str, i, new ObjectWrapper(a().queryForDynamiteModule(context, str, false)));
        } catch (Throwable th) {
            Log.e("DynamiteLoaderImpl", "Error creating module context: ".concat(th.toString()));
            throw th;
        }
    }

    @Override // defpackage.azjb
    public int getIDynamiteLoaderVersion() {
        return 3;
    }

    @Override // defpackage.azjb
    public int getModuleVersion(azht azhtVar, String str) {
        return getModuleVersion2(azhtVar, str, true);
    }

    @Override // defpackage.azjb
    public int getModuleVersion2(azht azhtVar, String str, boolean z) {
        Context context = (Context) ObjectWrapper.a(azhtVar);
        if (context == null) {
            Log.w("DynamiteLoaderImpl", "Invalid client Context.");
            return 0;
        }
        try {
            return getModuleVersion2NoCrashUtils(azhtVar, str, z);
        } catch (Exception e) {
            if (!asnp.d()) {
                asnx.f(context, e);
            }
            throw e;
        }
    }

    @Override // defpackage.azjb
    public int getModuleVersion2NoCrashUtils(azht azhtVar, String str, boolean z) {
        Cursor cursor = (Cursor) ObjectWrapper.a(queryForDynamiteModuleNoCrashUtils(azhtVar, str, z, 0L));
        if (cursor != null) {
            try {
                if (cursor.moveToFirst()) {
                    return cursor.getInt(0);
                }
            } catch (Exception e) {
                Log.e("DynamiteLoaderImpl", "Error retrieving remote feature version: ", e);
                return 0;
            }
        }
        Log.w("DynamiteLoaderImpl", "Failed to retrieve remote feature version.");
        return 0;
    }

    @Override // defpackage.anzl
    public Context loadModule(Context context, String str, int i, Cursor cursor) {
        return (Context) ObjectWrapper.a(new DynamiteLoaderV2(3).loadModule2NoCrashUtils(new ObjectWrapper(context), str, i, new ObjectWrapper(cursor)));
    }

    @Override // defpackage.anzl
    public Cursor queryForDynamiteModule(Context context, String str, boolean z) {
        return azix.d(context, str, z, 0L);
    }

    @Override // defpackage.azjb
    public azht queryForDynamiteModuleNoCrashUtils(azht azhtVar, String str, boolean z, long j) {
        Context context = (Context) ObjectWrapper.a(azhtVar);
        if (context == null) {
            Log.w("DynamiteLoaderImpl", "Invalid client Context.");
            return new ObjectWrapper(null);
        }
        try {
            return new ObjectWrapper(a().queryForDynamiteModule(context, str, z));
        } catch (Exception e) {
            Log.e("DynamiteLoaderImpl", "Error retrieving remote feature version: ", e);
            return new ObjectWrapper(null);
        }
    }
}
