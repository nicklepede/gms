package com.google.android.gms.people.cpg.callingcard.storage;

import android.content.Context;
import com.google.android.gms.chimera.modules.people.AppContextProvider;
import defpackage.bqvy;
import defpackage.ctyk;
import defpackage.kpe;
import defpackage.kpm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public abstract class CallingCardDatabase extends kpm {
    public static volatile CallingCardDatabase l;

    public static synchronized CallingCardDatabase w() {
        CallingCardDatabase callingCardDatabase;
        synchronized (CallingCardDatabase.class) {
            if (l == null) {
                l = x(AppContextProvider.a());
            }
            callingCardDatabase = l;
        }
        return callingCardDatabase;
    }

    public static synchronized CallingCardDatabase x(Context context) {
        CallingCardDatabase callingCardDatabase;
        synchronized (CallingCardDatabase.class) {
            kpe a = bqvy.a(context, CallingCardDatabase.class, "cpg-cc-db");
            a.d();
            callingCardDatabase = (CallingCardDatabase) a.a();
        }
        return callingCardDatabase;
    }

    public abstract ctyk v();
}
