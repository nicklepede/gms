package com.google.android.gms.accountsettings.mg.poc.model.repository;

import defpackage.mgw;
import defpackage.mie;
import defpackage.tow;
import defpackage.tpb;
import defpackage.tqc;
import defpackage.tqh;
import defpackage.tqq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class RepositoryDatabase_Impl extends RepositoryDatabase {
    private volatile tqh t;
    private volatile tow u;

    @Override // defpackage.mhx
    protected final mgw a() {
        return new mgw(this, new HashMap(0), new HashMap(0), "resource_info", "per_device_dismissed_onboarding_flow");
    }

    @Override // defpackage.mhx
    protected final /* synthetic */ mie c() {
        return new tqc(this);
    }

    @Override // defpackage.mhx
    protected final Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put(tqh.class, Collections.EMPTY_LIST);
        hashMap.put(tow.class, Collections.EMPTY_LIST);
        return hashMap;
    }

    @Override // defpackage.mhx
    public final Set f() {
        return new HashSet();
    }

    @Override // defpackage.mhx
    public final void k() {
        throw null;
    }

    @Override // defpackage.mhx
    public final List s() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.accountsettings.mg.poc.model.repository.RepositoryDatabase
    public final tow v() {
        tow towVar;
        if (this.u != null) {
            return this.u;
        }
        synchronized (this) {
            if (this.u == null) {
                this.u = new tpb(this);
            }
            towVar = this.u;
        }
        return towVar;
    }

    @Override // com.google.android.gms.accountsettings.mg.poc.model.repository.RepositoryDatabase
    public final tqh x() {
        tqh tqhVar;
        if (this.t != null) {
            return this.t;
        }
        synchronized (this) {
            if (this.t == null) {
                this.t = new tqq(this);
            }
            tqhVar = this.t;
        }
        return tqhVar;
    }
}
