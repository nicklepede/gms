package com.google.android.gms.dtdi.core.database.appcapabilitiesmatching;

import defpackage.aylw;
import defpackage.aymb;
import defpackage.ayme;
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
public final class AppCapabilitiesMatchingDatabase_Impl extends AppCapabilitiesMatchingDatabase {
    private volatile aylw n;

    @Override // defpackage.kpm
    protected final kol a() {
        return new kol(this, new HashMap(0), new HashMap(0), "AppCapabilitiesInfoEntity");
    }

    @Override // defpackage.kpm
    protected final /* synthetic */ kpp c() {
        return new ayme(this);
    }

    @Override // defpackage.kpm
    protected final Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put(aylw.class, Collections.EMPTY_LIST);
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

    @Override // com.google.android.gms.dtdi.core.database.appcapabilitiesmatching.AppCapabilitiesMatchingDatabase
    public final aylw v() {
        aylw aylwVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new aymb(this);
            }
            aylwVar = this.n;
        }
        return aylwVar;
    }
}
