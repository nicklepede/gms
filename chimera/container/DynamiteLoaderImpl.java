package com.google.android.gms.chimera.container;

import android.content.Context;
import android.database.Cursor;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamiteloader.DynamiteLoaderV2;
import defpackage.aqbd;
import defpackage.aqbk;
import defpackage.athr;
import defpackage.aurj;
import defpackage.aurr;
import defpackage.bblp;
import defpackage.bbmt;
import defpackage.bbmw;
import defpackage.ekxj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class DynamiteLoaderImpl extends bbmw implements aqbd {
    private final aqbd a;

    public DynamiteLoaderImpl() {
        if (!athr.b()) {
            this.a = null;
            int i = aqbk.a;
        } else {
            ClassLoader classLoader = getClass().getClassLoader();
            ekxj.e(classLoader);
            this.a = (aqbd) classLoader.loadClass("com.google.android.gms.chimera.container.dynamite.GmsProcessDynamiteLoaderImpl").asSubclass(aqbd.class).getDeclaredConstructor(null).newInstance(null);
        }
    }

    private final aqbd a() {
        aqbd aqbdVar = this.a;
        return aqbdVar != null ? aqbdVar : this;
    }

    @Override // defpackage.bbmx
    public bblp createModuleContext(bblp bblpVar, String str, int i) {
        Context context = (Context) ObjectWrapper.a(bblpVar);
        if (context == null) {
            return new ObjectWrapper(null);
        }
        try {
            return createModuleContextNoCrashUtils(bblpVar, str, i);
        } catch (Throwable th) {
            if (!aurj.d()) {
                aurr.f(context, th);
            }
            throw th;
        }
    }

    @Override // defpackage.bbmx
    public bblp createModuleContext3NoCrashUtils(bblp bblpVar, String str, int i, bblp bblpVar2) {
        Context context = (Context) ObjectWrapper.a(bblpVar);
        if (context == null) {
            return new ObjectWrapper(null);
        }
        Cursor cursor = (Cursor) ObjectWrapper.a(bblpVar2);
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

    @Override // defpackage.bbmx
    public bblp createModuleContextNoCrashUtils(bblp bblpVar, String str, int i) {
        Context context = (Context) ObjectWrapper.a(bblpVar);
        if (context == null) {
            return new ObjectWrapper(null);
        }
        try {
            return createModuleContext3NoCrashUtils(bblpVar, str, i, new ObjectWrapper(a().queryForDynamiteModule(context, str, false)));
        } catch (Throwable th) {
            Log.e("DynamiteLoaderImpl", "Error creating module context: ".concat(th.toString()));
            throw th;
        }
    }

    @Override // defpackage.bbmx
    public int getIDynamiteLoaderVersion() {
        return 3;
    }

    @Override // defpackage.bbmx
    public int getModuleVersion(bblp bblpVar, String str) {
        return getModuleVersion2(bblpVar, str, true);
    }

    @Override // defpackage.bbmx
    public int getModuleVersion2(bblp bblpVar, String str, boolean z) {
        Context context = (Context) ObjectWrapper.a(bblpVar);
        if (context == null) {
            Log.w("DynamiteLoaderImpl", "Invalid client Context.");
            return 0;
        }
        try {
            return getModuleVersion2NoCrashUtils(bblpVar, str, z);
        } catch (Exception e) {
            if (!aurj.d()) {
                aurr.f(context, e);
            }
            throw e;
        }
    }

    @Override // defpackage.bbmx
    public int getModuleVersion2NoCrashUtils(bblp bblpVar, String str, boolean z) {
        Cursor cursor = (Cursor) ObjectWrapper.a(queryForDynamiteModuleNoCrashUtils(bblpVar, str, z, 0L));
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

    @Override // defpackage.aqbd
    public Context loadModule(Context context, String str, int i, Cursor cursor) {
        return (Context) ObjectWrapper.a(new DynamiteLoaderV2(3).loadModule2NoCrashUtils(new ObjectWrapper(context), str, i, new ObjectWrapper(cursor)));
    }

    @Override // defpackage.aqbd
    public Cursor queryForDynamiteModule(Context context, String str, boolean z) {
        return bbmt.d(context, str, z, 0L);
    }

    @Override // defpackage.bbmx
    public bblp queryForDynamiteModuleNoCrashUtils(bblp bblpVar, String str, boolean z, long j) {
        Context context = (Context) ObjectWrapper.a(bblpVar);
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
