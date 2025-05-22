package com.google.android.gms.nearby.sharing.database;

import defpackage.cpbc;
import defpackage.cpbi;
import defpackage.cpbk;
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
public final class QuickShareRoomDatabase_Impl extends QuickShareRoomDatabase {
    private volatile cpbc o;

    @Override // defpackage.mhx
    protected final mgw a() {
        return new mgw(this, new HashMap(0), new HashMap(0), "AnalyticsTransferMetadata");
    }

    @Override // defpackage.mhx
    protected final /* synthetic */ mie c() {
        return new cpbk(this);
    }

    @Override // defpackage.mhx
    protected final Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put(cpbc.class, Collections.EMPTY_LIST);
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

    @Override // com.google.android.gms.nearby.sharing.database.QuickShareRoomDatabase
    public final cpbc v() {
        cpbc cpbcVar;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            if (this.o == null) {
                this.o = new cpbi(this);
            }
            cpbcVar = this.o;
        }
        return cpbcVar;
    }
}
