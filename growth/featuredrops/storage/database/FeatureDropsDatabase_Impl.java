package com.google.android.gms.growth.featuredrops.storage.database;

import defpackage.bmqs;
import defpackage.bmqt;
import defpackage.bmqy;
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
public final class FeatureDropsDatabase_Impl extends FeatureDropsDatabase {
    private volatile bmqt m;

    @Override // defpackage.mhx
    protected final mgw a() {
        return new mgw(this, new HashMap(0), new HashMap(0), "ScreenEntity");
    }

    @Override // defpackage.mhx
    protected final /* synthetic */ mie c() {
        return new bmqs(this);
    }

    @Override // defpackage.mhx
    protected final Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put(bmqt.class, Collections.EMPTY_LIST);
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

    @Override // com.google.android.gms.growth.featuredrops.storage.database.FeatureDropsDatabase
    public final bmqt v() {
        bmqt bmqtVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new bmqy(this);
            }
            bmqtVar = this.m;
        }
        return bmqtVar;
    }
}
