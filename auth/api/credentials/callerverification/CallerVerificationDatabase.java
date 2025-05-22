package com.google.android.gms.auth.api.credentials.callerverification;

import com.google.android.gms.chimera.modules.auth.credentials.base.AppContextProvider;
import defpackage.btdp;
import defpackage.mhp;
import defpackage.mhx;
import defpackage.ycq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public abstract class CallerVerificationDatabase extends mhx {
    private static CallerVerificationDatabase m;

    public static CallerVerificationDatabase v() {
        if (m == null) {
            mhp a = btdp.a(AppContextProvider.a(), CallerVerificationDatabase.class, "callerverification.db");
            a.g(true);
            m = (CallerVerificationDatabase) a.a();
        }
        return m;
    }

    public abstract ycq w();
}
