package com.google.android.gms.accountsettings.mg.poc.model.repository;

import android.content.Context;
import defpackage.bqvy;
import defpackage.kpe;
import defpackage.kpm;
import defpackage.krn;
import defpackage.rvm;
import defpackage.rwl;
import defpackage.rwm;
import defpackage.rwn;
import defpackage.rwo;
import defpackage.rwp;
import defpackage.rwq;
import defpackage.rwr;
import defpackage.rwx;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public abstract class RepositoryDatabase extends kpm {
    static final krn l = new rwl();
    static final krn m = new rwm();
    static final krn n = new rwn();
    static final krn o = new rwo();
    static final krn p = new rwp();
    static final krn q = new rwq();
    static final krn r = new rwr();

    public static RepositoryDatabase w(Context context) {
        kpe a = bqvy.a(context, RepositoryDatabase.class, "account_settings_repository.db");
        a.b(l, m, n, o, p, q, r);
        a.d();
        return (RepositoryDatabase) a.a();
    }

    public abstract rvm v();

    public abstract rwx x();
}
