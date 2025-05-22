package com.google.android.gms.people.cpg.callingcard.storage;

import android.content.Context;
import com.google.android.gms.chimera.modules.people.AppContextProvider;
import defpackage.btdp;
import defpackage.cwhq;
import defpackage.mhp;
import defpackage.mhx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public abstract class CallingCardDatabase extends mhx {
    public static volatile CallingCardDatabase m;

    public static synchronized CallingCardDatabase w() {
        CallingCardDatabase callingCardDatabase;
        synchronized (CallingCardDatabase.class) {
            if (m == null) {
                m = x(AppContextProvider.a());
            }
            callingCardDatabase = m;
        }
        return callingCardDatabase;
    }

    public static synchronized CallingCardDatabase x(Context context) {
        CallingCardDatabase callingCardDatabase;
        synchronized (CallingCardDatabase.class) {
            mhp a = btdp.a(context, CallingCardDatabase.class, "cpg-cc-db");
            a.d();
            callingCardDatabase = (CallingCardDatabase) a.a();
        }
        return callingCardDatabase;
    }

    public abstract cwhq v();
}
