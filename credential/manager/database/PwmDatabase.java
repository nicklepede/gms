package com.google.android.gms.credential.manager.database;

import android.content.Context;
import defpackage.awte;
import defpackage.awtm;
import defpackage.awts;
import defpackage.awum;
import defpackage.btdp;
import defpackage.mhp;
import defpackage.mhx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public abstract class PwmDatabase extends mhx {
    private static PwmDatabase m;

    public static synchronized PwmDatabase y(Context context) {
        PwmDatabase pwmDatabase;
        synchronized (PwmDatabase.class) {
            if (m == null) {
                mhp a = btdp.a(context.getApplicationContext(), PwmDatabase.class, "password_manager.db");
                a.f();
                m = (PwmDatabase) a.a();
            }
            pwmDatabase = m;
        }
        return pwmDatabase;
    }

    public abstract awte v();

    public abstract awtm w();

    public abstract awts x();

    public abstract awum z();
}
