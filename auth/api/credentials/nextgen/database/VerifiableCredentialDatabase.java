package com.google.android.gms.auth.api.credentials.nextgen.database;

import android.content.Context;
import defpackage.aapz;
import defpackage.btdp;
import defpackage.dxyi;
import defpackage.mhp;
import defpackage.mhx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public abstract class VerifiableCredentialDatabase extends mhx {
    private static VerifiableCredentialDatabase m;

    public static synchronized VerifiableCredentialDatabase v(Context context) {
        VerifiableCredentialDatabase verifiableCredentialDatabase;
        synchronized (VerifiableCredentialDatabase.class) {
            dxyi.f(context);
            if (m == null) {
                mhp a = btdp.a(context.getApplicationContext(), VerifiableCredentialDatabase.class, "verifiable_credential_db");
                a.d();
                m = (VerifiableCredentialDatabase) a.a();
            }
            verifiableCredentialDatabase = m;
        }
        return verifiableCredentialDatabase;
    }

    public abstract aapz w();
}
