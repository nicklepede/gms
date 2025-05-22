package com.google.android.gms.semanticlocationhistory.transientcache.database;

import defpackage.ddxe;
import defpackage.ddxr;
import defpackage.ddxs;
import defpackage.mgw;
import defpackage.mie;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class TransientDatabase_Impl extends TransientDatabase {
    private volatile ddxe m;

    @Override // defpackage.mhx
    protected final mgw a() {
        return new mgw(this, new HashMap(0), new HashMap(0), "TransientDataEntity");
    }

    @Override // defpackage.mhx
    protected final /* synthetic */ mie c() {
        return new ddxs(this);
    }

    @Override // defpackage.mhx
    protected final Map e() {
        HashMap hashMap = new HashMap();
        int i = ddxe.c;
        hashMap.put(ddxe.class, Collections.EMPTY_LIST);
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
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ddxr());
        return arrayList;
    }

    @Override // com.google.android.gms.semanticlocationhistory.transientcache.database.TransientDatabase
    public final ddxe v() {
        ddxe ddxeVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new ddxe(this);
            }
            ddxeVar = this.m;
        }
        return ddxeVar;
    }
}
