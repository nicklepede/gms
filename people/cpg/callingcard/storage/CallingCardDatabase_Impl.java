package com.google.android.gms.people.cpg.callingcard.storage;

import defpackage.cwhq;
import defpackage.cwih;
import defpackage.cwii;
import defpackage.cwij;
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
public final class CallingCardDatabase_Impl extends CallingCardDatabase {
    private volatile cwhq n;

    @Override // defpackage.mhx
    protected final mgw a() {
        return new mgw(this, new HashMap(0), new HashMap(0), "cpg_calling_cards");
    }

    @Override // defpackage.mhx
    protected final /* synthetic */ mie c() {
        return new cwij(this);
    }

    @Override // defpackage.mhx
    protected final Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put(cwhq.class, Collections.EMPTY_LIST);
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
        arrayList.add(new cwih());
        arrayList.add(new cwii());
        return arrayList;
    }

    @Override // com.google.android.gms.people.cpg.callingcard.storage.CallingCardDatabase
    public final cwhq v() {
        cwhq cwhqVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new cwhq(this);
            }
            cwhqVar = this.n;
        }
        return cwhqVar;
    }
}
