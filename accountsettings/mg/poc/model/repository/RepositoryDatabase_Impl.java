package com.google.android.gms.accountsettings.mg.poc.model.repository;

import defpackage.kol;
import defpackage.kpp;
import defpackage.rvm;
import defpackage.rvr;
import defpackage.rws;
import defpackage.rwx;
import defpackage.rxg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class RepositoryDatabase_Impl extends RepositoryDatabase {
    private volatile rwx s;
    private volatile rvm t;

    @Override // defpackage.kpm
    protected final kol a() {
        return new kol(this, new HashMap(0), new HashMap(0), "resource_info", "per_device_dismissed_onboarding_flow");
    }

    @Override // defpackage.kpm
    protected final /* synthetic */ kpp c() {
        return new rws(this);
    }

    @Override // defpackage.kpm
    protected final Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put(rwx.class, Collections.EMPTY_LIST);
        hashMap.put(rvm.class, Collections.EMPTY_LIST);
        return hashMap;
    }

    @Override // defpackage.kpm
    public final Set f() {
        return new HashSet();
    }

    @Override // defpackage.kpm
    public final void k() {
        throw null;
    }

    @Override // defpackage.kpm
    public final List s() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.accountsettings.mg.poc.model.repository.RepositoryDatabase
    public final rvm v() {
        rvm rvmVar;
        if (this.t != null) {
            return this.t;
        }
        synchronized (this) {
            if (this.t == null) {
                this.t = new rvr(this);
            }
            rvmVar = this.t;
        }
        return rvmVar;
    }

    @Override // com.google.android.gms.accountsettings.mg.poc.model.repository.RepositoryDatabase
    public final rwx x() {
        rwx rwxVar;
        if (this.s != null) {
            return this.s;
        }
        synchronized (this) {
            if (this.s == null) {
                this.s = new rxg(this);
            }
            rwxVar = this.s;
        }
        return rwxVar;
    }
}
