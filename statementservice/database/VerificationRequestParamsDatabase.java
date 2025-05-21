package com.google.android.gms.statementservice.database;

import android.content.Context;
import defpackage.bqvy;
import defpackage.depr;
import defpackage.kpe;
import defpackage.kpm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public abstract class VerificationRequestParamsDatabase extends kpm {
    public static volatile VerificationRequestParamsDatabase l;

    public static synchronized VerificationRequestParamsDatabase w(Context context) {
        VerificationRequestParamsDatabase verificationRequestParamsDatabase;
        synchronized (VerificationRequestParamsDatabase.class) {
            if (l == null) {
                kpe a = bqvy.a(context, VerificationRequestParamsDatabase.class, "StatementServiceVerificationRequest.db");
                a.f();
                l = (VerificationRequestParamsDatabase) a.a();
            }
            verificationRequestParamsDatabase = l;
        }
        return verificationRequestParamsDatabase;
    }

    public abstract depr v();
}
