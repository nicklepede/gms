package com.google.android.gms.auth.api.credentials.nextgen.database;

import android.content.Context;
import defpackage.bqvy;
import defpackage.dvni;
import defpackage.kpe;
import defpackage.kpm;
import defpackage.yrv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public abstract class VerifiableCredentialDatabase extends kpm {
    private static VerifiableCredentialDatabase l;

    public static synchronized VerifiableCredentialDatabase v(Context context) {
        VerifiableCredentialDatabase verifiableCredentialDatabase;
        synchronized (VerifiableCredentialDatabase.class) {
            dvni.f(context);
            if (l == null) {
                kpe a = bqvy.a(context.getApplicationContext(), VerifiableCredentialDatabase.class, "verifiable_credential_db");
                a.d();
                l = (VerifiableCredentialDatabase) a.a();
            }
            verifiableCredentialDatabase = l;
        }
        return verifiableCredentialDatabase;
    }

    public abstract yrv w();
}
