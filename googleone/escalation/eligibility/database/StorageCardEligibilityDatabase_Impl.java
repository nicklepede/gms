package com.google.android.gms.googleone.escalation.eligibility.database;

import defpackage.blno;
import defpackage.blnt;
import defpackage.blnv;
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
/* loaded from: classes4.dex */
public final class StorageCardEligibilityDatabase_Impl extends StorageCardEligibilityDatabase {
    private volatile blno m;

    @Override // defpackage.mhx
    protected final mgw a() {
        return new mgw(this, new HashMap(0), new HashMap(0), "storage_card_eligibility");
    }

    @Override // defpackage.mhx
    protected final /* synthetic */ mie c() {
        return new blnv(this);
    }

    @Override // defpackage.mhx
    protected final Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put(blno.class, Collections.EMPTY_LIST);
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

    @Override // com.google.android.gms.googleone.escalation.eligibility.database.StorageCardEligibilityDatabase
    public final blno v() {
        blno blnoVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new blnt(this);
            }
            blnoVar = this.m;
        }
        return blnoVar;
    }
}
