package com.google.android.gms.semanticlocationhistory.transientcache.database;

import defpackage.dbmy;
import defpackage.dbnl;
import defpackage.dbnm;
import defpackage.kol;
import defpackage.kpp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class TransientDatabase_Impl extends TransientDatabase {
    private volatile dbmy l;

    @Override // defpackage.kpm
    protected final kol a() {
        return new kol(this, new HashMap(0), new HashMap(0), "TransientDataEntity");
    }

    @Override // defpackage.kpm
    protected final /* synthetic */ kpp c() {
        return new dbnm(this);
    }

    @Override // defpackage.kpm
    protected final Map e() {
        HashMap hashMap = new HashMap();
        int i = dbmy.c;
        hashMap.put(dbmy.class, Collections.EMPTY_LIST);
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
        ArrayList arrayList = new ArrayList();
        arrayList.add(new dbnl());
        return arrayList;
    }

    @Override // com.google.android.gms.semanticlocationhistory.transientcache.database.TransientDatabase
    public final dbmy v() {
        dbmy dbmyVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new dbmy(this);
            }
            dbmyVar = this.l;
        }
        return dbmyVar;
    }
}
