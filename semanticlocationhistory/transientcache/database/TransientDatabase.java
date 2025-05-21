package com.google.android.gms.semanticlocationhistory.transientcache.database;

import android.content.Context;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import defpackage.bqvy;
import defpackage.dbmy;
import defpackage.fryp;
import defpackage.kpe;
import defpackage.kpm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public abstract class TransientDatabase extends kpm {
    private static volatile TransientDatabase l;

    public static synchronized TransientDatabase w() {
        TransientDatabase transientDatabase;
        synchronized (TransientDatabase.class) {
            if (l == null) {
                l = x(AppContextProvider.a());
            }
            transientDatabase = l;
        }
        return transientDatabase;
    }

    public static synchronized TransientDatabase x(Context context) {
        TransientDatabase transientDatabase;
        synchronized (TransientDatabase.class) {
            kpe a = bqvy.a(context, TransientDatabase.class, fryp.a.a().z() ? "semloc_transient_database" : String.format("%s/%s", context.getCacheDir().getAbsolutePath(), "semloc_transient_database"));
            a.d();
            transientDatabase = (TransientDatabase) a.a();
        }
        return transientDatabase;
    }

    public abstract dbmy v();
}
