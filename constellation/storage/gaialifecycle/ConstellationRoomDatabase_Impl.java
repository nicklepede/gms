package com.google.android.gms.constellation.storage.gaialifecycle;

import defpackage.aszk;
import defpackage.aszm;
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
/* loaded from: classes3.dex */
public final class ConstellationRoomDatabase_Impl extends ConstellationRoomDatabase {
    @Override // defpackage.kpm
    protected final kol a() {
        return new kol(this, new HashMap(0), new HashMap(0), "gaia_lifecycle_state");
    }

    @Override // defpackage.kpm
    protected final /* synthetic */ kpp c() {
        return new aszk(this);
    }

    @Override // defpackage.kpm
    protected final Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put(aszm.class, Collections.EMPTY_LIST);
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
