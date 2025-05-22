package com.google.android.gms.statementservice.database;

import android.content.Context;
import defpackage.btdp;
import defpackage.dhau;
import defpackage.mhp;
import defpackage.mhx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public abstract class VerificationRequestParamsDatabase extends mhx {
    public static volatile VerificationRequestParamsDatabase m;

    public static synchronized VerificationRequestParamsDatabase w(Context context) {
        VerificationRequestParamsDatabase verificationRequestParamsDatabase;
        synchronized (VerificationRequestParamsDatabase.class) {
            if (m == null) {
                mhp a = btdp.a(context, VerificationRequestParamsDatabase.class, "StatementServiceVerificationRequest.db");
                a.f();
                m = (VerificationRequestParamsDatabase) a.a();
            }
            verificationRequestParamsDatabase = m;
        }
        return verificationRequestParamsDatabase;
    }

    public abstract dhau v();
}
