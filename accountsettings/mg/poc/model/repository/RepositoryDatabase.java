package com.google.android.gms.accountsettings.mg.poc.model.repository;

import android.content.Context;
import defpackage.btdp;
import defpackage.mhp;
import defpackage.mhx;
import defpackage.mkc;
import defpackage.tow;
import defpackage.tpv;
import defpackage.tpw;
import defpackage.tpx;
import defpackage.tpy;
import defpackage.tpz;
import defpackage.tqa;
import defpackage.tqb;
import defpackage.tqh;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public abstract class RepositoryDatabase extends mhx {
    static final mkc m = new tpv();
    static final mkc n = new tpw();
    static final mkc o = new tpx();
    static final mkc p = new tpy();
    static final mkc q = new tpz();
    static final mkc r = new tqa();
    static final mkc s = new tqb();

    public static RepositoryDatabase w(Context context) {
        mhp a = btdp.a(context, RepositoryDatabase.class, "account_settings_repository.db");
        a.b(m, n, o, p, q, r, s);
        a.d();
        return (RepositoryDatabase) a.a();
    }

    public abstract tow v();

    public abstract tqh x();
}
