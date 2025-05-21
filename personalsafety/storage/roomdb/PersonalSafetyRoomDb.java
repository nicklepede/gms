package com.google.android.gms.personalsafety.storage.roomdb;

import android.content.Context;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import defpackage.asot;
import defpackage.bqvy;
import defpackage.cvpm;
import defpackage.cvpo;
import defpackage.cvxi;
import defpackage.cvxw;
import defpackage.ejhf;
import defpackage.fmzp;
import defpackage.kpe;
import defpackage.kpm;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public abstract class PersonalSafetyRoomDb extends kpm {
    private static volatile PersonalSafetyRoomDb l;

    public static synchronized PersonalSafetyRoomDb w(Context context) {
        PersonalSafetyRoomDb personalSafetyRoomDb;
        synchronized (PersonalSafetyRoomDb.class) {
            boolean bq = fmzp.a.a().bq();
            if (l == null) {
                try {
                    synchronized (PersonalSafetyRoomDb.class) {
                        l = y(context);
                        if (bq) {
                            l.x().a().get();
                        }
                    }
                } catch (InterruptedException | ExecutionException e) {
                    cvpm.a(context).o(8);
                    ((ejhf) ((ejhf) cvpo.a.i()).s(e)).B("Exception reading database. Recreating: %b", Boolean.valueOf(bq));
                    if ((e.getCause() instanceof SQLiteCantOpenDatabaseException) && bq) {
                        context.deleteDatabase("personalsafety_db");
                        l = y(context);
                    }
                }
            }
            personalSafetyRoomDb = l;
        }
        return personalSafetyRoomDb;
    }

    private static PersonalSafetyRoomDb y(Context context) {
        asot asotVar = cvpo.a;
        kpe a = bqvy.a(context.getApplicationContext(), PersonalSafetyRoomDb.class, "personalsafety_db");
        a.d();
        return (PersonalSafetyRoomDb) a.a();
    }

    public abstract cvxi v();

    public abstract cvxw x();
}
