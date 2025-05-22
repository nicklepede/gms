package com.google.android.gms.semanticlocationhistory.transientcache.database;

import android.content.Context;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import defpackage.btdp;
import defpackage.ddxe;
import defpackage.futj;
import defpackage.mhp;
import defpackage.mhx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public abstract class TransientDatabase extends mhx {
    private static volatile TransientDatabase m;

    public static synchronized TransientDatabase w() {
        TransientDatabase transientDatabase;
        synchronized (TransientDatabase.class) {
            if (m == null) {
                m = x(AppContextProvider.a());
            }
            transientDatabase = m;
        }
        return transientDatabase;
    }

    public static synchronized TransientDatabase x(Context context) {
        TransientDatabase transientDatabase;
        synchronized (TransientDatabase.class) {
            mhp a = btdp.a(context, TransientDatabase.class, futj.a.lK().z() ? "semloc_transient_database" : String.format("%s/%s", context.getCacheDir().getAbsolutePath(), "semloc_transient_database"));
            a.d();
            transientDatabase = (TransientDatabase) a.a();
        }
        return transientDatabase;
    }

    public abstract ddxe v();
}
