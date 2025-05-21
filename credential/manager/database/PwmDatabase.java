package com.google.android.gms.credential.manager.database;

import android.content.Context;
import defpackage.aupe;
import defpackage.aupm;
import defpackage.aups;
import defpackage.auqm;
import defpackage.bqvy;
import defpackage.kpe;
import defpackage.kpm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public abstract class PwmDatabase extends kpm {
    private static PwmDatabase l;

    public static synchronized PwmDatabase y(Context context) {
        PwmDatabase pwmDatabase;
        synchronized (PwmDatabase.class) {
            if (l == null) {
                kpe a = bqvy.a(context.getApplicationContext(), PwmDatabase.class, "password_manager.db");
                a.f();
                l = (PwmDatabase) a.a();
            }
            pwmDatabase = l;
        }
        return pwmDatabase;
    }

    public abstract aupe v();

    public abstract aupm w();

    public abstract aups x();

    public abstract auqm z();
}
