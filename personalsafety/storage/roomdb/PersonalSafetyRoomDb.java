package com.google.android.gms.personalsafety.storage.roomdb;

import android.content.Context;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import defpackage.ausn;
import defpackage.btdp;
import defpackage.cxzc;
import defpackage.cxze;
import defpackage.cyhf;
import defpackage.cyht;
import defpackage.eluo;
import defpackage.fpro;
import defpackage.mhp;
import defpackage.mhx;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public abstract class PersonalSafetyRoomDb extends mhx {
    private static volatile PersonalSafetyRoomDb m;

    public static synchronized PersonalSafetyRoomDb w(Context context) {
        PersonalSafetyRoomDb personalSafetyRoomDb;
        synchronized (PersonalSafetyRoomDb.class) {
            boolean bt = fpro.a.lK().bt();
            if (m == null) {
                try {
                    synchronized (PersonalSafetyRoomDb.class) {
                        m = y(context);
                        if (bt) {
                            m.x().a().get();
                        }
                    }
                } catch (InterruptedException | ExecutionException e) {
                    cxzc.a(context).o(8);
                    ((eluo) ((eluo) cxze.a.i()).s(e)).B("Exception reading database. Recreating: %b", Boolean.valueOf(bt));
                    if ((e.getCause() instanceof SQLiteCantOpenDatabaseException) && bt) {
                        context.deleteDatabase("personalsafety_db");
                        m = y(context);
                    }
                }
            }
            personalSafetyRoomDb = m;
        }
        return personalSafetyRoomDb;
    }

    private static PersonalSafetyRoomDb y(Context context) {
        ausn ausnVar = cxze.a;
        mhp a = btdp.a(context.getApplicationContext(), PersonalSafetyRoomDb.class, "personalsafety_db");
        a.d();
        return (PersonalSafetyRoomDb) a.a();
    }

    public abstract cyhf v();

    public abstract cyht x();
}
