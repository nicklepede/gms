package com.google.android.gms.auth.api.credentials.callerverification;

import com.google.android.gms.chimera.modules.auth.credentials.base.AppContextProvider;
import defpackage.bqvy;
import defpackage.kpe;
import defpackage.kpm;
import defpackage.wgk;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public abstract class CallerVerificationDatabase extends kpm {
    private static CallerVerificationDatabase l;

    public static CallerVerificationDatabase v() {
        if (l == null) {
            kpe a = bqvy.a(AppContextProvider.a(), CallerVerificationDatabase.class, "callerverification.db");
            a.g(true);
            l = (CallerVerificationDatabase) a.a();
        }
        return l;
    }

    public abstract wgk w();
}
