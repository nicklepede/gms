package com.google.android.gms.people.cpg.callingcard.storage;

import defpackage.ctyk;
import defpackage.ctzb;
import defpackage.ctzc;
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
public final class CallingCardDatabase_Impl extends CallingCardDatabase {
    private volatile ctyk m;

    @Override // defpackage.kpm
    protected final kol a() {
        return new kol(this, new HashMap(0), new HashMap(0), "cpg_calling_cards");
    }

    @Override // defpackage.kpm
    protected final /* synthetic */ kpp c() {
        return new ctzc(this);
    }

    @Override // defpackage.kpm
    protected final Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put(ctyk.class, Collections.EMPTY_LIST);
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
        arrayList.add(new ctzb());
        return arrayList;
    }

    @Override // com.google.android.gms.people.cpg.callingcard.storage.CallingCardDatabase
    public final ctyk v() {
        ctyk ctykVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new ctyk(this);
            }
            ctykVar = this.m;
        }
        return ctykVar;
    }
}
