package com.google.android.gms.kids.database;

import defpackage.bpcn;
import defpackage.bpco;
import defpackage.bpcr;
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
/* loaded from: classes4.dex */
public final class DirectBootSupervisionDatabase_Impl extends DirectBootSupervisionDatabase {
    @Override // defpackage.kpm
    protected final kol a() {
        return new kol(this, new HashMap(0), new HashMap(0), "DirectBootTrustedPhoneNumber", "KeyValue");
    }

    @Override // defpackage.kpm
    protected final /* synthetic */ kpp c() {
        return new bpcn(this);
    }

    @Override // defpackage.kpm
    protected final Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put(bpco.class, Collections.EMPTY_LIST);
        hashMap.put(bpcr.class, Collections.EMPTY_LIST);
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
}
